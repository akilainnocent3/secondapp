package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t5f implements pdd0 {
    public final String a;

    public t5f(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("sportId", this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t5f) && Intrinsics.g(this.a, ((t5f) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "don__panel__view";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("PanelViewEvent(sportId=", this.a, ")");
    }
}
