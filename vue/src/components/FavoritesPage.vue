<template>
  <div>
    <header-bar></header-bar>
    <div class="page-header">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="content">
              <h1 class="page-name">Favorites</h1>
              <nav aria-label="breadcrumb">
                <ol class="breadcrumb">
                  <li class="breadcrumb-item">
                    <router-link style="text-decoration: none" to="/">Home</router-link>
                  </li>
                  <li class="breadcrumb-item active" aria-current="page">Favorites</li>
                </ol>
              </nav>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="container">
      <div class="dashboard-wrapper">
        <table class="table">
          <thead class="table-group-divider">
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Product</th>
            <th scope="col">Price</th>
            <th scope="col">Action</th>
          </tr>
          </thead>
          <tbody>
          <tr v-for="(item, index) in favorites" :key="item.product_id">
            <td>{{ item.product_id }}</td>
            <td>{{ item.product_name }}</td>
            <td>{{ item.product_price }}</td>
            <td>
              <button class="btn btn-danger" @click="removeFromFavorites(index, item.product_id)">Remove from Favorites</button>
            </td>
          </tr>
          </tbody>
        </table>
      </div>
    </div>
    <footer-bar></footer-bar>
  </div>
</template>

<script>
import HeaderBar from "@/components/HeaderBar.vue";
import FooterBar from "@/components/FooterPage.vue";
import axios from "axios";

export default {
  components: { HeaderBar, FooterBar },
  data() {
    return {
      favorites: []
    };
  },
  mounted() {
    this.loadFavorites();
  },
  methods: {
    loadFavorites() {
      // 发送HTTP请求加载用户收藏的商品数据
      axios.get('http://localhost:8081/getFavorites')
          .then(response => {
            this.favorites = response.data;
          })
          .catch(error => {
            console.error('Error fetching favorites:', error);
          });
    },
    removeFromFavorites(index, productId) {
      // 从前端数据中删除收藏
      this.favorites.splice(index, 1);
      // 发送请求到后端接口，从数据库中删除收藏记录
      axios.post(`http://localhost:8081/removeFromFavorites?id=${productId}`)
          .then(() => {
            console.log('Product removed from favorites successfully.');
          })
          .catch(error => {
            console.error('Error removing product from favorites:', error);
          });
    }
  }
};
</script>

<style>
@import "../css/_common.css";
</style>