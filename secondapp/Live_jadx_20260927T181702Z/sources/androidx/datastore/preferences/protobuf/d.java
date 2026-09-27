package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f9664a;

        public a(final ByteBuffer val$buffer) {
            this.f9664a = val$buffer;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public byte[] a() {
            return this.f9664a.array();
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int b() {
            return this.f9664a.arrayOffset();
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public boolean c() {
            return this.f9664a.hasArray();
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public boolean d() {
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int e() {
            return this.f9664a.limit();
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public ByteBuffer f() {
            return this.f9664a;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int g() {
            return this.f9664a.position();
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public d h(int position) {
            a2.e(this.f9664a, position);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int i() {
            return this.f9664a.remaining();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f9666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f9667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f9668d;

        public b(final byte[] val$bytes, final int val$offset, final int val$length) {
            this.f9666b = val$bytes;
            this.f9667c = val$offset;
            this.f9668d = val$length;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public byte[] a() {
            return this.f9666b;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int b() {
            return this.f9667c;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public boolean c() {
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public boolean d() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int e() {
            return this.f9668d;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public ByteBuffer f() {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int g() {
            return this.f9665a;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public d h(int position) {
            if (position >= 0 && position <= this.f9668d) {
                this.f9665a = position;
                return this;
            }
            throw new IllegalArgumentException("Invalid position: " + position);
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int i() {
            return this.f9668d - this.f9665a;
        }
    }

    public static d j(final ByteBuffer buffer) {
        t1.e(buffer, "buffer");
        return new a(buffer);
    }

    public static d k(byte[] bytes) {
        return m(bytes, 0, bytes.length);
    }

    public static d l(final byte[] bytes, final int offset, final int length) {
        if (offset < 0 || length < 0 || offset + length > bytes.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bytes.length), Integer.valueOf(offset), Integer.valueOf(length)));
        }
        return m(bytes, offset, length);
    }

    public static d m(final byte[] bytes, final int offset, final int length) {
        return new b(bytes, offset, length);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();

    public abstract ByteBuffer f();

    public abstract int g();

    @x
    public abstract d h(int position);

    public abstract int i();
}
