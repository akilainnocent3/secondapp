package defpackage;

import android.os.Bundle;
import defpackage.bfx;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class cfx<Args extends bfx> implements ttr<Args> {
    public final dq7 a;
    public final Function0<Bundle> b;
    public Args c;

    public cfx(dq7 dq7Var, Function0 function0) {
        this.a = dq7Var;
        this.b = function0;
    }

    @Override // defpackage.ttr
    public final Object getValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Args args = this.c;
        if (args != null) {
            return args;
        }
        Bundle bundleInvoke = this.b.invoke();
        ox0<ygp<? extends bfx>, Method> ox0Var = dfx.b;
        dq7 dq7Var = this.a;
        Method method = ox0Var.get(dq7Var);
        if (method == null) {
            method = tgp.b(dq7Var).getMethod("fromBundle", (Class[]) Arrays.copyOf(dfx.a, 1));
            ox0Var.put(dq7Var, method);
            method.getClass();
        }
        Object objInvoke = method.invoke(null, bundleInvoke);
        objInvoke.getClass();
        Args args2 = (Args) objInvoke;
        this.c = args2;
        return args2;
    }
}
