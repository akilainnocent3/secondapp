package defpackage;

import android.widget.TextView;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportygames.crash.remote.models.DetailResponse;
import com.sportygames.sportyherocompose.components.OverUnderComponent;
import com.sportygames.sportyherov2.remote.models.SideBetConfigsList;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class pdz implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strValueOf;
        String strValueOf2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                OverUnderComponent overUnderComponent = (OverUnderComponent) obj2;
                int iIntValue = ((Integer) obj).intValue();
                int i2 = overUnderComponent.z;
                ru80 ru80Var = overUnderComponent.binding;
                if (i2 == 2) {
                    String strA = pl2.a(overUnderComponent.binding.T0, 1, ru80Var.T0.getText().toString(), 0);
                    if (strA.length() <= 0 || strA.equals("0")) {
                        strValueOf2 = String.valueOf(iIntValue);
                    } else if (StringsKt.M(strA, ".", false)) {
                        List listSplit$default = StringsKt__StringsKt.split$default(strA, new String[]{"."}, false, 0, 6, null);
                        if (listSplit$default.size() != 2) {
                            strValueOf2 = listSplit$default.get(0) + "." + iIntValue;
                        } else if (((String) listSplit$default.get(1)).length() < 2) {
                            strValueOf2 = listSplit$default.get(0) + "." + listSplit$default.get(1) + iIntValue;
                        } else {
                            strValueOf2 = listSplit$default.get(0) + "." + listSplit$default.get(1);
                        }
                    } else if (Double.parseDouble(strA) != 0.0d || iIntValue != 0) {
                        strValueOf2 = hce0.a(iIntValue, strA);
                    }
                    double d = Double.parseDouble(strValueOf2);
                    SideBetConfigsList sideBetConfigsList = overUnderComponent.c;
                    if (sideBetConfigsList == null) {
                        Intrinsics.n("sideBetConfigsList");
                        throw null;
                    }
                    double maxCoefficient = sideBetConfigsList.getMaxCoefficient();
                    ru80 ru80Var2 = overUnderComponent.binding;
                    if (d >= maxCoefficient) {
                        TextView textView = ru80Var2.T0;
                        TreeMap treeMap = pw.a;
                        SideBetConfigsList sideBetConfigsList2 = overUnderComponent.c;
                        if (sideBetConfigsList2 == null) {
                            Intrinsics.n("sideBetConfigsList");
                            throw null;
                        }
                        textView.setText(pw.q(sideBetConfigsList2.getMaxCoefficient()).concat("x"));
                    } else {
                        r97.a(ru80Var2.T0, strValueOf2, "x");
                    }
                } else {
                    String string = ru80Var.L0.getText().toString();
                    if (string.length() <= 0 || string.equals("0")) {
                        strValueOf = String.valueOf(iIntValue);
                    } else if (StringsKt.M(string, ".", false)) {
                        List listSplit$default2 = StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null);
                        if (listSplit$default2.size() != 2) {
                            strValueOf = listSplit$default2.get(0) + "." + iIntValue;
                        } else if (((String) listSplit$default2.get(1)).length() < 2) {
                            strValueOf = listSplit$default2.get(0) + "." + listSplit$default2.get(1) + iIntValue;
                        } else {
                            strValueOf = listSplit$default2.get(0) + "." + listSplit$default2.get(1);
                        }
                    } else if (Double.parseDouble(string) != 0.0d || iIntValue != 0) {
                        strValueOf = hce0.a(iIntValue, string);
                    }
                    double d2 = Double.parseDouble(strValueOf);
                    DetailResponse detailResponse = overUnderComponent.b;
                    if (detailResponse == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    double maxAmount = detailResponse.getMaxAmount();
                    ru80 ru80Var3 = overUnderComponent.binding;
                    if (d2 >= maxAmount) {
                        TextView textView2 = ru80Var3.L0;
                        TreeMap treeMap2 = pw.a;
                        DetailResponse detailResponse2 = overUnderComponent.b;
                        if (detailResponse2 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        textView2.setText(pw.q(detailResponse2.getMaxAmount()));
                    } else {
                        ru80Var3.L0.setText(strValueOf);
                    }
                }
                return Unit.a;
            default:
                Event event = (Event) obj;
                event.getClass();
                return t0k0.C1(event, (SocketMarketMessage) obj2);
        }
    }

    public /* synthetic */ pdz(OverUnderComponent overUnderComponent) {
        this.b = overUnderComponent;
    }
}
