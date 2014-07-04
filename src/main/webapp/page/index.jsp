<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Katerina Storm</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="/css/grid.css" rel="stylesheet">
    <script src="/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="page-header">
        <h1 style="color: dodgerblue">Storm UI [Katerina]</h1>
    </div>
    <h3>Cluster Summary</h3>
    <table class="table table-hover">
        <tr>
            <td>Version</td>
            <td>Nimbus uptime</td>
            <td>Supervisors</td>
            <td>Used slots</td>
            <td>Free slots</td>
            <td>Total slots</td>
            <td>Executors</td>
            <td>Tasks</td>
        </tr>
    </table>
    <hr>
    <h3>Topology summary</h3>
    <table class="table table-hover">
        <tr>
        <td>Name</td>
        <td>id</td>
        <td>stauts</td>
        <td>uptime</td>
        <td>Num workers</td>
        <td>Num executors</td>
        <td>Num Task</td>
        </tr>
        <#if topologys??>
            <#list topologys as to>
                <tr>
                    <td><a href="topology.action?tid=${to.id}" target="_blank">${to.name}</a> </td>
                    <td>${to.id}</td>
                    <td>${to.status}</td>
                    <td>${to.uptime_secs}</td>
                    <td>${to.num_workers}</td>
                    <td>${to.num_executors}</td>
                    <td>${to.num_tasks}</td>
                </tr>
            </#list>
        </#if>
    </table>
    <hr>
    <h3>Supervisor summary</h3>
    <table class="table table-hover">
        <tr>
        <td>id</td>
        <td>Host</td>
        <td>Uptime</td>
        <td>Slots</td>
        <td>Used slots</td>
        </tr>
        <#if supervisors??>
            <#list supervisors as su>
                <tr>
                    <td>${su.supervisor_id}</td>
                    <td>${su.host}</td>
                    <td>${su.uptime_secs}</td>
                    <td>${su.num_workers}</td>
                    <td>${su.num_used_workers}</td>
                </tr>
            </#list>
        </#if>
    </table>
    <hr>
    <h3>Nimbus Configuration</h3>
    <table class="table table-hover">
        <tr>
        <td>Key</td>
        <td>Value</td>
        </tr>
        <#if confs??>
            <#list confs as co>
                <tr>
                    <td>${co.key}</td>
                    <td>${co.value}</td>
                </tr>
            </#list>
        </#if>
    </table>
</div>
</body>
</html>
