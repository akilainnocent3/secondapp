package b0;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f20444d = "androidx.browser.trusted.sharing.KEY_TITLE";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20445e = "androidx.browser.trusted.sharing.KEY_TEXT";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f20446f = "androidx.browser.trusted.sharing.KEY_URIS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f20447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f20448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<Uri> f20449c;

    public a(@Nullable String str, @Nullable String str2, @Nullable List<Uri> list) {
        this.f20447a = str;
        this.f20448b = str2;
        this.f20449c = list;
    }

    @NonNull
    public static a a(@NonNull Bundle bundle) {
        return new a(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), bundle.getParcelableArrayList(f20446f));
    }

    @NonNull
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.f20447a);
        bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.f20448b);
        if (this.f20449c != null) {
            bundle.putParcelableArrayList(f20446f, new ArrayList<>(this.f20449c));
        }
        return bundle;
    }
}
