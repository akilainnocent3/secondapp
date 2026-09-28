package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u2o {
    public final String a;
    public final qcn<v2o> b;

    public u2o(qcn qcnVar, String str) {
        qcnVar.getClass();
        this.a = str;
        this.b = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2o)) {
            return false;
        }
        u2o u2oVar = (u2o) obj;
        return this.a.equals(u2oVar.a) && Intrinsics.g(this.b, u2oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InstantRacingRacerCarouselState(backgroundUrl=" + this.a + ", racers=" + this.b + ")";
    }
}
