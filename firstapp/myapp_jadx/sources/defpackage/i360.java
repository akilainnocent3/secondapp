package defpackage;

import android.widget.TextView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i360 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i360(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strValueOf;
        CharSequence text;
        String strValueOf2;
        CharSequence text2;
        String string;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                l560 l560Var = (l560) obj2;
                int iIntValue = ((Integer) obj).intValue();
                int i2 = l560Var.B;
                eo80 eo80Var = l560Var.l0;
                String string2 = null;
                strSubstring = null;
                strSubstring = null;
                String strSubstring = null;
                string2 = null;
                String str = "0.00";
                if (i2 == 2) {
                    if (eo80Var != null && (text2 = eo80Var.C0.getText()) != null && (string = text2.toString()) != null) {
                        eo80 eo80Var2 = l560Var.l0;
                        strSubstring = string.substring(0, String.valueOf(eo80Var2 != null ? eo80Var2.C0.getText() : null).length() - 1);
                    }
                    if (strSubstring == null || strSubstring.length() == 0) {
                        strValueOf2 = String.valueOf(iIntValue);
                    } else if (StringsKt.M(strSubstring, ".", false)) {
                        List listSplit$default = StringsKt__StringsKt.split$default(strSubstring, new String[]{"."}, false, 0, 6, null);
                        if (listSplit$default.size() != 2) {
                            strValueOf2 = listSplit$default.get(0) + "." + iIntValue;
                        } else if (((String) listSplit$default.get(1)).length() < 2) {
                            strValueOf2 = listSplit$default.get(0) + "." + listSplit$default.get(1) + iIntValue;
                        } else {
                            strValueOf2 = listSplit$default.get(0) + "." + listSplit$default.get(1);
                        }
                    } else if (Double.parseDouble(strSubstring) != 0.0d || iIntValue != 0) {
                        strValueOf2 = hce0.a(iIntValue, strSubstring);
                    }
                    double d = Double.parseDouble(strValueOf2);
                    double d2 = l560Var.v;
                    eo80 eo80Var3 = l560Var.l0;
                    if (d >= d2) {
                        if (eo80Var3 != null) {
                            TextView textView = eo80Var3.C0;
                            try {
                                String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d2);
                                str2.getClass();
                                str = str2;
                            } catch (Exception unused) {
                            }
                            textView.setText(str.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
                        }
                    } else if (eo80Var3 != null) {
                        r97.a(eo80Var3.C0, strValueOf2, AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X);
                    }
                } else {
                    if (eo80Var != null && (text = eo80Var.r0.getText()) != null) {
                        string2 = text.toString();
                    }
                    if (string2 == null || string2.length() == 0) {
                        strValueOf = String.valueOf(iIntValue);
                    } else if (StringsKt.M(string2, ".", false)) {
                        List listSplit$default2 = StringsKt__StringsKt.split$default(string2, new String[]{"."}, false, 0, 6, null);
                        if (listSplit$default2.size() != 2) {
                            strValueOf = listSplit$default2.get(0) + "." + iIntValue;
                        } else if (((String) listSplit$default2.get(1)).length() < 2) {
                            strValueOf = listSplit$default2.get(0) + "." + listSplit$default2.get(1) + iIntValue;
                        } else {
                            strValueOf = listSplit$default2.get(0) + "." + listSplit$default2.get(1);
                        }
                    } else if (Double.parseDouble(string2) != 0.0d || iIntValue != 0) {
                        strValueOf = hce0.a(iIntValue, string2);
                    }
                    double d3 = Double.parseDouble(strValueOf);
                    double d4 = l560Var.f;
                    eo80 eo80Var4 = l560Var.l0;
                    if (d3 >= d4) {
                        if (eo80Var4 != null) {
                            TextView textView2 = eo80Var4.r0;
                            try {
                                String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d4);
                                str3.getClass();
                                str = str3;
                            } catch (Exception unused2) {
                            }
                            textView2.setText(str);
                        }
                    } else if (eo80Var4 != null) {
                        eo80Var4.r0.setText(strValueOf);
                    }
                }
                break;
            default:
                ((goa0) obj2).c.j("multiplier_error");
                break;
        }
        return Unit.a;
    }
}
