package v4;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import x4.b2;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f140146a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f140147e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f140148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f140149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f140150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f140151d;

        public a(androidx.media3.common.a aVar) {
            this(aVar.I, aVar.H, aVar.J);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f140148a == aVar.f140148a && this.f140149b == aVar.f140149b && this.f140150c == aVar.f140150c;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f140148a), Integer.valueOf(this.f140149b), Integer.valueOf(this.f140150c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f140148a + ", channelCount=" + this.f140149b + ", encoding=" + this.f140150c + fw.b.f85385l;
        }

        public a(int i10, int i11, int i12) {
            this.f140148a = i10;
            this.f140149b = i11;
            this.f140150c = i12;
            this.f140151d = b2.p1(i12) ? b2.L0(i12, i11) : -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f140152b = new b(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f140153a;

        public b(@k.e0(from = 0) long j10) {
            zi.l0.d(j10 >= 0);
            this.f140153a = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f140154b;

        public c(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public c(String str, a aVar) {
            super(str + " " + aVar);
            this.f140154b = aVar;
        }
    }

    a a(a aVar) throws c;

    void b(b bVar);

    long c(long j10);

    @Deprecated
    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
