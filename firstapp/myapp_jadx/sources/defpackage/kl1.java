package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class kl1 extends qzf0 {
    public final String a;
    public final long b;
    public final qzf0.a c;

    public kl1(String str, long j, qzf0.a aVar) {
        this.a = str;
        this.b = j;
        this.c = aVar;
    }

    @Override // defpackage.qzf0
    public final qzf0.a a() {
        return this.c;
    }

    @Override // defpackage.qzf0
    public final String b() {
        return this.a;
    }

    @Override // defpackage.qzf0
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qzf0)) {
            return false;
        }
        qzf0 qzf0Var = (qzf0) obj;
        String str = this.a;
        if (str == null) {
            if (qzf0Var.b() != null) {
                return false;
            }
        } else if (!str.equals(qzf0Var.b())) {
            return false;
        }
        if (this.b != qzf0Var.c()) {
            return false;
        }
        qzf0.a aVar = this.c;
        if (aVar == null) {
            return qzf0Var.a() == null;
        }
        return aVar.equals(qzf0Var.a());
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        qzf0.a aVar = this.c;
        return i ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}
