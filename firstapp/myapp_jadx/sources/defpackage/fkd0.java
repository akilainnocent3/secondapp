package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fkd0<T> implements goh<T> {
    public final float a;
    public final float b;
    public final T c;

    public /* synthetic */ fkd0(Object obj, int i) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }

    @Override // defpackage.xi0
    public final pwh0 a(f0h0 f0h0Var) {
        T t = this.c;
        return new cxh0(this.a, this.b, t == null ? null : (mj0) f0h0Var.a().invoke(t));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fkd0) {
            fkd0 fkd0Var = (fkd0) obj;
            if (fkd0Var.a == this.a && fkd0Var.b == this.b && Intrinsics.g(fkd0Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        T t = this.c;
        return Float.hashCode(this.b) + tvh.a(this.a, (t != null ? t.hashCode() : 0) * 31, 31);
    }

    public fkd0(float f, float f2, T t) {
        this.a = f;
        this.b = f2;
        this.c = t;
    }

    public fkd0() {
        this(null, 7);
    }
}
