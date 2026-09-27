package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.wd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4090wd implements nv.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv.j f58008a;

    public C4090wd(nv.j jVar) {
        this.f58008a = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nv.j
    public final Object emit(Object obj, or.f fVar) {
        C4065vd c4065vd;
        if (fVar instanceof C4065vd) {
            c4065vd = (C4065vd) fVar;
            int i10 = c4065vd.f57926b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4065vd.f57926b = i10 - Integer.MIN_VALUE;
            } else {
                c4065vd = new C4065vd(this, fVar);
            }
        } else {
            c4065vd = new C4065vd(this, fVar);
        }
        Object obj2 = c4065vd.f57925a;
        Object objL = qr.d.l();
        int i11 = c4065vd.f57926b;
        if (i11 == 0) {
            dr.j1.n(obj2);
            nv.j jVar = this.f58008a;
            if (((AbstractC3562bc) obj) instanceof Rl) {
                c4065vd.f57926b = 1;
                if (jVar.emit(obj, c4065vd) == objL) {
                    return objL;
                }
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
