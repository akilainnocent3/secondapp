package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class z7r {
    public final a8r a;

    public z7r(a8r a8rVar) {
        a8rVar.getClass();
        this.a = a8rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7r) && this.a == ((z7r) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LNRewardCenterState(selectedTab=" + this.a + ")";
    }

    public z7r() {
        this(0);
    }

    public /* synthetic */ z7r(int i) {
        this(a8r.Gift);
    }
}
