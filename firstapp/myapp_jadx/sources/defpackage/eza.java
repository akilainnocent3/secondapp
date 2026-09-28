package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class eza {
    public final int a;
    public final long b;
    public final fza c;
    public final r9i0 d;

    public eza(int i, long j, fza fzaVar, r9i0 r9i0Var) {
        this.a = i;
        this.b = j;
        this.c = fzaVar;
        this.d = r9i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eza)) {
            return false;
        }
        eza ezaVar = (eza) obj;
        return this.a == ezaVar.a && this.b == ezaVar.b && this.c == ezaVar.c && Intrinsics.g(this.d, ezaVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + f87.a(Integer.hashCode(this.a) * 31, this.b, 31)) * 31;
        r9i0 r9i0Var = this.d;
        return iHashCode + (r9i0Var == null ? 0 : r9i0Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
