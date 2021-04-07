<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<script src="static/js/jquery.min.js"></script>
<script src="static/js/vue.js"></script>
<script src="static/js/axios-0.18.0.js"></script>
<script src="static/plugins/elementui/index.js"></script>
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<script src="static/js/bootstrap.min.js"></script>
<form id="app">
    <div class="form-group">
        <label for="exampleInputEmail1">Email address</label>
        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword1">
    </div>
    <div class="form-group form-check">
        <input type="checkbox" class="form-check-input" id="exampleCheck1">
        <label class="form-check-label" for="exampleCheck1">Check me out</label>
    </div>
    <button type="button" @click="log()" class="btn btn-primary">Submit</button>
</form>
<script >
    var vue=new Vue({
        el:"#app",
        data:{
            message:"",
            userName:"",
            password:""
        },
        methods:{
            log(){
                var instance = axios.create({
                    headers:
                        {'content-type': 'application/x-www-form-urlencoded'} });
                instance.get("/user/login",{params:{
                    userName:document.getElementById("exampleInputEmail1").value,
                        password:document.getElementById("exampleInputPassword1").value

                    }}).then(response=>{
                        if(response.data){
                            window.location="/skip/main";
                        }else{
                            this.message="账号或密码有误！";
                            alert(this.message);
                        }
                })
            }
        }
    })
</script>

</body>
</html>
