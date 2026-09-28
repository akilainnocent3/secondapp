package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class en30 extends j8i0 implements xl30 {
    public final qr40 a;
    public final k5b b;
    public final wwd0 c;
    public final v340 d;
    public final wwd0 e;
    public final v340 f;

    @c0d(c = "com.sportygames.refscall.conponent.bethsitory.RCBetHistoryViewModel$loadMoreState$1", f = "RCBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements gaj<mk50<? extends rl30.a>, rl30, v1b<? super zo30>, Object> {
        public /* synthetic */ mk50 a;
        public /* synthetic */ rl30 b;

        @Override // defpackage.gaj
        public final Object invoke(mk50<? extends rl30.a> mk50Var, rl30 rl30Var, v1b<? super zo30> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.a = mk50Var;
            aVar.b = rl30Var;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            mk50 mk50Var = this.a;
            rl30 rl30Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (Intrinsics.g(rl30Var, rl30.b.a)) {
                return zo30.c.a;
            }
            if (!(rl30Var instanceof rl30.a)) {
                uhc.a();
                return null;
            }
            if (Intrinsics.g(mk50Var, mk50.b.a)) {
                return zo30.b.a;
            }
            if (mk50Var instanceof mk50.a) {
                return zo30.c.a;
            }
            if (mk50Var instanceof mk50.c) {
                return ((rl30.a) rl30Var).c ? zo30.c.a : zo30.a.a;
            }
            uhc.a();
            return null;
        }
    }

    public static final class b implements lyh<rl30.a> {
        public final /* synthetic */ wwd0 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: en30$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.refscall.conponent.bethsitory.RCBetHistoryViewModel$special$$inlined$map$1$2", f = "RCBetHistoryViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0530a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0530a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0530a c0530a;
                if (v1bVar instanceof C0530a) {
                    c0530a = (C0530a) v1bVar;
                    int i = c0530a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0530a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0530a = new C0530a(v1bVar);
                    }
                } else {
                    c0530a = new C0530a(v1bVar);
                }
                Object obj2 = c0530a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0530a.b;
                rl30.a aVar = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    mk50 mk50Var = (mk50) obj;
                    if (!(mk50Var instanceof mk50.a) && !Intrinsics.g(mk50Var, mk50.b.a)) {
                        if (!(mk50Var instanceof mk50.c)) {
                            uhc.a();
                            return null;
                        }
                        aVar = (rl30.a) ((mk50.c) mk50Var).a;
                    }
                    c0530a.b = 1;
                    if (this.a.emit(aVar, c0530a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public b(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super rl30.a> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    @c0d(c = "com.sportygames.refscall.conponent.bethsitory.RCBetHistoryViewModel$state$1", f = "RCBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements jaj<mk50<? extends rl30.a>, zo30, qcn<? extends Integer>, rl30, v1b<? super zl30>, Object> {
        public /* synthetic */ mk50 a;
        public /* synthetic */ zo30 b;
        public /* synthetic */ qcn c;
        public /* synthetic */ rl30 d;

        public c(v1b<? super c> v1bVar) {
            super(5, v1bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            mk50 mk50Var = this.a;
            zo30 zo30Var = this.b;
            qcn qcnVar = this.c;
            rl30 rl30Var = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            qn30 aVar = null;
            if (mk50Var instanceof mk50.a) {
                Throwable th = ((mk50.a) mk50Var).a;
                if (th instanceof wjd0) {
                    String str = ((wjd0) th).b;
                    if (StringsKt.U(str)) {
                        str = null;
                    }
                    if (str != null) {
                        aVar = new qn30.b(str);
                    }
                }
                if (aVar == null) {
                    aVar = new qn30.a(jn30.c0.e.d);
                }
                return new zl30.a(aVar);
            }
            if (!Intrinsics.g(mk50Var, mk50.b.a)) {
                if (mk50Var instanceof mk50.c) {
                    return xl30.Y0((rl30.a) ((mk50.c) mk50Var).a, zo30Var, qcnVar);
                }
                uhc.a();
                return null;
            }
            if (rl30Var instanceof rl30.a) {
                return xl30.Y0((rl30.a) rl30Var, zo30Var, qcnVar);
            }
            if (Intrinsics.g(rl30Var, rl30.b.a)) {
                return zl30.c.a;
            }
            uhc.a();
            return null;
        }

        @Override // defpackage.jaj
        public final Object l(mk50<? extends rl30.a> mk50Var, zo30 zo30Var, qcn<? extends Integer> qcnVar, rl30 rl30Var, v1b<? super zl30> v1bVar) {
            c cVar = en30.this.new c(v1bVar);
            cVar.a = mk50Var;
            cVar.b = zo30Var;
            cVar.c = qcnVar;
            cVar.d = rl30Var;
            return cVar.invokeSuspend(Unit.a);
        }
    }

    public en30(qr40 qr40Var, k5b k5bVar) {
        qr40Var.getClass();
        k5bVar.getClass();
        this.a = qr40Var;
        this.b = k5bVar;
        wwd0 wwd0VarA = xwd0.a(mk50.b.a);
        this.c = wwd0VarA;
        f1i f1iVar = new f1i(new b(wwd0VarA));
        rl30.b bVar = rl30.b.a;
        lyh lyhVarC = ozh.c(f1iVar, k5bVar);
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(lyhVarC, et7VarD, kwd0Var, bVar);
        this.d = v340VarE;
        n1i n1iVar = new n1i(wwd0VarA, v340VarE, new a(3, null));
        v340 v340VarE2 = e1i.e(ozh.c(n1iVar, k5bVar), o8i0.d(this), kwd0Var, zo30.c.a);
        wwd0 wwd0VarA2 = xwd0.a(n1a0.c);
        this.e = wwd0VarA2;
        l1i l1iVarB = r1i.b(wwd0VarA, v340VarE2, wwd0VarA2, v340VarE, new c(null));
        this.f = e1i.e(ozh.c(l1iVarB, k5bVar), o8i0.d(this), kwd0Var, zl30.c.a);
    }

    public final void x1(int i) {
        kzh.d(ozh.c(new g1i(em50.a(new cn30(this.a.e(i), this, i)), new dn30(this, null)), this.b), o8i0.d(this));
    }
}
