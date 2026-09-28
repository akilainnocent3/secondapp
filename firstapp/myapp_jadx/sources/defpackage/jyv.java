package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.globalpay.mobileMoney.b;
import com.sportybet.android.globalpay.mobileMoney.c;
import com.sportybet.android.globalpay.mobileMoney.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.api.model.BindNewPhoneResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jyv extends saj implements Function1<BindNewPhoneResult, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BindNewPhoneResult bindNewPhoneResult) {
        BindNewPhoneResult bindNewPhoneResult2 = bindNewPhoneResult;
        bindNewPhoneResult2.getClass();
        c cVar = (c) this.receiver;
        cVar.getClass();
        if (bindNewPhoneResult2 instanceof BindNewPhoneResult.Success) {
            ej5.c(o8i0.d(cVar), null, null, new e(cVar, bindNewPhoneResult2, null), 3);
        } else if (bindNewPhoneResult2.equals(BindNewPhoneResult.Failed.a)) {
            StringUiText stringUiText = vch0.a;
            cVar.A1(new b.f(new ResourceUiText(R.string.page_payment__failed_to_add_a_new_mobile_number_please_try_again)));
        } else if (!bindNewPhoneResult2.equals(BindNewPhoneResult.Canceled.a)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
