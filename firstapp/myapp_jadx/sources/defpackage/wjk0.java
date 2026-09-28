package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public final class wjk0 implements Runnable {
    public static final mgt c = new mgt("RevokeAccessOperation", new String[0]);
    public final String a;
    public final a0e0 b;

    public wjk0(String str) {
        hm20.e(str);
        this.a = str;
        this.b = new a0e0(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        mgt mgtVar = c;
        Status status = Status.i;
        try {
            String str = this.a;
            StringBuilder sb = new StringBuilder(str.length() + 50);
            sb.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb.append(str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e(mgtVar.a, mgtVar.b.concat("Unable to revoke access!"));
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb2.append("Response Code: ");
            sb2.append(responseCode);
            String string = sb2.toString();
            if (mgtVar.c <= 3) {
                Log.d(mgtVar.a, mgtVar.b.concat(string));
            }
        } catch (IOException e) {
            Log.e(mgtVar.a, mgtVar.b.concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e2) {
            Log.e(mgtVar.a, mgtVar.b.concat("Exception when revoking access: ".concat(String.valueOf(e2.toString()))));
        }
        this.b.e(status);
    }
}
