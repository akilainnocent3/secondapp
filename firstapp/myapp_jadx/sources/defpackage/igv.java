package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class igv implements pdd0 {
    public final String a = "me__gifts_tab__view";
    public final int b;

    public igv(int i) {
        this.b = i;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("gift_num", Integer.valueOf(this.b)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igv)) {
            return false;
        }
        igv igvVar = (igv) obj;
        return this.a.equals(igvVar.a) && this.b == igvVar.b;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return d830.a(this.b, "MeGiftsTabViewEvent(name=", this.a, ", giftNumber=", ")");
    }
}
