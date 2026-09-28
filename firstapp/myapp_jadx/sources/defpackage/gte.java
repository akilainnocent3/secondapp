package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class gte implements ob6 {
    public final wse a;

    public gte(wse wseVar) {
        this.a = wseVar;
    }

    @Override // defpackage.ob6
    public final void b(Throwable th) {
        this.a.dispose();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.a + ']';
    }
}
