<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Table Tree</title>
    <style>
        .head {
            margin-bottom: 5px;
            border:0px solid #000;
            width:100%;
            height:90px;
            padding:0px 0;
        }
        .left {
            float: left;
            width: 35%;
            overflow-y: auto;
            max-height:600px;
            border: 0px;
            border:0px solid #000;
            padding:0px 0;
        }
        .right {
            float: right;
            width: 64%;
            height:600px;
            border:0px solid #000;
            padding:0px 0;
        }
        .foot {
            width:100%;
            height:60px;
            text-align: center;
            clear: both;
            border:0px solid #000;
            padding:0px 0;
        }
    </style>
</head>

<body  style="overflow:hidden">

    <div class="head"><h1>PPOS3.0 代码生成器</h1></div>

    <div class="left">
        <#if tableList?exists >
            <table>
                <#list tableList as tableName>
                    <tr>
                        <td>
                            <label>
                                <input type="checkbox" id="chbs" name="selectedTables" value="${tableName}"></input>
                                <span>
                                    ${tableName}
                                </span>
                            </label>
                        </td>
                    </tr>
                </#list>
            </table>
        </#if>
    </div>

    <div class="right">
        <p>生成代码目标包名称</p>
        <input id="packageName" type="text" value="com.hundsun.ppos">
        <button type="submit" onclick="setValue()"> 提交生成 </button>
    </div>

    <div class="foot">&nbsp;&nbsp;PPOS3.0
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2020-07-10
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;DozingRohan@outlook.com
        &nbsp;&nbsp;
    </div>


    <script type="text/javascript">
        function setValue(){
            let checkValue = new Array();
            let allNames = document.getElementsByName("selectedTables");
            for(x in allNames){
                if(allNames[x].checked){
                    checkValue.push(allNames[x].value)
                }
            }
            let packageName = document.getElementById("packageName").value;
            let temp = document.createElement("form");
            temp.action = "/generate";
            temp.method = "post";
            temp.style.display = "none";

            var PARAMS = {
                "tables": checkValue.join(","),
                "packageName": packageName
            };
            console.log(PARAMS)
            for (var x in PARAMS) {
                var opt = document.createElement("textarea");
                opt.name = x;
                opt.value = PARAMS[x];
                temp.appendChild(opt);
            }

            document.body.appendChild(temp);
            temp.submit();
            return temp;
        }
    </script>

</body>
</html>