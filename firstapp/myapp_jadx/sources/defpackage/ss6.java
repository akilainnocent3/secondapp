package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ss6 {
    public static final /* synthetic */ ss6[] a = {new ss6("CASHOUT_UNAVAILABLE", 0), new ss6("CASHABLE_AMOUNT_TOO_LOW", 1), new ss6("AT_LEAST_ONE_SUSPENDED", 2), new ss6("BET_WAITING_SETTLED", 3), new ss6("AT_LEAST_ONE_NOT_AVAILABLE", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    ss6 EF5;

    public static ss6 valueOf(String str) {
        return (ss6) Enum.valueOf(ss6.class, str);
    }

    public static ss6[] values() {
        return (ss6[]) a.clone();
    }
}
