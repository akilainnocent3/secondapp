package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class alb0 {
    public final int a;
    public final g7f b;
    public final tmz c;
    public final long d;
    public final float e;

    public alb0(int i, g7f g7fVar, tmz tmzVar, long j, float f) {
        this.a = i;
        this.b = g7fVar;
        this.c = tmzVar;
        this.d = j;
        this.e = f;
    }

    public static alb0 a(alb0 alb0Var, g7f g7fVar, tmz tmzVar, long j, float f, int i) {
        int i2 = (i & 1) != 0 ? alb0Var.a : R.style.B1_M;
        if ((i & 2) != 0) {
            g7fVar = alb0Var.b;
        }
        if ((i & 4) != 0) {
            tmzVar = alb0Var.c;
        }
        if ((i & 8) != 0) {
            j = alb0Var.d;
        }
        if ((i & 16) != 0) {
            f = alb0Var.e;
        }
        alb0Var.getClass();
        tmzVar.getClass();
        long j2 = j;
        tmz tmzVar2 = tmzVar;
        return new alb0(i2, g7fVar, tmzVar2, j2, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof alb0) {
            alb0 alb0Var = (alb0) obj;
            if (this.a == alb0Var.a && Intrinsics.g(this.b, alb0Var.b) && this.c.equals(alb0Var.c) && this.d == alb0Var.d && g7f.b(this.e, alb0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        g7f g7fVar = this.b;
        return Float.hashCode(this.e) + f87.a((this.c.hashCode() + ((iHashCode + (g7fVar == null ? 0 : Float.hashCode(g7fVar.a))) * 31)) * 31, this.d, 31);
    }

    public final String toString() {
        String strD = k7f.d(this.d);
        String strC = g7f.c(this.e);
        StringBuilder sb = new StringBuilder("SportyButtonSize(textStyle=");
        sb.append(this.a);
        sb.append(", buttonHeight=");
        sb.append(this.b);
        sb.append(", buttonPadding=");
        sb.append(this.c);
        sb.append(", iconSize=");
        sb.append(strD);
        sb.append(", iconDividerPadding=");
        return uf80.a(sb, strC, ")");
    }
}
