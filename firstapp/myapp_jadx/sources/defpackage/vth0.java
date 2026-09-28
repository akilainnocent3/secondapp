package defpackage;

import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vth0 extends saj implements Function0<Boolean> {
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        String str;
        ((ith0) this.receiver).getClass();
        boolean z = false;
        if (Intrinsics.g(Build.MANUFACTURER, "Google") && Intrinsics.g(Build.BRAND, "google")) {
            String str2 = Build.FINGERPRINT;
            str2.getClass();
            if (c.u(str2, "google/sdk_gphone", false) && c.k(str2, "release-keys", false)) {
                String str3 = Build.PRODUCT;
                str3.getClass();
                if (c.u(str3, "sdk_gphone", false)) {
                    String str4 = Build.MODEL;
                    str4.getClass();
                    if (c.u(str4, "sdk_gphone", false)) {
                        z = true;
                    } else if (!c.u(str2, "google/sdk_gphone64", false)) {
                        if (Intrinsics.g(Build.MODEL, "HPE")) {
                            str = Build.PRODUCT;
                            str.getClass();
                            if (c.u(str, "kiwi", false)) {
                                z = true;
                            }
                        }
                    } else if (Intrinsics.g(Build.MODEL, "HPE")) {
                        str = Build.PRODUCT;
                        str.getClass();
                        if (c.u(str, "kiwi", false)) {
                            z = true;
                        }
                    }
                } else if (!c.u(str2, "google/sdk_gphone64", false)) {
                    if (Intrinsics.g(Build.MODEL, "HPE")) {
                        str = Build.PRODUCT;
                        str.getClass();
                        if (c.u(str, "kiwi", false)) {
                            z = true;
                        }
                    }
                } else if (Intrinsics.g(Build.MODEL, "HPE")) {
                    str = Build.PRODUCT;
                    str.getClass();
                    if (c.u(str, "kiwi", false)) {
                        z = true;
                    }
                }
            } else if (!c.u(str2, "google/sdk_gphone64", false) && (c.k(str2, "dev-keys", false) || c.k(str2, "release-keys", false))) {
                String str5 = Build.PRODUCT;
                str5.getClass();
                if (c.u(str5, "sdk_gphone64", false)) {
                    String str6 = Build.MODEL;
                    str6.getClass();
                    if (c.u(str6, "sdk_gphone64", false)) {
                        z = true;
                    } else if (Intrinsics.g(Build.MODEL, "HPE")) {
                        str = Build.PRODUCT;
                        str.getClass();
                        if (c.u(str, "kiwi", false)) {
                            z = true;
                        }
                    }
                } else if (Intrinsics.g(Build.MODEL, "HPE")) {
                    str = Build.PRODUCT;
                    str.getClass();
                    if (c.u(str, "kiwi", false)) {
                        z = true;
                    }
                }
            } else if (Intrinsics.g(Build.MODEL, "HPE") && c.u(str2, "google/kiwi", false) && c.k(str2, "release-keys", false) && Intrinsics.g(Build.BOARD, "kiwi")) {
                str = Build.PRODUCT;
                str.getClass();
                if (c.u(str, "kiwi", false)) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
