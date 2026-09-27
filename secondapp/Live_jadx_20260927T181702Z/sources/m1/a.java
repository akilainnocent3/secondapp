package m1;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f106205b = "android.hardware.display.category.PRESENTATION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f106206a;

    public a(Context context) {
        this.f106206a = context;
    }

    @NonNull
    public static a d(@NonNull Context context) {
        return new a(context);
    }

    @Nullable
    public Display a(int i10) {
        return ((DisplayManager) this.f106206a.getSystemService("display")).getDisplay(i10);
    }

    @NonNull
    public Display[] b() {
        return ((DisplayManager) this.f106206a.getSystemService("display")).getDisplays();
    }

    @NonNull
    public Display[] c(@Nullable String str) {
        return ((DisplayManager) this.f106206a.getSystemService("display")).getDisplays();
    }
}
