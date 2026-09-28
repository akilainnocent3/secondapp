package defpackage;

import com.sporty.android.core.model.patron.UserCertInfo;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.feature.kyc.confirmAccountInfo.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$confirmAccountInfo$1", f = "ConfirmAccountInfoViewModel.kt", l = {206}, m = "invokeSuspend", v = 2)
public final class hsa extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ UserCertInfo c;

    public static final class a<T> implements myh {
        public final /* synthetic */ f a;

        public a(f fVar) {
            this.a = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object value5;
            lk50 lk50Var = (lk50) obj;
            wwd0 wwd0Var = this.a.B;
            if (lk50Var instanceof lk50.c) {
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, fsa.a((fsa) value3, 0, null, null, false, false, false, false, false, 991)));
                fsa fsaVar = (fsa) ((lk50.c) lk50Var).a;
                if (fsaVar.d) {
                    do {
                        value5 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value5, fsa.a((fsa) value5, 0, null, null, false, false, false, false, false, 959)));
                } else if (!fsaVar.h) {
                    do {
                        value4 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value4, fsa.a((fsa) value4, 0, null, null, false, false, false, false, false, 959)));
                }
            } else if (lk50Var instanceof lk50.a) {
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, fsa.a((fsa) value2, 0, null, null, false, false, false, true, false, 735)));
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, fsa.a((fsa) value, 0, null, null, false, false, true, false, false, 991)));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$confirmAccountInfo$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ConfirmAccountInfoViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<myh<? super fsa>, fsa, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ f d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, f fVar) {
            super(3, v1bVar);
            this.d = fVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super fsa> myhVar, fsa fsaVar, v1b<? super Unit> v1bVar) {
            b bVar = new b(v1bVar, this.d);
            bVar.b = myhVar;
            bVar.c = fsaVar;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lyh isaVar;
            Object value;
            fsa fsaVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                fsa fsaVar2 = (fsa) this.c;
                f fVar = this.d;
                fVar.getClass();
                int i2 = fsaVar2.a;
                if (i2 == 350 || i2 == 340) {
                    isaVar = new isa(fVar.a.T(), fVar);
                } else {
                    wwd0 wwd0Var = fVar.B;
                    do {
                        value = wwd0Var.getValue();
                        fsaVar = (fsa) value;
                        fsaVar.getClass();
                    } while (!wwd0Var.g(value, fsa.a(fsaVar, 0, null, null, false, false, false, false, false, 895)));
                    isaVar = new gzh((fsa) wwd0Var.getValue());
                }
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, isaVar, this) == y5bVar) {
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

    public static final class c implements lyh<fsa> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ f b;

        @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$confirmAccountInfo$1$invokeSuspend$$inlined$map$1", f = "ConfirmAccountInfoViewModel.kt", l = {109}, m = "collect", v = 2)
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
            public final /* synthetic */ f b;

            @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$confirmAccountInfo$1$invokeSuspend$$inlined$map$1$2", f = "ConfirmAccountInfoViewModel.kt", l = {51, 50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;
                public myh d;
                public UserCertInfo e;

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

            public b(myh myhVar, f fVar) {
                this.a = myhVar;
                this.b = fVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
            
                if (r4.emit(r0, r2) == r3) goto L31;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r20, defpackage.v1b r21) {
                /*
                    r19 = this;
                    r0 = r19
                    r1 = r21
                    boolean r2 = r1 instanceof hsa.c.b.a
                    if (r2 == 0) goto L17
                    r2 = r1
                    hsa$c$b$a r2 = (hsa.c.b.a) r2
                    int r3 = r2.b
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L17
                    int r3 = r3 - r4
                    r2.b = r3
                    goto L1c
                L17:
                    hsa$c$b$a r2 = new hsa$c$b$a
                    r2.<init>(r1)
                L1c:
                    java.lang.Object r1 = r2.a
                    y5b r3 = defpackage.y5b.a
                    int r4 = r2.b
                    com.sportybet.feature.kyc.confirmAccountInfo.f r5 = r0.b
                    r6 = 2
                    r7 = 1
                    r8 = 0
                    if (r4 == 0) goto L40
                    if (r4 == r7) goto L38
                    if (r4 != r6) goto L32
                    defpackage.uj50.b(r1)
                    goto La5
                L32:
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r0)
                    return r8
                L38:
                    com.sporty.android.core.model.patron.UserCertInfo r0 = r2.e
                    myh r4 = r2.d
                    defpackage.uj50.b(r1)
                    goto L5e
                L40:
                    defpackage.uj50.b(r1)
                    r1 = r20
                    com.sporty.android.core.model.patron.UserCertInfo r1 = (com.sporty.android.core.model.patron.UserCertInfo) r1
                    mgb0 r4 = r5.b
                    int r9 = r1.getStatus()
                    myh r0 = r0.a
                    r2.d = r0
                    r2.e = r1
                    r2.b = r7
                    java.lang.Object r4 = r4.setUserCertStatus(r9, r2)
                    if (r4 != r3) goto L5c
                    goto La4
                L5c:
                    r4 = r0
                    r0 = r1
                L5e:
                    wwd0 r1 = r5.B
                L60:
                    java.lang.Object r5 = r1.getValue()
                    r9 = r5
                    fsa r9 = (defpackage.fsa) r9
                    r9.getClass()
                    int r10 = r0.getStatus()
                    java.lang.String r7 = r0.getFirstName()
                    java.lang.String r11 = ""
                    if (r7 != 0) goto L77
                    r7 = r11
                L77:
                    java.lang.String r12 = r0.getLastName()
                    if (r12 != 0) goto L7e
                    r12 = r11
                L7e:
                    r17 = 0
                    r18 = 1016(0x3f8, float:1.424E-42)
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = 0
                    r11 = r7
                    fsa r7 = defpackage.fsa.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                    boolean r5 = r1.g(r5, r7)
                    if (r5 == 0) goto L60
                    java.lang.Object r0 = r1.getValue()
                    fsa r0 = (defpackage.fsa) r0
                    r2.d = r8
                    r2.e = r8
                    r2.b = r6
                    java.lang.Object r0 = r4.emit(r0, r2)
                    if (r0 != r3) goto La5
                La4:
                    return r3
                La5:
                    kotlin.Unit r0 = kotlin.Unit.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: hsa.c.b.emit(java.lang.Object, v1b):java.lang.Object");
            }
        }

        public c(lyh lyhVar, f fVar) {
            this.a = lyhVar;
            this.b = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super fsa> myhVar, v1b v1bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsa(f fVar, UserCertInfo userCertInfo, v1b<? super hsa> v1bVar) {
        super(2, v1bVar);
        this.b = fVar;
        this.c = userCertInfo;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hsa(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hsa) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            f fVar = this.b;
            if (((fsa) fVar.B.getValue()).f) {
                return Unit.a;
            }
            UserCertInfo userCertInfoCopy$default = UserCertInfo.copy$default(this.c, null, null, 0, "", ((ucx) ((x5a0) fVar.v).getValue()).a().a.b, ((ucx) ((x5a0) fVar.w).getValue()).a().a.b, null, 0, null, null, 967, null);
            if (fVar.c.getCountryCode() == CountryCodeName.GHANA) {
                userCertInfoCopy$default = UserCertInfo.copy$default(userCertInfoCopy$default, null, null, 0, null, null, null, null, 340, null, null, 895, null);
            }
            yzh yzhVarA = bm50.a(r0i.f(new c(fVar.a.v0(userCertInfoCopy$default), fVar), new b(null, fVar)));
            a aVar = new a(fVar);
            this.a = 1;
            if (yzhVarA.collect(aVar, this) == y5bVar) {
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
