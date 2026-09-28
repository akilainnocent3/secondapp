package defpackage;

import android.os.Build;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lth0 extends saj implements Function0<Boolean> {
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ((ith0) this.receiver).getClass();
        List<String> listK = b.k("unknown", "MIT", "nox", "Andy", "Genymotion", "TiantianVM");
        boolean z = false;
        if (listK == null || !listK.isEmpty()) {
            for (String str : listK) {
                String str2 = Build.MANUFACTURER;
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
