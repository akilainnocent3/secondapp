package defpackage;

import com.sporty.android.core.model.loyalty.TierConfig;
import com.sporty.android.core.model.loyalty.TierDobConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uqf0 {
    public final krf0 a;
    public final TierConfig b;
    public final TierDobConfig c;

    public uqf0(krf0 krf0Var, TierConfig tierConfig, TierDobConfig tierDobConfig) {
        krf0Var.getClass();
        this.a = krf0Var;
        this.b = tierConfig;
        this.c = tierDobConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqf0)) {
            return false;
        }
        uqf0 uqf0Var = (uqf0) obj;
        return this.a == uqf0Var.a && this.b.equals(uqf0Var.b) && Intrinsics.g(this.c, uqf0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        TierDobConfig tierDobConfig = this.c;
        return iHashCode + (tierDobConfig == null ? 0 : tierDobConfig.hashCode());
    }

    public final String toString() {
        return "TierConfigData(tier=" + this.a + ", tierConfig=" + this.b + ", tierDobConfig=" + this.c + ")";
    }
}
