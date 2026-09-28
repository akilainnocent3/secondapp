package defpackage;

import com.sportybet.feature.luckynumber.featurematch.presentation.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class hbq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hbq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qcn qcnVar = (qcn) obj;
                qcnVar.getClass();
                ((Function1) obj2).invoke(new a.C0403a(qcnVar));
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                gvi gviVar = ((qub0) obj2).z;
                if (gviVar != null) {
                    gviVar.o0.a.e(!zBooleanValue);
                }
                break;
        }
        return Unit.a;
    }
}
