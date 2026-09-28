package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zki {
    public final bli a;
    public final bli b;
    public final float c;
    public final qcn<ali> d;

    /* JADX WARN: Multi-variable type inference failed */
    public zki(bli bliVar, bli bliVar2, float f, qcn<? extends ali> qcnVar) {
        qcnVar.getClass();
        this.a = bliVar;
        this.b = bliVar2;
        this.c = f;
        this.d = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zki)) {
            return false;
        }
        zki zkiVar = (zki) obj;
        return this.a.equals(zkiVar.a) && this.b.equals(zkiVar.b) && Float.compare(this.c, zkiVar.c) == 0 && Intrinsics.g(this.d, zkiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + tvh.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "FootballLottieSimulationState(homeTeamState=" + this.a + ", awayTeamState=" + this.b + ", attackSpeed=" + this.c + ", steps=" + this.d + ")";
    }
}
