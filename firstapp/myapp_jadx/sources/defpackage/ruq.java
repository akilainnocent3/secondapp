package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ruq {
    public final cuq a;
    public final boolean b;

    public ruq(cuq cuqVar, boolean z) {
        cuqVar.getClass();
        this.a = cuqVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ruq)) {
            return false;
        }
        ruq ruqVar = (ruq) obj;
        return Intrinsics.g(this.a, ruqVar.a) && this.b == ruqVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LNMissionTabState(content=" + this.a + ", isRefreshing=" + this.b + ")";
    }

    public ruq() {
        this(0);
    }

    public /* synthetic */ ruq(int i) {
        this(cuq.c.a, false);
    }
}
