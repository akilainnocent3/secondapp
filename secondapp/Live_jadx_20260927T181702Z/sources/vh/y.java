package vh;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import java.util.Map;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@t0(api = 30)
public final class y {
    public static boolean a(Context context, Map<Integer, Integer> map) {
        ResourcesLoader resourcesLoaderA = k.a(context, map);
        if (resourcesLoaderA == null) {
            return false;
        }
        context.getResources().addLoaders(resourcesLoaderA);
        return true;
    }

    public static boolean b(int i10) {
        return 28 <= i10 && i10 <= 31;
    }
}
