package defpackage;

import android.animation.Animator;
import android.view.ViewPropertyAnimator;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gce implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gce(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                hce hceVar = (hce) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                hceVar.b = OtpData.DeviceBlocking.a((OtpData.DeviceBlocking) hceVar.B1(), oTPResult);
                return Unit.a;
            case 1:
                ((Animator) obj).getClass();
                ViewPropertyAnimator viewPropertyAnimator = ((u6j) obj2).G0;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                return Unit.a;
            default:
                return Boolean.valueOf(Intrinsics.g((String) obj, (String) obj2));
        }
    }
}
