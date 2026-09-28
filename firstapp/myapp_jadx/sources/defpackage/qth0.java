package defpackage;

import android.os.Build;
import androidx.camera.core.impl.utils.TP.sgwpmp;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qth0 extends saj implements Function0<Boolean> {
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ((ith0) this.receiver).getClass();
        List<String> listK = b.k("generic/sdk/generic", "vbox86p", "generic/google_sdk/generic", "generic_x86/sdk_x86/generic_x86", "generic_x86_64", sgwpmp.RBCwAvtuDRO, "Andy", "generic/vbox86p/vbox86p");
        boolean z = false;
        if (listK == null || !listK.isEmpty()) {
            for (String str : listK) {
                String str2 = Build.FINGERPRINT;
                str2.getClass();
                if (StringsKt.M(str2, str, false)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
