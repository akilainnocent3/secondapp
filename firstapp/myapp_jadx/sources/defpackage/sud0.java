package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.models.ChipData;
import com.sportygames.crash.remote.models.DetailResponse;
import java.text.DecimalFormat;
import java.util.ListIterator;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.bet.StakeSelectorWrapperComponentKt$StakeSelectorWrapperComponent$3$1$1$1$6$1", f = "StakeSelectorWrapperComponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class sud0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytw<String> b;
    public final /* synthetic */ int c;
    public final /* synthetic */ fsw d;
    public final /* synthetic */ int e;
    public final /* synthetic */ SnapshotStateList<ChipData> f;
    public final /* synthetic */ DetailResponse i;
    public final /* synthetic */ ytw<String> v;
    public final /* synthetic */ ytw<String> w;
    public final /* synthetic */ ytw<Boolean> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sud0(int i, ytw<String> ytwVar, int i2, fsw fswVar, int i3, SnapshotStateList<ChipData> snapshotStateList, DetailResponse detailResponse, ytw<String> ytwVar2, ytw<String> ytwVar3, ytw<Boolean> ytwVar4, v1b<? super sud0> v1bVar) {
        super(2, v1bVar);
        this.a = i;
        this.b = ytwVar;
        this.c = i2;
        this.d = fswVar;
        this.e = i3;
        this.f = snapshotStateList;
        this.i = detailResponse;
        this.v = ytwVar2;
        this.w = ytwVar3;
        this.y = ytwVar4;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sud0(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sud0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a == 2) {
            ytw<String> ytwVar = this.b;
            Boolean boolValueOf = Boolean.valueOf(StringsKt.M(ytwVar.getValue(), ".", false));
            ytw<Boolean> ytwVar2 = this.y;
            ytwVar2.setValue(boolValueOf);
            String str = "0.00";
            int i = this.c;
            fsw fswVar = this.d;
            if (i != -1) {
                int i2 = this.e;
                if (i <= 9) {
                    String value = (String) CollectionsKt.V(0, StringsKt__StringsKt.split$default(ytwVar.getValue(), new String[]{"."}, false, 0, 6, null));
                    if (value == null) {
                        value = ytwVar.getValue();
                    }
                    if (ytwVar2.getValue().booleanValue()) {
                        String str2 = (String) CollectionsKt.V(1, StringsKt__StringsKt.split$default(ytwVar.getValue(), new String[]{"."}, false, 0, 6, null));
                        if ((str2 != null ? str2 : "").length() < 2) {
                            String value2 = ytwVar.getValue();
                            StringBuilder sb = new StringBuilder();
                            sb.append((Object) value2);
                            sb.append(i);
                            ytwVar.setValue(sb.toString());
                            Double dH = b.h(ytwVar.getValue());
                            fswVar.t(dH != null ? dH.doubleValue() : fswVar.getDoubleValue());
                        }
                    } else if (Intrinsics.g(ytwVar.getValue(), "0")) {
                        ytwVar.setValue(String.valueOf(i));
                        Double dH2 = b.h(ytwVar.getValue());
                        fswVar.t(dH2 != null ? dH2.doubleValue() : fswVar.getDoubleValue());
                    } else if (value.length() < i2) {
                        String value3 = ytwVar.getValue();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((Object) value3);
                        sb2.append(i);
                        ytwVar.setValue(sb2.toString());
                        Double dH3 = b.h(ytwVar.getValue());
                        fswVar.t(dH3 != null ? dH3.doubleValue() : fswVar.getDoubleValue());
                    }
                } else if (i == 10) {
                    if (!ytwVar2.getValue().booleanValue()) {
                        if (ytwVar.getValue().length() == 0) {
                            ytwVar.setValue("0.");
                        } else {
                            ytwVar.setValue(((Object) ytwVar.getValue()) + ".");
                        }
                        ytwVar2.setValue(Boolean.TRUE);
                    }
                } else if (i == 11) {
                    if (ytwVar2.getValue().booleanValue()) {
                        String str3 = (String) CollectionsKt.V(1, StringsKt__StringsKt.split$default(ytwVar.getValue(), new String[]{"."}, false, 0, 6, null));
                        if ((str3 != null ? str3 : "").length() == 0) {
                            ytwVar.setValue(((Object) ytwVar.getValue()) + CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                            Double dH4 = b.h(ytwVar.getValue());
                            fswVar.t(dH4 != null ? dH4.doubleValue() : fswVar.getDoubleValue());
                        }
                    } else {
                        String value4 = ytwVar.getValue();
                        if (value4.length() > 0 && !value4.equals("0") && value4.length() + 2 <= i2) {
                            ytwVar.setValue(((Object) ytwVar.getValue()) + CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                            Double dH5 = b.h(ytwVar.getValue());
                            fswVar.t(dH5 != null ? dH5.doubleValue() : fswVar.getDoubleValue());
                        }
                    }
                } else if (i != 12) {
                    SnapshotStateList<ChipData> snapshotStateList = this.f;
                    if (i == 13) {
                        ytwVar.setValue("");
                        ytwVar2.setValue(Boolean.FALSE);
                        double d = 0.0d;
                        fswVar.t(0.0d);
                        ListIterator<ChipData> listIterator = snapshotStateList.listIterator();
                        while (true) {
                            dxd0 dxd0Var = (dxd0) listIterator;
                            if (!dxd0Var.hasNext()) {
                                break;
                            }
                            ChipData chipData = (ChipData) dxd0Var.next();
                            chipData.setCurrentBet(d);
                            chipData.setSelected(false);
                            d = 0.0d;
                        }
                    } else if (i == 14) {
                        ListIterator<ChipData> listIterator2 = snapshotStateList.listIterator();
                        while (true) {
                            dxd0 dxd0Var2 = (dxd0) listIterator2;
                            if (!dxd0Var2.hasNext()) {
                                break;
                            }
                            ChipData chipData2 = (ChipData) dxd0Var2.next();
                            chipData2.setCurrentBet(0.0d);
                            chipData2.setSelected(false);
                        }
                        Double dH6 = b.h(ytwVar.getValue());
                        double dDoubleValue = dH6 != null ? dH6.doubleValue() : 0.0d;
                        DetailResponse detailResponse = this.i;
                        if (dDoubleValue < detailResponse.getMinAmount()) {
                            dDoubleValue = detailResponse.getMinAmount();
                        } else if (dDoubleValue > detailResponse.getMaxAmount()) {
                            dDoubleValue = detailResponse.getMaxAmount();
                        }
                        if (dDoubleValue > 9999999.0d) {
                            dDoubleValue = 9999999.0d;
                        }
                        fswVar.t(dDoubleValue);
                        try {
                            String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue);
                            str4.getClass();
                            str = str4;
                        } catch (Exception unused) {
                        }
                        ytwVar.setValue(str);
                        ytw<String> ytwVar3 = this.v;
                        Double dH7 = b.h(ytwVar3.getValue());
                        if (fswVar.getDoubleValue() * (dH7 != null ? dH7.doubleValue() : 1.01d) > detailResponse.getMaxPayoutAmount()) {
                            double maxAmount = fswVar.getDoubleValue() > detailResponse.getMaxAmount() ? detailResponse.getMaxAmount() : fswVar.getDoubleValue();
                            TreeMap treeMap = pw.a;
                            ytwVar3.setValue(pw.n(detailResponse.getMaxPayoutAmount() / maxAmount));
                            this.w.setValue(((Object) ytwVar3.getValue()) + "x");
                        }
                    }
                } else if (ytwVar.getValue().length() > 0) {
                    ytwVar.setValue(wae0.E(ytwVar.getValue()));
                    Double dH8 = b.h(ytwVar.getValue());
                    fswVar.t(dH8 != null ? dH8.doubleValue() : 0.0d);
                }
            } else if (fswVar.getDoubleValue() == 0.0d) {
                ytwVar.setValue("");
            } else {
                try {
                    String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(fswVar.getDoubleValue());
                    str5.getClass();
                    str = str5;
                } catch (Exception unused2) {
                }
                ytwVar.setValue(str);
            }
        }
        return Unit.a;
    }
}
