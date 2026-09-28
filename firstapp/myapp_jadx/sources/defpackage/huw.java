package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class huw {
    public static final huw a;
    public static final huw b;
    public static final huw c;
    public static final /* synthetic */ huw[] d;

    static {
        huw huwVar = new huw("Default", 0);
        a = huwVar;
        huw huwVar2 = new huw("UserInput", 1);
        b = huwVar2;
        huw huwVar3 = new huw("PreventUserInput", 2);
        c = huwVar3;
        d = new huw[]{huwVar, huwVar2, huwVar3};
    }

    public huw() {
        throw null;
    }

    public static huw valueOf(String str) {
        return (huw) Enum.valueOf(huw.class, str);
    }

    public static huw[] values() {
        return (huw[]) d.clone();
    }
}
