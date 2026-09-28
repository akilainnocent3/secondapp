package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class j41 {
    public static final /* synthetic */ j41[] a = {new j41("WITHDRAW_BLOCKED", 0), new j41("PENDING_VERIFICATION", 1), new j41("VERIFICATION_FAILED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    j41 EF5;

    public static j41 valueOf(String str) {
        return (j41) Enum.valueOf(j41.class, str);
    }

    public static j41[] values() {
        return (j41[]) a.clone();
    }
}
