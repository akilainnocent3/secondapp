package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$1", f = "LNPlaceBetViewModel.kt", l = {594}, m = "invokeSuspend", v = 2)
public final class w1r extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f2r b;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$1$2", f = "LNPlaceBetViewModel.kt", l = {598, 599, 612, 616, 622, 624}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<qxp, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ f2r c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, f2r f2rVar) {
            super(2, v1bVar);
            this.c = f2rVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(v1bVar, this.c);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qxp qxpVar, v1b<? super Unit> v1bVar) {
            return ((a) create(qxpVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:51:0x00f1 A[PHI: r12
          0x00f1: PHI (r12v4 java.lang.String) = (r12v3 java.lang.String), (r12v11 java.lang.String) binds: [B:44:0x00e0, B:49:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:55:0x0100  */
        /* JADX WARN: Code duplicated, block: B:57:0x0106  */
        /* JADX WARN: Code duplicated, block: B:60:0x011c A[PHI: r12
          0x011c: PHI (r12v34 java.lang.Object) = (r12v33 java.lang.Object), (r12v0 java.lang.Object) binds: [B:58:0x0119, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:62:0x0124  */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
        
            if (r3.a.emit(r12, r11) == r5) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0146, code lost:
        
            if (r12.g(r11, r0) == r5) goto L64;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: w1r.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b implements lyh<qxp> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$1$invokeSuspend$$inlined$mapNotNull$1", f = "LNPlaceBetViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: w1r$b$b, reason: collision with other inner class name */
        public static final class C1234b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: w1r$b$b$a */
            @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "LNPlaceBetViewModel.kt", l = {52}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C1234b.this.emit(null, this);
                }
            }

            public C1234b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objI = bm50.i((lk50) obj);
                    if (objI != null) {
                        aVar.b = 1;
                        if (this.a.emit(objI, aVar) == y5bVar) {
                            return y5bVar;
                        }
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

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super qxp> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                C1234b c1234b = new C1234b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c1234b, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1r(v1b v1bVar, f2r f2rVar) {
        super(2, v1bVar);
        this.b = f2rVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new w1r(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((w1r) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            f2r f2rVar = this.b;
            b bVar = new b(f2rVar.O);
            a aVar = new a(null, f2rVar);
            this.a = 1;
            if (kzh.b(bVar, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
