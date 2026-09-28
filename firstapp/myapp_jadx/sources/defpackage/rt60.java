package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class rt60 implements mt60, nv60 {
    public final /* synthetic */ nt60 a;
    public final kv60 b;
    public final kbs c;
    public final jv60 d;

    public rt60(nt60 nt60Var) {
        this.a = nt60Var;
        kv60 kv60Var = new kv60(new mv60(this, new xk20(this, 1)));
        this.b = kv60Var;
        int i = 0;
        this.c = new kbs(this, false);
        this.d = kv60Var.b;
        Object objE = nt60Var.e("androidx.savedstate.SavedStateRegistry");
        kv60Var.a(objE instanceof Bundle ? (Bundle) objE : null);
        nt60Var.b("androidx.savedstate.SavedStateRegistry", new qt60(this, i));
    }

    @Override // defpackage.mt60
    public final boolean a(Object obj) {
        return this.a.a(obj);
    }

    @Override // defpackage.mt60
    public final mt60.a b(String str, Function0<? extends Object> function0) {
        return this.a.b(str, function0);
    }

    @Override // defpackage.mt60
    public final Map<String, List<Object>> d() {
        return this.a.d();
    }

    @Override // defpackage.mt60
    public final Object e(String str) {
        return this.a.e(str);
    }

    @Override // defpackage.ibs
    public final s9s getLifecycle() {
        return this.c;
    }

    @Override // defpackage.nv60
    public final jv60 getSavedStateRegistry() {
        return this.d;
    }
}
