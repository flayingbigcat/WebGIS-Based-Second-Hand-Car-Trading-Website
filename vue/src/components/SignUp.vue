<template>
    <div class="account">
        <div class="container">
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <div class="block text-center">
                        <h2 class="text-center">SIGN</h2>
                        <form>
                            <div class="mb-3">
                                <input type="email" class="form-control" id="userNameInput" v-model="form.user_name" placeholder="NAME">
                            </div>
                            <div class="mb-3">
                                <input type="email" class="form-control" id="userEmailInput" v-model="form.user_email" placeholder="EMAIL">
                            </div>
                            <div class="mb-3">
                                <input type="password" class="form-control" id="passwordInput" v-model="form.user_password" placeholder="PASSWORD">
                            </div>
                            <div class="mb-3">
                                <button type="button" class="btn btn-dark text-center" @click="register">登录</button>
                                <!--                                <button type="button" class="btn btn-secondary" @click="register">注册</button>-->
                            </div>
                        </form>
                        <p class="mt-20">alread have a account?<a @click="register">To login</a></p>
                    </div>
                </div>
            </div>
        </div>
    </div>

</template>

<script>
import axios from 'axios';
// import { useRouter } from 'vue-router';
import { ElMessage } from 'element-plus'
// import {ref} from 'vue';

export default {
    name: 'SignUp',
    data() {
        return {
            form: {
                user_name: '',
                user_email: '',
                user_password: ''
            }
        };
    },
    methods: {
        async register() {
            try {
                const response = await axios.post('http://localhost:8081/addUsercc', this.form);
                // 处理成功或根据需要重定向到新页面
                console.log(response.data);
                // 可选地，您可以使用Vue Router在成功注册后导航到另一个页面
                this.$router.push('/UserPage');
            } catch (error) {
                console.error(error);
                // 处理注册错误，显示消息或重定向到错误页面
                ElMessage.error('注册失败，请重试。');
            }
        },
    }
};
</script>