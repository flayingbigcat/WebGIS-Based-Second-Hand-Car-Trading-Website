const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  // transpileDependencies: true
  devServer: {
    // 更换ip
    host: '192.168.1.27',

    // 更换端口号
    port: 8888,
  }
  })
