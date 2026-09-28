package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class bd00 {
    public final m3y a;
    public final m3y b;

    public bd00(m3y m3yVar, m3y m3yVar2) {
        this.a = m3yVar;
        this.b = m3yVar2;
    }

    public static bd00 a(bd00 bd00Var, m3y m3yVar, m3y m3yVar2, int i) {
        if ((i & 1) != 0) {
            m3yVar = bd00Var.a;
        }
        if ((i & 2) != 0) {
            m3yVar2 = bd00Var.b;
        }
        bd00Var.getClass();
        m3yVar.getClass();
        return new bd00(m3yVar, m3yVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd00)) {
            return false;
        }
        bd00 bd00Var = (bd00) obj;
        return this.a == bd00Var.a && this.b == bd00Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        m3y m3yVar = this.b;
        return iHashCode + (m3yVar == null ? 0 : m3yVar.hashCode());
    }

    public final String toString() {
        return "PendingRequestState(pushStatus=" + this.a + ", inAppStatus=" + this.b + ")";
    }

    public bd00() {
        this(0);
    }

    public /* synthetic */ bd00(int i) {
        this(m3y.c, null);
    }
}
