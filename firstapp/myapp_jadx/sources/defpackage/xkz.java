package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pbc.PBCMapper$getMarketSelectionFlow$1", f = "PBCMapper.kt", l = {88}, m = "invokeSuspend", v = 2)
public final class xkz extends tje0 implements Function2<ez20<? super xsq.a>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ssq c;
    public final /* synthetic */ lyh<zxq.h> d;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pbc.PBCMapper$getMarketSelectionFlow$1$1", f = "PBCMapper.kt", l = {61}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ lyh<zxq.h> b;
        public final /* synthetic */ wwd0 c;
        public final /* synthetic */ ssq d;

        /* JADX INFO: renamed from: xkz$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pbc.PBCMapper$getMarketSelectionFlow$1$1$1", f = "PBCMapper.kt", l = {WebSocketProtocol.B0_FLAG_RSV1, 71, 80}, m = "invokeSuspend", v = 2)
        public static final class C1295a extends tje0 implements Function2<zxq.h, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ wwd0 c;
            public final /* synthetic */ ssq d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1295a(wwd0 wwd0Var, ssq ssqVar, v1b v1bVar) {
                super(2, v1bVar);
                this.c = wwd0Var;
                this.d = ssqVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1295a c1295a = new C1295a(this.c, this.d, v1bVar);
                c1295a.b = obj;
                return c1295a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(zxq.h hVar, v1b<? super Unit> v1bVar) {
                return ((C1295a) create(hVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
            
                if (kotlin.Unit.a == r2) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
            
                if (kotlin.Unit.a == r2) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
            
                if (kotlin.Unit.a == r2) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
            
                return r2;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    ssq r0 = r8.d
                    java.lang.String r0 = r0.a
                    java.lang.Object r1 = r8.b
                    zxq$h r1 = (zxq.h) r1
                    y5b r2 = defpackage.y5b.a
                    int r3 = r8.a
                    r4 = 3
                    r5 = 2
                    r6 = 1
                    r7 = 0
                    if (r3 == 0) goto L24
                    if (r3 == r6) goto L1f
                    if (r3 == r5) goto L1f
                    if (r3 != r4) goto L19
                    goto L1f
                L19:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r8)
                    return r7
                L1f:
                    defpackage.uj50.b(r9)
                    goto L91
                L24:
                    defpackage.uj50.b(r9)
                    boolean r9 = r1 instanceof zxq.j.b
                    wwd0 r3 = r8.c
                    if (r9 == 0) goto L39
                    r8.b = r7
                    r8.a = r6
                    r3.setValue(r7)
                    kotlin.Unit r8 = kotlin.Unit.a
                    if (r8 != r2) goto L91
                    goto L89
                L39:
                    boolean r9 = r1 instanceof zxq.j.a
                    if (r9 == 0) goto L5d
                    zxq$j$a r1 = (zxq.j.a) r1
                    s4r$a r9 = r1.a
                    java.lang.String r1 = r9.b
                    boolean r0 = kotlin.jvm.internal.Intrinsics.g(r1, r0)
                    if (r0 == 0) goto L91
                    atq r0 = r9.c
                    atq r1 = defpackage.atq.PBC
                    if (r0 != r1) goto L91
                    java.lang.String r9 = r9.d
                    r8.b = r7
                    r8.a = r5
                    r3.setValue(r9)
                    kotlin.Unit r8 = kotlin.Unit.a
                    if (r8 != r2) goto L91
                    goto L89
                L5d:
                    boolean r9 = r1 instanceof zxq.i
                    if (r9 == 0) goto L91
                    r9 = r1
                    zxq$i r9 = (zxq.i) r9
                    java.lang.String r9 = r9.getMarketId()
                    boolean r9 = kotlin.jvm.internal.Intrinsics.g(r9, r0)
                    if (r9 == 0) goto L8e
                    boolean r9 = r1 instanceof defpackage.wkz
                    if (r9 != 0) goto L73
                    goto L8e
                L73:
                    r9 = r1
                    wkz r9 = (defpackage.wkz) r9
                    boolean r9 = r9 instanceof wkz.a
                    if (r9 == 0) goto L8a
                    wkz$a r1 = (wkz.a) r1
                    java.lang.String r9 = r1.a
                    r8.b = r7
                    r8.a = r4
                    r3.setValue(r9)
                    kotlin.Unit r8 = kotlin.Unit.a
                    if (r8 != r2) goto L91
                L89:
                    return r2
                L8a:
                    defpackage.uhc.a()
                    return r7
                L8e:
                    kotlin.Unit r8 = kotlin.Unit.a
                    return r8
                L91:
                    kotlin.Unit r8 = kotlin.Unit.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: xkz.a.C1295a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, wwd0 wwd0Var, ssq ssqVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = lyhVar;
            this.c = wwd0Var;
            this.d = ssqVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
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
                C1295a c1295a = new C1295a(this.c, this.d, null);
                this.a = 1;
                if (kzh.b(this.b, c1295a, this) == y5bVar) {
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

    public static final class b implements lyh<Boolean> {
        public final /* synthetic */ wwd0 a;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pbc.PBCMapper$getMarketSelectionFlow$1$invokeSuspend$$inlined$map$1", f = "PBCMapper.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: xkz$b$b, reason: collision with other inner class name */
        public static final class C1296b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: xkz$b$b$a */
            @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pbc.PBCMapper$getMarketSelectionFlow$1$invokeSuspend$$inlined$map$1$2", f = "PBCMapper.kt", l = {50}, m = "emit", v = 2)
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
                    return C1296b.this.emit(null, this);
                }
            }

            public C1296b(myh myhVar) {
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
                    Boolean boolValueOf = Boolean.valueOf(((String) obj) != null);
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

        public b(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) throws Throwable {
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
            C1296b c1296b = new C1296b(myhVar);
            aVar.b = 1;
            this.a.collect(c1296b, aVar);
            return y5bVar;
        }
    }

    public static final class c implements lyh<dqh0.e> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ ssq b;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pbc.PBCMapper$getMarketSelectionFlow$1$invokeSuspend$$inlined$map$2", f = "PBCMapper.kt", l = {109}, m = "collect", v = 2)
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

            @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pbc.PBCMapper$getMarketSelectionFlow$1$invokeSuspend$$inlined$map$2$2", f = "PBCMapper.kt", l = {50}, m = "emit", v = 2)
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
                yxq yxqVar = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    String str = (String) obj;
                    for (yxq yxqVar2 : this.b.g) {
                        if (Intrinsics.g(str, yxqVar2.b)) {
                            yxqVar = yxqVar2;
                            break;
                        }
                    }
                    yxq yxqVar3 = yxqVar;
                    dqh0.e eVar = yxqVar3 == null ? new dqh0.e(0) : new dqh0.e(yxqVar3.a, yxqVar3.b);
                    aVar.b = 1;
                    if (this.a.emit(eVar, aVar) == y5bVar) {
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

        public c(wwd0 wwd0Var, ssq ssqVar) {
            this.a = wwd0Var;
            this.b = ssqVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super dqh0.e> myhVar, v1b v1bVar) throws Throwable {
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

    public static final class d implements lyh<Boolean> {
        public final /* synthetic */ v340 a;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pbc.PBCMapper$getMarketSelectionFlow$1$invokeSuspend$$inlined$map$3", f = "PBCMapper.kt", l = {109}, m = "collect", v = 2)
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

            @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pbc.PBCMapper$getMarketSelectionFlow$1$invokeSuspend$$inlined$map$3$2", f = "PBCMapper.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar) {
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
                    Boolean boolValueOf = Boolean.valueOf(((dqh0.e) obj).b != null);
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

        public d(v340 v340Var) {
            this.a = v340Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
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
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.a.collect(bVar, aVar) == y5bVar) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public xkz(ssq ssqVar, lyh<? extends zxq.h> lyhVar, v1b<? super xkz> v1bVar) {
        super(2, v1bVar);
        this.c = ssqVar;
        this.d = lyhVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xkz xkzVar = new xkz(this.c, this.d, v1bVar);
        xkzVar.b = obj;
        return xkzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super xsq.a> ez20Var, v1b<? super Unit> v1bVar) {
        return ((xkz) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ez20 ez20Var = (ez20) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0VarA = xwd0.a(null);
            b bVar = new b(wwd0VarA);
            Boolean bool = Boolean.FALSE;
            kwd0 kwd0Var = q490.a.a;
            v340 v340VarE = e1i.e(bVar, ez20Var, kwd0Var, bool);
            ssq ssqVar = this.c;
            v340 v340VarE2 = e1i.e(new c(wwd0VarA, ssqVar), ez20Var, kwd0Var, new dqh0.e(0));
            v340 v340VarE3 = e1i.e(new d(v340VarE2), ez20Var, kwd0Var, bool);
            ej5.c(ez20Var, null, null, new a(this.d, wwd0VarA, ssqVar, null), 3);
            xsq.a aVar = new xsq.a(v340VarE, v340VarE3, v340VarE2);
            this.b = null;
            this.a = 1;
            if (ez20Var.j(this, aVar) == y5bVar) {
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
