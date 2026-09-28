package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class nx0 implements Callable<List<Object>>, faj<Object, List<Object>> {
    public static final nx0 a;
    public static final /* synthetic */ nx0[] b;

    static {
        nx0 nx0Var = new nx0("INSTANCE", 0);
        a = nx0Var;
        b = new nx0[]{nx0Var};
    }

    public nx0() {
        throw null;
    }

    public static nx0 valueOf(String str) {
        return (nx0) Enum.valueOf(nx0.class, str);
    }

    public static nx0[] values() {
        return (nx0[]) b.clone();
    }

    @Override // defpackage.faj
    public final List<Object> apply(Object obj) {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public final List<Object> call() {
        return new ArrayList();
    }
}
