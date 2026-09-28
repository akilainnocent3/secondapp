package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l8e0 {
    public final Map<pnh0, k8e0> a;
    public final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public l8e0(Map<pnh0, ? extends k8e0> map, int i) {
        map.getClass();
        this.a = map;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8e0)) {
            return false;
        }
        l8e0 l8e0Var = (l8e0) obj;
        return Intrinsics.g(this.a, l8e0Var.a) && this.b == l8e0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb.append(this.a);
        sb.append(", maxSupportedFrameRate=");
        return rr1.b(sb, this.b, ')');
    }
}
