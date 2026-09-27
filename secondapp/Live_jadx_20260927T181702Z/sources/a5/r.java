package a5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface r extends u4.c0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        @x4.m1
        r createDataSource();
    }

    @x4.m1
    void addTransferListener(x1 x1Var);

    @x4.m1
    void close() throws IOException;

    @x4.m1
    Map<String, List<String>> getResponseHeaders();

    @Nullable
    @x4.m1
    Uri getUri();

    @x4.m1
    long open(z zVar) throws IOException;
}
