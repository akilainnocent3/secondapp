package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d5q {
    public final String a;
    public final ResourceUiText b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final qcn<kcr> g;
    public final String h;

    public d5q(String str, ResourceUiText resourceUiText, String str2, String str3, String str4, String str5, uf00 uf00Var, String str6) {
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        uf00Var.getClass();
        str6.getClass();
        this.a = str;
        this.b = resourceUiText;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = uf00Var;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5q)) {
            return false;
        }
        d5q d5qVar = (d5q) obj;
        return this.a.equals(d5qVar.a) && this.b.equals(d5qVar.b) && Intrinsics.g(this.c, d5qVar.c) && Intrinsics.g(this.d, d5qVar.d) && Intrinsics.g(this.e, d5qVar.e) && Intrinsics.g(this.f, d5qVar.f) && Intrinsics.g(this.g, d5qVar.g) && Intrinsics.g(this.h, d5qVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + shu.a(this.g, gmf0.a(gmf0.a(gmf0.a(gmf0.a(wh8.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LNDetailScreenShot(createTime=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", ticketID=");
        hxa.c(sb, this.c, ", totalStake=", this.d, ", totalReturn=");
        hxa.c(sb, this.e, ", currency=", this.f, ", betRecords=");
        sb.append(this.g);
        sb.append(", imagePath=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
