package ah;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p0 {
    static {
        zi.m0<String> m0Var = q0.f5346a;
    }

    public static /* synthetic */ boolean a(String str) {
        if (str == null) {
            return false;
        }
        String strG = zi.c.g(str);
        return (TextUtils.isEmpty(strG) || (strG.contains("text") && !strG.contains("text/vtt")) || strG.contains("html") || strG.contains("xml")) ? false : true;
    }
}
