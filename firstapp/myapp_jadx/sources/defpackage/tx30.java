package defpackage;

import java.util.Random;
import java.util.function.Supplier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class tx30 {
    public static final tx30 a;
    public static final Supplier<Random> b;
    public static final /* synthetic */ tx30[] c;

    static {
        tx30 tx30Var = new tx30("INSTANCE", 0);
        a = tx30Var;
        c = new tx30[]{tx30Var};
        b = vx30.a();
    }

    public tx30() {
        throw null;
    }

    public static tx30 valueOf(String str) {
        return (tx30) Enum.valueOf(tx30.class, str);
    }

    public static tx30[] values() {
        return (tx30[]) c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "RandomIdGenerator{}";
    }
}
