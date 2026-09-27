package bh;

import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n {
    public static long a(o oVar) {
        return oVar.get("exo_len", -1L);
    }

    @Nullable
    public static Uri b(o oVar) {
        String str = oVar.get("exo_redir", (String) null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }
}
