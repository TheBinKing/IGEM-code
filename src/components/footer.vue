<template>
  <div class="footer">
    <div class="content">
      <el-col>
        <el-col :span="8">
          <div class="info">
            <h3>Contract US</h3>
            <p>uestcsoftware@vip.qq.com</p>
          </div>
        </el-col>
        <el-col :span="8">
          <div class="info">
            <h3>About US</h3>
            <p>iGEM UESTC Software</p>
          </div>
        </el-col>
        <el-col :span="4">
          <img src="../assets/images/111.png" alt />
          <div class="info">WeChat Official Account </div>
        </el-col>
        <el-col :span="4">
          <img src="../assets/images/111.png" alt />
          <div class="info">XXX小程序</div>
        </el-col>
      </el-col>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  },

  methods: {},
};
</script>
<style lang="less" scoped>
.footer {

  min-width: 750px;
  height: 200px;
  background-color: rgb(72, 133, 112);
  color: #fff;
  .content {
    height: 100%;
    max-width: 1200px;
    margin: 0 auto;
    overflow: hidden;
    padding: 20px;
    box-sizing: border-box;
    .info {
      height: 100%;
      h3 {
        margin-bottom: 10px;
      }
      
    }
    img {
      width: 100px;
      height: 100px;
    }
  }
}
</style>
