package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class aga0 {
    public static final aga0 a;
    public static final aga0 b;
    public static final aga0 c;
    public static final aga0 d;
    public static final /* synthetic */ aga0[] e;

    static {
        aga0 aga0Var = new aga0("FACEBOOK", 0);
        a = aga0Var;
        aga0 aga0Var2 = new aga0("TELEGRAM", 1);
        b = aga0Var2;
        aga0 aga0Var3 = new aga0("WHATSAPP", 2);
        c = aga0Var3;
        aga0 aga0Var4 = new aga0(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X, 3);
        d = aga0Var4;
        e = new aga0[]{aga0Var, aga0Var2, aga0Var3, aga0Var4};
    }

    public aga0() {
        throw null;
    }

    public static aga0 valueOf(String str) {
        return (aga0) Enum.valueOf(aga0.class, str);
    }

    public static aga0[] values() {
        return (aga0[]) e.clone();
    }
}
