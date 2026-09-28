package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class lnn extends nm0 {
    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    /* JADX WARN: Illegal instructions before constructor call */
    public lnn(int i) {
        String strB;
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = amk0.a;
        Integer numValueOf2 = Integer.valueOf(i);
        if (map.containsKey(numValueOf2)) {
            HashMap map2 = amk0.b;
            if (map2.containsKey(numValueOf2)) {
                strB = v70.b((String) map.get(numValueOf2), " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#", (String) map2.get(numValueOf2), ")");
            } else {
                strB = "";
            }
        } else {
            strB = "";
        }
        super(new Status(i, String.format(locale, "Install Error(%d): %s", numValueOf, strB), null, null));
        if (i != 0) {
            return;
        }
        hb5.a("errorCode should not be 0.");
        throw null;
    }
}
