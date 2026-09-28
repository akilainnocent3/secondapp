package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class kry implements Function2<Boolean, Double, Unit> {
    public final /* synthetic */ zqy a;

    public kry(zqy zqyVar) {
        this.a = zqyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Double d) {
        bool.getClass();
        double dDoubleValue = d.doubleValue();
        zqy zqyVar = this.a;
        ((x5a0) zqyVar.p0().L).setValue(Float.valueOf((float) dDoubleValue));
        ytw<Boolean> ytwVar = zqyVar.h0;
        Boolean bool2 = Boolean.TRUE;
        ((x5a0) ytwVar).setValue(bool2);
        ((x5a0) zqyVar.p0().P).setValue(1);
        ((x5a0) zqyVar.p0().N).setValue(Boolean.valueOf(true ^ ((Boolean) ((x5a0) zqyVar.p0().N).getValue()).booleanValue()));
        ((x5a0) zqyVar.p0().Q).setValue(bool2);
        return Unit.a;
    }
}
