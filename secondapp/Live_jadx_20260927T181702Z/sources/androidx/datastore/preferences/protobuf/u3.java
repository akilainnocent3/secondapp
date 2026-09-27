package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class u3 extends u {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f10269p = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f10270q = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f10271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u f10272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u f10273m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10275o;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends u.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f10276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u.g f10277c = b();

        public a() {
            this.f10276b = new c(u3.this, null);
        }

        public final u.g b() {
            if (this.f10276b.hasNext()) {
                return this.f10276b.next().iterator();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10277c != null;
        }

        @Override // androidx.datastore.preferences.protobuf.u.g
        public byte nextByte() {
            u.g gVar = this.f10277c;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = gVar.nextByte();
            if (!this.f10277c.hasNext()) {
                this.f10277c = b();
            }
            return bNextByte;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements Iterator<u.i> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayDeque<u3> f10280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u.i f10281c;

        public /* synthetic */ c(u uVar, a aVar) {
            this(uVar);
        }

        public final u.i a(u root) {
            while (root instanceof u3) {
                u3 u3Var = (u3) root;
                this.f10280b.push(u3Var);
                root = u3Var.f10272l;
            }
            return (u.i) root;
        }

        public final u.i b() {
            u.i iVarA;
            do {
                ArrayDeque<u3> arrayDeque = this.f10280b;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                iVarA = a(this.f10280b.pop().f10273m);
            } while (iVarA.isEmpty());
            return iVarA;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public u.i next() {
            u.i iVar = this.f10281c;
            if (iVar == null) {
                throw new NoSuchElementException();
            }
            this.f10281c = b();
            return iVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10281c != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public c(u root) {
            if (!(root instanceof u3)) {
                this.f10280b = null;
                this.f10281c = (u.i) root;
                return;
            }
            u3 u3Var = (u3) root;
            ArrayDeque<u3> arrayDeque = new ArrayDeque<>(u3Var.D());
            this.f10280b = arrayDeque;
            arrayDeque.push(u3Var);
            this.f10281c = a(u3Var.f10272l);
        }
    }

    public /* synthetic */ u3(u uVar, u uVar2, a aVar) {
        this(uVar, uVar2);
    }

    public static u A0(u left, u right) {
        if (right.size() == 0) {
            return left;
        }
        if (left.size() == 0) {
            return right;
        }
        int size = left.size() + right.size();
        if (size < 128) {
            return B0(left, right);
        }
        if (left instanceof u3) {
            u3 u3Var = (u3) left;
            if (u3Var.f10273m.size() + right.size() < 128) {
                return new u3(u3Var.f10272l, B0(u3Var.f10273m, right));
            }
            if (u3Var.f10272l.D() > u3Var.f10273m.D() && u3Var.D() > right.D()) {
                return new u3(u3Var.f10272l, new u3(u3Var.f10273m, right));
            }
        }
        return size >= D0(Math.max(left.D(), right.D()) + 1) ? new u3(left, right) : new b(null).b(left, right);
    }

    public static u B0(u left, u right) {
        int size = left.size();
        int size2 = right.size();
        byte[] bArr = new byte[size + size2];
        left.x(bArr, 0, 0, size);
        right.x(bArr, 0, size, size2);
        return u.n0(bArr);
    }

    public static int D0(int depth) {
        int[] iArr = f10269p;
        if (depth >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[depth];
    }

    public static u3 E0(u left, u right) {
        return new u3(left, right);
    }

    private void F0(ObjectInputStream in2) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    public final boolean C0(u uVar) {
        u.i next;
        a aVar = null;
        c cVar = new c(this, aVar);
        u.i next2 = cVar.next();
        c cVar2 = new c(uVar, aVar);
        u.i next3 = cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = next2.size() - i10;
            int size2 = next3.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? next2.y0(next3, i11, iMin) : next3.y0(next2, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f10271k;
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
                next2 = next2;
                next2 = next;
                next3 = cVar2.next();
                i11 = 0;
            } else {
                next2 = next2;
                next2 = next;
                i11 += iMin;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public int D() {
        return this.f10275o;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public byte G(int index) {
        int i10 = this.f10274n;
        return index < i10 ? this.f10272l.G(index) : this.f10273m.G(index - i10);
    }

    public Object G0() {
        return u.n0(c0());
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public boolean H() {
        return this.f10271k >= D0(this.f10275o);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public boolean J() {
        int iT = this.f10272l.T(0, 0, this.f10274n);
        u uVar = this.f10273m;
        return uVar.T(iT, 0, uVar.size()) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.u, java.lang.Iterable
    /* JADX INFO: renamed from: K */
    public u.g iterator() {
        return new a();
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public z M() {
        return z.n(g(), true);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public InputStream N() {
        return new d();
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public int S(int h10, int offset, int length) {
        int i10 = offset + length;
        int i11 = this.f10274n;
        if (i10 <= i11) {
            return this.f10272l.S(h10, offset, length);
        }
        if (offset >= i11) {
            return this.f10273m.S(h10, offset - i11, length);
        }
        int i12 = i11 - offset;
        return this.f10273m.S(this.f10272l.S(h10, offset, i12), 0, length - i12);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public int T(int state, int offset, int length) {
        int i10 = offset + length;
        int i11 = this.f10274n;
        if (i10 <= i11) {
            return this.f10272l.T(state, offset, length);
        }
        if (offset >= i11) {
            return this.f10273m.T(state, offset - i11, length);
        }
        int i12 = i11 - offset;
        return this.f10273m.T(this.f10272l.T(state, offset, i12), 0, length - i12);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public u b0(int beginIndex, int endIndex) {
        int iL = u.l(beginIndex, endIndex, this.f10271k);
        if (iL == 0) {
            return u.f10242g;
        }
        if (iL == this.f10271k) {
            return this;
        }
        int i10 = this.f10274n;
        if (endIndex <= i10) {
            return this.f10272l.b0(beginIndex, endIndex);
        }
        return beginIndex >= i10 ? this.f10273m.b0(beginIndex - i10, endIndex - i10) : new u3(this.f10272l.a0(beginIndex), this.f10273m.b0(0, endIndex - this.f10274n));
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public ByteBuffer d() {
        return ByteBuffer.wrap(c0()).asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        if (this.f10271k != uVar.size()) {
            return false;
        }
        if (this.f10271k == 0) {
            return true;
        }
        int iU = U();
        int iU2 = uVar.U();
        if (iU == 0 || iU2 == 0 || iU == iU2) {
            return C0(uVar);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public List<ByteBuffer> g() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().d());
        }
        return arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public byte i(int index) {
        u.j(index, this.f10271k);
        return G(index);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public String i0(Charset charset) {
        return new String(c0(), charset);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public void r0(t output) throws IOException {
        this.f10272l.r0(output);
        this.f10273m.r0(output);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public void s0(OutputStream outputStream) throws IOException {
        this.f10272l.s0(outputStream);
        this.f10273m.s0(outputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public int size() {
        return this.f10271k;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public void u0(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        int i10 = sourceOffset + numberToWrite;
        int i11 = this.f10274n;
        if (i10 <= i11) {
            this.f10272l.u0(out, sourceOffset, numberToWrite);
        } else {
            if (sourceOffset >= i11) {
                this.f10273m.u0(out, sourceOffset - i11, numberToWrite);
                return;
            }
            int i12 = i11 - sourceOffset;
            this.f10272l.u0(out, sourceOffset, i12);
            this.f10273m.u0(out, 0, numberToWrite - i12);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public void v(ByteBuffer target) {
        this.f10272l.v(target);
        this.f10273m.v(target);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public void x0(t output) throws IOException {
        this.f10273m.x0(output);
        this.f10272l.x0(output);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public void y(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        int i10 = sourceOffset + numberToCopy;
        int i11 = this.f10274n;
        if (i10 <= i11) {
            this.f10272l.y(target, sourceOffset, targetOffset, numberToCopy);
        } else {
            if (sourceOffset >= i11) {
                this.f10273m.y(target, sourceOffset - i11, targetOffset, numberToCopy);
                return;
            }
            int i12 = i11 - sourceOffset;
            this.f10272l.y(target, sourceOffset, targetOffset, i12);
            this.f10273m.y(target, 0, targetOffset + i12, numberToCopy - i12);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque<u> f10279a;

        public b() {
            this.f10279a = new ArrayDeque<>();
        }

        public final u b(u left, u right) {
            c(left);
            c(right);
            u uVarPop = this.f10279a.pop();
            while (!this.f10279a.isEmpty()) {
                uVarPop = new u3(this.f10279a.pop(), uVarPop, null);
            }
            return uVarPop;
        }

        public final void c(u root) {
            if (root.H()) {
                e(root);
                return;
            }
            if (root instanceof u3) {
                u3 u3Var = (u3) root;
                c(u3Var.f10272l);
                c(u3Var.f10273m);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + root.getClass());
            }
        }

        public final int d(int length) {
            int iBinarySearch = Arrays.binarySearch(u3.f10269p, length);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        public final void e(u byteString) {
            a aVar;
            int iD = d(byteString.size());
            int iD0 = u3.D0(iD + 1);
            if (this.f10279a.isEmpty() || this.f10279a.peek().size() >= iD0) {
                this.f10279a.push(byteString);
                return;
            }
            int iD1 = u3.D0(iD);
            u uVarPop = this.f10279a.pop();
            while (true) {
                aVar = null;
                if (this.f10279a.isEmpty() || this.f10279a.peek().size() >= iD1) {
                    break;
                } else {
                    uVarPop = new u3(this.f10279a.pop(), uVarPop, aVar);
                }
            }
            u3 u3Var = new u3(uVarPop, byteString, aVar);
            while (!this.f10279a.isEmpty()) {
                if (this.f10279a.peek().size() >= u3.D0(d(u3Var.size()) + 1)) {
                    break;
                } else {
                    u3Var = new u3(this.f10279a.pop(), u3Var, aVar);
                }
            }
            this.f10279a.push(u3Var);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public u3(u left, u right) {
        this.f10272l = left;
        this.f10273m = right;
        int size = left.size();
        this.f10274n = size;
        this.f10271k = size + right.size();
        this.f10275o = Math.max(left.D(), right.D()) + 1;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends InputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f10282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u.i f10283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f10286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f10287g;

        public d() {
            k();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return h();
        }

        public final void d() {
            if (this.f10283c != null) {
                int i10 = this.f10285e;
                int i11 = this.f10284d;
                if (i10 == i11) {
                    this.f10286f += i11;
                    this.f10285e = 0;
                    if (!this.f10282b.hasNext()) {
                        this.f10283c = null;
                        this.f10284d = 0;
                    } else {
                        u.i next = this.f10282b.next();
                        this.f10283c = next;
                        this.f10284d = next.size();
                    }
                }
            }
        }

        public final int h() {
            return u3.this.size() - (this.f10286f + this.f10285e);
        }

        public final void k() {
            c cVar = new c(u3.this, null);
            this.f10282b = cVar;
            u.i next = cVar.next();
            this.f10283c = next;
            this.f10284d = next.size();
            this.f10285e = 0;
            this.f10286f = 0;
        }

        public final int l(byte[] b10, int offset, int length) {
            int i10 = length;
            while (i10 > 0) {
                d();
                if (this.f10283c == null) {
                    break;
                }
                int iMin = Math.min(this.f10284d - this.f10285e, i10);
                if (b10 != null) {
                    this.f10283c.x(b10, this.f10285e, offset, iMin);
                    offset += iMin;
                }
                this.f10285e += iMin;
                i10 -= iMin;
            }
            return length - i10;
        }

        @Override // java.io.InputStream
        public void mark(int readAheadLimit) {
            this.f10287g = this.f10286f + this.f10285e;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] b10, int offset, int length) {
            b10.getClass();
            if (offset < 0 || length < 0 || length > b10.length - offset) {
                throw new IndexOutOfBoundsException();
            }
            int iL = l(b10, offset, length);
            if (iL != 0) {
                return iL;
            }
            if (length > 0 || h() == 0) {
                return -1;
            }
            return iL;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            k();
            l(null, 0, this.f10287g);
        }

        @Override // java.io.InputStream
        public long skip(long length) {
            if (length < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (length > 2147483647L) {
                length = 2147483647L;
            }
            return l(null, 0, (int) length);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            d();
            u.i iVar = this.f10283c;
            if (iVar == null) {
                return -1;
            }
            int i10 = this.f10285e;
            this.f10285e = i10 + 1;
            return iVar.i(i10) & 255;
        }
    }
}
