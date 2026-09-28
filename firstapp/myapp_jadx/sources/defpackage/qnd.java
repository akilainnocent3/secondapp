package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qnd implements pdd0 {
    public final String a;
    public final bag b;
    public final String c;
    public final String d;
    public final BigDecimal e;
    public final Integer f;
    public final Long g;
    public final Integer h;
    public final Integer i;
    public final String j;
    public final List<String> k;
    public final ww l;
    public final Boolean m;
    public final String n;

    public /* synthetic */ qnd(bag bagVar, String str, BigDecimal bigDecimal, Integer num, Long l, Integer num2, Integer num3, String str2, int i) {
        this("deposit_page__click", (i & 2) != 0 ? null : bagVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : "mobilemoney", (i & 16) != 0 ? null : bigDecimal, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : str2, null, null, null, null);
    }

    public static qnd e(qnd qndVar, bag bagVar, String str, List list, ww wwVar, Boolean bool, String str2, int i) {
        String str3 = qndVar.a;
        bag bagVar2 = (i & 2) != 0 ? qndVar.b : bagVar;
        String str4 = qndVar.c;
        String str5 = (i & 8) != 0 ? qndVar.d : str;
        BigDecimal bigDecimal = qndVar.e;
        bag bagVar3 = bagVar2;
        String str6 = str5;
        Integer num = qndVar.f;
        Long l = qndVar.g;
        Integer num2 = qndVar.h;
        Integer num3 = qndVar.i;
        String str7 = qndVar.j;
        List list2 = (i & 1024) != 0 ? qndVar.k : list;
        ww wwVar2 = (i & 2048) != 0 ? qndVar.l : wwVar;
        Boolean bool2 = (i & 4096) != 0 ? qndVar.m : bool;
        String str8 = (i & 8192) != 0 ? qndVar.n : str2;
        qndVar.getClass();
        str3.getClass();
        return new qnd(str3, bagVar3, str4, str6, bigDecimal, num, l, num2, num3, str7, list2, wwVar2, bool2, str8);
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        bag bagVar = this.b;
        HashMap<String, Object> mapD = kpu.d(new Pair("entrance", bagVar != null ? bagVar.K0() : null), new Pair("tab", this.d), new Pair("amount", this.e), new Pair("status_code", this.f), new Pair("trade_id", this.c), new Pair(AnalyticsParam.KEY_BI_DURATION, this.g));
        Integer num = this.h;
        if (num != null) {
            mapD.put("channel_id", Integer.valueOf(num.intValue()));
        }
        Integer num2 = this.i;
        if (num2 != null) {
            mapD.put("bank_id", Integer.valueOf(num2.intValue()));
        }
        String str = this.j;
        if (str != null) {
            mapD.put("mobile_operator_name", str);
        }
        List<String> list = this.k;
        if (list != null) {
            List<String> list2 = list.isEmpty() ? null : list;
            if (list2 != null) {
                mapD.put("error_type", list2);
            }
        }
        ww wwVar = this.l;
        if (wwVar != null) {
            mapD.put("amountSource", wwVar.a);
        }
        Boolean bool = this.m;
        if (bool != null) {
            mapD.put("hot_label_select", bool);
        }
        String str2 = this.n;
        if (str2 != null) {
            mapD.put("content", str2);
        }
        return mapD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnd)) {
            return false;
        }
        qnd qndVar = (qnd) obj;
        return Intrinsics.g(this.a, qndVar.a) && Intrinsics.g(this.b, qndVar.b) && Intrinsics.g(this.c, qndVar.c) && Intrinsics.g(this.d, qndVar.d) && Intrinsics.g(this.e, qndVar.e) && Intrinsics.g(this.f, qndVar.f) && Intrinsics.g(this.g, qndVar.g) && Intrinsics.g(this.h, qndVar.h) && Intrinsics.g(this.i, qndVar.i) && Intrinsics.g(this.j, qndVar.j) && Intrinsics.g(this.k, qndVar.k) && this.l == qndVar.l && Intrinsics.g(this.m, qndVar.m) && Intrinsics.g(this.n, qndVar.n);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bag bagVar = this.b;
        int iHashCode2 = (iHashCode + (bagVar == null ? 0 : bagVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.e;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.g;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.k;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        ww wwVar = this.l;
        int iHashCode12 = (iHashCode11 + (wwVar == null ? 0 : wwVar.hashCode())) * 31;
        Boolean bool = this.m;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.n;
        return iHashCode13 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DepositPageTopUpClickEvent(name=");
        sb.append(this.a);
        sb.append(", entrance=");
        sb.append(this.b);
        sb.append(", tradingId=");
        hxa.c(sb, this.c, ", tab=", this.d, ", amount=");
        sb.append(this.e);
        sb.append(", statusCode=");
        sb.append(this.f);
        sb.append(", durationMs=");
        sb.append(this.g);
        sb.append(", payChId=");
        sb.append(this.h);
        sb.append(", bankId=");
        w03.a(this.i, ", mobileOperatorName=", this.j, ", errorType=", sb);
        sb.append(this.k);
        sb.append(", amountSource=");
        sb.append(this.l);
        sb.append(", hotLabelSelected=");
        sb.append(this.m);
        sb.append(", content=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }

    public qnd() {
        this(null, null, null, null, null, null, null, null, 16383);
    }

    public qnd(String str, bag bagVar, String str2, String str3, BigDecimal bigDecimal, Integer num, Long l, Integer num2, Integer num3, String str4, List<String> list, ww wwVar, Boolean bool, String str5) {
        str.getClass();
        this.a = str;
        this.b = bagVar;
        this.c = str2;
        this.d = str3;
        this.e = bigDecimal;
        this.f = num;
        this.g = l;
        this.h = num2;
        this.i = num3;
        this.j = str4;
        this.k = list;
        this.l = wwVar;
        this.m = bool;
        this.n = str5;
    }
}
