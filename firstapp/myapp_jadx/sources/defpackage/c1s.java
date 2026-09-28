package defpackage;

import androidx.compose.runtime.m;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class c1s implements a8j0 {
    public Function0<jxo> a;
    public ytw<jxo> b;
    public final ytw c = m.b(Boolean.FALSE);

    @Override // defpackage.a8j0
    public final long a() {
        ytw<jxo> ytwVarB = this.b;
        if (ytwVarB == null) {
            Function0<jxo> function0 = this.a;
            ytwVarB = m.b(new jxo(function0 != null ? function0.invoke().a : 0L));
            this.b = ytwVarB;
            this.a = null;
        }
        return ((jxo) ((x5a0) ytwVarB).getValue()).a;
    }

    @Override // defpackage.a8j0
    public final boolean b() {
        return ((Boolean) ((x5a0) this.c).getValue()).booleanValue();
    }
}
