package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class m670 {
    public static final m670 a;
    public static final m670 b;
    public static final /* synthetic */ m670[] c;
    public static final /* synthetic */ uag d;

    public m670() {
        throw null;
    }

    public static m670 valueOf(String str) {
        return (m670) Enum.valueOf(m670.class, str);
    }

    public static m670[] values() {
        return (m670[]) c.clone();
    }

    static {
        m670 m670Var = new m670(lobGSRIlnSGJY.kEhkFXddTpdDMn, 0);
        a = m670Var;
        m670 m670Var2 = new m670("AVERAGE_GOALS_SCORED", 1);
        b = m670Var2;
        m670[] m670VarArr = {m670Var, m670Var2, new m670("PREVIOUS_MEETINGS", 2), new m670("LAST_MATCHES", 3)};
        c = m670VarArr;
        d = new uag(m670VarArr);
    }
}
