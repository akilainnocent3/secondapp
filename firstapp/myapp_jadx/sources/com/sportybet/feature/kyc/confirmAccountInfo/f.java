package com.sportybet.feature.kyc.confirmAccountInfo;

import androidx.compose.runtime.m;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sporty.android.core.model.patron.UserCertInfo;
import com.sporty.android.core.model.pay.security.NameUpdateStatus;
import com.sporty.android.core.model.pay.security.NameUpdateStatusMapperKt;
import defpackage.a320;
import defpackage.b390;
import defpackage.bm50;
import defpackage.c0d;
import defpackage.d390;
import defpackage.dcx;
import defpackage.e1i;
import defpackage.ecx;
import defpackage.ej5;
import defpackage.et7;
import defpackage.fcx;
import defpackage.fsa;
import defpackage.gaj;
import defpackage.gcx;
import defpackage.hcx;
import defpackage.hsa;
import defpackage.i2i;
import defpackage.iaj;
import defpackage.ib5;
import defpackage.icx;
import defpackage.ijf0;
import defpackage.itf0;
import defpackage.j8i0;
import defpackage.jcx;
import defpackage.jlv;
import defpackage.k00;
import defpackage.kcx;
import defpackage.lk50;
import defpackage.lyh;
import defpackage.lyz;
import defpackage.mgb0;
import defpackage.mwd0;
import defpackage.myh;
import defpackage.n1i;
import defpackage.o8i0;
import defpackage.pcx;
import defpackage.pdd0;
import defpackage.psm;
import defpackage.pu0;
import defpackage.q490;
import defpackage.r1i;
import defpackage.r78;
import defpackage.rdd0;
import defpackage.t340;
import defpackage.tje0;
import defpackage.tsg0;
import defpackage.ucx;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.uxs;
import defpackage.v1b;
import defpackage.v340;
import defpackage.v5b;
import defpackage.vch0;
import defpackage.vl50;
import defpackage.vu60;
import defpackage.wwd0;
import defpackage.x1b;
import defpackage.x5a0;
import defpackage.xwd0;
import defpackage.y5b;
import defpackage.ytw;
import defpackage.yzh;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/kyc/confirmAccountInfo/f;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f extends j8i0 {
    public final jlv A;
    public final wwd0 B;
    public final b390 C;
    public final t340 D;
    public final v340 E;
    public final lyz a;
    public final mgb0 b;
    public final psm c;
    public final rdd0 d;
    public pcx e;
    public boolean f;
    public boolean i;
    public final ytw v;
    public final ytw w;
    public final v340 y;
    public final wwd0 z;

    @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$confirmButtonStatus$1", f = "ConfirmAccountInfoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements iaj<Boolean, Boolean, fsa, v1b<? super uxs>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ boolean b;
        public /* synthetic */ fsa c;

        @Override // defpackage.iaj
        public final Object d(Boolean bool, Boolean bool2, fsa fsaVar, v1b<? super uxs> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            a aVar = new a(4, v1bVar);
            aVar.a = zBooleanValue;
            aVar.b = zBooleanValue2;
            aVar.c = fsaVar;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            boolean z2 = this.b;
            fsa fsaVar = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (fsaVar.f) {
                return uxs.LOADING;
            }
            return (z && z2 && !fsaVar.g) ? uxs.ENABLE : uxs.DISABLE;
        }
    }

    @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$handleAction$10", f = "ConfirmAccountInfoViewModel.kt", l = {392}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ f b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, f fVar) {
            super(2, v1bVar);
            this.b = fVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(v1bVar, this.b);
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
                f fVar = this.b;
                b390 b390Var = fVar.C;
                com.sportybet.feature.kyc.confirmAccountInfo.a.C0376a c0376a = new com.sportybet.feature.kyc.confirmAccountInfo.a.C0376a((fsa) fVar.B.getValue());
                this.a = 1;
                if (b390Var.emit(c0376a, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$handleAction$3", f = "ConfirmAccountInfoViewModel.kt", l = {346}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ f b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, f fVar) {
            super(2, v1bVar);
            this.b = fVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = this.b.C;
                com.sportybet.feature.kyc.confirmAccountInfo.a.b bVar = com.sportybet.feature.kyc.confirmAccountInfo.a.b.a;
                this.a = 1;
                if (b390Var.emit(bVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$handleAction$7", f = "ConfirmAccountInfoViewModel.kt", l = {376}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ f b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v1b v1bVar, f fVar) {
            super(2, v1bVar);
            this.b = fVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = this.b.C;
                com.sportybet.feature.kyc.confirmAccountInfo.a.c cVar = com.sportybet.feature.kyc.confirmAccountInfo.a.c.a;
                this.a = 1;
                if (b390Var.emit(cVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$handleAction$8", f = "ConfirmAccountInfoViewModel.kt", l = {382}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ f b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v1b v1bVar, f fVar) {
            super(2, v1bVar);
            this.b = fVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = this.b.C;
                com.sportybet.feature.kyc.confirmAccountInfo.a.d dVar = com.sportybet.feature.kyc.confirmAccountInfo.a.d.a;
                this.a = 1;
                if (b390Var.emit(dVar, this) == y5bVar) {
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

    /* JADX INFO: renamed from: com.sportybet.feature.kyc.confirmAccountInfo.f$f, reason: collision with other inner class name */
    @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$isNameFieldEditable$1", f = "ConfirmAccountInfoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C0380f extends tje0 implements gaj<com.sportybet.feature.kyc.confirmAccountInfo.h, uxs, v1b<? super Boolean>, Object> {
        public /* synthetic */ com.sportybet.feature.kyc.confirmAccountInfo.h a;
        public /* synthetic */ uxs b;

        @Override // defpackage.gaj
        public final Object invoke(com.sportybet.feature.kyc.confirmAccountInfo.h hVar, uxs uxsVar, v1b<? super Boolean> v1bVar) {
            C0380f c0380f = new C0380f(3, v1bVar);
            c0380f.a = hVar;
            c0380f.b = uxsVar;
            return c0380f.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sportybet.feature.kyc.confirmAccountInfo.h hVar = this.a;
            uxs uxsVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = false;
            if (hVar instanceof com.sportybet.feature.kyc.confirmAccountInfo.h.c) {
                UserCertInfo userCertInfo = ((com.sportybet.feature.kyc.confirmAccountInfo.h.c) hVar).a;
                if ((userCertInfo.getDataSource() == 530 || userCertInfo.getDataSource() == 540) && uxsVar != uxs.LOADING) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$nameUpdateStatus$2", f = "ConfirmAccountInfoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements gaj<myh<? super NameUpdateStatus>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super NameUpdateStatus> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            g gVar = new g(3, v1bVar);
            gVar.a = th;
            return gVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a.d(a320.a("get AccountInfo failed: ", th), new Object[0]);
            return Unit.a;
        }
    }

    public static final class h implements lyh<com.sportybet.feature.kyc.confirmAccountInfo.e> {
        public final /* synthetic */ lyh[] a;

        @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$special$$inlined$combine$1", f = "ConfirmAccountInfoViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return h.this.collect(null, this);
            }
        }

        public static final class b implements Function0<Object[]> {
            public final /* synthetic */ lyh[] a;

            public b(lyh[] lyhVarArr) {
                this.a = lyhVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.a.length];
            }
        }

        @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$special$$inlined$combine$1$3", f = "ConfirmAccountInfoViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements gaj<myh<? super com.sportybet.feature.kyc.confirmAccountInfo.e>, Object[], v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object[] c;

            @Override // defpackage.gaj
            public final Object invoke(myh<? super com.sportybet.feature.kyc.confirmAccountInfo.e> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
                c cVar = new c(3, v1bVar);
                cVar.b = myhVar;
                cVar.c = objArr;
                return cVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    myh myhVar = this.b;
                    Object[] objArr = this.c;
                    Object obj2 = objArr[0];
                    obj2.getClass();
                    com.sportybet.feature.kyc.confirmAccountInfo.h hVar = (com.sportybet.feature.kyc.confirmAccountInfo.h) obj2;
                    Object obj3 = objArr[1];
                    obj3.getClass();
                    uxs uxsVar = (uxs) obj3;
                    Object obj4 = objArr[2];
                    obj4.getClass();
                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                    Object obj5 = objArr[3];
                    obj5.getClass();
                    boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                    Object obj6 = objArr[4];
                    obj6.getClass();
                    Object obj7 = objArr[5];
                    obj7.getClass();
                    com.sportybet.feature.kyc.confirmAccountInfo.e eVar = new com.sportybet.feature.kyc.confirmAccountInfo.e(hVar, uxsVar, zBooleanValue, zBooleanValue2, (NameUpdateStatus) obj6, (fsa) obj7);
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    if (myhVar.emit(eVar, this) == y5bVar) {
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

        public h(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super com.sportybet.feature.kyc.confirmAccountInfo.e> myhVar, v1b v1bVar) {
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
                lyh[] lyhVarArr = this.a;
                b bVar = new b(lyhVarArr);
                c cVar = new c(3, null);
                aVar.b = 1;
                if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
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

    public static final class i implements lyh<com.sportybet.feature.kyc.confirmAccountInfo.h> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ f b;

        @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$special$$inlined$map$1", f = "ConfirmAccountInfoViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return i.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ f b;

            @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$special$$inlined$map$1$2", f = "ConfirmAccountInfoViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, f fVar) {
                this.a = myhVar;
                this.b = fVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                com.sportybet.feature.kyc.confirmAccountInfo.h cVar;
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
                    lk50 lk50Var = (lk50) obj;
                    if (lk50Var instanceof lk50.c) {
                        UserCertInfo userCertInfo = (UserCertInfo) ((lk50.c) lk50Var).a;
                        f fVar = this.b;
                        ucx ucxVar = (ucx) ((x5a0) fVar.v).getValue();
                        String firstName = userCertInfo.getFirstName();
                        if (firstName == null) {
                            firstName = "";
                        }
                        ((x5a0) ucxVar.c).setValue(new ijf0(firstName, 0L, 6));
                        ucx ucxVar2 = (ucx) ((x5a0) fVar.w).getValue();
                        String lastName = userCertInfo.getLastName();
                        ((x5a0) ucxVar2.c).setValue(new ijf0(lastName != null ? lastName : "", 0L, 6));
                        String firstName2 = userCertInfo.getFirstName();
                        String lastName2 = userCertInfo.getLastName();
                        boolean z = ((firstName2 == null || StringsKt.U(firstName2)) && (lastName2 == null || StringsKt.U(lastName2))) ? false : true;
                        fVar.i = z;
                        if (!fVar.f) {
                            fVar.f = true;
                            pcx pcxVar = fVar.e;
                            if (pcxVar != null) {
                                fVar.y1(new jcx(z, pcxVar), true);
                            }
                        }
                        cVar = new com.sportybet.feature.kyc.confirmAccountInfo.h.c(userCertInfo);
                    } else if (lk50Var instanceof lk50.a) {
                        cVar = com.sportybet.feature.kyc.confirmAccountInfo.h.a.a;
                    } else {
                        if (!(lk50Var instanceof lk50.b)) {
                            uhc.a();
                            return null;
                        }
                        cVar = com.sportybet.feature.kyc.confirmAccountInfo.h.b.a;
                    }
                    aVar.b = 1;
                    if (this.a.emit(cVar, aVar) == y5bVar) {
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

        public i(yzh yzhVar, f fVar) {
            this.a = yzhVar;
            this.b = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super com.sportybet.feature.kyc.confirmAccountInfo.h> myhVar, v1b v1bVar) {
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

    public static final class j implements lyh<Boolean> {
        public final /* synthetic */ v340 a;

        @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$special$$inlined$map$2", f = "ConfirmAccountInfoViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return j.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$special$$inlined$map$2$2", f = "ConfirmAccountInfoViewModel.kt", l = {50}, m = "emit", v = 2)
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

            /* JADX WARN: Code duplicated, block: B:21:0x004d  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                boolean z;
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
                    com.sportybet.feature.kyc.confirmAccountInfo.h hVar = (com.sportybet.feature.kyc.confirmAccountInfo.h) obj;
                    if (hVar instanceof com.sportybet.feature.kyc.confirmAccountInfo.h.c) {
                        UserCertInfo userCertInfo = ((com.sportybet.feature.kyc.confirmAccountInfo.h.c) hVar).a;
                        if (userCertInfo.getDataSource() == 530 || userCertInfo.getDataSource() == 540) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
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

        public j(v340 v340Var) {
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

    public static final class k implements lyh<NameUpdateStatus> {
        public final /* synthetic */ vl50 a;

        @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$special$$inlined$map$3", f = "ConfirmAccountInfoViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return k.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$special$$inlined$map$3$2", f = "ConfirmAccountInfoViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    NameUpdateStatus nameUpdateStatusModel = NameUpdateStatusMapperKt.getNameUpdateStatusModel((AccountInfo) obj);
                    aVar.b = 1;
                    if (this.a.emit(nameUpdateStatusModel, aVar) == y5bVar) {
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

        public k(vl50 vl50Var) {
            this.a = vl50Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super NameUpdateStatus> myhVar, v1b v1bVar) {
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

    public f(lyz lyzVar, mgb0 mgb0Var, psm psmVar, rdd0 rdd0Var, vu60 vu60Var) {
        lyzVar.getClass();
        mgb0Var.getClass();
        psmVar.getClass();
        rdd0Var.getClass();
        vu60Var.getClass();
        this.a = lyzVar;
        this.b = mgb0Var;
        this.c = psmVar;
        this.d = rdd0Var;
        pcx.a aVar = pcx.b;
        String str = (String) vu60Var.b(UserCertConstants.EXTRA_TRIGGER);
        aVar.getClass();
        this.e = pcx.a.a(str);
        ytw ytwVarB = m.b(new ucx());
        this.v = ytwVarB;
        ytw ytwVarB2 = m.b(new ucx());
        this.w = ytwVarB2;
        v340 v340VarE = e1i.e(new i(bm50.b(lyzVar.d0(), vch0.b), this), o8i0.d(this), q490.a.a(3), com.sportybet.feature.kyc.confirmAccountInfo.h.b.a);
        this.y = v340VarE;
        wwd0 wwd0VarA = xwd0.a(0);
        this.z = wwd0VarA;
        this.A = tsg0.a(i2i.c(wwd0VarA, o8i0.d(this).a, 2));
        wwd0 wwd0VarA2 = xwd0.a(new fsa(0));
        this.B = wwd0VarA2;
        v340 v340VarE2 = e1i.e(r1i.a(((ucx) ((x5a0) ytwVarB).getValue()).h, ((ucx) ((x5a0) ytwVarB2).getValue()).h, wwd0VarA2, new a(4, null)), o8i0.d(this), q490.a.a(3), uxs.DISABLE);
        n1i n1iVar = new n1i(v340VarE, v340VarE2, new C0380f(3, null));
        et7 et7VarD = o8i0.d(this);
        mwd0 mwd0VarA = q490.a.a(3);
        Boolean bool = Boolean.FALSE;
        v340 v340VarE3 = e1i.e(n1iVar, et7VarD, mwd0VarA, bool);
        v340 v340VarE4 = e1i.e(new j(v340VarE), o8i0.d(this), q490.a.a(3), bool);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.C = b390VarB;
        this.D = e1i.a(b390VarB);
        this.E = e1i.e(new h(new lyh[]{v340VarE, v340VarE2, v340VarE3, v340VarE4, e1i.e(new yzh(new k(bm50.f(lyzVar.a(new pu0.a(0)))), new g(3, null)), o8i0.d(this), q490.a.a(3), new NameUpdateStatus.Unknown(0)), wwd0VarA2}), o8i0.d(this), q490.a.a(2), new com.sportybet.feature.kyc.confirmAccountInfo.e(0));
    }

    public final void x1(com.sportybet.feature.kyc.confirmAccountInfo.d dVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        if (dVar.equals(com.sportybet.feature.kyc.confirmAccountInfo.d.c.a)) {
            y1(new ecx(this.i), false);
            Object value5 = this.y.a.getValue();
            com.sportybet.feature.kyc.confirmAccountInfo.h.c cVar = value5 instanceof com.sportybet.feature.kyc.confirmAccountInfo.h.c ? (com.sportybet.feature.kyc.confirmAccountInfo.h.c) value5 : null;
            if (cVar != null) {
                ej5.c(o8i0.d(this), null, null, new hsa(this, cVar.a, null), 3);
                return;
            }
            return;
        }
        if (dVar.equals(com.sportybet.feature.kyc.confirmAccountInfo.d.i.a)) {
            y1(icx.a, false);
            ej5.c(o8i0.d(this), null, null, new com.sportybet.feature.kyc.confirmAccountInfo.g(null, this), 3);
            return;
        }
        boolean zEquals = dVar.equals(com.sportybet.feature.kyc.confirmAccountInfo.d.b.a);
        wwd0 wwd0Var = this.B;
        if (zEquals) {
            y1(dcx.a, false);
            do {
                value4 = wwd0Var.getValue();
            } while (!wwd0Var.g(value4, fsa.a((fsa) value4, 0, null, null, false, false, false, false, true, 511)));
            return;
        }
        if (dVar.equals(com.sportybet.feature.kyc.confirmAccountInfo.d.g.a)) {
            y1(gcx.a, false);
            ej5.c(o8i0.d(this), null, null, new c(null, this), 3);
            return;
        }
        if (dVar.equals(com.sportybet.feature.kyc.confirmAccountInfo.d.f.a)) {
            y1(fcx.a, false);
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, fsa.a((fsa) value3, 0, null, null, false, false, false, false, false, 511)));
            return;
        }
        if (dVar.equals(com.sportybet.feature.kyc.confirmAccountInfo.d.j.a)) {
            pcx pcxVar = this.e;
            if (pcxVar != null) {
                y1(new kcx(pcxVar), true);
                return;
            }
            return;
        }
        if (dVar.equals(com.sportybet.feature.kyc.confirmAccountInfo.d.h.a)) {
            y1(hcx.a, false);
            return;
        }
        if (dVar.equals(com.sportybet.feature.kyc.confirmAccountInfo.d.l.a)) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, fsa.a((fsa) value2, 0, null, null, false, false, false, false, false, 767)));
            return;
        }
        if (dVar.equals(com.sportybet.feature.kyc.confirmAccountInfo.d.e.a)) {
            ej5.c(o8i0.d(this), null, null, new d(null, this), 3);
            return;
        }
        if (dVar.equals(com.sportybet.feature.kyc.confirmAccountInfo.d.k.a)) {
            ej5.c(o8i0.d(this), null, null, new e(null, this), 3);
            return;
        }
        if (dVar.equals(com.sportybet.feature.kyc.confirmAccountInfo.d.C0379d.a)) {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, fsa.a((fsa) value, 0, null, null, false, false, false, false, false, 511)));
        } else if (dVar.equals(com.sportybet.feature.kyc.confirmAccountInfo.d.a.a)) {
            ej5.c(o8i0.d(this), null, null, new b(null, this), 3);
        } else {
            uhc.a();
        }
    }

    public final void y1(pdd0 pdd0Var, boolean z) {
        rdd0 rdd0Var = this.d;
        if (z) {
            rdd0Var.a(pdd0Var, k00.d, k00.c);
        } else {
            rdd0Var.a(pdd0Var, k00.d);
        }
    }
}
