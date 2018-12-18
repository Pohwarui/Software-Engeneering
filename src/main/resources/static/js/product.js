$(document).ready(function () {
    $(".nav-tabs a").click(function () {
        $(this).tab('show');
    });
    $('.nav-tabs a').on('shown.bs.tab', function (event) {
        var x = $(event.target).text();         // active tab
        var y = $(event.relatedTarget).text();  // previous tab
        $(".act span").text(x);
        $(".prev span").text(y);
    });
});

Vue.component('hot_goods', {
    props: ['goods_id', 'goods_img', 'goods_name', 'goods_price', 'goods_score'],
    template:
        `<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
            	<div class="product">
            		<div class="../image"><a v-bind:href="'product/'+goods_id"><img v-bind:src="'../'+goods_img" /></a></div>
            		<div class="buttons">
            			<a class="btn cart" href="#"><span class="glyphicon glyphicon-shopping-cart"></span></a>
           				<a class="btn wishlist" href="#"><span class="glyphicon glyphicon-heart"></span></a>
           				<a class="btn compare" href="#"><span class="glyphicon glyphicon-transfer"></span></a>
           			</div>
           			<div class="caption">
           				<div class="name"><h3><a href="product.html">{{goods_name}}</a></h3></div>
           				<div class="price">￥{{goods_price}}</div>
           				<div class="rating"><span class="glyphicon glyphicon-star" v-for="n in goods_score"></span><span class="glyphicon glyphicon-star-empty" v-for="n in 5-goods_score"></span></div>
           		    </div>
           		</div>
           	</div>`
});

Vue.component('last_goods', {
    props: ['goods_id', 'goods_img', 'goods_name', 'goods_price', 'goods_score'],
    template:
        `<div class="product">
                <a v-bind:href="'product/'+goods_id"><img v-bind:src="'../'+goods_img"/></a>
                    <div class="wrapper">
                        <h5><a href="#">{{goods_name}}}</a></h5>
                            <div class="price">{{goods_price}}</div>
                            <div class="rating"><span class="glyphicon glyphicon-star" v-for="n in goods_score"></span><span class="glyphicon glyphicon-star-empty" v-for="n in 5-goods_score"></span></div>
                    </div>
            </div>`
});

Vue.component('comment', {
    props: ['comment_id','consumer_username','comment_content'],
    template:
        `<div><h4>{{consumer_username}}</h4>
        <p>{{comment_content}}</p></div>`
});

var hot_goods_app = new Vue({
    el: '#hot_goods',
    data: {
        posts: null,
    },
    methods: {
        get_hot_goods: function () {
            const context = this;
            $.ajax({
                type: "post",
                url: "../../goods/hot_goods",
                dataType: "json",
                success: function (data) {
                    context.posts = data;
                },
                error: function () {
                    alert("error");
                }
            });
        }
    }
});

var last_goods_app = new Vue({
    el: '#last_goods',
    data: {
        posts: null
    },
    methods: {
        get_special_goods: function () {
            const context = this;
            $.ajax({
                type: "post",
                url: "../../goods/special_goods",
                dataType: "json",
                success: function (data) {
                    context.posts = data;
                },
                error: function () {
                    alert("error");
                }
            });
        }
    }
});


var goods_info_app1 = new Vue({
    el: "#goods_info_app1",
    data: {
        goods_name: null,
        goods_price: null,
        goods_brand: null,
        goods_img: null,
        goods_type: null
    },
    methods: {
        get_goods_info: function () {
            const context = this;
            const id=$("#goods_id").text();
            $.ajax({
                type: "post",
                url: "../../goods/single_goods",
                data: {id: id},
                dataType: "json",
                success: function (data) {
                    context.goods_name = data.goods_name;
                    context.goods_brand = data.goods_brand;
                    context.goods_price = data.goods_price;
                    context.goods_img = data.goods_img;
                    context.goods_type = data.goods_type;
                },
                error: function () {
                    alert("错误");
                }
            });
        }
    }
});

var goods_info_app2 = new Vue({
    el: "#goods_info_app2",
    data: {
        goods_name: null,
        goods_price: null,
        goods_brand: null,
        goods_img: null,
        goods_type: null
    },
    methods: {
        get_goods_info: function () {
            const context = this;
            const id=$("#goods_id").text();
            $.ajax({
                type: "post",
                url: "../../goods/single_goods",
                data: {id: id},
                dataType: "json",
                success: function (data) {
                    context.goods_name = data.goods_name;
                    context.goods_brand = data.goods_brand;
                    context.goods_price = data.goods_price;
                    context.goods_img = data.goods_img;
                    context.goods_type = data.goods_type;
                },
                error: function () {
                    alert("错误");
                }
            });
        }
    }
});

var comment_app=new Vue({
    el:"#description",
    data:{
        posts:null
    },
    methods:{
        get_comment:function () {
            const context = this;
            const id=$("#goods_id").text();
            $.ajax({
                type: "post",
                url: "../../goods/comment",
                data: {id: id},
                dataType: "json",
                success: function (data) {
                    context.posts = data;
                },
                error: function () {
                    alert("错误");
                }
            });
        }
    }
});


hot_goods_app.get_hot_goods();
last_goods_app.get_special_goods();
goods_info_app1.get_goods_info();
goods_info_app2.get_goods_info();
comment_app.get_comment();
/**用户评论数据**/
/*var comment = new Vue({

});*/
