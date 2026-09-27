package yt;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class u extends yt.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f159937j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f159938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yt.d f159939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yt.d f159940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f159941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f159942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f159943i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Stack<yt.d> f159944a;

        public b() {
            this.f159944a = new Stack<>();
        }

        public final yt.d b(yt.d dVar, yt.d dVar2) {
            c(dVar);
            c(dVar2);
            yt.d dVarPop = this.f159944a.pop();
            while (!this.f159944a.isEmpty()) {
                dVarPop = new u(this.f159944a.pop(), dVarPop);
            }
            return dVarPop;
        }

        public final void c(yt.d dVar) {
            if (dVar.l()) {
                e(dVar);
                return;
            }
            if (dVar instanceof u) {
                u uVar = (u) dVar;
                c(uVar.f159939e);
                c(uVar.f159940f);
            } else {
                String strValueOf = String.valueOf(dVar.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(strValueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        public final int d(int i10) {
            int iBinarySearch = Arrays.binarySearch(u.f159937j, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        public final void e(yt.d dVar) {
            int iD = d(dVar.size());
            int i10 = u.f159937j[iD + 1];
            if (this.f159944a.isEmpty() || this.f159944a.peek().size() >= i10) {
                this.f159944a.push(dVar);
                return;
            }
            int i11 = u.f159937j[iD];
            yt.d dVarPop = this.f159944a.pop();
            while (true) {
                if (this.f159944a.isEmpty() || this.f159944a.peek().size() >= i11) {
                    break;
                } else {
                    dVarPop = new u(this.f159944a.pop(), dVarPop);
                }
            }
            u uVar = new u(dVarPop, dVar);
            while (!this.f159944a.isEmpty()) {
                if (this.f159944a.peek().size() >= u.f159937j[d(uVar.size()) + 1]) {
                    break;
                } else {
                    uVar = new u(this.f159944a.pop(), uVar);
                }
            }
            this.f159944a.push(uVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c implements Iterator<p> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Stack<u> f159945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p f159946c;

        public final p a(yt.d dVar) {
            while (dVar instanceof u) {
                u uVar = (u) dVar;
                this.f159945b.push(uVar);
                dVar = uVar.f159939e;
            }
            return (p) dVar;
        }

        public final p b() {
            while (!this.f159945b.isEmpty()) {
                p pVarA = a(this.f159945b.pop().f159940f);
                if (!pVarA.isEmpty()) {
                    return pVarA;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public p next() {
            p pVar = this.f159946c;
            if (pVar == null) {
                throw new NoSuchElementException();
            }
            this.f159946c = b();
            return pVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f159946c != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public c(yt.d dVar) {
            this.f159945b = new Stack<>();
            this.f159946c = a(dVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements yt.d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f159947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public yt.d.a f159948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f159949d;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f159949d > 0;
        }

        @Override // yt.d.a
        public byte nextByte() {
            if (!this.f159948c.hasNext()) {
                this.f159948c = this.f159947b.next().iterator();
            }
            this.f159949d--;
            return this.f159948c.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public d() {
            c cVar = new c(u.this);
            this.f159947b = cVar;
            this.f159948c = cVar.next().iterator();
            this.f159949d = u.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f159937j = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f159937j;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    public static yt.d B(yt.d dVar, yt.d dVar2) {
        u uVar = dVar instanceof u ? (u) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() == 0) {
            return dVar2;
        }
        int size = dVar.size() + dVar2.size();
        if (size < 128) {
            return C(dVar, dVar2);
        }
        if (uVar != null && uVar.f159940f.size() + dVar2.size() < 128) {
            return new u(uVar.f159939e, C(uVar.f159940f, dVar2));
        }
        if (uVar == null || uVar.f159939e.j() <= uVar.f159940f.j() || uVar.j() <= dVar2.j()) {
            return size >= f159937j[Math.max(dVar.j(), dVar2.j()) + 1] ? new u(dVar, dVar2) : new b().b(dVar, dVar2);
        }
        return new u(uVar.f159939e, new u(uVar.f159940f, dVar2));
    }

    public static p C(yt.d dVar, yt.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.h(bArr, 0, 0, size);
        dVar2.h(bArr, 0, size, size2);
        return new p(bArr);
    }

    public final boolean D(yt.d dVar) {
        c cVar = new c(this);
        p next = cVar.next();
        c cVar2 = new c(dVar);
        p next2 = cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = next.size() - i10;
            int size2 = next2.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? next.z(next2, i11, iMin) : next2.z(next, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f159938d;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                next = cVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size2) {
                next2 = cVar2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    public boolean equals(Object obj) {
        int iS;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yt.d)) {
            return false;
        }
        yt.d dVar = (yt.d) obj;
        if (this.f159938d != dVar.size()) {
            return false;
        }
        if (this.f159938d == 0) {
            return true;
        }
        if (this.f159943i == 0 || (iS = dVar.s()) == 0 || this.f159943i == iS) {
            return D(dVar);
        }
        return false;
    }

    public int hashCode() {
        int iQ = this.f159943i;
        if (iQ == 0) {
            int i10 = this.f159938d;
            iQ = q(i10, 0, i10);
            if (iQ == 0) {
                iQ = 1;
            }
            this.f159943i = iQ;
        }
        return iQ;
    }

    @Override // yt.d
    public void i(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f159941g;
        if (i13 <= i14) {
            this.f159939e.i(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f159940f.i(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f159939e.i(bArr, i10, i11, i15);
            this.f159940f.i(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // yt.d
    public int j() {
        return this.f159942h;
    }

    @Override // yt.d
    public boolean l() {
        return this.f159938d >= f159937j[this.f159942h];
    }

    @Override // yt.d
    public boolean m() {
        int iR = this.f159939e.r(0, 0, this.f159941g);
        yt.d dVar = this.f159940f;
        return dVar.r(iR, 0, dVar.size()) == 0;
    }

    @Override // yt.d, java.lang.Iterable
    /* JADX INFO: renamed from: n */
    public yt.d.a iterator() {
        return new d();
    }

    @Override // yt.d
    public yt.e o() {
        return yt.e.g(new e());
    }

    @Override // yt.d
    public int q(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f159941g;
        if (i13 <= i14) {
            return this.f159939e.q(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f159940f.q(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f159940f.q(this.f159939e.q(i10, i11, i15), 0, i12 - i15);
    }

    @Override // yt.d
    public int r(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f159941g;
        if (i13 <= i14) {
            return this.f159939e.r(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f159940f.r(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f159940f.r(this.f159939e.r(i10, i11, i15), 0, i12 - i15);
    }

    @Override // yt.d
    public int s() {
        return this.f159943i;
    }

    @Override // yt.d
    public int size() {
        return this.f159938d;
    }

    @Override // yt.d
    public String u(String str) throws UnsupportedEncodingException {
        return new String(t(), str);
    }

    @Override // yt.d
    public void x(OutputStream outputStream, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        int i13 = this.f159941g;
        if (i12 <= i13) {
            this.f159939e.x(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f159940f.x(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f159939e.x(outputStream, i10, i14);
            this.f159940f.x(outputStream, 0, i11 - i14);
        }
    }

    public u(yt.d dVar, yt.d dVar2) {
        this.f159943i = 0;
        this.f159939e = dVar;
        this.f159940f = dVar2;
        int size = dVar.size();
        this.f159941g = size;
        this.f159938d = size + dVar2.size();
        this.f159942h = Math.max(dVar.j(), dVar2.j()) + 1;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends InputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f159951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p f159952c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f159953d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f159954e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f159955f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f159956g;

        public e() {
            h();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return u.this.size() - (this.f159955f + this.f159954e);
        }

        public final void d() {
            if (this.f159952c != null) {
                int i10 = this.f159954e;
                int i11 = this.f159953d;
                if (i10 == i11) {
                    this.f159955f += i11;
                    this.f159954e = 0;
                    if (!this.f159951b.hasNext()) {
                        this.f159952c = null;
                        this.f159953d = 0;
                    } else {
                        p next = this.f159951b.next();
                        this.f159952c = next;
                        this.f159953d = next.size();
                    }
                }
            }
        }

        public final void h() {
            c cVar = new c(u.this);
            this.f159951b = cVar;
            p next = cVar.next();
            this.f159952c = next;
            this.f159953d = next.size();
            this.f159954e = 0;
            this.f159955f = 0;
        }

        public final int i(byte[] bArr, int i10, int i11) {
            int i12 = i11;
            while (i12 > 0) {
                d();
                if (this.f159952c == null) {
                    if (i12 != i11) {
                        break;
                    }
                    return -1;
                }
                int iMin = Math.min(this.f159953d - this.f159954e, i12);
                if (bArr != null) {
                    this.f159952c.h(bArr, this.f159954e, i10, iMin);
                    i10 += iMin;
                }
                this.f159954e += iMin;
                i12 -= iMin;
            }
            return i11 - i12;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f159956g = this.f159955f + this.f159954e;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            bArr.getClass();
            if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            return i(bArr, i10, i11);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            h();
            i(null, 0, this.f159956g);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (j10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j10 > 2147483647L) {
                j10 = 2147483647L;
            }
            return i(null, 0, (int) j10);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            d();
            p pVar = this.f159952c;
            if (pVar == null) {
                return -1;
            }
            int i10 = this.f159954e;
            this.f159954e = i10 + 1;
            return pVar.y(i10) & 255;
        }
    }
}
