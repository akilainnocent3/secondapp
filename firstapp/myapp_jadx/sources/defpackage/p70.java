package defpackage;

import java.util.Random;
import java.util.function.Supplier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class p70 implements Supplier<Random> {
    public static final p70 a;
    public static final Random b;
    public static final /* synthetic */ p70[] c;

    static {
        p70 p70Var = new p70("INSTANCE", 0);
        a = p70Var;
        c = new p70[]{p70Var};
        b = new Random();
    }

    public p70() {
        throw null;
    }

    public static p70 valueOf(String str) {
        return (p70) Enum.valueOf(p70.class, str);
    }

    public static p70[] values() {
        return (p70[]) c.clone();
    }

    @Override // java.util.function.Supplier
    public final Random get() {
        return b;
    }
}
