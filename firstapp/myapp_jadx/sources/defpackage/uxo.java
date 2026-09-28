package defpackage;

import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class uxo {

    public static class a {
        public static <T> T a(Intent intent, String str, Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }
    }

    public static <T> T a(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.a(intent, str, cls);
        }
        T t = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }
}
