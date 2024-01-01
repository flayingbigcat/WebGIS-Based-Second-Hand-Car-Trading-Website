<template>
    <div>
        <header-bar></header-bar>
    </div>
    <div class="single-product">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <nav style="--bs-breadcrumb-divider: '>';" aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><router-link to="#" style="text-decoration: none;">Home</router-link></li>
                            <li class="breadcrumb-item active" aria-current="page">Library</li>
                        </ol>
                    </nav>
                </div>
            </div>
            <div class="row mt-20">
                <div class="col-md-5">
                    <div class="single-product-slider">
                        <div id="carouselExampleInterval" class="carousel slide" data-bs-ride="carousel">
                            <div class="carousel-inner">
                                <div class="carousel-item active" data-bs-interval="2000">
                                    <img src="../assets/product_3.jpg" class="d-block w-100" alt="...">
                                </div>
                                <div class="carousel-item" data-bs-interval="2000">
                                    <img src="../assets/product_2.jpg" class="d-block w-100" alt="...">
                                </div>
                                <div class="carousel-item" data-bs-interval="2000">
                                    <img src="../assets/product_1.jpg" class="d-block w-100" alt="...">
                                </div>
                            </div>
                            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
                                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                <span class="visually-hidden">Previous</span>
                            </button>
                            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="next">
                                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                <span class="visually-hidden">Next</span>
                            </button>
                        </div>
                    </div>
                </div>
                <div class="col-md-7">
                    <div class="single-product-details">
                        <h2>Eclipse Crossbody</h2>
                        <p class="product-price">$300</p>

                        <p class="product-description mt-20">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Laborum ipsum dicta quod, quia doloremque aut deserunt commodi quis. Totam a consequatur beatae nostrum, earum consequuntur? Eveniet consequatur ipsum dicta recusandae.
                        </p>
                        <div class="color-swatches">
                            <span>color:</span>
                            <ul>
                                <li>
                                    <a href="#!" class="swatch-violet"></a>
                                </li>
                                <li>
                                    <a href="#!" class="swatch-black"></a>
                                </li>
                                <li>
                                    <a href="#!" class="swatch-cream"></a>
                                </li>
                            </ul>
                        </div>
                        <div class="product-size">
                            <span>Size:</span>
                            <select class="form-control">
                                <option>99</option>
                                <option>98</option>
                                <option>85</option>
                            </select>
                        </div>
                        <div class="product-quantity">
                            <span>Quantity:</span>
                            <div class="quantity-modifier">
                                <button @click="changeQuantity(-1)">-</button>
                                <input v-model="quantity" type="text" name="product-quantity">
                                <button @click="changeQuantity(1)">+</button>
                            </div>
                        </div>
                        <a href="cart.html" class="btn btn-dark mt-20">Add To Cart</a>
                    </div>
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
    components: {FooterBar, HeaderBar},
    data() {
        return {
            quantity: 1, // 初始化为1
        };
    },
    methods: {
        changeQuantity(change) {
            let newQuantity = this.quantity + change;
            if (newQuantity >= 0) { // 确保数量不小于0
                this.quantity = newQuantity;
            }
        }
    }
}
</script>

<style>
@import "../css/_product.css";
</style>