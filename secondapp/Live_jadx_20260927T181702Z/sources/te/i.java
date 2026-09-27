package te;

import androidx.annotation.Nullable;
import eh.o1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f136608a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f136609e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f136610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f136611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f136612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f136613d;

        public a(int i10, int i11, int i12) {
            this.f136610a = i10;
            this.f136611b = i11;
            this.f136612c = i12;
            this.f136613d = o1.U0(i12) ? o1.w0(i12, i11) : -1;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f136610a == aVar.f136610a && this.f136611b == aVar.f136611b && this.f136612c == aVar.f136612c;
        }

        public int hashCode() {
            return zi.f0.b(Integer.valueOf(this.f136610a), Integer.valueOf(this.f136611b), Integer.valueOf(this.f136612c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f136610a + ", channelCount=" + this.f136611b + ", encoding=" + this.f136612c + fw.b.f85385l;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends Exception {
        public b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public b(String str, a aVar) {
            super(str + " " + aVar);
        }
    }

    @qj.a
    a a(a aVar) throws b;

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
