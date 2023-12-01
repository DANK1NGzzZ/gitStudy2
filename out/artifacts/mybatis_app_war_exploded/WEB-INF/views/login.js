$.ajax({
    url: "http://localhost:8088/mybatis_app_war_exploded/auth/login",
    method: "POST",
    headers: {
        "Content-Type": "application/xml"
    },
    data: JSON.stringify({
        username: "user_name",
        password: "password"
    }),
    success: function(response) {
        // 请求成功处理逻辑
        console.log(response);
    },
    error: function(error) {
        // 请求失败处理逻辑
        console.log(error);
    }
});