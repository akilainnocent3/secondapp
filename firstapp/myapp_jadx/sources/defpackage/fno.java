package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fno implements omo {
    public final y4f a;
    public final qcn<j5f> b;
    public final v4f c;

    static {
        int i = y4f.e;
    }

    public fno(y4f y4fVar, qcn<j5f> qcnVar, v4f v4fVar) {
        qcnVar.getClass();
        this.a = y4fVar;
        this.b = qcnVar;
        this.c = v4fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fno)) {
            return false;
        }
        fno fnoVar = (fno) obj;
        return this.a.equals(fnoVar.a) && Intrinsics.g(this.b, fnoVar.b) && this.c == fnoVar.c;
    }

    public final int hashCode() {
        int iA = shu.a(this.b, this.a.hashCode() * 31, 31);
        v4f v4fVar = this.c;
        return iA + (v4fVar == null ? 0 : v4fVar.hashCode());
    }

    public final String toString() {
        return "InstantWinTicketDetailDoubleOrNothingCellState(headerCardState=" + this.a + ", roundCardStates=" + this.b + ", guideBottomSheetState=" + this.c + ")";
    }
}
