package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ebx {
    public final gax a;
    public final x6x b;
    public final v8x c;
    public final boolean d;

    public ebx(gax gaxVar, x6x x6xVar, v8x v8xVar, boolean z) {
        gaxVar.getClass();
        x6xVar.getClass();
        v8xVar.getClass();
        this.a = gaxVar;
        this.b = x6xVar;
        this.c = v8xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebx)) {
            return false;
        }
        ebx ebxVar = (ebx) obj;
        return Intrinsics.g(this.a, ebxVar.a) && Intrinsics.g(this.b, ebxVar.b) && Intrinsics.g(this.c, ebxVar.c) && this.d == ebxVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NNDState(loadingState=");
        sb.append(this.a);
        sb.append(", animationState=");
        sb.append(this.b);
        sb.append(", dialogState=");
        sb.append(this.c);
        sb.append(", showWinningConfetti=");
        return ruw.a(sb, this.d, ')');
    }

    public ebx() {
        this(0);
    }

    public /* synthetic */ ebx(int i) {
        this(new gax.b(0), x6x.b.a, v8x.d.a, false);
    }
}
