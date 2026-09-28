package defpackage;

import android.net.Uri;
import androidx.camera.view.PreviewView;
import com.sportybet.android.account.KycNativeCameraActivity;
import com.sportybet.android.home.SplashActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ltp implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ltp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj2;
                PreviewView previewView = (PreviewView) obj;
                KycNativeCameraActivity.a aVar = KycNativeCameraActivity.i;
                previewView.getClass();
                previewView.setVisibility(uri == null ? 0 : 8);
                return Unit.a;
            default:
                SplashActivity splashActivity = (SplashActivity) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                if (Intrinsics.g(splashActivity.z, "android.permission.POST_NOTIFICATIONS")) {
                    Boolean bool2 = splashActivity.A;
                    if (bool2 == null || !bool2.equals(bool)) {
                        iym iymVar = splashActivity.G;
                        if (zBooleanValue) {
                            if (iymVar == null) {
                                Intrinsics.n("openTelemetryLogger");
                                throw null;
                            }
                            gym.a(iymVar, l0y.a);
                        } else {
                            if (iymVar == null) {
                                Intrinsics.n("openTelemetryLogger");
                                throw null;
                            }
                            gym.a(iymVar, k0y.a);
                        }
                    }
                    splashActivity.A = null;
                }
                ej5.c(ebs.a(splashActivity.getLifecycle()), null, null, new ddb0(splashActivity, zBooleanValue, null), 3);
                splashActivity.w1();
                return Unit.a;
        }
    }
}
