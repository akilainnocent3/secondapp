package androidx.datastore.preferences.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public abstract class u implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f10238c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f10239d = 128;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f10240e = 256;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f10241f = 8192;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u f10242g = new j(t1.f10218e);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f10243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f10244i = 255;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Comparator<u> f10245j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10246b = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10247b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10248c;

        public a() {
            this.f10248c = u.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10247b < this.f10248c;
        }

        @Override // androidx.datastore.preferences.protobuf.u.g
        public byte nextByte() {
            int i10 = this.f10247b;
            if (i10 >= this.f10248c) {
                throw new NoSuchElementException();
            }
            this.f10247b = i10 + 1;
            return u.this.G(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Comparator<u> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(u former, u latter) {
            g it = former.iterator();
            g it2 = latter.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(u.e0(it.nextByte())).compareTo(Integer.valueOf(u.e0(it2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(former.size()).compareTo(Integer.valueOf(latter.size()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class c implements g {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d implements f {
        public d() {
        }

        @Override // androidx.datastore.preferences.protobuf.u.f
        public byte[] copyFrom(byte[] bytes, int offset, int size) {
            return Arrays.copyOfRange(bytes, offset, size + offset);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends j {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final long f10250p = 1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f10251n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f10252o;

        public e(byte[] bytes, int offset, int length) {
            super(bytes);
            u.l(offset, offset + length, bytes.length);
            this.f10251n = offset;
            this.f10252o = length;
        }

        public final void A0(ObjectInputStream in2) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        public Object B0() {
            return u.n0(c0());
        }

        @Override // androidx.datastore.preferences.protobuf.u.j, androidx.datastore.preferences.protobuf.u
        public byte G(int index) {
            return this.f10257l[this.f10251n + index];
        }

        @Override // androidx.datastore.preferences.protobuf.u.j, androidx.datastore.preferences.protobuf.u
        public byte i(int index) {
            u.j(index, size());
            return this.f10257l[this.f10251n + index];
        }

        @Override // androidx.datastore.preferences.protobuf.u.j, androidx.datastore.preferences.protobuf.u
        public int size() {
            return this.f10252o;
        }

        @Override // androidx.datastore.preferences.protobuf.u.j, androidx.datastore.preferences.protobuf.u
        public void y(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            System.arraycopy(this.f10257l, z0() + sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // androidx.datastore.preferences.protobuf.u.j
        public int z0() {
            return this.f10251n;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f {
        byte[] copyFrom(byte[] bytes, int offset, int size);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g extends Iterator<Byte> {
        byte nextByte();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f10253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f10254b;

        public /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public u a() {
            this.f10253a.m();
            return new j(this.f10254b);
        }

        public b0 b() {
            return this.f10253a;
        }

        public h(int size) {
            byte[] bArr = new byte[size];
            this.f10254b = bArr;
            this.f10253a = b0.A0(bArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class i extends u {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final long f10255k = 1;

        public /* synthetic */ i(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final int D() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final boolean H() {
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.u, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public void x0(t byteOutput) throws IOException {
            r0(byteOutput);
        }

        public abstract boolean y0(u other, int offset, int length);

        public i() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class j extends i {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final long f10256m = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final byte[] f10257l;

        public j(byte[] bytes) {
            super(null);
            bytes.getClass();
            this.f10257l = bytes;
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public byte G(int index) {
            return this.f10257l[index];
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final boolean J() {
            int iZ0 = z0();
            return c5.u(this.f10257l, iZ0, size() + iZ0);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final z M() {
            return z.s(this.f10257l, z0(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final InputStream N() {
            return new ByteArrayInputStream(this.f10257l, z0(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final int S(int h10, int offset, int length) {
            return t1.w(h10, this.f10257l, z0() + offset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final int T(int state, int offset, int length) {
            int iZ0 = z0() + offset;
            return c5.w(state, this.f10257l, iZ0, length + iZ0);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final u b0(int beginIndex, int endIndex) {
            int iL = u.l(beginIndex, endIndex, size());
            return iL == 0 ? u.f10242g : new e(this.f10257l, z0() + beginIndex, iL);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final ByteBuffer d() {
            return ByteBuffer.wrap(this.f10257l, z0(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof u) || size() != ((u) other).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(other instanceof j)) {
                return other.equals(this);
            }
            j jVar = (j) other;
            int iU = U();
            int iU2 = jVar.U();
            if (iU == 0 || iU2 == 0 || iU == iU2) {
                return y0(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final List<ByteBuffer> g() {
            return Collections.singletonList(d());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public byte i(int index) {
            return this.f10257l[index];
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final String i0(Charset charset) {
            return new String(this.f10257l, z0(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final void r0(t output) throws IOException {
            output.k(this.f10257l, z0(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final void s0(OutputStream outputStream) throws IOException {
            outputStream.write(c0());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public int size() {
            return this.f10257l.length;
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final void u0(OutputStream outputStream, int sourceOffset, int numberToWrite) throws IOException {
            outputStream.write(this.f10257l, z0() + sourceOffset, numberToWrite);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public final void v(ByteBuffer target) {
            target.put(this.f10257l, z0(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public void y(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            System.arraycopy(this.f10257l, sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // androidx.datastore.preferences.protobuf.u.i
        public final boolean y0(u other, int offset, int length) {
            if (length > other.size()) {
                throw new IllegalArgumentException("Length too large: " + length + size());
            }
            int i10 = offset + length;
            if (i10 > other.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + offset + ", " + length + ", " + other.size());
            }
            if (!(other instanceof j)) {
                return other.b0(offset, i10).equals(b0(0, length));
            }
            j jVar = (j) other;
            byte[] bArr = this.f10257l;
            byte[] bArr2 = jVar.f10257l;
            int iZ0 = z0() + length;
            int iZ1 = z0();
            int iZ2 = jVar.z0() + offset;
            while (iZ1 < iZ0) {
                if (bArr[iZ1] != bArr2[iZ2]) {
                    return false;
                }
                iZ1++;
                iZ2++;
            }
            return true;
        }

        public int z0() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class k extends i {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ByteBuffer f10258l;

        public k(ByteBuffer buffer) {
            super(null);
            t1.e(buffer, "buffer");
            this.f10258l = buffer.slice().order(ByteOrder.nativeOrder());
        }

        private void A0(ObjectInputStream in2) throws IOException {
            throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
        }

        private Object C0() {
            return u.q(this.f10258l.slice());
        }

        public final ByteBuffer B0(int beginIndex, int endIndex) {
            if (beginIndex < this.f10258l.position() || endIndex > this.f10258l.limit() || beginIndex > endIndex) {
                throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(beginIndex), Integer.valueOf(endIndex)));
            }
            ByteBuffer byteBufferSlice = this.f10258l.slice();
            a2.e(byteBufferSlice, beginIndex - this.f10258l.position());
            a2.c(byteBufferSlice, endIndex - this.f10258l.position());
            return byteBufferSlice;
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public byte G(int index) {
            return i(index);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public boolean J() {
            return c5.s(this.f10258l);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public z M() {
            return z.p(this.f10258l, true);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public InputStream N() {
            return new a();
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public int S(int h10, int offset, int length) {
            for (int i10 = offset; i10 < offset + length; i10++) {
                h10 = (h10 * 31) + this.f10258l.get(i10);
            }
            return h10;
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public int T(int state, int offset, int length) {
            return c5.v(state, this.f10258l, offset, length + offset);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public u b0(int beginIndex, int endIndex) {
            try {
                return new k(B0(beginIndex, endIndex));
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw e10;
            } catch (IndexOutOfBoundsException e11) {
                throw new ArrayIndexOutOfBoundsException(e11.getMessage());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public ByteBuffer d() {
            return this.f10258l.asReadOnlyBuffer();
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
            if (size() != uVar.size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (other instanceof k) {
                return this.f10258l.equals(((k) other).f10258l);
            }
            return other instanceof u3 ? other.equals(this) : this.f10258l.equals(uVar.d());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public List<ByteBuffer> g() {
            return Collections.singletonList(d());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public byte i(int index) {
            try {
                return this.f10258l.get(index);
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw e10;
            } catch (IndexOutOfBoundsException e11) {
                throw new ArrayIndexOutOfBoundsException(e11.getMessage());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public String i0(Charset charset) {
            byte[] bArrC0;
            int length;
            int iArrayOffset;
            if (this.f10258l.hasArray()) {
                bArrC0 = this.f10258l.array();
                iArrayOffset = this.f10258l.arrayOffset() + this.f10258l.position();
                length = this.f10258l.remaining();
            } else {
                bArrC0 = c0();
                length = bArrC0.length;
                iArrayOffset = 0;
            }
            return new String(bArrC0, iArrayOffset, length, charset);
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public void r0(t output) throws IOException {
            output.j(this.f10258l.slice());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public void s0(OutputStream out) throws IOException {
            out.write(c0());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public int size() {
            return this.f10258l.remaining();
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public void u0(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
            if (!this.f10258l.hasArray()) {
                s.h(B0(sourceOffset, numberToWrite + sourceOffset), out);
            } else {
                out.write(this.f10258l.array(), this.f10258l.arrayOffset() + this.f10258l.position() + sourceOffset, numberToWrite);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public void v(ByteBuffer target) {
            target.put(this.f10258l.slice());
        }

        @Override // androidx.datastore.preferences.protobuf.u
        public void y(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            ByteBuffer byteBufferSlice = this.f10258l.slice();
            a2.e(byteBufferSlice, sourceOffset);
            byteBufferSlice.get(target, targetOffset, numberToCopy);
        }

        @Override // androidx.datastore.preferences.protobuf.u.i
        public boolean y0(u other, int offset, int length) {
            return b0(0, length).equals(other.b0(offset, length + offset));
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends InputStream {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ByteBuffer f10259b;

            public a() {
                this.f10259b = k.this.f10258l.slice();
            }

            @Override // java.io.InputStream
            public int available() throws IOException {
                return this.f10259b.remaining();
            }

            @Override // java.io.InputStream
            public void mark(int readlimit) {
                a2.d(this.f10259b);
            }

            @Override // java.io.InputStream
            public boolean markSupported() {
                return true;
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                if (this.f10259b.hasRemaining()) {
                    return this.f10259b.get() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public void reset() throws IOException {
                try {
                    a2.f(this.f10259b);
                } catch (InvalidMarkException e10) {
                    throw new IOException(e10);
                }
            }

            @Override // java.io.InputStream
            public int read(byte[] bytes, int off, int len) throws IOException {
                if (!this.f10259b.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(len, this.f10259b.remaining());
                this.f10259b.get(bytes, off, iMin);
                return iMin;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class m implements f {
        public m() {
        }

        @Override // androidx.datastore.preferences.protobuf.u.f
        public byte[] copyFrom(byte[] bytes, int offset, int size) {
            byte[] bArr = new byte[size];
            System.arraycopy(bytes, offset, bArr, 0, size);
            return bArr;
        }

        public /* synthetic */ m(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f10243h = androidx.datastore.preferences.protobuf.e.c() ? new m(aVar) : new d(aVar);
        f10245j = new b();
    }

    public static int B(String hexString, int index) {
        int iE = E(hexString.charAt(index));
        if (iE != -1) {
            return iE;
        }
        throw new NumberFormatException("Invalid hexString " + hexString + " must only contain [0-9a-fA-F] but contained " + hexString.charAt(index) + " at index " + index);
    }

    public static u C(@d0 String hexString) {
        if (hexString.length() % 2 != 0) {
            throw new NumberFormatException("Invalid hexString " + hexString + " of length " + hexString.length() + " must be even.");
        }
        int length = hexString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (B(hexString, i11 + 1) | (B(hexString, i11) << 4));
        }
        return new j(bArr);
    }

    public static int E(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'A' && c10 <= 'F') {
            return c10 - '7';
        }
        if (c10 < 'a' || c10 > 'f') {
            return -1;
        }
        return c10 - 'W';
    }

    public static h L(int size) {
        return new h(size, null);
    }

    public static l P() {
        return new l(128);
    }

    public static l Q(int initialCapacity) {
        return new l(initialCapacity);
    }

    public static u R(ByteBuffer buffer) {
        return new k(buffer);
    }

    public static u V(InputStream in2, final int chunkSize) throws IOException {
        byte[] bArr = new byte[chunkSize];
        int i10 = 0;
        while (i10 < chunkSize) {
            int i11 = in2.read(bArr, i10, chunkSize - i10);
            if (i11 == -1) {
                break;
            }
            i10 += i11;
        }
        if (i10 == 0) {
            return null;
        }
        return t(bArr, 0, i10);
    }

    public static u W(InputStream streamToDrain) throws IOException {
        return Y(streamToDrain, 256, 8192);
    }

    public static u X(InputStream streamToDrain, int chunkSize) throws IOException {
        return Y(streamToDrain, chunkSize, chunkSize);
    }

    public static u Y(InputStream streamToDrain, int minChunkSize, int maxChunkSize) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            u uVarV = V(streamToDrain, minChunkSize);
            if (uVarV == null) {
                return n(arrayList);
            }
            arrayList.add(uVarV);
            minChunkSize = Math.min(minChunkSize * 2, maxChunkSize);
        }
    }

    public static int e0(byte value) {
        return value & 255;
    }

    public static u h(Iterator<u> iterator, int length) {
        if (length < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(length)));
        }
        if (length == 1) {
            return iterator.next();
        }
        int i10 = length >>> 1;
        return h(iterator, i10).m(h(iterator, length - i10));
    }

    public static void j(int index, int size) {
        if (((size - (index + 1)) | index) < 0) {
            if (index < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + index);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + index + ", " + size);
        }
    }

    @x
    public static int l(int startIndex, int endIndex, int size) {
        int i10 = endIndex - startIndex;
        if ((startIndex | endIndex | i10 | (size - endIndex)) >= 0) {
            return i10;
        }
        if (startIndex < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + startIndex + " < 0");
        }
        if (endIndex < startIndex) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + startIndex + ", " + endIndex);
        }
        throw new IndexOutOfBoundsException("End index: " + endIndex + " >= " + size);
    }

    public static Comparator<u> l0() {
        return f10245j;
    }

    public static u m0(ByteBuffer buffer) {
        if (!buffer.hasArray()) {
            return new k(buffer);
        }
        return q0(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
    }

    public static u n(Iterable<u> byteStrings) {
        int size;
        if (byteStrings instanceof Collection) {
            size = ((Collection) byteStrings).size();
        } else {
            Iterator<u> it = byteStrings.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f10242g : h(byteStrings.iterator(), size);
    }

    public static u n0(byte[] bytes) {
        return new j(bytes);
    }

    public static u o(String text, String charsetName) throws UnsupportedEncodingException {
        return new j(text.getBytes(charsetName));
    }

    public static u p(String text, Charset charset) {
        return new j(text.getBytes(charset));
    }

    public static u q(ByteBuffer bytes) {
        return r(bytes, bytes.remaining());
    }

    public static u q0(byte[] bytes, int offset, int length) {
        return new e(bytes, offset, length);
    }

    public static u r(ByteBuffer bytes, int size) {
        l(0, size, bytes.remaining());
        byte[] bArr = new byte[size];
        bytes.get(bArr);
        return new j(bArr);
    }

    public static u s(byte[] bytes) {
        return t(bytes, 0, bytes.length);
    }

    public static u t(byte[] bytes, int offset, int size) {
        l(offset, offset + size, bytes.length);
        return new j(f10243h.copyFrom(bytes, offset, size));
    }

    public static u u(String text) {
        return new j(text.getBytes(t1.f10215b));
    }

    public static final u z() {
        return f10242g;
    }

    public final boolean A(u suffix) {
        return size() >= suffix.size() && a0(size() - suffix.size()).equals(suffix);
    }

    public abstract int D();

    public abstract byte G(int index);

    public abstract boolean H();

    public abstract boolean J();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    public abstract z M();

    public abstract InputStream N();

    public abstract int S(int h10, int offset, int length);

    public abstract int T(int state, int offset, int length);

    public final int U() {
        return this.f10246b;
    }

    public final boolean Z(u prefix) {
        return size() >= prefix.size() && b0(0, prefix.size()).equals(prefix);
    }

    public final u a0(int beginIndex) {
        return b0(beginIndex, size());
    }

    public abstract u b0(int beginIndex, int endIndex);

    public final byte[] c0() {
        int size = size();
        if (size == 0) {
            return t1.f10218e;
        }
        byte[] bArr = new byte[size];
        y(bArr, 0, 0, size);
        return bArr;
    }

    public abstract ByteBuffer d();

    public abstract boolean equals(Object o10);

    public final String f0(String charsetName) throws UnsupportedEncodingException {
        try {
            return h0(Charset.forName(charsetName));
        } catch (UnsupportedCharsetException e10) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(charsetName);
            unsupportedEncodingException.initCause(e10);
            throw unsupportedEncodingException;
        }
    }

    public abstract List<ByteBuffer> g();

    public final String h0(Charset charset) {
        return size() == 0 ? "" : i0(charset);
    }

    public final int hashCode() {
        int iS = this.f10246b;
        if (iS == 0) {
            int size = size();
            iS = S(size, 0, size);
            if (iS == 0) {
                iS = 1;
            }
            this.f10246b = iS;
        }
        return iS;
    }

    public abstract byte i(int index);

    public abstract String i0(Charset charset);

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final String j0() {
        return h0(t1.f10215b);
    }

    public final String k0() {
        if (size() <= 50) {
            return k4.a(this);
        }
        return k4.a(b0(0, 47)) + "...";
    }

    public final u m(u other) {
        if (Integer.MAX_VALUE - size() >= other.size()) {
            return u3.A0(this, other);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + com.google.android.material.badge.a.f50153v + other.size());
    }

    public abstract void r0(t byteOutput) throws IOException;

    public abstract void s0(OutputStream out) throws IOException;

    public abstract int size();

    public final void t0(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        l(sourceOffset, sourceOffset + numberToWrite, size());
        if (numberToWrite > 0) {
            u0(out, sourceOffset, numberToWrite);
        }
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), k0());
    }

    public abstract void u0(OutputStream out, int sourceOffset, int numberToWrite) throws IOException;

    public abstract void v(ByteBuffer target);

    public void w(byte[] target, int offset) {
        x(target, 0, offset, size());
    }

    @Deprecated
    public final void x(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        l(sourceOffset, sourceOffset + numberToCopy, size());
        l(targetOffset, targetOffset + numberToCopy, target.length);
        if (numberToCopy > 0) {
            y(target, sourceOffset, targetOffset, numberToCopy);
        }
    }

    public abstract void x0(t byteOutput) throws IOException;

    public abstract void y(byte[] target, int sourceOffset, int targetOffset, int numberToCopy);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class l extends OutputStream {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final byte[] f10261g = new byte[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<u> f10263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10264d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f10265e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f10266f;

        public l(int initialCapacity) {
            if (initialCapacity < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f10262b = initialCapacity;
            this.f10263c = new ArrayList<>();
            this.f10265e = new byte[initialCapacity];
        }

        public final void a(int minSize) {
            this.f10263c.add(new j(this.f10265e));
            int length = this.f10264d + this.f10265e.length;
            this.f10264d = length;
            this.f10265e = new byte[Math.max(this.f10262b, Math.max(minSize, length >>> 1))];
            this.f10266f = 0;
        }

        public final void d() {
            int i10 = this.f10266f;
            byte[] bArr = this.f10265e;
            if (i10 >= bArr.length) {
                this.f10263c.add(new j(this.f10265e));
                this.f10265e = f10261g;
            } else if (i10 > 0) {
                this.f10263c.add(new j(Arrays.copyOf(bArr, i10)));
            }
            this.f10264d += this.f10266f;
            this.f10266f = 0;
        }

        public synchronized int h() {
            return this.f10264d + this.f10266f;
        }

        public synchronized u k() {
            d();
            return u.n(this.f10263c);
        }

        public void l(OutputStream out) throws IOException {
            int i10;
            u[] uVarArr;
            byte[] bArr;
            int i11;
            synchronized (this) {
                uVarArr = (u[]) this.f10263c.toArray(new u[0]);
                bArr = this.f10265e;
                i11 = this.f10266f;
            }
            for (u uVar : uVarArr) {
                uVar.s0(out);
            }
            out.write(Arrays.copyOf(bArr, i11));
        }

        public synchronized void reset() {
            this.f10263c.clear();
            this.f10264d = 0;
            this.f10266f = 0;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(h()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int b10) {
            try {
                if (this.f10266f == this.f10265e.length) {
                    a(1);
                }
                byte[] bArr = this.f10265e;
                int i10 = this.f10266f;
                this.f10266f = i10 + 1;
                bArr[i10] = (byte) b10;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] b10, int offset, int length) {
            try {
                byte[] bArr = this.f10265e;
                int length2 = bArr.length;
                int i10 = this.f10266f;
                if (length <= length2 - i10) {
                    System.arraycopy(b10, offset, bArr, i10, length);
                    this.f10266f += length;
                } else {
                    int length3 = bArr.length - i10;
                    System.arraycopy(b10, offset, bArr, i10, length3);
                    int i11 = length - length3;
                    a(i11);
                    System.arraycopy(b10, offset + length3, this.f10265e, 0, i11);
                    this.f10266f = i11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
