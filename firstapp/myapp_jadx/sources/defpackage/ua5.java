package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class ua5 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static Object a(Context context) {
        ComponentCallbacks2 componentCallbacks2A = p1b.a(context.getApplicationContext());
        boolean z = componentCallbacks2A instanceof i1k;
        Class<?> cls = componentCallbacks2A.getClass();
        if (z) {
            return ((i1k) componentCallbacks2A).generatedComponent();
        }
        z9l.a(cls, "Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: ");
        return null;
    }
}
