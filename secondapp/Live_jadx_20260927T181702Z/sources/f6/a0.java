package f6;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public interface a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f83328a = new a0() { // from class: f6.y
        @Override // f6.a0
        public /* synthetic */ a0 a(int i10) {
            return z.b(this, i10);
        }

        @Override // f6.a0
        public /* synthetic */ a0 b(c7.s.a aVar) {
            return z.d(this, aVar);
        }

        @Override // f6.a0
        public /* synthetic */ a0 c(boolean z10) {
            return z.c(this, z10);
        }

        @Override // f6.a0
        public final u[] createExtractors() {
            return z.e();
        }

        @Override // f6.a0
        public /* synthetic */ u[] createExtractors(Uri uri, Map map) {
            return z.a(this, uri, map);
        }
    };

    @qj.a
    @x4.t
    a0 a(int i10);

    a0 b(c7.s.a aVar);

    @qj.a
    @x4.t
    @Deprecated
    a0 c(boolean z10);

    u[] createExtractors();

    u[] createExtractors(Uri uri, Map<String, List<String>> map);
}
