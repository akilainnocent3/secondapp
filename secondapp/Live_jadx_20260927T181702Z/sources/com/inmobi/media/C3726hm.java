package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.hm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3726hm implements nv.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv.j f56604a;

    public C3726hm(nv.j jVar) {
        this.f56604a = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nv.j
    public final Object emit(Object obj, or.f fVar) {
        C3701gm c3701gm;
        if (fVar instanceof C3701gm) {
            c3701gm = (C3701gm) fVar;
            int i10 = c3701gm.f56532b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3701gm.f56532b = i10 - Integer.MIN_VALUE;
            } else {
                c3701gm = new C3701gm(this, fVar);
            }
        } else {
            c3701gm = new C3701gm(this, fVar);
        }
        Object obj2 = c3701gm.f56531a;
        Object objL = qr.d.l();
        int i11 = c3701gm.f56532b;
        if (i11 == 0) {
            dr.j1.n(obj2);
            nv.j jVar = this.f56604a;
            Rl rl2 = (Rl) obj;
            if (kotlin.jvm.internal.m0.g(rl2, C3751in.f56675a) || (rl2 instanceof Pl)) {
                c3701gm.f56532b = 1;
                if (jVar.emit(obj, c3701gm) == objL) {
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
