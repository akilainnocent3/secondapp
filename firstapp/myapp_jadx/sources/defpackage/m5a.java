package defpackage;

import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportygames.commons.SportyGamesManager;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.components.ComposeBetContainerInitiatedKt$AmountCenter$1$1", f = "ComposeBetContainerInitiated.kt", l = {}, m = "invokeSuspend", v = 1)
public final class m5a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytw<String> b;
    public final /* synthetic */ ytw<Boolean> c;
    public final /* synthetic */ int d;
    public final /* synthetic */ double e;
    public final /* synthetic */ double f;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ double v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5a(int i, ytw<String> ytwVar, ytw<Boolean> ytwVar2, int i2, double d, double d2, boolean z, double d3, v1b<? super m5a> v1bVar) {
        super(2, v1bVar);
        this.a = i;
        this.b = ytwVar;
        this.c = ytwVar2;
        this.d = i2;
        this.e = d;
        this.f = d2;
        this.i = z;
        this.v = d3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m5a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m5a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x03b7  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a == 2) {
            ytw<String> ytwVar = this.b;
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
                String str4 = "0.00";
                if (i <= 9) {
                    if (ytwVar.getValue().toString().length() <= 10) {
                        if (ytwVar2.getValue().booleanValue()) {
                            List listSplit$default = StringsKt__StringsKt.split$default(ytwVar.getValue(), new String[]{"."}, false, 0, 6, null);
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
                            if (ytwVar.getValue().length() == 0) {
                                ytwVar.setValue("0");
                            }
                            List listSplit$default2 = StringsKt__StringsKt.split$default(ytwVar.getValue().toString(), new String[]{"."}, false, 0, 6, null);
                            if (listSplit$default2.size() > 1) {
                                if (Intrinsics.g(listSplit$default2.get(0), "0") || Intrinsics.g(listSplit$default2.get(0), CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS) || ((CharSequence) listSplit$default2.get(0)).length() == 0) {
                                    ytwVar.setValue(i + "." + listSplit$default2.get(1));
                                } else if (ytwVar.getValue().length() <= 11) {
                                    ytwVar.setValue(listSplit$default2.get(0) + i + "." + listSplit$default2.get(1));
                                }
                            } else if (Intrinsics.g(listSplit$default2.get(0), "0") || Intrinsics.g(listSplit$default2.get(0), CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS) || ((CharSequence) listSplit$default2.get(0)).length() == 0) {
                                ytwVar.setValue(String.valueOf(i));
                            } else if (ytwVar.getValue().length() <= 11) {
                                Object obj2 = listSplit$default2.get(0);
                                StringBuilder sb = new StringBuilder();
                                sb.append(obj2);
                                sb.append(i);
                                ytwVar.setValue(sb.toString());
                            }
                        }
                    }
                } else if (i == 10) {
                    if (ytwVar.getValue().length() == 0 || StringsKt.M(ytwVar.getValue(), ".", false)) {
                        return Unit.a;
                    }
                    ytwVar2.setValue(Boolean.TRUE);
                    ytwVar.setValue(((Object) ytwVar.getValue()) + ".");
                } else if (i == 11) {
                    if (ytwVar.getValue().toString().length() <= 7) {
                        if (ytwVar2.getValue().booleanValue()) {
                            List listSplit$default3 = StringsKt__StringsKt.split$default(ytwVar.getValue().toString(), new String[]{"."}, false, 0, 6, null);
                            if (listSplit$default3.size() == 2 && ((String) listSplit$default3.get(1)).length() > 0) {
                                return Unit.a;
                            }
                            ytwVar.setValue(((Object) ytwVar.getValue()) + CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                        } else {
                            List listSplit$default4 = StringsKt__StringsKt.split$default(ytwVar.getValue().toString(), new String[]{"."}, false, 0, 6, null);
                            if (ytwVar.getValue().length() == 0 || Intrinsics.g(ytwVar.getValue(), "0")) {
                                ytwVar.setValue("0");
                            }
                            if (Intrinsics.g(listSplit$default4.get(0), "0") || Intrinsics.g(listSplit$default4.get(0), CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS) || ((CharSequence) listSplit$default4.get(0)).length() == 0) {
                                ytwVar.setValue(ytwVar.getValue());
                            } else if (ytwVar.getValue().toString().length() <= 11) {
                                ytwVar.setValue(listSplit$default4.get(0) + CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                            }
                        }
                    }
                } else if (i == 12) {
                    Double dH = b.h(ytwVar.getValue());
                    if (dH != null) {
                        try {
                            str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH.doubleValue());
                            str.getClass();
                        } catch (Exception unused) {
                            str = "0.00";
                        }
                    } else {
                        str = "0.0";
                    }
                    if (new Character(wae0.I(str)).equals(".")) {
                        ytwVar2.setValue(Boolean.FALSE);
                    }
                    StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
                    if (ytwVar.getValue().length() >= 1) {
                        ytwVar.setValue(wue.e(ytwVar.getValue(), String.valueOf(wae0.I(ytwVar.getValue()))));
                    }
                } else if (i == 13) {
                    ytwVar.setValue("");
                    ytwVar2.setValue(Boolean.FALSE);
                }
                double d = this.f;
                if (i == 14) {
                    Integer intOrNull = StringsKt.toIntOrNull(StringsKt.o0(ytwVar.getValue().toString(), "."));
                    double d2 = this.e;
                    if (intOrNull == null) {
                        ytwVar.setValue(String.valueOf(d2));
                    } else {
                        Double dH2 = b.h(ytwVar.getValue());
                        if ((dH2 != null ? dH2.doubleValue() : 0.0d) < d2) {
                            ytwVar.setValue(String.valueOf(d2));
                        } else {
                            ytwVar.getValue();
                            Double dH3 = b.h(ytwVar.getValue());
                            if ((dH3 != null ? dH3.doubleValue() : 0.0d) > d) {
                                try {
                                    str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d);
                                    str3.getClass();
                                } catch (Exception unused2) {
                                    str3 = "0.00";
                                }
                                ytwVar.setValue(str3);
                            }
                        }
                    }
                }
                if (i == 15 && !this.i) {
                    try {
                        str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(this.v);
                        str2.getClass();
                    } catch (Exception unused3) {
                        str2 = "0.00";
                    }
                    ytwVar.setValue(str2);
                }
                Double dH4 = b.h(ytwVar.getValue());
                if ((dH4 != null ? dH4.doubleValue() : 0.0d) > d) {
                    try {
                        String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d);
                        str5.getClass();
                        str4 = str5;
                    } catch (Exception unused4) {
                    }
                    ytwVar.setValue(str4);
                }
            }
        }
        return Unit.a;
    }
}
