package yads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ug0 {
    public static File a(Context context, String str) {
        return new File(context.getCacheDir().getPath() + File.separator + str);
    }
}
