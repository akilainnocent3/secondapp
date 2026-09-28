package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rnd implements pdd0 {
    public final String a;
    public final bag b;
    public final String c;
    public final Boolean d;

    public rnd(bag bagVar, String str, Boolean bool, int i) {
        str = (i & 4) != 0 ? null : str;
        bool = (i & 8) != 0 ? null : bool;
        this.a = "deposit_page__view";
        this.b = bagVar;
        this.c = str;
        this.d = bool;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        bag bagVar = this.b;
        HashMap<String, Object> mapD = kpu.d(new Pair("entrance", bagVar != null ? bagVar.K0() : null));
        String str = this.c;
        if (str != null) {
            mapD.put("default_tab_name", str);
        }
        Boolean bool = this.d;
        if (bool != null) {
            mapD.put("hot_label_show", bool);
        }
        return mapD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnd)) {
            return false;
        }
        rnd rndVar = (rnd) obj;
        return this.a.equals(rndVar.a) && Intrinsics.g(this.b, rndVar.b) && Intrinsics.g(this.c, rndVar.c) && Intrinsics.g(this.d, rndVar.d);
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
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "DepositPageViewEvent(name=" + this.a + ", entrance=" + this.b + ", defaultTabName=" + this.c + ", hotLabelShow=" + this.d + ")";
    }
}
