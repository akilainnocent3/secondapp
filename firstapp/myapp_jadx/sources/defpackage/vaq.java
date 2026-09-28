package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vaq {
    public static final vaq a;
    public static final vaq b;
    public static final /* synthetic */ vaq[] c;

    static {
        vaq vaqVar = new vaq("Global", 0);
        a = vaqVar;
        vaq vaqVar2 = new vaq("Card", 1);
        b = vaqVar2;
        c = new vaq[]{vaqVar, vaqVar2};
    }

    public vaq() {
        throw null;
    }

    public static vaq valueOf(String str) {
        return (vaq) Enum.valueOf(vaq.class, str);
    }

    public static vaq[] values() {
        return (vaq[]) c.clone();
    }
}
