package defpackage;

import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m4d0 {
    public final String a;
    public final int b;

    public m4d0(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4d0)) {
            return false;
        }
        m4d0 m4d0Var = (m4d0) obj;
        return Intrinsics.g(this.a, m4d0Var.a) && this.b == m4d0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return d830.a(this.b, "SportyPenaltyStatsAverageGoalsState(averageGoalsText=", this.a, ", averageGoalsTextColorResId=", ACKxwYRsuWyGz.XZLfE);
    }
}
