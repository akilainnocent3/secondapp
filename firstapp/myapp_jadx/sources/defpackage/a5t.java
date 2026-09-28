package defpackage;

import com.sportybet.plugin.realsports.data.radio.RadioProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a5t {
    public static final /* synthetic */ a5t[] a = {new a5t("HORIZONTAL", 0), new a5t("HORIZONTAL_CARD", 1), new a5t("DOUBLE_ROW", 2), new a5t("TOP_HORIZONTAL_STRIP", 3), new a5t("BANNER", 4), new a5t(RadioProvider.SPOTLIGHT, 5), new a5t("PROVIDER", 6), new a5t("FEATURED_MATCHES", 7), new a5t("PROMOTION", 8), new a5t("TOP_WINS", 9), new a5t("JACKPOT", 10), new a5t("DEFAULT", 11)};

    /* JADX INFO: Fake field, exist only in values array */
    a5t EF5;

    public static a5t valueOf(String str) {
        return (a5t) Enum.valueOf(a5t.class, str);
    }

    public static a5t[] values() {
        return (a5t[]) a.clone();
    }
}
