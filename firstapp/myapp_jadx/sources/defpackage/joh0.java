package defpackage;

import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class joh0 {
    public static final joh0 a;
    public static final joh0 b;
    public static final joh0 c;
    public static final joh0 d;
    public static final /* synthetic */ joh0[] e;

    static {
        joh0 joh0Var = new joh0("IN_PROGRESS", 0);
        a = joh0Var;
        joh0 joh0Var2 = new joh0("COMPLETED", 1);
        b = joh0Var2;
        joh0 joh0Var3 = new joh0(PBBetHistoryItemDTO.STATUS_CANCELLED, 2);
        c = joh0Var3;
        joh0 joh0Var4 = new joh0("UNKNOWN", 3);
        d = joh0Var4;
        e = new joh0[]{joh0Var, joh0Var2, joh0Var3, joh0Var4};
    }

    public joh0() {
        throw null;
    }

    public static joh0 valueOf(String str) {
        return (joh0) Enum.valueOf(joh0.class, str);
    }

    public static joh0[] values() {
        return (joh0[]) e.clone();
    }
}
