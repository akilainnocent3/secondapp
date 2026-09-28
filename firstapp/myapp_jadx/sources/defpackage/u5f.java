package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u5f implements pdd0 {
    public final String a;
    public final String b;
    public final String c;

    public u5f(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("sportId", this.a), new Pair("initial_stake", this.b), new Pair("final_stake", this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5f)) {
            return false;
        }
        u5f u5fVar = (u5f) obj;
        return this.a.equals(u5fVar.a) && Intrinsics.g(this.b, u5fVar.b) && Intrinsics.g(this.c, u5fVar.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "don__place_bet__click";
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("PlaceBetClickEvent(sportId=", this.a, ", initialStake=", this.b, ", finalStake="), this.c, ")");
    }
}
