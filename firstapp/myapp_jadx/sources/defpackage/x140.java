package defpackage;

import android.net.Uri;
import com.sporty.android.core.model.patron.ReachedLimit;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class x140 {
    public static final Uri a(List<ReachedLimit> list) {
        if (list == null) {
            list = m2g.a;
        }
        Uri uriB = o7d.b(wae.REACHED_LIMITS, new Pair[]{new Pair("reached_limits_key", CollectionsKt.a0(k2h.c(list), ",", null, null, new b140(), 30))});
        uriB.getClass();
        return uriB;
    }
}
