package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class mmk0 extends Thread {
    public final /* synthetic */ HashMap a;

    public mmk0(HashMap map) {
        this.a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap map = this.a;
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String string = builderBuildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + string);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            e = e;
            Log.w("HttpUrlPinger", lx5.a("Error while pinging URL: ", string, ". ", e.getMessage()), e);
        } catch (IndexOutOfBoundsException e2) {
            Log.w("HttpUrlPinger", lx5.a("Error while parsing ping URL: ", string, ". ", e2.getMessage()), e2);
        } catch (RuntimeException e3) {
            e = e3;
            Log.w("HttpUrlPinger", lx5.a("Error while pinging URL: ", string, ". ", e.getMessage()), e);
        }
    }
}
