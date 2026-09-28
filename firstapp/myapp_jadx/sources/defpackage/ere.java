package defpackage;

import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes.dex */
public interface ere {

    public static final class a {
        public final blh a = blh.SYSTEM;
        public final double b = 0.02d;
        public final long c = 10485760;
        public final long d = 262144000;
        public final e e = e.a;
    }

    public interface b {
        z740.b a();

        void abort();
    }

    public interface c extends AutoCloseable {
        z740.a Y0();

        cxz k();

        cxz p();
    }

    z740.a a(String str);

    z740.b b(String str);

    blh getFileSystem();
}
