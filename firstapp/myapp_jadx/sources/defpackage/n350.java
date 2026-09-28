package defpackage;

import androidx.compose.runtime.m;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class n350 implements Function1<ytw<Object>, ytw<Object>> {
    public final /* synthetic */ uv60 a;

    public n350(uv60 uv60Var) {
        this.a = uv60Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ytw<Object> invoke(ytw<Object> ytwVar) {
        ytw<Object> ytwVar2 = ytwVar;
        Object objInvoke = null;
        if (!(ytwVar2 instanceof w5a0)) {
            hb5.a("Failed requirement.");
            return null;
        }
        w5a0 w5a0Var = (w5a0) ytwVar2;
        if (w5a0Var.getValue() != 0) {
            Object value = w5a0Var.getValue();
            value.getClass();
            objInvoke = this.a.b.invoke(value);
        }
        y5a0 y5a0VarH = w5a0Var.h();
        y5a0VarH.getClass();
        return m.a(objInvoke, y5a0VarH);
    }
}
