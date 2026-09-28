package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pe8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pe8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                o77 o77Var = (o77) obj;
                re8.a aVar = re8.P;
                bvi bviVarN0 = ((re8) obj2).n0();
                if (o77Var.c.length() > 0) {
                    p77.a(bviVarN0.z, o77Var);
                } else {
                    bviVarN0.z.setText(o77Var.a);
                    bviVarN0.z.setIconResId(o77Var.b);
                }
                break;
            default:
                ((Boolean) obj).booleanValue();
                ((Function0) obj2).invoke();
                break;
        }
        return Unit.a;
    }
}
