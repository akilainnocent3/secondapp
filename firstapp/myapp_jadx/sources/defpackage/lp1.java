package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lp1 implements k4h {
    public final nsz a;
    public final b b;
    public final boolean c;
    public final ugd d;
    public int e;
    public m4h f;
    public mp1 g;
    public long h;
    public pn7[] i;
    public long j;
    public pn7 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public class a implements p480 {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        @Override // defpackage.p480
        public final p480.a d(long j) {
            lp1 lp1Var = lp1.this;
            p480.a aVarB = lp1Var.i[0].b(j);
            int i = 1;
            while (true) {
                pn7[] pn7VarArr = lp1Var.i;
                if (i >= pn7VarArr.length) {
                    return aVarB;
                }
                p480.a aVarB2 = pn7VarArr[i].b(j);
                if (aVarB2.a.b < aVarB.a.b) {
                    aVarB = aVarB2;
                }
                i++;
            }
        }

        @Override // defpackage.p480
        public final boolean g() {
            return true;
        }

        @Override // defpackage.p480
        public final long k() {
            return this.a;
        }
    }

    public static class b {
        public int a;
        public int b;
        public int c;
    }

    public lp1(int i, ugd ugdVar) {
        this.d = ugdVar;
        this.c = (i & 1) == 0;
        this.a = new nsz(12);
        this.b = new b();
        this.f = new lvo();
        this.i = new pn7[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    /* JADX WARN: Failed to calculate best type for var: r2v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v22 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v22 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v22 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // defpackage.k4h
    public final int a(defpackage.l4h r26, defpackage.k620 r27) {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp1.a(l4h, k620):int");
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) {
        nsz nszVar = this.a;
        l4hVar.m(nszVar.a, 0, 12);
        nszVar.I(0);
        if (nszVar.l() == 1179011410) {
            nszVar.J(4);
            if (nszVar.l() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (pn7 pn7Var : this.i) {
            if (pn7Var.k == 0) {
                pn7Var.i = 0;
            } else {
                pn7Var.i = pn7Var.n[jrh0.e(pn7Var.m, j, true)];
            }
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        this.e = 0;
        if (this.c) {
            m4hVar = new see0(m4hVar, this.d);
        }
        this.f = m4hVar;
        this.j = -1L;
    }

    @Override // defpackage.k4h
    public final void release() {
    }
}
