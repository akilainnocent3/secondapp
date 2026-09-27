package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.w7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4084w7 implements nv.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv.j f57996a;

    public C4084w7(nv.j jVar) {
        this.f57996a = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nv.j
    public final Object emit(Object obj, or.f fVar) {
        C4059v7 c4059v7;
        if (fVar instanceof C4059v7) {
            c4059v7 = (C4059v7) fVar;
            int i10 = c4059v7.f57897b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4059v7.f57897b = i10 - Integer.MIN_VALUE;
            } else {
                c4059v7 = new C4059v7(this, fVar);
            }
        } else {
            c4059v7 = new C4059v7(this, fVar);
        }
        Object obj2 = c4059v7.f57896a;
        Object objL = qr.d.l();
        int i11 = c4059v7.f57897b;
        if (i11 == 0) {
            dr.j1.n(obj2);
            nv.j jVar = this.f57996a;
            if (((Rl) obj) instanceof Pl) {
                c4059v7.f57897b = 1;
                if (jVar.emit(obj, c4059v7) == objL) {
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
