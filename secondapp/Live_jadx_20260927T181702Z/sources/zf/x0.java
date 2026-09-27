package zf;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import se.b2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface x0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        x0 a(b2 b2Var);
    }

    long a();

    void b();

    int c(af.b0 b0Var) throws IOException;

    void d(ah.r rVar, Uri uri, Map<String, List<String>> map, long j10, long j11, af.o oVar) throws IOException;

    void release();

    void seek(long j10, long j11);
}
