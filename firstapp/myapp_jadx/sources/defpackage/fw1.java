package defpackage;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface fw1 {

    public interface a {

        /* JADX INFO: renamed from: fw1$a$a, reason: collision with other inner class name */
        public static final class C0587a {
            public final CopyOnWriteArrayList<C0588a> a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: fw1$a$a$a, reason: collision with other inner class name */
            public static final class C0588a {
                public final Handler a;
                public final a b;
                public boolean c;

                public C0588a(Handler handler, a aVar) {
                    this.a = handler;
                    this.b = aVar;
                }
            }
        }

        void r(int i, long j, long j2);
    }

    zad a();

    long c();

    void d(Handler handler, a aVar);

    void e(a aVar);
}
