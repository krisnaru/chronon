#     Copyright (C) 2023 The Chronon Authors.
#
#     Licensed under the Apache License, Version 2.0 (the "License");
#     you may not use this file except in compliance with the License.
#     You may obtain a copy of the License at
#
#         http://www.apache.org/licenses/LICENSE-2.0
#
#     Unless required by applicable law or agreed to in writing, software
#     distributed under the License is distributed on an "AS IS" BASIS,
#     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#     See the License for the specific language governing permissions and
#     limitations under the License.

import ai.chronon.api.ttypes as api
from typing import List, Dict, Optional


def Query(
    selects: Optional[Dict[str, str]] = None,
    wheres: Optional[List[str]] = None,
    start_partition: Optional[str] = None,
    end_partition: Optional[str] = None,
    time_column: Optional[str] = None,
    setups: Optional[List[str]] = None,
    mutation_time_column: Optional[str] = None,
    reversal_column: Optional[str] = None,
    partition_column: Optional[str] = None,
) -> api.Query:
    """
    Create a query object that is used to scan data from various data sources.
    This contains partition ranges, row level transformations and filtering logic.
    Additionally we also require a time_column for TEMPORAL events, mutation_time_column & reversal
    for TEMPORAL entities.

    :param selects: Spark sql expressions with only arithmetic, function application & inline lambdas.
        You can also apply udfs see setups param below.::

            Example: {
                "alias": "built_in_function(col1) * my_udf(col2)",
                "alias1": "aggregate(array_col, 0, (acc, x) -> acc + x)"
            }

        See: https://spark.apache.org/docs/latest/api/sql/#built-in-functions
        When none, we will assume that no transformations are needed and will pick columns necessary for aggregations.
    :type selects: List[str], optional
    :param wheres: Used for filtering. Same as above, but each expression must return boolean.
        Expressions are joined using AND.
    :type wheres: List[str], optional
    :param start_partition: From which partition of the source is the data valid from - inclusive.
        When absent we will consider all available data is usable.
    :type start_partition: str, optional
    :param end_partition: Till what partition of the source is the data valid till - inclusive.
        Not specified unless you know for a fact that a particular source has expired after a partition and you
        should instead use another source after this partition.
    :type end_partition: str, optional
    :param time_column: a single expression to produce time as ** milliseconds since epoch**.
    :type time_column: str, optional
    :param setups: you can register UDFs using setups
        ["ADD JAR YOUR_JAR", "create temporary function YOU_UDF_NAME as YOUR_CLASS"]
    :type setups: List[str], optional
    :param mutation_time_column: For entities, with real time accuracy, you need to specify an expression that
        represents mutation time. Time should be milliseconds since epoch.
        This is not necessary for event sources, defaults to "mutation_ts"
    :type mutation_time_column: str, optional
    :param reversal_column: str, optional
        For entities with realtime accuracy, we divide updates into two additions & reversal.
        updates have two rows - one with is_before = True (the old value) & is_before = False (the new value)
        inserts only have is_before = false (just the new value).
        deletes only have is_before = true (just the old value).
        This is not necessary for event sources.
    :type reversal_column: str, optional (defaults to "is_before")
    :param partition_column: str, optional
        Name of date partition column for the source table (not an expression derived from other columns)
        Default value is "ds". This name does not concern the output table partitioning column.
    :type partition_column: str, optional
    :return: A Query object that Chronon can use to scan just the necessary data efficiently.
    """
    return api.Query(
        selects,
        wheres,
        start_partition,
        end_partition,
        time_column,
        setups or [],
        mutation_time_column,
        reversal_column,
        partition_column,
    )


def select(*args, **kwargs):
    args = {x: x for x in args}
    return {**args, **kwargs}
