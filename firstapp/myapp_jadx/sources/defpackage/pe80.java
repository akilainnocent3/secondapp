package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class pe80 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ygp ygpVar = (ygp) obj;
        ygpVar.getClass();
        php phpVarE = ue80.e(ygpVar);
        if (phpVarE != null) {
            return phpVarE;
        }
        if (tgp.b(ygpVar).isInterface()) {
            return new i120(ygpVar);
        }
        return null;
    }
}
