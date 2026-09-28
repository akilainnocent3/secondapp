package defpackage;

import com.appsflyer.internal.w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class pxt {
    public final xtv a;
    public final long b;
    public final String c;
    public final List<Long> d;
    public final List<Long> e;
    public final List<Long> f;
    public final boolean g;

    public static final class a {
        public static ngs a(JSONArray jSONArray) {
            Long lS0;
            ngs ngsVarB = kotlin.collections.a.b();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object objOpt = jSONArray.opt(i);
                if (objOpt instanceof Number) {
                    ngsVarB.add(Long.valueOf(((Number) objOpt).longValue()));
                } else if ((objOpt instanceof String) && (lS0 = StringsKt.s0((String) objOpt)) != null) {
                    ngsVarB.add(Long.valueOf(lS0.longValue()));
                }
            }
            return kotlin.collections.a.a(ngsVarB);
        }
    }

    public pxt(xtv xtvVar, long j, String str, ngs ngsVar, ngs ngsVar2, ngs ngsVar3, boolean z) {
        str.getClass();
        this.a = xtvVar;
        this.b = j;
        this.c = str;
        this.d = ngsVar;
        this.e = ngsVar2;
        this.f = ngsVar3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxt)) {
            return false;
        }
        pxt pxtVar = (pxt) obj;
        return this.a == pxtVar.a && this.b == pxtVar.b && Intrinsics.g(this.c, pxtVar.c) && Intrinsics.g(this.d, pxtVar.d) && Intrinsics.g(this.e, pxtVar.e) && Intrinsics.g(this.f, pxtVar.f) && this.g == pxtVar.g;
    }

    public final int hashCode() {
        int iA = gmf0.a(f87.a(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        List<Long> list = this.d;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        List<Long> list2 = this.e;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Long> list3 = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoyaltyMissionReward(rewardType=");
        sb.append(this.a);
        sb.append(", rewardAmount=");
        sb.append(this.b);
        sb.append(", currency=");
        sb.append(this.c);
        sb.append(", realSportBizTypeIdList=");
        sb.append(this.d);
        qjk.a(", instantVirtualBizTypeIdList=", ", gameBizTypeIdList=", sb, this.e, this.f);
        return w.a(sb, ", onlyGameSupportFreeBetGift=", this.g, ")");
    }
}
