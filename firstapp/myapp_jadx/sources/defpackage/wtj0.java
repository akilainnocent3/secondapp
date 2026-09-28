package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangePinCheckRequest;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangePinCheckResponse;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.sportypin.viewModel.WithdrawalPinViewModel$verifyEmailChangeWithPin$1", f = "WithdrawalPinViewModel.kt", l = {90}, m = "invokeSuspend", v = 2)
public final class wtj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xtj0 b;
    public final /* synthetic */ String c;

    @c0d(c = "com.sportybet.android.sportypin.viewModel.WithdrawalPinViewModel$verifyEmailChangeWithPin$1$1", f = "WithdrawalPinViewModel.kt", l = {84}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super EmailChangePinCheckResponse>, Object> {
        public int a;
        public final /* synthetic */ xtj0 b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xtj0 xtj0Var, String str, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.b = xtj0Var;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super EmailChangePinCheckResponse> v1bVar) {
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
            xtj0 xtj0Var = this.b;
            oyf oyfVar = xtj0Var.f;
            String str = xtj0Var.v;
            if (str == null) {
                str = "";
            }
            EmailChangePinCheckRequest emailChangePinCheckRequest = new EmailChangePinCheckRequest(this.c, str);
            this.a = 1;
            Object objA = oyfVar.a(emailChangePinCheckRequest, this);
            return objA == y5bVar ? y5bVar : objA;
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ xtj0 a;

        public b(xtj0 xtj0Var) {
            this.a = xtj0Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            UiText resourceUiText;
            lk50 lk50Var = (lk50) obj;
            boolean z = lk50Var instanceof lk50.a;
            xtj0 xtj0Var = this.a;
            if (z) {
                SprThrowable sprThrowableH = bm50.h(lk50Var);
                vu90<myf> vu90Var = xtj0Var.z;
                Integer num = sprThrowableH != null ? new Integer(sprThrowableH.getD()) : null;
                if (sprThrowableH != null) {
                    resourceUiText = sprThrowableH.b();
                } else {
                    StringUiText stringUiText = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later);
                }
                vu90Var.m(new myf(null, num, resourceUiText));
            } else if (!Intrinsics.g(lk50Var, lk50.b.a)) {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                xtj0Var.z.m(new myf(((EmailChangePinCheckResponse) ((lk50.c) lk50Var).a).getToken(), new Integer(10000), vch0.a));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtj0(xtj0 xtj0Var, String str, v1b<? super wtj0> v1bVar) {
        super(2, v1bVar);
        this.b = xtj0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wtj0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wtj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        xtj0 xtj0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            or60 or60VarO = bm50.o(new a(xtj0Var, this.c, null));
            b bVar = new b(xtj0Var);
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
        xtj0Var.i.a(kzf.a, k00.c);
        return Unit.a;
    }
}
