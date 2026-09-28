package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q9u {
    public final List<p9u> a;
    public final float b;

    public q9u(List<p9u> list, float f) {
        list.getClass();
        this.a = list;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9u)) {
            return false;
        }
        q9u q9uVar = (q9u) obj;
        return Intrinsics.g(this.a, q9uVar.a) && Float.compare(this.b, q9uVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LuckyWheelPrizeState(prizeList=" + this.a + ", degree=" + this.b + ")";
    }
}
