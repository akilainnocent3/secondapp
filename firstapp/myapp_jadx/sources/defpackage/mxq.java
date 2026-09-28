package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mxq {
    public final String a;
    public final String b;
    public final UiText c;
    public final hlr d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final oxq k;

    public mxq(String str, String str2, UiText uiText, hlr hlrVar, String str3, String str4, String str5, String str6, String str7, boolean z, oxq oxqVar) {
        uiText.getClass();
        hlrVar.getClass();
        str5.getClass();
        oxqVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = uiText;
        this.d = hlrVar;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = z;
        this.k = oxqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxq)) {
            return false;
        }
        mxq mxqVar = (mxq) obj;
        return Intrinsics.g(this.a, mxqVar.a) && Intrinsics.g(this.b, mxqVar.b) && Intrinsics.g(this.c, mxqVar.c) && this.d == mxqVar.d && Intrinsics.g(this.e, mxqVar.e) && Intrinsics.g(this.f, mxqVar.f) && Intrinsics.g(this.g, mxqVar.g) && Intrinsics.g(this.h, mxqVar.h) && Intrinsics.g(this.i, mxqVar.i) && this.j == mxqVar.j && Intrinsics.g(this.k, mxqVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + mtg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a((this.d.hashCode() + yvf.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("LNOrderItemState(orderId=", this.a, ", lotteryId=", this.b, ", orderType=");
        sbA.append(this.c);
        sbA.append(", winningStatus=");
        sbA.append(this.d);
        sbA.append(", ticketId=");
        hxa.c(sbA, this.e, ", currency=", this.f, ", totalStake=");
        hxa.c(sbA, this.g, ", totalReturn=", this.h, ", ticketName=");
        uts.b(this.i, ", shouldShowReBetButton=", ", time=", sbA, this.j);
        sbA.append(this.k);
        sbA.append(")");
        return sbA.toString();
    }

    public mxq() {
        this("", "", vch0.a, hlr.CLEARED, "", "", "", "", "", false, oxq.a.a);
    }
}
