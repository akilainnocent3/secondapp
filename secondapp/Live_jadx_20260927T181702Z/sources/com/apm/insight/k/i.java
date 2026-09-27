package com.apm.insight.k;

import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f26083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f26086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f26087f;

    public i(String str, String str2, boolean z10) throws IOException {
        this.f26084c = str2;
        this.f26085d = z10;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f26082a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f26083b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f26083b.setDoOutput(true);
        this.f26083b.setDoInput(true);
        this.f26083b.setRequestMethod("POST");
        CustomRequestHeader customRequestHeader = MonitorCrash.mCustomRequestHeader;
        if (customRequestHeader != null) {
            customRequestHeader.addRequestHeader(this.f26083b);
        }
        this.f26083b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (!z10) {
            this.f26086e = new f(this.f26083b.getOutputStream());
        } else {
            this.f26083b.setRequestProperty("Content-Encoding", "gzip");
            this.f26087f = new k(this.f26083b.getOutputStream());
        }
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    public final void b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f26082a);
        sb2.append("\r\nContent-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"\r\nContent-Type: text/plain; charset=");
        sb2.append(this.f26084c);
        sb2.append("\r\n\r\n");
        try {
            if (this.f26085d) {
                this.f26087f.write(sb2.toString().getBytes());
            } else {
                this.f26086e.write(sb2.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        try {
            if (this.f26085d) {
                this.f26087f.write(bytes);
                this.f26087f.write(IOUtils.LINE_SEPARATOR_WINDOWS.getBytes());
            } else {
                this.f26086e.write(bytes);
                this.f26086e.write(IOUtils.LINE_SEPARATOR_WINDOWS.getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    public final void a(String str, File... fileArr) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f26082a);
        sb2.append("\r\nContent-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"; filename=\"");
        sb2.append(str);
        sb2.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f26085d) {
            this.f26087f.write(sb2.toString().getBytes());
        } else {
            this.f26086e.write(sb2.toString().getBytes());
        }
        if (this.f26085d) {
            com.apm.insight.l.f.a(this.f26087f, fileArr);
        } else {
            com.apm.insight.l.f.a(this.f26086e, fileArr);
        }
        if (this.f26085d) {
            this.f26087f.write(IOUtils.LINE_SEPARATOR_WINDOWS.getBytes());
        } else {
            this.f26086e.write(IOUtils.LINE_SEPARATOR_WINDOWS.getBytes());
            this.f26086e.flush();
        }
    }

    public final void a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f26082a);
        sb2.append("\r\nContent-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"; filename=\"");
        sb2.append(name);
        sb2.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append("; ");
            sb2.append(entry.getKey());
            sb2.append("=\"");
            sb2.append(entry.getValue());
            sb2.append("\"");
        }
        sb2.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f26085d) {
            this.f26087f.write(sb2.toString().getBytes());
        } else {
            this.f26086e.write(sb2.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = fileInputStream.read(bArr);
            if (i10 == -1) {
                break;
            } else if (this.f26085d) {
                this.f26087f.write(bArr, 0, i10);
            } else {
                this.f26086e.write(bArr, 0, i10);
            }
        }
        fileInputStream.close();
        if (this.f26085d) {
            this.f26087f.write(IOUtils.LINE_SEPARATOR_WINDOWS.getBytes());
        } else {
            this.f26086e.write(IOUtils.LINE_SEPARATOR_WINDOWS.getBytes());
            this.f26086e.flush();
        }
    }

    public final String a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f26082a + "--\r\n").getBytes();
        if (this.f26085d) {
            this.f26087f.write(bytes);
            this.f26087f.b();
            this.f26087f.a();
        } else {
            this.f26086e.write(bytes);
            this.f26086e.flush();
            this.f26086e.a();
        }
        int responseCode = this.f26083b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f26083b.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arrayList.add(line);
            }
            bufferedReader.close();
            this.f26083b.disconnect();
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
            }
            return sb2.toString();
        }
        throw new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
    }
}
