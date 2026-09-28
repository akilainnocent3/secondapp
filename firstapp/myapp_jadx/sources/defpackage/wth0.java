package defpackage;

import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wth0 extends saj implements Function0<Boolean> {
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        ((ith0) this.receiver).getClass();
        String str = Build.FINGERPRINT;
        str.getClass();
        if (!c.u(str, "generic", false) && !c.u(str, "unknown", false)) {
            String str2 = Build.MODEL;
            str2.getClass();
            z = StringsKt.M(str2, "google_sdk", false) || StringsKt.M(str2, "Emulator", false) || StringsKt.M(str2, "Android SDK built for x86", false);
        }
        return Boolean.valueOf(z);
    }
}
