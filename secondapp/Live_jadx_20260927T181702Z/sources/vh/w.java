package vh;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import java.util.Map;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@t0(api = 30)
public class w implements m {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f141211a = new w();
    }

    public static m c() {
        return b.f141211a;
    }

    @Override // vh.m
    @NonNull
    public Context a(Context context, Map<Integer, Integer> map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, ih.a.n.f92926na);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return y.a(contextThemeWrapper, map) ? contextThemeWrapper : context;
    }

    @Override // vh.m
    public boolean b(Context context, Map<Integer, Integer> map) {
        if (!y.a(context, map)) {
            return false;
        }
        z.a(context, ih.a.n.f92926na);
        return true;
    }

    public w() {
    }
}
