package defpackage;

import com.appsflyer.internal.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class xqb0 {
    public final wqb0 a;
    public final vqb0 b;
    public final Integer c;

    public xqb0(wqb0 wqb0Var, vqb0 vqb0Var, Integer num) {
        vqb0Var.getClass();
        this.a = wqb0Var;
        this.b = vqb0Var;
        this.c = num;
    }

    public static xqb0 a(xqb0 xqb0Var, wqb0 wqb0Var, vqb0 vqb0Var, Integer num, int i) {
        if ((i & 1) != 0) {
            wqb0Var = xqb0Var.a;
        }
        if ((i & 2) != 0) {
            vqb0Var = xqb0Var.b;
        }
        if ((i & 4) != 0) {
            num = xqb0Var.c;
        }
        xqb0Var.getClass();
        wqb0Var.getClass();
        vqb0Var.getClass();
        return new xqb0(wqb0Var, vqb0Var, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqb0)) {
            return false;
        }
        xqb0 xqb0Var = (xqb0) obj;
        return this.a == xqb0Var.a && Intrinsics.g(this.b, xqb0Var.b) && Intrinsics.g(this.c, xqb0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyHeroAllBetsUiModel(selectedTab=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", allBetsTabCount=");
        return v.a(sb, this.c, ")");
    }

    public xqb0() {
        this(0);
    }

    public /* synthetic */ xqb0(int i) {
        this(wqb0.a, vqb0.b.a, null);
    }
}
