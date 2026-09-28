package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipSocketUpdater$2", f = "BetslipSocketUpdater.kt", l = {61}, m = "invokeSuspend", v = 2)
public final class sv3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ uv3 b;

    @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipSocketUpdater$2$2", f = "BetslipSocketUpdater.kt", l = {63, 65}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ boolean b;
        public final /* synthetic */ uv3 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(uv3 uv3Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = uv3Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        
            if (r6.t0(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        
            if (r6.F0(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        
            return r1;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                boolean r0 = r5.b
                y5b r1 = defpackage.y5b.a
                int r2 = r5.a
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1a
                if (r2 == r4) goto L16
                if (r2 != r3) goto Lf
                goto L16
            Lf:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L16:
                defpackage.uj50.b(r6)
                goto L3b
            L1a:
                defpackage.uj50.b(r6)
                uv3 r6 = r5.c
                pv3 r2 = r6.f
                jrm r6 = r6.a
                if (r0 == 0) goto L30
                r5.b = r0
                r5.a = r4
                java.lang.Object r5 = r6.t0(r2, r5)
                if (r5 != r1) goto L3b
                goto L3a
            L30:
                r5.b = r0
                r5.a = r3
                kotlin.Unit r5 = r6.F0(r2, r5)
                if (r5 != r1) goto L3b
            L3a:
                return r1
            L3b:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: sv3.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b implements lyh<Boolean> {
        public final /* synthetic */ d0i a;

        @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipSocketUpdater$2$invokeSuspend$$inlined$map$1", f = "BetslipSocketUpdater.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: sv3$b$b, reason: collision with other inner class name */
        public static final class C1106b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: sv3$b$b$a */
            @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipSocketUpdater$2$invokeSuspend$$inlined$map$1$2", f = "BetslipSocketUpdater.kt", l = {50}, m = "emit", v = 2)
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
                    return C1106b.this.emit(null, this);
                }
            }

            public C1106b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
                    Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
                    aVar.b = 1;
                    if (this.a.emit(boolValueOf, aVar) == y5bVar) {
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

        public b(d0i d0iVar) {
            this.a = d0iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
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
                C1106b c1106b = new C1106b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c1106b, aVar) == y5bVar) {
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
    public sv3(uv3 uv3Var, v1b<? super sv3> v1bVar) {
        super(2, v1bVar);
        this.b = uv3Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sv3(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sv3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            uv3 uv3Var = this.b;
            lyh lyhVarB = uzh.b(new b(fc4.a(uv3Var.d.b(), 1)));
            a aVar = new a(uv3Var, null);
            this.a = 1;
            if (kzh.b(lyhVarB, aVar, this) == y5bVar) {
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
