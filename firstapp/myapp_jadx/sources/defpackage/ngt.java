package defpackage;

import android.util.Log;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;

/* JADX INFO: loaded from: classes4.dex */
public final class ngt {
    public static final ngt a = new ngt();

    public final boolean a(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    public final void b(String str) {
        if (a(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public final void c(String str) {
        if (a(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public final void d(String str, Exception exc) {
        if (a(5)) {
            Log.w(UccrWswQGaIj.jKdNfKiWcHryV, str, exc);
        }
    }
}
