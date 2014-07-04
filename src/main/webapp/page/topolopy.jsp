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
        <#if to??>
            <tr>
                <td>${to.name}</td>
                <td>${to.id}</td>
                <td>${to.status}</td>
                <td>${to.uptime_secs}</td>
                <td>${to.num_workers}</td>
                <td>${to.num_executors}</td>
                <td>${to.num_tasks}</td>
            </tr>
        </#if>
    </table>
    <h3>Topology actions</h3>
    <button type="button" class="btn btn-success">Activate</button>
    <button type="button" class="btn btn-primary">Rebalance</button>
    <button type="button" class="btn btn-danger">Deactivate</button>
    <button type="button" class="btn btn-info">Alert</button>
    <button type="button" class="btn btn-warning">Kill</button>
    <h3>Executors Summary</h3>
    <table class="table table-hover">
        <tr>
            <td>id</td>
            <td>Host</td>
            <td>Port</td>
            <td>Uptime</td>
            <td>Acked All/600/10800/86400</td>
            <td>Transferred All/600/10800/86400</td>
        </tr>
        <#if exesum??>
            <#list exesum as ex>
                <tr>
                    <td>${ex.id}</td>
                    <td>${ex.host}</td>
                    <td>${ex.port}</td>
                    <td>${ex.updatime}</td>
                    <td>${ex.acked}</td>
                    <td>${ex.transferred}</td>
                </tr>
            </#list>
        </#if>
    </table>
    <h3>Topology Configuration</h3>
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