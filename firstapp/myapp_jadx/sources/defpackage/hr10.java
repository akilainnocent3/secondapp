package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class hr10 {
    public static final /* synthetic */ hr10[] a = {new hr10("GO_DEPOSIT", 0), new hr10("GO_WITHDRAW", 1), new hr10("GO_TRANSACTIONS", 2), new hr10("GO_BET_LIVE", 3), new hr10("GO_BET_FOOTBALL_LIVE", 4), new hr10("GO_KYC_VERIFICATION", 5), new hr10("GO_DEEP_LINK", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    hr10 EF5;

    public hr10() {
        throw null;
    }

    public static hr10 valueOf(String str) {
        return (hr10) Enum.valueOf(hr10.class, str);
    }

    public static hr10[] values() {
        return (hr10[]) a.clone();
    }
}
