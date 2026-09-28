package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fki implements ali {
    public final qcn<String> a;

    public fki(qcn<String> qcnVar) {
        qcnVar.getClass();
        this.a = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fki) && Intrinsics.g(this.a, ((fki) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vf5.a(this.a, "FootballLottieSimulationKickOffStep(lottieAssetNames=", ")");
    }
}
