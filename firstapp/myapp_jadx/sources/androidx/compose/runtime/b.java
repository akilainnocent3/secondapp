package androidx.compose.runtime;

import android.os.Trace;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.f;
import androidx.recyclerview.widget.r;
import defpackage.a6a0;
import defpackage.atr;
import defpackage.dtw;
import defpackage.duw;
import defpackage.e8l;
import defpackage.etw;
import defpackage.f2z;
import defpackage.fch0;
import defpackage.fv0;
import defpackage.fz60;
import defpackage.gq40;
import defpackage.gz60;
import defpackage.hb00;
import defpackage.hce0;
import defpackage.hmp;
import defpackage.hz60;
import defpackage.ibh0;
import defpackage.j0p;
import defpackage.j1a0;
import defpackage.j350;
import defpackage.jna;
import defpackage.jnn;
import defpackage.k350;
import defpackage.ksw;
import defpackage.l00;
import defpackage.lka;
import defpackage.lm20;
import defpackage.lma;
import defpackage.lxo;
import defpackage.m2g;
import defpackage.me00;
import defpackage.mka;
import defpackage.mma;
import defpackage.mna;
import defpackage.msw;
import defpackage.n5a0;
import defpackage.nae;
import defpackage.ne00;
import defpackage.nka;
import defpackage.o47;
import defpackage.o48;
import defpackage.oae;
import defpackage.oj40;
import defpackage.oma;
import defpackage.oo50;
import defpackage.op8;
import defpackage.pma;
import defpackage.qwo;
import defpackage.qxy;
import defpackage.qyd0;
import defpackage.r1z;
import defpackage.rh6;
import defpackage.rla;
import defpackage.rma;
import defpackage.rtw;
import defpackage.s340;
import defpackage.stw;
import defpackage.t2b;
import defpackage.tlw;
import defpackage.tma;
import defpackage.tyd0;
import defpackage.uga;
import defpackage.uma;
import defpackage.utw;
import defpackage.uzg;
import defpackage.v9p;
import defpackage.w6w;
import defpackage.wla;
import defpackage.wn70;
import defpackage.x5a0;
import defpackage.xla;
import defpackage.xx0;
import defpackage.y6w;
import defpackage.y8h0;
import defpackage.yla;
import defpackage.yth;
import defpackage.ytw;
import defpackage.z6w;
import defpackage.zla;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes.dex */
public final class b implements androidx.compose.runtime.a {
    public int A;
    public int B;
    public boolean C;
    public final yla D;
    public final ArrayList E;
    public boolean F;
    public f G;
    public g H;
    public h I;
    public boolean J;
    public ne00 K;
    public o47 L;
    public final rla M;
    public l00 N;
    public yth O;
    public atr P;
    public final rma Q;
    public final CoroutineContext R;
    public boolean S;
    public long T;
    public pma U;
    public final fch0 a;
    public final mma b;
    public final g c;
    public final utw d;
    public final o47 e;
    public final o47 f;
    public final mna g;
    public final uma h;
    public hb00 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public ksw p;
    public boolean q;
    public boolean r;
    public msw<ne00> v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final lxo n = new lxo();
    public final ArrayList s = new ArrayList();
    public final lxo t = new lxo();
    public ne00 u = me00.i;
    public final lxo x = new lxo();
    public int z = -1;

    public static final class a implements oo50 {
        public final C0043b a;

        public a(C0043b c0043b) {
            this.a = c0043b;
        }

        @Override // defpackage.j350
        public final void c() {
        }

        @Override // defpackage.j350
        public final void e() {
            this.a.w();
        }

        @Override // defpackage.j350
        public final void f() {
            this.a.w();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.b$b, reason: collision with other inner class name */
    public final class C0043b extends mma {
        public final long a;
        public final boolean b;
        public final boolean c;
        public HashSet d;
        public final LinkedHashSet e = new LinkedHashSet();
        public final ytw f = new ParcelableSnapshotMutableState(me00.i, gq40.b);

        public C0043b(long j, boolean z, boolean z2, mna mnaVar) {
            this.a = j;
            this.b = z;
            this.c = z2;
        }

        @Override // defpackage.mma
        public final void a(t2b t2bVar, Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2) {
            b.this.b.a(t2bVar, function2);
        }

        @Override // defpackage.mma
        public final gz60<e> b(t2b t2bVar, atr atrVar, Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2) {
            return b.this.b.b(t2bVar, atrVar, function2);
        }

        @Override // defpackage.mma
        public final void c(z6w z6wVar) {
            b.this.b.c(z6wVar);
        }

        @Override // defpackage.mma
        public final void d() {
            b.this.A--;
        }

        @Override // defpackage.mma
        public final boolean e() {
            return b.this.b.e();
        }

        @Override // defpackage.mma
        public final boolean f() {
            return this.b;
        }

        @Override // defpackage.mma
        public final boolean g() {
            return this.c;
        }

        @Override // defpackage.mma
        public final long h() {
            return this.a;
        }

        @Override // defpackage.mma
        public final lma i() {
            return b.this.h;
        }

        @Override // defpackage.mma
        public final ne00 j() {
            return (ne00) ((x5a0) this.f).getValue();
        }

        @Override // defpackage.mma
        public final CoroutineContext k() {
            return b.this.b.k();
        }

        @Override // defpackage.mma
        public final void l(t2b t2bVar) {
            b bVar = b.this;
            mma mmaVar = bVar.b;
            mmaVar.l(bVar.h);
            mmaVar.l(t2bVar);
        }

        @Override // defpackage.mma
        public final void m(z6w z6wVar, y6w y6wVar, fv0<?> fv0Var) {
            b.this.b.m(z6wVar, y6wVar, fv0Var);
        }

        @Override // defpackage.mma
        public final y6w n(z6w z6wVar) {
            return b.this.b.n(z6wVar);
        }

        @Override // defpackage.mma
        public final gz60<e> o(t2b t2bVar, atr atrVar, gz60<e> gz60Var) {
            return b.this.b.o(t2bVar, atrVar, gz60Var);
        }

        @Override // defpackage.mma
        public final void p(Set<oma> set) {
            HashSet hashSet = this.d;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.d = hashSet;
            }
            hashSet.add(set);
        }

        @Override // defpackage.mma
        public final void q(b bVar) {
            this.e.add(bVar);
        }

        @Override // defpackage.mma
        public final void r(e eVar) {
            b.this.b.r(eVar);
        }

        @Override // defpackage.mma
        public final void s(uma umaVar) {
            b.this.b.s(umaVar);
        }

        @Override // defpackage.mma
        public final void t() {
            b.this.A++;
        }

        @Override // defpackage.mma
        public final void u(androidx.compose.runtime.a aVar) {
            HashSet<Set> hashSet = this.d;
            if (hashSet != null) {
                for (Set set : hashSet) {
                    aVar.getClass();
                    set.remove(((b) aVar).c);
                }
            }
            y8h0.a(this.e).remove(aVar);
        }

        @Override // defpackage.mma
        public final void v(uma umaVar) {
            b.this.b.v(umaVar);
        }

        public final void w() {
            LinkedHashSet<b> linkedHashSet = this.e;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            HashSet hashSet = this.d;
            if (hashSet != null) {
                for (b bVar : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(bVar.c);
                    }
                }
            }
            linkedHashSet.clear();
        }
    }

    public b(fch0 fch0Var, mma mmaVar, g gVar, utw utwVar, o47 o47Var, o47 o47Var2, mna mnaVar, uma umaVar) {
        this.a = fch0Var;
        this.b = mmaVar;
        this.c = gVar;
        this.d = utwVar;
        this.e = o47Var;
        this.f = o47Var2;
        this.g = mnaVar;
        this.h = umaVar;
        this.C = mmaVar.g() || mmaVar.e();
        this.D = new yla(this);
        this.E = new ArrayList();
        f fVarD = gVar.d();
        fVarD.c();
        this.G = fVarD;
        g gVar2 = new g();
        if (mmaVar.g()) {
            gVar2.c();
        }
        if (mmaVar.e()) {
            gVar2.z = new msw<>();
        }
        this.H = gVar2;
        h hVarE = gVar2.e();
        hVarE.e(true);
        this.I = hVarE;
        this.M = new rla(this, o47Var);
        f fVarD2 = this.H.d();
        try {
            l00 l00VarA = fVarD2.a(0);
            fVarD2.c();
            this.N = l00VarA;
            this.O = new yth();
            this.Q = new rma(this);
            CoroutineContext coroutineContextK = mmaVar.k();
            CoroutineContext coroutineContextI0 = i0();
            this.R = coroutineContextK.plus(coroutineContextI0 == null ? kotlin.coroutines.e.a : coroutineContextI0);
        } catch (Throwable th) {
            fVarD2.c();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public static final z6w u0(b bVar, int i) {
        ArrayList arrayList;
        int i2 = bVar.G.i(i);
        f fVar = bVar.G;
        Object objP = fVar.p(fVar.b, i);
        if (i2 != 126665345 || !(objP instanceof w6w)) {
            return null;
        }
        if (bVar.G.d(i)) {
            ArrayList arrayList2 = new ArrayList();
            v0(bVar, arrayList2, i);
            if (arrayList2.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = arrayList2;
            }
        } else {
            arrayList = null;
        }
        f fVar2 = bVar.G;
        Object objP2 = fVar2.p(fVar2.b, i);
        objP2.getClass();
        w6w w6wVar = (w6w) objP2;
        Object objH = bVar.G.h(i, 0);
        l00 l00VarA = bVar.G.a(i);
        int i3 = bVar.G.b[(i * 5) + 3] + i;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = bVar.s;
        int iE = c.e(i, arrayList4);
        if (iE < 0) {
            iE = -(iE + 1);
        }
        while (iE < arrayList4.size()) {
            j0p j0pVar = (j0p) arrayList4.get(iE);
            if (j0pVar.b >= i3) {
                break;
            }
            arrayList3.add(new Pair(j0pVar.a, j0pVar.c));
            iE++;
        }
        return new z6w(w6wVar, objH, bVar.h, bVar.c, l00VarA, arrayList3, bVar.T(i), arrayList);
    }

    public static final void v0(b bVar, ArrayList arrayList, int i) {
        int i2 = bVar.G.b[(i * 5) + 3] + i;
        int i3 = i + 1;
        while (i3 < i2) {
            if (bVar.G.j(i3)) {
                z6w z6wVarU0 = u0(bVar, i3);
                if (z6wVarU0 != null) {
                    arrayList.add(z6wVarU0);
                }
            } else if (bVar.G.d(i3)) {
                v0(bVar, arrayList, i3);
            }
            i3 += bVar.G.b[(i3 * 5) + 3];
        }
    }

    public static final int w0(b bVar, int i, int i2, boolean z, int i3) {
        f fVar = bVar.G;
        mma mmaVar = bVar.b;
        rla rlaVar = bVar.M;
        boolean zJ = fVar.j(i2);
        int[] iArr = fVar.b;
        if (zJ) {
            int i4 = fVar.i(i2);
            Object objP = fVar.p(iArr, i2);
            if (i4 == 126665345 && (objP instanceof w6w)) {
                z6w z6wVarU0 = u0(bVar, i2);
                if (z6wVarU0 != null) {
                    mmaVar.c(z6wVarU0);
                    rlaVar.e();
                    uma umaVar = bVar.h;
                    mma mmaVar2 = bVar.b;
                    f2z f2zVar = rlaVar.b.c;
                    f2zVar.Z(r1z.u.c);
                    f2z.b.c(f2zVar, umaVar, mmaVar2, z6wVarU0);
                }
                if (!z || i2 == i) {
                    return fVar.o(i2);
                }
                rlaVar.c();
                rlaVar.b();
                b bVar2 = rlaVar.a;
                int iO = bVar2.G.l(i2) ? 1 : bVar2.G.o(i2);
                if (iO > 0) {
                    rlaVar.f(i3, iO);
                }
                return 0;
            }
            if (i4 == 206 && Intrinsics.g(objP, c.e)) {
                Object objH = fVar.h(i2, 0);
                a aVar = objH instanceof a ? (a) objH : null;
                if (aVar != null) {
                    for (b bVar3 : aVar.a.e) {
                        g gVar = bVar3.c;
                        if (gVar.b > 0 && (gVar.a[1] & 67108864) != 0) {
                            uma umaVar2 = bVar3.h;
                            synchronized (umaVar2.d) {
                                umaVar2.G();
                                rtw<Object, Object> rtwVar = umaVar2.C;
                                umaVar2.C = fz60.b();
                                try {
                                    umaVar2.K.F0(rtwVar);
                                    Unit unit = Unit.a;
                                } catch (Throwable th) {
                                    umaVar2.C = rtwVar;
                                    throw th;
                                }
                            }
                            o47 o47Var = new o47();
                            bVar3.L = o47Var;
                            f fVarD = bVar3.c.d();
                            try {
                                bVar3.G = fVarD;
                                rla rlaVar2 = bVar3.M;
                                o47 o47Var2 = rlaVar2.b;
                                try {
                                    rlaVar2.b = o47Var;
                                    bVar3.t0(0);
                                    rla rlaVar3 = bVar3.M;
                                    rlaVar3.b();
                                    if (rlaVar3.c) {
                                        rlaVar3.b.c.Z(r1z.b0.c);
                                        if (rlaVar3.c) {
                                            rlaVar3.d(false);
                                            rlaVar3.d(false);
                                            rlaVar3.b.c.Z(r1z.j.c);
                                            rlaVar3.c = false;
                                        }
                                    }
                                    rlaVar2.b = o47Var2;
                                    fVarD.c();
                                } catch (Throwable th2) {
                                    rlaVar2.b = o47Var2;
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                fVarD.c();
                                throw th3;
                            }
                        }
                        mmaVar.s(bVar3.h);
                    }
                }
                return fVar.o(i2);
            }
            if (!fVar.l(i2)) {
                return fVar.o(i2);
            }
        } else if (fVar.d(i2)) {
            int i5 = iArr[(i2 * 5) + 3] + i2;
            int iW0 = 0;
            for (int i6 = i2 + 1; i6 < i5; i6 += iArr[(i6 * 5) + 3]) {
                boolean zL = fVar.l(i6);
                if (zL) {
                    rlaVar.c();
                    Object objN = fVar.n(i6);
                    rlaVar.c();
                    rlaVar.h.add(objN);
                }
                iW0 += w0(bVar, i, i6, zL || z, zL ? 0 : i3 + iW0);
                if (zL) {
                    rlaVar.c();
                    rlaVar.a();
                }
            }
            if (!fVar.l(i2)) {
                return iW0;
            }
        } else if (!fVar.l(i2)) {
            return fVar.o(i2);
        }
        return 1;
    }

    @Override // androidx.compose.runtime.a
    public final boolean A(Object obj) {
        if (l0() == obj) {
            return false;
        }
        I0(obj);
        return true;
    }

    public final void A0() {
        z0(null, -127, 0, null);
    }

    @Override // androidx.compose.runtime.a
    public final void B(Object obj) {
        if (!this.S && this.G.g() == 207 && !Intrinsics.g(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        z0(null, 207, 0, obj);
    }

    public final void B0(int i, qxy qxyVar) {
        z0(qxyVar, i, 0, null);
    }

    @Override // androidx.compose.runtime.a
    public final void C(int i, Object obj) {
        z0(obj, i, 0, null);
    }

    public final void C0(Object obj, boolean z) {
        if (z) {
            f fVar = this.G;
            if (fVar.k <= 0) {
                if ((fVar.b[(fVar.g * 5) + 1] & 1073741824) == 0) {
                    lm20.a("Expected a node group");
                }
                fVar.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            rla rlaVar = this.M;
            rlaVar.getClass();
            rlaVar.d(false);
            f2z f2zVar = rlaVar.b.c;
            f2zVar.Z(r1z.f0.c);
            f2z.b.a(f2zVar, 0, obj);
        }
        this.G.u();
    }

    @Override // androidx.compose.runtime.a
    public final void D() {
        z0(null, 125, 2, null);
        this.r = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void D0() {
        this.m = 0;
        this.G = this.c.d();
        z0(null, 100, 0, null);
        mma mmaVar = this.b;
        mmaVar.t();
        ne00 ne00VarJ = mmaVar.j();
        this.x.c(this.w ? 1 : 0);
        this.w = M(ne00VarJ);
        this.K = null;
        if (!this.q) {
            this.q = mmaVar.f();
        }
        boolean zG = this.C;
        if (!zG) {
            zG = mmaVar.g();
            this.C = zG;
        }
        if (zG) {
            qyd0 qyd0Var = tma.a;
            qyd0Var.getClass();
            ne00VarJ = ne00VarJ.C(qyd0Var, new tyd0(i0()));
        }
        this.u = ne00VarJ;
        Set<oma> set = (Set) jna.a(ne00VarJ, jnn.a);
        if (set != null) {
            set.add(z());
            mmaVar.p(set);
        }
        z0(null, Long.hashCode(mmaVar.h()), 0, null);
    }

    @Override // androidx.compose.runtime.a
    public final void E(oj40 oj40Var) {
        e eVar = oj40Var instanceof e ? (e) oj40Var : null;
        if (eVar != null) {
            eVar.b |= 1;
        }
    }

    public final boolean E0(e eVar, Object obj) {
        l00 l00Var = eVar.c;
        if (l00Var == null) {
            return false;
        }
        int iB = this.G.a.b(l00Var);
        if (!this.F || iB < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iE = c.e(iB, arrayList);
        if (iE < 0) {
            int i = -(iE + 1);
            if (!(obj instanceof nae)) {
                obj = null;
            }
            arrayList.add(i, new j0p(eVar, iB, obj));
            return true;
        }
        j0p j0pVar = (j0p) arrayList.get(iE);
        if (!(obj instanceof nae)) {
            j0pVar.c = null;
            return true;
        }
        Object obj2 = j0pVar.c;
        if (obj2 == null) {
            j0pVar.c = obj;
            return true;
        }
        if (obj2 instanceof stw) {
            ((stw) obj2).d(obj);
            return true;
        }
        stw<Object> stwVar = hz60.a;
        stw stwVar2 = new stw(2);
        stwVar2.k(obj2);
        stwVar2.k(obj);
        j0pVar.c = stwVar2;
        return true;
    }

    @Override // androidx.compose.runtime.a
    public final <T> void F(Function0<? extends T> function0) {
        if (!this.r) {
            c.b("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            c.b("createNode() can only be called when inserting");
        }
        lxo lxoVar = this.n;
        int i = lxoVar.a[lxoVar.b - 1];
        h hVar = this.I;
        l00 l00VarB = hVar.b(hVar.v);
        this.l++;
        yth ythVar = this.O;
        f2z f2zVar = ythVar.c;
        f2zVar.Z(r1z.o.c);
        f2z.b.a(f2zVar, 0, function0);
        f2zVar.e[f2zVar.f - f2zVar.c[f2zVar.d - 1].a] = i;
        f2z.b.a(f2zVar, 1, l00VarB);
        f2z f2zVar2 = ythVar.d;
        f2zVar2.Z(r1z.t.c);
        f2zVar2.e[f2zVar2.f - f2zVar2.c[f2zVar2.d - 1].a] = i;
        f2z.b.a(f2zVar2, 0, l00VarB);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[LOOP:1: B:17:0x0037->B:32:0x0083, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0086 A[EDGE_INSN: B:40:0x0086->B:33:0x0086 BREAK  A[LOOP:1: B:17:0x0037->B:32:0x0083], SYNTHETIC] */
    public final void F0(rtw<Object, Object> rtwVar) {
        ArrayList arrayList = this.s;
        for (int iJ = kotlin.collections.b.j(arrayList); -1 < iJ; iJ--) {
            j0p j0pVar = (j0p) arrayList.get(iJ);
            l00 l00Var = j0pVar.a.c;
            if (l00Var == null || !l00Var.a()) {
                arrayList.remove(iJ);
            } else {
                int i = j0pVar.b;
                int i2 = l00Var.a;
                if (i != i2) {
                    j0pVar.b = i2;
                }
            }
        }
        Object[] objArr = rtwVar.b;
        Object[] objArr2 = rtwVar.c;
        long[] jArr = rtwVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            e eVar = (e) obj;
                            l00 l00Var2 = eVar.c;
                            if (l00Var2 != null) {
                                int i7 = l00Var2.a;
                                if (obj2 == wn70.a) {
                                    obj2 = null;
                                }
                                arrayList.add(new j0p(eVar, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        o48.v(c.f, arrayList);
    }

    @Override // androidx.compose.runtime.a
    public final void G() {
        if (this.l != 0) {
            c.b("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        e eVarG0 = g0();
        if (eVarG0 != null) {
            int i = eVarG0.b;
            if ((i & 128) == 0) {
                eVarG0.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            y0();
        } else {
            p0();
        }
    }

    public final void G0(int i, int i2) {
        if (J0(i) != i2) {
            if (i < 0) {
                ksw kswVar = this.p;
                if (kswVar == null) {
                    kswVar = new ksw();
                    this.p = kswVar;
                }
                kswVar.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    @Override // androidx.compose.runtime.a
    public final void H() {
        X(false);
    }

    public final void H0(int i, int i2) {
        int iJ0 = J0(i);
        if (iJ0 != i2) {
            int i3 = i2 - iJ0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iJ1 = J0(i) + i3;
                G0(i, iJ1);
                for (int i4 = size; -1 < i4; i4--) {
                    hb00 hb00Var = (hb00) arrayList.get(i4);
                    if (hb00Var != null && hb00Var.a(i, iJ1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                f fVar = this.G;
                if (i < 0) {
                    i = fVar.i;
                } else if (fVar.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final void I0(Object obj) {
        if (this.S) {
            this.I.S(obj);
            return;
        }
        f fVar = this.G;
        boolean z = fVar.n;
        rla rlaVar = this.M;
        if (!z) {
            l00 l00VarA = fVar.a(fVar.i);
            f2z f2zVar = rlaVar.b.c;
            f2zVar.Z(r1z.b.c);
            f2z.b.b(f2zVar, 0, l00VarA, 1, obj);
            return;
        }
        int iC = (fVar.l - j1a0.c(fVar.b, fVar.i)) - 1;
        if (rlaVar.a.G.i - rlaVar.f >= 0) {
            rlaVar.d(true);
            f2z f2zVar2 = rlaVar.b.c;
            f2zVar2.Z(r1z.h0.c);
            f2z.b.a(f2zVar2, 0, obj);
            f2zVar2.e[f2zVar2.f - f2zVar2.c[f2zVar2.d - 1].a] = iC;
            return;
        }
        f fVar2 = this.G;
        l00 l00VarA2 = fVar2.a(fVar2.i);
        f2z f2zVar3 = rlaVar.b.c;
        f2zVar3.Z(r1z.e0.c);
        f2z.b.b(f2zVar3, 0, obj, 1, l00VarA2);
        f2zVar3.e[f2zVar3.f - f2zVar3.c[f2zVar3.d - 1].a] = iC;
    }

    @Override // androidx.compose.runtime.a
    public final C0043b J() {
        b bVar;
        B0(206, c.e);
        if (this.S) {
            h.x(this.I);
        }
        Object objL0 = l0();
        a aVar = objL0 instanceof a ? (a) objL0 : null;
        if (aVar == null) {
            bVar = this;
            aVar = new a(bVar.new C0043b(this.T, this.q, this.C, this.h.I));
            bVar.I0(aVar);
        } else {
            bVar = this;
        }
        C0043b c0043b = aVar.a;
        ((x5a0) c0043b.f).setValue(bVar.S());
        bVar.X(false);
        return c0043b;
    }

    public final int J0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        ksw kswVar = this.p;
        if (kswVar != null && kswVar.c(i) >= 0) {
            int iC = kswVar.c(i);
            if (iC >= 0) {
                return kswVar.c[iC];
            }
            ibh0.a(hce0.a(i, "Cannot find value for key "));
        }
        return 0;
    }

    @Override // androidx.compose.runtime.a
    public final void K() {
        X(false);
    }

    @Override // androidx.compose.runtime.a
    public final void L() {
        X(false);
    }

    @Override // androidx.compose.runtime.a
    public final boolean M(Object obj) {
        if (Intrinsics.g(l0(), obj)) {
            return false;
        }
        I0(obj);
        return true;
    }

    @Override // androidx.compose.runtime.a
    public final void N(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            z0(null, i, 0, null);
            return;
        }
        if (this.r) {
            c.b("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        f fVar = this.G;
        boolean z = this.S;
        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
        if (z) {
            fVar.k++;
            this.I.Q(i, c0042a, false, c0042a);
            d0(false, null);
            return;
        }
        if (fVar.g() == i && ((i3 = fVar.g) >= fVar.h || (fVar.b[(i3 * 5) + 1] & 536870912) == 0)) {
            fVar.u();
            d0(false, null);
            return;
        }
        if (fVar.k <= 0 && (i2 = fVar.g) != fVar.h) {
            int i4 = this.k;
            q0();
            this.M.f(i4, fVar.s());
            c.h(this.s, i2, fVar.g);
        }
        fVar.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            h hVarE = this.H.e();
            this.I = hVarE;
            hVarE.M();
            this.J = false;
            this.K = null;
        }
        h hVar = this.I;
        hVar.d();
        int i5 = hVar.t;
        hVar.Q(i, c0042a, false, c0042a);
        this.N = hVar.b(i5);
        d0(false, null);
    }

    @Override // androidx.compose.runtime.a
    public final <T> T O(d dVar) {
        return (T) jna.a(S(), dVar);
    }

    public final void P() {
        R();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        yth ythVar = this.O;
        ythVar.d.clear();
        ythVar.c.clear();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        f fVar = this.G;
        if (!fVar.f) {
            fVar.c();
        }
        if (this.I.w) {
            return;
        }
        e0();
    }

    public final boolean Q(char c) {
        Object objL0 = l0();
        if ((objL0 instanceof Character) && c == ((Character) objL0).charValue()) {
            return false;
        }
        I0(Character.valueOf(c));
        return true;
    }

    public final void R() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        rla rlaVar = this.M;
        rlaVar.c = false;
        rlaVar.d.b = 0;
        rlaVar.f = 0;
        rlaVar.e = true;
        rlaVar.g = 0;
        rlaVar.h.clear();
        rlaVar.i = -1;
        rlaVar.j = -1;
        rlaVar.k = -1;
        rlaVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final ne00 S() {
        ne00 ne00Var = this.K;
        return ne00Var != null ? ne00Var : T(this.G.i);
    }

    public final ne00 T(int i) {
        ne00 ne00VarB;
        boolean z = this.S;
        qxy qxyVar = c.c;
        if (z && this.J) {
            int iE = this.I.v;
            while (iE > 0) {
                h hVar = this.I;
                if (hVar.b[hVar.q(iE) * 5] == 202 && Intrinsics.g(this.I.r(iE), qxyVar)) {
                    Object objP = this.I.p(iE);
                    objP.getClass();
                    ne00 ne00Var = (ne00) objP;
                    this.K = ne00Var;
                    return ne00Var;
                }
                h hVar2 = this.I;
                iE = hVar2.E(hVar2.b, iE);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    f fVar = this.G;
                    if (Intrinsics.g(fVar.p(fVar.b, i), qxyVar)) {
                        msw<ne00> mswVar = this.v;
                        if (mswVar == null || (ne00VarB = mswVar.b(i)) == null) {
                            f fVar2 = this.G;
                            Object objB = fVar2.b(fVar2.b, i);
                            objB.getClass();
                            ne00VarB = (ne00) objB;
                        }
                        this.K = ne00VarB;
                        return ne00VarB;
                    }
                }
                i = this.G.q(i);
            }
        }
        ne00 ne00Var2 = this.u;
        this.K = ne00Var2;
        return ne00Var2;
    }

    public final List<mka> U() {
        RandomAccess randomAccess;
        if (!this.C) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList();
        h hVar = this.I;
        arrayList.addAll(lka.a(hVar, null, hVar.t, null));
        f fVar = this.G;
        if (fVar.f || fVar.c == 0) {
            randomAccess = m2g.a;
        } else {
            s340 s340Var = new s340(fVar);
            int iQ = fVar.i;
            Object objValueOf = Integer.valueOf(fVar.l - j1a0.c(fVar.b, iQ));
            while (iQ >= 0) {
                s340Var.d(fVar.a.h(iQ), objValueOf);
                objValueOf = fVar.a(iQ);
                iQ = fVar.q(iQ);
            }
            randomAccess = s340Var.a;
        }
        arrayList.addAll(randomAccess);
        arrayList.addAll(m0());
        return arrayList;
    }

    public final void V(rtw<Object, Object> rtwVar, Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2) {
        ArrayList arrayList = this.s;
        if (this.F) {
            c.b("Reentrant composition is not supported");
        }
        this.g.a();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(n5a0.g().g());
            this.v = null;
            F0(rtwVar);
            int i = 0;
            this.k = 0;
            this.F = true;
            try {
                D0();
                Object objL0 = l0();
                if (objL0 != function2 && function2 != null) {
                    I0(function2);
                }
                yla ylaVar = this.D;
                duw<oae> duwVarA = a6a0.a();
                try {
                    duwVarA.b(ylaVar);
                    qxy qxyVar = c.a;
                    if (function2 != null) {
                        B0(r.d.DEFAULT_DRAG_ANIMATION_DURATION, qxyVar);
                        uzg.a(this, function2);
                        X(false);
                    } else if (!this.w || objL0 == null || objL0.equals(androidx.compose.runtime.a.C0041a.a)) {
                        x0();
                    } else {
                        B0(r.d.DEFAULT_DRAG_ANIMATION_DURATION, qxyVar);
                        y8h0.d(2, objL0);
                        uzg.a(this, (Function2) objL0);
                        X(false);
                    }
                    duwVarA.k(duwVarA.c - 1);
                    b0();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        c.b("Check failed");
                    }
                    e0();
                    Unit unit = Unit.a;
                    Trace.endSection();
                } catch (Throwable th) {
                    duwVarA.k(duwVarA.c - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    nka.b(th2, new wla(this, i));
                    throw th2;
                } catch (Throwable th3) {
                    this.F = false;
                    arrayList.clear();
                    P();
                    if (!this.I.w) {
                        c.b("Check failed");
                    }
                    e0();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void W(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        W(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            rla rlaVar = this.M;
            rlaVar.c();
            rlaVar.h.add(objN);
        }
    }

    public final void Y() {
        X(false);
        e eVarG0 = g0();
        if (eVarG0 != null) {
            int i = eVarG0.b;
            if ((i & 1) != 0) {
                eVarG0.b = i | 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x007f A[LOOP:0: B:15:0x003e->B:27:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[EDGE_INSN: B:28:0x0082->B:29:0x0083 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x0082 A[SYNTHETIC] */
    public final e Z() {
        e eVar;
        l00 l00VarA;
        Function1 function1;
        ArrayList arrayList = this.E;
        final e eVar2 = !arrayList.isEmpty() ? (e) arrayList.remove(arrayList.size() - 1) : null;
        if (eVar2 != null) {
            eVar2.b &= -9;
            this.g.a();
            final int i = this.B;
            final dtw<Object> dtwVar = eVar2.f;
            if (dtwVar == null || (eVar2.b & 16) != 0) {
                function1 = null;
                break;
            }
            Object[] objArr = dtwVar.b;
            int[] iArr = dtwVar.c;
            long[] jArr = dtwVar.a;
            int length = jArr.length - 2;
            if (length < 0) {
                function1 = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                function1 = new Function1() { // from class: pj40
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        lma lmaVar;
                                        lma lmaVar2;
                                        int i6;
                                        lma lmaVar3 = (lma) obj2;
                                        e eVar3 = eVar2;
                                        int i7 = eVar3.e;
                                        int i8 = i;
                                        if (i7 == i8) {
                                            dtw<Object> dtwVar2 = eVar3.f;
                                            dtw dtwVar3 = dtwVar;
                                            if (Intrinsics.g(dtwVar3, dtwVar2) && (lmaVar3 instanceof uma)) {
                                                long[] jArr2 = dtwVar3.a;
                                                int length2 = jArr2.length - 2;
                                                if (length2 >= 0) {
                                                    int i9 = 0;
                                                    while (true) {
                                                        long j2 = jArr2[i9];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i10 = 8;
                                                            int i11 = 8 - ((~(i9 - length2)) >>> 31);
                                                            int i12 = 0;
                                                            while (i12 < i11) {
                                                                if ((255 & j2) < 128) {
                                                                    int i13 = (i9 << 3) + i12;
                                                                    Object obj3 = dtwVar3.b[i13];
                                                                    boolean z = dtwVar3.c[i13] != i8;
                                                                    if (z) {
                                                                        uma umaVar = (uma) lmaVar3;
                                                                        i6 = i10;
                                                                        rtw<Object, Object> rtwVar = umaVar.i;
                                                                        yn70.b(rtwVar, obj3, eVar3);
                                                                        lmaVar2 = lmaVar3;
                                                                        if (obj3 instanceof nae) {
                                                                            nae naeVar = (nae) obj3;
                                                                            if (!rtwVar.b(naeVar)) {
                                                                                yn70.c(umaVar.y, naeVar);
                                                                            }
                                                                            rtw<nae<?>, Object> rtwVar2 = eVar3.g;
                                                                            if (rtwVar2 != null) {
                                                                                rtwVar2.k((nae<?>) obj3);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        lmaVar2 = lmaVar3;
                                                                        i6 = i10;
                                                                    }
                                                                    if (z) {
                                                                        dtwVar3.g(i13);
                                                                    }
                                                                } else {
                                                                    lmaVar2 = lmaVar3;
                                                                    i6 = i10;
                                                                }
                                                                j2 >>= i6;
                                                                i12++;
                                                                i10 = i6;
                                                                lmaVar3 = lmaVar2;
                                                            }
                                                            lmaVar = lmaVar3;
                                                            if (i11 != i10) {
                                                                break;
                                                            }
                                                        } else {
                                                            lmaVar = lmaVar3;
                                                        }
                                                        if (i9 == length2) {
                                                            break;
                                                        }
                                                        i9++;
                                                        lmaVar3 = lmaVar;
                                                    }
                                                }
                                            }
                                        }
                                        return Unit.a;
                                    }
                                };
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    function1 = null;
                    break;
                }
                if (i2 == length) {
                    function1 = null;
                    break;
                }
                i2++;
            }
            rla rlaVar = this.M;
            if (function1 != null) {
                f2z f2zVar = rlaVar.b.c;
                f2zVar.Z(r1z.i.c);
                f2z.b.b(f2zVar, 0, function1, 1, this.h);
            }
            int i6 = eVar2.b;
            if ((i6 & 512) != 0) {
                eVar2.b = i6 & (-513);
                f2z f2zVar2 = rlaVar.b.c;
                f2zVar2.Z(r1z.l.c);
                f2z.b.a(f2zVar2, 0, eVar2);
                int i7 = eVar2.b;
                eVar2.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    eVar2.b = i7 & (-1153);
                    this.y = false;
                }
            }
        }
        if (eVar2 != null) {
            int i8 = eVar2.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (eVar2.c == null) {
                    if (this.S) {
                        h hVar = this.I;
                        l00VarA = hVar.b(hVar.v);
                    } else {
                        f fVar = this.G;
                        l00VarA = fVar.a(fVar.i);
                    }
                    eVar2.c = l00VarA;
                }
                eVar2.b &= -5;
                eVar = eVar2;
            } else {
                eVar = null;
            }
        } else {
            eVar = null;
        }
        X(false);
        return eVar;
    }

    @Override // androidx.compose.runtime.a
    public final <V, T> void a(V v, Function2<? super T, ? super V, Unit> function2) {
        if (this.S) {
            f2z f2zVar = this.O.c;
            f2zVar.Z(r1z.g0.c);
            f2z.b.a(f2zVar, 0, v);
            function2.getClass();
            y8h0.d(2, function2);
            f2z.b.a(f2zVar, 1, function2);
            return;
        }
        rla rlaVar = this.M;
        rlaVar.b();
        f2z f2zVar2 = rlaVar.b.c;
        f2zVar2.Z(r1z.g0.c);
        function2.getClass();
        y8h0.d(2, function2);
        f2z.b.b(f2zVar2, 0, v, 1, function2);
    }

    public final void a0() {
        if (this.F || this.z != 100) {
            lm20.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    @Override // androidx.compose.runtime.a
    public final boolean b(boolean z) {
        Object objL0 = l0();
        if ((objL0 instanceof Boolean) && z == ((Boolean) objL0).booleanValue()) {
            return false;
        }
        I0(Boolean.valueOf(z));
        return true;
    }

    public final void b0() {
        X(false);
        this.b.d();
        X(false);
        rla rlaVar = this.M;
        if (rlaVar.c) {
            rlaVar.d(false);
            rlaVar.d(false);
            rlaVar.b.c.Z(r1z.j.c);
            rlaVar.c = false;
        }
        rlaVar.b();
        if (rlaVar.d.b != 0) {
            c.b("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            c.b("Start/end imbalance");
        }
        R();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    @Override // androidx.compose.runtime.a
    public final boolean c(float f) {
        Object objL0 = l0();
        if ((objL0 instanceof Float) && f == ((Number) objL0).floatValue()) {
            return false;
        }
        I0(Float.valueOf(f));
        return true;
    }

    public final void c0(int i) {
        if (i < 0) {
            int i2 = -i;
            h hVar = this.I;
            while (true) {
                int i3 = hVar.v;
                if (i3 <= i2) {
                    return;
                } else {
                    X(hVar.w(i3));
                }
            }
        } else {
            if (this.S) {
                h hVar2 = this.I;
                while (this.S) {
                    X(hVar2.w(hVar2.v));
                }
            }
            f fVar = this.G;
            while (true) {
                int i4 = fVar.i;
                if (i4 <= i) {
                    return;
                } else {
                    X(fVar.l(i4));
                }
            }
        }
    }

    @Override // androidx.compose.runtime.a
    public final boolean d(int i) {
        Object objL0 = l0();
        if ((objL0 instanceof Integer) && i == ((Number) objL0).intValue()) {
            return false;
        }
        I0(Integer.valueOf(i));
        return true;
    }

    public final void d0(boolean z, hb00 hb00Var) {
        this.i.add(this.j);
        this.j = hb00Var;
        int i = this.l;
        lxo lxoVar = this.n;
        lxoVar.c(i);
        lxoVar.c(this.m);
        lxoVar.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    @Override // androidx.compose.runtime.a
    public final boolean e(long j) {
        Object objL0 = l0();
        if ((objL0 instanceof Long) && j == ((Number) objL0).longValue()) {
            return false;
        }
        I0(Long.valueOf(j));
        return true;
    }

    public final void e0() {
        g gVar = new g();
        if (this.C) {
            gVar.c();
        }
        if (this.b.e()) {
            gVar.z = new msw<>();
        }
        this.H = gVar;
        h hVarE = gVar.e();
        hVarE.e(true);
        this.I = hVarE;
    }

    @Override // androidx.compose.runtime.a
    public final boolean f(double d) {
        Object objL0 = l0();
        if ((objL0 instanceof Double) && d == ((Number) objL0).doubleValue()) {
            return false;
        }
        I0(Double.valueOf(d));
        return true;
    }

    public final int f0() {
        return this.S ? -this.I.v : this.G.i;
    }

    @Override // androidx.compose.runtime.a
    public final boolean g() {
        return this.S;
    }

    public final e g0() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (e) rh6.a(1, arrayList);
    }

    @Override // androidx.compose.runtime.a
    public final void h(boolean z) {
        if (this.l != 0) {
            c.b("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (this.S) {
            return;
        }
        if (!z) {
            y0();
            return;
        }
        f fVar = this.G;
        int i = fVar.g;
        int i2 = fVar.h;
        rla rlaVar = this.M;
        rlaVar.getClass();
        rlaVar.d(false);
        rlaVar.b.c.Z(r1z.f.c);
        c.h(this.s, i, i2);
        this.G.t();
    }

    public final boolean h0() {
        if (!j() || this.w) {
            return true;
        }
        e eVarG0 = g0();
        return (eVarG0 == null || (eVarG0.b & 4) == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    @Override // androidx.compose.runtime.a
    public final b i(int i) {
        e eVar;
        boolean z;
        N(i);
        boolean z2 = this.S;
        mna mnaVar = this.g;
        ArrayList arrayList = this.E;
        uma umaVar = this.h;
        if (z2) {
            e eVar2 = new e(umaVar);
            arrayList.add(eVar2);
            I0(eVar2);
            eVar2.e = this.B;
            eVar2.b &= -17;
            mnaVar.a();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iE = c.e(i2, arrayList2);
        j0p j0pVar = iE >= 0 ? (j0p) arrayList2.remove(iE) : null;
        Object objM = this.G.m();
        if (Intrinsics.g(objM, androidx.compose.runtime.a.C0041a.a)) {
            eVar = new e(umaVar);
            I0(eVar);
        } else {
            objM.getClass();
            eVar = (e) objM;
        }
        if (j0pVar == null) {
            int i3 = eVar.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                eVar.b = i3 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = eVar.b;
        eVar.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(eVar);
        eVar.e = this.B;
        eVar.b &= -17;
        mnaVar.a();
        int i5 = eVar.b;
        if ((i5 & 256) != 0) {
            eVar.b = (i5 & (-257)) | 512;
            f2z f2zVar = this.M.b.c;
            f2zVar.Z(r1z.c0.c);
            f2z.b.a(f2zVar, 0, eVar);
            if (!this.y) {
                int i6 = eVar.b;
                if ((i6 & 128) != 0) {
                    this.y = true;
                    eVar.b = i6 | 1024;
                }
            }
        }
        return this;
    }

    public final rma i0() {
        if (this.C) {
            return this.Q;
        }
        return null;
    }

    @Override // androidx.compose.runtime.a
    public final boolean j() {
        e eVarG0;
        return (this.S || this.y || this.w || (eVarG0 = g0()) == null || (eVarG0.b & 8) != 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0117 A[Catch: all -> 0x00a5, TryCatch #4 {all -> 0x00a5, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x004a, B:12:0x0053, B:14:0x0059, B:15:0x005e, B:16:0x0061, B:21:0x009a, B:81:0x01ec, B:25:0x00a9, B:26:0x00ac, B:27:0x00ad, B:29:0x00b3, B:32:0x00ba, B:34:0x00c0, B:35:0x00c5, B:39:0x00cf, B:41:0x00dc, B:46:0x00fa, B:47:0x00fc, B:49:0x010e, B:51:0x0117, B:53:0x0122, B:61:0x013c, B:63:0x014f, B:80:0x01e9, B:109:0x0232, B:110:0x0235, B:112:0x0237, B:113:0x023a, B:42:0x00ea, B:38:0x00ca, B:30:0x00b6, B:114:0x023b, B:17:0x0065, B:19:0x008d, B:20:0x0098, B:48:0x0105), top: B:127:0x000a, inners: #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0122 A[Catch: all -> 0x00a5, TRY_LEAVE, TryCatch #4 {all -> 0x00a5, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x004a, B:12:0x0053, B:14:0x0059, B:15:0x005e, B:16:0x0061, B:21:0x009a, B:81:0x01ec, B:25:0x00a9, B:26:0x00ac, B:27:0x00ad, B:29:0x00b3, B:32:0x00ba, B:34:0x00c0, B:35:0x00c5, B:39:0x00cf, B:41:0x00dc, B:46:0x00fa, B:47:0x00fc, B:49:0x010e, B:51:0x0117, B:53:0x0122, B:61:0x013c, B:63:0x014f, B:80:0x01e9, B:109:0x0232, B:110:0x0235, B:112:0x0237, B:113:0x023a, B:42:0x00ea, B:38:0x00ca, B:30:0x00b6, B:114:0x023b, B:17:0x0065, B:19:0x008d, B:20:0x0098, B:48:0x0105), top: B:127:0x000a, inners: #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:58:0x0137  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x013c A[Catch: all -> 0x00a5, TRY_ENTER, TryCatch #4 {all -> 0x00a5, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x004a, B:12:0x0053, B:14:0x0059, B:15:0x005e, B:16:0x0061, B:21:0x009a, B:81:0x01ec, B:25:0x00a9, B:26:0x00ac, B:27:0x00ad, B:29:0x00b3, B:32:0x00ba, B:34:0x00c0, B:35:0x00c5, B:39:0x00cf, B:41:0x00dc, B:46:0x00fa, B:47:0x00fc, B:49:0x010e, B:51:0x0117, B:53:0x0122, B:61:0x013c, B:63:0x014f, B:80:0x01e9, B:109:0x0232, B:110:0x0235, B:112:0x0237, B:113:0x023a, B:42:0x00ea, B:38:0x00ca, B:30:0x00b6, B:114:0x023b, B:17:0x0065, B:19:0x008d, B:20:0x0098, B:48:0x0105), top: B:127:0x000a, inners: #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x014d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d7 A[Catch: all -> 0x0200, TRY_LEAVE, TryCatch #0 {all -> 0x0200, blocks: (B:76:0x01ca, B:78:0x01d7, B:101:0x0221, B:102:0x0223), top: B:119:0x01ca }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void j0(ArrayList arrayList) {
        mma mmaVar;
        l00 l00Var;
        ArrayList arrayList2;
        f fVarD;
        f fVarD2;
        f fVar;
        f fVar2;
        int[] iArr;
        msw<ne00> mswVar;
        msw<ne00> mswVar2;
        o47 o47Var;
        o47 o47Var2;
        boolean z;
        boolean z2;
        o47 o47Var3;
        g gVar;
        boolean z3;
        mma mmaVar2 = this.b;
        o47 o47Var4 = this.f;
        rla rlaVar = this.M;
        o47 o47Var5 = rlaVar.b;
        try {
            rlaVar.b = o47Var4;
            o47Var4.c.Z(r1z.z.c);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Pair pair = (Pair) arrayList.get(i2);
                final z6w z6wVar = (z6w) pair.a;
                z6w z6wVar2 = (z6w) pair.b;
                l00 l00Var2 = z6wVar.e;
                g gVar2 = z6wVar.d;
                int iB = gVar2.b(l00Var2);
                qwo qwoVar = new qwo(i);
                rlaVar.b();
                f2z f2zVar = rlaVar.b.c;
                f2zVar.Z(r1z.g.c);
                f2z.b.b(f2zVar, i, qwoVar, 1, l00Var2);
                if (z6wVar2 == null) {
                    if ((gVar2 != this.H ? i : 1) != 0) {
                        if (!this.I.w) {
                            c.b("Check failed");
                        }
                        e0();
                    }
                    final f fVarD3 = gVar2.d();
                    try {
                        fVarD3.r(iB);
                        rlaVar.f = iB;
                        final o47 o47Var6 = new o47();
                        o0(null, null, null, m2g.a, new Function0() { // from class: ula
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                o47 o47Var7 = o47Var6;
                                f fVar3 = fVarD3;
                                z6w z6wVar3 = z6wVar;
                                b bVar = this.a;
                                rla rlaVar2 = bVar.M;
                                o47 o47Var8 = rlaVar2.b;
                                try {
                                    rlaVar2.b = o47Var7;
                                    f fVar4 = bVar.G;
                                    int[] iArr2 = bVar.o;
                                    msw<ne00> mswVar3 = bVar.v;
                                    bVar.o = null;
                                    bVar.v = null;
                                    try {
                                        bVar.G = fVar3;
                                        boolean z4 = rlaVar2.e;
                                        try {
                                            rlaVar2.e = false;
                                            bVar.k0(z6wVar3.a, z6wVar3.g, z6wVar3.b);
                                            rlaVar2.e = z4;
                                            Unit unit = Unit.a;
                                            bVar.G = fVar4;
                                            bVar.o = iArr2;
                                            bVar.v = mswVar3;
                                            rlaVar2.b = o47Var8;
                                            return Unit.a;
                                        } catch (Throwable th) {
                                            rlaVar2.e = z4;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        bVar.G = fVar4;
                                        bVar.o = iArr2;
                                        bVar.v = mswVar3;
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    rlaVar2.b = o47Var8;
                                    throw th3;
                                }
                            }
                        });
                        o47 o47Var7 = rlaVar.b;
                        o47Var7.getClass();
                        if (o47Var6.c.Y()) {
                            f2z f2zVar2 = o47Var7.c;
                            f2zVar2.Z(r1z.c.c);
                            f2z.b.b(f2zVar2, 0, o47Var6, 1, qwoVar);
                        }
                        Unit unit = Unit.a;
                        fVarD3.c();
                        mmaVar = mmaVar2;
                        size = size;
                    } catch (Throwable th) {
                        fVarD3.c();
                        throw th;
                    }
                } else {
                    y6w y6wVarN = mmaVar2.n(z6wVar2);
                    g gVar3 = y6wVarN != null ? y6wVarN.a : z6wVar2.d;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (y6wVarN != null) {
                                                                    g gVar4 = y6wVarN.a;
                                                                    if (gVar4.i) {
                                                                        c.b("use active SlotWriter to create an anchor location instead");
                                                                    }
                                                                    if (gVar4.b <= 0) {
                                                                        lm20.a("Parameter index is out of range");
                                                                    }
                                                                    ArrayList<l00> arrayList3 = gVar4.w;
                                                                    mmaVar = mmaVar2;
                                                                    int iB2 = j1a0.b(arrayList3, 0, gVar4.b);
                                                                    if (iB2 < 0) {
                                                                        l00Var = new l00(0);
                                                                        arrayList3.add(-(iB2 + 1), l00Var);
                                                                    } else {
                                                                        l00Var = arrayList3.get(iB2);
                                                                    }
                                                                    if (l00Var != null) {
                                                                        arrayList2 = new ArrayList();
                                                                        fVarD = gVar3.d();
                                                                        c.a(fVarD, arrayList2, gVar3.b(l00Var));
                                                                        Unit unit2 = Unit.a;
                                                                        fVarD.c();
                                                                        if (arrayList2.isEmpty()) {
                                                                            size = size;
                                                                        } else {
                                                                            o47Var3 = rlaVar.b;
                                                                            o47Var3.getClass();
                                                                            if (!arrayList2.isEmpty()) {
                                                                                f2z f2zVar3 = o47Var3.c;
                                                                                f2zVar3.Z(r1z.d.c);
                                                                                f2z.b.b(f2zVar3, 1, arrayList2, 0, qwoVar);
                                                                            }
                                                                            gVar = this.c;
                                                                            if (gVar2 != gVar) {
                                                                                z3 = false;
                                                                            } else {
                                                                                z3 = true;
                                                                            }
                                                                            if (z3) {
                                                                                int iB3 = gVar.b(l00Var2);
                                                                                G0(iB3, J0(iB3) + arrayList2.size());
                                                                            }
                                                                        }
                                                                        f2z f2zVar4 = rlaVar.b.c;
                                                                        f2zVar4.Z(r1z.e.c);
                                                                        int i3 = f2zVar4.v - f2zVar4.c[f2zVar4.d - 1].b;
                                                                        Object[] objArr = f2zVar4.i;
                                                                        objArr[i3] = y6wVarN;
                                                                        objArr[i3 + 1] = mmaVar;
                                                                        objArr[i3 + 3] = z6wVar;
                                                                        objArr[i3 + 2] = z6wVar2;
                                                                        fVarD2 = gVar3.d();
                                                                        fVar2 = this.G;
                                                                        iArr = this.o;
                                                                        mswVar = this.v;
                                                                        this.o = null;
                                                                        this.v = null;
                                                                        this.G = fVarD2;
                                                                        int iB4 = gVar3.b(l00Var);
                                                                        fVarD2.r(iB4);
                                                                        rlaVar.f = iB4;
                                                                        o47Var = new o47();
                                                                        o47Var2 = rlaVar.b;
                                                                        rlaVar.b = o47Var;
                                                                        z = rlaVar.e;
                                                                        rlaVar.e = false;
                                                                        z6wVar2.a();
                                                                        t2b t2bVar = z6wVar2.c;
                                                                        t2b t2bVar2 = z6wVar.c;
                                                                        Integer numValueOf = Integer.valueOf(fVarD2.g);
                                                                        fVar = fVarD2;
                                                                        mswVar2 = mswVar;
                                                                        z2 = z;
                                                                        o0(t2bVar, t2bVar2, numValueOf, z6wVar2.f, new Function0() { // from class: vla
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Object invoke() {
                                                                                z6w z6wVar3 = z6wVar;
                                                                                this.a.k0(z6wVar3.a, z6wVar3.g, z6wVar3.b);
                                                                                return Unit.a;
                                                                            }
                                                                        });
                                                                        rlaVar.e = z2;
                                                                        rlaVar.b = o47Var2;
                                                                        o47Var2.getClass();
                                                                        if (o47Var.c.Y()) {
                                                                            f2z f2zVar5 = o47Var2.c;
                                                                            f2zVar5.Z(r1z.c.c);
                                                                            f2z.b.b(f2zVar5, 0, o47Var, 1, qwoVar);
                                                                        }
                                                                        this.G = fVar2;
                                                                        this.o = iArr;
                                                                        this.v = mswVar2;
                                                                        fVar.c();
                                                                    }
                                                                    rlaVar.b = o47Var5;
                                                                    throw th;
                                                                }
                                                                mmaVar = mmaVar2;
                                                                y6wVarN = y6wVarN;
                                                                this.G = fVar2;
                                                                this.o = iArr;
                                                                this.v = mswVar2;
                                                                fVar.c();
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                fVar.c();
                                                                throw th;
                                                            }
                                                            rlaVar.b = o47Var2;
                                                            o47Var2.getClass();
                                                            if (o47Var.c.Y()) {
                                                                f2z f2zVar6 = o47Var2.c;
                                                                f2zVar6.Z(r1z.c.c);
                                                                f2z.b.b(f2zVar6, 0, o47Var, 1, qwoVar);
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            this.G = fVar2;
                                                            this.o = iArr;
                                                            this.v = mswVar2;
                                                            throw th;
                                                        }
                                                        rlaVar.e = z2;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        rlaVar.b = o47Var2;
                                                        throw th;
                                                    }
                                                    o0(t2bVar, t2bVar2, numValueOf, z6wVar2.f, new Function0() { // from class: vla
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            z6w z6wVar3 = z6wVar;
                                                            this.a.k0(z6wVar3.a, z6wVar3.g, z6wVar3.b);
                                                            return Unit.a;
                                                        }
                                                    });
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    rlaVar.e = z2;
                                                    throw th;
                                                }
                                                fVar = fVarD2;
                                                mswVar2 = mswVar;
                                                z2 = z;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                fVar = fVarD2;
                                                mswVar2 = mswVar;
                                                z2 = z;
                                            }
                                            t2b t2bVar3 = z6wVar.c;
                                            Integer numValueOf2 = Integer.valueOf(fVarD2.g);
                                        } catch (Throwable th7) {
                                            th = th7;
                                            z2 = z;
                                            fVar = fVarD2;
                                            mswVar2 = mswVar;
                                        }
                                        rlaVar.e = false;
                                        z6wVar2.a();
                                        t2b t2bVar4 = z6wVar2.c;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        z2 = z;
                                        fVar = fVarD2;
                                        mswVar2 = mswVar;
                                    }
                                    rlaVar.b = o47Var;
                                    z = rlaVar.e;
                                } catch (Throwable th9) {
                                    th = th9;
                                    fVar = fVarD2;
                                    mswVar2 = mswVar;
                                }
                                this.G = fVarD2;
                                int iB5 = gVar3.b(l00Var);
                                fVarD2.r(iB5);
                                rlaVar.f = iB5;
                                o47Var = new o47();
                                o47Var2 = rlaVar.b;
                            } catch (Throwable th10) {
                                th = th10;
                                fVar = fVarD2;
                                mswVar2 = mswVar;
                            }
                            fVar2 = this.G;
                            iArr = this.o;
                            mswVar = this.v;
                            this.o = null;
                            this.v = null;
                        } catch (Throwable th11) {
                            th = th11;
                            fVar = fVarD2;
                        }
                        c.a(fVarD, arrayList2, gVar3.b(l00Var));
                        Unit unit3 = Unit.a;
                        fVarD.c();
                        if (arrayList2.isEmpty()) {
                            o47Var3 = rlaVar.b;
                            o47Var3.getClass();
                            if (!arrayList2.isEmpty()) {
                                f2z f2zVar7 = o47Var3.c;
                                f2zVar7.Z(r1z.d.c);
                                f2z.b.b(f2zVar7, 1, arrayList2, 0, qwoVar);
                            }
                            gVar = this.c;
                            if (gVar2 != gVar) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (z3) {
                                int iB6 = gVar.b(l00Var2);
                                G0(iB6, J0(iB6) + arrayList2.size());
                            }
                        } else {
                            size = size;
                        }
                        f2z f2zVar8 = rlaVar.b.c;
                        f2zVar8.Z(r1z.e.c);
                        int i4 = f2zVar8.v - f2zVar8.c[f2zVar8.d - 1].b;
                        Object[] objArr2 = f2zVar8.i;
                        objArr2[i4] = y6wVarN;
                        objArr2[i4 + 1] = mmaVar;
                        objArr2[i4 + 3] = z6wVar;
                        objArr2[i4 + 2] = z6wVar2;
                        fVarD2 = gVar3.d();
                    } catch (Throwable th12) {
                        fVarD.c();
                        throw th12;
                    }
                    l00Var = z6wVar2.e;
                    arrayList2 = new ArrayList();
                    fVarD = gVar3.d();
                }
                rlaVar.b.c.Z(r1z.b0.c);
                i2++;
                mmaVar2 = mmaVar;
                size = size;
                i = 0;
            }
            rlaVar.b.c.Z(r1z.k.c);
            rlaVar.f = 0;
            rlaVar.b = o47Var5;
        } catch (Throwable th13) {
            rlaVar.b = o47Var5;
            throw th13;
        }
    }

    @Override // androidx.compose.runtime.a
    public final fv0<?> k() {
        return this.a;
    }

    public final void k0(w6w w6wVar, ne00 ne00Var, Object obj) {
        C(126665345, w6wVar);
        l0();
        I0(obj);
        long j = this.T;
        int i = 0;
        try {
            this.T = 126665345L;
            if (this.S) {
                h.x(this.I);
            }
            boolean z = (this.S || Intrinsics.g(this.G.f(), ne00Var)) ? false : true;
            if (z) {
                r0(ne00Var);
            }
            z0(c.c, 202, 0, ne00Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            uzg.a(this, new op8(316014703, new zla(w6wVar, obj), true));
            this.w = z2;
            X(false);
            this.K = null;
            this.T = j;
            X(false);
        } catch (Throwable th) {
            try {
                nka.b(th, new xla(this, i));
                throw th;
            } catch (Throwable th2) {
                X(false);
                this.K = null;
                this.T = j;
                X(false);
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.a
    public final Object l(Object obj, Object obj2) {
        f fVar = this.G;
        int i = fVar.g;
        Object objF = c.f(i < fVar.h ? fVar.p(fVar.b, i) : null, obj, obj2);
        return objF == null ? new v9p(obj, obj2) : objF;
    }

    public final Object l0() {
        boolean z = this.S;
        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof oo50)) {
                return objM;
            }
        } else if (this.r) {
            c.b("A call to createNode(), emitNode() or useNode() expected");
            return c0042a;
        }
        return c0042a;
    }

    @Override // androidx.compose.runtime.a
    public final long m() {
        return this.T;
    }

    public final List<mka> m0() {
        mma mmaVar = this.b;
        lma lmaVarI = mmaVar.i();
        uma umaVar = lmaVarI != null ? (uma) lmaVarI : null;
        if (umaVar == null) {
            return m2g.a;
        }
        g gVar = umaVar.f;
        f fVarD = gVar.d();
        try {
            Integer numB = lka.b(fVarD, mmaVar, 0, fVarD.c);
            fVarD.c();
            if (numB == null) {
                return m2g.a;
            }
            f fVarD2 = gVar.d();
            try {
                return lka.c(fVarD2, numB.intValue(), 0);
            } finally {
                fVarD2.c();
            }
        } catch (Throwable th) {
            fVarD.c();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.a
    public final CoroutineContext n() {
        return this.R;
    }

    public final int n0(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    @Override // androidx.compose.runtime.a
    public final ne00 o() {
        return S();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x001e, B:11:0x0028, B:10:0x0024, B:14:0x002f, B:16:0x0035, B:18:0x003b), top: B:23:0x0005 }] */
    public final <R> R o0(t2b t2bVar, t2b t2bVar2, Integer num, List<? extends Pair<e, ? extends Object>> list, Function0<? extends R> function0) {
        R rInvoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair<e, ? extends Object> pair = list.get(i2);
                e eVar = pair.a;
                Object obj = pair.b;
                if (obj != null) {
                    E0(eVar, obj);
                } else {
                    E0(eVar, null);
                }
            }
            if (t2bVar == null) {
                rInvoke = function0.invoke();
            } else {
                rInvoke = (R) t2bVar.f(t2bVar2, num != null ? num.intValue() : -1, function0);
                if (rInvoke == null) {
                    rInvoke = function0.invoke();
                }
            }
            return rInvoke;
        } finally {
            this.F = z;
            this.k = i;
        }
    }

    @Override // androidx.compose.runtime.a
    public final void p() {
        if (!this.r) {
            c.b("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            c.b("useNode() called while inserting");
        }
        f fVar = this.G;
        Object objN = fVar.n(fVar.i);
        rla rlaVar = this.M;
        rlaVar.c();
        rlaVar.h.add(objN);
        if (this.y && (objN instanceof uga)) {
            rlaVar.b();
            rlaVar.b.c.Z(r1z.j0.c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:203:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0124 A[LOOP:7: B:37:0x00cb->B:56:0x0124, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0166  */
    /* JADX WARN: Code duplicated, block: B:69:0x0168  */
    /* JADX WARN: Code duplicated, block: B:72:0x016d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0179
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void p0() {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.b.p0():void");
    }

    @Override // androidx.compose.runtime.a
    public final boolean q(int i, boolean z) {
        if ((i & 1) == 0 && (this.S || this.y)) {
            if (this.P != null) {
                g0();
            }
        } else if (!z && j()) {
            return false;
        }
        return true;
    }

    public final void q0() {
        t0(this.G.g);
        rla rlaVar = this.M;
        rlaVar.d(false);
        rlaVar.e();
        rlaVar.b.c.Z(r1z.x.c);
        int i = rlaVar.f;
        f fVar = rlaVar.a.G;
        rlaVar.f = fVar.b[(fVar.g * 5) + 3] + i;
    }

    @Override // androidx.compose.runtime.a
    public final void r(Object obj) {
        int i;
        f fVar;
        int i2;
        h hVar;
        if (obj instanceof j350) {
            j350 j350Var = (j350) obj;
            l00 l00VarA = null;
            if (this.S) {
                h hVar2 = this.I;
                int i3 = hVar2.t;
                if (i3 > hVar2.v + 1) {
                    int i4 = i3 - 1;
                    int iE = hVar2.E(hVar2.b, i4);
                    while (true) {
                        i2 = i4;
                        i4 = iE;
                        hVar = this.I;
                        if (i4 == hVar.v || i4 < 0) {
                            break;
                        } else {
                            iE = hVar.E(hVar.b, i4);
                        }
                    }
                    l00VarA = hVar.b(i2);
                }
            } else {
                f fVar2 = this.G;
                int i5 = fVar2.g;
                if (i5 > fVar2.i + 1) {
                    int i6 = i5 - 1;
                    int iQ = fVar2.q(i6);
                    while (true) {
                        i = i6;
                        i6 = iQ;
                        fVar = this.G;
                        if (i6 == fVar.i || i6 < 0) {
                            break;
                        } else {
                            iQ = fVar.q(i6);
                        }
                    }
                    l00VarA = fVar.a(i);
                }
            }
            k350 k350Var = new k350(j350Var, l00VarA);
            if (this.S) {
                f2z f2zVar = this.M.b.c;
                f2zVar.Z(r1z.v.c);
                f2z.b.a(f2zVar, 0, k350Var);
            }
            this.d.add(obj);
            obj = k350Var;
        }
        I0(obj);
    }

    public final void r0(ne00 ne00Var) {
        msw<ne00> mswVar = this.v;
        if (mswVar == null) {
            mswVar = new msw<>();
            this.v = mswVar;
        }
        mswVar.h(this.G.g, ne00Var);
    }

    @Override // androidx.compose.runtime.a
    public final void s() {
        X(true);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void s0(int i, int i2, int i3) {
        f fVar = this.G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (fVar.q(i) == i2) {
                i3 = i2;
            } else if (fVar.q(i2) == i) {
                i3 = i;
            } else if (fVar.q(i) == fVar.q(i2)) {
                i3 = fVar.q(i);
            } else {
                int iQ = i;
                int i4 = 0;
                while (iQ > 0 && iQ != i3) {
                    iQ = fVar.q(iQ);
                    i4++;
                }
                int iQ2 = i2;
                int i5 = 0;
                while (iQ2 > 0 && iQ2 != i3) {
                    iQ2 = fVar.q(iQ2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iQ3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iQ3 = fVar.q(iQ3);
                }
                int i8 = i5 - i4;
                int iQ4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iQ4 = fVar.q(iQ4);
                }
                i3 = iQ3;
                for (int iQ5 = iQ4; i3 != iQ5; iQ5 = fVar.q(iQ5)) {
                    i3 = fVar.q(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (fVar.l(i)) {
                this.M.a();
            }
            i = fVar.q(i);
        }
        W(i2, i3);
    }

    @Override // androidx.compose.runtime.a
    public final void t(Function0<Unit> function0) {
        f2z f2zVar = this.M.b.c;
        f2zVar.Z(r1z.a0.c);
        f2z.b.a(f2zVar, 0, function0);
    }

    public final void t0(int i) {
        boolean zL = this.G.l(i);
        rla rlaVar = this.M;
        if (zL) {
            rlaVar.c();
            Object objN = this.G.n(i);
            rlaVar.c();
            rlaVar.h.add(objN);
        }
        w0(this, i, i, zL, 0);
        rlaVar.c();
        if (zL) {
            rlaVar.a();
        }
    }

    @Override // androidx.compose.runtime.a
    public final void u() {
        this.q = true;
        this.C = true;
        this.c.c();
        this.H.c();
        h hVar = this.I;
        g gVar = hVar.a;
        hVar.e = gVar.y;
        hVar.f = gVar.z;
    }

    @Override // androidx.compose.runtime.a
    public final e v() {
        return g0();
    }

    @Override // androidx.compose.runtime.a
    public final void w() {
        if (this.y && this.G.i == this.z) {
            this.z = -1;
            this.y = false;
        }
        X(false);
    }

    @Override // androidx.compose.runtime.a
    public final void x(int i) {
        z0(null, i, 0, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    public final void x0() {
        long jRotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        f fVar = this.G;
        int iG = fVar.g();
        int[] iArr = fVar.b;
        int i = fVar.g;
        Object objP = i < fVar.h ? fVar.p(iArr, i) : null;
        Object objF = fVar.f();
        int i2 = this.m;
        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(c0042a)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i2);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) objF.hashCode()), 3) ^ ((long) i2);
            }
            C0(null, (iArr[(fVar.g * 5) + 1] & 1073741824) != 0);
            p0();
            fVar.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(c0042a)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        this.T = jRotateLeft;
        C0(null, (iArr[(fVar.g * 5) + 1] & 1073741824) != 0);
        p0();
        fVar.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    @Override // androidx.compose.runtime.a
    public final Object y() {
        boolean z = this.S;
        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof oo50)) {
                return objM instanceof k350 ? ((k350) objM).a : objM;
            }
        } else if (this.r) {
            c.b("A call to createNode(), emitNode() or useNode() expected");
            return c0042a;
        }
        return c0042a;
    }

    public final void y0() {
        f fVar = this.G;
        int i = fVar.i;
        this.l = i >= 0 ? fVar.b[(i * 5) + 1] & 67108863 : 0;
        fVar.t();
    }

    @Override // androidx.compose.runtime.a
    public final oma z() {
        pma pmaVar = this.U;
        if (pmaVar != null) {
            return pmaVar;
        }
        pma pmaVar2 = new pma(this.h);
        this.U = pmaVar2;
        return pmaVar2;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:168:0x0315  */
    /* JADX WARN: Code duplicated, block: B:169:0x031b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x031d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0321  */
    /* JADX WARN: Code duplicated, block: B:174:0x0328  */
    /* JADX WARN: Code duplicated, block: B:176:0x032b  */
    /* JADX WARN: Code duplicated, block: B:177:0x032d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0359  */
    /* JADX WARN: Code duplicated, block: B:182:0x035b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:86:0x0179  */
    /* JADX WARN: Code duplicated, block: B:88:0x0186  */
    /* JADX WARN: Code duplicated, block: B:91:0x018e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0197  */
    public final void z0(Object obj, int i, int i2, Object obj2) {
        long jRotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        hb00 hb00Var;
        hb00 hb00Var2;
        ArrayList arrayList;
        msw<e8l> mswVar;
        int i3;
        Object objValueOf;
        rtw<Object, Object> rtwVar;
        Object objD;
        etw etwVar;
        h hVar;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        f fVar;
        int[] iArr;
        ArrayList arrayList2;
        int i9;
        int i10;
        int i11;
        f fVar2;
        int i12;
        Object objP;
        h hVar2;
        int i13;
        hb00 hb00Var3;
        Object obj4 = obj;
        if (this.r) {
            c.b("A call to createNode(), emitNode() or useNode() expected");
        }
        int i14 = this.m;
        Object obj5 = androidx.compose.runtime.a.C0041a.a;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) i14);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i14);
            }
            if (obj4 == null) {
                this.m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.S) {
                this.G.k++;
                hVar2 = this.I;
                i13 = hVar2.t;
                if (z) {
                    hVar2.Q(i, obj5, true, obj5);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    hVar2.Q(i, obj4, false, obj2);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    hVar2.Q(i, obj4, false, obj5);
                }
                hb00Var3 = this.j;
                if (hb00Var3 != null) {
                    int i15 = (-2) - i13;
                    hmp hmpVar = new hmp(-1, i, i15, -1);
                    hb00Var3.e.h(i15, new e8l(-1, this.k - hb00Var3.b, 0));
                    hb00Var3.d.add(hmpVar);
                }
                d0(z, null);
                return;
            }
            if (i2 != 1 && this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.j == null) {
                int iG = this.G.g();
                if (!z2 && iG == i) {
                    fVar2 = this.G;
                    i12 = fVar2.g;
                    if (i12 < fVar2.h) {
                        objP = fVar2.p(fVar2.b, i12);
                    } else {
                        objP = null;
                    }
                    if (Intrinsics.g(obj4, objP)) {
                        C0(obj2, z);
                        z3 = z2;
                    }
                }
                fVar = this.G;
                iArr = fVar.b;
                arrayList2 = new ArrayList();
                if (fVar.k <= 0) {
                    i9 = fVar.g;
                    while (i9 < fVar.h) {
                        int i16 = i9 * 5;
                        int i17 = iArr[i16];
                        Object objP2 = fVar.p(iArr, i9);
                        i10 = iArr[i16 + 1];
                        if ((i10 & 1073741824) != 0) {
                            i11 = 1;
                        } else {
                            i11 = i10 & 67108863;
                        }
                        arrayList2.add(new hmp(objP2, i17, i9, i11));
                        i9 += iArr[i16 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.j = new hb00(this.k, arrayList2);
            } else {
                z3 = z2;
            }
            hb00Var = this.j;
            if (hb00Var != null) {
                arrayList = hb00Var.d;
                mswVar = hb00Var.e;
                i3 = hb00Var.b;
                if (obj4 != null) {
                    objValueOf = new v9p(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                rtwVar = ((tlw) hb00Var.f.getValue()).a;
                objD = rtwVar.d(objValueOf);
                if (objD == null) {
                    objD = null;
                } else if (objD instanceof etw) {
                    etwVar = (etw) objD;
                    Object objK = etwVar.k(0);
                    if (etwVar.d()) {
                        rtwVar.k(objValueOf);
                    }
                    if (etwVar.b == 1) {
                        rtwVar.m(objValueOf, etwVar.a());
                    }
                    objD = objK;
                } else {
                    rtwVar.k(objValueOf);
                }
                hmp hmpVar2 = (hmp) objD;
                if (!z3 || hmpVar2 == null) {
                    this.G.k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.w) {
                        h hVarE = this.H.e();
                        this.I = hVarE;
                        hVarE.M();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    hVar = this.I;
                    int i18 = hVar.t;
                    if (z) {
                        hVar.Q(i, obj5, true, obj5);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        hVar.Q(i, obj5, false, obj2);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        hVar.Q(i, obj3, false, obj5);
                    }
                    this.N = this.I.b(i18);
                    int i19 = (-2) - i18;
                    hmp hmpVar3 = new hmp(-1, i, i19, -1);
                    mswVar.h(i19, new e8l(-1, this.k - i3, i4));
                    arrayList.add(hmpVar3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.k;
                    }
                    hb00Var2 = new hb00(i5, arrayList3);
                } else {
                    int i20 = hmpVar2.c;
                    arrayList.add(hmpVar2);
                    e8l e8lVarB = mswVar.b(i20);
                    this.k = (e8lVarB != null ? e8lVarB.b : -1) + i3;
                    e8l e8lVarB2 = mswVar.b(i20);
                    int i21 = e8lVarB2 != null ? e8lVarB2.a : -1;
                    int i22 = hb00Var.c;
                    int i23 = i21 - i22;
                    int i24 = 8;
                    if (i21 <= i22) {
                        i6 = i23;
                        if (i22 > i21) {
                            Object[] objArr3 = mswVar.c;
                            long[] jArr = mswVar.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j = jArr[i25];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                e8l e8lVar = (e8l) objArr3[(i25 << 3) + i27];
                                                int i28 = e8lVar.a;
                                                if (i28 == i21) {
                                                    e8lVar.a = i22;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i21 + 1 <= i28 && i28 < i22) {
                                                        e8lVar.a = i28 - 1;
                                                    }
                                                }
                                            }
                                            j >>= 8;
                                            i27++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i26 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = mswVar.c;
                        long[] jArr2 = mswVar.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i29 = 0;
                            while (true) {
                                long j2 = jArr2[i29];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                    int i31 = 0;
                                    while (i31 < i30) {
                                        if ((j2 & 255) < 128) {
                                            i8 = i24;
                                            e8l e8lVar2 = (e8l) objArr4[(i29 << 3) + i31];
                                            i7 = i23;
                                            int i32 = e8lVar2.a;
                                            if (i32 == i21) {
                                                e8lVar2.a = i22;
                                            } else if (i22 <= i32 && i32 < i21) {
                                                e8lVar2.a = i32 + 1;
                                            }
                                        } else {
                                            i7 = i23;
                                            i8 = i24;
                                        }
                                        j2 >>= i8;
                                        i31++;
                                        i23 = i7;
                                        i24 = i8;
                                    }
                                    i6 = i23;
                                    if (i30 != i24) {
                                        break;
                                    }
                                } else {
                                    i6 = i23;
                                }
                                if (i29 == length2) {
                                    break;
                                }
                                i29++;
                                i23 = i6;
                                i24 = 8;
                            }
                        } else {
                            i6 = i23;
                        }
                    }
                    rla rlaVar = this.M;
                    rlaVar.f = (i20 - rlaVar.a.G.g) + rlaVar.f;
                    this.G.r(i20);
                    if (i6 > 0) {
                        rlaVar.d(false);
                        rlaVar.e();
                        f2z f2zVar = rlaVar.b.c;
                        f2zVar.Z(r1z.r.c);
                        f2zVar.e[f2zVar.f - f2zVar.c[f2zVar.d - 1].a] = i6;
                    }
                    C0(obj2, z);
                    hb00Var2 = null;
                }
            } else {
                hb00Var2 = null;
            }
            d0(z, hb00Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        this.T = jRotateLeft;
        if (obj4 == null) {
            this.m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.S) {
            this.G.k++;
            hVar2 = this.I;
            i13 = hVar2.t;
            if (z) {
                hVar2.Q(i, obj5, true, obj5);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                hVar2.Q(i, obj4, false, obj2);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                hVar2.Q(i, obj4, false, obj5);
            }
            hb00Var3 = this.j;
            if (hb00Var3 != null) {
                int i110 = (-2) - i13;
                hmp hmpVar4 = new hmp(-1, i, i110, -1);
                hb00Var3.e.h(i110, new e8l(-1, this.k - hb00Var3.b, 0));
                hb00Var3.d.add(hmpVar4);
            }
            d0(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.j == null) {
            int iG2 = this.G.g();
            if (!z2) {
                fVar2 = this.G;
                i12 = fVar2.g;
                if (i12 < fVar2.h) {
                    objP = fVar2.p(fVar2.b, i12);
                } else {
                    objP = null;
                }
                if (Intrinsics.g(obj4, objP)) {
                    C0(obj2, z);
                    z3 = z2;
                }
            }
            fVar = this.G;
            iArr = fVar.b;
            arrayList2 = new ArrayList();
            if (fVar.k <= 0) {
                i9 = fVar.g;
                while (i9 < fVar.h) {
                    int i111 = i9 * 5;
                    int i112 = iArr[i111];
                    Object objP3 = fVar.p(iArr, i9);
                    i10 = iArr[i111 + 1];
                    if ((i10 & 1073741824) != 0) {
                        i11 = 1;
                    } else {
                        i11 = i10 & 67108863;
                    }
                    arrayList2.add(new hmp(objP3, i112, i9, i11));
                    i9 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.j = new hb00(this.k, arrayList2);
        } else {
            z3 = z2;
        }
        hb00Var = this.j;
        if (hb00Var != null) {
            arrayList = hb00Var.d;
            mswVar = hb00Var.e;
            i3 = hb00Var.b;
            if (obj4 != null) {
                objValueOf = new v9p(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            rtwVar = ((tlw) hb00Var.f.getValue()).a;
            objD = rtwVar.d(objValueOf);
            if (objD == null) {
                objD = null;
            } else if (objD instanceof etw) {
                etwVar = (etw) objD;
                Object objK2 = etwVar.k(0);
                if (etwVar.d()) {
                    rtwVar.k(objValueOf);
                }
                if (etwVar.b == 1) {
                    rtwVar.m(objValueOf, etwVar.a());
                }
                objD = objK2;
            } else {
                rtwVar.k(objValueOf);
            }
            hmp hmpVar5 = (hmp) objD;
            if (z3) {
            }
            this.G.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                h hVarE2 = this.H.e();
                this.I = hVarE2;
                hVarE2.M();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            hVar = this.I;
            int i113 = hVar.t;
            if (z) {
                hVar.Q(i, obj5, true, obj5);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                hVar.Q(i, obj5, false, obj2);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                hVar.Q(i, obj3, false, obj5);
            }
            this.N = this.I.b(i113);
            int i114 = (-2) - i113;
            hmp hmpVar6 = new hmp(-1, i, i114, -1);
            mswVar.h(i114, new e8l(-1, this.k - i3, i4));
            arrayList.add(hmpVar6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.k;
            }
            hb00Var2 = new hb00(i5, arrayList4);
        } else {
            hb00Var2 = null;
        }
        d0(z, hb00Var2);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03a0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void X(boolean z) {
        long jRotateRight;
        lxo lxoVar;
        int i;
        ArrayList arrayList;
        int i2;
        ?? r5;
        int i3;
        lxo lxoVar2;
        int i4;
        LinkedHashSet linkedHashSet;
        int i5;
        int i6;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i7;
        int i8;
        Object[] objArr;
        long[] jArr;
        int i9;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        Object[] objArr3;
        long[] jArr3;
        int i11;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        lxo lxoVar3 = this.n;
        int i12 = lxoVar3.a[lxoVar3.b - 2] - 1;
        boolean z2 = this.S;
        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
        if (z2) {
            h hVar = this.I;
            int i13 = hVar.v;
            int i14 = hVar.b[hVar.q(i13) * 5];
            Object objR = this.I.r(i13);
            Object objP = this.I.p(i13);
            if (objR != null) {
                jRotateRight2 = Long.rotateRight(this.T, 3) ^ ((long) (objR instanceof Enum ? ((Enum) objR).ordinal() : objR.hashCode()));
            } else if (objP == null || i14 != 207 || objP.equals(c0042a)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) i14);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) objP.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            f fVar = this.G;
            int i15 = fVar.i;
            int i16 = fVar.i(i15);
            f fVar2 = this.G;
            Object objP2 = fVar2.p(fVar2.b, i15);
            f fVar3 = this.G;
            Object objB = fVar3.b(fVar3.b, i15);
            if (objP2 != null) {
                jRotateRight = Long.rotateRight(this.T, 3) ^ ((long) (objP2 instanceof Enum ? ((Enum) objP2).ordinal() : objP2.hashCode()));
            } else if (objB == null || i16 != 207 || objB.equals(c0042a)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) i16);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i17 = this.l;
        hb00 hb00Var = this.j;
        ArrayList arrayList4 = this.s;
        rla rlaVar = this.M;
        if (hb00Var != null) {
            msw<e8l> mswVar = hb00Var.e;
            int i18 = hb00Var.b;
            ArrayList arrayList5 = hb00Var.a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = hb00Var.d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i19 = 0; i19 < size; i19++) {
                    hashSet2.add(arrayList6.get(i19));
                }
                i2 = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                i = 1;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (i20 < size3) {
                    hmp hmpVar = (hmp) arrayList5.get(i20);
                    if (hashSet2.contains(hmpVar)) {
                        lxoVar2 = lxoVar3;
                        i4 = i20;
                        if (!linkedHashSet2.contains(hmpVar)) {
                            int i23 = i21;
                            if (i23 < size2) {
                                hmp hmpVar2 = (hmp) arrayList6.get(i23);
                                if (hmpVar2 != hmpVar) {
                                    e8l e8lVarB = mswVar.b(hmpVar2.c);
                                    int i24 = e8lVarB != null ? e8lVarB.b : -1;
                                    linkedHashSet2.add(hmpVar2);
                                    i7 = i22;
                                    if (i24 != i7) {
                                        e8l e8lVarB2 = mswVar.b(hmpVar2.c);
                                        int i25 = e8lVarB2 != null ? e8lVarB2.c : hmpVar2.d;
                                        linkedHashSet = linkedHashSet2;
                                        int i26 = i24 + i18;
                                        i5 = size2;
                                        int i27 = i7 + i18;
                                        if (i25 > 0) {
                                            i6 = i18;
                                            int i28 = rlaVar.l;
                                            if (i28 > 0) {
                                                arrayList2 = arrayList5;
                                                if (rlaVar.j == i26 - i28 && rlaVar.k == i27 - i28) {
                                                    rlaVar.l = i28 + i25;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            rlaVar.c();
                                            rlaVar.j = i26;
                                            rlaVar.k = i27;
                                            rlaVar.l = i25;
                                        } else {
                                            i6 = i18;
                                            arrayList2 = arrayList5;
                                            rlaVar.getClass();
                                        }
                                        if (i24 <= i7) {
                                            int i29 = i25;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i7 > i24) {
                                                Object[] objArr5 = mswVar.c;
                                                long[] jArr5 = mswVar.a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i30 = 0;
                                                    while (true) {
                                                        long j = jArr5[i30];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i31 = 8 - ((~(i30 - length)) >>> 31);
                                                            int i32 = 0;
                                                            while (i32 < i31) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    e8l e8lVar = (e8l) objArr5[(i30 << 3) + i32];
                                                                    jArr2 = jArr5;
                                                                    int i33 = e8lVar.b;
                                                                    i10 = i24;
                                                                    if (i24 <= i33 && i33 < i10 + i29) {
                                                                        e8lVar.b = (i33 - i10) + i7;
                                                                    } else if (i10 + 1 <= i33 && i33 < i7) {
                                                                        e8lVar.b = i33 - i29;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i10 = i24;
                                                                }
                                                                j >>= 8;
                                                                i32++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i24 = i10;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i9 = i24;
                                                            if (i31 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i9 = i24;
                                                        }
                                                        if (i30 == length) {
                                                            break;
                                                        }
                                                        i30++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i24 = i9;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = mswVar.c;
                                            long[] jArr6 = mswVar.a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i34 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i34];
                                                    int i35 = i25;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i36 = 8 - ((~(i34 - length2)) >>> 31);
                                                        int i37 = 0;
                                                        while (i37 < i36) {
                                                            if ((j2 & 255) < 128) {
                                                                i11 = i37;
                                                                e8l e8lVar2 = (e8l) objArr6[(i34 << 3) + i37];
                                                                objArr4 = objArr6;
                                                                int i38 = e8lVar2.b;
                                                                jArr4 = jArr6;
                                                                if (i24 <= i38 && i38 < i24 + i35) {
                                                                    e8lVar2.b = (i38 - i24) + i7;
                                                                } else if (i7 <= i38 && i38 < i24) {
                                                                    e8lVar2.b = i38 + i35;
                                                                }
                                                            } else {
                                                                i11 = i37;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i37 = i11 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i36 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i34 == length2) {
                                                        break;
                                                    }
                                                    i34++;
                                                    arrayList4 = arrayList4;
                                                    i25 = i35;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i8 = i4;
                                    } else {
                                        linkedHashSet = linkedHashSet2;
                                        i5 = size2;
                                        i6 = i18;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i8 = i4;
                                } else {
                                    arrayList4 = arrayList4;
                                    linkedHashSet = linkedHashSet2;
                                    i5 = size2;
                                    i6 = i18;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i7 = i22;
                                    i8 = i4 + 1;
                                }
                                i21 = i23 + 1;
                                e8l e8lVarB3 = mswVar.b(hmpVar2.c);
                                int i39 = i7 + (e8lVarB3 != null ? e8lVarB3.c : hmpVar2.d);
                                i20 = i8;
                                hb00Var = hb00Var;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i5;
                                i18 = i6;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i22 = i39;
                                lxoVar3 = lxoVar2;
                            } else {
                                i21 = i23;
                                lxoVar3 = lxoVar2;
                                i20 = i4;
                            }
                        }
                    } else {
                        lxoVar2 = lxoVar3;
                        e8l e8lVarB4 = mswVar.b(hmpVar.c);
                        int i40 = e8lVarB4 != null ? e8lVarB4.b : -1;
                        int i41 = hmpVar.c;
                        i4 = i20;
                        rlaVar.f(i40 + i18, hmpVar.d);
                        hb00Var.a(i41, 0);
                        rlaVar.f = (i41 - rlaVar.a.G.g) + rlaVar.f;
                        this.G.r(i41);
                        q0();
                        this.G.s();
                        c.h(arrayList4, i41, this.G.b[(i41 * 5) + 3] + i41);
                    }
                    i20 = i4 + 1;
                    lxoVar3 = lxoVar2;
                }
                lxoVar = lxoVar3;
                arrayList = arrayList4;
                rlaVar.c();
                if (arrayList5.size() > 0) {
                    f fVar4 = this.G;
                    rlaVar.f = (fVar4.h - rlaVar.a.G.g) + rlaVar.f;
                    fVar4.t();
                }
            } else {
                lxoVar = lxoVar3;
                i = 1;
                arrayList = arrayList4;
                i2 = -1;
            }
        } else {
            lxoVar = lxoVar3;
            i = 1;
            arrayList = arrayList4;
            i2 = -1;
        }
        boolean z3 = this.S;
        if (!z3) {
            f fVar5 = this.G;
            int i42 = fVar5.m - fVar5.l;
            if (i42 > 0) {
                if (i42 > 0) {
                    rlaVar.d(false);
                    rlaVar.e();
                    f2z f2zVar = rlaVar.b.c;
                    f2zVar.Z(r1z.d0.c);
                    f2zVar.e[f2zVar.f - f2zVar.c[f2zVar.d - 1].a] = i42;
                } else {
                    rlaVar.getClass();
                }
            }
        }
        int i43 = this.k;
        while (true) {
            f fVar6 = this.G;
            if (fVar6.k > 0 || (i3 = fVar6.g) == fVar6.h) {
                break;
            }
            q0();
            rlaVar.f(i43, this.G.s());
            c.h(arrayList, i3, this.G.g);
        }
        if (z3) {
            if (z) {
                yth ythVar = this.O;
                f2z f2zVar2 = ythVar.d;
                if (!f2zVar2.Y()) {
                    c.b("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                f2z f2zVar3 = ythVar.c;
                r1z[] r1zVarArr = f2zVar2.c;
                int i44 = f2zVar2.d - 1;
                f2zVar2.d = i44;
                r1z r1zVar = r1zVarArr[i44];
                r1zVarArr[i44] = null;
                f2zVar3.Z(r1zVar);
                Object[] objArr7 = f2zVar2.i;
                Object[] objArr8 = f2zVar3.i;
                int i45 = f2zVar3.v;
                int i46 = r1zVar.b;
                int i47 = f2zVar2.v;
                int i48 = i47 - i46;
                System.arraycopy(objArr7, i48, objArr8, i45 - i46, i47 - i48);
                Object[] objArr9 = f2zVar2.i;
                int i49 = f2zVar2.v;
                Arrays.fill(objArr9, i49 - i46, i49, (Object) null);
                int[] iArr = f2zVar2.e;
                int[] iArr2 = f2zVar3.e;
                int i50 = f2zVar3.f;
                int i51 = r1zVar.a;
                int i52 = f2zVar2.f;
                xx0.d(i50 - i51, i52 - i51, i52, iArr, iArr2);
                f2zVar2.v -= i46;
                f2zVar2.f -= i51;
                i17 = i;
            }
            f fVar7 = this.G;
            if (fVar7.k <= 0) {
                lm20.a(Chyeyik.LXklJDqRbG);
            }
            fVar7.k--;
            h hVar2 = this.I;
            int i53 = hVar2.v;
            hVar2.i();
            if (this.G.k <= 0) {
                int i54 = (-2) - i53;
                this.I.j();
                this.I.e(i);
                l00 l00Var = this.N;
                boolean zIsEmpty = this.O.c.isEmpty();
                g gVar = this.H;
                if (zIsEmpty) {
                    rlaVar.b();
                    r5 = 0;
                    rlaVar.d(false);
                    rlaVar.e();
                    rlaVar.c();
                    f2z f2zVar4 = rlaVar.b.c;
                    f2zVar4.Z(r1z.p.c);
                    f2z.b.b(f2zVar4, 0, l00Var, 1, gVar);
                } else {
                    yth ythVar2 = this.O;
                    rlaVar.b();
                    rlaVar.d(false);
                    rlaVar.e();
                    rlaVar.c();
                    f2z f2zVar5 = rlaVar.b.c;
                    f2zVar5.Z(r1z.q.c);
                    f2z.b.c(f2zVar5, l00Var, gVar, ythVar2);
                    this.O = new yth();
                    r5 = 0;
                }
                this.S = r5;
                if (this.c.b != 0) {
                    G0(i54, r5);
                    H0(i54, i17);
                }
            }
        } else {
            if (z) {
                rlaVar.a();
            }
            int i55 = rlaVar.a.G.i;
            lxo lxoVar4 = rlaVar.d;
            int i56 = i2;
            if (lxoVar4.a(i56) > i55) {
                c.b("Missed recording an endGroup");
            }
            if (lxoVar4.a(i56) == i55) {
                rlaVar.d(false);
                lxoVar4.b();
                rlaVar.b.c.Z(r1z.j.c);
            }
            int i57 = this.G.i;
            if (i17 != J0(i57)) {
                H0(i57, i17);
            }
            if (z) {
                i17 = 1;
            }
            this.G.e();
            rlaVar.c();
        }
        ArrayList arrayList7 = this.i;
        hb00 hb00Var2 = (hb00) arrayList7.remove(arrayList7.size() - 1);
        if (hb00Var2 != null && !z3) {
            hb00Var2.c++;
        }
        this.j = hb00Var2;
        this.k = lxoVar.b() + i17;
        this.m = lxoVar.b();
        this.l = lxoVar.b() + i17;
    }
}
