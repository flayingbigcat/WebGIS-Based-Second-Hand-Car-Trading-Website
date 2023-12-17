<template>
    <div>
        <header-bar></header-bar>
    </div>
    <div class="page-header">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="content">
                        <h1 class="page-name">Cart</h1>
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><router-link style="text-decoration: none" to="/">Home</router-link></li>
                                <li class="breadcrumb-item active" aria-current="page">Cart</li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <table class="table">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">First</th>
                <th scope="col">Action</th>
            </tr>
            </thead>
            <tbody>
            <tr v-for="item in dataCollection" :key="item.id">
                <td>{{ item.id }}</td>
                <td>{{ item.column1 }}</td>
                <td>{{ item.action }}</td>
                <!-- 添加更多列的数据绑定 -->
            </tr>
            </tbody>
        </table>
    </div>
    <footer-bar></footer-bar>
</template>
<script>
import HeaderBar from "@/components/HeaderBar.vue";
import {defineComponent} from "vue";
import FooterBar from "@/components/FooterPage.vue";

export default defineComponent({
    components: { FooterBar, HeaderBar },
    data() {
        return {
            dataCollection: [
                { id: 1, column1: '9999$',action:'' },
                { id: 2, column1: '9999$',action:''  },
                { id: 2, column1: '9999$',action:''  },
                { id: 2, column1: '9999$',action:''  },
                // 添加更多数据行
            ]
        };
    }
});

</script>
<style>
@import "../css/_common.css";
</style>