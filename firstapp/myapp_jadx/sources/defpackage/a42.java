package defpackage;

import android.os.Parcelable;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.BaseOTPViewModel$onEachOTPResult$1", f = "BaseOTPViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a42 extends tje0 implements Function2<lk50<OtpData>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ Function1<OTPResult<OtpData>, Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a42(Function1<? super OTPResult<OtpData>, Unit> function1, v1b<? super a42> v1bVar) {
        super(2, v1bVar);
        this.b = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        a42 a42Var = new a42(this.b, v1bVar);
        a42Var.a = obj;
        return a42Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<OtpData> lk50Var, v1b<? super Unit> v1bVar) {
        return ((a42) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        OTPResult.Failed.OtherError otherError;
        OTPResult<OtpData> aPIError;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lk50Var.getClass();
        if (lk50Var instanceof lk50.c) {
            aPIError = new OTPResult.Success<>((Parcelable) ((lk50.c) lk50Var).a);
        } else {
            if (lk50Var instanceof lk50.a) {
                lk50.a aVar = (lk50.a) lk50Var;
                Throwable th = aVar.a;
                if (th instanceof SprThrowable) {
                    aPIError = new OTPResult.Failed.APIError(((SprThrowable) th).getD(), aVar.b);
                } else {
                    String strB = rtg.b(th);
                    StringUiText stringUiText = vch0.a;
                    otherError = new OTPResult.Failed.OtherError(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later), strB);
                }
            } else {
                boolean z = lk50Var instanceof lk50.b;
                otherError = null;
                if (!z) {
                    uhc.a();
                    return null;
                }
            }
            aPIError = otherError;
        }
        if (aPIError != null) {
            this.b.invoke(aPIError);
        }
        return Unit.a;
    }
}
