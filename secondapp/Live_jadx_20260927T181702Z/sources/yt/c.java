package yt;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class c extends p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f159857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f159858g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f159859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f159860c;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f159859b < this.f159860c;
        }

        @Override // yt.d.a
        public byte nextByte() {
            int i10 = this.f159859b;
            if (i10 >= this.f159860c) {
                throw new NoSuchElementException();
            }
            byte[] bArr = c.this.f159932d;
            this.f159859b = i10 + 1;
            return bArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public b() {
            int iA = c.this.A();
            this.f159859b = iA;
            this.f159860c = iA + c.this.size();
        }
    }

    public c(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (((long) i10) + ((long) i11) <= bArr.length) {
            this.f159857f = i10;
            this.f159858g = i11;
            return;
        }
        StringBuilder sb4 = new StringBuilder(48);
        sb4.append("Offset+Length too large: ");
        sb4.append(i10);
        sb4.append(com.google.android.material.badge.a.f50153v);
        sb4.append(i11);
        throw new IllegalArgumentException(sb4.toString());
    }

    @Override // yt.p
    public int A() {
        return this.f159857f;
    }

    @Override // yt.p, yt.d
    public void i(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f159932d, A() + i10, bArr, i11, i12);
    }

    @Override // yt.p, yt.d, java.lang.Iterable
    /* JADX INFO: renamed from: n */
    public d.a iterator() {
        return new b();
    }

    @Override // yt.p, yt.d
    public int size() {
        return this.f159858g;
    }

    @Override // yt.p
    public byte y(int i10) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Index too small: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        if (i10 < size()) {
            return this.f159932d[this.f159857f + i10];
        }
        int size = size();
        StringBuilder sb3 = new StringBuilder(41);
        sb3.append("Index too large: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(size);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }
}
