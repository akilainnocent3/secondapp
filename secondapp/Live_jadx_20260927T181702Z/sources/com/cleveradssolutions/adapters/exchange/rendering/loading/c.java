package com.cleveradssolutions.adapters.exchange.rendering.loading;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class c extends com.cleveradssolutions.adapters.exchange.rendering.networking.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f42144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public File f42145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f42146h;

    public c(b bVar, File file) {
        super(bVar);
        this.f42146h = false;
        if (file == null) {
            NullPointerException nullPointerException = new NullPointerException("File is null");
            if (bVar == null) {
                throw nullPointerException;
            }
            bVar.c(nullPointerException);
            throw nullPointerException;
        }
        this.f42145g = file;
        if (!file.exists()) {
            try {
                this.f42145g.createNewFile();
            } catch (IOException unused) {
                IllegalStateException illegalStateException = new IllegalStateException("Error creating file");
                bVar.c(illegalStateException);
                throw illegalStateException;
            }
        }
        this.f42144f = bVar;
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.networking.c, android.os.AsyncTask
    /* JADX INFO: renamed from: c */
    public void onPostExecute(com.cleveradssolutions.adapters.exchange.rendering.networking.c.a aVar) {
        if (aVar.a() != null) {
            com.cleveradssolutions.adapters.exchange.b.h("LibraryDownloadTask", "download of media failed" + aVar.a());
            b bVar = this.f42144f;
            if (bVar != null) {
                bVar.c(aVar.a());
                return;
            }
            return;
        }
        if (this.f42144f != null) {
            String path = this.f42145g.getPath();
            int iLastIndexOf = path.lastIndexOf(to.c.userBaseDel);
            b bVar2 = this.f42144f;
            if (iLastIndexOf != -1) {
                path = path.substring(iLastIndexOf);
            }
            bVar2.b(path);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077 A[Catch: all -> 0x0048, IOException -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x004b, blocks: (B:6:0x0028, B:8:0x002c, B:10:0x0034, B:20:0x004f, B:25:0x0077), top: B:42:0x0028, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b8 -> B:38:0x00bf). Please report as a decompilation issue!!! */
    @Override // com.cleveradssolutions.adapters.exchange.rendering.networking.c
    public com.cleveradssolutions.adapters.exchange.rendering.networking.c.a g(int i10, URLConnection uRLConnection) {
        com.cleveradssolutions.adapters.exchange.rendering.networking.c.a aVar = new com.cleveradssolutions.adapters.exchange.rendering.networking.c.a();
        try {
            if (i10 != 200) {
                aVar.b(new com.cleveradssolutions.adapters.exchange.api.exceptions.a("Server returned " + i10 + " status code", 200));
                return aVar;
            }
            try {
                if (this.f42146h) {
                    p(uRLConnection, aVar);
                    if (uRLConnection instanceof HttpURLConnection) {
                        uRLConnection = (HttpURLConnection) uRLConnection;
                        uRLConnection.disconnect();
                    } else {
                        uRLConnection = (HttpURLConnection) uRLConnection;
                        uRLConnection.disconnect();
                    }
                } else {
                    int contentLength = uRLConnection.getContentLength();
                    if (contentLength > 26214400) {
                        aVar.b(new com.cleveradssolutions.adapters.exchange.api.exceptions.a("FileDownloader encountered a file larger than SDK cap of 26214400", 200));
                        if (uRLConnection instanceof HttpURLConnection) {
                            ((HttpURLConnection) uRLConnection).disconnect();
                            return aVar;
                        }
                    } else if (contentLength <= 0) {
                        aVar.b(new com.cleveradssolutions.adapters.exchange.api.exceptions.a("FileDownloader encountered file with " + contentLength + " content length", 200));
                        if (uRLConnection instanceof HttpURLConnection) {
                            ((HttpURLConnection) uRLConnection).disconnect();
                            return aVar;
                        }
                    } else {
                        p(uRLConnection, aVar);
                        if (uRLConnection instanceof HttpURLConnection) {
                            uRLConnection = (HttpURLConnection) uRLConnection;
                            uRLConnection.disconnect();
                        } else {
                            uRLConnection = (HttpURLConnection) uRLConnection;
                            uRLConnection.disconnect();
                        }
                    }
                }
            } catch (IOException e10) {
                com.cleveradssolutions.adapters.exchange.b.a("LibraryDownloadTask", "download of media failed: " + Log.getStackTraceString(e10));
                aVar.b(new Exception("download of media failed " + e10.getMessage()));
                if (uRLConnection instanceof HttpURLConnection) {
                    uRLConnection = (HttpURLConnection) uRLConnection;
                    uRLConnection.disconnect();
                }
            }
            return aVar;
        } catch (Throwable th2) {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).disconnect();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0037  */
    /* JADX WARN: Code duplicated, block: B:26:0x003c  */
    public void p(URLConnection uRLConnection, com.cleveradssolutions.adapters.exchange.rendering.networking.c.a aVar) throws Throwable {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        inputStream = null;
        InputStream inputStream2 = null;
        fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(this.f42145g);
            try {
                inputStream2 = uRLConnection.getInputStream();
                byte[] bArr = new byte[16384];
                while (true) {
                    int i10 = inputStream2.read(bArr);
                    if (i10 == -1) {
                        fileOutputStream.close();
                        inputStream2.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
            } catch (IOException e10) {
                e = e10;
                inputStream = inputStream2;
                fileOutputStream2 = fileOutputStream;
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    InputStream inputStream3 = inputStream;
                    fileOutputStream = fileOutputStream2;
                    inputStream2 = inputStream3;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            InputStream inputStream4 = inputStream;
            fileOutputStream = fileOutputStream2;
            inputStream2 = inputStream4;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public void q(boolean z10) {
        this.f42146h = z10;
    }
}
