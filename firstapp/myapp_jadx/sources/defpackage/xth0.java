package defpackage;

import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xth0 extends saj implements Function0<Boolean> {
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        ((ith0) this.receiver).getClass();
        if (!"QC_Reference_Phone".equals(Build.BOARD) || "Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.MANUFACTURER;
            str.getClass();
            if (!StringsKt.M(str, "Genymotion", false)) {
                String str2 = Build.HOST;
                str2.getClass();
                if (!c.u(str2, "build-host", false)) {
                    String str3 = Build.BRAND;
                    str3.getClass();
                    if (c.u(str3, "generic", false)) {
                        String str4 = Build.DEVICE;
                        str4.getClass();
                        if (!c.u(str4, "generic", false)) {
                            z = Intrinsics.g(Build.PRODUCT, "google_sdk");
                        }
                    } else if (Intrinsics.g(Build.PRODUCT, "google_sdk")) {
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
