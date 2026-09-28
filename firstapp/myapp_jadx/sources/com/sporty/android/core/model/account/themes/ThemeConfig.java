package com.sporty.android.core.model.account.themes;

import defpackage.ay0;
import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/sporty/android/core/model/account/themes/ThemeConfig;", "", "theme", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTheme", "()Ljava/lang/String;", "THEME_CONFIG_FOLLOW_SYSTEM", "THEME_CONFIG_LIGHT", "THEME_CONFIG_DARK", "THEME_CONFIG_NOT_SET", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum ThemeConfig {
    THEME_CONFIG_FOLLOW_SYSTEM("SystemAuto"),
    THEME_CONFIG_LIGHT("Light"),
    THEME_CONFIG_DARK("Dark"),
    THEME_CONFIG_NOT_SET("NotSet");

    private final String theme;
    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0086\u0002¨\u0006\n"}, d2 = {"Lcom/sporty/android/core/model/account/themes/ThemeConfig$Companion;", "", "<init>", "()V", "invoke", "Lcom/sporty/android/core/model/account/themes/ThemeConfig;", "index", "", "theme", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001e  */
        /* JADX WARN: Code duplicated, block: B:12:0x0021 A[RETURN] */
        public final ThemeConfig invoke(String theme) {
            theme.getClass();
            for (ThemeConfig themeConfig : ThemeConfig.values()) {
                if (Intrinsics.g(themeConfig.getTheme(), theme)) {
                    if (themeConfig == null) {
                        return ThemeConfig.THEME_CONFIG_FOLLOW_SYSTEM;
                    }
                    return themeConfig;
                }
            }
            themeConfig = null;
            if (themeConfig == null) {
                return ThemeConfig.THEME_CONFIG_FOLLOW_SYSTEM;
            }
            return themeConfig;
        }

        private Companion() {
        }

        public final ThemeConfig invoke(int index) {
            ThemeConfig themeConfig = (ThemeConfig) ay0.C(index, ThemeConfig.values());
            return themeConfig == null ? ThemeConfig.THEME_CONFIG_FOLLOW_SYSTEM : themeConfig;
        }
    }

    ThemeConfig(String str) {
        this.theme = str;
    }

    public static tag<ThemeConfig> getEntries() {
        return $ENTRIES;
    }

    public final String getTheme() {
        return this.theme;
    }
}
