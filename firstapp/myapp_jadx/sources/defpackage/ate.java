package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ate implements mt60 {
    public final /* synthetic */ nt60 a;
    public final cte b;

    public ate(nt60 nt60Var, cte cteVar) {
        this.a = nt60Var;
        this.b = cteVar;
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
}
