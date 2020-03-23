<template>
    <div>
        <table>
            <tr>
                <td>编号</td>
                <td>图书名称</td>
                <td>作者</td>
            </tr>
            <tr v-for="item in books">
                <td>{{item.id}}</td>
                <td>{{item.name}}</td>
                <td>{{item.author}}</td>
            </tr>
        </table>
        {{msg}}
    </div>
</template>

<script>
    export default {

        name: "Book",
        data(){
            return {
                msg: 'hello Vue',
                books:[
                    {
                        id:1,
                        name:'java',
                        author:'Hex3'
                    },
                    {
                        id:2,
                        name:'java2',
                        author:'Hex2'
                    },
                    {
                        id:3,
                        name:'java3',
                        author:'Hex1'
                    },
                ]
            }
        },
        created() {
            const _this = this
            axios.get('http://localhost:8181/book/findAll').then(function(resp){
                _this.books = resp.data
            })
        }
    }
</script>

<style scoped>

</style>