package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pma implements oma {
    public final lma a;

    public pma(lma lmaVar) {
        this.a = lmaVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pma) {
            return this.a.equals(((pma) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
