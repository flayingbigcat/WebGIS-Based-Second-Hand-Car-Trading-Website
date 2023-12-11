<template>
    <div>
        <section class="signin-page account">
            <body id="body">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 offset-md-3">
                        <div class="block text-center">
                            <h2 class="text-center">Welcom</h2>
                            <form :model="user"  class="text-left clearfix" :rules="rules" ref="loginRef">
                                <div class="form-group">
                                    <input type="email" class="form-control"  placeholder="Email" v-model="user.email">
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control" placeholder="Password" v-model="user.password">
                                </div>
                                <div class="form-group">
                                    <div class="form-group">
                                        <div class="input-with-captcha">
                                            <input type="code" class="form-control" placeholder="verification code" v-model="user.code">
                                            <valid-code @update:value="handleCaptcha"></valid-code>
                                        </div>
                                    </div>
                                </div>
                                <div class="text-center mt-20">
                                    <button type="submit" class="btn btn-dark text-center" @click="login">Login</button>
                                </div>
                            </form>
                            <p class="mt-20"><router-link class="custom-link " to="/ForgetPage"> Forgot your password?</router-link></p>
                            <p class="mt-20">New in this site? <router-link class="custom-link" to="/SignUp">Create New Account</router-link></p>
                        </div>
                    </div>
                </div>
            </div>
            </body>
        </section>
    </div>

</template>
<script>
import ValidCode from "@/components/ValidCode.vue";
export default {
    components: {
        ValidCode
    },
    data() {

        // 验证码校验
        const validateCode = (rule, value, callback) => {
            if (value === '') {
                callback(new Error('Enter the code'))
            } else if (value.toLowerCase() !== this.code) {
                callback(new Error('Error code'))
            } else {
                callback()
            }
        }

        return {
            code: '',  // 验证码组件传递过来的code
            user: {
                code: '',   // 表单里用户输入的code 验证码
                email: '',
                password: ''
            },
            rules: {
                email: [
                    { required: true, message: 'Enter the email', trigger: 'blur' },
                ],
                password: [
                    { required: true, message: 'Enter the password', trigger: 'blur' },
                ],
                code: [
                    { validator: validateCode, trigger: 'blur' }
                ],
            }
        }
    },
    created() {

    },
    methods: {
        handleCaptcha(code) {
            this.code = code.toLowerCase()
        },
        login() {
            this.$refs['loginRef'].validate((valid) => {
                console.log(valid)
                // if (valid) {
                //     // 验证通过
                //     this.$request.post('/login', this.user).then(res => {
                //         if (res.code === '200') {
                //             this.$router.push('/')
                //             this.$message.success('welcome')
                //             localStorage.setItem("honey-user", JSON.stringify(res.data))  // 存储用户数据
                //         } else {
                //             this.$message.error(res.msg)
                //         }
                //     })
                // }
            })
        }
    }
}
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
    margin: 150px auto; /* Center the block horizontally */
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
.input-with-captcha {
    display: flex; /* 使用 Flex 布局，使元素水平排列 */
    align-items: center; /* 垂直居中对齐子元素 */
}

.input-with-captcha input[type="code"] {
    flex: 100%; /* 输入框占据剩余的可用空间 */
    margin-right: 5px; /* 可以根据需要调整输入框右侧的间距 */
}
</style>