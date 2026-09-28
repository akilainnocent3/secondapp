package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class hmj0 {
    public static final hmj0 a;
    public static final hmj0 b;
    public static final /* synthetic */ hmj0[] c;

    static {
        hmj0 hmj0Var = new hmj0("CONTACT_CUSTOMER_SERVICE", 0);
        a = hmj0Var;
        hmj0 hmj0Var2 = new hmj0("TRANSACTIONS", 1);
        b = hmj0Var2;
        c = new hmj0[]{hmj0Var, hmj0Var2};
    }

    public hmj0() {
        throw null;
    }

    public static hmj0 valueOf(String str) {
        return (hmj0) Enum.valueOf(hmj0.class, str);
    }

    public static hmj0[] values() {
        return (hmj0[]) c.clone();
    }
}
