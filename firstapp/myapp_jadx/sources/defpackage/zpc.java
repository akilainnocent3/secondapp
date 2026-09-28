package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface zpc extends tpc {

    public interface a {
        zpc a();
    }

    long a(gqc gqcVar);

    void close();

    default Map<String, List<String>> d() {
        return Collections.EMPTY_MAP;
    }

    void g(mrg0 mrg0Var);

    Uri getUri();
}
