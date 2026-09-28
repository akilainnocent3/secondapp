package defpackage;

import com.sporty.android.platform.features.captcha.model.InHouseCaptchaEvent;
import com.sporty.android.platform.features.captcha.model.InHouseCaptchaImage;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class len extends saj implements Function1<InHouseCaptchaEvent, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InHouseCaptchaEvent inHouseCaptchaEvent) {
        InHouseCaptchaEvent inHouseCaptchaEvent2 = inHouseCaptchaEvent;
        inHouseCaptchaEvent2.getClass();
        bd6 bd6Var = (bd6) this.receiver;
        bd6Var.getClass();
        if (inHouseCaptchaEvent2.equals(InHouseCaptchaEvent.FinishActivity.INSTANCE)) {
            bd6Var.a.a(new pdn.a.C0968a(bd6Var.f));
        } else if (inHouseCaptchaEvent2.equals(InHouseCaptchaEvent.UpdateImage.INSTANCE)) {
            bd6Var.A1(true);
        } else if (inHouseCaptchaEvent2.equals(InHouseCaptchaEvent.Verify.INSTANCE)) {
            jvd0 jvd0Var = bd6Var.v;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            InHouseCaptchaImage inHouseCaptchaImage = bd6Var.x1().b;
            if (!(inHouseCaptchaImage instanceof InHouseCaptchaImage.Image)) {
                inHouseCaptchaImage = null;
            }
            InHouseCaptchaImage.Image image = (InHouseCaptchaImage.Image) inHouseCaptchaImage;
            if (image != null) {
                bd6Var.v = kzh.d(new g1i(new xzh(bm50.a(new dd6(bd6Var.b.a(image.getImageKey(), bd6Var.x1().c.a.b))), new ed6(2, null)), new gd6(bd6Var, null)), o8i0.d(bd6Var));
            }
        } else {
            if (!(inHouseCaptchaEvent2 instanceof InHouseCaptchaEvent.UpdateAnswer)) {
                uhc.a();
                return null;
            }
            bd6Var.z1(udn.a(bd6Var.x1(), false, null, ((InHouseCaptchaEvent.UpdateAnswer) inHouseCaptchaEvent2).getTextFieldValue(), vch0.a, 3));
        }
        return Unit.a;
    }
}
