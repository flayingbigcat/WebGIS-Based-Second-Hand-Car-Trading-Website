<template>
    <div>
        <section class="signin-page account">
            <body id="body">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 offset-md-3">
                        <div class="block text-center">
                            <h2 class="text-center">Welcom Back</h2>
                            <form @submit.prevent="submitForm" class="text-left clearfix">
                                <div class="form-group">
                                    <input type="text" class="form-control"  placeholder="First Name">
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control"  placeholder="Last Name">
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control"  placeholder="Username">
                                </div>
                                <div class="form-group">
                                    <input type="email" class="form-control"  placeholder="Email">
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control"  placeholder="Password">
                                </div>
                                <div class="text-center mt-20">
                                    <button type="submit" class="btn btn-dark text-center">Sign In</button>
                                </div>
                            </form>
                            <p class="mt-20">Already hava an account ?<router-link class="custom-link" to="/LoginPage">Login</router-link></p>
                        </div>
                    </div>
                </div>
            </div>
            </body>
        </section>
    </div>

</template>
<script>
export default {
    data() {
        return {
            email: '',
            password: ''
        };
    },
    methods: {
        submitForm() {
            // 处理表单提交逻辑
            console.log('Form submitted with:', this.email, this.password);
        }
    }
};
</script>
<style>
.form-group {
    margin-bottom: 8px;
    input {
        font-size:12px;
        font-weight:200;
        height:45px;
    }
}
.account .block {
    background-color: #fff;
    border: 1px solid #dedede;
    padding: 30px;
    margin: 115px auto; /* Center the block horizontally */
    max-width: 500px; /* Set the maximum width */
}
.account .block form {
    margin-top: 40px;
}
p {
    font-family: "Poppins", sans-serif;
    color: #757575;
    font-size: 15px;
}
.mt-20 {
    margin-top: 20px;
}
body {
    line-height: 1.5;
    font-family: "Poppins", sans-serif;
    -webkit-font-smoothing: antialiased;
}
.custom-link {
    color: black; /* 替换为你想要的颜色值 */
    text-decoration: none; /* 取消下划线 */
}

.custom-link:hover {
    color: black; /* 鼠标悬停时的颜色 */
}
</style>