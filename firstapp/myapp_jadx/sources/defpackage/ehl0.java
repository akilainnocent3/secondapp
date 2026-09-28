package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ehl0 extends jok0 {
    public final /* synthetic */ u6l0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehl0(gjl0 gjl0Var, u6l0 u6l0Var) {
        super("getValue");
        this.c = u6l0Var;
    }

    @Override // defpackage.jok0
    public final ipk0 g(g3l0 g3l0Var, List list) {
        r5l0.a(2, "getValue", list);
        ipk0 ipk0VarB = g3l0Var.b.b(g3l0Var, (ipk0) list.get(0));
        ipk0 ipk0VarB2 = g3l0Var.b.b(g3l0Var, (ipk0) list.get(1));
        String strZzc = ipk0VarB.zzc();
        u6l0 u6l0Var = this.c;
        Map map = (Map) u6l0Var.b.d.get(u6l0Var.a);
        String str = (map == null || !map.containsKey(strZzc)) ? null : (String) map.get(strZzc);
        return str != null ? new ypk0(str) : ipk0VarB2;
    }
}
