package defpackage;

import androidx.compose.runtime.j;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class yhf0 {
    public static final uv60 g = jis.a(new xhf0(), new whf0());
    public final isw a;
    public final isw b;
    public final osw c;
    public lk40 d;
    public long e;
    public final ytw f;

    public yhf0(i3z i3zVar, float f) {
        this.a = j.a(f);
        this.b = j.a(0.0f);
        this.c = k.a(0);
        this.d = lk40.e;
        this.e = ulf0.b;
        this.f = m.a(i3zVar, bbe0.b);
    }

    public final void a(i3z i3zVar, lk40 lk40Var, int i, int i2) {
        float f;
        float f2 = i2 - i;
        ((t5a0) this.b).A(f2);
        float f3 = lk40Var.a;
        float f4 = lk40Var.b;
        lk40 lk40Var2 = this.d;
        float f5 = lk40Var2.a;
        isw iswVar = this.a;
        if (f3 != f5 || f4 != lk40Var2.b) {
            boolean z = i3zVar == i3z.a;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? lk40Var.d : lk40Var.c;
            t5a0 t5a0Var = (t5a0) iswVar;
            float fJ = t5a0Var.j();
            float f7 = i;
            float f8 = fJ + f7;
            if (f6 <= f8 && (f3 >= fJ || f6 - f3 <= f7)) {
                f = (f3 >= fJ || f6 - f3 > f7) ? 0.0f : f3 - fJ;
            } else {
                f = f6 - f8;
            }
            ((t5a0) iswVar).A(t5a0Var.j() + f);
            this.d = lk40Var;
        }
        ((t5a0) iswVar).A(f.d(((t5a0) iswVar).j(), 0.0f, f2));
        ((u5a0) this.c).k(i);
    }

    public /* synthetic */ yhf0(i3z i3zVar) {
        this(i3zVar, 0.0f);
    }

    public yhf0() {
        this(i3z.a);
    }
}
