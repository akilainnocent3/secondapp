package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zxe implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zxe(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((Function1) obj2).invoke(new ywe.a(ijf0Var));
                break;
            case 1:
                d860 d860Var = (d860) obj;
                d860Var.getClass();
                ((Function1) obj2).invoke(new vc60.w(d860Var));
                break;
            default:
                ((ytw) obj2).setValue(Boolean.valueOf(((Integer) obj).intValue() > 2));
                break;
        }
        return Unit.a;
    }
}
