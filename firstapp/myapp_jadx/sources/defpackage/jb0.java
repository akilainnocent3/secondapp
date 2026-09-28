package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jb0 implements jx80, yef, pln {
    public rtw<a, xef> c;
    public rtw<a, oln> d;
    public a e;

    public static final class a {
        public qx80 a;
        public long b;
        public asr c;
        public float d;
        public hx80 e;

        public a(qx80 qx80Var, long j, asr asrVar, float f, hx80 hx80Var) {
            this.a = qx80Var;
            this.b = j;
            this.c = asrVar;
            this.d = f;
            this.e = hx80Var;
        }

        public static a a(a aVar) {
            return new a(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && yw90.a(this.b, aVar.b) && this.c == aVar.c && Float.compare(this.d, aVar.d) == 0 && Intrinsics.g(this.e, aVar.e);
        }

        public final int hashCode() {
            int iA = tvh.a(this.d, (this.c.hashCode() + f87.a(this.a.hashCode() * 31, this.b, 31)) * 31, 31);
            hx80 hx80Var = this.e;
            return iA + (hx80Var == null ? 0 : hx80Var.hashCode());
        }

        public final String toString() {
            return "ShadowKey(shape=" + this.a + ", size=" + ((Object) yw90.f(this.b)) + ", layoutDirection=" + this.c + ", density=" + this.d + ", shadow=" + this.e + ')';
        }
    }

    @Override // defpackage.pln
    public final oln a(qx80 qx80Var, long j, asr asrVar, tcf tcfVar, hx80 hx80Var) {
        oln olnVarD;
        synchronized (this) {
            a aVar = this.e;
            if (aVar == null) {
                a aVar2 = new a(zk40.a, 0L, asr.a, 1.0f, null);
                this.e = aVar2;
                aVar = aVar2;
            }
            aVar.a = qx80Var;
            aVar.b = j;
            aVar.c = asrVar;
            aVar.d = tcfVar.getDensity();
            aVar.e = hx80Var;
            rtw<a, oln> rtwVar = this.d;
            if (rtwVar == null) {
                rtwVar = new rtw<>((Object) null);
                this.d = rtwVar;
            }
            olnVarD = rtwVar.d(aVar);
            if (olnVarD == null) {
                olnVarD = new oln(hx80Var, qx80Var.a(j, asrVar, tcfVar));
                rtw<a, oln> rtwVar2 = this.d;
                if (rtwVar2 == null) {
                    rtwVar2 = new rtw<>((Object) null);
                    this.d = rtwVar2;
                }
                rtwVar2.m(a.a(aVar), olnVarD);
            }
        }
        return olnVarD;
    }

    @Override // defpackage.jx80
    public final nln b(qx80 qx80Var, hx80 hx80Var) {
        return new nln(qx80Var, hx80Var, this);
    }

    @Override // defpackage.jx80
    public final wef c(qx80 qx80Var, hx80 hx80Var) {
        return new wef(qx80Var, hx80Var, this);
    }

    @Override // defpackage.yef
    public final xef d(qx80 qx80Var, long j, asr asrVar, tcf tcfVar, hx80 hx80Var) {
        xef xefVarD;
        synchronized (this) {
            a aVar = this.e;
            if (aVar == null) {
                a aVar2 = new a(zk40.a, 0L, asr.a, 1.0f, null);
                this.e = aVar2;
                aVar = aVar2;
            }
            aVar.a = qx80Var;
            aVar.b = j;
            aVar.c = asrVar;
            aVar.d = tcfVar.getDensity();
            aVar.e = new hx80(hx80Var.a, hx80Var.b, 0L, hx80Var.e, hx80Var.f, hx80Var.d);
            rtw<a, xef> rtwVar = this.c;
            if (rtwVar == null) {
                rtwVar = new rtw<>((Object) null);
                this.c = rtwVar;
            }
            xefVarD = rtwVar.d(aVar);
            if (xefVarD == null) {
                xefVarD = new xef(hx80Var, qx80Var.a(j, asrVar, tcfVar));
                rtw<a, xef> rtwVar2 = this.c;
                if (rtwVar2 == null) {
                    rtwVar2 = new rtw<>((Object) null);
                    this.c = rtwVar2;
                }
                rtwVar2.m(a.a(aVar), xefVarD);
            }
        }
        return xefVarD;
    }
}
