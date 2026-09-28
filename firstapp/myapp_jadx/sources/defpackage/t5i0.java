package defpackage;

import android.os.Handler;
import androidx.media3.exoplayer.d;

/* JADX INFO: loaded from: classes.dex */
public interface t5i0 {

    public static final class a {
        public final Handler a;
        public final t5i0 b;

        public a(Handler handler, d.a aVar) {
            if (aVar != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.a = handler;
            this.b = aVar;
        }

        public final void a(final v5i0 v5i0Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: k5i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        t5i0 t5i0Var = this.a.b;
                        String str = jrh0.a;
                        t5i0Var.a(v5i0Var);
                    }
                });
            }
        }
    }

    default void a(v5i0 v5i0Var) {
    }

    default void b(e5d e5dVar) {
    }

    default void d(String str) {
    }

    default void f(Exception exc) {
    }

    default void h(e5d e5dVar) {
    }

    default void c(androidx.media3.common.a aVar, i5d i5dVar) {
    }

    default void g(int i, long j) {
    }

    default void j(int i, long j) {
    }

    default void k(Object obj, long j) {
    }

    default void e(long j, String str, long j2) {
    }
}
