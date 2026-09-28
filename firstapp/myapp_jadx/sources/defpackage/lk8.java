package defpackage;

import android.widget.TextView;
import com.sportygames.sportyherov2.components.RangeComponent;
import com.sportygames.sportyherov2.remote.models.DetailResponse;
import com.sportygames.sportyherov2.remote.models.SideBetConfigsList;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class lk8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lk8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strValueOf;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fme fmeVar = ((zk8) obj2).w;
                fmeVar.getClass();
                fmeVar.b.setText((String) obj);
                return Unit.a;
            default:
                RangeComponent rangeComponent = (RangeComponent) obj2;
                int iIntValue = ((Integer) obj).intValue();
                int i2 = rangeComponent.D;
                if (i2 == rangeComponent.b) {
                    SideBetConfigsList sideBetConfigsList = rangeComponent.f;
                    if (sideBetConfigsList == null) {
                        Intrinsics.n("leftSideBetConfigs");
                        throw null;
                    }
                    RangeComponent.r(iIntValue, sideBetConfigsList, rangeComponent.binding.J0);
                } else if (i2 == rangeComponent.c) {
                    SideBetConfigsList sideBetConfigsList2 = rangeComponent.i;
                    if (sideBetConfigsList2 == null) {
                        Intrinsics.n("rightSideBetConfigs");
                        throw null;
                    }
                    RangeComponent.r(iIntValue, sideBetConfigsList2, rangeComponent.binding.G0);
                } else {
                    String string = rangeComponent.binding.D0.getText().toString();
                    if (string == null || string.length() == 0 || string.equals("0")) {
                        strValueOf = String.valueOf(iIntValue);
                    } else if (StringsKt.M(string, ".", false)) {
                        List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null);
                        if (listSplit$default.size() != 2) {
                            strValueOf = listSplit$default.get(0) + "." + iIntValue;
                        } else if (((String) listSplit$default.get(1)).length() < 2) {
                            strValueOf = listSplit$default.get(0) + "." + listSplit$default.get(1) + iIntValue;
                        } else {
                            strValueOf = listSplit$default.get(0) + "." + listSplit$default.get(1);
                        }
                    } else if (Double.parseDouble(string) != 0.0d || iIntValue != 0) {
                        strValueOf = hce0.a(iIntValue, string);
                    }
                    double d = Double.parseDouble(strValueOf);
                    DetailResponse detailResponse = rangeComponent.e;
                    if (detailResponse == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    double maxAmount = detailResponse.getMaxAmount();
                    pv80 pv80Var = rangeComponent.binding;
                    if (d >= maxAmount) {
                        TextView textView = pv80Var.D0;
                        TreeMap treeMap = pw.a;
                        DetailResponse detailResponse2 = rangeComponent.e;
                        if (detailResponse2 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        textView.setText(pw.q(detailResponse2.getMaxAmount()));
                    } else {
                        pv80Var.D0.setText(strValueOf);
                    }
                }
                return Unit.a;
        }
    }
}
