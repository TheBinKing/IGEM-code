<template>
  <div class="demo-block">
    <div class="demo-block-preview">
      <slot name="preview"></slot>
    </div>
    <div class="demo-block-code">
      <h3>乐高模型</h3>
      <div class="demo-block-code-box">
        <select v-model="cdata"  v-on:change="indexSelect(cdata)" >
        <option v-for="(curriculum, index) in objFile" :key="index">{{curriculum}}</option>
        </select>
        <!-- <span>{{cdata}}</span> -->
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'app',
  props: ['childData'],

  data() {
    return {
      cdata: 'tree',
      objFile: ['tree', 'laom_new', 'Angular'],
    };
  },
  filters: {
  },
  methods: {
    indexSelect(val) {
      this.$emit('childhandler', val);
    },
  },
  components: {},
};
</script>
<style lang="less">
.demo-block {
  width: 100%;
  height: 100%;
  background-color: #fff;
  border-radius: 3px;
}

.demo-block .demo-block-preview {
  width: 50%;
  height: 100%;
  float: left;
  position: relative;
}

.demo-block .demo-block-code {
  width: 50%;
  height: 100%;
  background: #f9fafc;
  border-left: solid 1px #dfe2e7;
  font-size: 13px;
  float: left;
}

.demo-block .demo-block-code pre code {
  font: normal 10pt Consolas, Monaco, monospace;
}

.demo-block .demo-block-code .demo-block-code-box {
  width: 100%;
  height: 50%;
  position: relative;
  overflow: hidden;
}

.demo-block .demo-block-code-box::after {
  content: "";
  display: block;
  position: absolute;
  bottom: 0;
  left: 0;
  width: 90%;
  height: 1px;
  background: -webkit-linear-gradient(
    left,
    #dfe2e7 80%,
    rgba(223, 226, 231, 0) 100%
  );
}

.demo-block .demo-block-code-box h3 {
  width: 100%;
  padding: 10px 20px;
  font-size: 16px;
  font-weight: bold;
  position: absolute;
}

.demo-block .demo-block-code-box-content {
  position: absolute;
  top: 40px;
  bottom: 10px;
  left: 20px;
  right: 20px;
  overflow: auto;
}

.demo-block .hljs {
  background: transparent;
}

.demo-block .demo-block-code code {
  position: absolute;
  top: 0;
  left: 0;
}
</style>
