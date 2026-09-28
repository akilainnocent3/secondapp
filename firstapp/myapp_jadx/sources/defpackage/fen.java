package defpackage;

import com.sporty.android.platform.features.captcha.model.InHouseCaptchaEvent;
import com.sportybet.android.instantwin.presentation.penalty.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fen implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fen(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(InHouseCaptchaEvent.Verify.INSTANCE);
                break;
            case 1:
                ((Function1) obj).invoke(b.c.C0296b.a);
                break;
            default:
                ((m410) obj).J0();
                break;
        }
        return Unit.a;
    }
}
