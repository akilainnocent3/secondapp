package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ca30 {
    public static final uv60 b = new uv60(new ba30(), new aa30());
    public final wd0<Float, ij0> a;

    public ca30() {
        this(new wd0(Float.valueOf(0.0f), gjs.b, null, 12));
    }

    public final float a() {
        return this.a.d().floatValue();
    }

    public final boolean b() {
        return this.a.e();
    }

    public final Object c(float f, tje0 tje0Var) {
        Object objF = this.a.f(tje0Var, new Float(f));
        return objF == y5b.a ? objF : Unit.a;
    }

    public ca30(wd0<Float, ij0> wd0Var) {
        this.a = wd0Var;
    }
}
