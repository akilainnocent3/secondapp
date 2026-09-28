package defpackage;

import defpackage.j8i0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class q8i0<VM extends j8i0> implements ttr<VM> {
    public final dq7 a;
    public final Function0<v8i0> b;
    public final Function0<r8i0.c> c;
    public final Function0<cyb> d;
    public VM e;

    public q8i0(dq7 dq7Var, Function0 function0, Function0 function1, Function0 function2) {
        this.a = dq7Var;
        this.b = function0;
        this.c = function1;
        this.d = function2;
    }

    @Override // defpackage.ttr
    public final Object getValue() {
        VM vm = this.e;
        if (vm != null) {
            return vm;
        }
        v8i0 v8i0VarInvoke = this.b.invoke();
        r8i0.c cVarInvoke = this.c.invoke();
        cyb cybVarInvoke = this.d.invoke();
        v8i0VarInvoke.getClass();
        cVarInvoke.getClass();
        cybVarInvoke.getClass();
        s8i0 s8i0Var = new s8i0(v8i0VarInvoke, cVarInvoke, cybVarInvoke);
        dq7 dq7Var = this.a;
        String strI = dq7Var.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return null;
        }
        VM vm2 = (VM) s8i0Var.a(dq7Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.e = vm2;
        return vm2;
    }
}
