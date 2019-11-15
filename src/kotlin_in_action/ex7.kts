package kotlin_in_action

class Context

class AttributeSet

open class View {
    constructor(ctx: Context) {
        //
    }

    constructor(ctx: Context, attr: AttributeSet) {
        //
    }
}

class MyButton : View {
    constructor(ctx: Context) : super(ctx) {
        //
    }

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {
        //
    }
}

class MyButton2 : View {
    constructor(ctx: Context) : this(ctx, AttributeSet()) {
        //
    }

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {
        //
    }
}