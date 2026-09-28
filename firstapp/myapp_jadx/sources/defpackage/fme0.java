package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fme0 {
    public static final fme0 f = new fme0(-1, new ijf0((String) null, 0, 7), m2g.a, false, false);
    public final boolean a;
    public final List<aoe0.a> b;
    public final int c;
    public final ijf0 d;
    public final boolean e;

    public fme0(int i, ijf0 ijf0Var, List list, boolean z, boolean z2) {
        list.getClass();
        this.a = z;
        this.b = list;
        this.c = i;
        this.d = ijf0Var;
        this.e = z2;
    }

    public static fme0 a(fme0 fme0Var, List list, int i, ijf0 ijf0Var, boolean z, int i2) {
        boolean z2 = (i2 & 1) != 0 ? fme0Var.a : true;
        if ((i2 & 2) != 0) {
            list = fme0Var.b;
        }
        if ((i2 & 4) != 0) {
            i = fme0Var.c;
        }
        if ((i2 & 8) != 0) {
            ijf0Var = fme0Var.d;
        }
        if ((i2 & 16) != 0) {
            z = fme0Var.e;
        }
        boolean z3 = z;
        fme0Var.getClass();
        list.getClass();
        return new fme0(i, ijf0Var, list, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fme0)) {
            return false;
        }
        fme0 fme0Var = (fme0) obj;
        return this.a == fme0Var.a && Intrinsics.g(this.b, fme0Var.b) && this.c == fme0Var.c && this.d.equals(fme0Var.d) && this.e == fme0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ey1.b(this.d, gpp.a(this.c, ai50.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwitchBankDialogUIState(isDialogShow=");
        sb.append(this.a);
        sb.append(", displaySwitchPaymentItemStateList=");
        sb.append(this.b);
        sb.append(", selectedItemIndex=");
        sb.append(this.c);
        sb.append(", searchTerm=");
        sb.append(this.d);
        sb.append(", isSearchModeOn=");
        return mq0.a(sb, this.e, ")");
    }
}
