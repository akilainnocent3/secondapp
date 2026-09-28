package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class w8s {
    public static final w8s a;
    public static final w8s b;
    public static final /* synthetic */ w8s[] c;

    static {
        w8s w8sVar = new w8s("TOP_BANNER", 0);
        a = w8sVar;
        w8s w8sVar2 = new w8s("BOTTOM_CTA", 1);
        b = w8sVar2;
        c = new w8s[]{w8sVar, w8sVar2};
    }

    public w8s() {
        throw null;
    }

    public static w8s valueOf(String str) {
        return (w8s) Enum.valueOf(w8s.class, str);
    }

    public static w8s[] values() {
        return (w8s[]) c.clone();
    }
}
