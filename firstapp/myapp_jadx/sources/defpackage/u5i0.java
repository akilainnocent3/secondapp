package defpackage;

import android.view.Surface;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface u5i0 {

    public interface b {
        void a(long j);

        void b();
    }

    public static final class c extends Exception {
        public final androidx.media3.common.a a;

        public c(Exception exc, androidx.media3.common.a aVar) {
            super(exc);
            this.a = aVar;
        }
    }

    boolean b();

    void d();

    Surface e();

    void f(float f);

    void h(long j, long j2);

    void i(long j);

    boolean isInitialized();

    void j();

    void k(kjv kjvVar);

    void l(androidx.media3.common.a aVar, long j, int i, List list);

    void m(List<Object> list);

    boolean n(boolean z);

    void o(Surface surface, vw90 vw90Var);

    boolean p(androidx.media3.common.a aVar);

    void q();

    void r();

    void release();

    void s();

    void t(int i);

    void u();

    boolean v(long j, ljv.a aVar);

    void w(boolean z);

    void x(boolean z);

    void y(s4i0 s4i0Var);

    public interface a {
        public static final C1162a a = new C1162a();

        /* JADX INFO: renamed from: u5i0$a$a, reason: collision with other inner class name */
        public class C1162a implements a {
        }

        default void b() {
        }

        default void c() {
        }

        default void g() {
        }

        default void a(v5i0 v5i0Var) {
        }
    }
}
