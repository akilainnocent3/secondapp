package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tib implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tib(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((zqy) obj2).o0(str);
                break;
            case 1:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.u(((Number) ((twd0) obj2).getValue()).floatValue());
                break;
            default:
                pb80 pb80Var = (pb80) obj;
                Object objInvoke = ((Function0) obj2).invoke();
                if (Float.isNaN(((Number) objInvoke).floatValue())) {
                    objInvoke = null;
                }
                Float f = (Float) objInvoke;
                lb80.g(pb80Var, new m230(f != null ? f.floatValue() : 0.0f, new gt7(0.0f, 1.0f), 0));
                break;
        }
        return Unit.a;
    }
}
