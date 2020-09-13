<template>
<div class="content">
  <demo-block :vue-code="code" :html-code="htmlCode">
    <template slot="preview">
      <model-gltf
        :backgroundAlpha="0"
        @on-load="onLoad"
        src="static/models/gltf/Duck/glTF/Duck.gltf"
      ></model-gltf>
      <div class="example-loading" v-show="loading"></div>
    </template>
  </demo-block>
</div>
</template>

<script>
import DemoBlock from '../../components/demo-block.vue';
import ModelGltf from '../../3dModel/model-gltf.vue';

const code = `

<template>
    <model-gltf src="static/models/gltf/Duck/glTF/Duck.gltf"></model-gltf>
</template>

<script>
    import { ModelGltf } from 'vue-3d-model'

    export default {
        components: {
            ModelGltf
        }
    }
<\/script>

`;

const htmlCode = `
<body>
    <div id="app">
        <model-gltf 
            src="static/models/gltf/Duck/glTF/Duck.gltf"
            @on-mousemove="onMouseMove">
        </model-gltf>
    </div>
    #scripts#
    <script>
        new Vue({
            el: '#app'
        })
    <\/script>
</body>
`;

export default {
  data() {
    return {
      code,
      htmlCode,
      loading: true,
    };
  },
  methods: {
    onLoad() {
      this.loading = false;
    },
  },
  components: {
    ModelGltf,
    DemoBlock,
  },
};
</script>
<style lang="less" scoped>
.content {
  padding: 20px;
  max-width: 1200px;
  margin: 80px auto 0;
}
</style>
