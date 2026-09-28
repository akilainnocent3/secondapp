package defpackage;

import com.sportygames.commons.SportyGamesManager;
import kotlin.jvm.functions.Function0;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class po0 implements Function0 {
    /* JADX WARN: Code duplicated, block: B:15:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x002d  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (q670.a != null) {
            if (!q670.a.c.getI().equals("https://www.sportybet.com/api/" + SportyGamesManager.getInstance().getCountry() + "/")) {
                synchronized (on50.class) {
                    q670.a = tn50.a("https://www.sportybet.com/api/" + SportyGamesManager.getInstance().getCountry() + "/", new Interceptor[]{new f0w(), new HttpLoggingInterceptor(), new bil(), new lrc0()});
                }
            }
        } else {
            synchronized (on50.class) {
                q670.a = tn50.a("https://www.sportybet.com/api/" + SportyGamesManager.getInstance().getCountry() + "/", new Interceptor[]{new f0w(), new HttpLoggingInterceptor(), new bil(), new lrc0()});
            }
        }
        return (cbd0) q670.a.a(cbd0.class);
    }
}
