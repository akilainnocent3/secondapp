package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.uj30;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ZslDisablerQuirk implements uj30 {
    public static final List<String> a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1");
    public static final List<String> b = Arrays.asList("MI 8");

    public static boolean c(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }
}
