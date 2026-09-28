package defpackage;

import com.sportybet.android.auth.RefreshTokenLogger;
import java.util.Iterator;
import kotlin.collections.b;
import kotlin.sequences.Sequence;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* JADX INFO: loaded from: classes8.dex */
public final class yly implements Authenticator {
    public final str<uqm> a;

    public yly(str<uqm> strVar) {
        this.a = strVar;
    }

    @Override // okhttp3.Authenticator
    public final Request authenticate(Route route, Response response) {
        response.getClass();
        int i = 0;
        Sequence sequenceC = fd80.c(response, new zly(0));
        sequenceC.getClass();
        Iterator it = sequenceC.iterator();
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                b.p();
                throw null;
            }
        }
        if (i < 3) {
            String strHeader = response.request().header("Authorization");
            String strEncodedPath = response.request().url().encodedPath();
            RefreshTokenLogger.logAuthenticatorRefreshStart(strEncodedPath, strHeader);
            String strRefreshAccessToken = this.a.get().refreshAccessToken(strHeader);
            RefreshTokenLogger.logAuthenticatorRefreshResult(strEncodedPath, strRefreshAccessToken);
            if (strRefreshAccessToken != null && strRefreshAccessToken.length() != 0) {
                return response.request().newBuilder().header("Authorization", strRefreshAccessToken).build();
            }
        }
        return null;
    }
}
