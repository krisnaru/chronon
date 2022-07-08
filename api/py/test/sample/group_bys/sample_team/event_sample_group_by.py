from sources import test_sources
from ai.chronon.group_by import (
    GroupBy,
    Aggregation,
    Operation,
    TimeUnit,
    Window,
)


v1 = GroupBy(
    sources=test_sources.event_source,
    keys=["group_by_subject"],
    aggregations=[
        Aggregation(
            input_column="event",
            operation=Operation.SUM,
            windows=[Window(length=7, timeUnit=TimeUnit.DAYS)]
        ),
        Aggregation(
            input_column="event",
            operation=Operation.SUM
        )
    ],
    online=True,
    output_namespace="sample_namespace",
)