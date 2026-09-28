package defpackage;

import androidx.fragment.app.e;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.account.RegistrationKYC$Result;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ge8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ge8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fth fthVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                re8 re8Var = (re8) obj2;
                RegistrationKYC$Result registrationKYC$Result = (RegistrationKYC$Result) obj;
                re8.a aVar = re8.P;
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_ACCOUNT);
                aVar2.a("%s received reg-KYC result: %s", re8.class.getSimpleName(), registrationKYC$Result);
                if (re8Var.getActivity() != null && !re8Var.requireActivity().isFinishing() && registrationKYC$Result != null && (fthVar = re8Var.O) != null) {
                    if (registrationKYC$Result.b) {
                        e eVarRequireActivity = re8Var.requireActivity();
                        eVarRequireActivity.getClass();
                        re8Var.q0(eVarRequireActivity);
                    } else {
                        fthVar.O0();
                    }
                }
                break;
            default:
                ytw ytwVar = (ytw) obj2;
                String str = (String) obj;
                str.getClass();
                ytwVar.setValue(((Set) ytwVar.getValue()).contains(str) ? yi80.c((Set) ytwVar.getValue(), str) : yi80.f((Set) ytwVar.getValue(), str));
                break;
        }
        return Unit.a;
    }
}
