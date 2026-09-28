package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class hte extends j9p {
    public final wse e;

    public hte(wse wseVar) {
        this.e = wseVar;
    }

    @Override // defpackage.j9p
    public final boolean k() {
        return false;
    }

    @Override // defpackage.j9p
    public final void l(Throwable th) {
        this.e.dispose();
    }
}
