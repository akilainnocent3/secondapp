package defpackage;

import androidx.compose.runtime.m;
import java.util.Locale;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class oyc extends rz1 {
    public final ytw<xt5> f;
    public final ytw<xt5> g;
    public final ytw<mse> h;

    public oyc(Long l, Long l2, Long l3, IntRange intRange, int i, h780 h780Var, Locale locale) {
        super(l3, intRange, h780Var, locale);
        this.f = m.b(null);
        this.g = m.b(null);
        g(l, l2);
        this.h = m.b(new mse(i));
    }

    public final int d() {
        return ((mse) ((x5a0) this.h).getValue()).a;
    }

    public final Long e() {
        xt5 xt5Var = (xt5) ((x5a0) this.g).getValue();
        if (xt5Var != null) {
            return Long.valueOf(xt5Var.d);
        }
        return null;
    }

    public final Long f() {
        xt5 xt5Var = (xt5) ((x5a0) this.f).getValue();
        if (xt5Var != null) {
            return Long.valueOf(xt5Var.d);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final void g(Long l, Long l2) {
        xt5 xt5VarB;
        xt5 xt5VarB2;
        IntRange intRange = this.a;
        du5 du5Var = this.c;
        if (l != null) {
            xt5VarB = du5Var.b(l.longValue());
            if (!intRange.e(xt5VarB.a)) {
                xt5VarB = null;
            }
        } else {
            xt5VarB = null;
        }
        if (l2 != null) {
            xt5VarB2 = du5Var.b(l2.longValue());
            if (!intRange.e(xt5VarB2.a)) {
                xt5VarB2 = null;
            }
        } else {
            xt5VarB2 = null;
        }
        ytw<xt5> ytwVar = this.g;
        ytw<xt5> ytwVar2 = this.f;
        if (xt5VarB == null || (xt5VarB2 != null && xt5VarB.d > xt5VarB2.d)) {
            ((x5a0) ytwVar2).setValue(null);
            ((x5a0) ytwVar).setValue(null);
        } else {
            ((x5a0) ytwVar2).setValue(xt5VarB);
            ((x5a0) ytwVar).setValue(xt5VarB2);
        }
    }
}
