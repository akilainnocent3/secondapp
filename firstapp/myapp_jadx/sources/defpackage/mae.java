package defpackage;

import com.google.protobuf.Reader;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mae<T> extends oxd0 implements nae<T> {
    public final Function0<T> b;
    public final y5a0<T> c;
    public a<T> d = new a<>(n5a0.g().g());

    public static final class a<T> extends rxd0 {
        public static final Object h = new Object();
        public long c;
        public int d;
        public dtw e;
        public Object f;
        public int g;

        public a(long j) {
            super(j);
            dtw<Object> dtwVar = zby.a;
            dtwVar.getClass();
            this.e = dtwVar;
            this.f = h;
        }

        @Override // defpackage.rxd0
        public final void a(rxd0 rxd0Var) {
            rxd0Var.getClass();
            a aVar = (a) rxd0Var;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
        }

        @Override // defpackage.rxd0
        public final rxd0 b() {
            return new a(n5a0.g().g());
        }

        @Override // defpackage.rxd0
        public final rxd0 c(long j) {
            return new a(j);
        }

        public final boolean d(mae maeVar, c5a0 c5a0Var) {
            boolean z;
            boolean z2;
            Object obj = n5a0.c;
            synchronized (obj) {
                z = true;
                z2 = (this.c == c5a0Var.g() && this.d == c5a0Var.h()) ? false : true;
            }
            if (this.f == h || (z2 && this.g != e(maeVar, c5a0Var))) {
                z = false;
            }
            if (!z || !z2) {
                return z;
            }
            synchronized (obj) {
                this.c = c5a0Var.g();
                this.d = c5a0Var.h();
                Unit unit = Unit.a;
            }
            return z;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x00ce A[DONT_GENERATE, LOOP:3: B:44:0x00cc->B:45:0x00ce, LOOP_END] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1 */
        /* JADX WARN: Type inference failed for: r14v2, types: [int] */
        /* JADX WARN: Type inference failed for: r14v4 */
        /* JADX WARN: Type inference failed for: r15v9, types: [int] */
        public final int e(mae maeVar, c5a0 c5a0Var) {
            dtw dtwVar;
            int iIdentityHashCode;
            int i;
            int i2;
            int i3;
            int i4;
            rxd0 rxd0VarF;
            synchronized (n5a0.c) {
                dtwVar = this.e;
            }
            int i5 = 7;
            if (dtwVar.e == 0) {
                return 7;
            }
            duw<oae> duwVarA = a6a0.a();
            oae[] oaeVarArr = duwVarA.a;
            int i6 = duwVarA.c;
            boolean z = false;
            for (int i7 = 0; i7 < i6; i7++) {
                oaeVarArr[i7].start();
            }
            try {
                Object[] objArr = dtwVar.b;
                int[] iArr = dtwVar.c;
                long[] jArr = dtwVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    iIdentityHashCode = 7;
                    int i8 = 0;
                    while (true) {
                        long j = jArr[i8];
                        if ((((~j) << i5) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8;
                            int i10 = 8 - ((~(i8 - length)) >>> 31);
                            for (?? r14 = z; r14 < i10; r14++) {
                                if ((255 & j) < 128) {
                                    ?? r15 = (i8 << 3) + r14;
                                    i3 = i5;
                                    nxd0 nxd0Var = (nxd0) objArr[r15];
                                    i4 = i9;
                                    if (iArr[r15] == 1) {
                                        if (nxd0Var instanceof mae) {
                                            mae maeVar2 = (mae) nxd0Var;
                                            rxd0VarF = maeVar2.O((a) n5a0.f(maeVar2.d, c5a0Var), c5a0Var, z, maeVar2.b);
                                        } else {
                                            rxd0VarF = n5a0.f(nxd0Var.v(), c5a0Var);
                                        }
                                        iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(rxd0VarF)) * 31) + Long.hashCode(rxd0VarF.a);
                                    }
                                } else {
                                    i3 = i5;
                                    i4 = i9;
                                }
                                j >>= i4;
                                i5 = i3;
                                i9 = i4;
                                length = length;
                                z = false;
                            }
                            i = i5;
                            i2 = length;
                            if (i10 != i9) {
                                break;
                            }
                        } else {
                            i = i5;
                            i2 = length;
                        }
                        if (i8 != i2) {
                            i8++;
                            i5 = i;
                            length = i2;
                            z = false;
                        } else {
                            i5 = iIdentityHashCode;
                        }
                    }
                    Unit unit = Unit.a;
                    return iIdentityHashCode;
                }
                iIdentityHashCode = i5;
                Unit unit2 = Unit.a;
                return iIdentityHashCode;
            } finally {
                oae[] oaeVarArr2 = duwVarA.a;
                int i11 = duwVarA.c;
                for (int i12 = 0; i12 < i11; i12++) {
                    oaeVarArr2[i12].a();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mae(Function0<? extends T> function0, y5a0<T> y5a0Var) {
        this.b = function0;
        this.c = y5a0Var;
    }

    @Override // defpackage.nae
    public final a L() {
        c5a0.e.getClass();
        c5a0 c5a0VarG = n5a0.g();
        return O((a) n5a0.f(this.d, c5a0VarG), c5a0VarG, false, this.b);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x009f A[EDGE_INSN: B:102:0x009f->B:31:0x009f BREAK  A[LOOP:1: B:16:0x004a->B:30:0x009b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009b A[Catch: all -> 0x0039, LOOP:1: B:16:0x004a->B:30:0x009b, LOOP_END, TryCatch #4 {all -> 0x0039, blocks: (B:8:0x0024, B:10:0x0030, B:13:0x003c, B:16:0x004a, B:18:0x005a, B:20:0x0066, B:22:0x0070, B:24:0x0088, B:26:0x008e, B:30:0x009b, B:31:0x009f), top: B:99:0x0024 }] */
    public final a<T> O(a<T> aVar, c5a0 c5a0Var, boolean z, Function0<? extends T> function0) {
        int i;
        y5a0<T> y5a0Var;
        int i2;
        a<T> aVar2 = aVar;
        int i3 = 0;
        if (aVar2.d(this, c5a0Var)) {
            if (z) {
                duw<oae> duwVarA = a6a0.a();
                oae[] oaeVarArr = duwVarA.a;
                int i4 = duwVarA.c;
                for (int i5 = 0; i5 < i4; i5++) {
                    oaeVarArr[i5].start();
                }
                try {
                    dtw dtwVar = aVar2.e;
                    t6a0<qwo> t6a0Var = a6a0.a;
                    qwo qwoVarA = t6a0Var.a();
                    if (qwoVarA == null) {
                        qwoVarA = new qwo(0);
                        t6a0Var.b(qwoVarA);
                    }
                    int i6 = qwoVarA.a;
                    Object[] objArr = dtwVar.b;
                    int[] iArr = dtwVar.c;
                    long[] jArr = dtwVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j = jArr[i7];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i7 != length) {
                                    break;
                                    break;
                                }
                                i7++;
                                i3 = 0;
                            } else {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = i3;
                                while (i10 < i9) {
                                    if ((j & 255) < 128) {
                                        int i11 = (i7 << 3) + i10;
                                        nxd0 nxd0Var = (nxd0) objArr[i11];
                                        i2 = i8;
                                        qwoVarA.a = i6 + iArr[i11];
                                        Function1<Object, Unit> function1E = c5a0Var.e();
                                        if (function1E != null) {
                                            function1E.invoke(nxd0Var);
                                        }
                                    } else {
                                        i2 = i8;
                                    }
                                    j >>= i2;
                                    i10++;
                                    i8 = i2;
                                }
                                if (i9 != i8) {
                                    break;
                                }
                                if (i7 != length) {
                                    break;
                                }
                                i7++;
                                i3 = 0;
                            }
                        }
                    }
                    qwoVarA.a = i6;
                    Unit unit = Unit.a;
                } finally {
                    oae[] oaeVarArr2 = duwVarA.a;
                    int i12 = duwVarA.c;
                    for (int i13 = 0; i13 < i12; i13++) {
                        oaeVarArr2[i13].a();
                    }
                }
            }
            return aVar2;
        }
        final dtw dtwVar2 = new dtw((Object) null);
        t6a0<qwo> t6a0Var2 = a6a0.a;
        final qwo qwoVarA2 = t6a0Var2.a();
        if (qwoVarA2 == null) {
            i = 0;
            qwoVarA2 = new qwo(0);
            t6a0Var2.b(qwoVarA2);
        } else {
            i = 0;
        }
        final int i14 = qwoVarA2.a;
        duw<oae> duwVarA2 = a6a0.a();
        oae[] oaeVarArr3 = duwVarA2.a;
        int i15 = duwVarA2.c;
        for (int i16 = i; i16 < i15; i16++) {
            oaeVarArr3[i16].start();
        }
        try {
            qwoVarA2.a = i14 + 1;
            c5a0.a aVar3 = c5a0.e;
            Function1 function1 = new Function1() { // from class: lae
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    if (obj == this.a) {
                        ib5.a("A derived state calculation cannot read itself");
                        return null;
                    }
                    if (obj instanceof nxd0) {
                        int i17 = qwoVarA2.a - i14;
                        dtw dtwVar3 = dtwVar2;
                        int iD = dtwVar3.d(obj);
                        dtwVar3.h(Math.min(i17, iD >= 0 ? dtwVar3.c[iD] : Reader.READ_DONE), obj);
                    }
                    return Unit.a;
                }
            };
            aVar3.getClass();
            Object objC = c5a0.a.c(function0, function1);
            qwoVarA2.a = i14;
            oae[] oaeVarArr4 = duwVarA2.a;
            int i17 = duwVarA2.c;
            while (i < i17) {
                oaeVarArr4[i].a();
                i++;
            }
            Object obj = n5a0.c;
            synchronized (obj) {
                try {
                    c5a0.e.getClass();
                    c5a0 c5a0VarG = n5a0.g();
                    Object obj2 = aVar2.f;
                    if (obj2 == a.h || (y5a0Var = this.c) == null || !y5a0Var.a((T) objC, (T) obj2)) {
                        a<T> aVar4 = this.d;
                        synchronized (obj) {
                            rxd0 rxd0VarJ = n5a0.j(aVar4, this);
                            rxd0VarJ.a(aVar4);
                            rxd0VarJ.a = c5a0VarG.g();
                            aVar2 = (a) rxd0VarJ;
                            aVar2.e = dtwVar2;
                            aVar2.g = aVar2.e(this, c5a0VarG);
                            aVar2.f = objC;
                        }
                        return aVar2;
                    }
                    aVar2.e = dtwVar2;
                    aVar2.g = aVar2.e(this, c5a0VarG);
                } catch (Throwable th) {
                    throw th;
                }
            }
            qwo qwoVarA3 = a6a0.a.a();
            if (qwoVarA3 == null || qwoVarA3.a != 0) {
                return aVar2;
            }
            n5a0.g().m();
            synchronized (obj) {
                c5a0 c5a0VarG2 = n5a0.g();
                aVar2.c = c5a0VarG2.g();
                aVar2.d = c5a0VarG2.h();
                Unit unit2 = Unit.a;
                return aVar2;
            }
        } catch (Throwable th2) {
            oae[] oaeVarArr5 = duwVarA2.a;
            int i18 = duwVarA2.c;
            for (int i19 = i; i19 < i18; i19++) {
                oaeVarArr5[i19].a();
            }
            throw th2;
        }
    }

    @Override // defpackage.twd0
    public final T getValue() {
        c5a0.e.getClass();
        Function1<Object, Unit> function1E = n5a0.g().e();
        if (function1E != null) {
            function1E.invoke(this);
        }
        c5a0 c5a0VarG = n5a0.g();
        return (T) O((a) n5a0.f(this.d, c5a0VarG), c5a0VarG, true, this.b).f;
    }

    @Override // defpackage.nae
    public final y5a0<T> h() {
        return this.c;
    }

    @Override // defpackage.nxd0
    public final void n(rxd0 rxd0Var) {
        this.d = (a) rxd0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        a aVar = (a) n5a0.e(this.d);
        c5a0.e.getClass();
        sb.append(aVar.d(this, n5a0.g()) ? String.valueOf(aVar.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @Override // defpackage.nxd0
    public final rxd0 v() {
        return this.d;
    }
}
