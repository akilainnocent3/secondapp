package yads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public interface rq0 {
    static /* synthetic */ int $desugar$clinit;

    static {
        new rq0() { // from class: yads.ka4
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return la4.b();
            }

            @Override // yads.rq0
            public /* synthetic */ mq0[] createExtractors(Uri uri, Map map) {
                return la4.a(this, uri, map);
            }
        };
    }

    mq0[] createExtractors();

    mq0[] createExtractors(Uri uri, Map map);
}
