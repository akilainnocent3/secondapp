package defpackage;

import android.os.Build;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nth0 extends saj implements Function0<Boolean> {
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ((ith0) this.receiver).getClass();
        List<String> listK = b.k("generic", "Droid4X", "generic_x86", "generic_x86_64", "ttVM_Hdragon", "nox", "Andy", "vbox86p", "emu");
        boolean z = false;
        if (listK == null || !listK.isEmpty()) {
            for (String str : listK) {
                String str2 = Build.DEVICE;
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
