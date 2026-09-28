package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cn4 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ cn4(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new lo4(new fn4(qn70Var), (urm) qn70Var.a(jq40.a(urm.class), null, null), (eal) qn70Var.a(jq40.a(eal.class), null, null), (v5b) qn70Var.a(jq40.a(v5b.class), null, null), (bym) qn70Var.a(jq40.a(bym.class), null, null));
            default:
                Map<String, List<Object>> mapD = ((q0s) obj2).d();
                if (mapD.isEmpty()) {
                    return null;
                }
                return mapD;
        }
    }
}
