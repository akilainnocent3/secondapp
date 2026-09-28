package defpackage;

import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crashInitiated.model.response.DetailResponse;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.components.ComposeBetContainerInitiatedKt$ComposeBetContainerInitiated$2$2$1$1$1$2$1", f = "ComposeBetContainerInitiated.kt", l = {}, m = "invokeSuspend", v = 1)
public final class p5a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytw<String> b;
    public final /* synthetic */ ytw<Boolean> c;
    public final /* synthetic */ int d;
    public final /* synthetic */ DetailResponse e;
    public final /* synthetic */ tl2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5a(int i, ytw<String> ytwVar, ytw<Boolean> ytwVar2, int i2, DetailResponse detailResponse, tl2 tl2Var, v1b<? super p5a> v1bVar) {
        super(2, v1bVar);
        this.a = i;
        this.b = ytwVar;
        this.c = ytwVar2;
        this.d = i2;
        this.e = detailResponse;
        this.f = tl2Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p5a(this.a, this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p5a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        double d;
        String str = "0.00";
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a == 1) {
            ytw<String> ytwVar = this.b;
            String str2 = (String) StringsKt__StringsKt.split$default(ytwVar.getValue(), new String[]{AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X}, false, 0, 6, null).get(0);
            boolean zM = StringsKt.M(ytwVar.getValue().toString(), ".", false);
            ytw<Boolean> ytwVar2 = this.c;
            if (zM) {
                ytwVar2.setValue(Boolean.TRUE);
            } else {
                ytwVar2.setValue(Boolean.FALSE);
            }
            int i = this.d;
            if (i == -1) {
                ytwVar.setValue(ytwVar.getValue());
            } else {
                if (i <= 9) {
                    if (str2.length() <= 7) {
                        if (ytwVar2.getValue().booleanValue()) {
                            List listSplit$default = StringsKt__StringsKt.split$default(str2, new String[]{"."}, false, 0, 6, null);
                            if (listSplit$default.size() == 2) {
                                if (((CharSequence) listSplit$default.get(1)).length() > 0 && ((String) listSplit$default.get(1)).length() < 2) {
                                    ytwVar.setValue(listSplit$default.get(0) + "." + wae0.F((CharSequence) listSplit$default.get(1)) + i);
                                } else {
                                    if (((String) listSplit$default.get(1)).length() >= 2) {
                                        return Unit.a;
                                    }
                                    ytwVar.setValue(listSplit$default.get(0) + "." + i);
                                }
                            }
                        } else {
                            if (str2.length() == 0) {
                                ytwVar.setValue("0");
                            }
                            List listSplit$default2 = StringsKt__StringsKt.split$default(str2.toString(), new String[]{"."}, false, 0, 6, null);
                            if (listSplit$default2.size() > 1) {
                                if (Intrinsics.g(listSplit$default2.get(0), "0") || Intrinsics.g(listSplit$default2.get(0), CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS) || ((CharSequence) listSplit$default2.get(0)).length() == 0) {
                                    ytwVar.setValue(i + "." + listSplit$default2.get(1));
                                } else if (str2.length() <= 11) {
                                    ytwVar.setValue(listSplit$default2.get(0) + i + "." + listSplit$default2.get(1));
                                }
                            } else if (Intrinsics.g(listSplit$default2.get(0), "0") || Intrinsics.g(listSplit$default2.get(0), CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS) || ((CharSequence) listSplit$default2.get(0)).length() == 0) {
                                ytwVar.setValue(String.valueOf(i));
                            } else if (str2.length() <= 11) {
                                Object obj2 = listSplit$default2.get(0);
                                StringBuilder sb = new StringBuilder();
                                sb.append(obj2);
                                sb.append(i);
                                ytwVar.setValue(sb.toString());
                            }
                        }
                    }
                } else if (i == 10) {
                    if (str2.length() == 0 || StringsKt.M(str2, ".", false)) {
                        return Unit.a;
                    }
                    ytwVar2.setValue(Boolean.TRUE);
                    ytwVar.setValue(str2.concat("."));
                } else if (i == 11) {
                    if (ytwVar.getValue().toString().length() <= 7) {
                        if (ytwVar2.getValue().booleanValue()) {
                            List listSplit$default3 = StringsKt__StringsKt.split$default(str2.toString(), new String[]{"."}, false, 0, 6, null);
                            if (listSplit$default3.size() == 2 && ((String) listSplit$default3.get(1)).length() > 0) {
                                return Unit.a;
                            }
                            ytwVar.setValue(str2.concat(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS));
                        } else {
                            List listSplit$default4 = StringsKt__StringsKt.split$default(str2, new String[]{"."}, false, 0, 6, null);
                            if (str2.length() == 0 || str2.equals("0")) {
                                ytwVar.setValue("0");
                            }
                            if (Intrinsics.g(listSplit$default4.get(0), "0") || Intrinsics.g(listSplit$default4.get(0), CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS) || ((CharSequence) listSplit$default4.get(0)).length() == 0) {
                                ytwVar.setValue(ytwVar.getValue());
                            } else if (ytwVar.getValue().length() <= 11) {
                                ytwVar.setValue(listSplit$default4.get(0) + CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                            }
                        }
                    }
                } else if (i == 12) {
                    if (str2.length() >= 1) {
                        ytwVar.setValue(wue.e(str2, String.valueOf(wae0.I(str2))));
                    }
                } else if (i == 13) {
                    ytwVar.setValue("");
                    ytwVar2.setValue(Boolean.FALSE);
                }
                if (i == 14) {
                    try {
                        d = Double.parseDouble(str2);
                    } catch (Exception unused) {
                        d = 5.0d;
                    }
                    if (String.valueOf(d).length() == 0) {
                        d = 1.01d;
                    }
                    Integer intOrNull = StringsKt.toIntOrNull(StringsKt.o0(str2, "."));
                    if (intOrNull == null || intOrNull.intValue() == 0 || d <= 1.0d) {
                        ytwVar.setValue("1.01");
                    } else {
                        DetailResponse detailResponse = this.e;
                        if (d > detailResponse.getMaxUserCoefficient()) {
                            ytwVar.setValue(String.valueOf(detailResponse.getMaxUserCoefficient()));
                        }
                    }
                    if (c.k(ytwVar.getValue(), ".", false)) {
                        ytwVar.setValue(wae0.E(ytwVar.getValue()));
                    }
                }
                if (i == 15) {
                    try {
                        String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(Double.parseDouble(String.valueOf(((Number) ((x5a0) this.f.L).getValue()).floatValue())));
                        str3.getClass();
                        str = str3;
                    } catch (Exception unused2) {
                    }
                    ytwVar.setValue(str);
                }
            }
        }
        return Unit.a;
    }
}
