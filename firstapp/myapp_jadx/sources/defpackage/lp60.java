package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snm.SNMMapper$getMarketStateFlow$1", f = "SNMMapper.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lp60 extends tje0 implements Function2<ez20<? super zsq>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ lyh<String> b;
    public final /* synthetic */ lyh<ssq> c;
    public final /* synthetic */ lyh<dqh0> d;
    public final /* synthetic */ lyh<qxp> e;
    public final /* synthetic */ ssq f;
    public final /* synthetic */ np60 i;
    public final /* synthetic */ lyh<zxq.h> v;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snm.SNMMapper$getMarketStateFlow$1$1", f = "SNMMapper.kt", l = {196}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ lyh<zxq.h> b;
        public final /* synthetic */ wwd0 c;
        public final /* synthetic */ np60 d;
        public final /* synthetic */ wwd0 e;
        public final /* synthetic */ wwd0 f;

        /* JADX INFO: renamed from: lp60$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snm.SNMMapper$getMarketStateFlow$1$1$1", f = "SNMMapper.kt", l = {210, 219}, m = "invokeSuspend", v = 2)
        public static final class C0825a extends tje0 implements Function2<zxq.h, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ wwd0 c;
            public final /* synthetic */ np60 d;
            public final /* synthetic */ wwd0 e;
            public final /* synthetic */ wwd0 f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0825a(wwd0 wwd0Var, np60 np60Var, wwd0 wwd0Var2, wwd0 wwd0Var3, v1b v1bVar) {
                super(2, v1bVar);
                this.c = wwd0Var;
                this.d = np60Var;
                this.e = wwd0Var2;
                this.f = wwd0Var3;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0825a c0825a = new C0825a(this.c, this.d, this.e, this.f, v1bVar);
                c0825a.b = obj;
                return c0825a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(zxq.h hVar, v1b<? super Unit> v1bVar) {
                return ((C0825a) create(hVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
            
                if (kotlin.Unit.a == r2) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
            
                if (kotlin.Unit.a == r2) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
            
                return r2;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    np60 r0 = r7.d
                    rdd0 r0 = r0.b
                    java.lang.Object r1 = r7.b
                    zxq$h r1 = (zxq.h) r1
                    y5b r2 = defpackage.y5b.a
                    int r3 = r7.a
                    r4 = 0
                    r5 = 2
                    r6 = 1
                    if (r3 == 0) goto L20
                    if (r3 == r6) goto L1c
                    if (r3 != r5) goto L16
                    goto L1c
                L16:
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r7)
                    return r4
                L1c:
                    defpackage.uj50.b(r8)
                    goto L8f
                L20:
                    defpackage.uj50.b(r8)
                    boolean r8 = r1 instanceof defpackage.jp60
                    if (r8 == 0) goto L8f
                    r8 = r1
                    jp60 r8 = (defpackage.jp60) r8
                    boolean r3 = r8 instanceof jp60.c
                    if (r3 == 0) goto L4a
                L2e:
                    wwd0 r8 = r7.c
                    java.lang.Object r0 = r8.getValue()
                    r2 = r0
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    r2.getClass()
                    r2 = r1
                    jp60$c r2 = (jp60.c) r2
                    boolean r2 = r2.a
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    boolean r8 = r8.g(r0, r2)
                    if (r8 == 0) goto L2e
                    goto L8f
                L4a:
                    boolean r3 = r8 instanceof jp60.a
                    if (r3 == 0) goto L6c
                    cjr$e r8 = new cjr$e
                    r8.<init>(r6)
                    defpackage.djr.a(r0, r8)
                    jp60$a r1 = (jp60.a) r1
                    boolean r8 = r1.a
                    java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                    r7.b = r4
                    r7.a = r6
                    wwd0 r7 = r7.e
                    r7.setValue(r8)
                    kotlin.Unit r7 = kotlin.Unit.a
                    if (r7 != r2) goto L8f
                    goto L8e
                L6c:
                    boolean r8 = r8 instanceof jp60.b
                    if (r8 == 0) goto L8f
                    cjr$e r8 = new cjr$e
                    r3 = 0
                    r8.<init>(r3)
                    defpackage.djr.a(r0, r8)
                    jp60$b r1 = (jp60.b) r1
                    boolean r8 = r1.a
                    java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                    r7.b = r4
                    r7.a = r5
                    wwd0 r7 = r7.f
                    r7.setValue(r8)
                    kotlin.Unit r7 = kotlin.Unit.a
                    if (r7 != r2) goto L8f
                L8e:
                    return r2
                L8f:
                    kotlin.Unit r7 = kotlin.Unit.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: lp60.a.C0825a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, wwd0 wwd0Var, np60 np60Var, wwd0 wwd0Var2, wwd0 wwd0Var3, v1b v1bVar) {
            super(2, v1bVar);
            this.b = lyhVar;
            this.c = wwd0Var;
            this.d = np60Var;
            this.e = wwd0Var2;
            this.f = wwd0Var3;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0825a c0825a = new C0825a(this.c, this.d, this.e, this.f, null);
                this.a = 1;
                if (kzh.b(this.b, c0825a, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snm.SNMMapper$getMarketStateFlow$1$2", f = "SNMMapper.kt", l = {247}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wwd0 b;
        public final /* synthetic */ wwd0 c;
        public final /* synthetic */ l1i d;
        public final /* synthetic */ v340 e;
        public final /* synthetic */ v340 f;
        public final /* synthetic */ ssq i;
        public final /* synthetic */ ez20<zsq> v;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snm.SNMMapper$getMarketStateFlow$1$2$1", f = "SNMMapper.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements kaj<Boolean, Boolean, uf00<? extends kxq>, q4r, Boolean, v1b<? super zsq.f>, Object> {
            public /* synthetic */ boolean a;
            public /* synthetic */ boolean b;
            public /* synthetic */ uf00 c;
            public /* synthetic */ q4r d;
            public /* synthetic */ boolean e;
            public final /* synthetic */ ssq f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ssq ssqVar, v1b<? super a> v1bVar) {
                super(6, v1bVar);
                this.f = ssqVar;
            }

            @Override // defpackage.kaj
            public final Object f(Boolean bool, Boolean bool2, uf00<? extends kxq> uf00Var, q4r q4rVar, Boolean bool3, v1b<? super zsq.f> v1bVar) {
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = bool2.booleanValue();
                boolean zBooleanValue3 = bool3.booleanValue();
                a aVar = new a(this.f, v1bVar);
                aVar.a = zBooleanValue;
                aVar.b = zBooleanValue2;
                aVar.c = uf00Var;
                aVar.d = q4rVar;
                aVar.e = zBooleanValue3;
                return aVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                boolean z = this.a;
                boolean z2 = this.b;
                uf00 uf00Var = this.c;
                q4r q4rVar = this.d;
                boolean z3 = this.e;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                ssq ssqVar = this.f;
                return new zsq.f(ssqVar.b, ssqVar.a, ssqVar.c, z, z2, uf00Var, q4rVar, z3);
            }
        }

        /* JADX INFO: renamed from: lp60$b$b, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snm.SNMMapper$getMarketStateFlow$1$2$2", f = "SNMMapper.kt", l = {248}, m = "invokeSuspend", v = 2)
        public static final class C0826b extends tje0 implements Function2<zsq.f, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ ez20<zsq> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0826b(ez20<? super zsq> ez20Var, v1b<? super C0826b> v1bVar) {
                super(2, v1bVar);
                this.c = ez20Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0826b c0826b = new C0826b(this.c, v1bVar);
                c0826b.b = obj;
                return c0826b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(zsq.f fVar, v1b<? super Unit> v1bVar) {
                return ((C0826b) create(fVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                zsq.f fVar = (zsq.f) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.b = null;
                    this.a = 1;
                    if (this.c.j(this, fVar) == y5bVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wwd0 wwd0Var, wwd0 wwd0Var2, l1i l1iVar, v340 v340Var, v340 v340Var2, ssq ssqVar, ez20 ez20Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = wwd0Var;
            this.c = wwd0Var2;
            this.d = l1iVar;
            this.e = v340Var;
            this.f = v340Var2;
            this.i = ssqVar;
            this.v = ez20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                m1i m1iVarC = r1i.c(this.b, this.c, this.d, this.e, this.f, new a(this.i, null));
                C0826b c0826b = new C0826b(this.v, null);
                this.a = 1;
                if (kzh.b(m1iVarC, c0826b, this) == y5bVar) {
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

    public static final class c implements lyh<Boolean> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ ssq b;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snm.SNMMapper$getMarketStateFlow$1$invokeSuspend$$inlined$map$1", f = "SNMMapper.kt", l = {109}, m = "collect", v = 2)
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
                return c.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ ssq b;

            @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snm.SNMMapper$getMarketStateFlow$1$invokeSuspend$$inlined$map$1$2", f = "SNMMapper.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, ssq ssqVar) {
                this.a = myhVar;
                this.b = ssqVar;
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
                    Boolean boolValueOf = Boolean.valueOf(!Intrinsics.g((String) obj, this.b.a));
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

        public c(lyh lyhVar, ssq ssqVar) {
            this.a = lyhVar;
            this.b = ssqVar;
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
                b bVar = new b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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

    public static final class d implements lyh<q4r> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ ssq b;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snm.SNMMapper$getMarketStateFlow$1$invokeSuspend$$inlined$map$2", f = "SNMMapper.kt", l = {109}, m = "collect", v = 2)
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
                return d.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ ssq b;

            @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snm.SNMMapper$getMarketStateFlow$1$invokeSuspend$$inlined$map$2$2", f = "SNMMapper.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, ssq ssqVar) {
                this.a = myhVar;
                this.b = ssqVar;
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
                    q4r q4rVarA = fj30.a(this.b.g, ((Boolean) obj).booleanValue());
                    aVar.b = 1;
                    if (this.a.emit(q4rVarA, aVar) == y5bVar) {
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

        public d(wwd0 wwd0Var, ssq ssqVar) {
            this.a = wwd0Var;
            this.b = ssqVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super q4r> myhVar, v1b v1bVar) throws Throwable {
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
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            this.a.collect(bVar, aVar);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snm.SNMMapper$getMarketStateFlow$1$marketUserSelected$1", f = "SNMMapper.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements gaj<ssq, dqh0, v1b<? super uf00<? extends Integer>>, Object> {
        public /* synthetic */ ssq a;
        public /* synthetic */ dqh0 b;
        public final /* synthetic */ ssq c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ssq ssqVar, v1b<? super e> v1bVar) {
            super(3, v1bVar);
            this.c = ssqVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(ssq ssqVar, dqh0 dqh0Var, v1b<? super uf00<? extends Integer>> v1bVar) {
            e eVar = new e(this.c, v1bVar);
            eVar.a = ssqVar;
            eVar.b = dqh0Var;
            return eVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ssq ssqVar = this.a;
            dqh0 dqh0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!this.c.equals(ssqVar)) {
                return n1a0.c;
            }
            qcn<kxq.e> qcnVarB = dqh0Var.b();
            ArrayList arrayList = new ArrayList(l48.r(qcnVarB, 10));
            Iterator<kxq.e> it = qcnVarB.iterator();
            while (it.hasNext()) {
                bki0.a(it.next().a, arrayList);
            }
            return a4h.f(arrayList);
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snm.SNMMapper$getMarketStateFlow$1$numberState$1", f = "SNMMapper.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements jaj<qxp, uf00<? extends Integer>, Boolean, Boolean, v1b<? super uf00<? extends kxq>>, Object> {
        public /* synthetic */ qxp a;
        public /* synthetic */ uf00 b;
        public /* synthetic */ boolean c;
        public /* synthetic */ boolean d;
        public final /* synthetic */ ssq e;
        public final /* synthetic */ np60 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ssq ssqVar, np60 np60Var, v1b<? super f> v1bVar) {
            super(5, v1bVar);
            this.e = ssqVar;
            this.f = np60Var;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            qxp qxpVar = this.a;
            final uf00 uf00Var = this.b;
            boolean z = this.c;
            boolean z2 = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            int size = uf00Var.size();
            final ssq ssqVar = this.e;
            boolean z3 = size == ssqVar.e;
            qcn<ixp> qcnVar = qxpVar.b;
            final np60 np60Var = this.f;
            return jxq.a(uf00Var, z3, qcnVar, z, z2, false, n1a0.c, new Function1(np60Var, uf00Var, ssqVar) { // from class: mp60
                public final /* synthetic */ uf00 a;
                public final /* synthetic */ ssq b;

                {
                    this.a = uf00Var;
                    this.b = ssqVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Integer num = (Integer) obj2;
                    int iIntValue = num.intValue();
                    String str = this.b.a;
                    return this.a.contains(num) ? new ip60.d(str, iIntValue) : new ip60.a(str, iIntValue);
                }
            });
        }

        @Override // defpackage.jaj
        public final Object l(qxp qxpVar, uf00<? extends Integer> uf00Var, Boolean bool, Boolean bool2, v1b<? super uf00<? extends kxq>> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            f fVar = new f(this.e, this.f, v1bVar);
            fVar.a = qxpVar;
            fVar.b = uf00Var;
            fVar.c = zBooleanValue;
            fVar.d = zBooleanValue2;
            return fVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lp60(lyh<String> lyhVar, lyh<ssq> lyhVar2, lyh<? extends dqh0> lyhVar3, lyh<qxp> lyhVar4, ssq ssqVar, np60 np60Var, lyh<? extends zxq.h> lyhVar5, v1b<? super lp60> v1bVar) {
        super(2, v1bVar);
        this.b = lyhVar;
        this.c = lyhVar2;
        this.d = lyhVar3;
        this.e = lyhVar4;
        this.f = ssqVar;
        this.i = np60Var;
        this.v = lyhVar5;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lp60 lp60Var = new lp60(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
        lp60Var.a = obj;
        return lp60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super zsq> ez20Var, v1b<? super Unit> v1bVar) {
        return ((lp60) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ez20 ez20Var = (ez20) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA = xwd0.a(bool);
        wwd0 wwd0VarA2 = xwd0.a(bool);
        wwd0 wwd0VarA3 = xwd0.a(Boolean.TRUE);
        lyh<String> lyhVar = this.b;
        ssq ssqVar = this.f;
        c cVar = new c(lyhVar, ssqVar);
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(cVar, ez20Var, kwd0Var, bool);
        v340 v340VarE2 = e1i.e(new d(wwd0VarA3, ssqVar), ez20Var, kwd0Var, new q4r(0));
        v340 v340VarE3 = e1i.e(new f1i(new n1i(this.c, this.d, new e(ssqVar, null))), ez20Var, kwd0Var, n1a0.c);
        np60 np60Var = this.i;
        l1i l1iVarB = r1i.b(this.e, v340VarE3, wwd0VarA, wwd0VarA2, new f(ssqVar, np60Var, null));
        ej5.c(ez20Var, null, null, new a(this.v, wwd0VarA3, np60Var, wwd0VarA, wwd0VarA2, null), 3);
        ej5.c(ez20Var, null, null, new b(wwd0VarA, wwd0VarA2, l1iVarB, v340VarE2, v340VarE, ssqVar, ez20Var, null), 3);
        return Unit.a;
    }
}
