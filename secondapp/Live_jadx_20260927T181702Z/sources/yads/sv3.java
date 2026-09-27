package yads;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class sv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UiModeManager f155577a;

    public static int a() {
        UiModeManager uiModeManager = f155577a;
        if (uiModeManager == null) {
            return 3;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? 3 : 1;
        }
        return 2;
    }

    public static void a(Context context) {
        f155577a = (UiModeManager) context.getSystemService("uimode");
    }
}
