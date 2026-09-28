package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ipc0 implements pdd0 {
    public final String a = "legends__match_confirm__click";

    public ipc0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipc0) && Intrinsics.g(this.a, ((ipc0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("ConfirmClickTrackingEvent(name=", this.a, ")");
    }
}
