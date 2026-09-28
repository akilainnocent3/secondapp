package defpackage;

import com.sporty.android.core.model.sportysim.NetworkSpeedControllerConfig;
import com.sporty.android.core.model.sportysim.SIMMultiBetBonusData;
import com.sporty.android.core.model.sportysim.SimSportSupData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tm90 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final SIMMultiBetBonusData e;
    public final int f;
    public final List<SimSportSupData> g;
    public final dl90 h;
    public final NetworkSpeedControllerConfig i;
    public final boolean j;
    public final boolean k;

    public tm90(boolean z, String str, String str2, String str3, SIMMultiBetBonusData sIMMultiBetBonusData, int i, List<SimSportSupData> list, dl90 dl90Var, NetworkSpeedControllerConfig networkSpeedControllerConfig, boolean z2, boolean z3) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = sIMMultiBetBonusData;
        this.f = i;
        this.g = list;
        this.h = dl90Var;
        this.i = networkSpeedControllerConfig;
        this.j = z2;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm90)) {
            return false;
        }
        tm90 tm90Var = (tm90) obj;
        return this.a == tm90Var.a && this.b.equals(tm90Var.b) && this.c.equals(tm90Var.c) && this.d.equals(tm90Var.d) && Intrinsics.g(this.e, tm90Var.e) && this.f == tm90Var.f && Intrinsics.g(this.g, tm90Var.g) && this.h.equals(tm90Var.h) && Intrinsics.g(this.i, tm90Var.i) && this.j == tm90Var.j && this.k == tm90Var.k;
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        SIMMultiBetBonusData sIMMultiBetBonusData = this.e;
        int iA2 = gpp.a(this.f, (iA + (sIMMultiBetBonusData == null ? 0 : sIMMultiBetBonusData.hashCode())) * 31, 31);
        List<SimSportSupData> list = this.g;
        int iHashCode = (this.h.hashCode() + ((iA2 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        NetworkSpeedControllerConfig networkSpeedControllerConfig = this.i;
        return Boolean.hashCode(this.k) + mtg0.a((iHashCode + (networkSpeedControllerConfig != null ? networkSpeedControllerConfig.hashCode() : 0)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("SimulationConfig(isSimulatedActive=", ", minStake=", this.b, ", maxStake=", this.a);
        hxa.c(sbA, this.c, ", maxPayout=", this.d, ", multiBetBonus=");
        sbA.append(this.e);
        sbA.append(", maxSelection=");
        sbA.append(this.f);
        sbA.append(", sports=");
        sbA.append(this.g);
        sbA.append(", autoBet=");
        sbA.append(this.h);
        sbA.append(", speedControllerConfig=");
        sbA.append(this.i);
        sbA.append(", isGiftEnabled=");
        sbA.append(this.j);
        sbA.append(", isAddToStakeEnabled=");
        return mq0.a(sbA, this.k, ")");
    }
}
