package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class hnd implements pdd0 {
    public final String a = "deposit_banner__view";

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("banner_type", "promotion banner"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hnd) && this.a.equals(((hnd) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1715207497;
    }

    public final String toString() {
        return tug.a("DepositBannerViewEvent(name=", this.a, ", bannerType=promotion banner)");
    }
}
