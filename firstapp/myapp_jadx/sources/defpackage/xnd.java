package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xnd implements pdd0 {
    public final String a = "Payment_Deposit_Show";
    public final bag b;
    public final Boolean c;
    public final String d;
    public final String e;
    public final String f;

    public xnd(bag bagVar, Boolean bool, String str, String str2, String str3) {
        this.b = bagVar;
        this.c = bool;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        bag bagVar = this.b;
        HashMap<String, Object> mapD = kpu.d(new Pair("entrance", bagVar != null ? bagVar.K0() : null));
        mapD.put("hot_label_show", this.c);
        mapD.put("brANTest", this.d);
        String str = this.e;
        if (str != null) {
            mapD.put("country", str);
        }
        String str2 = this.f;
        if (str2 != null) {
            mapD.put("countryCode", str2);
        }
        return mapD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnd)) {
            return false;
        }
        xnd xndVar = (xnd) obj;
        return this.a.equals(xndVar.a) && Intrinsics.g(this.b, xndVar.b) && this.c.equals(xndVar.c) && this.d.equals(xndVar.d) && Intrinsics.g(this.e, xndVar.e) && Intrinsics.g(this.f, xndVar.f);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bag bagVar = this.b;
        int iA = gmf0.a((this.c.hashCode() + ((iHashCode + (bagVar == null ? 0 : bagVar.hashCode())) * 961)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode2 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentDepositShowEvent(name=");
        sb.append(this.a);
        sb.append(", entrance=");
        sb.append(this.b);
        sb.append(", defaultTabName=null, hotLabelShow=");
        sb.append(this.c);
        sb.append(", brAnTest=");
        sb.append(this.d);
        sb.append(", country=");
        return kwi.a(sb, this.e, ", countryCode=", this.f, ")");
    }
}
