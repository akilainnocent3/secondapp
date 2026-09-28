package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class svk {
    public final String a;
    public final String b;
    public final boolean c;
    public final GiftDetails d;

    public svk(String str, String str2, boolean z, GiftDetails giftDetails) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = giftDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svk)) {
            return false;
        }
        svk svkVar = (svk) obj;
        return Intrinsics.g(this.a, svkVar.a) && Intrinsics.g(this.b, svkVar.b) && this.c == svkVar.c && this.d.equals(svkVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + mtg0.a(gpp.a(3, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("GiftStatus(giftId=", this.a, ", giftAmount=", this.b, ", giftKind=3, isAddedToStake=");
        sbA.append(this.c);
        sbA.append(", giftDetails=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
