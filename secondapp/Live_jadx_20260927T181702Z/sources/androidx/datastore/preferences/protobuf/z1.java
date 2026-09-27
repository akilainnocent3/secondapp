package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class z1 extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator<ByteBuffer> f10461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f10462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10463d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f10467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10469j;

    public z1(Iterable<ByteBuffer> data) {
        this.f10461b = data.iterator();
        for (ByteBuffer byteBuffer : data) {
            this.f10463d++;
        }
        this.f10464e = -1;
        if (d()) {
            return;
        }
        this.f10462c = t1.f10219f;
        this.f10464e = 0;
        this.f10465f = 0;
        this.f10469j = 0L;
    }

    public final boolean d() {
        this.f10464e++;
        if (!this.f10461b.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f10461b.next();
        this.f10462c = next;
        this.f10465f = next.position();
        if (this.f10462c.hasArray()) {
            this.f10466g = true;
            this.f10467h = this.f10462c.array();
            this.f10468i = this.f10462c.arrayOffset();
        } else {
            this.f10466g = false;
            this.f10469j = b5.k(this.f10462c);
            this.f10467h = null;
        }
        return true;
    }

    public final void h(int numberOfBytesRead) {
        int i10 = this.f10465f + numberOfBytesRead;
        this.f10465f = i10;
        if (i10 == this.f10462c.limit()) {
            d();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f10464e == this.f10463d) {
            return -1;
        }
        if (this.f10466g) {
            int i10 = this.f10467h[this.f10465f + this.f10468i] & 255;
            h(1);
            return i10;
        }
        int iA = b5.A(((long) this.f10465f) + this.f10469j) & 255;
        h(1);
        return iA;
    }

    @Override // java.io.InputStream
    public int read(byte[] output, int offset, int length) throws IOException {
        if (this.f10464e == this.f10463d) {
            return -1;
        }
        int iLimit = this.f10462c.limit();
        int i10 = this.f10465f;
        int i11 = iLimit - i10;
        if (length > i11) {
            length = i11;
        }
        if (this.f10466g) {
            System.arraycopy(this.f10467h, i10 + this.f10468i, output, offset, length);
            h(length);
            return length;
        }
        int iPosition = this.f10462c.position();
        a2.e(this.f10462c, this.f10465f);
        this.f10462c.get(output, offset, length);
        a2.e(this.f10462c, iPosition);
        h(length);
        return length;
    }
}
