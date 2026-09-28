package defpackage;

import com.sportygames.crash.remote.models.DetailResponse;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.b;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.bet.generic.AutoCashOutKeypadGenericComponentKt$AutoCashOutKeypadGenericComponent$1$1$1", f = "AutoCashOutKeypadGenericComponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class ac1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ytw<String> c;
    public final /* synthetic */ fsw d;
    public final /* synthetic */ DetailResponse e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac1(int i, v1b v1bVar, fsw fswVar, ytw ytwVar, DetailResponse detailResponse, boolean z) {
        super(2, v1bVar);
        this.a = z;
        this.b = i;
        this.c = ytwVar;
        this.d = fswVar;
        this.e = detailResponse;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ac1(this.b, v1bVar, this.d, this.c, this.e, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ac1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = this.a && this.b == 1;
        ytw<String> ytwVar = this.c;
        String string = StringsKt.t0(ytwVar.getValue()).toString();
        Double dH = b.h(string);
        boolean z2 = string.length() == 0 || dH == null || dH.doubleValue() <= 1.0d;
        if (!z) {
            if (z2) {
                string = "1.01";
            } else if (c.k(string, ".", false)) {
                string = wae0.E(string);
            } else if (StringsKt.M(string, ".", false)) {
                List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null);
                String str = (String) listSplit$default.get(0);
                String strV0 = StringsKt.v0((String) listSplit$default.get(1), '0');
                string = strV0.length() == 0 ? str : oxc.a(str, ".", strV0);
            }
            ytwVar.setValue(string);
            Double dH2 = b.h(ytwVar.getValue());
            double dDoubleValue = dH2 != null ? dH2.doubleValue() : 1.01d;
            fsw fswVar = this.d;
            double doubleValue = fswVar.getDoubleValue() * dDoubleValue;
            DetailResponse detailResponse = this.e;
            if (doubleValue > detailResponse.getMaxPayoutAmount()) {
                double maxAmount = fswVar.getDoubleValue() > detailResponse.getMaxAmount() ? detailResponse.getMaxAmount() : fswVar.getDoubleValue();
                TreeMap treeMap = pw.a;
                ytwVar.setValue(pw.o(detailResponse.getMaxPayoutAmount() / maxAmount));
            } else {
                TreeMap treeMap2 = pw.a;
                ytwVar.setValue(pw.p(dDoubleValue));
            }
            if (StringsKt.M(ytwVar.getValue(), ".0", false)) {
                ytwVar.setValue(pw.i(Double.parseDouble(ytwVar.getValue())));
            }
            if (c.k(ytwVar.getValue(), ".", false)) {
                ytwVar.setValue(wae0.E(ytwVar.getValue()));
            }
        }
        return Unit.a;
    }
}
