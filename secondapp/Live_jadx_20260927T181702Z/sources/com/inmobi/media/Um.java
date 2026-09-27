package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Um implements nv.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv.j f55645a;

    public Um(nv.j jVar) {
        this.f55645a = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nv.j
    public final Object emit(Object obj, or.f fVar) {
        Tm tm2;
        if (fVar instanceof Tm) {
            tm2 = (Tm) fVar;
            int i10 = tm2.f55574b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tm2.f55574b = i10 - Integer.MIN_VALUE;
            } else {
                tm2 = new Tm(this, fVar);
            }
        } else {
            tm2 = new Tm(this, fVar);
        }
        Object obj2 = tm2.f55573a;
        Object objL = qr.d.l();
        int i11 = tm2.f55574b;
        if (i11 == 0) {
            dr.j1.n(obj2);
            nv.j jVar = this.f55645a;
            Boolean boolA = rr.b.a(((Mn) obj) == Mn.VISIBLE);
            tm2.f55574b = 1;
            if (jVar.emit(boolA, tm2) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dr.j1.n(obj2);
        }
        return dr.w2.f79517a;
    }
}
