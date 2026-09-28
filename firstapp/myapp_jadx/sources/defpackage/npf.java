package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class npf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ npf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((ytw) obj2).setValue(bool);
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                ((Function0) obj2).invoke();
                break;
            default:
                mjj0 mjj0Var = (mjj0) obj2;
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                yi.a aVar = new yi.a(ijf0Var);
                mjj0Var.getClass();
                mjj0Var.A0.a(aVar);
                break;
        }
        return Unit.a;
    }
}
