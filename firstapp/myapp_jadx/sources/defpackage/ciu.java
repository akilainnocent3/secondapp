package defpackage;

import android.os.Build;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ciu {
    public static final ob80<Function0<gly>> a = new ob80<>("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
