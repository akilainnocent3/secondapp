package defpackage;

import com.sporty.android.core.model.account.verifiedemailchange.EmailChangePasswordCheckRequest;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangePasswordCheckResponse;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.EmailChangeVerifyIdentityViewModel$verifyIdentity$1", f = "EmailChangeVerifyIdentityViewModel.kt", l = {120}, m = "invokeSuspend", v = 2)
public final class zzf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ a0g b;

    @c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.EmailChangeVerifyIdentityViewModel$verifyIdentity$1$1", f = "EmailChangeVerifyIdentityViewModel.kt", l = {114}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super EmailChangePasswordCheckResponse>, Object> {
        public int a;
        public final /* synthetic */ a0g b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0g a0gVar, String str, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.b = a0gVar;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super EmailChangePasswordCheckResponse> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
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
            a0g a0gVar = this.b;
            oyf oyfVar = a0gVar.a;
            EmailChangePasswordCheckRequest emailChangePasswordCheckRequest = new EmailChangePasswordCheckRequest(this.c, a0gVar.f.a);
            this.a = 1;
            Object objG = oyfVar.g(emailChangePasswordCheckRequest, this);
            return objG == y5bVar ? y5bVar : objG;
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ a0g a;

        @c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.EmailChangeVerifyIdentityViewModel$verifyIdentity$1$2", f = "EmailChangeVerifyIdentityViewModel.kt", l = {134, 132}, m = "emit", v = 2)
        public static final class a extends x1b {
            public ku90 a;
            public /* synthetic */ Object b;
            public final /* synthetic */ b<T> c;
            public int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, v1b<? super a> v1bVar) {
                super(v1bVar);
                this.c = bVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return this.c.emit(null, this);
            }
        }

        public b(a0g a0gVar) {
            this.a = a0gVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(lk50<EmailChangePasswordCheckResponse> lk50Var, v1b<? super Unit> v1bVar) {
            a aVar;
            Object value;
            Object value2;
            Object value3;
            Object value4;
            ku90<vzf> ku90Var;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.d = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, v1bVar);
                }
            } else {
                aVar = new a(this, v1bVar);
            }
            Object objD = aVar.b;
            y5b y5bVar = y5b.a;
            int i2 = aVar.d;
            if (i2 == 0) {
                uj50.b(objD);
                boolean z = lk50Var instanceof lk50.c;
                a0g a0gVar = this.a;
                if (z) {
                    String token = ((EmailChangePasswordCheckResponse) ((lk50.c) lk50Var).a).getToken();
                    wwd0 wwd0Var = a0gVar.i;
                    ku90<vzf> ku90Var2 = a0gVar.w;
                    do {
                        value4 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value4, nzf.a((nzf) value4, null, new ijf0((String) null, 0L, 7), vch0.a, uxs.ENABLE, false, 17)));
                    if (a0gVar.f.b) {
                        a6k a6kVar = a0gVar.c;
                        aVar.a = ku90Var2;
                        aVar.d = 1;
                        objD = ej5.d(a6kVar.c, new z5k(a6kVar, token, null), aVar);
                        if (objD != y5bVar) {
                            ku90Var = ku90Var2;
                        }
                    }
                    token.getClass();
                    ku90Var2.a(new vzf.a(token));
                } else if (lk50Var instanceof lk50.a) {
                    if (bm50.j(lk50Var, 18203) != null) {
                        wwd0 wwd0Var2 = a0gVar.i;
                        do {
                            value3 = wwd0Var2.getValue();
                        } while (!wwd0Var2.g(value3, nzf.a((nzf) value3, null, ((nzf) a0gVar.v.a.getValue()).a, ((lk50.a) lk50Var).b, uxs.DISABLE, false, 17)));
                    } else {
                        wwd0 wwd0Var3 = a0gVar.i;
                        do {
                            value2 = wwd0Var3.getValue();
                        } while (!wwd0Var3.g(value2, nzf.a((nzf) value2, null, new ijf0((String) null, 0L, 7), ((lk50.a) lk50Var).b, uxs.ENABLE, false, 17)));
                    }
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    wwd0 wwd0Var4 = a0gVar.i;
                    do {
                        value = wwd0Var4.getValue();
                    } while (!wwd0Var4.g(value, nzf.a((nzf) value, null, null, vch0.a, uxs.LOADING, false, 19)));
                }
                return Unit.a;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    uj50.b(objD);
                    return objD;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ku90Var = aVar.a;
            uj50.b(objD);
            vzf.c cVar = new vzf.c((OtpModule) objD);
            aVar.a = null;
            aVar.d = 2;
            Object objEmit = ku90Var.a.emit(cVar, aVar);
            return objEmit == y5bVar ? y5bVar : objEmit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(a0g a0gVar, v1b<? super zzf> v1bVar) {
        super(2, v1bVar);
        this.b = a0gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zzf(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zzf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        a0g a0gVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            or60 or60VarO = bm50.o(new a(a0gVar, uel.c(((nzf) a0gVar.v.a.getValue()).a.a.b), null));
            b bVar = new b(a0gVar);
            this.a = 1;
            if (or60VarO.collect(bVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        a0gVar.e.a(hzf.a, k00.c);
        return Unit.a;
    }
}
