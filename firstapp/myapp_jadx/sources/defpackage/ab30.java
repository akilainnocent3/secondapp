package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ab30 {
    public static final ab30 a;
    public static final /* synthetic */ ab30[] b;

    static {
        ab30 ab30Var = new ab30("DEFAULT", 0);
        a = ab30Var;
        ab30 ab30Var2 = new ab30("UNMETERED_ONLY", 1);
        ab30 ab30Var3 = new ab30("UNMETERED_OR_DAILY", 2);
        ab30 ab30Var4 = new ab30("FAST_IF_RADIO_AWAKE", 3);
        ab30 ab30Var5 = new ab30("NEVER", 4);
        ab30 ab30Var6 = new ab30("UNRECOGNIZED", 5);
        b = new ab30[]{ab30Var, ab30Var2, ab30Var3, ab30Var4, ab30Var5, ab30Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, ab30Var);
        sparseArray.put(1, ab30Var2);
        sparseArray.put(2, ab30Var3);
        sparseArray.put(3, ab30Var4);
        sparseArray.put(4, ab30Var5);
        sparseArray.put(-1, ab30Var6);
    }

    public ab30() {
        throw null;
    }

    public static ab30 valueOf(String str) {
        return (ab30) Enum.valueOf(ab30.class, str);
    }

    public static ab30[] values() {
        return (ab30[]) b.clone();
    }
}
