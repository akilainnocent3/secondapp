package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wjn implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws wjd {
        qn70 qn70Var = (qn70) obj;
        wrz wrzVar = (wrz) obj2;
        qn70Var.getClass();
        wrzVar.getClass();
        k5b k5bVar = (k5b) qn70Var.a(jq40.a(k5b.class), null, bob0.a);
        e9x e9xVar = (e9x) qn70Var.a(jq40.a(e9x.class), null, null);
        s8x s8xVar = (s8x) qn70Var.a(jq40.a(s8x.class), null, null);
        hbx hbxVar = (hbx) qn70Var.a(jq40.a(hbx.class), null, null);
        vax vaxVar = (vax) qn70Var.a(jq40.a(vax.class), null, null);
        en20 en20Var = (en20) qn70Var.a(jq40.a(en20.class), null, null);
        Object objA = wrzVar.a(jq40.a(amj.class));
        if (objA != null) {
            return new gux(k5bVar, e9xVar, s8xVar, hbxVar, vaxVar, en20Var, ((amj) objA).a);
        }
        throw new wjd("No value found for type '" + zgp.a(jq40.a(amj.class)) + '\'');
    }
}
