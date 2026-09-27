package ye;

import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import re.k2;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class i extends ye.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f159193k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f159194l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f159195m = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public n2 f159196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f159197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ByteBuffer f159198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f159199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f159200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public ByteBuffer f159201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f159202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f159203j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends IllegalStateException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f159204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f159205c;

        public b(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + gi.j.f86771d);
            this.f159204b = i10;
            this.f159205c = i11;
        }
    }

    static {
        k2.a("goog.exo.decoder");
    }

    public i(int i10) {
        this(i10, 0);
    }

    public static i q() {
        return new i(0);
    }

    @Override // ye.a
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f159198e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f159201h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f159199f = false;
    }

    public final ByteBuffer l(int i10) {
        int i11 = this.f159202i;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f159198e;
        throw new b(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    @ux.d({"data"})
    public void m(int i10) {
        int i11 = i10 + this.f159203j;
        ByteBuffer byteBuffer = this.f159198e;
        if (byteBuffer == null) {
            this.f159198e = l(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f159198e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferL = l(i12);
        byteBufferL.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferL.put(byteBuffer);
        }
        this.f159198e = byteBufferL;
    }

    public final void n() {
        ByteBuffer byteBuffer = this.f159198e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f159201h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean o() {
        return d(1073741824);
    }

    @ux.d({"supplementalData"})
    public void s(int i10) {
        ByteBuffer byteBuffer = this.f159201h;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f159201h = ByteBuffer.allocate(i10);
        } else {
            this.f159201h.clear();
        }
    }

    public i(int i10, int i11) {
        this.f159197d = new e();
        this.f159202i = i10;
        this.f159203j = i11;
    }
}
