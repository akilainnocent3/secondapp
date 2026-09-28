package defpackage;

import com.sportygames.newcms.CMSRes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class fne0 {
    public final int a;
    public final CMSRes b;
    public final String c;
    public final boolean d;

    public fne0(int i, CMSRes cMSRes, String str, boolean z) {
        cMSRes.getClass();
        this.a = i;
        this.b = cMSRes;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fne0)) {
            return false;
        }
        fne0 fne0Var = (fne0) obj;
        return this.a == fne0Var.a && Intrinsics.g(this.b, fne0Var.b) && this.c.equals(fne0Var.c) && this.d == fne0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gmf0.a((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwitchData(drawableRes=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", dataStoreKey=");
        sb.append(this.c);
        sb.append(", defaultValue=");
        return ruw.a(sb, this.d, ')');
    }
}
