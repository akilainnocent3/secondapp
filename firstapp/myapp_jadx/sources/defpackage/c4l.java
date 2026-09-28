package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class c4l implements pdd0 {
    public final String a = "gr__promo__click";
    public final int b;

    public c4l(int i) {
        this.b = i;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("biz_type", Integer.valueOf(this.b)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4l)) {
            return false;
        }
        c4l c4lVar = (c4l) obj;
        return this.a.equals(c4lVar.a) && this.b == c4lVar.b;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return d830.a(this.b, "GoldenRacePromotionClickEvent(name=", this.a, ", bizType=", ")");
    }
}
