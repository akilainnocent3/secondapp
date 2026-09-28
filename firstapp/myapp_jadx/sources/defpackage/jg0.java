package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "coil3.gif.AnimatedImageDecoder", f = "AnimatedImageDecoder.kt", l = {136}, m = "wrapDrawable")
public final class jg0 extends x1b {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ig0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg0(ig0 ig0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = ig0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
