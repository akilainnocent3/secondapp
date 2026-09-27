package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q80 f151773a;

    public kz0(q80 q80Var) {
        this.f151773a = q80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, boolean z10, or.f fVar) {
        jz0 jz0Var;
        if (fVar instanceof jz0) {
            jz0Var = (jz0) fVar;
            int i10 = jz0Var.f151322e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jz0Var.f151322e = i10 - Integer.MIN_VALUE;
            } else {
                jz0Var = new jz0(this, fVar);
            }
        } else {
            jz0Var = new jz0(this, fVar);
        }
        Object objH = jz0Var.f151320c;
        Object objL = qr.d.l();
        int i11 = jz0Var.f151322e;
        if (i11 == 0) {
            dr.j1.n(objH);
            q80 q80Var = this.f151773a;
            jz0Var.f151319b = str;
            jz0Var.f151322e = 1;
            objH = jv.i.h(q80Var.f154346d, new p80(q80Var, z10, null), jz0Var);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = jz0Var.f151319b;
            dr.j1.n(objH);
        }
        for (Object obj : ((u50) objH).f156281d.f148074a) {
            if (kotlin.jvm.internal.m0.g(((b50) obj).f147064a, str)) {
                return obj;
            }
        }
        return null;
    }
}
