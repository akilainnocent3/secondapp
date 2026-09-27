package m5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import s5.b1;
import x4.m1;
import z5.q;
import zi.u0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public interface n {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        n a(k5.g gVar, q qVar, l lVar, @Nullable z5.g gVar2, @Nullable u0<c6.d> u0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void c();

        boolean e(Uri uri, q.d dVar, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f106505b;

        public c(Uri uri) {
            this.f106505b = uri;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f106506b;

        public d(Uri uri) {
            this.f106506b = uri;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {
        void Q(f fVar);
    }

    long a();

    void b(Uri uri) throws IOException;

    @Nullable
    i c();

    void d(Uri uri);

    boolean e(Uri uri);

    boolean f();

    boolean g(Uri uri, long j10);

    void h() throws IOException;

    @Nullable
    f i(Uri uri, boolean z10);

    void j(Uri uri, b1.a aVar, e eVar);

    boolean k(Uri uri, long j10);

    void l(b bVar);

    @Nullable
    List<o> m(int i10);

    void p(Uri uri);

    boolean s(o oVar, long j10);

    void stop();

    void t(b bVar);

    @Nullable
    o u(Uri uri);
}
