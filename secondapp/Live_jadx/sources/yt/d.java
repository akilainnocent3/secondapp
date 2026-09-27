package yt;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class d implements Iterable<Byte> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f159862b = new p(new byte[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ boolean f159863c = false;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a extends Iterator<Byte> {
        byte nextByte();
    }

    public static d a(Iterator<d> it, int i10) {
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        return a(it, i11).b(a(it, i10 - i11));
    }

    public static d d(Iterable<d> iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator<d> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList.isEmpty() ? f159862b : a(arrayList.iterator(), arrayList.size());
    }

    public static d e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public static d f(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new p(bArr2);
    }

    public static d g(String str) {
        try {
            return new p(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public static b p() {
        return new b(128);
    }

    public d b(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return u.B(this, dVar);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append(com.google.android.material.badge.a.f50153v);
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public void h(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i12 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i13);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i12 > 0) {
                i(bArr, i10, i11, i12);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i14);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    public abstract void i(byte[] bArr, int i10, int i11, int i12);

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract int j();

    public abstract boolean l();

    public abstract boolean m();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: n */
    public abstract a iterator();

    public abstract e o();

    public abstract int q(int i10, int i11, int i12);

    public abstract int r(int i10, int i11, int i12);

    public abstract int s();

    public abstract int size();

    public byte[] t() {
        int size = size();
        if (size == 0) {
            return j.f159920a;
        }
        byte[] bArr = new byte[size];
        i(bArr, 0, 0, size);
        return bArr;
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String u(String str) throws UnsupportedEncodingException;

    public String v() {
        try {
            return u("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public void w(OutputStream outputStream, int i10, int i11) throws IOException {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= size()) {
            if (i11 > 0) {
                x(outputStream, i10, i11);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    public abstract void x(OutputStream outputStream, int i10, int i11) throws IOException;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends OutputStream {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final byte[] f159864g = new byte[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f159865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<d> f159866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f159867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f159868e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f159869f;

        public b(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f159865b = i10;
            this.f159866c = new ArrayList<>();
            this.f159868e = new byte[i10];
        }

        public final byte[] a(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        public final void b(int i10) {
            this.f159866c.add(new p(this.f159868e));
            int length = this.f159867d + this.f159868e.length;
            this.f159867d = length;
            this.f159868e = new byte[Math.max(this.f159865b, Math.max(i10, length >>> 1))];
            this.f159869f = 0;
        }

        public final void d() {
            int i10 = this.f159869f;
            byte[] bArr = this.f159868e;
            if (i10 >= bArr.length) {
                this.f159866c.add(new p(this.f159868e));
                this.f159868e = f159864g;
            } else if (i10 > 0) {
                this.f159866c.add(new p(a(bArr, i10)));
            }
            this.f159867d += this.f159869f;
            this.f159869f = 0;
        }

        public synchronized int h() {
            return this.f159867d + this.f159869f;
        }

        public synchronized d k() {
            d();
            return d.d(this.f159866c);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(h()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.f159869f == this.f159868e.length) {
                    b(1);
                }
                byte[] bArr = this.f159868e;
                int i11 = this.f159869f;
                this.f159869f = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f159868e;
                int length = bArr2.length;
                int i12 = this.f159869f;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f159869f += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    b(i13);
                    System.arraycopy(bArr, i10 + length2, this.f159868e, 0, i13);
                    this.f159869f = i13;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
