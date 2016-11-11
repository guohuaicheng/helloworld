<html>
<head>
    <script src="jquery-1.6.2.js"></script>
    <script>
        $(function () {
            $(".btn").click(function () {
                $.ajax({
                    url: "hello",
                    method: "post",
                    success: function (resp) {
                        alert(resp);
                    },
                    error: function (err) {
                        alert(err)
                    }
                })
            })
        })
    </script>
</head>
<body>
<h2>Hello World!!!</h2>
<button class="btn"> Click</button>
</body>
</html>
