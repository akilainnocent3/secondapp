package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.account.CpfData;
import com.sportybet.android.account.international.data.model.INTResetPwdCompleteResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnf50;", "Lavw;", "Lgxo;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nf50 extends avw<gxo> {
    public boolean A;
    public final lwm e;
    public final kgk f;
    public final le50 i;
    public final psm v;
    public final vu60 w;
    public final xxz y;
    public final rx20 z;

    @c0d(c = "com.sportybet.android.account.international.resetpwd.viewmodel.ResetPwdViewModel$launchFacialRecognitionVerification$1", f = "ResetPwdViewModel.kt", l = {127}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return nf50.this.new a(this.c, v1bVar);
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
                b390 b390Var = nf50.this.c;
                zqr zqrVar = new zqr(new u6h(this.c, q7h.PASSWORD_RESET));
                this.a = 1;
                if (b390Var.emit(zqrVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.account.international.resetpwd.viewmodel.ResetPwdViewModel$onResetPasswordClick$1", f = "ResetPwdViewModel.kt", l = {68}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return nf50.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:29:? A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            nf50 nf50Var = nf50.this;
            wwd0 wwd0Var = nf50Var.a;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                String str = nf50Var.z1().d ? null : nf50Var.z1().b;
                kgk kgkVar = nf50Var.f;
                this.a = 1;
                obj = s0i.a(new sl50(bm50.b(kgkVar.a.j(str), vch0.b)), this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            lk50 lk50Var = (lk50) obj;
            if (lk50Var instanceof lk50.c) {
                CpfData cpfData = (CpfData) ((lk50.c) lk50Var).a;
                if (cpfData.getCpf() != null) {
                    String cpf = cpfData.getCpf();
                    cpf.getClass();
                    do {
                        value2 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value2, gxo.a((gxo) value2, null, null, false, true, cpf, false, false, 463)));
                } else {
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, gxo.a((gxo) value, null, null, false, false, null, false, true, 255)));
                }
            } else {
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, gxo.a((gxo) value, null, null, false, false, null, false, true, 255)));
            }
            return Unit.a;
        }
    }

    public static final class c implements lyh<lk50<? extends BaseResponse<INTResetPwdCompleteResponse>>> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.android.account.international.resetpwd.viewmodel.ResetPwdViewModel$resetPassword$$inlined$map$1", f = "ResetPwdViewModel.kt", l = {109}, m = "collect", v = 2)
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

            @c0d(c = "com.sportybet.android.account.international.resetpwd.viewmodel.ResetPwdViewModel$resetPassword$$inlined$map$1$2", f = "ResetPwdViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    lk50.c cVar = new lk50.c((BaseResponse) obj);
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

        public c(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super lk50<? extends BaseResponse<INTResetPwdCompleteResponse>>> myhVar, v1b v1bVar) {
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

    @c0d(c = "com.sportybet.android.account.international.resetpwd.viewmodel.ResetPwdViewModel$resetPassword$2", f = "ResetPwdViewModel.kt", l = {174}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super lk50<? extends BaseResponse<INTResetPwdCompleteResponse>>>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(2, v1bVar);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super lk50<? extends BaseResponse<INTResetPwdCompleteResponse>>> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = (myh) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                lk50.b bVar = lk50.b.a;
                this.b = null;
                this.a = 1;
                if (myhVar.emit(bVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.account.international.resetpwd.viewmodel.ResetPwdViewModel$resetPassword$3", f = "ResetPwdViewModel.kt", l = {175}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements gaj<myh<? super lk50<? extends BaseResponse<INTResetPwdCompleteResponse>>>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Throwable c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends BaseResponse<INTResetPwdCompleteResponse>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            e eVar = new e(3, v1bVar);
            eVar.b = myhVar;
            eVar.c = th;
            return eVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = this.b;
            Throwable th = this.c;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                lk50.a aVarA = gtc0.a(th, obj);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(aVarA, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.account.international.resetpwd.viewmodel.ResetPwdViewModel$resetPassword$4", f = "ResetPwdViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<lk50<? extends BaseResponse<INTResetPwdCompleteResponse>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = nf50.this.new f(v1bVar);
            fVar.a = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends BaseResponse<INTResetPwdCompleteResponse>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((f) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            nf50 nf50Var = nf50.this;
            nf50Var.y1(new lf50(lk50Var, nf50Var, null));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf50(lwm lwmVar, kgk kgkVar, le50 le50Var, psm psmVar, vu60 vu60Var, xxz xxzVar, rx20 rx20Var) {
        super(new gxo(new dwz(63), 507));
        lwmVar.getClass();
        psmVar.getClass();
        vu60Var.getClass();
        xxzVar.getClass();
        this.e = lwmVar;
        this.f = kgkVar;
        this.i = le50Var;
        this.v = psmVar;
        this.w = vu60Var;
        this.y = xxzVar;
        this.z = rx20Var;
    }

    public final void A1(String str) {
        if (z1().d) {
            ej5.c(o8i0.d(this), null, null, new mf50(this, null), 3);
        } else {
            ej5.c(o8i0.d(this), null, null, new a(str, null), 3);
        }
    }

    public final void B1() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, gxo.a((gxo) value, null, null, false, false, null, false, false, 495)));
    }

    public final void C1(ijf0 ijf0Var) {
        ijf0Var.getClass();
        if (!this.v.W() || this.A) {
            D1(ijf0Var);
        } else {
            y1(new b(null));
        }
    }

    public final void D1(ijf0 ijf0Var) {
        boolean z = z1().d;
        rx20 rx20Var = this.z;
        if (!z) {
            kzh.d(new g1i(new yzh(new xzh(new c(this.e.k(z1().b, rx20Var.a(ijf0Var.a.b))), new d(2, null)), new e(3, null)), new f(null)), o8i0.d(this));
        } else {
            y1(new of50(this, null));
            this.y.V0(z1().b, rx20Var.a(ijf0Var.a.b)).G(new pf50(this));
        }
    }

    public final if50 z1() {
        String str;
        Boolean bool;
        Boolean bool2;
        vu60 vu60Var = this.w;
        vu60Var.getClass();
        String str2 = "";
        if (vu60Var.a("email")) {
            str = (String) vu60Var.b("email");
            if (str == null) {
                hb5.a("Argument \"email\" is marked as non-null but was passed a null value");
                return null;
            }
        } else {
            str = "";
        }
        if (vu60Var.a("token") && (str2 = (String) vu60Var.b("token")) == null) {
            hb5.a("Argument \"token\" is marked as non-null but was passed a null value");
            return null;
        }
        if (vu60Var.a("from_deeplink")) {
            bool = (Boolean) vu60Var.b("from_deeplink");
            if (bool == null) {
                hb5.a("Argument \"from_deeplink\" of type boolean does not support null values");
                return null;
            }
        } else {
            bool = Boolean.FALSE;
        }
        if (vu60Var.a("from_settings_password")) {
            bool2 = (Boolean) vu60Var.b("from_settings_password");
            if (bool2 == null) {
                hb5.a("Argument \"from_settings_password\" of type boolean does not support null values");
                return null;
            }
        } else {
            bool2 = Boolean.FALSE;
        }
        return new if50(str, str2, bool.booleanValue(), bool2.booleanValue());
    }
}
