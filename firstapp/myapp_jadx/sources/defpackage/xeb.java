package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xeb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fgb b;

    public /* synthetic */ xeb(fgb fgbVar, int i) {
        this.a = i;
        this.b = fgbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        fgb fgbVar = this.b;
        switch (i) {
            case 0:
                cgb.a(fgbVar.e1(), (String) ((x5a0) fgbVar.c1().v).getValue(), "placeBet", (String) obj);
                break;
            default:
                ylb0 ylb0Var = (ylb0) fgbVar;
                cgb.a(ylb0Var.e1(), (String) ((x5a0) ylb0Var.c1().v).getValue(), "placeBet", (String) obj);
                break;
        }
        return Unit.a;
    }
}
