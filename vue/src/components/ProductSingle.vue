<template>
    <div>
        <header-bar></header-bar>
    </div>
    <div class="single-product">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <ol class="breadcrumb">
                        <li><router-link to="/index">Home</router-link></li>
                        <li><router-link to="/ShopPage">Shop</router-link></li>
                        <li class="active">Single Product</li>
                    </ol>
                </div>
            </div>
        </div>
    </div>
    <footer-bar></footer-bar>
</template>
<script>

import HeaderBar from "@/components/HeaderBar.vue";
import FooterBar from "@/components/FooterPage.vue";

export default {
    name: "ProductSingle",
    components: {FooterBar, HeaderBar}
}
</script>

<style>
@import "../css/_product.css";
</style>