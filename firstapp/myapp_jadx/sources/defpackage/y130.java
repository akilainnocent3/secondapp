package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangePreCheckResponse;
import com.sporty.android.platform.features.account.verifiedemailchange.model.EmailChangeFlowArgs;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.ProfileViewModel$preCheckEmailChangeFlow$1", f = "ProfileViewModel.kt", l = {343}, m = "invokeSuspend", v = 2)
public final class y130 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ a230 b;

    @c0d(c = "com.sportybet.feature.profile.ProfileViewModel$preCheckEmailChangeFlow$1$1", f = "ProfileViewModel.kt", l = {342}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super EmailChangePreCheckResponse>, Object> {
        public int a;
        public final /* synthetic */ a230 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a230 a230Var, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.b = a230Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super EmailChangePreCheckResponse> v1bVar) {
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
            oyf oyfVar = this.b.f;
            this.a = 1;
            Object objE = oyfVar.e(this);
            return objE == y5bVar ? y5bVar : objE;
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ a230 a;

        @c0d(c = "com.sportybet.feature.profile.ProfileViewModel$preCheckEmailChangeFlow$1$2", f = "ProfileViewModel.kt", l = {356}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public final /* synthetic */ b<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, v1b<? super a> v1bVar) {
                super(v1bVar);
                this.b = bVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        public b(a230 a230Var) {
            this.a = a230Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001d  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(lk50<EmailChangePreCheckResponse> lk50Var, v1b<? super Unit> v1bVar) {
            a aVar;
            Object value;
            Object value2;
            jz20 aVar2;
            Object value3;
            Object value4;
            Object value5;
            a230 a230Var = this.a;
            wwd0 wwd0Var = a230Var.z;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.c = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, v1bVar);
                }
            } else {
                aVar = new a(this, v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.c;
            if (i2 == 0) {
                uj50.b(obj);
                if (lk50Var instanceof lk50.c) {
                    do {
                        value4 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value4, j130.a((j130) value4, null, null, null, false, null, false, false, false, null, 255)));
                    EmailChangePreCheckResponse emailChangePreCheckResponse = (EmailChangePreCheckResponse) ((lk50.c) lk50Var).a;
                    EmailChangeFlowArgs emailChangeFlowArgs = new EmailChangeFlowArgs(((j130) wwd0Var.getValue()).c.getAllowUpdateXTimesPerYear(), emailChangePreCheckResponse.getToken(), emailChangePreCheckResponse.getOtpRequestEnabled(), emailChangePreCheckResponse.getPasswordRequestEnabled(), emailChangePreCheckResponse.getSportyPinRequestEnabled());
                    do {
                        value5 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value5, j130.a((j130) value5, null, null, null, false, null, false, false, false, null, 255)));
                    ku90<oz20> ku90Var = a230Var.G;
                    oz20.c cVar = new oz20.c(emailChangeFlowArgs);
                    aVar.c = 1;
                    if (ku90Var.a.emit(cVar, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else if (lk50Var instanceof lk50.a) {
                    lk50.a aVar3 = (lk50.a) lk50Var;
                    UiText uiText = aVar3.b;
                    Throwable th = aVar3.a;
                    if (th instanceof SprThrowable) {
                        int d = ((SprThrowable) th).getD();
                        if (d == 18201) {
                            StringUiText stringUiText = vch0.a;
                            aVar2 = new jz20.a(new ResourceUiText(R.string.email_change__limit_exceeded_title), uiText);
                        } else if (d != 18205) {
                            StringUiText stringUiText2 = vch0.a;
                            aVar2 = new jz20.a(new ResourceUiText(R.string.common_functions__error), uiText);
                        } else {
                            StringUiText stringUiText3 = vch0.a;
                            aVar2 = new jz20.d(new ResourceUiText(R.string.email_change__verify_your_email_title), uiText);
                        }
                        jz20 jz20Var = aVar2;
                        do {
                            value3 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value3, j130.a((j130) value3, null, null, null, false, null, false, false, false, jz20Var, 255)));
                    } else {
                        do {
                            value2 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value2, j130.a((j130) value2, null, null, null, false, null, false, false, false, jz20.b.a, 255)));
                    }
                } else {
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, j130.a((j130) value, null, null, null, false, null, false, false, false, jz20.c.a, 255)));
                }
                return Unit.a;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            a230Var.v.a(izf.a, k00.c);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y130(a230 a230Var, v1b<? super y130> v1bVar) {
        super(2, v1bVar);
        this.b = a230Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y130(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((y130) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a230 a230Var = this.b;
            or60 or60VarO = bm50.o(new a(a230Var, null));
            b bVar = new b(a230Var);
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
        return Unit.a;
    }
}
