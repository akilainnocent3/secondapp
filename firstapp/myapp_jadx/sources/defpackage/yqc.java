package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class yqc<T> implements sqc<T> {
    public final skh a;
    public final k6b<T> b;
    public final v5b c;
    public final or60 d;
    public final tuw e;
    public int f;
    public jvd0 g;
    public final src<T> h;
    public final yqc<T>.a i;
    public final mpe0 j;
    public final mpe0 k;
    public final mj90<qnv.a<T>> l;

    public final class a extends x160 {
        public List<? extends Function2<? super ain<T>, ? super v1b<? super Unit>, ? extends Object>> c;
        public final /* synthetic */ yqc<T> d;

        public a(yqc yqcVar, List<? extends Function2<? super ain<T>, ? super v1b<? super Unit>, ? extends Object>> list) {
            list.getClass();
            this.d = yqcVar;
            this.c = CollectionsKt.A0(list);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        
            if (r7 == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
        
            if (r7 == r1) goto L27;
         */
        @Override // defpackage.x160
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(defpackage.x1b r7) throws defpackage.j6b {
            /*
                r6 = this;
                boolean r0 = r7 instanceof defpackage.vqc
                if (r0 == 0) goto L13
                r0 = r7
                vqc r0 = (defpackage.vqc) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                vqc r0 = new vqc
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.b
                y5b r1 = defpackage.y5b.a
                int r2 = r0.d
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L39
                if (r2 == r5) goto L33
                if (r2 != r4) goto L2d
                yqc$a r6 = r0.a
                defpackage.uj50.b(r7)
                goto L5d
            L2d:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r3
            L33:
                yqc$a r6 = r0.a
                defpackage.uj50.b(r7)
                goto L6c
            L39:
                defpackage.uj50.b(r7)
                java.util.List<? extends kotlin.jvm.functions.Function2<? super ain<T>, ? super v1b<? super kotlin.Unit>, ? extends java.lang.Object>> r7 = r6.c
                yqc<T> r2 = r6.d
                if (r7 == 0) goto L60
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L49
                goto L60
            L49:
                wxo r7 = r2.b()
                xqc r5 = new xqc
                r5.<init>(r2, r6, r3)
                r0.a = r6
                r0.d = r4
                java.lang.Object r7 = r7.e(r5, r0)
                if (r7 != r1) goto L5d
                goto L6b
            L5d:
                ioc r7 = (defpackage.ioc) r7
                goto L6e
            L60:
                r0.a = r6
                r0.d = r5
                r7 = 0
                java.lang.Object r7 = r2.g(r7, r0)
                if (r7 != r1) goto L6c
            L6b:
                return r1
            L6c:
                ioc r7 = (defpackage.ioc) r7
            L6e:
                yqc<T> r6 = r6.d
                src<T> r6 = r6.h
                r6.b(r7)
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: yqc.a.a(x1b):java.lang.Object");
        }
    }

    @c0d(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, 304}, m = "readDataAndUpdateCache")
    public static final class b extends x1b {
        public yqc a;
        public swd0 b;
        public boolean c;
        public /* synthetic */ Object d;
        public final /* synthetic */ yqc<T> e;
        public int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(yqc<T> yqcVar, v1b<? super b> v1bVar) {
            super(v1bVar);
            this.e = yqcVar;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return this.e.f(false, this);
        }
    }

    @c0d(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, 300}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function1<v1b<? super Pair<? extends swd0<T>, ? extends Boolean>>, Object> {
        public Throwable a;
        public int b;
        public final /* synthetic */ yqc<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(yqc<T> yqcVar, v1b<? super c> v1bVar) {
            super(1, v1bVar);
            this.c = yqcVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new c(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((c) create((v1b) obj)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            swd0 m340Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            yqc<T> yqcVar = this.c;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    this.b = 1;
                    obj = yqcVar.g(true, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = this.a;
                        uj50.b(obj);
                        m340Var = new m340(((Number) obj).intValue(), th);
                        return new Pair(m340Var, Boolean.TRUE);
                    }
                    uj50.b(obj);
                }
                m340Var = (swd0) obj;
            } catch (Throwable th2) {
                wxo wxoVarB = yqcVar.b();
                this.a = th2;
                this.b = 2;
                Object objD = wxoVarB.d(this);
                if (objD != y5bVar) {
                    obj = objD;
                    th = th2;
                }
                return y5bVar;
            }
            return new Pair(m340Var, Boolean.TRUE);
        }
    }

    @c0d(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
    public static final class d extends tje0 implements Function2<Boolean, v1b<? super Pair<? extends swd0<T>, ? extends Boolean>>, Object> {
        public Throwable a;
        public int b;
        public /* synthetic */ boolean c;
        public final /* synthetic */ yqc<T> d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(yqc<T> yqcVar, int i, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.d = yqcVar;
            this.e = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(this.d, this.e, v1bVar);
            dVar.c = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, Object obj) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((d) create(bool2, (v1b) obj)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int iIntValue;
            Throwable th;
            boolean z;
            swd0 m340Var;
            ?? r1;
            ?? r2;
            y5b y5bVar = y5b.a;
            ?? r3 = this.b;
            yqc<T> yqcVar = this.d;
            try {
                if (r3 == 0) {
                    uj50.b(obj);
                    boolean z2 = this.c;
                    this.c = z2;
                    this.b = 1;
                    obj = yqcVar.g(z2, this);
                    r3 = z2;
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (r3 != 1) {
                        if (r3 != 2) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = this.c;
                        th = this.a;
                        uj50.b(obj);
                        iIntValue = ((Number) obj).intValue();
                        r2 = z;
                        m340Var = new m340(iIntValue, th);
                        r1 = r2;
                        return new Pair(m340Var, Boolean.valueOf((boolean) r1));
                    }
                    boolean z3 = this.c;
                    uj50.b(obj);
                    r3 = z3;
                }
                m340Var = (swd0) obj;
                r1 = r3;
            } catch (Throwable th2) {
                if (r3 != 0) {
                    wxo wxoVarB = yqcVar.b();
                    this.a = th2;
                    this.c = r3;
                    this.b = 2;
                    Object objD = wxoVarB.d(this);
                    if (objD != y5bVar) {
                        obj = objD;
                        th = th2;
                        z = r3 == true ? 1 : 0;
                    }
                    return y5bVar;
                }
                iIntValue = this.e;
                th = th2;
                r2 = r3;
            }
            return new Pair(m340Var, Boolean.valueOf((boolean) r1));
        }
    }

    @c0d(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    public static final class e extends tje0 implements Function2<v5b, v1b<? super T>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ yqc<T> c;
        public final /* synthetic */ Function2<T, v1b<? super T>, Object> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(yqc<T> yqcVar, Function2<? super T, ? super v1b<? super T>, ? extends Object> function2, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.c = yqcVar;
            this.d = function2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = new e(this.c, this.d, v1bVar);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, Object obj) {
            return ((e) create(v5bVar, (v1b) obj)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            v5b v5bVar = (v5b) this.b;
            dm8 dm8VarA = em8.a();
            yqc<T> yqcVar = this.c;
            qnv.a aVar = new qnv.a(this.d, dm8VarA, yqcVar.h.a(), v5bVar.getCoroutineContext());
            mj90<qnv.a<T>> mj90Var = yqcVar.l;
            Object objC = mj90Var.c.c(aVar);
            if (objC instanceof h77.a) {
                Throwable thA = h77.a(objC);
                if (thA == null) {
                    throw new lt7("Channel was closed normally");
                }
                throw thA;
            }
            if (objC instanceof h77.b) {
                ib5.a("Check failed.");
                return null;
            }
            if (mj90Var.d.a.getAndIncrement() == 0) {
                ej5.c(mj90Var.a, null, null, new lj90(mj90Var, null), 3);
            }
            this.a = 1;
            Object objQ = dm8VarA.q(this);
            return objQ == y5bVar ? y5bVar : objQ;
        }
    }

    public yqc(skh skhVar, List list, k6b k6bVar, v5b v5bVar) {
        list.getClass();
        this.a = skhVar;
        this.b = k6bVar;
        this.c = v5bVar;
        this.d = new or60(new arc(this, null));
        this.e = uuw.a();
        this.h = new src<>();
        this.i = new a(this, list);
        this.j = hwr.b(new lrc(this));
        this.k = hwr.b(new zqc(this, 0));
        this.l = new mj90<>(v5bVar, new nrc(this), orc.a, new prc(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        brc brcVar;
        tuw tuwVar;
        if (x1bVar instanceof brc) {
            brcVar = (brc) x1bVar;
            int i = brcVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                brcVar.e = i - Integer.MIN_VALUE;
            } else {
                brcVar = new brc(this, x1bVar);
            }
        } else {
            brcVar = new brc(this, x1bVar);
        }
        Object obj = brcVar.c;
        y5b y5bVar = y5b.a;
        int i2 = brcVar.e;
        if (i2 == 0) {
            uj50.b(obj);
            brcVar.a = this;
            tuwVar = this.e;
            brcVar.b = tuwVar;
            brcVar.e = 1;
            if (tuwVar.d(brcVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuw tuwVar2 = brcVar.b;
            yqc<T> yqcVar = brcVar.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            this = yqcVar;
        }
        try {
            int i3 = this.f - 1;
            this.f = i3;
            if (i3 == 0) {
                jvd0 jvd0Var = this.g;
                if (jvd0Var != null) {
                    jvd0Var.cancel((CancellationException) null);
                }
                this.g = null;
            }
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            tuwVar.f(null);
        }
    }

    public final wxo b() {
        return (wxo) this.k.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = (defpackage.yqc<T>) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [yqc, yqc<T>] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16, types: [yqc] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [cm8] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(qnv.a r10, defpackage.x1b r11) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqc.c(qnv$a, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(x1b x1bVar) {
        erc ercVar;
        tuw tuwVar;
        if (x1bVar instanceof erc) {
            ercVar = (erc) x1bVar;
            int i = ercVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ercVar.e = i - Integer.MIN_VALUE;
            } else {
                ercVar = new erc(this, x1bVar);
            }
        } else {
            ercVar = new erc(this, x1bVar);
        }
        Object obj = ercVar.c;
        y5b y5bVar = y5b.a;
        int i2 = ercVar.e;
        if (i2 == 0) {
            uj50.b(obj);
            ercVar.a = this;
            tuwVar = this.e;
            ercVar.b = tuwVar;
            ercVar.e = 1;
            if (tuwVar.d(ercVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuw tuwVar2 = ercVar.b;
            yqc<T> yqcVar = ercVar.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            this = yqcVar;
        }
        try {
            int i3 = this.f + 1;
            this.f = i3;
            if (i3 == 1) {
                this.g = ej5.c(this.c, null, null, new frc(this, null), 3);
            }
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            tuwVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r2.b(r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.x1b r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.grc
            if (r0 == 0) goto L13
            r0 = r7
            grc r0 = (defpackage.grc) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            grc r0 = new grc
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            int r6 = r0.b
            yqc r0 = r0.a
            defpackage.uj50.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L64
        L2e:
            r7 = move-exception
            goto L6c
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L37:
            yqc r6 = r0.a
            defpackage.uj50.b(r7)
            goto L4f
        L3d:
            defpackage.uj50.b(r7)
            wxo r7 = r6.b()
            r0.a = r6
            r0.e = r4
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L4f
            goto L63
        L4f:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            yqc<T>$a r2 = r6.i     // Catch: java.lang.Throwable -> L67
            r0.a = r6     // Catch: java.lang.Throwable -> L67
            r0.b = r7     // Catch: java.lang.Throwable -> L67
            r0.e = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r6 = r2.b(r0)     // Catch: java.lang.Throwable -> L67
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L67:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L6c:
            src<T> r0 = r0.h
            m340 r1 = new m340
            r1.<init>(r6, r7)
            r0.b(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqc.e(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(boolean z, v1b<? super swd0<T>> v1bVar) {
        b bVar;
        yqc<T> yqcVar;
        swd0<T> swd0Var;
        yqc<T> yqcVar2;
        Pair pair;
        swd0 swd0Var2;
        if (v1bVar instanceof b) {
            bVar = (b) v1bVar;
            int i = bVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, v1bVar);
            }
        } else {
            bVar = new b(this, v1bVar);
        }
        Object objB = bVar.d;
        y5b y5bVar = y5b.a;
        int i2 = bVar.f;
        if (i2 == 0) {
            uj50.b(objB);
            swd0<T> swd0VarA = this.h.a();
            if (swd0VarA instanceof cdh0) {
                ib5.a("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                return null;
            }
            wxo wxoVarB = b();
            bVar.a = this;
            bVar.b = swd0VarA;
            bVar.c = z;
            bVar.f = 1;
            Object objD = wxoVarB.d(bVar);
            if (objD != y5bVar) {
                yqcVar = this;
                swd0Var = swd0VarA;
                objB = objD;
            }
            return y5bVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                yqcVar2 = bVar.a;
                uj50.b(objB);
                pair = (Pair) objB;
                swd0Var2 = (swd0) pair.a;
                if (((Boolean) pair.b).booleanValue()) {
                    yqcVar2.h.b(swd0Var2);
                }
                return swd0Var2;
            }
            if (i2 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yqcVar2 = bVar.a;
            uj50.b(objB);
            pair = (Pair) objB;
            swd0Var2 = (swd0) pair.a;
            if (((Boolean) pair.b).booleanValue()) {
                yqcVar2.h.b(swd0Var2);
            }
            return swd0Var2;
        }
        z = bVar.c;
        swd0Var = bVar.b;
        yqcVar = bVar.a;
        uj50.b(objB);
        int iIntValue = ((Number) objB).intValue();
        boolean z2 = swd0Var instanceof ioc;
        int i3 = z2 ? swd0Var.a : -1;
        if (z2 && iIntValue == i3) {
            return swd0Var;
        }
        if (z) {
            wxo wxoVarB2 = yqcVar.b();
            c cVar = new c(yqcVar, null);
            bVar.a = yqcVar;
            bVar.b = null;
            bVar.f = 2;
            objB = wxoVarB2.e(cVar, bVar);
            if (objB != y5bVar) {
                yqcVar2 = yqcVar;
                pair = (Pair) objB;
                swd0Var2 = (swd0) pair.a;
                if (((Boolean) pair.b).booleanValue()) {
                    yqcVar2.h.b(swd0Var2);
                }
                return swd0Var2;
            }
        } else {
            wxo wxoVarB3 = yqcVar.b();
            d dVar = new d(yqcVar, i3, null);
            bVar.a = yqcVar;
            bVar.b = null;
            bVar.f = 3;
            objB = wxoVarB3.b(dVar, bVar);
            if (objB != y5bVar) {
                yqcVar2 = yqcVar;
                pair = (Pair) objB;
                swd0Var2 = (swd0) pair.a;
                if (((Boolean) pair.b).booleanValue()) {
                    yqcVar2.h.b(swd0Var2);
                }
                return swd0Var2;
            }
        }
        return y5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ab A[Catch: j6b -> 0x005d, TryCatch #2 {j6b -> 0x005d, blocks: (B:19:0x0058, B:54:0x0108, B:24:0x0066, B:51:0x00eb, B:32:0x0083, B:40:0x00ab, B:42:0x00b1, B:36:0x008d, B:48:0x00d9), top: B:81:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0107  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145 A[Catch: all -> 0x0171, TryCatch #0 {all -> 0x0171, blocks: (B:61:0x0133, B:63:0x0145, B:64:0x014d), top: B:78:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x014d A[Catch: all -> 0x0171, TRY_LEAVE, TryCatch #0 {all -> 0x0171, blocks: (B:61:0x0133, B:63:0x0145, B:64:0x014d), top: B:78:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x015d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0165  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(boolean z, x1b x1bVar) throws j6b {
        hrc hrcVar;
        dq40 dq40Var;
        j6b j6bVar;
        yqc<T> yqcVar;
        boolean z2;
        dq40 dq40Var2;
        bq40 bq40Var;
        j6b j6bVar2;
        jrc jrcVar;
        Object objE;
        bq40 bq40Var2;
        dq40 dq40Var3;
        int iHashCode;
        Object objD;
        yqc<T> yqcVar2;
        int i;
        Object obj;
        if (x1bVar instanceof hrc) {
            hrcVar = (hrc) x1bVar;
            int i2 = hrcVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hrcVar.w = i2 - Integer.MIN_VALUE;
            } else {
                hrcVar = new hrc(this, x1bVar);
            }
        } else {
            hrcVar = new hrc(this, x1bVar);
        }
        Object obj2 = (T) hrcVar.i;
        y5b y5bVar = y5b.a;
        try {
            switch (hrcVar.w) {
                case 0:
                    uj50.b(obj2);
                    if (z) {
                        hrcVar.a = this;
                        hrcVar.e = z;
                        hrcVar.w = 1;
                        obj2 = (T) ((l1e0) this.j.getValue()).d(new m1e0(3, null), hrcVar);
                        if (obj2 != y5bVar) {
                            if (obj2 != null) {
                                iHashCode = obj2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            wxo wxoVarB = this.b();
                            hrcVar.a = this;
                            hrcVar.b = obj2;
                            hrcVar.e = z;
                            hrcVar.f = iHashCode;
                            hrcVar.w = 2;
                            objD = wxoVarB.d(hrcVar);
                            if (objD != y5bVar) {
                                yqcVar2 = this;
                                i = iHashCode;
                                obj = obj2;
                                obj2 = (T) objD;
                                return new ioc(i, ((Number) obj2).intValue(), obj);
                            }
                        }
                    } else {
                        wxo wxoVarB2 = b();
                        hrcVar.a = this;
                        hrcVar.e = z;
                        hrcVar.w = 3;
                        obj2 = (T) wxoVarB2.d(hrcVar);
                        if (obj2 != y5bVar) {
                            int iIntValue = ((Number) obj2).intValue();
                            wxo wxoVarB3 = this.b();
                            irc ircVar = new irc(this, iIntValue, null);
                            hrcVar.a = this;
                            hrcVar.e = z;
                            hrcVar.w = 4;
                            obj2 = (T) wxoVarB3.b(ircVar, hrcVar);
                            if (obj2 == y5bVar) {
                            }
                            return (ioc) obj2;
                        }
                    }
                    return y5bVar;
                case 1:
                    z = hrcVar.e;
                    this = (yqc) hrcVar.a;
                    uj50.b(obj2);
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    wxo wxoVarB4 = this.b();
                    hrcVar.a = this;
                    hrcVar.b = obj2;
                    hrcVar.e = z;
                    hrcVar.f = iHashCode;
                    hrcVar.w = 2;
                    objD = wxoVarB4.d(hrcVar);
                    if (objD != y5bVar) {
                        yqcVar2 = this;
                        i = iHashCode;
                        obj = obj2;
                        obj2 = (T) objD;
                        return new ioc(i, ((Number) obj2).intValue(), obj);
                    }
                    return y5bVar;
                case 2:
                    i = hrcVar.f;
                    z = hrcVar.e;
                    obj = hrcVar.b;
                    yqcVar2 = (yqc) hrcVar.a;
                    try {
                        uj50.b(obj2);
                        return new ioc(i, ((Number) obj2).intValue(), obj);
                    } catch (j6b e2) {
                        e = e2;
                        this = yqcVar2;
                        dq40Var = new dq40();
                        k6b<T> k6bVar = this.b;
                        hrcVar.a = this;
                        hrcVar.b = e;
                        hrcVar.c = dq40Var;
                        hrcVar.d = dq40Var;
                        hrcVar.e = z;
                        hrcVar.w = 5;
                        Object objC = k6bVar.c(e);
                        if (objC != y5bVar) {
                            j6bVar = e;
                            obj2 = (T) objC;
                            yqcVar = this;
                            z2 = z;
                            dq40Var2 = dq40Var;
                            dq40Var2.a = (T) obj2;
                            bq40Var = new bq40();
                            try {
                                jrcVar = new jrc(dq40Var, yqcVar, bq40Var, null);
                                hrcVar.a = j6bVar;
                                hrcVar.b = dq40Var;
                                hrcVar.c = bq40Var;
                                hrcVar.d = null;
                                hrcVar.w = 6;
                                if (z2) {
                                    yqcVar.getClass();
                                    objE = jrcVar.invoke(hrcVar);
                                } else {
                                    objE = yqcVar.b().e(new crc(jrcVar, null), hrcVar);
                                }
                                if (objE != y5bVar) {
                                    bq40Var2 = bq40Var;
                                    dq40Var3 = dq40Var;
                                    T t = dq40Var3.a;
                                    return new ioc(t != null ? t.hashCode() : 0, bq40Var2.a, t);
                                }
                            } catch (Throwable th) {
                                th = th;
                                j6bVar2 = j6bVar;
                                rtg.a(j6bVar2, th);
                                throw j6bVar2;
                            }
                        }
                        return y5bVar;
                    }
                case 3:
                    z = hrcVar.e;
                    this = (yqc) hrcVar.a;
                    uj50.b(obj2);
                    int iIntValue2 = ((Number) obj2).intValue();
                    wxo wxoVarB5 = this.b();
                    irc ircVar2 = new irc(this, iIntValue2, null);
                    hrcVar.a = this;
                    hrcVar.e = z;
                    hrcVar.w = 4;
                    obj2 = (T) wxoVarB5.b(ircVar2, hrcVar);
                    if (obj2 == y5bVar) {
                        return y5bVar;
                    }
                    return (ioc) obj2;
                case 4:
                    boolean z3 = hrcVar.e;
                    uj50.b(obj2);
                    return (ioc) obj2;
                case 5:
                    z2 = hrcVar.e;
                    dq40Var2 = hrcVar.d;
                    dq40Var = (dq40) hrcVar.c;
                    j6bVar = (j6b) hrcVar.b;
                    yqcVar = (yqc) hrcVar.a;
                    uj50.b(obj2);
                    dq40Var2.a = (T) obj2;
                    bq40Var = new bq40();
                    jrcVar = new jrc(dq40Var, yqcVar, bq40Var, null);
                    hrcVar.a = j6bVar;
                    hrcVar.b = dq40Var;
                    hrcVar.c = bq40Var;
                    hrcVar.d = null;
                    hrcVar.w = 6;
                    if (z2) {
                        yqcVar.getClass();
                        objE = jrcVar.invoke(hrcVar);
                    } else {
                        objE = yqcVar.b().e(new crc(jrcVar, null), hrcVar);
                    }
                    if (objE != y5bVar) {
                        bq40Var2 = bq40Var;
                        dq40Var3 = dq40Var;
                        T t2 = dq40Var3.a;
                        return new ioc(t2 != null ? t2.hashCode() : 0, bq40Var2.a, t2);
                    }
                    return y5bVar;
                case 6:
                    bq40Var2 = (bq40) hrcVar.c;
                    dq40Var3 = (dq40) hrcVar.b;
                    j6bVar2 = (j6b) hrcVar.a;
                    try {
                        uj50.b(obj2);
                        T t3 = dq40Var3.a;
                        return new ioc(t3 != null ? t3.hashCode() : 0, bq40Var2.a, t3);
                    } catch (Throwable th2) {
                        th = th2;
                        rtg.a(j6bVar2, th);
                        throw j6bVar2;
                    }
                default:
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (j6b e3) {
            e = e3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Object obj, boolean z, x1b x1bVar) {
        qrc qrcVar;
        bq40 bq40Var;
        if (x1bVar instanceof qrc) {
            qrcVar = (qrc) x1bVar;
            int i = qrcVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qrcVar.d = i - Integer.MIN_VALUE;
            } else {
                qrcVar = new qrc(this, x1bVar);
            }
        } else {
            qrcVar = new qrc(this, x1bVar);
        }
        Object obj2 = qrcVar.b;
        y5b y5bVar = y5b.a;
        int i2 = qrcVar.d;
        if (i2 == 0) {
            uj50.b(obj2);
            bq40 bq40Var2 = new bq40();
            l1e0 l1e0Var = (l1e0) this.j.getValue();
            rrc rrcVar = new rrc(bq40Var2, this, obj, z, null);
            qrcVar.a = bq40Var2;
            qrcVar.d = 1;
            if (l1e0Var.a(rrcVar, qrcVar) == y5bVar) {
                return y5bVar;
            }
            bq40Var = bq40Var2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bq40Var = qrcVar.a;
            uj50.b(obj2);
        }
        return new Integer(bq40Var.a);
    }

    @Override // defpackage.sqc
    public final lyh<T> k() {
        return this.d;
    }

    @Override // defpackage.sqc
    public final Object l(Function2<? super T, ? super v1b<? super T>, ? extends Object> function2, v1b<? super T> v1bVar) {
        jlh0 jlh0Var = (jlh0) v1bVar.getContext().get(ilh0.a);
        if (jlh0Var != null) {
            jlh0Var.a(this);
        }
        return ej5.d(new jlh0(jlh0Var, this), new e(this, function2, null), v1bVar);
    }
}
