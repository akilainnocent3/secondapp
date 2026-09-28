package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q390 {
    public static final LinkedHashSet a = new LinkedHashSet();

    public static final m390<zn20> a(Context context, String str, Set<String> set) {
        context.getClass();
        set.getClass();
        return set == a ? new m390<>(context, str, null, new p390(set, null), new o390(3, null), 4) : new m390<>(context, str, set, new p390(set, null), new o390(3, null));
    }
}
