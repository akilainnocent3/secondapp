package defpackage;

import android.os.Build;
import androidx.compose.runtime.m;
import java.util.Locale;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public abstract class rz1 {
    public final IntRange a;
    public final Locale b;
    public final du5 c;
    public final ytw d;
    public final ytw<iu5> e;

    public rz1(Long l, IntRange intRange, h780 h780Var, Locale locale) {
        iu5 iu5VarG;
        this.a = intRange;
        this.b = locale;
        du5 eu5Var = Build.VERSION.SDK_INT >= 26 ? new eu5(locale) : new z4s(locale);
        this.c = eu5Var;
        this.d = m.b(h780Var);
        if (l != null) {
            iu5VarG = eu5Var.f(l.longValue());
            if (!intRange.e(iu5VarG.a)) {
                iu5VarG = eu5Var.g(eu5Var.h());
            }
        } else {
            iu5VarG = eu5Var.g(eu5Var.h());
        }
        this.e = m.b(iu5VarG);
    }

    public final long a() {
        return ((iu5) ((x5a0) this.e).getValue()).e;
    }

    public final h780 b() {
        return (h780) ((x5a0) this.d).getValue();
    }

    public final void c(long j) {
        iu5 iu5VarF = this.c.f(j);
        if (this.a.e(iu5VarF.a)) {
            ((x5a0) this.e).setValue(iu5VarF);
        }
    }
}
