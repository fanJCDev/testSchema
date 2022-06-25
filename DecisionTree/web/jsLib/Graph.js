var selectItem = -1;

function showTreeByXml(xml) {
    var div_id = "DisplayTree";

    var options = {
        swfPath: "jsLib/swf/CytoscapeWeb",
        flashInstallerPath: "jsLib/swf/playerProductInstall"
    };

    var vis = new org.cytoscapeweb.Visualization(div_id, options);

    vis.ready(function () {

        vis.addListener("click", "nodes", function (event) {
            handle_click(event);
        })
            .addListener("click", "edges", function (event) {
                handle_click(event);
            });

        function handle_click(event) {
            var target = event.target;

            clear();

            print("event.group = " + event.group);
            for (var i in target.data) {
                var variable_name = i;
                var variable_value = target.data[i];
                if (variable_name.trim() != "parent".trim()) {
                    print("event.target.data." + variable_name + " = " + variable_value);
                }
            }

            for (var i in target.data) {

                if (i == "id") {
                    selectItem = target.data[i];
                }

            }
        }

        function print(msg) {
            document.getElementById("note").innerHTML += "<p>" + msg + "</p>";
        }

        function clear() {
            document.getElementById("note").innerHTML = "";
            selectItem = -1;
        }

    });


    var draw_options = {

        network: xml,

        edgeLabelsVisible: true,

        layout: "Tree",


        panZoomControlVisible: true
    };

    vis.draw(draw_options);
};


function insertNode() {
    if (selectItem > -1) {
        document.getElementById("mainForm").action = "Process.jsp?nodeId=" + selectItem + "&action=ins";
        document.getElementById("mainForm").submit();
    } else {
        alert("سوال یا جوابی انتخاب نشده است.");
    }
};


function deleteNode() {
    if (selectItem > -1) {
        var result = confirm("عمل حذف انجام شود ؟");
        if (result) {
            document.getElementById("mainForm").action = "Process.jsp?nodeId=" + selectItem + "&action=del";
            document.getElementById("mainForm").submit();
        }
    } else {
        alert("سوال یا جوابی انتخاب نشده است.");
    }
};


