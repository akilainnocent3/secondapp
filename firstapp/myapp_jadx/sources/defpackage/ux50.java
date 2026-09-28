package defpackage;

import com.sportygames.commons.SportyGamesManager;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes7.dex */
@fae
public final class ux50 {
    /* JADX WARN: Code duplicated, block: B:15:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x002d  */
    public static no0 a() {
        if (bjb0.a != null) {
            if (!bjb0.a.c.getI().equals("https://www.sportybet.com/api/" + SportyGamesManager.getInstance().getCountry() + "/")) {
                synchronized (on50.class) {
                    bjb0.a = tn50.a("https://www.sportybet.com/api/" + SportyGamesManager.getInstance().getCountry() + "/", new Interceptor[]{new f0w(), new HttpLoggingInterceptor(), new ail(), new lrc0(), new mzf0()});
                }
            }
        } else {
            synchronized (on50.class) {
                bjb0.a = tn50.a("https://www.sportybet.com/api/" + SportyGamesManager.getInstance().getCountry() + "/", new Interceptor[]{new f0w(), new HttpLoggingInterceptor(), new ail(), new lrc0(), new mzf0()});
            }
        }
        Object objA = bjb0.a.a(no0.class);
        objA.getClass();
        return (no0) objA;
    }
}
