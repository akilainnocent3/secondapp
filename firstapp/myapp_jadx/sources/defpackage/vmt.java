package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class vmt implements rot {
    public final str<OkHttpClient> a;

    public vmt(str<OkHttpClient> strVar) {
        strVar.getClass();
        this.a = strVar;
    }

    @Override // defpackage.rot
    public final mot a(String str) {
        str.getClass();
        try {
            Response responseExecute = FirebasePerfOkHttpClient.execute(this.a.get().newCall(new Request.Builder().url(str).build()));
            if (responseExecute.getIsSuccessful()) {
                ResponseBody responseBodyBody = responseExecute.body();
                if (responseBodyBody != null) {
                    return new not(responseBodyBody.byteStream(), Response.header$default(responseExecute, "Content-Type", null, 2, null), null);
                }
                responseExecute.close();
                return new not(null, null, "Response body is null");
            }
            responseExecute.close();
            return new not(null, null, "HTTP " + responseExecute.code() + ": " + responseExecute.message());
        } catch (IOException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new not(null, null, message);
        }
    }
}
