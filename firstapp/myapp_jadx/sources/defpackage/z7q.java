package defpackage;

import com.sportybet.feature.luckynumber.featurematch.domain.data.LNLastMinuteCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z7q {
    public final long a;
    public final boolean b;
    public final LNLastMinuteCard c;
    public final ogq d;

    public z7q(long j, boolean z, LNLastMinuteCard lNLastMinuteCard, ogq ogqVar) {
        this.a = j;
        this.b = z;
        this.c = lNLastMinuteCard;
        this.d = ogqVar;
    }

    public static z7q a(z7q z7qVar, long j, boolean z, LNLastMinuteCard lNLastMinuteCard, ogq ogqVar, int i) {
        if ((i & 4) != 0) {
            lNLastMinuteCard = z7qVar.c;
        }
        LNLastMinuteCard lNLastMinuteCard2 = lNLastMinuteCard;
        if ((i & 8) != 0) {
            ogqVar = z7qVar.d;
        }
        z7qVar.getClass();
        return new z7q(j, z, lNLastMinuteCard2, ogqVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7q)) {
            return false;
        }
        z7q z7qVar = (z7q) obj;
        return this.a == z7qVar.a && this.b == z7qVar.b && Intrinsics.g(this.c, z7qVar.c) && Intrinsics.g(this.d, z7qVar.d);
    }

    public final int hashCode() {
        int iA = mtg0.a(Long.hashCode(this.a) * 31, 31, this.b);
        LNLastMinuteCard lNLastMinuteCard = this.c;
        int iHashCode = (iA + (lNLastMinuteCard == null ? 0 : lNLastMinuteCard.hashCode())) * 31;
        ogq ogqVar = this.d;
        return iHashCode + (ogqVar != null ? ogqVar.hashCode() : 0);
    }

    public final String toString() {
        return "LNFeatureMatchCards(serverTime=" + this.a + ", featureMatchEnable=" + this.b + ", lastMinuteCard=" + this.c + ", highestOddsCard=" + this.d + ")";
    }
}
