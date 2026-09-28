package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class plo implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ plo(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                break;
            default:
                ajx ajxVar = (ajx) obj;
                ajxVar.getClass();
                ajxVar.b = true;
                break;
        }
        return Unit.a;
    }
}
