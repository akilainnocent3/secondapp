package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface j31 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {
        public static final a e = new a(-1, -1, -1);
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = jrh0.K(i3) ? jrh0.t(i3) * i2 : -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.a);
            sb.append(", channelCount=");
            sb.append(this.b);
            sb.append(", encoding=");
            return rr1.b(sb, this.c, ']');
        }
    }

    boolean b();

    ByteBuffer c();

    void d(ByteBuffer byteBuffer);

    a e(a aVar);

    void f();

    void flush();

    boolean isActive();

    void reset();

    public static final class b extends Exception {
        public b(String str, a aVar) {
            super(str + " " + aVar);
        }

        public b(a aVar) {
            this(lobGSRIlnSGJY.kiTGtPKwvTaoutA, aVar);
        }
    }
}
