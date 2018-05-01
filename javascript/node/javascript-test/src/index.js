const Koa = require('koa')
const views = require('koa-views')
const app = module.exports = new Koa()

app.use(views(__dirname + '/views', { extension: 'pug' }))

app.use(async (ctx) => {
    await ctx.render('1', '1.pug')
})

if (!module.parent) app.listen(8081)