package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class vsb {
    public final String a;
    public final xkh b;

    public vsb(String str, xkh xkhVar) {
        this.a = str;
        this.b = xkhVar;
    }

    public final void a() {
        String str = this.a;
        try {
            new File(this.b.c, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }
}
