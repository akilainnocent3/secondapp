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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.multifactorauth.MFAViewModel$preCheckEmailChange$1", f = "MFAViewModel.kt", l = {370}, m = "invokeSuspend", v = 2)
public final class vcu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ocu b;

    @c0d(c = "com.sportybet.feature.multifactorauth.MFAViewModel$preCheckEmailChange$1$1", f = "MFAViewModel.kt", l = {369}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super EmailChangePreCheckResponse>, Object> {
        public int a;
        public final /* synthetic */ ocu b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ocu ocuVar, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.b = ocuVar;
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
        public final /* synthetic */ ocu a;

        public b(ocu ocuVar) {
            this.a = ocuVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            o9w aVar;
            Object value3;
            Object value4;
            lk50 lk50Var = (lk50) obj;
            boolean z = lk50Var instanceof lk50.c;
            ocu ocuVar = this.a;
            if (z) {
                EmailChangePreCheckResponse emailChangePreCheckResponse = (EmailChangePreCheckResponse) ((lk50.c) lk50Var).a;
                EmailChangeFlowArgs emailChangeFlowArgs = new EmailChangeFlowArgs(((oaw) ocuVar.C.getValue()).d.getAllowUpdateXTimesPerYear(), emailChangePreCheckResponse.getToken(), emailChangePreCheckResponse.getOtpRequestEnabled(), emailChangePreCheckResponse.getPasswordRequestEnabled(), emailChangePreCheckResponse.getSportyPinRequestEnabled());
                wwd0 wwd0Var = ocuVar.C;
                do {
                    value4 = wwd0Var.getValue();
                } while (!wwd0Var.g(value4, oaw.a((oaw) value4, null, false, false, null, null, 15)));
                ocuVar.E.a(new r9w(emailChangeFlowArgs));
                ocuVar.i.a(mzf.a, k00.c);
            } else if (lk50Var instanceof lk50.a) {
                lk50.a aVar2 = (lk50.a) lk50Var;
                UiText uiText = aVar2.b;
                Throwable th = aVar2.a;
                if (th instanceof SprThrowable) {
                    int d = ((SprThrowable) th).getD();
                    if (d == 18201) {
                        StringUiText stringUiText = vch0.a;
                        aVar = new o9w.a(new ResourceUiText(R.string.email_change__limit_exceeded_title), uiText);
                    } else if (d != 18205) {
                        StringUiText stringUiText2 = vch0.a;
                        aVar = new o9w.a(new ResourceUiText(R.string.common_functions__error), uiText);
                    } else {
                        StringUiText stringUiText3 = vch0.a;
                        aVar = new o9w.d(new ResourceUiText(R.string.email_change__verify_your_email_title), uiText);
                    }
                    o9w o9wVar = aVar;
                    wwd0 wwd0Var2 = ocuVar.C;
                    do {
                        value3 = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value3, oaw.a((oaw) value3, null, false, false, null, o9wVar, 15)));
                } else {
                    wwd0 wwd0Var3 = ocuVar.C;
                    do {
                        value2 = wwd0Var3.getValue();
                    } while (!wwd0Var3.g(value2, oaw.a((oaw) value2, null, false, false, null, o9w.b.a, 15)));
                }
            } else {
                if (!Intrinsics.g(lk50Var, lk50.b.a)) {
                    uhc.a();
                    return null;
                }
                wwd0 wwd0Var4 = ocuVar.C;
                do {
                    value = wwd0Var4.getValue();
                } while (!wwd0Var4.g(value, oaw.a((oaw) value, null, false, false, null, o9w.c.a, 15)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcu(ocu ocuVar, v1b<? super vcu> v1bVar) {
        super(2, v1bVar);
        this.b = ocuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vcu(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vcu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ocu ocuVar = this.b;
            or60 or60VarO = bm50.o(new a(ocuVar, null));
            b bVar = new b(ocuVar);
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
