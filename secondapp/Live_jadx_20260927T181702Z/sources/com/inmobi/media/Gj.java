package com.inmobi.media;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Gj implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileInputStream f54732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f54733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f54734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54736e;

    public Gj(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        if (!charset.equals(AbstractC3571bl.f56088a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f54732a = fileInputStream;
        this.f54733b = charset;
        this.f54734c = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    public final String a() {
        int i10;
        synchronized (this.f54732a) {
            try {
                byte[] bArr = this.f54734c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f54735d >= this.f54736e) {
                    int i11 = this.f54732a.read(bArr, 0, bArr.length);
                    if (i11 == -1) {
                        throw new EOFException();
                    }
                    this.f54735d = 0;
                    this.f54736e = i11;
                }
                for (int i12 = this.f54735d; i12 != this.f54736e; i12++) {
                    byte[] bArr2 = this.f54734c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f54735d;
                        if (i12 != i13) {
                            i10 = i12 - 1;
                            if (bArr2[i10] != 13) {
                                i10 = i12;
                            }
                        } else {
                            i10 = i12;
                        }
                        String str = new String(bArr2, i13, i10 - i13, this.f54733b.name());
                        this.f54735d = i12 + 1;
                        return str;
                    }
                }
                Fj fj2 = new Fj(this, (this.f54736e - this.f54735d) + 80);
                while (true) {
                    byte[] bArr3 = this.f54734c;
                    int i14 = this.f54735d;
                    fj2.write(bArr3, i14, this.f54736e - i14);
                    this.f54736e = -1;
                    FileInputStream fileInputStream = this.f54732a;
                    byte[] bArr4 = this.f54734c;
                    int i15 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i15 == -1) {
                        throw new EOFException();
                    }
                    this.f54735d = 0;
                    this.f54736e = i15;
                    for (int i16 = 0; i16 != this.f54736e; i16++) {
                        byte[] bArr5 = this.f54734c;
                        if (bArr5[i16] == 10) {
                            int i17 = this.f54735d;
                            if (i16 != i17) {
                                fj2.write(bArr5, i17, i16 - i17);
                            }
                            this.f54735d = i16 + 1;
                            return fj2.toString();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f54732a) {
            try {
                if (this.f54734c != null) {
                    this.f54734c = null;
                    this.f54732a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
