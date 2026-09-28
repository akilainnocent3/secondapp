package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ef4 {

    /* JADX INFO: Fake field, exist only in values array */
    ef4 EF5;
    public static final /* synthetic */ ef4[] b = {new ef4(AnalyticsParam.DATA_NORMAL, 0), new ef4("additive", 1), new ef4("multiply", 2), new ef4("screen", 3)};
    public static final ef4[] a = values();

    public ef4() {
        throw null;
    }

    public static ef4 valueOf(String str) {
        return (ef4) Enum.valueOf(ef4.class, str);
    }

    public static ef4[] values() {
        return (ef4[]) b.clone();
    }
}
