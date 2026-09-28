package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface sws {

    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            ly0.b(j >= 0);
            this.a = i;
            this.b = j;
        }
    }

    public static final class c {
        public final IOException a;
        public final int b;

        public c(IOException iOException, int i) {
            this.a = iOException;
            this.b = i;
        }
    }

    long a(c cVar);

    int b(int i);

    b c(a aVar, c cVar);
}
