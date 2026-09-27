package u1;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(24)
    public static class a {
        @k.t
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        @k.t
        public static void b(@NonNull Configuration configuration, @NonNull n nVar) {
            configuration.setLocales((LocaleList) nVar.n());
        }
    }

    @NonNull
    public static n a(@NonNull Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? n.o(a.a(configuration)) : n.a(configuration.locale);
    }

    public static void b(@NonNull Configuration configuration, @NonNull n nVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            a.b(configuration, nVar);
        } else {
            if (nVar.j()) {
                return;
            }
            configuration.setLocale(nVar.d(0));
        }
    }
}
