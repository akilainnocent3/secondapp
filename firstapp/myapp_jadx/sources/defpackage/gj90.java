package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gj90 implements pdd0 {
    public final String a = "sim__simulation_speed_2x__click";

    public gj90(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gj90) && Intrinsics.g(this.a, ((gj90) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SimSimulationSpeed2XClickEvent(name=", this.a, ")");
    }
}
