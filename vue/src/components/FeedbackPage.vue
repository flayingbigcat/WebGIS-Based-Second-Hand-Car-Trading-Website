<template>
  <div>
    <header-bar></header-bar>
    <div class="container mt-5">
      <h2 class="text-center">Feedback</h2>
      <form @submit.prevent="submitFeedback">
        <div class="mb-3">
          <label for="feedback">Please provide your feedback or suggestions on our question:</label>
          <textarea
              class="form-control"
              id="feedback"
              v-model="userFeedback"
              rows="4"
              required
          ></textarea>
        </div>
        <div class="mb-3">
          <label for="phoneNumber">Contact Phone Number(In the process of resolution, it would be convenient for us to contact you):</label>
          <input
              type="tel"
              class="form-control"
              id="phoneNumber"
              v-model="contactPhoneNumber"
              required
          />
        </div>
        <button type="submit" class="btn btn-primary">Submit Feedback</button>
      </form>
    </div>
    <footer-bar></footer-bar>
  </div>
</template>

<script>
import HeaderBar from "@/components/HeaderBar.vue";
import FooterBar from "@/components/FooterPage.vue";

export default {
  name: "FeedbackPage",
  components: {
    HeaderBar,
    FooterBar,
  },
  data() {
    return {
      userFeedback: "",
      contactPhoneNumber: "",
    };
  },
  methods: {
    submitFeedback() {
      console.log("Submitting feedback:", this.userFeedback);
      console.log("Contact Phone Number:", this.contactPhoneNumber);
      this.$router.push("/index");
    },
  },
};
</script>

<style scoped>
.container {
  max-width: 800px; /* Adjust the maximum width as needed */
  margin: auto;
}

textarea,
input[type="tel"] {
  width: 100%;
  padding: 8px;
  font-size: 14px;
  box-sizing: border-box;
  margin-bottom: 10px;
}

.btn-primary {
  font-size: 16px;
}

/* Add any additional styles as needed */
</style>