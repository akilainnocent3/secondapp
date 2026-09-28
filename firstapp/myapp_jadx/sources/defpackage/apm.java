package defpackage;

import defpackage.ktu;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes8.dex */
public final class apm<T extends ktu> {
    public static final Logger f = Logger.getLogger(apm.class.getName());
    public final opf0 a = new opf0(f);
    public final AtomicBoolean b = new AtomicBoolean();
    public final String c;
    public final xpm d;
    public final w0h e;

    public apm(mvd0 mvd0Var, xpm xpmVar, fpm fpmVar, String str) {
        String str2;
        int i = mvd0Var.d.b;
        if (i == 1) {
            str2 = "SPAN";
        } else if (i == 2) {
            str2 = "METRIC";
        } else if (i == 3) {
            str2 = "LOG";
        } else {
            if (i != 4) {
                throw null;
            }
            str2 = "PROFILE";
        }
        this.c = str2.toLowerCase(Locale.ENGLISH);
        this.d = xpmVar;
        this.e = new w0h(fpmVar, mvd0Var, str);
    }

    public final rm8 a() {
        if (!this.b.compareAndSet(false, true)) {
            this.a.a(Level.INFO, "Calling shutdown() multiple times.", null);
            return rm8.e;
        }
        lmy lmyVar = (lmy) this.d;
        OkHttpClient okHttpClient = lmyVar.b;
        okHttpClient.dispatcher().cancelAll();
        if (lmyVar.a) {
            okHttpClient.dispatcher().executorService().shutdownNow();
        }
        okHttpClient.connectionPool().evictAll();
        return rm8.e;
    }
}
