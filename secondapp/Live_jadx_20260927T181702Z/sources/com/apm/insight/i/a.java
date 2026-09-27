package com.apm.insight.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.o;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile UUID f25992a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f25993b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context) {
        String string;
        if (f25992a == null) {
            synchronized (a.class) {
                if (f25992a == null) {
                    String strC = o.a().c();
                    if (strC != null) {
                        f25992a = UUID.fromString(strC);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            string = null;
                        }
                        try {
                            if (string != null) {
                                f25992a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f25992a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(f25992a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        try {
            if (TextUtils.isEmpty(f25993b)) {
                new a(context);
                UUID uuid = f25992a;
                if (uuid != null) {
                    f25993b = uuid.toString();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f25993b;
    }
}
