package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.c;
import com.sporty.android.core.model.account.themes.ThemeConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class gv0 implements kv0 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ThemeConfig.values().length];
            try {
                iArr[ThemeConfig.THEME_CONFIG_DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeConfig.THEME_CONFIG_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeConfig.THEME_CONFIG_FOLLOW_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @Override // defpackage.kv0
    public final void E(Context context, ThemeConfig themeConfig) {
        context.getClass();
        themeConfig.getClass();
        a(context, themeConfig);
    }

    public final void a(Context context, ThemeConfig themeConfig) {
        context.getClass();
        themeConfig.getClass();
        int i = 2;
        if (Build.VERSION.SDK_INT < 31) {
            int i2 = a.a[themeConfig.ordinal()];
            if (i2 != 1) {
                i = i2 != 2 ? -1 : 1;
            }
            c.B(i);
            return;
        }
        Object systemService = context.getSystemService("uimode");
        systemService.getClass();
        UiModeManager uiModeManager = (UiModeManager) systemService;
        int i3 = a.a[themeConfig.ordinal()];
        if (i3 != 1) {
            i = i3 != 2 ? 0 : 1;
        }
        uiModeManager.setApplicationNightMode(i);
    }
}
