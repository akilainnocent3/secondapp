package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class mek0 extends nek0 {
    public final int a;
    public final long b;

    public mek0(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.nek0
    public final int a() {
        return this.a;
    }

    @Override // defpackage.nek0
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nek0)) {
            return false;
        }
        nek0 nek0Var = (nek0) obj;
        return this.a == nek0Var.a() && this.b == nek0Var.b();
    }

    public final int hashCode() {
        long j = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.a);
        sb.append(", eventTimestamp=");
        return nrz.a(this.b, "}", sb);
    }
}
