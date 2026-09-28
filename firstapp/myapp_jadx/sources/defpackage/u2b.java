package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class u2b {
    public static final Set<zz5> a = Collections.unmodifiableSet(EnumSet.of(zz5.d, zz5.e, zz5.f, zz5.i));
    public static final Set<b06> b = Collections.unmodifiableSet(EnumSet.of(b06.d, b06.a));
    public static final Set<xz5> c;
    public static final Set<xz5> d;

    static {
        xz5 xz5Var = xz5.e;
        xz5 xz5Var2 = xz5.d;
        xz5 xz5Var3 = xz5.a;
        Set<xz5> setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(xz5Var, xz5Var2, xz5Var3));
        c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(xz5Var2);
        enumSetCopyOf.remove(xz5Var3);
        d = Collections.unmodifiableSet(enumSetCopyOf);
    }
}
