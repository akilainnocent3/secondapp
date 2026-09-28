package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class yzy {
    public static final yzy a;
    public static final yzy b;
    public static final /* synthetic */ yzy[] c;

    static {
        yzy yzyVar = new yzy("OnViewCreated", 0);
        a = yzyVar;
        yzy yzyVar2 = new yzy("OnDestroyView", 1);
        b = yzyVar2;
        c = new yzy[]{yzyVar, yzyVar2};
    }

    public yzy() {
        throw null;
    }

    public static yzy valueOf(String str) {
        return (yzy) Enum.valueOf(yzy.class, str);
    }

    public static yzy[] values() {
        return (yzy[]) c.clone();
    }
}
