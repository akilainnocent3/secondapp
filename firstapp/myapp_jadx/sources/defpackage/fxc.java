package defpackage;

import androidx.compose.runtime.m;
import java.util.Locale;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class fxc extends rz1 {
    public final ytw<xt5> f;
    public final ytw<mse> g;

    public fxc(Long l, Long l2, IntRange intRange, int i, h780 h780Var, Locale locale) {
        super(l2, intRange, h780Var, locale);
        xt5 xt5Var = null;
        if (l != null) {
            xt5 xt5VarB = this.c.b(l.longValue());
            if (intRange.e(xt5VarB.a)) {
                xt5Var = xt5VarB;
            }
        }
        this.f = m.b(xt5Var);
        this.g = m.b(new mse(i));
    }

    public final int d() {
        return ((mse) ((x5a0) this.g).getValue()).a;
    }

    public final Long e() {
        xt5 xt5Var = (xt5) ((x5a0) this.f).getValue();
        if (xt5Var != null) {
            return Long.valueOf(xt5Var.d);
        }
        return null;
    }
}
