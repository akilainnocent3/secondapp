package defpackage;

import android.widget.TextView;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.remote.models.DetailResponse;
import com.sportygames.sportyherocompose.components.OverUnderComponent;
import com.sportygames.sportyherov2.remote.models.SideBetConfigsList;
import java.text.DecimalFormat;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u9q implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u9q(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.CharSequence, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        String str2;
        String str3;
        String str4;
        TextView textView;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj2;
                Function1 function1 = (Function1) obj;
                if (((kaq) obj3).p instanceof t2q.d) {
                    function0.invoke();
                } else {
                    function1.invoke(c9q.f.a);
                }
                return Unit.a;
            default:
                OverUnderComponent overUnderComponent = (OverUnderComponent) obj3;
                dq40 dq40Var = (dq40) obj2;
                dq40 dq40Var2 = (dq40) obj;
                int i2 = overUnderComponent.z;
                ru80 ru80Var = overUnderComponent.binding;
                if (i2 != 2) {
                    ?? string = ru80Var.L0.getText().toString();
                    String str5 = "0.00";
                    if ((string.length() == 0 || Double.parseDouble(string) == 0.0d) && !StringsKt.M(string, ".", false)) {
                        dq40Var2.a = "0";
                        TextView textView2 = overUnderComponent.binding.L0;
                        Double dH = b.h("0");
                        if (dH != null) {
                            try {
                                str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH.doubleValue());
                                str.getClass();
                            } catch (Exception unused) {
                                str = "0.00";
                            }
                        } else {
                            str = "0.00";
                        }
                        textView2.setText(str);
                    } else if (!StringsKt.M(string, ".", false)) {
                        ?? Concat = string.concat(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                        dq40Var2.a = Concat;
                        TextView textView3 = overUnderComponent.binding.L0;
                        Double dH2 = b.h(Concat);
                        if (dH2 != null) {
                            try {
                                str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH2.doubleValue());
                                str2.getClass();
                            } catch (Exception unused2) {
                                str2 = "0.00";
                            }
                        } else {
                            str2 = "0.00";
                        }
                        textView3.setText(str2);
                    } else if (((String) StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null).get(1)).length() == 1) {
                        dq40Var2.a = string;
                        TextView textView4 = overUnderComponent.binding.L0;
                        Double dH3 = b.h(string);
                        if (dH3 != null) {
                            try {
                                str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH3.doubleValue());
                                str4.getClass();
                            } catch (Exception unused3) {
                                str4 = "0.00";
                            }
                        } else {
                            str4 = "0.00";
                        }
                        textView4.setText(str4);
                    } else if (((CharSequence) StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null).get(1)).length() == 0) {
                        ?? Concat2 = string.concat(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                        dq40Var2.a = Concat2;
                        TextView textView5 = overUnderComponent.binding.L0;
                        Double dH4 = b.h(Concat2);
                        if (dH4 != null) {
                            try {
                                str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH4.doubleValue());
                                str3.getClass();
                            } catch (Exception unused4) {
                                str3 = "0.00";
                            }
                        } else {
                            str3 = "0.00";
                        }
                        textView5.setText(str3);
                    }
                    if (((CharSequence) dq40Var2.a).length() > 0) {
                        double d = Double.parseDouble((String) dq40Var2.a);
                        DetailResponse detailResponse = overUnderComponent.b;
                        if (detailResponse == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        if (d >= detailResponse.getMaxAmount()) {
                            TextView textView6 = overUnderComponent.binding.L0;
                            TreeMap treeMap = pw.a;
                            DetailResponse detailResponse2 = overUnderComponent.b;
                            if (detailResponse2 == null) {
                                Intrinsics.n("gameDetailResponse");
                                throw null;
                            }
                            Double dH5 = b.h(pw.q(detailResponse2.getMaxAmount()));
                            if (dH5 != null) {
                                try {
                                    String str6 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH5.doubleValue());
                                    str6.getClass();
                                    str5 = str6;
                                } catch (Exception unused5) {
                                }
                            }
                            textView6.setText(str5);
                        }
                    }
                    break;
                } else {
                    ?? A = pl2.a(overUnderComponent.binding.T0, 1, ru80Var.T0.getText().toString(), 0);
                    if (!(A.length() == 0 || Double.parseDouble(A) == 0.0d) || StringsKt.M(A, ".", false)) {
                        if (!StringsKt.M(A, ".", false)) {
                            dq40Var.a = A;
                            textView = overUnderComponent.binding.T0;
                        } else if (((String) StringsKt__StringsKt.split$default(A, new String[]{"."}, false, 0, 6, null).get(1)).length() == 1) {
                            dq40Var.a = A;
                            k560.a(overUnderComponent.binding.T0, A, "x");
                        } else if (((CharSequence) StringsKt__StringsKt.split$default(A, new String[]{"."}, false, 0, 6, null).get(1)).length() == 0) {
                            dq40Var.a = A;
                            textView = overUnderComponent.binding.T0;
                        }
                        k560.a(textView, A, "00x");
                    } else {
                        dq40Var.a = "0";
                        overUnderComponent.binding.T0.setText("0x");
                    }
                    if (((CharSequence) dq40Var.a).length() > 0) {
                        double d2 = Double.parseDouble((String) dq40Var.a);
                        SideBetConfigsList sideBetConfigsList = overUnderComponent.c;
                        if (sideBetConfigsList == null) {
                            Intrinsics.n("sideBetConfigsList");
                            throw null;
                        }
                        if (d2 >= sideBetConfigsList.getMaxCoefficient()) {
                            TextView textView7 = overUnderComponent.binding.T0;
                            TreeMap treeMap2 = pw.a;
                            SideBetConfigsList sideBetConfigsList2 = overUnderComponent.c;
                            if (sideBetConfigsList2 == null) {
                                Intrinsics.n("sideBetConfigsList");
                                throw null;
                            }
                            textView7.setText(pw.q(sideBetConfigsList2.getMaxCoefficient()).concat("x"));
                        }
                    }
                }
                return Unit.a;
        }
    }
}
