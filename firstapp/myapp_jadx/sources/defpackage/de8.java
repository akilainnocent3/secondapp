package defpackage;

import com.sportybet.plugin.event.e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class de8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ de8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                re8 re8Var = (re8) obj2;
                List<ug30> list = (List) obj;
                re8.a aVar = re8.P;
                if (list.isEmpty()) {
                    re8Var.n0().y.setVisibility(8);
                    re8Var.n0().I.setVisibility(8);
                } else {
                    re8Var.n0().y.setVisibility(0);
                    re8Var.n0().I.setVisibility(0);
                }
                re8Var.n0().I.setData(list);
                return Unit.a;
            case 1:
                String str = (String) obj2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM creator_credit_table WHERE user_id = ?");
                try {
                    hq60VarH1.L(1, str);
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
            case 2:
                e eVar = (e) obj2;
                return ((x920.a) obj) == x920.a.a ? eVar.p0 : eVar.F0;
            default:
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                lzaVar.b2();
                tcf.V1(lzaVar, (hfs) obj2, 0L, 0L, 0.0f, null, null, 9, 62);
                return Unit.a;
        }
    }
}
