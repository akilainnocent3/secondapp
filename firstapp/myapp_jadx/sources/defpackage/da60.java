package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class da60 extends j8i0 {
    public final iua0 a;
    public final k5b b;
    public final wwd0 c;
    public final v340 d;
    public final wwd0 e;
    public final v340 f;

    @c0d(c = "com.sportygames.speedybingo.presentation.bethsitory.SBBetHistoryViewModel$loadMoreState$1", f = "SBBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements gaj<mk50<? extends f860.a>, f860, v1b<? super re60>, Object> {
        public /* synthetic */ mk50 a;
        public /* synthetic */ f860 b;

        @Override // defpackage.gaj
        public final Object invoke(mk50<? extends f860.a> mk50Var, f860 f860Var, v1b<? super re60> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.a = mk50Var;
            aVar.b = f860Var;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            mk50 mk50Var = this.a;
            f860 f860Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (Intrinsics.g(f860Var, f860.b.a)) {
                return re60.c.a;
            }
            if (!(f860Var instanceof f860.a)) {
                uhc.a();
                return null;
            }
            if (Intrinsics.g(mk50Var, mk50.b.a)) {
                return re60.b.a;
            }
            if (mk50Var instanceof mk50.a) {
                return re60.c.a;
            }
            if (mk50Var instanceof mk50.c) {
                return ((f860.a) f860Var).b ? re60.c.a : re60.a.a;
            }
            uhc.a();
            return null;
        }
    }

    public static final class b implements lyh<f860.a> {
        public final /* synthetic */ wwd0 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: da60$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.speedybingo.presentation.bethsitory.SBBetHistoryViewModel$special$$inlined$map$1$2", f = "SBBetHistoryViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0480a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0480a(v1b v1bVar) {
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
                C0480a c0480a;
                if (v1bVar instanceof C0480a) {
                    c0480a = (C0480a) v1bVar;
                    int i = c0480a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0480a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0480a = new C0480a(v1bVar);
                    }
                } else {
                    c0480a = new C0480a(v1bVar);
                }
                Object obj2 = c0480a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0480a.b;
                f860.a aVar = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    mk50 mk50Var = (mk50) obj;
                    if (!(mk50Var instanceof mk50.a) && !Intrinsics.g(mk50Var, mk50.b.a)) {
                        if (!(mk50Var instanceof mk50.c)) {
                            uhc.a();
                            return null;
                        }
                        aVar = (f860.a) ((mk50.c) mk50Var).a;
                    }
                    c0480a.b = 1;
                    if (this.a.emit(aVar, c0480a) == y5bVar) {
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
        public final Object collect(myh<? super f860.a> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new a(myhVar), v1bVar);
            return y5b.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.bethsitory.SBBetHistoryViewModel$state$1", f = "SBBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements jaj<mk50<? extends f860.a>, re60, qcn<? extends Integer>, f860, v1b<? super u860>, Object> {
        public /* synthetic */ mk50 a;
        public /* synthetic */ re60 b;
        public /* synthetic */ qcn c;
        public /* synthetic */ f860 d;

        public c(v1b<? super c> v1bVar) {
            super(5, v1bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            mk50 mk50Var = this.a;
            re60 re60Var = this.b;
            qcn qcnVar = this.c;
            f860 f860Var = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            uc60 aVar = null;
            if (mk50Var instanceof mk50.a) {
                Throwable th = ((mk50.a) mk50Var).a;
                if (th instanceof wjd0) {
                    String str = ((wjd0) th).b;
                    if (StringsKt.U(str)) {
                        str = null;
                    }
                    if (str != null) {
                        aVar = new uc60.b(str);
                    }
                }
                if (aVar == null) {
                    aVar = new uc60.a(ma60.B0.d.d);
                }
                return new u860.a(aVar);
            }
            if (!Intrinsics.g(mk50Var, mk50.b.a)) {
                if (mk50Var instanceof mk50.c) {
                    return t860.a((f860.a) ((mk50.c) mk50Var).a, re60Var, qcnVar);
                }
                uhc.a();
                return null;
            }
            if (f860Var instanceof f860.a) {
                return t860.a((f860.a) f860Var, re60Var, qcnVar);
            }
            if (Intrinsics.g(f860Var, f860.b.a)) {
                return u860.c.a;
            }
            uhc.a();
            return null;
        }

        @Override // defpackage.jaj
        public final Object l(mk50<? extends f860.a> mk50Var, re60 re60Var, qcn<? extends Integer> qcnVar, f860 f860Var, v1b<? super u860> v1bVar) {
            c cVar = da60.this.new c(v1bVar);
            cVar.a = mk50Var;
            cVar.b = re60Var;
            cVar.c = qcnVar;
            cVar.d = f860Var;
            return cVar.invokeSuspend(Unit.a);
        }
    }

    public da60(iua0 iua0Var, k5b k5bVar) {
        iua0Var.getClass();
        k5bVar.getClass();
        this.a = iua0Var;
        this.b = k5bVar;
        wwd0 wwd0VarA = xwd0.a(mk50.b.a);
        this.c = wwd0VarA;
        f1i f1iVar = new f1i(new b(wwd0VarA));
        f860.b bVar = f860.b.a;
        lyh lyhVarC = ozh.c(f1iVar, k5bVar);
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(lyhVarC, et7VarD, kwd0Var, bVar);
        this.d = v340VarE;
        n1i n1iVar = new n1i(wwd0VarA, v340VarE, new a(3, null));
        v340 v340VarE2 = e1i.e(ozh.c(n1iVar, k5bVar), o8i0.d(this), kwd0Var, re60.c.a);
        wwd0 wwd0VarA2 = xwd0.a(n1a0.c);
        this.e = wwd0VarA2;
        l1i l1iVarB = r1i.b(wwd0VarA, v340VarE2, wwd0VarA2, v340VarE, new c(null));
        this.f = e1i.e(ozh.c(l1iVarB, k5bVar), o8i0.d(this), kwd0Var, u860.c.a);
    }

    public final void x1(Integer num) {
        kzh.d(ozh.c(new g1i(em50.a(new ba60(this.a.c(num), this)), new ca60(this, null)), this.b), o8i0.d(this));
    }
}
