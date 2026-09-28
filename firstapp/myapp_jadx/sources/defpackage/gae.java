package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gae {
    public final fpa0<tsr> a = new fpa0<>(hae.a);

    public final void a(tsr tsrVar) {
        if (!tsrVar.e()) {
            wkn.c("DepthSortedSet.add called on an unattached node");
        }
        this.a.add(tsrVar);
    }

    public final boolean b(tsr tsrVar) {
        if (!tsrVar.e()) {
            wkn.c("DepthSortedSet.remove called on an unattached node");
        }
        return this.a.remove(tsrVar);
    }

    public final String toString() {
        return this.a.toString();
    }
}
