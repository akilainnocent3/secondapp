package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class qe80 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ygp ygpVar = (ygp) obj;
        ygpVar.getClass();
        php phpVarE = ue80.e(ygpVar);
        if (phpVarE == null) {
            phpVarE = tgp.b(ygpVar).isInterface() ? new i120(ygpVar) : null;
        }
        if (phpVarE != null) {
            return hj5.a(phpVarE);
        }
        return null;
    }
}
