package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Nd implements nv.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv.j f55222a;

    public Nd(nv.j jVar) {
        this.f55222a = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nv.j
    public final Object emit(Object obj, or.f fVar) {
        Md md2;
        if (fVar instanceof Md) {
            md2 = (Md) fVar;
            int i10 = md2.f55144b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                md2.f55144b = i10 - Integer.MIN_VALUE;
            } else {
                md2 = new Md(this, fVar);
            }
        } else {
            md2 = new Md(this, fVar);
        }
        Object obj2 = md2.f55143a;
        Object objL = qr.d.l();
        int i11 = md2.f55144b;
        if (i11 == 0) {
            dr.j1.n(obj2);
            nv.j jVar = this.f55222a;
            if (((Rl) obj) instanceof Pl) {
                md2.f55144b = 1;
                if (jVar.emit(obj, md2) == objL) {
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
