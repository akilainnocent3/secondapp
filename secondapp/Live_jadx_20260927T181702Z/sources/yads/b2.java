package yads;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f147016a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f147017b = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f147018c;

    public b2(Context context) {
        this.f147018c = a(context);
    }

    public static int a(Context context) {
        return context.getResources().getConfiguration().orientation;
    }
}
