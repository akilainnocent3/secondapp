package defpackage;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vt60 {
    public static final a a;
    public static final List<vt60> b;
    public static final vt60 c;
    public static final vt60 d;
    public static final /* synthetic */ vt60[] e;

    public static final class a {
    }

    static {
        vt60 vt60Var = new vt60("ADD", 0);
        c = vt60Var;
        vt60 vt60Var2 = new vt60("SWITCH", 1);
        d = vt60Var2;
        e = new vt60[]{vt60Var, vt60Var2};
        a = new a();
        b = ay0.S(values());
    }

    public vt60() {
        throw null;
    }

    public static vt60 valueOf(String str) {
        return (vt60) Enum.valueOf(vt60.class, str);
    }

    public static vt60[] values() {
        return (vt60[]) e.clone();
    }
}
