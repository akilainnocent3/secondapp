package defpackage;

import com.sportybet.feature.luckynumber.featurematch.presentation.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yaq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yaq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(new a.g(((Integer) obj).intValue()));
                break;
            default:
                mjj0 mjj0Var = (mjj0) obj2;
                obj.getClass();
                tmu.a aVar = new tmu.a(obj, true);
                mjj0Var.getClass();
                mjj0Var.A0.a(aVar);
                break;
        }
        return Unit.a;
    }
}
