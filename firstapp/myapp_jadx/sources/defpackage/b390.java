package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class b390<T> extends y4<e390> implements vtw<T>, lyh, abj<T> {
    public int A;
    public final int e;
    public final int f;
    public final pb5 i;
    public Object[] v;
    public long w;
    public long y;
    public int z;

    public static final class a implements wse {
        public final b390<?> a;
        public final long b;
        public final Object c;
        public final bc6 d;

        public a(b390 b390Var, long j, Object obj, bc6 bc6Var) {
            this.a = b390Var;
            this.b = j;
            this.c = obj;
            this.d = bc6Var;
        }

        @Override // defpackage.wse
        public final void dispose() {
            b390<?> b390Var = this.a;
            synchronized (b390Var) {
                if (this.b < b390Var.q()) {
                    return;
                }
                Object[] objArr = b390Var.v;
                objArr.getClass();
                long j = this.b;
                if (objArr[((int) j) & (objArr.length - 1)] != this) {
                    return;
                }
                d390.d(objArr, j, d390.a);
                b390Var.l();
                Unit unit = Unit.a;
            }
        }
    }

    public b390(int i, int i2, pb5 pb5Var) {
        this.e = i;
        this.f = i2;
        this.i = pb5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void m(b390 b390Var, myh myhVar, v1b v1bVar) throws Throwable {
        c390 c390Var;
        b390 b390Var2;
        Throwable th;
        e390 e390Var;
        myh myhVar2;
        c9p c9pVar;
        myh myhVar3;
        if (v1bVar instanceof c390) {
            c390Var = (c390) v1bVar;
            int i = c390Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c390Var.i = i - Integer.MIN_VALUE;
            } else {
                c390Var = new c390(b390Var, v1bVar);
            }
        } else {
            c390Var = new c390(b390Var, v1bVar);
        }
        Object obj = c390Var.e;
        y5b y5bVar = y5b.a;
        int i2 = c390Var.i;
        if (i2 != 0) {
            if (i2 == 1) {
                e390Var = c390Var.c;
                myh myhVar4 = c390Var.b;
                b390 b390Var3 = c390Var.a;
                try {
                    uj50.b(obj);
                    myhVar2 = myhVar4;
                    b390Var = b390Var3;
                    try {
                        c9pVar = (c9p) c390Var.getContext().get(c9p.b.a);
                        myhVar3 = myhVar2;
                    } catch (Throwable th2) {
                        b390Var2 = b390Var;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    b390Var2 = b390Var3;
                }
            } else {
                if (i2 != 2 && i2 != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                c9p c9pVar2 = c390Var.d;
                e390Var = c390Var.c;
                myh myhVar5 = c390Var.b;
                b390Var2 = c390Var.a;
                try {
                    uj50.b(obj);
                    myhVar3 = myhVar5;
                    c9pVar = c9pVar2;
                    b390Var = b390Var2;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            b390Var2.j(e390Var);
            throw th;
        }
        uj50.b(obj);
        e390 e390VarE = b390Var.e();
        try {
            if (myhVar instanceof xde0) {
                c390Var.a = b390Var;
                c390Var.b = myhVar;
                c390Var.c = e390VarE;
                c390Var.i = 1;
                if (((xde0) myhVar).c(c390Var) == y5bVar) {
                    return;
                }
            }
            myhVar2 = myhVar;
            e390Var = e390VarE;
            c9pVar = (c9p) c390Var.getContext().get(c9p.b.a);
            myhVar3 = myhVar2;
        } catch (Throwable th5) {
            b390Var2 = b390Var;
            th = th5;
            e390Var = e390VarE;
        }
        while (true) {
            Object objU = b390Var.u(e390Var);
            if (objU == d390.a) {
                c390Var.a = b390Var;
                c390Var.b = myhVar3;
                c390Var.c = e390Var;
                c390Var.d = c9pVar;
                c390Var.i = 2;
                if (b390Var.k(e390Var, c390Var) == y5bVar) {
                    return;
                }
            } else {
                if (c9pVar != null && !c9pVar.isActive()) {
                    throw c9pVar.getCancellationException();
                }
                c390Var.a = b390Var;
                c390Var.b = myhVar3;
                c390Var.c = e390Var;
                c390Var.d = c9pVar;
                c390Var.i = 3;
                if (myhVar3.emit(objU, c390Var) == y5bVar) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.vtw
    public final boolean a(T t) {
        int i;
        boolean z;
        v1b<Unit>[] v1bVarArrP = z4.a;
        synchronized (this) {
            if (s(t)) {
                v1bVarArrP = p(v1bVarArrP);
                z = true;
            } else {
                z = false;
            }
        }
        for (v1b<Unit> v1bVar : v1bVarArrP) {
            if (v1bVar != null) {
                zi50.a aVar = zi50.b;
                v1bVar.resumeWith(Unit.a);
            }
        }
        return z;
    }

    @Override // defpackage.a390
    public final List<T> c() {
        synchronized (this) {
            int iQ = (int) ((q() + ((long) this.z)) - this.w);
            if (iQ == 0) {
                return m2g.a;
            }
            ArrayList arrayList = new ArrayList(iQ);
            Object[] objArr = this.v;
            objArr.getClass();
            for (int i = 0; i < iQ; i++) {
                arrayList.add(objArr[((int) (this.w + ((long) i))) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super T> myhVar, v1b<?> v1bVar) throws Throwable {
        m(this, myhVar, v1bVar);
        return y5b.a;
    }

    @Override // defpackage.abj
    public final lyh<T> d(CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        return d390.c(this, coroutineContext, i, pb5Var);
    }

    @Override // defpackage.vtw, defpackage.myh
    public final Object emit(T t, v1b<? super Unit> v1bVar) {
        b390<T> b390Var;
        Throwable th;
        v1b<Unit>[] v1bVarArrP;
        a aVar;
        if (a(t)) {
            return Unit.a;
        }
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        v1b<Unit>[] v1bVarArrP2 = z4.a;
        synchronized (this) {
            try {
                if (s(t)) {
                    try {
                        zi50.a aVar2 = zi50.b;
                        bc6Var.resumeWith(Unit.a);
                        v1bVarArrP = p(v1bVarArrP2);
                        aVar = null;
                        b390Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        b390Var = this;
                        throw th;
                    }
                } else {
                    try {
                        b390Var = this;
                        try {
                            a aVar3 = new a(b390Var, q() + ((long) (this.z + this.A)), t, bc6Var);
                            b390Var.o(aVar3);
                            b390Var.A++;
                            if (b390Var.f == 0) {
                                v1bVarArrP2 = b390Var.p(v1bVarArrP2);
                            }
                            v1bVarArrP = v1bVarArrP2;
                            aVar = aVar3;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        b390Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (aVar != null) {
                    bc6Var.u(new gte(aVar));
                }
                for (v1b<Unit> v1bVar2 : v1bVarArrP) {
                    if (v1bVar2 != null) {
                        zi50.a aVar4 = zi50.b;
                        v1bVar2.resumeWith(Unit.a);
                    }
                }
                Object objO = bc6Var.o();
                y5b y5bVar = y5b.a;
                if (objO != y5bVar) {
                    objO = Unit.a;
                }
                return objO == y5bVar ? objO : Unit.a;
            } catch (Throwable th5) {
                th = th5;
                b390Var = this;
            }
        }
    }

    @Override // defpackage.y4
    public final a5 f() {
        return new e390();
    }

    @Override // defpackage.vtw
    public final void h() throws Throwable {
        b390<T> b390Var;
        synchronized (this) {
            try {
                b390Var = this;
                try {
                    b390Var.v(q() + ((long) this.z), this.y, q() + ((long) this.z), q() + ((long) this.z) + ((long) this.A));
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                b390Var = this;
            }
        }
    }

    @Override // defpackage.y4
    public final a5[] i() {
        return new e390[2];
    }

    public final Object k(e390 e390Var, c390 c390Var) throws Throwable {
        bc6 bc6Var = new bc6(1, yzo.b(c390Var));
        bc6Var.q();
        synchronized (this) {
            try {
                if (t(e390Var) < 0) {
                    e390Var.b = bc6Var;
                } else {
                    zi50.a aVar = zi50.b;
                    bc6Var.resumeWith(Unit.a);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objO = bc6Var.o();
        return objO == y5b.a ? objO : Unit.a;
    }

    public final void l() {
        if (this.f != 0 || this.A > 1) {
            Object[] objArr = this.v;
            objArr.getClass();
            while (this.A > 0) {
                long jQ = q();
                int i = this.z;
                int i2 = this.A;
                if (objArr[((int) ((jQ + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != d390.a) {
                    return;
                }
                this.A = i2 - 1;
                d390.d(objArr, q() + ((long) (this.z + this.A)), null);
            }
        }
    }

    public final void n() {
        Object[] objArr;
        Object[] objArr2 = this.v;
        objArr2.getClass();
        d390.d(objArr2, q(), null);
        this.z--;
        long jQ = q() + 1;
        if (this.w < jQ) {
            this.w = jQ;
        }
        if (this.y < jQ) {
            if (this.b != 0 && (objArr = this.a) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        e390 e390Var = (e390) obj;
                        long j = e390Var.a;
                        if (j >= 0 && j < jQ) {
                            e390Var.a = jQ;
                        }
                    }
                }
            }
            this.y = jQ;
        }
    }

    public final void o(Object obj) {
        int i = this.z + this.A;
        Object[] objArrR = this.v;
        if (objArrR == null) {
            objArrR = r(0, 2, null);
        } else if (i >= objArrR.length) {
            objArrR = r(i, objArrR.length * 2, objArrR);
        }
        d390.d(objArrR, q() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [v1b<kotlin.Unit>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final v1b<Unit>[] p(v1b<Unit>[] v1bVarArr) {
        Object[] objArr;
        e390 e390Var;
        bc6 bc6Var;
        int length = v1bVarArr.length;
        if (this.b != 0 && (objArr = this.a) != null) {
            int length2 = objArr.length;
            int i = 0;
            while (i < length2) {
                Object obj = objArr[i];
                if (obj == null || (bc6Var = (e390Var = (e390) obj).b) == null || t(e390Var) < 0) {
                    v1bVarArr = v1bVarArr;
                } else {
                    if (length >= v1bVarArr.length) {
                        v1bVarArr = v1bVarArr;
                        v1bVarArr = v1bVarArr;
                        v1bVarArr = Arrays.copyOf((Object[]) v1bVarArr, Math.max(2, v1bVarArr.length * 2));
                    }
                    v1bVarArr = v1bVarArr;
                    v1bVarArr = v1bVarArr;
                    ((v1b[]) v1bVarArr)[length] = bc6Var;
                    e390Var.b = null;
                    length++;
                }
                i++;
                v1bVarArr = v1bVarArr;
            }
            v1bVarArr = v1bVarArr;
        }
        return (v1b[]) v1bVarArr;
    }

    public final long q() {
        return Math.min(this.y, this.w);
    }

    public final Object[] r(int i, int i2, Object[] objArr) {
        if (i2 <= 0) {
            ib5.a("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.v = objArr2;
        if (objArr != null) {
            long jQ = q();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jQ;
                d390.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    public final boolean s(T t) {
        int i;
        long jQ;
        long j;
        int i2 = this.b;
        int i3 = this.e;
        if (i2 != 0) {
            int i4 = this.z;
            int i5 = this.f;
            if (i4 < i5 || this.y > this.w) {
                o(t);
                i = this.z + 1;
                this.z = i;
                if (i > i5) {
                    n();
                }
                jQ = q() + ((long) this.z);
                j = this.w;
                if (((int) (jQ - j)) > i3) {
                    v(1 + j, this.y, q() + ((long) this.z), q() + ((long) this.z) + ((long) this.A));
                }
            } else {
                int iOrdinal = this.i.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal == 1) {
                    o(t);
                    i = this.z + 1;
                    this.z = i;
                    if (i > i5) {
                        n();
                    }
                    jQ = q() + ((long) this.z);
                    j = this.w;
                    if (((int) (jQ - j)) > i3) {
                        v(1 + j, this.y, q() + ((long) this.z), q() + ((long) this.z) + ((long) this.A));
                    }
                } else if (iOrdinal != 2) {
                    uhc.a();
                    return false;
                }
            }
        } else if (i3 != 0) {
            o(t);
            int i6 = this.z + 1;
            this.z = i6;
            if (i6 > i3) {
                n();
            }
            this.y = q() + ((long) this.z);
            return true;
        }
        return true;
    }

    public final long t(e390 e390Var) {
        long j = e390Var.a;
        if (j >= q() + ((long) this.z) && (this.f > 0 || j > q() || this.A == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object u(e390 e390Var) {
        Object obj;
        v1b<Unit>[] v1bVarArrW = z4.a;
        synchronized (this) {
            try {
                long jT = t(e390Var);
                if (jT < 0) {
                    obj = d390.a;
                } else {
                    long j = e390Var.a;
                    Object[] objArr = this.v;
                    objArr.getClass();
                    Object obj2 = objArr[((int) jT) & (objArr.length - 1)];
                    if (obj2 instanceof a) {
                        obj2 = ((a) obj2).c;
                    }
                    e390Var.a = jT + 1;
                    Object obj3 = obj2;
                    v1bVarArrW = w(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (v1b<Unit> v1bVar : v1bVarArrW) {
            if (v1bVar != null) {
                zi50.a aVar = zi50.b;
                v1bVar.resumeWith(Unit.a);
            }
        }
        return obj;
    }

    public final void v(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jQ = q(); jQ < jMin; jQ++) {
            Object[] objArr = this.v;
            objArr.getClass();
            d390.d(objArr, jQ, null);
        }
        this.w = j;
        this.y = j2;
        this.z = (int) (j3 - jMin);
        this.A = (int) (j4 - j3);
    }

    public final v1b<Unit>[] w(long j) {
        long j2;
        long j3;
        long j4;
        v1b<Unit>[] v1bVarArr;
        Object[] objArr;
        long j5 = this.y;
        v1b<Unit>[] v1bVarArr2 = z4.a;
        if (j <= j5) {
            long jQ = q();
            long j6 = ((long) this.z) + jQ;
            int i = this.f;
            if (i == 0 && this.A > 0) {
                j6++;
            }
            int i2 = 0;
            if (this.b != 0 && (objArr = this.a) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        long j7 = ((e390) obj).a;
                        if (j7 >= 0 && j7 < j6) {
                            j6 = j7;
                        }
                    }
                }
            }
            if (j6 > this.y) {
                long jQ2 = q() + ((long) this.z);
                int i3 = this.b;
                int iMin = this.A;
                if (i3 > 0) {
                    iMin = Math.min(iMin, i - ((int) (jQ2 - j6)));
                }
                long j8 = ((long) this.A) + jQ2;
                toe0 toe0Var = d390.a;
                if (iMin > 0) {
                    v1b<Unit>[] v1bVarArr3 = new v1b[iMin];
                    j4 = 1;
                    Object[] objArr2 = this.v;
                    objArr2.getClass();
                    long j9 = jQ2;
                    while (true) {
                        if (jQ2 >= j8) {
                            j2 = jQ;
                            j3 = j6;
                            break;
                        }
                        j2 = jQ;
                        Object obj2 = objArr2[((int) jQ2) & (objArr2.length - 1)];
                        if (obj2 != toe0Var) {
                            obj2.getClass();
                            a aVar = (a) obj2;
                            int i4 = i2 + 1;
                            j3 = j6;
                            v1bVarArr3[i2] = aVar.d;
                            d390.d(objArr2, jQ2, toe0Var);
                            d390.d(objArr2, j9, aVar.c);
                            j9++;
                            if (i4 >= iMin) {
                                break;
                            }
                            i2 = i4;
                        } else {
                            j3 = j6;
                        }
                        jQ2++;
                        jQ = j2;
                        j6 = j3;
                    }
                    jQ2 = j9;
                    v1bVarArr = v1bVarArr3;
                } else {
                    j2 = jQ;
                    j3 = j6;
                    j4 = 1;
                    v1bVarArr = v1bVarArr2;
                }
                int i5 = (int) (jQ2 - j2);
                long j10 = this.b == 0 ? jQ2 : j3;
                long jMax = Math.max(this.w, jQ2 - ((long) Math.min(this.e, i5)));
                if (i == 0 && jMax < j8) {
                    Object[] objArr3 = this.v;
                    objArr3.getClass();
                    if (Intrinsics.g(objArr3[((int) jMax) & (objArr3.length - 1)], toe0Var)) {
                        jQ2 += j4;
                        jMax += j4;
                    }
                }
                v(jMax, j10, jQ2, j8);
                l();
                return v1bVarArr.length == 0 ? v1bVarArr : p(v1bVarArr);
            }
        }
        return v1bVarArr2;
    }
}
