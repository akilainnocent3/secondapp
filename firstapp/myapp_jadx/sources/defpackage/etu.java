package defpackage;

import com.sportygames.sportyherocompose.components.RangeComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class etu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ etu(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        boolean z = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ftu ftuVar = (ftu) obj;
                mmd mmdVar = pkd.f(ftuVar).N;
                ((u5a0) ftuVar.H).D();
                int iD = ((u5a0) ftuVar.I).D();
                ((itu) obj2).getClass();
                return Integer.valueOf(ycv.b(0.33333334f * iD));
            case 1:
                return vd80.b((String) obj2, f120.b.a, new pd80[0], new nrb((nt70) obj, i2));
            default:
                qv80 qv80Var = (qv80) obj2;
                qub0 qub0Var = (qub0) obj;
                RangeComponent rangeComponent = qv80Var.c;
                RangeComponent rangeComponent2 = qv80Var.d;
                boolean z2 = qub0.M3(rangeComponent, rangeComponent.getErrorShowLiveData().d()) || qub0.M3(rangeComponent2, rangeComponent2.getErrorShowLiveData().d());
                if (z2 && !qub0Var.b3) {
                    z = true;
                }
                qub0Var.b3 = z2;
                if (z && qub0Var.h3 == b6c0.c) {
                    qub0Var.v4(true);
                }
                return Unit.a;
        }
    }
}
