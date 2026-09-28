package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u6i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u6i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((bba0) obj).getClass();
                ((Function0) obj2).invoke();
                break;
            default:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((ytw) obj2).setValue(new gly(urrVar.i0(0L)));
                break;
        }
        return Unit.a;
    }
}
