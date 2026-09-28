package defpackage;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q7d0 implements pdd0 {
    public final String a;

    public q7d0(String str) {
        this.a = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        HashMap<String, Object> map = new HashMap<>();
        String str = this.a;
        if (str != null) {
            map.put("source", str);
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7d0) && Intrinsics.g(this.a, ((q7d0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "sportypicks_hub__view";
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return tug.a("HubViewEvent(source=", this.a, ")");
    }
}
