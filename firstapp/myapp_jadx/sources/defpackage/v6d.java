package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v6d implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v6d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ajx ajxVar = (ajx) obj;
                ajxVar.getClass();
                ajxVar.b = true;
                ajxVar.c = true;
                int i2 = fhx.v;
                ajxVar.a(fhx.a.a(((phx) obj2).b.j()).b.e);
                i220 i220Var = new i220();
                i220Var.b = true;
                Unit unit = Unit.a;
                ajxVar.f = i220Var.a;
                ajxVar.g = true;
                break;
            default:
                yg90 yg90Var = (yg90) obj;
                yg90Var.getClass();
                ((Function1) obj2).invoke(new de90.j(yg90Var));
                break;
        }
        return Unit.a;
    }
}
