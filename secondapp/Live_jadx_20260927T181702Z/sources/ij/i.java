package ij;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.c
@r
@yi.d
public final class i extends Reader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @zq.a
    public CharSequence f94360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f94362d;

    public i(CharSequence seq) {
        this.f94360b = (CharSequence) zi.l0.E(seq);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f94360b = null;
    }

    public final void d() throws IOException {
        if (this.f94360b == null) {
            throw new IOException("reader closed");
        }
    }

    public final boolean h() {
        return k() > 0;
    }

    public final int k() {
        Objects.requireNonNull(this.f94360b);
        return this.f94360b.length() - this.f94361c;
    }

    @Override // java.io.Reader
    public synchronized void mark(int readAheadLimit) throws IOException {
        zi.l0.k(readAheadLimit >= 0, "readAheadLimit (%s) may not be negative", readAheadLimit);
        d();
        this.f94362d = this.f94361c;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer target) throws IOException {
        zi.l0.E(target);
        d();
        Objects.requireNonNull(this.f94360b);
        if (!h()) {
            return -1;
        }
        int iMin = Math.min(target.remaining(), k());
        for (int i10 = 0; i10 < iMin; i10++) {
            CharSequence charSequence = this.f94360b;
            int i11 = this.f94361c;
            this.f94361c = i11 + 1;
            target.put(charSequence.charAt(i11));
        }
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
        d();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        d();
        this.f94361c = this.f94362d;
    }

    @Override // java.io.Reader
    public synchronized long skip(long n10) throws IOException {
        int iMin;
        zi.l0.p(n10 >= 0, "n (%s) may not be negative", n10);
        d();
        iMin = (int) Math.min(k(), n10);
        this.f94361c += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
        int iCharAt;
        d();
        Objects.requireNonNull(this.f94360b);
        if (h()) {
            CharSequence charSequence = this.f94360b;
            int i10 = this.f94361c;
            this.f94361c = i10 + 1;
            iCharAt = charSequence.charAt(i10);
        } else {
            iCharAt = -1;
        }
        return iCharAt;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cbuf, int off, int len) throws IOException {
        zi.l0.f0(off, off + len, cbuf.length);
        d();
        Objects.requireNonNull(this.f94360b);
        if (!h()) {
            return -1;
        }
        int iMin = Math.min(len, k());
        for (int i10 = 0; i10 < iMin; i10++) {
            CharSequence charSequence = this.f94360b;
            int i11 = this.f94361c;
            this.f94361c = i11 + 1;
            cbuf[off + i10] = charSequence.charAt(i11);
        }
        return iMin;
    }
}
