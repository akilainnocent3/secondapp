package c5;

import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import u4.h1;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public class j extends c5.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f22407k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f22408l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f22409m = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public androidx.media3.common.a f22410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f22411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ByteBuffer f22412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public ByteBuffer f22415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f22416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f22417j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends IllegalStateException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f22419c;

        public b(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + gi.j.f86771d);
            this.f22418b = i10;
            this.f22419c = i11;
        }
    }

    static {
        h1.a("media3.decoder");
    }

    public j(int i10) {
        this(i10, 0);
    }

    public static j q() {
        return new j(0);
    }

    @Override // c5.a
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f22412e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f22415h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f22413f = false;
    }

    public final ByteBuffer l(int i10) {
        int i11 = this.f22416i;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f22412e;
        throw new b(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    @ux.d({"data"})
    public void m(int i10) {
        int i11 = i10 + this.f22417j;
        ByteBuffer byteBuffer = this.f22412e;
        if (byteBuffer == null) {
            this.f22412e = l(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f22412e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferL = l(i12);
        byteBufferL.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferL.put(byteBuffer);
        }
        this.f22412e = byteBufferL;
    }

    public final void n() {
        ByteBuffer byteBuffer = this.f22412e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f22415h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean o() {
        return d(1073741824);
    }

    @ux.d({"supplementalData"})
    public void s(int i10) {
        ByteBuffer byteBuffer = this.f22415h;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f22415h = ByteBuffer.allocate(i10);
        } else {
            this.f22415h.clear();
        }
    }

    public j(int i10, int i11) {
        this.f22411d = new d();
        this.f22416i = i10;
        this.f22417j = i11;
    }
}
