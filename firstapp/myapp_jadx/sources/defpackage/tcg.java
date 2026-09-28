package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tcg implements dbn {
    public final u7n a;
    public final nan b;
    public final Throwable c;

    public tcg(u7n u7nVar, nan nanVar, Throwable th) {
        this.a = u7nVar;
        this.b = nanVar;
        this.c = th;
    }

    @Override // defpackage.dbn
    public final nan a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcg)) {
            return false;
        }
        tcg tcgVar = (tcg) obj;
        return Intrinsics.g(this.a, tcgVar.a) && Intrinsics.g(this.b, tcgVar.b) && this.c.equals(tcgVar.c);
    }

    public final int hashCode() {
        u7n u7nVar = this.a;
        int iHashCode = u7nVar == null ? 0 : u7nVar.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // defpackage.dbn
    public final u7n t() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", throwable=");
        return vt5.b(sb, this.c, ')');
    }
}
