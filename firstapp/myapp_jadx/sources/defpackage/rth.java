package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rth implements g8j0 {
    public final int a;
    public final int b;

    public rth(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.g8j0
    public final int a(mmd mmdVar) {
        return this.b;
    }

    @Override // defpackage.g8j0
    public final int b(mmd mmdVar, asr asrVar) {
        return 0;
    }

    @Override // defpackage.g8j0
    public final int c(mmd mmdVar) {
        return 0;
    }

    @Override // defpackage.g8j0
    public final int d(mmd mmdVar, asr asrVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rth)) {
            return false;
        }
        rth rthVar = (rth) obj;
        return this.a == rthVar.a && this.b == rthVar.b;
    }

    public final int hashCode() {
        return ((this.a * 31) + this.b) * 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append(this.a);
        sb.append(", top=");
        return zk1.a(this.b, ", right=0, bottom=0)", sb);
    }
}
