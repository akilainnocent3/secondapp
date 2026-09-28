package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kc0 extends TextPaint {
    public b90 a;
    public yef0 b;
    public int c;
    public ix80 d;
    public j58 e;
    public ya5 f;
    public mae g;
    public yw90 h;
    public wcf i;

    public final zqz a() {
        b90 b90Var = this.a;
        if (b90Var != null) {
            return b90Var;
        }
        b90 b90Var2 = new b90(this);
        this.a = b90Var2;
        return b90Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        ((b90) a()).c(i);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    public final void c(final ya5 ya5Var, final long j, float f) {
        if (ya5Var == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (ya5Var instanceof soa0) {
            d(gff0.a(f, ((soa0) ya5Var).b));
            return;
        }
        if (!(ya5Var instanceof dx80)) {
            uhc.a();
            return;
        }
        if (Intrinsics.g(this.f, ya5Var)) {
            yw90 yw90Var = this.h;
            if (!(yw90Var == null ? false : yw90.a(yw90Var.a, j))) {
                if (j != 9205357640488583168L) {
                    this.f = ya5Var;
                    this.h = new yw90(j);
                    this.g = a6a0.b(new Function0() { // from class: jc0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ((dx80) ya5Var).b(j);
                        }
                    });
                }
            }
        } else if (j != 9205357640488583168L) {
            this.f = ya5Var;
            this.h = new yw90(j);
            this.g = a6a0.b(new Function0() { // from class: jc0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ((dx80) ya5Var).b(j);
                }
            });
        }
        zqz zqzVarA = a();
        mae maeVar = this.g;
        ((b90) zqzVarA).f(maeVar != null ? (Shader) maeVar.getValue() : null);
        this.e = null;
        lc0.a(this, f);
    }

    public final void d(long j) {
        j58 j58Var = this.e;
        if ((j58Var == null ? false : nbh0.a(j58Var.a, j)) || j == 16) {
            return;
        }
        this.e = new j58(j);
        setColor(r58.l(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(wcf wcfVar) {
        if (wcfVar == null || Intrinsics.g(this.i, wcfVar)) {
            return;
        }
        this.i = wcfVar;
        if (wcfVar.equals(rlh.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(wcfVar instanceof yae0)) {
            uhc.a();
            return;
        }
        ((b90) a()).h(1);
        yae0 yae0Var = (yae0) wcfVar;
        ((b90) a()).r(yae0Var.a);
        ((b90) a()).q(yae0Var.b);
        ((b90) a()).p(yae0Var.d);
        ((b90) a()).o(yae0Var.c);
        ((b90) a()).n(yae0Var.e);
    }

    public final void f(ix80 ix80Var) {
        if (ix80Var == null || Intrinsics.g(this.d, ix80Var)) {
            return;
        }
        this.d = ix80Var;
        if (ix80Var.equals(ix80.d)) {
            clearShadowLayer();
            return;
        }
        ix80 ix80Var2 = this.d;
        float f = ix80Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (ix80Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), r58.l(this.d.a));
    }

    public final void g(yef0 yef0Var) {
        if (yef0Var == null || Intrinsics.g(this.b, yef0Var)) {
            return;
        }
        this.b = yef0Var;
        int i = yef0Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
