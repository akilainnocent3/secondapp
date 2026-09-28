package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import com.sportygames.wheelanddeal.model.WDAutoSpinConfigModel;
import com.sportygames.wheelanddeal.model.WDRiskAmountModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class qqi0 {
    public final scn<oti0, WDRiskAmountModel> a;
    public final WDAutoSpinConfigModel b;

    /* JADX WARN: Illegal instructions before constructor call */
    public qqi0(int i) {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this(a4h.d(o2gVar), new WDAutoSpinConfigModel(0, 0, 0, 0, 15, null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqi0)) {
            return false;
        }
        qqi0 qqi0Var = (qqi0) obj;
        return Intrinsics.g(this.a, qqi0Var.a) && Intrinsics.g(this.b, qqi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return UccrWswQGaIj.oaQHmksB + this.a + ", autoSpin=" + this.b + ')';
    }

    public qqi0() {
        this(0);
    }

    public qqi0(scn<oti0, WDRiskAmountModel> scnVar, WDAutoSpinConfigModel wDAutoSpinConfigModel) {
        scnVar.getClass();
        wDAutoSpinConfigModel.getClass();
        this.a = scnVar;
        this.b = wDAutoSpinConfigModel;
    }
}
