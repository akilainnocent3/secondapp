package defpackage;

import android.os.Trace;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.m;
import androidx.compose.ui.layout.n;
import gyr.a;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlin.time.g;
import kotlin.time.h;
import kotlin.time.i;

/* JADX INFO: loaded from: classes.dex */
public final class lo20 {
    public final dxr a;
    public final g0 b;
    public final po20 c;
    public boolean d = true;

    public final class a implements gyr.b, no20, gyr.c {
        public final int a;
        public final mo20 b;
        public final Function1<gyr.c, Unit> c;
        public kxa d;
        public g0.b e;
        public boolean f;
        public boolean g;
        public boolean h;
        public Object i;
        public boolean j;
        public C0824a k;
        public boolean l;
        public long m;
        public long n;
        public long o;

        /* JADX INFO: renamed from: lo20$a$a, reason: collision with other inner class name */
        public final class C0824a {
            public final List<gyr> a;
            public final List<no20>[] b;
            public int c;
            public int d;
            public boolean e;

            public C0824a(List<gyr> list) {
                this.a = list;
                this.b = new List[list.size()];
                if (list.isEmpty()) {
                    zkn.a("NestedPrefetchController shouldn't be created with no states");
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, mo20 mo20Var, ow20 ow20Var, Function1<? super gyr.c, Unit> function1) {
            this.a = i;
            this.b = mo20Var;
            this.c = function1;
            i.a.a.getClass();
            h.a.getClass();
            this.o = h.b();
        }

        @Override // gyr.c
        public final long a(int i) {
            g0.b bVar = this.e;
            if (bVar != null) {
                return bVar.a(i);
            }
            return 0L;
        }

        @Override // gyr.c
        public final int b() {
            g0.b bVar = this.e;
            if (bVar != null) {
                return bVar.b();
            }
            return 0;
        }

        @Override // gyr.b
        public final void c() {
            this.l = true;
        }

        @Override // gyr.b
        public final void cancel() {
            if (this.g) {
                return;
            }
            this.g = true;
            e();
        }

        @Override // defpackage.no20
        public final boolean d(oo20 oo20Var) {
            boolean zF;
            if (!lo20.this.d) {
                return false;
            }
            if (this.l) {
                Trace.beginSection("compose:lazy:prefetch:execute:urgent");
                try {
                    zF = f(oo20Var);
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                zF = f(oo20Var);
            }
            rc0.a(-1L, "compose:lazy:prefetch:execute:item");
            return zF;
        }

        public final void e() {
            g0.b bVar = this.e;
            if (bVar != null) {
                bVar.dispose();
            }
            this.e = null;
            this.k = null;
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0227 A[Catch: all -> 0x0264, TryCatch #3 {all -> 0x0264, blocks: (B:86:0x01da, B:88:0x01e2, B:90:0x01e8, B:95:0x01f4, B:97:0x0200, B:99:0x0216, B:98:0x0203, B:100:0x0218, B:101:0x021f, B:103:0x0227, B:105:0x0231, B:107:0x0235, B:110:0x023c, B:111:0x023e, B:115:0x024c, B:116:0x0252, B:117:0x025e), top: B:190:0x01da }] */
        /* JADX WARN: Code duplicated, block: B:105:0x0231 A[Catch: all -> 0x0264, TryCatch #3 {all -> 0x0264, blocks: (B:86:0x01da, B:88:0x01e2, B:90:0x01e8, B:95:0x01f4, B:97:0x0200, B:99:0x0216, B:98:0x0203, B:100:0x0218, B:101:0x021f, B:103:0x0227, B:105:0x0231, B:107:0x0235, B:110:0x023c, B:111:0x023e, B:115:0x024c, B:116:0x0252, B:117:0x025e), top: B:190:0x01da }] */
        /* JADX WARN: Code duplicated, block: B:107:0x0235 A[Catch: all -> 0x0264, TryCatch #3 {all -> 0x0264, blocks: (B:86:0x01da, B:88:0x01e2, B:90:0x01e8, B:95:0x01f4, B:97:0x0200, B:99:0x0216, B:98:0x0203, B:100:0x0218, B:101:0x021f, B:103:0x0227, B:105:0x0231, B:107:0x0235, B:110:0x023c, B:111:0x023e, B:115:0x024c, B:116:0x0252, B:117:0x025e), top: B:190:0x01da }] */
        /* JADX WARN: Code duplicated, block: B:108:0x0239  */
        /* JADX WARN: Code duplicated, block: B:110:0x023c A[Catch: all -> 0x0264, TryCatch #3 {all -> 0x0264, blocks: (B:86:0x01da, B:88:0x01e2, B:90:0x01e8, B:95:0x01f4, B:97:0x0200, B:99:0x0216, B:98:0x0203, B:100:0x0218, B:101:0x021f, B:103:0x0227, B:105:0x0231, B:107:0x0235, B:110:0x023c, B:111:0x023e, B:115:0x024c, B:116:0x0252, B:117:0x025e), top: B:190:0x01da }] */
        /* JADX WARN: Code duplicated, block: B:115:0x024c A[Catch: all -> 0x0264, LOOP:2: B:101:0x021f->B:115:0x024c, LOOP_END, TRY_ENTER, TryCatch #3 {all -> 0x0264, blocks: (B:86:0x01da, B:88:0x01e2, B:90:0x01e8, B:95:0x01f4, B:97:0x0200, B:99:0x0216, B:98:0x0203, B:100:0x0218, B:101:0x021f, B:103:0x0227, B:105:0x0231, B:107:0x0235, B:110:0x023c, B:111:0x023e, B:115:0x024c, B:116:0x0252, B:117:0x025e), top: B:190:0x01da }] */
        /* JADX WARN: Code duplicated, block: B:127:0x0272  */
        /* JADX WARN: Code duplicated, block: B:131:0x0280  */
        /* JADX WARN: Code duplicated, block: B:134:0x0289 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:137:0x0295  */
        /* JADX WARN: Code duplicated, block: B:140:0x02a0 A[Catch: all -> 0x02e3, TryCatch #1 {all -> 0x02e3, blocks: (B:138:0x029a, B:140:0x02a0, B:141:0x02a5, B:143:0x02a9, B:144:0x02ae, B:146:0x02b4, B:148:0x02bb, B:150:0x02c9, B:149:0x02c1), top: B:186:0x029a }] */
        /* JADX WARN: Code duplicated, block: B:143:0x02a9 A[Catch: all -> 0x02e3, TryCatch #1 {all -> 0x02e3, blocks: (B:138:0x029a, B:140:0x02a0, B:141:0x02a5, B:143:0x02a9, B:144:0x02ae, B:146:0x02b4, B:148:0x02bb, B:150:0x02c9, B:149:0x02c1), top: B:186:0x029a }] */
        /* JADX WARN: Code duplicated, block: B:146:0x02b4 A[Catch: all -> 0x02e3, TryCatch #1 {all -> 0x02e3, blocks: (B:138:0x029a, B:140:0x02a0, B:141:0x02a5, B:143:0x02a9, B:144:0x02ae, B:146:0x02b4, B:148:0x02bb, B:150:0x02c9, B:149:0x02c1), top: B:186:0x029a }] */
        /* JADX WARN: Code duplicated, block: B:148:0x02bb A[Catch: all -> 0x02e3, LOOP:3: B:147:0x02b9->B:148:0x02bb, LOOP_END, TryCatch #1 {all -> 0x02e3, blocks: (B:138:0x029a, B:140:0x02a0, B:141:0x02a5, B:143:0x02a9, B:144:0x02ae, B:146:0x02b4, B:148:0x02bb, B:150:0x02c9, B:149:0x02c1), top: B:186:0x029a }] */
        /* JADX WARN: Code duplicated, block: B:149:0x02c1 A[Catch: all -> 0x02e3, TryCatch #1 {all -> 0x02e3, blocks: (B:138:0x029a, B:140:0x02a0, B:141:0x02a5, B:143:0x02a9, B:144:0x02ae, B:146:0x02b4, B:148:0x02bb, B:150:0x02c9, B:149:0x02c1), top: B:186:0x029a }] */
        /* JADX WARN: Code duplicated, block: B:153:0x02df  */
        /* JADX WARN: Code duplicated, block: B:160:0x02ef  */
        /* JADX WARN: Code duplicated, block: B:180:0x0343 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:196:0x01f0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:197:0x0248 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:55:0x0150  */
        /* JADX WARN: Code duplicated, block: B:57:0x0154  */
        /* JADX WARN: Code duplicated, block: B:59:0x015a  */
        /* JADX WARN: Code duplicated, block: B:62:0x0163 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:60:0x015f, B:62:0x0163, B:64:0x0176, B:67:0x0187, B:66:0x017e), top: B:184:0x015f }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0176 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:60:0x015f, B:62:0x0163, B:64:0x0176, B:67:0x0187, B:66:0x017e), top: B:184:0x015f }] */
        /* JADX WARN: Code duplicated, block: B:66:0x017e A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:60:0x015f, B:62:0x0163, B:64:0x0176, B:67:0x0187, B:66:0x017e), top: B:184:0x015f }] */
        /* JADX WARN: Code duplicated, block: B:72:0x0196  */
        /* JADX WARN: Code duplicated, block: B:74:0x019a  */
        /* JADX WARN: Code duplicated, block: B:77:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:79:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:83:0x01c3 A[Catch: all -> 0x0269, LOOP:0: B:82:0x01c1->B:83:0x01c3, LOOP_END, TryCatch #4 {all -> 0x0269, blocks: (B:81:0x01bc, B:83:0x01c3, B:84:0x01d0), top: B:192:0x01bc }] */
        /* JADX WARN: Code duplicated, block: B:88:0x01e2 A[Catch: all -> 0x0264, TryCatch #3 {all -> 0x0264, blocks: (B:86:0x01da, B:88:0x01e2, B:90:0x01e8, B:95:0x01f4, B:97:0x0200, B:99:0x0216, B:98:0x0203, B:100:0x0218, B:101:0x021f, B:103:0x0227, B:105:0x0231, B:107:0x0235, B:110:0x023c, B:111:0x023e, B:115:0x024c, B:116:0x0252, B:117:0x025e), top: B:190:0x01da }] */
        /* JADX WARN: Code duplicated, block: B:90:0x01e8 A[Catch: all -> 0x0264, TRY_LEAVE, TryCatch #3 {all -> 0x0264, blocks: (B:86:0x01da, B:88:0x01e2, B:90:0x01e8, B:95:0x01f4, B:97:0x0200, B:99:0x0216, B:98:0x0203, B:100:0x0218, B:101:0x021f, B:103:0x0227, B:105:0x0231, B:107:0x0235, B:110:0x023c, B:111:0x023e, B:115:0x024c, B:116:0x0252, B:117:0x025e), top: B:190:0x01da }] */
        /* JADX WARN: Code duplicated, block: B:95:0x01f4 A[Catch: all -> 0x0264, TRY_ENTER, TryCatch #3 {all -> 0x0264, blocks: (B:86:0x01da, B:88:0x01e2, B:90:0x01e8, B:95:0x01f4, B:97:0x0200, B:99:0x0216, B:98:0x0203, B:100:0x0218, B:101:0x021f, B:103:0x0227, B:105:0x0231, B:107:0x0235, B:110:0x023c, B:111:0x023e, B:115:0x024c, B:116:0x0252, B:117:0x025e), top: B:190:0x01da }] */
        /* JADX WARN: Code duplicated, block: B:97:0x0200 A[Catch: all -> 0x0264, TryCatch #3 {all -> 0x0264, blocks: (B:86:0x01da, B:88:0x01e2, B:90:0x01e8, B:95:0x01f4, B:97:0x0200, B:99:0x0216, B:98:0x0203, B:100:0x0218, B:101:0x021f, B:103:0x0227, B:105:0x0231, B:107:0x0235, B:110:0x023c, B:111:0x023e, B:115:0x024c, B:116:0x0252, B:117:0x025e), top: B:190:0x01da }] */
        /* JADX WARN: Code duplicated, block: B:98:0x0203 A[Catch: all -> 0x0264, TryCatch #3 {all -> 0x0264, blocks: (B:86:0x01da, B:88:0x01e2, B:90:0x01e8, B:95:0x01f4, B:97:0x0200, B:99:0x0216, B:98:0x0203, B:100:0x0218, B:101:0x021f, B:103:0x0227, B:105:0x0231, B:107:0x0235, B:110:0x023c, B:111:0x023e, B:115:0x024c, B:116:0x0252, B:117:0x025e), top: B:190:0x01da }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final boolean f(oo20 oo20Var) {
            C0824a c0824a;
            C0824a c0824a2;
            kxa kxaVar;
            long j;
            g0.b bVar;
            Function1<gyr.c, Unit> function1;
            int iB;
            int i;
            C0824a c0824a3;
            int i2;
            boolean z;
            List<no20>[] listArr;
            int i3;
            List<gyr> list;
            int size;
            int i4;
            c0p.a aVar;
            no20 no20Var;
            a aVar2;
            gyr gyrVar;
            Function1<? super dlx, Unit> function2;
            RandomAccess randomAccess;
            g0.b bVar2;
            int i5 = this.a;
            long j2 = i5;
            rc0.a(j2, "compose:lazy:prefetch:execute:item");
            lo20 lo20Var = lo20.this;
            c cVar = (c) lo20Var.a.b.invoke();
            if (!this.g) {
                int iA = cVar.a();
                if (i5 >= 0 && i5 < iA) {
                    Object objG = cVar.g(i5);
                    Object obj = this.i;
                    if (obj != null && !objG.equals(obj)) {
                        e();
                        return false;
                    }
                    Object objE = cVar.e(i5);
                    mo20 mo20Var = this.b;
                    jp1 jp1Var = mo20Var.c;
                    if (mo20Var.b != objE || jp1Var == null) {
                        rtw<Object, jp1> rtwVar = mo20Var.a;
                        jp1 jp1VarD = rtwVar.d(objE);
                        if (jp1VarD == null) {
                            jp1VarD = new jp1();
                            rtwVar.m(objE, jp1VarD);
                        }
                        jp1Var = jp1VarD;
                        mo20Var.b = objE;
                        mo20Var.c = jp1Var;
                    }
                    g();
                    long jA = oo20Var.a();
                    this.m = jA;
                    i.a.a.getClass();
                    h.a.getClass();
                    this.o = h.b();
                    this.n = 0L;
                    rc0.a(jA, "compose:lazy:prefetch:available_time_nanos");
                    if (!g()) {
                        if (h(this.m, jp1Var.a)) {
                            Trace.beginSection("compose:lazy:prefetch:compose");
                            try {
                                if (this.e != null) {
                                    zkn.a("Request was already composed!");
                                }
                                Function2<androidx.compose.runtime.a, Integer, Unit> function2A = lo20Var.a.a(i5, objG, objE);
                                this.i = objG;
                                k kVarA = lo20Var.b.a();
                                tsr tsrVar = kVarA.a;
                                if (tsrVar.e()) {
                                    kVarA.e();
                                    if (!kVarA.i.b(objG)) {
                                        kVarA.A.k(objG);
                                        rtw<Object, tsr> rtwVar2 = kVarA.y;
                                        Object objD = rtwVar2.d(objG);
                                        if (objD == null) {
                                            objD = kVarA.j(objG);
                                            if (objD != null) {
                                                kVarA.g(((duw.a) tsrVar.B()).a.i((T) objD), ((duw.a) tsrVar.B()).a.c);
                                                kVarA.D++;
                                            } else {
                                                int i6 = ((duw.a) tsrVar.B()).a.c;
                                                tsr tsrVar2 = new tsr(2);
                                                tsrVar.F = true;
                                                tsrVar.M(i6, tsrVar2);
                                                Unit unit = Unit.a;
                                                tsrVar.F = false;
                                                kVarA.D++;
                                                objD = tsrVar2;
                                            }
                                            rtwVar2.m(objG, objD);
                                        }
                                        kVarA.i((tsr) objD, objG, false, function2A);
                                    }
                                }
                                this.e = !tsrVar.e() ? new m() : new n(kVarA, objG);
                                this.h = true;
                                Unit unit2 = Unit.a;
                                Trace.endSection();
                                i();
                                jp1Var.a = jp1.a(this.n, jp1Var.a);
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        }
                        if (g()) {
                            if (this.j) {
                                c0824a = this.k;
                                if (c0824a != null) {
                                    i2 = jp1Var.d;
                                    z = this.l;
                                    listArr = c0824a.b;
                                    i3 = c0824a.c;
                                    list = c0824a.a;
                                    if (i3 < list.size()) {
                                        if (a.this.g) {
                                            zkn.c("Should not execute nested prefetch on canceled request");
                                        }
                                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                        size = list.size();
                                        for (i4 = 0; i4 < size; i4++) {
                                            list.get(i4).e = i2;
                                        }
                                        Unit unit3 = Unit.a;
                                        Trace.endSection();
                                        Trace.beginSection("compose:lazy:prefetch:nested");
                                        while (c0824a.c < list.size()) {
                                            if (listArr[c0824a.c] == 0) {
                                                if (oo20Var.a() <= 0) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                int i7 = c0824a.c;
                                                gyrVar = list.get(i7);
                                                function2 = gyrVar.b;
                                                if (function2 == null) {
                                                    randomAccess = m2g.a;
                                                } else {
                                                    gyr.a aVar3 = gyrVar.new a(gyrVar.e);
                                                    function2.invoke(aVar3);
                                                    ArrayList arrayList = aVar3.b;
                                                    gyrVar.g = arrayList.size();
                                                    randomAccess = arrayList;
                                                }
                                                listArr[i7] = randomAccess;
                                            }
                                            aVar = listArr[c0824a.c];
                                            aVar.getClass();
                                            while (c0824a.d < aVar.size()) {
                                                no20Var = (no20) aVar.get(c0824a.d);
                                                if (z) {
                                                    if (no20Var instanceof a) {
                                                        aVar2 = (a) no20Var;
                                                    } else {
                                                        aVar2 = null;
                                                    }
                                                    if (aVar2 != null) {
                                                        aVar2.l = true;
                                                    }
                                                }
                                                c0824a.e = true;
                                                if (no20Var.d(oo20Var)) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                c0824a.d++;
                                            }
                                            c0824a.d = 0;
                                            c0824a.c++;
                                        }
                                        Unit unit4 = Unit.a;
                                        Trace.endSection();
                                    }
                                }
                                c0824a2 = this.k;
                                if (c0824a2 != null) {
                                    i();
                                    rc0.a(j2, "compose:lazy:prefetch:execute:item");
                                    c0824a3 = this.k;
                                    if (c0824a3 != null) {
                                        c0824a3.e = false;
                                    }
                                }
                                kxaVar = this.d;
                                if (!this.f) {
                                    if (h(this.m, jp1Var.c)) {
                                        Trace.beginSection("compose:lazy:prefetch:measure");
                                        j = kxaVar.a;
                                        if (this.g) {
                                            zkn.a("Callers should check whether the request is still valid before calling performMeasure()");
                                        }
                                        if (this.f) {
                                            zkn.a("Request was already measured!");
                                        }
                                        this.f = true;
                                        bVar = this.e;
                                        if (bVar != null) {
                                            iB = bVar.b();
                                            for (i = 0; i < iB; i++) {
                                                bVar.d(i, j);
                                            }
                                        } else {
                                            zkn.b("performComposition() must be called before performMeasure()");
                                            fkd.a();
                                        }
                                        Unit unit5 = Unit.a;
                                        Trace.endSection();
                                        i();
                                        jp1Var.c = jp1.a(this.n, jp1Var.c);
                                        function1 = this.c;
                                        if (function1 != null) {
                                            function1.invoke(this);
                                        }
                                    }
                                }
                                C0824a c0824a4 = this.k;
                                if (this.f) {
                                    return false;
                                }
                                return false;
                            }
                            if (this.m > 0) {
                                Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                                bVar2 = this.e;
                                if (bVar2 != null) {
                                    dq40 dq40Var = new dq40();
                                    bVar2.c(new ko20(dq40Var));
                                    List list2 = (List) dq40Var.a;
                                    if (list2 != null) {
                                    }
                                    this.k = c0824a;
                                    this.j = true;
                                    Unit unit6 = Unit.a;
                                    Trace.endSection();
                                    c0824a = this.k;
                                    if (c0824a != null) {
                                        i2 = jp1Var.d;
                                        z = this.l;
                                        listArr = c0824a.b;
                                        i3 = c0824a.c;
                                        list = c0824a.a;
                                        if (i3 < list.size()) {
                                            if (a.this.g) {
                                                zkn.c("Should not execute nested prefetch on canceled request");
                                            }
                                            Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                            size = list.size();
                                            while (i4 < size) {
                                                list.get(i4).e = i2;
                                            }
                                            Unit unit7 = Unit.a;
                                            Trace.endSection();
                                            Trace.beginSection("compose:lazy:prefetch:nested");
                                            while (c0824a.c < list.size()) {
                                                if (listArr[c0824a.c] == 0) {
                                                    if (oo20Var.a() <= 0) {
                                                        Trace.endSection();
                                                        return true;
                                                    }
                                                    int i8 = c0824a.c;
                                                    gyrVar = list.get(i8);
                                                    function2 = gyrVar.b;
                                                    if (function2 == null) {
                                                        randomAccess = m2g.a;
                                                    } else {
                                                        gyr.a aVar4 = gyrVar.new a(gyrVar.e);
                                                        function2.invoke(aVar4);
                                                        ArrayList arrayList2 = aVar4.b;
                                                        gyrVar.g = arrayList2.size();
                                                        randomAccess = arrayList2;
                                                    }
                                                    listArr[i8] = randomAccess;
                                                }
                                                aVar = listArr[c0824a.c];
                                                aVar.getClass();
                                                while (c0824a.d < aVar.size()) {
                                                    no20Var = (no20) aVar.get(c0824a.d);
                                                    if (z) {
                                                        if (no20Var instanceof a) {
                                                            aVar2 = (a) no20Var;
                                                        } else {
                                                            aVar2 = null;
                                                        }
                                                        if (aVar2 != null) {
                                                            aVar2.l = true;
                                                        }
                                                    }
                                                    c0824a.e = true;
                                                    if (no20Var.d(oo20Var)) {
                                                        Trace.endSection();
                                                        return true;
                                                    }
                                                    c0824a.d++;
                                                }
                                                c0824a.d = 0;
                                                c0824a.c++;
                                            }
                                            Unit unit8 = Unit.a;
                                            Trace.endSection();
                                        }
                                    }
                                    c0824a2 = this.k;
                                    if (c0824a2 != null) {
                                        i();
                                        rc0.a(j2, "compose:lazy:prefetch:execute:item");
                                        c0824a3 = this.k;
                                        if (c0824a3 != null) {
                                            c0824a3.e = false;
                                        }
                                    }
                                    kxaVar = this.d;
                                    if (!this.f) {
                                        if (h(this.m, jp1Var.c)) {
                                            Trace.beginSection("compose:lazy:prefetch:measure");
                                            j = kxaVar.a;
                                            if (this.g) {
                                                zkn.a("Callers should check whether the request is still valid before calling performMeasure()");
                                            }
                                            if (this.f) {
                                                zkn.a("Request was already measured!");
                                            }
                                            this.f = true;
                                            bVar = this.e;
                                            if (bVar != null) {
                                                iB = bVar.b();
                                                while (i < iB) {
                                                    bVar.d(i, j);
                                                }
                                            } else {
                                                zkn.b("performComposition() must be called before performMeasure()");
                                                fkd.a();
                                            }
                                            Unit unit9 = Unit.a;
                                            Trace.endSection();
                                            i();
                                            jp1Var.c = jp1.a(this.n, jp1Var.c);
                                            function1 = this.c;
                                            if (function1 != null) {
                                                function1.invoke(this);
                                            }
                                        }
                                    }
                                    C0824a c0824a5 = this.k;
                                    if (this.f) {
                                        return false;
                                    }
                                    return false;
                                }
                                zkn.b("Should precompose before resolving nested prefetch states");
                                fkd.a();
                                this.k = c0824a;
                                this.j = true;
                                Unit unit10 = Unit.a;
                                Trace.endSection();
                                c0824a = this.k;
                                if (c0824a != null) {
                                    i2 = jp1Var.d;
                                    z = this.l;
                                    listArr = c0824a.b;
                                    i3 = c0824a.c;
                                    list = c0824a.a;
                                    if (i3 < list.size()) {
                                        if (a.this.g) {
                                            zkn.c("Should not execute nested prefetch on canceled request");
                                        }
                                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                        size = list.size();
                                        while (i4 < size) {
                                            list.get(i4).e = i2;
                                        }
                                        Unit unit11 = Unit.a;
                                        Trace.endSection();
                                        Trace.beginSection("compose:lazy:prefetch:nested");
                                        while (c0824a.c < list.size()) {
                                            if (listArr[c0824a.c] == 0) {
                                                if (oo20Var.a() <= 0) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                int i9 = c0824a.c;
                                                gyrVar = list.get(i9);
                                                function2 = gyrVar.b;
                                                if (function2 == null) {
                                                    randomAccess = m2g.a;
                                                } else {
                                                    gyr.a aVar5 = gyrVar.new a(gyrVar.e);
                                                    function2.invoke(aVar5);
                                                    ArrayList arrayList3 = aVar5.b;
                                                    gyrVar.g = arrayList3.size();
                                                    randomAccess = arrayList3;
                                                }
                                                listArr[i9] = randomAccess;
                                            }
                                            aVar = listArr[c0824a.c];
                                            aVar.getClass();
                                            while (c0824a.d < aVar.size()) {
                                                no20Var = (no20) aVar.get(c0824a.d);
                                                if (z) {
                                                    if (no20Var instanceof a) {
                                                        aVar2 = (a) no20Var;
                                                    } else {
                                                        aVar2 = null;
                                                    }
                                                    if (aVar2 != null) {
                                                        aVar2.l = true;
                                                    }
                                                }
                                                c0824a.e = true;
                                                if (no20Var.d(oo20Var)) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                c0824a.d++;
                                            }
                                            c0824a.d = 0;
                                            c0824a.c++;
                                        }
                                        Unit unit12 = Unit.a;
                                        Trace.endSection();
                                    }
                                }
                                c0824a2 = this.k;
                                if (c0824a2 != null) {
                                    i();
                                    rc0.a(j2, "compose:lazy:prefetch:execute:item");
                                    c0824a3 = this.k;
                                    if (c0824a3 != null) {
                                        c0824a3.e = false;
                                    }
                                }
                                kxaVar = this.d;
                                if (!this.f) {
                                    if (h(this.m, jp1Var.c)) {
                                        Trace.beginSection("compose:lazy:prefetch:measure");
                                        j = kxaVar.a;
                                        if (this.g) {
                                            zkn.a("Callers should check whether the request is still valid before calling performMeasure()");
                                        }
                                        if (this.f) {
                                            zkn.a("Request was already measured!");
                                        }
                                        this.f = true;
                                        bVar = this.e;
                                        if (bVar != null) {
                                            iB = bVar.b();
                                            while (i < iB) {
                                                bVar.d(i, j);
                                            }
                                        } else {
                                            zkn.b("performComposition() must be called before performMeasure()");
                                            fkd.a();
                                        }
                                        Unit unit13 = Unit.a;
                                        Trace.endSection();
                                        i();
                                        jp1Var.c = jp1.a(this.n, jp1Var.c);
                                        function1 = this.c;
                                        if (function1 != null) {
                                            function1.invoke(this);
                                        }
                                    }
                                }
                                C0824a c0824a6 = this.k;
                                if (this.f) {
                                    return false;
                                }
                                return false;
                            }
                        }
                    } else {
                        if (this.j) {
                            c0824a = this.k;
                            if (c0824a != null) {
                                i2 = jp1Var.d;
                                z = this.l;
                                listArr = c0824a.b;
                                i3 = c0824a.c;
                                list = c0824a.a;
                                if (i3 < list.size()) {
                                    if (a.this.g) {
                                        zkn.c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    try {
                                        size = list.size();
                                        while (i4 < size) {
                                            list.get(i4).e = i2;
                                        }
                                        Unit unit14 = Unit.a;
                                        Trace.endSection();
                                        Trace.beginSection("compose:lazy:prefetch:nested");
                                        while (c0824a.c < list.size()) {
                                            try {
                                                if (listArr[c0824a.c] == 0) {
                                                    if (oo20Var.a() <= 0) {
                                                        Trace.endSection();
                                                        return true;
                                                    }
                                                    int i10 = c0824a.c;
                                                    gyrVar = list.get(i10);
                                                    function2 = gyrVar.b;
                                                    if (function2 == null) {
                                                        randomAccess = m2g.a;
                                                    } else {
                                                        gyr.a aVar6 = gyrVar.new a(gyrVar.e);
                                                        function2.invoke(aVar6);
                                                        ArrayList arrayList4 = aVar6.b;
                                                        gyrVar.g = arrayList4.size();
                                                        randomAccess = arrayList4;
                                                    }
                                                    listArr[i10] = randomAccess;
                                                }
                                                aVar = listArr[c0824a.c];
                                                aVar.getClass();
                                                while (c0824a.d < aVar.size()) {
                                                    no20Var = (no20) aVar.get(c0824a.d);
                                                    if (z) {
                                                        if (no20Var instanceof a) {
                                                            aVar2 = (a) no20Var;
                                                        } else {
                                                            aVar2 = null;
                                                        }
                                                        if (aVar2 != null) {
                                                            aVar2.l = true;
                                                        }
                                                    }
                                                    c0824a.e = true;
                                                    if (no20Var.d(oo20Var)) {
                                                        Trace.endSection();
                                                        return true;
                                                    }
                                                    c0824a.d++;
                                                }
                                                c0824a.d = 0;
                                                c0824a.c++;
                                            } catch (Throwable th2) {
                                                Trace.endSection();
                                                throw th2;
                                            }
                                        }
                                        Unit unit15 = Unit.a;
                                        Trace.endSection();
                                    } catch (Throwable th3) {
                                        Trace.endSection();
                                        throw th3;
                                    }
                                }
                            }
                            c0824a2 = this.k;
                            if (c0824a2 != null && c0824a2.e) {
                                i();
                                rc0.a(j2, "compose:lazy:prefetch:execute:item");
                                c0824a3 = this.k;
                                if (c0824a3 != null) {
                                    c0824a3.e = false;
                                }
                            }
                            kxaVar = this.d;
                            if (!this.f && kxaVar != null) {
                                if (h(this.m, jp1Var.c)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    try {
                                        j = kxaVar.a;
                                        if (this.g) {
                                            zkn.a("Callers should check whether the request is still valid before calling performMeasure()");
                                        }
                                        if (this.f) {
                                            zkn.a("Request was already measured!");
                                        }
                                        this.f = true;
                                        bVar = this.e;
                                        if (bVar != null) {
                                            iB = bVar.b();
                                            while (i < iB) {
                                                bVar.d(i, j);
                                            }
                                        } else {
                                            zkn.b("performComposition() must be called before performMeasure()");
                                            fkd.a();
                                        }
                                        Unit unit16 = Unit.a;
                                        Trace.endSection();
                                        i();
                                        jp1Var.c = jp1.a(this.n, jp1Var.c);
                                        function1 = this.c;
                                        if (function1 != null) {
                                            function1.invoke(this);
                                        }
                                    } catch (Throwable th4) {
                                        Trace.endSection();
                                        throw th4;
                                    }
                                }
                            }
                            C0824a c0824a7 = this.k;
                            if (this.f || !this.j || c0824a7 == null) {
                                return false;
                            }
                            List<gyr> list3 = c0824a7.a;
                            int size2 = list3.size();
                            int iMin = Integer.MAX_VALUE;
                            for (int i11 = 0; i11 < size2; i11++) {
                                iMin = Math.min(iMin, list3.get(i11).f);
                            }
                            if (iMin == Integer.MAX_VALUE) {
                                iMin = 0;
                            }
                            int i12 = jp1Var.d;
                            jp1Var.d = i12 == -1 ? iMin : ((i12 * 3) + iMin) / 4;
                            int size3 = list3.size();
                            int iMin2 = Integer.MAX_VALUE;
                            for (int i13 = 0; i13 < size3; i13++) {
                                iMin2 = Math.min(iMin2, list3.get(i13).g);
                            }
                            if (iMin2 == Integer.MAX_VALUE) {
                                iMin2 = 0;
                            }
                            if (iMin2 >= iMin) {
                                return false;
                            }
                            jp1Var.c = 0L;
                            return false;
                        }
                        if (this.m > 0) {
                            Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                            try {
                                bVar2 = this.e;
                                if (bVar2 != null) {
                                    dq40 dq40Var2 = new dq40();
                                    bVar2.c(new ko20(dq40Var2));
                                    List list4 = (List) dq40Var2.a;
                                    C0824a c0824a8 = list4 != null ? new C0824a(list4) : null;
                                    this.k = c0824a8;
                                    this.j = true;
                                    Unit unit17 = Unit.a;
                                    Trace.endSection();
                                    c0824a = this.k;
                                    if (c0824a != null) {
                                        i2 = jp1Var.d;
                                        z = this.l;
                                        listArr = c0824a.b;
                                        i3 = c0824a.c;
                                        list = c0824a.a;
                                        if (i3 < list.size()) {
                                            if (a.this.g) {
                                                zkn.c("Should not execute nested prefetch on canceled request");
                                            }
                                            Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                            size = list.size();
                                            while (i4 < size) {
                                                list.get(i4).e = i2;
                                            }
                                            Unit unit18 = Unit.a;
                                            Trace.endSection();
                                            Trace.beginSection("compose:lazy:prefetch:nested");
                                            while (c0824a.c < list.size()) {
                                                if (listArr[c0824a.c] == 0) {
                                                    if (oo20Var.a() <= 0) {
                                                        Trace.endSection();
                                                        return true;
                                                    }
                                                    int i14 = c0824a.c;
                                                    gyrVar = list.get(i14);
                                                    function2 = gyrVar.b;
                                                    if (function2 == null) {
                                                        randomAccess = m2g.a;
                                                    } else {
                                                        gyr.a aVar7 = gyrVar.new a(gyrVar.e);
                                                        function2.invoke(aVar7);
                                                        ArrayList arrayList5 = aVar7.b;
                                                        gyrVar.g = arrayList5.size();
                                                        randomAccess = arrayList5;
                                                    }
                                                    listArr[i14] = randomAccess;
                                                }
                                                aVar = listArr[c0824a.c];
                                                aVar.getClass();
                                                while (c0824a.d < aVar.size()) {
                                                    no20Var = (no20) aVar.get(c0824a.d);
                                                    if (z) {
                                                        if (no20Var instanceof a) {
                                                            aVar2 = (a) no20Var;
                                                        } else {
                                                            aVar2 = null;
                                                        }
                                                        if (aVar2 != null) {
                                                            aVar2.l = true;
                                                        }
                                                    }
                                                    c0824a.e = true;
                                                    if (no20Var.d(oo20Var)) {
                                                        Trace.endSection();
                                                        return true;
                                                    }
                                                    c0824a.d++;
                                                }
                                                c0824a.d = 0;
                                                c0824a.c++;
                                            }
                                            Unit unit19 = Unit.a;
                                            Trace.endSection();
                                        }
                                    }
                                    c0824a2 = this.k;
                                    if (c0824a2 != null) {
                                        i();
                                        rc0.a(j2, "compose:lazy:prefetch:execute:item");
                                        c0824a3 = this.k;
                                        if (c0824a3 != null) {
                                            c0824a3.e = false;
                                        }
                                    }
                                    kxaVar = this.d;
                                    if (!this.f) {
                                        if (h(this.m, jp1Var.c)) {
                                            Trace.beginSection("compose:lazy:prefetch:measure");
                                            j = kxaVar.a;
                                            if (this.g) {
                                                zkn.a("Callers should check whether the request is still valid before calling performMeasure()");
                                            }
                                            if (this.f) {
                                                zkn.a("Request was already measured!");
                                            }
                                            this.f = true;
                                            bVar = this.e;
                                            if (bVar != null) {
                                                iB = bVar.b();
                                                while (i < iB) {
                                                    bVar.d(i, j);
                                                }
                                            } else {
                                                zkn.b("performComposition() must be called before performMeasure()");
                                                fkd.a();
                                            }
                                            Unit unit110 = Unit.a;
                                            Trace.endSection();
                                            i();
                                            jp1Var.c = jp1.a(this.n, jp1Var.c);
                                            function1 = this.c;
                                            if (function1 != null) {
                                                function1.invoke(this);
                                            }
                                        }
                                    }
                                    C0824a c0824a9 = this.k;
                                    if (this.f) {
                                        return false;
                                    }
                                    return false;
                                }
                                zkn.b("Should precompose before resolving nested prefetch states");
                                fkd.a();
                                this.k = c0824a8;
                                this.j = true;
                                Unit unit111 = Unit.a;
                                Trace.endSection();
                                c0824a = this.k;
                                if (c0824a != null) {
                                    i2 = jp1Var.d;
                                    z = this.l;
                                    listArr = c0824a.b;
                                    i3 = c0824a.c;
                                    list = c0824a.a;
                                    if (i3 < list.size()) {
                                        if (a.this.g) {
                                            zkn.c("Should not execute nested prefetch on canceled request");
                                        }
                                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                        size = list.size();
                                        while (i4 < size) {
                                            list.get(i4).e = i2;
                                        }
                                        Unit unit112 = Unit.a;
                                        Trace.endSection();
                                        Trace.beginSection("compose:lazy:prefetch:nested");
                                        while (c0824a.c < list.size()) {
                                            if (listArr[c0824a.c] == 0) {
                                                if (oo20Var.a() <= 0) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                int i15 = c0824a.c;
                                                gyrVar = list.get(i15);
                                                function2 = gyrVar.b;
                                                if (function2 == null) {
                                                    randomAccess = m2g.a;
                                                } else {
                                                    gyr.a aVar8 = gyrVar.new a(gyrVar.e);
                                                    function2.invoke(aVar8);
                                                    ArrayList arrayList6 = aVar8.b;
                                                    gyrVar.g = arrayList6.size();
                                                    randomAccess = arrayList6;
                                                }
                                                listArr[i15] = randomAccess;
                                            }
                                            aVar = listArr[c0824a.c];
                                            aVar.getClass();
                                            while (c0824a.d < aVar.size()) {
                                                no20Var = (no20) aVar.get(c0824a.d);
                                                if (z) {
                                                    if (no20Var instanceof a) {
                                                        aVar2 = (a) no20Var;
                                                    } else {
                                                        aVar2 = null;
                                                    }
                                                    if (aVar2 != null) {
                                                        aVar2.l = true;
                                                    }
                                                }
                                                c0824a.e = true;
                                                if (no20Var.d(oo20Var)) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                c0824a.d++;
                                            }
                                            c0824a.d = 0;
                                            c0824a.c++;
                                        }
                                        Unit unit113 = Unit.a;
                                        Trace.endSection();
                                    }
                                }
                                c0824a2 = this.k;
                                if (c0824a2 != null) {
                                    i();
                                    rc0.a(j2, "compose:lazy:prefetch:execute:item");
                                    c0824a3 = this.k;
                                    if (c0824a3 != null) {
                                        c0824a3.e = false;
                                    }
                                }
                                kxaVar = this.d;
                                if (!this.f) {
                                    if (h(this.m, jp1Var.c)) {
                                        Trace.beginSection("compose:lazy:prefetch:measure");
                                        j = kxaVar.a;
                                        if (this.g) {
                                            zkn.a("Callers should check whether the request is still valid before calling performMeasure()");
                                        }
                                        if (this.f) {
                                            zkn.a("Request was already measured!");
                                        }
                                        this.f = true;
                                        bVar = this.e;
                                        if (bVar != null) {
                                            iB = bVar.b();
                                            while (i < iB) {
                                                bVar.d(i, j);
                                            }
                                        } else {
                                            zkn.b("performComposition() must be called before performMeasure()");
                                            fkd.a();
                                        }
                                        Unit unit114 = Unit.a;
                                        Trace.endSection();
                                        i();
                                        jp1Var.c = jp1.a(this.n, jp1Var.c);
                                        function1 = this.c;
                                        if (function1 != null) {
                                            function1.invoke(this);
                                        }
                                    }
                                }
                                C0824a c0824a10 = this.k;
                                if (this.f) {
                                    return false;
                                }
                                return false;
                            } catch (Throwable th5) {
                                Trace.endSection();
                                throw th5;
                            }
                        }
                    }
                    return true;
                }
            }
            e();
            return false;
        }

        public final boolean g() {
            return this.h;
        }

        public final boolean h(long j, long j2) {
            if (this.l) {
                j2 = 0;
            }
            return j > j2;
        }

        public final void i() {
            i.a.a.getClass();
            h hVar = h.a;
            hVar.getClass();
            long jB = h.b();
            long j = this.o;
            hVar.getClass();
            long jC = g.c(jB, j, rgf.NANOSECONDS);
            long j2 = jC >> 1;
            b.a aVar = b.b;
            if ((1 & ((int) jC)) != 0) {
                if (j2 > 9223372036854L) {
                    j2 = Long.MAX_VALUE;
                } else {
                    j2 = j2 < -9223372036854L ? Long.MIN_VALUE : j2 * 1000000;
                }
            }
            this.n = j2;
            long j3 = this.m - j2;
            this.m = j3;
            this.o = jB;
            rc0.a(j3, "compose:lazy:prefetch:available_time_nanos");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
            sb.append(this.a);
            sb.append(", constraints = ");
            sb.append(this.d);
            sb.append(", isComposed = ");
            sb.append(g());
            sb.append(", isMeasured = ");
            sb.append(this.f);
            sb.append(", isCanceled = ");
            return mq0.a(sb, this.g, " }");
        }
    }

    public lo20(dxr dxrVar, g0 g0Var, po20 po20Var) {
        this.a = dxrVar;
        this.b = g0Var;
        this.c = po20Var;
    }
}
