package sg.bigo.ads.common.o;

import android.content.Context;
import androidx.annotation.NonNull;
import k.i1;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f133195a = true;

    @NonNull
    @i1
    public static sg.bigo.ads.common.a a(@NonNull Context context) {
        sg.bigo.ads.common.a aVarA;
        boolean z10;
        if (!f133195a) {
            return new sg.bigo.ads.common.a("", true);
        }
        long jA = r.f133428a.a(15);
        try {
            aVarA = d.a(context, jA);
            z10 = true;
        } catch (b unused) {
            aVarA = null;
            z10 = false;
        }
        if (aVarA != null) {
            return aVarA;
        }
        try {
            aVarA = a.a(context, jA);
        } catch (b unused2) {
            if (!z10) {
                f133195a = false;
            }
        }
        return aVarA != null ? aVarA : new sg.bigo.ads.common.a("", true);
    }
}
