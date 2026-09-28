package defpackage;

import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kw40 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public kw40(String str, String str2, String str3, boolean z, boolean z2) {
        m.a(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw40)) {
            return false;
        }
        kw40 kw40Var = (kw40) obj;
        return Intrinsics.g(this.a, kw40Var.a) && Intrinsics.g(this.b, kw40Var.b) && Intrinsics.g(this.c, kw40Var.c) && this.d == kw40Var.d && this.e == kw40Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mtg0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("RegisteredBankAccountState(id=", this.a, ", ispbImgUrl=", this.b, ", maskedBankAccountNumber=");
        uts.b(this.c, ", isSelectable=", ", isSelected=", sbA, this.d);
        return mq0.a(sbA, this.e, ")");
    }
}
