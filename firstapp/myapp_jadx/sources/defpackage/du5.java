package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class du5 {
    public final Locale a;
    public final LinkedHashMap b = new LinkedHashMap();

    public du5(Locale locale) {
        this.a = locale;
    }

    public abstract String a(long j, String str, Locale locale);

    public abstract xt5 b(long j);

    public abstract jsc c(Locale locale);

    public abstract int d();

    public abstract iu5 e(int i, int i2);

    public abstract iu5 f(long j);

    public abstract iu5 g(xt5 xt5Var);

    public abstract xt5 h();

    public abstract List<Pair<String, String>> i();

    public abstract xt5 j(String str, String str2, Locale locale);

    public abstract iu5 k(iu5 iu5Var, int i);
}
