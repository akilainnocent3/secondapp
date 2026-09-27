package s5;

import android.net.Uri;
import androidx.annotation.Nullable;
import e5.k4;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@x4.m1
public interface h1 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        h1 a(k4 k4Var);
    }

    long a();

    void b();

    @Nullable
    String c();

    void d(u4.c0 c0Var, Uri uri, Map<String, List<String>> map, long j10, long j11, f6.w wVar) throws IOException;

    int e(f6.t0 t0Var) throws IOException;

    void release();

    void seek(long j10, long j11);
}
