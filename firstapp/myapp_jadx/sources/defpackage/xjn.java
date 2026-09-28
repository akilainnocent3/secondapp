package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xjn implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws wjd {
        qn70 qn70Var = (qn70) obj;
        wrz wrzVar = (wrz) obj2;
        qn70Var.getClass();
        wrzVar.getClass();
        k5b k5bVar = (k5b) qn70Var.a(jq40.a(k5b.class), null, bob0.a);
        vn30 vn30Var = (vn30) qn70Var.a(jq40.a(vn30.class), null, null);
        do30 do30Var = (do30) qn70Var.a(jq40.a(do30.class), null, null);
        cq30 cq30Var = (cq30) qn70Var.a(jq40.a(cq30.class), null, null);
        gn30 gn30Var = (gn30) qn70Var.a(jq40.a(gn30.class), null, null);
        en20 en20Var = (en20) qn70Var.a(jq40.a(en20.class), null, null);
        Object objA = wrzVar.a(jq40.a(amj.class));
        if (objA != null) {
            return new zr40(k5bVar, vn30Var, do30Var, cq30Var, gn30Var, en20Var, ((amj) objA).a);
        }
        throw new wjd("No value found for type '" + zgp.a(jq40.a(amj.class)) + '\'');
    }
}
