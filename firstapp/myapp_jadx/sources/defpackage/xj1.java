package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xj1 extends je00 {
    public final long a;
    public final oug0 b;
    public final lpg c;

    public xj1(long j, oug0 oug0Var, lpg lpgVar) {
        this.a = j;
        if (oug0Var == null) {
            bmy.a("Null transportContext");
            throw null;
        }
        this.b = oug0Var;
        if (lpgVar != null) {
            this.c = lpgVar;
        } else {
            bmy.a("Null event");
            throw null;
        }
    }

    @Override // defpackage.je00
    public final lpg a() {
        return this.c;
    }

    @Override // defpackage.je00
    public final long b() {
        return this.a;
    }

    @Override // defpackage.je00
    public final oug0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof je00)) {
            return false;
        }
        je00 je00Var = (je00) obj;
        return this.a == je00Var.b() && this.b.equals(je00Var.c()) && this.c.equals(je00Var.a());
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
