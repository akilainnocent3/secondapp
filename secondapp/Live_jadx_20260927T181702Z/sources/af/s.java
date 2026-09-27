package af;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f4986a = new s() { // from class: af.q
        @Override // af.s
        public final m[] createExtractors() {
            return r.b();
        }

        @Override // af.s
        public /* synthetic */ m[] createExtractors(Uri uri, Map map) {
            return r.a(this, uri, map);
        }
    };

    m[] createExtractors();

    m[] createExtractors(Uri uri, Map<String, List<String>> map);
}
