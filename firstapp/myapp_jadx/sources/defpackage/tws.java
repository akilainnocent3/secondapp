package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class tws {
    public static final AtomicLong c = new AtomicLong();
    public final Map<String, List<String>> a;
    public final long b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tws(gqc gqcVar) {
        this(Collections.EMPTY_MAP, 0L);
        Uri uri = gqcVar.a;
    }

    public tws(Map map, long j) {
        this.a = map;
        this.b = j;
    }
}
