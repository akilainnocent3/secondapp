package defpackage;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class vrb {
    public static final trb d = new trb();
    public static final urb e = new urb();
    public final xkh a;
    public String b = null;
    public String c = null;

    public vrb(xkh xkhVar) {
        this.a = xkhVar;
    }

    public static void a(xkh xkhVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            xkhVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e2);
        }
    }
}
