package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class sgk {
    public static final j8i0 a(dq7 dq7Var, v8i0 v8i0Var, cyb cybVar, cb30 cb30Var, qn70 qn70Var, Function0 function0) {
        String string;
        v8i0Var.getClass();
        cybVar.getClass();
        qn70Var.getClass();
        s8i0 s8i0Var = new s8i0(v8i0Var, new srp(dq7Var, qn70Var, cb30Var, function0), cybVar);
        String strI = dq7Var.i();
        if (cb30Var != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(cb30Var.getValue());
            sb.append(strI != null ? "_".concat(strI) : "");
            string = sb.toString();
        } else {
            string = null;
        }
        if (string != null) {
            return s8i0Var.a(dq7Var, string);
        }
        String strI2 = dq7Var.i();
        if (strI2 != null) {
            return s8i0Var.a(dq7Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        }
        hb5.a("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
