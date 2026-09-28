package androidx.compose.foundation.text.modifiers;

import android.os.Trace;
import androidx.compose.foundation.text.modifiers.b;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import defpackage.a880;
import defpackage.biv;
import defpackage.c6;
import defpackage.cff0;
import defpackage.dfb;
import defpackage.f8i;
import defpackage.ffb;
import defpackage.fkw;
import defpackage.gfb;
import defpackage.hb80;
import defpackage.if1;
import defpackage.imf0;
import defpackage.jdf0;
import defpackage.ji10;
import defpackage.kt;
import defpackage.kxa;
import defpackage.lb80;
import defpackage.lk40;
import defpackage.mmd;
import defpackage.mt;
import defpackage.mtg0;
import defpackage.mzo;
import defpackage.nk0;
import defpackage.ob80;
import defpackage.ohp;
import defpackage.pb80;
import defpackage.pkd;
import defpackage.psr;
import defpackage.qcf;
import defpackage.ra80;
import defpackage.rcf;
import defpackage.syd0;
import defpackage.ukf0;
import defpackage.vhv;
import defpackage.xkt;
import defpackage.ya80;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d.c implements psr, qcf, ya80 {
    public nk0 D;
    public imf0 E;
    public f8i.a F;
    public Function1<? super ukf0, Unit> G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public List<nk0.d<ji10>> L;
    public Function1<? super List<lk40>, Unit> M;
    public a880 N;
    public if1 O;
    public Function1<? super a, Unit> P;
    public Map<kt, Integer> Q;
    public fkw R;
    public jdf0 S;
    public a T;

    public static final class a {
        public final nk0 a;
        public nk0 b;
        public boolean c = false;
        public fkw d = null;

        public a(nk0 nk0Var, nk0 nk0Var2) {
            this.a = nk0Var;
            this.b = nk0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c && Intrinsics.g(this.d, aVar.d);
        }

        public final int hashCode() {
            int iA = mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            fkw fkwVar = this.d;
            return iA + (fkwVar == null ? 0 : fkwVar.hashCode());
        }

        public final String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
        }
    }

    public b(nk0 nk0Var, imf0 imf0Var, f8i.a aVar, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, a880 a880Var, if1 if1Var, Function1 function3) {
        this.D = nk0Var;
        this.E = imf0Var;
        this.F = aVar;
        this.G = function1;
        this.H = i;
        this.I = z;
        this.J = i2;
        this.K = i3;
        this.L = list;
        this.M = function2;
        this.N = a880Var;
        this.O = if1Var;
        this.P = function3;
    }

    /* JADX WARN: Failed to calculate best type for var: r4v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v16 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v16 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r4v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v17 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: long
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
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v16 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // defpackage.qcf
    public final void A(defpackage.wsr r23) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.b.A(wsr):void");
    }

    @Override // defpackage.psr
    public final int C(xkt xktVar, mzo mzoVar, int i) {
        return cff0.a(r2(xktVar).e(xktVar.getLayoutDirection()).b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [jdf0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.ya80
    public final void G0(pb80 pb80Var) {
        jdf0 jdf0Var = this.S;
        ?? r0 = jdf0Var;
        if (jdf0Var == null) {
            ?? r1 = new Function1() { // from class: jdf0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ukf0 ukf0Var;
                    List list = (List) obj;
                    b bVar = this.a;
                    ukf0 ukf0Var2 = bVar.q2().o;
                    if (ukf0Var2 != null) {
                        tkf0 tkf0Var = ukf0Var2.a;
                        ukf0Var = new ukf0(new tkf0(tkf0Var.a, imf0.f(bVar.E, j58.m, 0L, null, null, null, 0L, null, 0, 0L, 16777214), tkf0Var.c, tkf0Var.d, tkf0Var.e, tkf0Var.f, tkf0Var.g, tkf0Var.h, tkf0Var.i, tkf0Var.j), ukf0Var2.b, ukf0Var2.c);
                        list.add(ukf0Var);
                    } else {
                        ukf0Var = null;
                    }
                    return Boolean.valueOf(ukf0Var != null);
                }
            };
            this.S = r1;
            r0 = r1;
        }
        nk0 nk0Var = this.D;
        ohp<Object>[] ohpVarArr = lb80.a;
        pb80Var.b(hb80.A, kotlin.collections.a.c(nk0Var));
        a aVar = this.T;
        if (aVar != null) {
            nk0 nk0Var2 = aVar.b;
            ob80<nk0> ob80Var = hb80.B;
            ohp<Object>[] ohpVarArr2 = lb80.a;
            ohp<Object> ohpVar = ohpVarArr2[15];
            pb80Var.b(ob80Var, nk0Var2);
            boolean z = aVar.c;
            ob80<Boolean> ob80Var2 = hb80.C;
            ohp<Object> ohpVar2 = ohpVarArr2[16];
            pb80Var.b(ob80Var2, Boolean.valueOf(z));
        }
        pb80Var.b(ra80.k, new c6(null, new ffb(this, 1)));
        pb80Var.b(ra80.l, new c6(null, new gfb(this, 2)));
        pb80Var.b(ra80.m, new c6(null, new Function0() { // from class: kdf0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                b bVar = this.a;
                bVar.T = null;
                pkd.f(bVar).R();
                pkd.f(bVar).P();
                rcf.a(bVar);
                return Boolean.TRUE;
            }
        }));
        lb80.a(pb80Var, r0);
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            fkw fkwVarR2 = r2(tVar);
            boolean zC = fkwVarR2.c(j, tVar.getLayoutDirection());
            ukf0 ukf0Var = fkwVarR2.o;
            if (ukf0Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + fkwVarR2);
            }
            long j2 = ukf0Var.c;
            ukf0Var.b.a.a();
            if (zC) {
                pkd.d(this, 2).Y1();
                Function1<? super ukf0, Unit> function1 = this.G;
                if (function1 != null) {
                    function1.invoke(ukf0Var);
                }
                a880 a880Var = this.N;
                if (a880Var != null) {
                    ukf0 ukf0Var2 = a880Var.d.b;
                    if (ukf0Var2 != null && !Intrinsics.g(ukf0Var2.a.a, ukf0Var.a.a)) {
                        a880Var.b.c();
                    }
                    a880Var.d = syd0.a(a880Var.d, null, ukf0Var, 1);
                }
                Map<kt, Integer> linkedHashMap = this.Q;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>(2);
                }
                linkedHashMap.put(mt.a, Integer.valueOf(Math.round(ukf0Var.d)));
                linkedHashMap.put(mt.b, Integer.valueOf(Math.round(ukf0Var.e)));
                this.Q = linkedHashMap;
            }
            Function1<? super List<lk40>, Unit> function2 = this.M;
            if (function2 != null) {
                function2.invoke(ukf0Var.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            y yVarD0 = vhvVar.d0(kxa.a.b(i, i, i2, i2));
            Map<kt, Integer> map = this.Q;
            map.getClass();
            biv bivVarE1 = tVar.e1(i, i2, map, new dfb(yVarD0, 3));
            Trace.endSection();
            return bivVarE1;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    @Override // defpackage.psr
    public final int o(xkt xktVar, mzo mzoVar, int i) {
        return cff0.a(r2(xktVar).e(xktVar.getLayoutDirection()).c());
    }

    public final void p2(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            fkw fkwVarQ2 = q2();
            nk0 nk0Var = this.D;
            imf0 imf0Var = this.E;
            f8i.a aVar = this.F;
            int i = this.H;
            boolean z5 = this.I;
            int i2 = this.J;
            int i3 = this.K;
            List<nk0.d<ji10>> list = this.L;
            if1 if1Var = this.O;
            fkwVarQ2.a = nk0Var;
            fkwVarQ2.f(imf0Var);
            fkwVarQ2.b = aVar;
            fkwVarQ2.c = i;
            fkwVarQ2.d = z5;
            fkwVarQ2.e = i2;
            fkwVarQ2.f = i3;
            fkwVarQ2.g = list;
            fkwVarQ2.h = if1Var;
            fkwVarQ2.s = (fkwVarQ2.s << 2) | 2;
            fkwVarQ2.m = null;
            fkwVarQ2.o = null;
            fkwVarQ2.q = -1;
            fkwVarQ2.p = -1;
            fkwVarQ2.r = null;
        }
        if (this.C) {
            if (z2 || (z && this.S != null)) {
                pkd.f(this).R();
            }
            if (z2 || z3 || z4) {
                pkd.f(this).P();
                rcf.a(this);
            }
            if (z) {
                rcf.a(this);
            }
        }
    }

    public final fkw q2() {
        fkw fkwVar = this.R;
        if (fkwVar == null) {
            fkw fkwVar2 = new fkw(this.D, this.E, this.F, this.H, this.I, this.J, this.K, this.L, this.O);
            this.R = fkwVar2;
            fkwVar = fkwVar2;
        }
        fkwVar.getClass();
        return fkwVar;
    }

    public final fkw r2(mmd mmdVar) {
        fkw fkwVar;
        a aVar = this.T;
        if (aVar != null && aVar.c && (fkwVar = aVar.d) != null) {
            fkwVar.d(mmdVar);
            return fkwVar;
        }
        fkw fkwVarQ2 = q2();
        fkwVarQ2.d(mmdVar);
        return fkwVarQ2;
    }

    @Override // defpackage.psr
    public final int s(xkt xktVar, mzo mzoVar, int i) {
        return r2(xktVar).a(i, xktVar.getLayoutDirection());
    }

    public final boolean s2(Function1<? super ukf0, Unit> function1, Function1<? super List<lk40>, Unit> function2, a880 a880Var, Function1<? super a, Unit> function3) {
        boolean z;
        if (this.G != function1) {
            this.G = function1;
            z = true;
        } else {
            z = false;
        }
        if (this.M != function2) {
            this.M = function2;
            z = true;
        }
        if (!Intrinsics.g(this.N, a880Var)) {
            this.N = a880Var;
            z = true;
        }
        if (this.P == function3) {
            return z;
        }
        this.P = function3;
        return true;
    }

    public final boolean t2(imf0 imf0Var, List<nk0.d<ji10>> list, int i, int i2, boolean z, f8i.a aVar, int i3, if1 if1Var) {
        boolean z2 = !this.E.d(imf0Var);
        this.E = imf0Var;
        if (!Intrinsics.g(this.L, list)) {
            this.L = list;
            z2 = true;
        }
        if (this.K != i) {
            this.K = i;
            z2 = true;
        }
        if (this.J != i2) {
            this.J = i2;
            z2 = true;
        }
        if (this.I != z) {
            this.I = z;
            z2 = true;
        }
        if (!Intrinsics.g(this.F, aVar)) {
            this.F = aVar;
            z2 = true;
        }
        if (this.H != i3) {
            this.H = i3;
            z2 = true;
        }
        if (Intrinsics.g(this.O, if1Var)) {
            return z2;
        }
        this.O = if1Var;
        return true;
    }

    public final boolean u2(nk0 nk0Var) {
        boolean zG = Intrinsics.g(this.D.b, nk0Var.b);
        boolean z = (zG && Intrinsics.g(this.D.a, nk0Var.a)) ? false : true;
        if (z) {
            this.D = nk0Var;
        }
        if (!zG) {
            this.T = null;
        }
        return z;
    }

    @Override // defpackage.psr
    public final int w(xkt xktVar, mzo mzoVar, int i) {
        return r2(xktVar).a(i, xktVar.getLayoutDirection());
    }
}
