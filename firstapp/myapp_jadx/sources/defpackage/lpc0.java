package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lpc0 implements pdd0 {
    public final String a = "legends__next_round__click";

    public lpc0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lpc0) && Intrinsics.g(this.a, ((lpc0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("NextRoundClickTrackingEvent(name=", this.a, ")");
    }
}
