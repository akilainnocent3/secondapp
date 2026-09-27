package yt;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class p extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f159932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f159933e = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f159934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f159935c;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f159934b < this.f159935c;
        }

        @Override // yt.d.a
        public byte nextByte() {
            try {
                byte[] bArr = p.this.f159932d;
                int i10 = this.f159934b;
                this.f159934b = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public b() {
            this.f159934b = 0;
            this.f159935c = p.this.size();
        }
    }

    public p(byte[] bArr) {
        this.f159932d = bArr;
    }

    public static int B(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public int A() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof p) {
            return z((p) obj, 0, size());
        }
        if (obj instanceof u) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(strValueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int iQ = this.f159933e;
        if (iQ == 0) {
            int size = size();
            iQ = q(size, 0, size);
            if (iQ == 0) {
                iQ = 1;
            }
            this.f159933e = iQ;
        }
        return iQ;
    }

    @Override // yt.d
    public void i(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f159932d, i10, bArr, i11, i12);
    }

    @Override // yt.d
    public int j() {
        return 0;
    }

    @Override // yt.d
    public boolean l() {
        return true;
    }

    @Override // yt.d
    public boolean m() {
        int iA = A();
        return y.f(this.f159932d, iA, size() + iA);
    }

    @Override // yt.d, java.lang.Iterable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new b();
    }

    @Override // yt.d
    public e o() {
        return e.h(this);
    }

    @Override // yt.d
    public int q(int i10, int i11, int i12) {
        return B(i10, this.f159932d, A() + i11, i12);
    }

    @Override // yt.d
    public int r(int i10, int i11, int i12) {
        int iA = A() + i11;
        return y.g(i10, this.f159932d, iA, i12 + iA);
    }

    @Override // yt.d
    public int s() {
        return this.f159933e;
    }

    @Override // yt.d
    public int size() {
        return this.f159932d.length;
    }

    @Override // yt.d
    public String u(String str) throws UnsupportedEncodingException {
        return new String(this.f159932d, A(), size(), str);
    }

    @Override // yt.d
    public void x(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f159932d, A() + i10, i11);
    }

    public byte y(int i10) {
        return this.f159932d[i10];
    }

    public boolean z(p pVar, int i10, int i11) {
        if (i11 > pVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 + i11 > pVar.size()) {
            int size2 = pVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f159932d;
        byte[] bArr2 = pVar.f159932d;
        int iA = A() + i11;
        int iA2 = A();
        int iA3 = pVar.A() + i10;
        while (iA2 < iA) {
            if (bArr[iA2] != bArr2[iA3]) {
                return false;
            }
            iA2++;
            iA3++;
        }
        return true;
    }
}
