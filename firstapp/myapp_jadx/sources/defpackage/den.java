package defpackage;

import com.sporty.android.platform.features.captcha.model.InHouseCaptchaEvent;
import com.sportybet.android.instantwin.presentation.penalty.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class den implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ den(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(InHouseCaptchaEvent.UpdateImage.INSTANCE);
                break;
            default:
                function1.invoke(b.k.d.a);
                break;
        }
        return Unit.a;
    }
}
