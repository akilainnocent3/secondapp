package com.bytedance.sdk.component.hv.tq;

import android.util.Log;
import com.bytedance.sdk.component.hv.hv;
import com.bytedance.sdk.component.utils.nod;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww implements com.bytedance.sdk.component.hv.vy<sd> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    @Override // com.bytedance.sdk.component.hv.vy
    /* JADX INFO: renamed from: tq, reason: merged with bridge method [inline-methods] */
    public sd<byte[]> hww(hv hvVar) throws Throwable {
        InputStream inputStream;
        byte[] byteArray;
        ?? byteArrayOutputStream;
        String message;
        ?? r10;
        InputStream inputStream2 = null;
        Map<String, String> mapHww = null;
        int i10 = 0;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(hvVar.hww()).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
                try {
                    byte[] bArr = new byte[1024];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        while (true) {
                            try {
                                int i11 = inputStream.read(bArr);
                                if (i11 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i11);
                            } catch (MalformedURLException e10) {
                                e = e10;
                                byteArray = null;
                            } catch (IOException e11) {
                                e = e11;
                                byteArray = null;
                            }
                            Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                            message = e.getMessage();
                            r10 = byteArrayOutputStream;
                            nod.hww(inputStream);
                            nod.hww(r10);
                            return new sd<>(i10, byteArray, message, mapHww);
                        }
                        mapHww = hvVar.tq() ? hww(httpURLConnection) : null;
                        nod.hww(inputStream);
                        nod.hww(byteArrayOutputStream);
                        message = "success";
                    } catch (MalformedURLException e12) {
                        e = e12;
                        Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                        message = e.getMessage();
                        r10 = byteArrayOutputStream;
                        nod.hww(inputStream);
                        nod.hww(r10);
                    } catch (IOException e13) {
                        e = e13;
                        Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                        message = e.getMessage();
                        r10 = byteArrayOutputStream;
                        nod.hww(inputStream);
                        nod.hww(r10);
                    }
                    i10 = 200;
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (MalformedURLException e14) {
                    e = e14;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                } catch (IOException e15) {
                    e = e15;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                    Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                    message = e.getMessage();
                    r10 = byteArrayOutputStream;
                    nod.hww(inputStream);
                    nod.hww(r10);
                    return new sd<>(i10, byteArray, message, mapHww);
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    nod.hww(inputStream2);
                    nod.hww(0);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (MalformedURLException e16) {
            e = e16;
            inputStream = null;
            byteArray = null;
        } catch (IOException e17) {
            e = e17;
            inputStream = null;
            byteArray = null;
        } catch (Throwable th4) {
            th = th4;
            nod.hww(inputStream2);
            nod.hww(0);
            throw th;
        }
        return new sd<>(i10, byteArray, message, mapHww);
    }

    private Map<String, String> hww(HttpURLConnection httpURLConnection) {
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                map.put(str, list.get(0));
            }
        }
        return map;
    }
}
