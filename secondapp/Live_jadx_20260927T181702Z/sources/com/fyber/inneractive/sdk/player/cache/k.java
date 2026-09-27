package com.fyber.inneractive.sdk.player.cache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f45463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f45464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f45465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45467e;

    public k(FileInputStream fileInputStream) {
        Charset charset = l.f45468a;
        charset.getClass();
        if (!charset.equals(charset)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f45463a = fileInputStream;
        this.f45464b = charset;
        this.f45465c = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    public final String a() {
        int i10;
        synchronized (this.f45463a) {
            try {
                byte[] bArr = this.f45465c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f45466d >= this.f45467e) {
                    int i11 = this.f45463a.read(bArr, 0, bArr.length);
                    if (i11 == -1) {
                        throw new EOFException();
                    }
                    this.f45466d = 0;
                    this.f45467e = i11;
                }
                for (int i12 = this.f45466d; i12 != this.f45467e; i12++) {
                    byte[] bArr2 = this.f45465c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f45466d;
                        if (i12 != i13) {
                            i10 = i12 - 1;
                            if (bArr2[i10] != 13) {
                                i10 = i12;
                            }
                        } else {
                            i10 = i12;
                        }
                        String str = new String(bArr2, i13, i10 - i13, this.f45464b.name());
                        this.f45466d = i12 + 1;
                        return str;
                    }
                }
                j jVar = new j(this, (this.f45467e - this.f45466d) + 80);
                while (true) {
                    byte[] bArr3 = this.f45465c;
                    int i14 = this.f45466d;
                    jVar.write(bArr3, i14, this.f45467e - i14);
                    this.f45467e = -1;
                    InputStream inputStream = this.f45463a;
                    byte[] bArr4 = this.f45465c;
                    int i15 = inputStream.read(bArr4, 0, bArr4.length);
                    if (i15 == -1) {
                        throw new EOFException();
                    }
                    this.f45466d = 0;
                    this.f45467e = i15;
                    for (int i16 = 0; i16 != this.f45467e; i16++) {
                        byte[] bArr5 = this.f45465c;
                        if (bArr5[i16] == 10) {
                            int i17 = this.f45466d;
                            if (i16 != i17) {
                                jVar.write(bArr5, i17, i16 - i17);
                            }
                            this.f45466d = i16 + 1;
                            return jVar.toString();
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
        synchronized (this.f45463a) {
            try {
                if (this.f45465c != null) {
                    this.f45465c = null;
                    this.f45463a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
