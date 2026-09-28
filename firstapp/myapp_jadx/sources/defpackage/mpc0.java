package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mpc0 implements pdd0 {
    public final String a = "legends__place_bet__click";

    public mpc0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mpc0) && Intrinsics.g(this.a, ((mpc0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("PlaceBetClickTrackingEvent(name=", this.a, ")");
    }
}
