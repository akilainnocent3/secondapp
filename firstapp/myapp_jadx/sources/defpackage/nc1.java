package defpackage;

import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportygames.crash.remote.models.DetailResponse;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.bet.AutoCashoutKeypadComponentKt$AutoCashoutKeypadComponent$1$2$1", f = "AutoCashoutKeypadComponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class nc1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<String> a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ fsw d;
    public final /* synthetic */ DetailResponse e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc1(ytw<String> ytwVar, int i, int i2, fsw fswVar, DetailResponse detailResponse, v1b<? super nc1> v1bVar) {
        super(2, v1bVar);
        this.a = ytwVar;
        this.b = i;
        this.c = i2;
        this.d = fswVar;
        this.e = detailResponse;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nc1(this.a, this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nc1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String value;
        double d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ytw<String> ytwVar = this.a;
        int i = this.b;
        if (i == -1 || this.c == 2) {
            value = ytwVar.getValue();
        } else if (i == 13) {
            value = "";
        } else if (i == 10 && StringsKt.M(ytwVar.getValue(), ".", false)) {
            value = ytwVar.getValue();
        } else {
            List listSplit$default = StringsKt__StringsKt.split$default(ytwVar.getValue(), new String[]{"."}, false, 0, 6, null);
            value = ((listSplit$default.size() <= 1 || ((String) listSplit$default.get(1)).length() != 2 || i > 11) && (ytwVar.getValue().length() < 7 || i > 11)) ? lla.c(i, ytwVar.getValue()) : ytwVar.getValue();
        }
        ytwVar.setValue(value);
        if (i == 14) {
            try {
                d = Double.parseDouble(ytwVar.getValue());
            } catch (Exception unused) {
                d = 5.0d;
            }
            Integer intOrNull = StringsKt.toIntOrNull(StringsKt.o0(ytwVar.getValue(), "."));
            if (intOrNull == null || intOrNull.intValue() == 0 || d <= 1.0d) {
                ytwVar.setValue("1.01");
            } else {
                fsw fswVar = this.d;
                double doubleValue = fswVar.getDoubleValue() * d;
                DetailResponse detailResponse = this.e;
                if (doubleValue > detailResponse.getMaxPayoutAmount()) {
                    double maxAmount = fswVar.getDoubleValue() > detailResponse.getMaxAmount() ? detailResponse.getMaxAmount() : fswVar.getDoubleValue();
                    TreeMap treeMap = pw.a;
                    ytwVar.setValue(pw.o(detailResponse.getMaxPayoutAmount() / maxAmount));
                } else {
                    TreeMap treeMap2 = pw.a;
                    ytwVar.setValue(pw.p(d));
                }
            }
            if (StringsKt.M(ytwVar.getValue(), ".0", false)) {
                TreeMap treeMap3 = pw.a;
                ytwVar.setValue(pw.i(Double.parseDouble(ytwVar.getValue())));
            }
            if (c.k(ytwVar.getValue(), ".", false)) {
                ytwVar.setValue(wae0.E(ytwVar.getValue()));
            }
        }
        if (i == 11 && (Intrinsics.g(ytwVar.getValue(), CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS) || Intrinsics.g(ytwVar.getValue(), "000"))) {
            ytwVar.setValue("0");
        }
        return Unit.a;
    }
}
