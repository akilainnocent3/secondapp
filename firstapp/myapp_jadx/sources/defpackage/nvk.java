package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nvk {
    public static final nvk c = new nvk(n1a0.c, false);
    public final boolean a;
    public final qcn<dok> b;

    public nvk(qcn qcnVar, boolean z) {
        qcnVar.getClass();
        this.a = z;
        this.b = qcnVar;
    }

    public static nvk a(nvk nvkVar, qcn qcnVar, int i) {
        boolean z = (i & 1) != 0 ? nvkVar.a : false;
        if ((i & 2) != 0) {
            qcnVar = nvkVar.b;
        }
        nvkVar.getClass();
        qcnVar.getClass();
        return new nvk(qcnVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvk)) {
            return false;
        }
        nvk nvkVar = (nvk) obj;
        return this.a == nvkVar.a && Intrinsics.g(this.b, nvkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "GiftSelectorUiState(isVisible=" + this.a + ", applicableGiftList=" + this.b + ")";
    }
}
