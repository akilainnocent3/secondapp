package ah;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface v extends r {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        v createDataSource();
    }

    long a(d0 d0Var) throws IOException;

    void close() throws IOException;

    void d(m1 m1Var);

    Map<String, List<String>> getResponseHeaders();

    @Nullable
    Uri getUri();
}
