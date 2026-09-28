package defpackage;

import com.sportygames.sportyherocompose.components.OverUnderComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ztb0 implements Function0 {
    public final /* synthetic */ su80 a;
    public final /* synthetic */ qub0 b;

    public /* synthetic */ ztb0(su80 su80Var, qub0 qub0Var) {
        this.a = su80Var;
        this.b = qub0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        su80 su80Var = this.a;
        OverUnderComponent overUnderComponent = su80Var.b;
        OverUnderComponent overUnderComponent2 = su80Var.c;
        boolean z = qub0.M3(overUnderComponent, overUnderComponent.getErrorShowLiveData().d()) || qub0.M3(overUnderComponent2, overUnderComponent2.getErrorShowLiveData().d());
        qub0 qub0Var = this.b;
        boolean z2 = z && !qub0Var.a3;
        qub0Var.a3 = z;
        if (z2 && qub0Var.h3 == b6c0.b) {
            qub0Var.v4(false);
        }
        return Unit.a;
    }
}
