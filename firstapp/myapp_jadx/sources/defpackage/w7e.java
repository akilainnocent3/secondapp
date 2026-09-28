package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w7e {
    public final List<String> a;
    public final String b;

    public w7e(List<String> list, String str) {
        list.getClass();
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7e)) {
            return false;
        }
        w7e w7eVar = (w7e) obj;
        return Intrinsics.g(this.a, w7eVar.a) && Intrinsics.g(this.b, w7eVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "DepositTopUpTrackingParams(shownAlerts=" + this.a + ", content=" + this.b + ")";
    }

    public w7e(List list, int i) {
        this((List<String>) ((i & 1) != 0 ? m2g.a : list), (String) null);
    }
}
