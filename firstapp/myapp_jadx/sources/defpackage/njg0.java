package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface njg0 {

    public static final class a {
        public final int a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3, byte[] bArr) {
            this.a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.b, aVar.b);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
        }
    }

    void a(long j, int i, int i2, int i3, a aVar);

    void b(nsz nszVar, int i, int i2);

    default int c(tpc tpcVar, int i, boolean z) {
        return e(tpcVar, i, z);
    }

    void d(androidx.media3.common.a aVar);

    int e(tpc tpcVar, int i, boolean z);

    default void f(int i, nsz nszVar) {
        b(nszVar, i, 0);
    }
}
