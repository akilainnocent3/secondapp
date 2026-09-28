package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d6l extends u4l<GoogleSignInOptions> {
    public static int k = 1;

    public final synchronized int d() {
        int i;
        try {
            i = k;
            if (i == 1) {
                Context context = this.a;
                v4l v4lVar = v4l.d;
                int iC = v4lVar.c(context, 12451000);
                if (iC == 0) {
                    i = 4;
                    k = 4;
                } else if (v4lVar.a(iC, context, null) != null || DynamiteModule.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    k = 2;
                } else {
                    i = 3;
                    k = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
