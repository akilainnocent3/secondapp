package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class djn implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws wjd {
        qn70 qn70Var = (qn70) obj;
        wrz wrzVar = (wrz) obj2;
        qn70Var.getClass();
        wrzVar.getClass();
        kd60 kd60Var = (kd60) qn70Var.a(jq40.a(kd60.class), null, null);
        ja60 ja60Var = (ja60) qn70Var.a(jq40.a(ja60.class), null, null);
        wd60 wd60Var = (wd60) qn70Var.a(jq40.a(wd60.class), null, null);
        td60 td60Var = (td60) qn70Var.a(jq40.a(td60.class), null, null);
        en20 en20Var = (en20) qn70Var.a(jq40.a(en20.class), null, null);
        if60 if60Var = (if60) qn70Var.a(jq40.a(if60.class), null, null);
        k5b k5bVar = (k5b) qn70Var.a(jq40.a(k5b.class), null, bob0.a);
        Object objA = wrzVar.a(jq40.a(amj.class));
        if (objA != null) {
            return new uua0(kd60Var, ja60Var, wd60Var, td60Var, en20Var, if60Var, k5bVar, ((amj) objA).a);
        }
        throw new wjd("No value found for type '" + zgp.a(jq40.a(amj.class)) + '\'');
    }
}
