package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fj90 implements pdd0 {
    public final String a = "sim__simulation_speed_1x__click";

    public fj90(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fj90) && Intrinsics.g(this.a, ((fj90) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SimSimulationSpeed1XClickEvent(name=", this.a, ")");
    }
}
