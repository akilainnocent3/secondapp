package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yfb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yfb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj2;
                cgb.a(fgbVar.e1(), (String) ((x5a0) fgbVar.c1().v).getValue(), "placeBet", (String) obj);
                break;
            default:
                ej5.c((v5b) obj2, null, null, new xsk((b1g0) obj, null), 3);
                break;
        }
        return Unit.a;
    }
}
