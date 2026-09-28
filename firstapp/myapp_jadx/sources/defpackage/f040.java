package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class f040 extends y52 {
    public frz<uyc, uyc> b;
    public uyc c;

    @Override // defpackage.y52
    public final void a() {
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.y52
    public final l980 b(uyc uycVar) {
        boolean zA;
        uyc uycVar2 = this.c;
        if (uycVar2 != null) {
            zA = uycVar.equals(uycVar2);
        } else {
            frz<uyc, uyc> frzVar = this.b;
            zA = frzVar != null ? n94.a(uycVar, frzVar.a, frzVar.b) : false;
        }
        if (zA) {
            frz<uyc, uyc> frzVar2 = this.b;
            if (frzVar2 == null) {
                return l980.a;
            }
            if (frzVar2.a.equals(uycVar)) {
                return l980.b;
            }
            if (this.b.b.equals(uycVar)) {
                return l980.c;
            }
            frz<uyc, uyc> frzVar3 = this.b;
            if (n94.a(uycVar, frzVar3.a, frzVar3.b)) {
                return l980.d;
            }
        }
        return l980.e;
    }

    @Override // defpackage.y52
    public final boolean c(uyc uycVar) {
        uyc uycVar2 = this.c;
        if (uycVar2 != null) {
            return uycVar.equals(uycVar2);
        }
        frz<uyc, uyc> frzVar = this.b;
        if (frzVar != null) {
            return n94.a(uycVar, frzVar.a, frzVar.b);
        }
        return false;
    }

    @Override // defpackage.y52
    public final void d(uyc uycVar) {
        uyc uycVar2 = this.c;
        if (uycVar2 == null) {
            this.c = uycVar;
            this.b = null;
            this.a.I();
        } else {
            if (uycVar2 == uycVar) {
                this.a.I();
                return;
            }
            boolean zBefore = uycVar2.a.getTime().before(uycVar.a.getTime());
            uyc uycVar3 = this.c;
            if (zBefore) {
                this.b = new frz<>(uycVar3, uycVar);
            } else {
                this.b = new frz<>(uycVar, uycVar3);
            }
            this.c = null;
            this.a.I();
        }
    }
}
