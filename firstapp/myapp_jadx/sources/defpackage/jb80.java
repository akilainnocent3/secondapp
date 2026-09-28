package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jb80 extends qlr implements Function2<c6<haj<? extends Boolean>>, c6<haj<? extends Boolean>>, c6<haj<? extends Boolean>>> {
    public static final jb80 a = new jb80(2);

    @Override // kotlin.jvm.functions.Function2
    public final c6<haj<? extends Boolean>> invoke(c6<haj<? extends Boolean>> c6Var, c6<haj<? extends Boolean>> c6Var2) {
        String str;
        haj hajVar;
        c6<haj<? extends Boolean>> c6Var3 = c6Var;
        c6<haj<? extends Boolean>> c6Var4 = c6Var2;
        if (c6Var3 == null || (str = c6Var3.a) == null) {
            str = c6Var4.a;
        }
        if (c6Var3 == null || (hajVar = c6Var3.b) == null) {
            hajVar = c6Var4.b;
        }
        return new c6<>(str, hajVar);
    }
}
