package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mn4 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ mn4(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws wjd {
        qn70 qn70Var = (qn70) obj;
        wrz wrzVar = (wrz) obj2;
        switch (this.a) {
            case 0:
                qn70Var.getClass();
                wrzVar.getClass();
                return new tj4((bsm) qn70Var.a(jq40.a(bsm.class), null, null), (lum) qn70Var.a(jq40.a(lum.class), null, null));
            default:
                qn70Var.getClass();
                wrzVar.getClass();
                zve0 zve0Var = (zve0) qn70Var.a(jq40.a(zve0.class), null, null);
                que0 que0Var = (que0) qn70Var.a(jq40.a(que0.class), null, null);
                k5b k5bVar = (k5b) qn70Var.a(jq40.a(k5b.class), null, bob0.a);
                k5b k5bVar2 = (k5b) qn70Var.a(jq40.a(k5b.class), null, cob0.a);
                en20 en20Var = (en20) qn70Var.a(jq40.a(en20.class), null, null);
                cwe0 cwe0Var = (cwe0) qn70Var.a(jq40.a(cwe0.class), null, null);
                String str = (String) qn70Var.a(jq40.a(String.class), null, new eae0("qualifier_base_url_cdn"));
                Object objA = wrzVar.a(jq40.a(amj.class));
                if (objA != null) {
                    return new aof0(zve0Var, que0Var, k5bVar, k5bVar2, en20Var, cwe0Var, str, ((amj) objA).a);
                }
                throw new wjd("No value found for type '" + zgp.a(jq40.a(amj.class)) + '\'');
        }
    }
}
