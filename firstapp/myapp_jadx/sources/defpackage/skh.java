package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class skh<T> {
    public static final LinkedHashSet d = new LinkedHashSet();
    public static final Object e = new Object();
    public final ne80<T> a;
    public final Function1<File, wxo> b;
    public final Function0<File> c;

    /* JADX WARN: Multi-variable type inference failed */
    public skh(ne80<T> ne80Var, Function1<? super File, ? extends wxo> function1, Function0<? extends File> function0) {
        function1.getClass();
        this.a = ne80Var;
        this.b = function1;
        this.c = function0;
    }
}
