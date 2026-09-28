package defpackage;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class afk0 {
    public final String a;

    public afk0(String str) {
        this.a = n36.a("UID: [", Process.myUid(), Process.myPid(), "]  PID: [", "] ").concat(str);
    }

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = lx5.a(str2, " [", TextUtils.join(gvQvkPPtA.abySDxZZrge, objArr), "]");
            }
        }
        return tug.a(str, " : ", str2);
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", e(this.a, str, objArr));
        }
    }

    public final void b(RemoteException remoteException, String str, Object... objArr) {
        String str2 = LhMGMAwwhzjwfz.dECtP;
        if (Log.isLoggable(str2, 6)) {
            Log.e(str2, e(this.a, str, objArr), remoteException);
        }
    }

    public final void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(this.a, str, objArr));
        }
    }

    public final void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", e(this.a, str, objArr));
        }
    }
}
