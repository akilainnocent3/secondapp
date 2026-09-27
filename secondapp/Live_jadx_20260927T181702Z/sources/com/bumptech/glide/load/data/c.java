package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.OutputStream;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final OutputStream f31429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f31430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public wb.b f31431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31432e;

    public c(@NonNull OutputStream outputStream, @NonNull wb.b bVar) {
        this(outputStream, bVar, 65536);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f31429b.close();
            release();
        } catch (Throwable th2) {
            this.f31429b.close();
            throw th2;
        }
    }

    public final void d() throws IOException {
        int i10 = this.f31432e;
        if (i10 > 0) {
            this.f31429b.write(this.f31430c, 0, i10);
            this.f31432e = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        d();
        this.f31429b.flush();
    }

    public final void h() throws IOException {
        if (this.f31432e == this.f31430c.length) {
            d();
        }
    }

    public final void release() {
        byte[] bArr = this.f31430c;
        if (bArr != null) {
            this.f31431d.put(bArr);
            this.f31430c = null;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f31430c;
        int i11 = this.f31432e;
        this.f31432e = i11 + 1;
        bArr[i11] = (byte) i10;
        h();
    }

    @h1
    public c(@NonNull OutputStream outputStream, wb.b bVar, int i10) {
        this.f31429b = outputStream;
        this.f31431d = bVar;
        this.f31430c = (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f31432e;
            if (i15 == 0 && i13 >= this.f31430c.length) {
                this.f31429b.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f31430c.length - i15);
            System.arraycopy(bArr, i14, this.f31430c, this.f31432e, iMin);
            this.f31432e += iMin;
            i12 += iMin;
            h();
        } while (i12 < i11);
    }
}
