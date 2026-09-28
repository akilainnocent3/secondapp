package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class bn50<T> extends j9p {
    public final m9p.a e;

    public bn50(m9p.a aVar) {
        this.e = aVar;
    }

    @Override // defpackage.j9p
    public final boolean k() {
        return false;
    }

    @Override // defpackage.j9p
    public final void l(Throwable th) {
        Object objK = j().K();
        boolean z = objK instanceof dn8;
        m9p.a aVar = this.e;
        if (z) {
            zi50.a aVar2 = zi50.b;
            aVar.resumeWith(uj50.a(((dn8) objK).a));
        } else {
            zi50.a aVar3 = zi50.b;
            aVar.resumeWith(p9p.a(objK));
        }
    }
}
