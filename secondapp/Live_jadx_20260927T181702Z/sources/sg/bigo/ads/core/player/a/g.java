package sg.bigo.ads.core.player.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    HttpURLConnection f135185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    InputStream f135186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f135187c;

    public g(String str) {
        this.f135187c = str;
    }

    public final int a(byte[] bArr) {
        StringBuilder sb2;
        String str;
        InputStream inputStream = this.f135186b;
        if (inputStream == null) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error reading data from " + this.f135187c + ": connection is absent!");
            return 0;
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e10) {
            e = e10;
            sb2 = new StringBuilder("Reading source ");
            sb2.append(this.f135187c);
            str = " is interrupted, error message is : ";
            sb2.append(str);
            sb2.append(e.toString());
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", sb2.toString());
            return 0;
        } catch (IOException e11) {
            e = e11;
            sb2 = new StringBuilder("Error reading data from ");
            sb2.append(this.f135187c);
            str = ", error message is : ";
            sb2.append(str);
            sb2.append(e.toString());
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", sb2.toString());
            return 0;
        }
    }

    public final HttpURLConnection b() {
        HttpURLConnection httpURLConnection;
        String headerField = this.f135187c;
        HttpURLConnection httpURLConnection2 = null;
        int i10 = 0;
        while (true) {
            try {
                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Open connection  to " + headerField);
                httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
                if (httpURLConnection == null) {
                    break;
                }
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    boolean z10 = responseCode == 301 || responseCode == 302 || responseCode == 303;
                    if (z10) {
                        headerField = httpURLConnection.getHeaderField("Location");
                        i10++;
                        httpURLConnection.disconnect();
                    }
                    if (i10 > 5) {
                        sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Too many redirects: ".concat(String.valueOf(i10)));
                    }
                    if (!z10) {
                        break;
                    }
                    httpURLConnection2 = httpURLConnection;
                } catch (IOException e10) {
                    e = e10;
                    httpURLConnection2 = httpURLConnection;
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "PingHttpUrlSource#openConnection, error message is : " + e.toString());
                    return httpURLConnection2;
                }
            } catch (IOException e11) {
                e = e11;
            }
        }
        return httpURLConnection;
    }

    public final void a() {
        StringBuilder sb2;
        HttpURLConnection httpURLConnection = this.f135185a;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException e10) {
                e = e10;
                sb2 = new StringBuilder("Error closing connection correctly, the error message is : ");
                sb2.append(e.toString());
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", sb2.toString());
            } catch (IllegalArgumentException e11) {
                e = e11;
                sb2 = new StringBuilder("connection disconnect error..., the error message is : ");
                sb2.append(e.toString());
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", sb2.toString());
            } catch (NullPointerException e12) {
                e = e12;
                sb2 = new StringBuilder("connection disconnect error..., the error message is : ");
                sb2.append(e.toString());
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", sb2.toString());
            }
        }
    }
}
