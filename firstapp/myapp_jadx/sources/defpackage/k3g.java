package defpackage;

import androidx.compose.ui.layout.y;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import com.sportybet.feature.gift.gift.presentation.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k3g implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k3g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((snp) obj).getClass();
                b5i.b((b5i) obj2);
                return Unit.a;
            case 1:
                eik eikVar = (eik) obj;
                eikVar.getClass();
                ((Function1) obj2).invoke(new b.g(eikVar));
                return Unit.a;
            case 2:
                y.a aVar = (y.a) obj;
                aVar.getClass();
                y.a.A(aVar, (y) obj2, 0, 0);
                return Unit.a;
            default:
                CaptchaHeader captchaHeader = (CaptchaHeader) obj;
                captchaHeader.getClass();
                return ((xtj0) obj2).e.v1("DELETE_WITHDRAW_PIN", captchaHeader.getUuid(), captchaHeader.getToken());
        }
    }
}
