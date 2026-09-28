package defpackage;

import com.appsflyer.internal.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class onh0 {
    public final String a;
    public final l25 b;
    public final String c;
    public final long d;

    public onh0(String str, l25 l25Var, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = l25Var;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onh0)) {
            return false;
        }
        onh0 onh0Var = (onh0) obj;
        return Intrinsics.g(this.a, onh0Var.a) && this.b == onh0Var.b && Intrinsics.g(this.c, onh0Var.c) && this.d == onh0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseBoostGiftResult(giftId=");
        sb.append(this.a);
        sb.append(", boostGiftType=");
        sb.append(this.b);
        sb.append(", logId=");
        l.a(this.d, this.c, ", acceptTime=", sb);
        sb.append(")");
        return sb.toString();
    }
}
