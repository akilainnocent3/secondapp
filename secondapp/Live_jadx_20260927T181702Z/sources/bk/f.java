package bk;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class f implements uj.a.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f21759c = "_o";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f21760d = "name";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f21761e = "params";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f21762f = "clx";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dk.b f21763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dk.b f21764b;

    public static void b(@Nullable dk.b bVar, @NonNull String str, @NonNull Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.onEvent(str, bundle);
    }

    @Override // uj.a.b
    public void a(int i10, @Nullable Bundle bundle) {
        String string;
        ck.g.f().k(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public final void c(@NonNull String str, @NonNull Bundle bundle) {
        b("clx".equals(bundle.getString(f21759c)) ? this.f21763a : this.f21764b, str, bundle);
    }

    public void d(@Nullable dk.b bVar) {
        this.f21764b = bVar;
    }

    public void e(@Nullable dk.b bVar) {
        this.f21763a = bVar;
    }
}
