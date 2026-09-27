package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.ironsource.c6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
class CallableC4219c6 implements Callable<C4308h5> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f61182d = "FileWorkerThread";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f61183e = "X-Android-Protocols";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f61184f = "http/1.1,h2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4290g5 f61185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f61186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f61187c;

    public CallableC4219c6(C4290g5 c4290g5, String str, long j10) {
        this.f61185a = c4290g5;
        this.f61186b = str;
        this.f61187c = j10;
    }

    public int a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    public boolean a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    public byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 8192);
            if (i10 != -1) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4308h5 call() throws Throwable {
        CallableC4219c6 callableC4219c6;
        if (this.f61187c == 0) {
            this.f61187c = 1L;
        }
        C4308h5 c4308h5A = null;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f61187c) {
                callableC4219c6 = this;
                break;
            }
            callableC4219c6 = this;
            c4308h5A = callableC4219c6.a(this.f61185a.e(), i10, this.f61185a.a(), this.f61185a.c(), this.f61185a.f());
            int iB = c4308h5A.b();
            if (iB != 1008 && iB != 1009) {
                break;
            }
            i10++;
        }
        C4308h5 c4308h5 = c4308h5A;
        if (c4308h5 != null && c4308h5.a() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(callableC4219c6.f61186b);
            String str = File.separator;
            sb2.append(str);
            sb2.append(callableC4219c6.f61185a.b().getName());
            String string = sb2.toString();
            String str2 = callableC4219c6.f61185a.d() + str + C4271f4.E + callableC4219c6.f61185a.b().getName();
            try {
                if (a(c4308h5.a(), str2) == 0) {
                    c4308h5.a(1006);
                    return c4308h5;
                }
                if (!a(str2, string)) {
                    c4308h5.a(1014);
                    return c4308h5;
                }
            } catch (FileNotFoundException e10) {
                C4485r4.d().a(e10);
                c4308h5.a(1018);
            } catch (Error e11) {
                C4485r4.d().a(e11);
                if (!TextUtils.isEmpty(e11.getMessage())) {
                    Logger.i(f61182d, e11.getMessage());
                }
                c4308h5.a(1019);
            } catch (Exception e12) {
                C4485r4.d().a(e12);
                if (!TextUtils.isEmpty(e12.getMessage())) {
                    Logger.i(f61182d, e12.getMessage());
                }
                c4308h5.a(1009);
            }
        }
        return c4308h5;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0196 A[Catch: all -> 0x0192, TRY_LEAVE, TryCatch #10 {all -> 0x0192, blocks: (B:109:0x018e, B:113:0x0196), top: B:119:0x018e }] */
    /* JADX WARN: Multi-variable type inference failed */
    public C4308h5 a(String str, int i10, int i11, int i12, boolean z10) throws Throwable {
        HttpURLConnection httpURLConnection;
        C4308h5 c4308h5 = new C4308h5();
        if (TextUtils.isEmpty(str)) {
            c4308h5.a(str);
            c4308h5.a(1007);
            return c4308h5;
        }
        InputStream inputStream = null;
        Object[] objArr = 0;
        InputStream inputStream2 = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        int responseCode = 0;
        try {
            try {
                try {
                    try {
                        URL url = new URL(str);
                        url.toURI();
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                        try {
                            httpURLConnection.setRequestMethod("GET");
                            if (z10) {
                                try {
                                    httpURLConnection.setRequestProperty(f61183e, f61184f);
                                } catch (IllegalStateException e10) {
                                    C4485r4.d().a(e10);
                                }
                            }
                            httpURLConnection.setConnectTimeout(i11);
                            httpURLConnection.setReadTimeout(i12);
                            httpURLConnection.connect();
                            responseCode = httpURLConnection.getResponseCode();
                            if (responseCode >= 200 && responseCode < 400) {
                                inputStream2 = httpURLConnection.getInputStream();
                                c4308h5.a(a(inputStream2));
                            } else {
                                Logger.i(f61182d, " RESPONSE CODE: " + responseCode + " URL: " + str + " ATTEMPT: " + i10);
                                responseCode = 1011;
                            }
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            httpURLConnection.disconnect();
                        } catch (FileNotFoundException e11) {
                            e = e11;
                            C4485r4.d().a(e);
                            i10 = 1018;
                            if (0 != 0) {
                                (objArr2 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c4308h5.a(str);
                            c4308h5.a(i10);
                            return c4308h5;
                        } catch (Error e12) {
                            e = e12;
                            C4485r4.d().a(e);
                            responseCode = 1019;
                            if (!TextUtils.isEmpty(e.getMessage())) {
                                Logger.i(f61182d, e.getMessage());
                            }
                            if (0 != 0) {
                                (objArr3 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        } catch (MalformedURLException e13) {
                            e = e13;
                            C4485r4.d().a(e);
                            i10 = 1004;
                            if (0 != 0) {
                                (objArr4 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c4308h5.a(str);
                            c4308h5.a(i10);
                            return c4308h5;
                        } catch (SocketTimeoutException e14) {
                            e = e14;
                            C4485r4.d().a(e);
                            i10 = 1008;
                            if (0 != 0) {
                                (objArr5 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c4308h5.a(str);
                            c4308h5.a(i10);
                            return c4308h5;
                        } catch (URISyntaxException e15) {
                            e = e15;
                            C4485r4.d().a(e);
                            i10 = 1010;
                            if (0 != 0) {
                                (objArr6 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c4308h5.a(str);
                            c4308h5.a(i10);
                            return c4308h5;
                        } catch (Exception e16) {
                            e = e16;
                            C4485r4.d().a(e);
                            if (!TextUtils.isEmpty(e.getMessage())) {
                                Logger.i(f61182d, e.getMessage());
                            }
                            i10 = 1009;
                            if (0 != 0) {
                                (objArr7 == true ? 1 : 0).close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c4308h5.a(str);
                            c4308h5.a(i10);
                            return c4308h5;
                        }
                    } catch (Throwable th2) {
                        C4485r4.d().a(th2);
                        IronLog.INTERNAL.error(th2.toString());
                    }
                } catch (Throwable th3) {
                    C4485r4.d().a(th3);
                    IronLog.INTERNAL.error(th3.toString());
                    c4308h5.a(str);
                    c4308h5.a(i10);
                }
            } catch (FileNotFoundException e17) {
                e = e17;
                httpURLConnection = null;
            } catch (Error e18) {
                e = e18;
                httpURLConnection = null;
            } catch (MalformedURLException e19) {
                e = e19;
                httpURLConnection = null;
            } catch (SocketTimeoutException e20) {
                e = e20;
                httpURLConnection = null;
            } catch (URISyntaxException e21) {
                e = e21;
                httpURLConnection = null;
            } catch (Exception e22) {
                e = e22;
                httpURLConnection = null;
            } catch (Throwable th4) {
                th = th4;
                if (0 != 0) {
                    try {
                        inputStream.close();
                        if (0 != 0) {
                            (objArr == true ? 1 : 0).disconnect();
                        }
                    } catch (Throwable th5) {
                        C4485r4.d().a(th5);
                        IronLog.INTERNAL.error(th5.toString());
                        c4308h5.a(str);
                        c4308h5.a(0);
                        throw th;
                    }
                } else if (0 != 0) {
                    (objArr == true ? 1 : 0).disconnect();
                }
                c4308h5.a(str);
                c4308h5.a(0);
                throw th;
            }
            c4308h5.a(str);
            c4308h5.a(responseCode);
            return c4308h5;
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
