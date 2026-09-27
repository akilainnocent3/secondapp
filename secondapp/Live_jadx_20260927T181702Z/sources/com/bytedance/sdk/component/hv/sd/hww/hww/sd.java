package com.bytedance.sdk.component.hv.sd.hww.hww;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
class sd implements Closeable {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f34704hv;
    private final InputStream hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private byte[] f34705sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final Charset f34706tq;
    private int vy;

    public sd(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void sd() throws IOException {
        InputStream inputStream = this.hww;
        byte[] bArr = this.f34705sd;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.vy = 0;
        this.f34704hv = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.hww) {
            try {
                if (this.f34705sd != null) {
                    this.f34705sd = null;
                    this.hww.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean tq() {
        return this.f34704hv == -1;
    }

    public sd(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(vy.hww)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.hww = inputStream;
        this.f34706tq = charset;
        this.f34705sd = new byte[i10];
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public String hww() throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.hww) {
            try {
                if (this.f34705sd == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.vy >= this.f34704hv) {
                    sd();
                }
                for (int i12 = this.vy; i12 != this.f34704hv; i12++) {
                    byte[] bArr2 = this.f34705sd;
                    if (bArr2[i12] == 10) {
                        int i13 = this.vy;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] != 13) {
                                i11 = i12;
                            }
                        } else {
                            i11 = i12;
                        }
                        String str = new String(bArr2, i13, i11 - i13, this.f34706tq.name());
                        this.vy = i12 + 1;
                        return str;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.f34704hv - this.vy) + 80) { // from class: com.bytedance.sdk.component.hv.sd.hww.hww.sd.1
                    @Override // java.io.ByteArrayOutputStream
                    public String toString() {
                        int i14 = ((ByteArrayOutputStream) this).count;
                        if (i14 > 0 && ((ByteArrayOutputStream) this).buf[i14 - 1] == 13) {
                            i14--;
                        }
                        try {
                            return new String(((ByteArrayOutputStream) this).buf, 0, i14, sd.this.f34706tq.name());
                        } catch (UnsupportedEncodingException e10) {
                            throw new AssertionError(e10);
                        }
                    }
                };
                loop1: while (true) {
                    byte[] bArr3 = this.f34705sd;
                    int i14 = this.vy;
                    byteArrayOutputStream.write(bArr3, i14, this.f34704hv - i14);
                    this.f34704hv = -1;
                    sd();
                    i10 = this.vy;
                    while (i10 != this.f34704hv) {
                        bArr = this.f34705sd;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.vy;
                if (i10 != i15) {
                    byteArrayOutputStream.write(bArr, i15, i10 - i15);
                }
                this.vy = i10 + 1;
                return byteArrayOutputStream.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
