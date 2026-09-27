package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f75319a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xj f75320b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f75321c = null;

    /* JADX WARN: Code duplicated, block: B:137:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:? A[Catch: all -> 0x00f8, SYNTHETIC, TRY_LEAVE, TryCatch #4 {all -> 0x00f8, blocks: (B:20:0x0058, B:48:0x00dd, B:66:0x010a, B:75:0x0126, B:93:0x014f, B:92:0x014c, B:21:0x0063, B:47:0x00da, B:65:0x0107, B:74:0x0123, B:87:0x0144, B:86:0x0141, B:89:0x0147), top: B:133:0x0058, inners: #6, #7 }] */
    public final String a(Context context, URL url, String str, gj gjVar) {
        File fileCreateTempFile;
        URLConnection uRLConnectionOpenConnection;
        boolean z10;
        int i10;
        this.f75321c = url.toString();
        this.f75319a = true;
        try {
            int iK = AdsCommonMetaData.k().F().k();
            File file = new File(context.getCacheDir(), "StartIoVideos");
            if (str != null) {
                try {
                    file = new File(file, str);
                } catch (Throwable th2) {
                    th = th2;
                    fileCreateTempFile = null;
                    uRLConnectionOpenConnection = null;
                }
            }
            try {
                if (file.exists()) {
                    String path = file.getPath();
                    this.f75321c = null;
                    return path;
                }
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    this.f75321c = null;
                    return null;
                }
                parentFile.mkdirs();
                fileCreateTempFile = File.createTempFile("tmp-", ".temp", parentFile);
                try {
                    uRLConnectionOpenConnection = url.openConnection();
                    try {
                        uRLConnectionOpenConnection.connect();
                        int contentLength = uRLConnectionOpenConnection.getContentLength();
                        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                            try {
                                byte[] bArr = new byte[4096];
                                int i11 = 0;
                                int i12 = 0;
                                boolean z11 = false;
                                int i13 = 0;
                                while (true) {
                                    i10 = inputStream.read(bArr);
                                    if (i10 <= 0 || !this.f75319a) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, i11, i10);
                                    i12 += i10;
                                    int i14 = iK;
                                    int i15 = (int) ((((double) i12) * 100.0d) / ((double) contentLength));
                                    if (i15 >= i14) {
                                        if (!z11) {
                                            new Handler(Looper.getMainLooper()).post(new ke(gjVar, fileCreateTempFile.getPath()));
                                            z11 = true;
                                        }
                                        if (i15 >= i13 + 1) {
                                            if (this.f75320b != null) {
                                                new Handler(Looper.getMainLooper()).post(new le(this, i15));
                                            }
                                            i13 = i15;
                                        }
                                    }
                                    iK = i14;
                                    i11 = 0;
                                }
                                if (!this.f75319a && i10 > 0) {
                                    fileOutputStream.close();
                                    inputStream.close();
                                    this.f75321c = null;
                                    if (fileCreateTempFile != null && fileCreateTempFile.exists()) {
                                        fileCreateTempFile.delete();
                                    }
                                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                                        ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                                    }
                                    return "downloadInterrupted";
                                }
                                if (!fileCreateTempFile.renameTo(file)) {
                                    fileOutputStream.close();
                                    inputStream.close();
                                    this.f75321c = null;
                                    if (fileCreateTempFile.exists()) {
                                        fileCreateTempFile.delete();
                                    }
                                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                                        return null;
                                    }
                                    return null;
                                }
                                String path2 = file.getPath();
                                fileOutputStream.close();
                                inputStream.close();
                                this.f75321c = null;
                                if (fileCreateTempFile.exists()) {
                                    fileCreateTempFile.delete();
                                }
                                if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                                    ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                                }
                                return path2;
                            } catch (Throwable th3) {
                                try {
                                    fileOutputStream.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            if (inputStream != null) {
                                throw th5;
                            }
                            try {
                                inputStream.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                        if (inputStream != null) {
                            throw th5;
                        }
                        inputStream.close();
                        throw th5;
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    uRLConnectionOpenConnection = null;
                }
                if (!(th instanceof IOException) && !(th instanceof OutOfMemoryError)) {
                    d9.a(th);
                }
                if (!z10) {
                    return null;
                }
                return null;
            } finally {
                this.f75321c = null;
                if (fileCreateTempFile != null && fileCreateTempFile.exists()) {
                    fileCreateTempFile.delete();
                }
                if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                }
            }
        } catch (Throwable th9) {
            th = th9;
            fileCreateTempFile = null;
        }
        uRLConnectionOpenConnection = null;
    }
}
