package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
final class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f70179a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f70180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f70181c;

    public m(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f70180b = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.f70179a;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f70180b.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f70181c) {
            return;
        }
        c cVar = this.f70179a;
        long j10 = cVar.f70154b;
        if (j10 > 0) {
            this.f70180b.a(cVar, j10);
        }
        th = null;
        try {
            this.f70180b.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f70181c = true;
        if (th != null) {
            u.a(th);
        }
    }

    public d d() throws IOException {
        if (this.f70181c) {
            throw new IllegalStateException("closed");
        }
        long jM = this.f70179a.m();
        if (jM > 0) {
            this.f70180b.a(this.f70179a, jM);
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        if (this.f70181c) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f70179a;
        long j10 = cVar.f70154b;
        if (j10 > 0) {
            this.f70180b.a(cVar, j10);
        }
        this.f70180b.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f70181c;
    }

    public String toString() {
        return "buffer(" + this.f70180b + gi.j.f86771d;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr) throws IOException {
        if (this.f70181c) {
            throw new IllegalStateException("closed");
        }
        this.f70179a.write(bArr);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeByte(int i10) throws IOException {
        if (this.f70181c) {
            throw new IllegalStateException("closed");
        }
        this.f70179a.writeByte(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeInt(int i10) throws IOException {
        if (this.f70181c) {
            throw new IllegalStateException("closed");
        }
        this.f70179a.writeInt(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeShort(int i10) throws IOException {
        if (this.f70181c) {
            throw new IllegalStateException("closed");
        }
        this.f70179a.writeShort(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) throws IOException {
        if (this.f70181c) {
            throw new IllegalStateException("closed");
        }
        this.f70179a.a(cVar, j10);
        d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f70181c) {
            this.f70179a.write(bArr, i10, i11);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(String str) throws IOException {
        if (!this.f70181c) {
            this.f70179a.a(str);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f70181c) {
            int iWrite = this.f70179a.write(byteBuffer);
            d();
            return iWrite;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(long j10) throws IOException {
        if (!this.f70181c) {
            this.f70179a.a(j10);
            return d();
        }
        throw new IllegalStateException("closed");
    }
}
