package com.cleveradssolutions.adapters.exchange.rendering.video;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class e extends com.cleveradssolutions.adapters.exchange.rendering.loading.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f42582k = "e";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f42583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.configuration.a f42584j;

    public e(Context context, File file, com.cleveradssolutions.adapters.exchange.rendering.loading.b bVar, com.cleveradssolutions.adapters.exchange.configuration.a aVar) {
        super(bVar, file);
        this.f42584j = aVar;
        this.f42583i = context.getApplicationContext();
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.networking.c
    public com.cleveradssolutions.adapters.exchange.rendering.networking.c.a h(com.cleveradssolutions.adapters.exchange.rendering.networking.c.b bVar) {
        String str = f42582k;
        com.cleveradssolutions.adapters.exchange.b.h(str, "url: " + bVar.f42411a);
        com.cleveradssolutions.adapters.exchange.b.h(str, "queryParams: " + bVar.f42412b);
        return s(bVar);
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.loading.c
    public void p(URLConnection uRLConnection, com.cleveradssolutions.adapters.exchange.rendering.networking.c.a aVar) throws IOException {
        String strR = r();
        if (this.f42145g.exists() && !h.b(strR)) {
            com.cleveradssolutions.adapters.exchange.b.h(f42582k, "Video saved to cache");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            t(uRLConnection, aVar, byteArrayOutputStream, false);
            h.d(strR, byteArrayOutputStream.toByteArray());
            return;
        }
        com.cleveradssolutions.adapters.exchange.b.h(f42582k, "Video saved to file: " + strR);
        t(uRLConnection, aVar, new FileOutputStream(this.f42145g), true);
    }

    public final String r() {
        String path = this.f42145g.getPath();
        int iLastIndexOf = path.lastIndexOf(to.c.userBaseDel);
        return iLastIndexOf != -1 ? path.substring(iLastIndexOf) : path;
    }

    public final com.cleveradssolutions.adapters.exchange.rendering.networking.c.a s(com.cleveradssolutions.adapters.exchange.rendering.networking.c.b bVar) {
        this.f42401a = new com.cleveradssolutions.adapters.exchange.rendering.networking.c.a();
        String strR = r();
        if (this.f42145g.exists()) {
            String str = f42582k;
            com.cleveradssolutions.adapters.exchange.b.h(str, "File exists: " + strR);
            if (v(this.f42145g) || !u(this.f42583i, this.f42145g)) {
                com.cleveradssolutions.adapters.exchange.b.h(str, "File " + strR + " is expired or broken. Downloading a new one");
                this.f42145g.delete();
            } else if (!h.b(strR)) {
            }
            this.f42401a = super.h(bVar);
        } else {
            this.f42401a = super.h(bVar);
        }
        return this.f42401a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0066 A[Catch: Exception -> 0x0069, TRY_LEAVE, TryCatch #1 {Exception -> 0x0069, blocks: (B:32:0x0061, B:34:0x0066), top: B:40:0x0061 }] */
    public final void t(URLConnection uRLConnection, com.cleveradssolutions.adapters.exchange.rendering.networking.c.a aVar, OutputStream outputStream, boolean z10) throws IOException {
        int contentLength = uRLConnection.getContentLength();
        InputStream inputStream = uRLConnection.getInputStream();
        byte[] bArr = new byte[16384];
        long j10 = 0;
        while (true) {
            try {
                try {
                    int i10 = inputStream.read(bArr);
                    try {
                        if (i10 == -1) {
                            inputStream.close();
                            if (outputStream != null) {
                                break;
                            } else {
                                return;
                            }
                        } else {
                            if (isCancelled()) {
                                if (z10 && this.f42145g.exists()) {
                                    this.f42145g.delete();
                                }
                                aVar.b(null);
                                inputStream.close();
                                if (outputStream != null) {
                                    break;
                                } else {
                                    return;
                                }
                            }
                            j10 += (long) i10;
                            if (contentLength > 0) {
                                publishProgress(Integer.valueOf((int) ((100 * j10) / ((long) contentLength))));
                            }
                            outputStream.write(bArr, 0, i10);
                        }
                    } catch (Exception unused) {
                        return;
                    }
                } catch (IOException e10) {
                    throw e10;
                }
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                    } catch (Exception unused2) {
                        throw th2;
                    }
                } else if (outputStream != null) {
                    outputStream.close();
                }
                throw th2;
            }
        }
        outputStream.close();
    }

    public final boolean u(Context context, File file) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(context, Uri.fromFile(file));
            return mediaMetadataRetriever.extractMetadata(17).equals("yes");
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean v(File file) {
        return Calendar.getInstance().getTime().getTime() - new Date(file.lastModified()).getTime() > TimeUnit.HOURS.toMillis(1L);
    }
}
