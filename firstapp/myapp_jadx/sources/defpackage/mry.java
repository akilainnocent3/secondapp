package defpackage;

import com.sportygames.crashInitiated.model.response.DetailResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class mry implements Function1<Double, Unit> {
    public final /* synthetic */ zqy a;

    public mry(zqy zqyVar) {
        this.a = zqyVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Double d) {
        double dDoubleValue = d.doubleValue();
        zqy zqyVar = this.a;
        zqyVar.Q0((DetailResponse) ((x5a0) zqyVar.p0().d0).getValue(), dDoubleValue);
        return Unit.a;
    }
}
