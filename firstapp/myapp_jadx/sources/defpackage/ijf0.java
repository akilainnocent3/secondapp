package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ijf0 {
    public static final uv60 d = new uv60(new dm2(1), new hjf0());
    public final nk0 a;
    public final long b;
    public final ulf0 c;

    public ijf0(nk0 nk0Var, long j, ulf0 ulf0Var) {
        ulf0 ulf0Var2;
        this.a = nk0Var;
        this.b = vlf0.b(nk0Var.b.length(), j);
        if (ulf0Var != null) {
            ulf0Var2 = new ulf0(vlf0.b(nk0Var.b.length(), ulf0Var.a));
        } else {
            ulf0Var2 = null;
        }
        this.c = ulf0Var2;
    }

    public static ijf0 a(ijf0 ijf0Var, nk0 nk0Var, long j, int i) {
        if ((i & 1) != 0) {
            nk0Var = ijf0Var.a;
        }
        if ((i & 2) != 0) {
            j = ijf0Var.b;
        }
        ulf0 ulf0Var = (i & 4) != 0 ? ijf0Var.c : null;
        ijf0Var.getClass();
        return new ijf0(nk0Var, j, ulf0Var);
    }

    public static ijf0 b(ijf0 ijf0Var, String str, long j, int i) {
        if ((i & 2) != 0) {
            j = ijf0Var.b;
        }
        ulf0 ulf0Var = ijf0Var.c;
        ijf0Var.getClass();
        return new ijf0(new nk0(str), j, ulf0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijf0)) {
            return false;
        }
        ijf0 ijf0Var = (ijf0) obj;
        return ulf0.b(this.b, ijf0Var.b) && Intrinsics.g(this.c, ijf0Var.c) && Intrinsics.g(this.a, ijf0Var.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = ulf0.c;
        int iA = f87.a(iHashCode, this.b, 31);
        ulf0 ulf0Var = this.c;
        return iA + (ulf0Var != null ? Long.hashCode(ulf0Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) ulf0.h(this.b)) + ", composition=" + this.c + ')';
    }

    public ijf0(String str, long j, int i) {
        this(new nk0((i & 1) != 0 ? "" : str), (i & 2) != 0 ? ulf0.b : j, (ulf0) null);
    }
}
