package defpackage;

import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jvj0 {
    public static final jvj0 a;
    public static final jvj0 b;
    public static final jvj0 c;
    public static final jvj0 d;
    public static final jvj0 e;
    public static final jvj0 f;
    public static final /* synthetic */ jvj0[] i;

    static {
        jvj0 jvj0Var = new jvj0("ENQUEUED", 0);
        a = jvj0Var;
        jvj0 jvj0Var2 = new jvj0("RUNNING", 1);
        b = jvj0Var2;
        jvj0 jvj0Var3 = new jvj0("SUCCEEDED", 2);
        c = jvj0Var3;
        jvj0 jvj0Var4 = new jvj0("FAILED", 3);
        d = jvj0Var4;
        jvj0 jvj0Var5 = new jvj0("BLOCKED", 4);
        e = jvj0Var5;
        jvj0 jvj0Var6 = new jvj0(PBBetHistoryItemDTO.STATUS_CANCELLED, 5);
        f = jvj0Var6;
        i = new jvj0[]{jvj0Var, jvj0Var2, jvj0Var3, jvj0Var4, jvj0Var5, jvj0Var6};
    }

    public jvj0() {
        throw null;
    }

    public static jvj0 valueOf(String str) {
        return (jvj0) Enum.valueOf(jvj0.class, str);
    }

    public static jvj0[] values() {
        return (jvj0[]) i.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}
