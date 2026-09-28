package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d0e {
    public static final /* synthetic */ d0e[] a = {new d0e("NO_DEPOSIT", 0), new d0e("WAITING_FOR_APPROVAL", 1), new d0e("WAITING_FOR_PAYMENT_PROVIDER", 2), new d0e("AFTER_FIRST_DEPOSIT", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    d0e EF5;

    public static d0e valueOf(String str) {
        return (d0e) Enum.valueOf(d0e.class, str);
    }

    public static d0e[] values() {
        return (d0e[]) a.clone();
    }
}
