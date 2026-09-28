package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a5u implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a5u(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ajx ajxVar = (ajx) obj;
                dq7 dq7VarA = jq40.a(i8r.class);
                ajxVar.getClass();
                ajxVar.h = dq7VarA;
                ajxVar.f = false;
                ajxVar.a(-1);
                i220 i220Var = new i220();
                i220Var.a = true;
                Unit unit = Unit.a;
                ajxVar.f = true;
                ajxVar.g = i220Var.b;
                ajxVar.b = true;
                return Unit.a;
            default:
                gxe0 gxe0Var = (gxe0) obj;
                gxe0Var.getClass();
                return gxe0Var.getClass().getName();
        }
    }
}
