package yads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class v61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f156790a;

    public v61(Context context) {
        this.f156790a = context;
    }

    public final File a() {
        File file = new File(this.f156790a.getCacheDir(), "debug_panel");
        file.mkdir();
        return new File(file, "monetization_ads_debug_panel_report.txt");
    }
}
