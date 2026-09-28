package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class cxt {
    public final Long a;
    public final boolean b;
    public final List<xtv> c;
    public final List<pxt> d;

    public cxt(Long l, boolean z, List list, ArrayList arrayList) {
        list.getClass();
        this.a = l;
        this.b = z;
        this.c = list;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxt)) {
            return false;
        }
        cxt cxtVar = (cxt) obj;
        return Intrinsics.g(this.a, cxtVar.a) && this.b == cxtVar.b && Intrinsics.g(this.c, cxtVar.c) && Intrinsics.g(this.d, cxtVar.d);
    }

    public final int hashCode() {
        Long l = this.a;
        int iA = ai50.a(mtg0.a((l == null ? 0 : l.hashCode()) * 31, 31, this.b), 31, this.c);
        List<pxt> list = this.d;
        return iA + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoyaltyMissionCompleteData(missionId=");
        sb.append(this.a);
        sb.append(", isWorldCupPass=");
        sb.append(this.b);
        sb.append(", rewardTypes=");
        return v9d.a(", rewardList=", ")", sb, this.c, this.d);
    }
}
