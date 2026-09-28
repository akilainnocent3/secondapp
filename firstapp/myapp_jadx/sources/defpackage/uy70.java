package defpackage;

import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.chat.remote.models.RainClaimInfoResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingStateChat;
import com.sportygames.sportyherov2.remote.models.RainTopicResponse;
import java.util.HashMap;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class uy70 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uy70(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RainClaimInfoResponse rainClaimInfoResponse;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj2).invoke(new ot70.d(str));
                return Unit.a;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                LoadingStateChat loadingStateChat = (LoadingStateChat) obj;
                int i2 = q1c0.b.b[loadingStateChat.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingStateChat.getData();
                    if (hTTPResponse != null && (rainClaimInfoResponse = (RainClaimInfoResponse) hTTPResponse.getData()) != null) {
                        if (Intrinsics.g(rainClaimInfoResponse.getClaimCountLimit(), rainClaimInfoResponse.getClaimCount())) {
                            q1c0Var.B1();
                            tv30[] tv30VarArr = tv30.a;
                            q1c0Var.o3("active", true);
                        } else {
                            RainTopicResponse rainTopicResponse = q1c0Var.e0;
                            if (rainTopicResponse != null) {
                                w3c0 w3c0Var = (w3c0) q1c0Var.b;
                                if (w3c0Var != null) {
                                    w3c0Var.g0.e.setVisibility(8);
                                }
                                w3c0 w3c0Var2 = (w3c0) q1c0Var.b;
                                if (w3c0Var2 != null) {
                                    w3c0Var2.g0.b.setVisibility(0);
                                }
                                w3c0 w3c0Var3 = (w3c0) q1c0Var.b;
                                if (w3c0Var3 != null) {
                                    w3c0Var3.g0.d.setVisibility(0);
                                }
                                w3c0 w3c0Var4 = (w3c0) q1c0Var.b;
                                if (w3c0Var4 != null) {
                                    w3c0Var4.g0.c.setVisibility(0);
                                }
                                w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                                if (w3c0Var5 != null) {
                                    TextView textView = w3c0Var5.g0.b;
                                    HashMap map = new HashMap();
                                    String strP1 = q1c0Var.p1(R.string.currencySymbol);
                                    op5 op5Var = op5.a;
                                    String str2 = q1c0Var.M0;
                                    op5Var.getClass();
                                    String upperCase = op5.i(str2).toUpperCase(Locale.ROOT);
                                    upperCase.getClass();
                                    map.put(strP1, "<b><font color=\"#ffc820\">" + upperCase + "</font></b>");
                                    String strP2 = q1c0Var.p1(R.string.totalFreeBetValue);
                                    TreeMap treeMap = pw.a;
                                    Double totalFreeBetValue = rainTopicResponse.getTotalFreeBetValue();
                                    String strB = pw.b(totalFreeBetValue != null ? String.valueOf(totalFreeBetValue.doubleValue()) : null);
                                    map.put(strP2, "<b><font color=\"#ffc820\">" + (strB != null ? strB : "") + "</font></b>");
                                    xn80.b(textView, op5.b(q1c0Var.p1(R.string.cms_rain_started_text), q1c0Var.p1(R.string.default_rain_started_text), map));
                                }
                                w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                                if (w3c0Var6 != null) {
                                    TextView textView2 = w3c0Var6.g0.c;
                                    op5 op5Var2 = op5.a;
                                    String strP3 = q1c0Var.p1(R.string.cms_claim_now);
                                    String strP4 = q1c0Var.p1(R.string.default_claim_now);
                                    op5Var2.getClass();
                                    xn80.b(textView2, "<font color=\"#1A1A1A\">" + op5.b(strP3, strP4, null) + "</font>");
                                }
                                ej5.c(ebs.a(q1c0Var.getLifecycle()), null, null, new j3c0(q1c0Var, null), 3);
                                w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                                if (w3c0Var7 != null) {
                                    gr60.a(w3c0Var7.g0.d, new r180(q1c0Var, 1));
                                }
                                tv30[] tv30VarArr2 = tv30.a;
                                q1c0Var.o3("active", true);
                            }
                        }
                    }
                } else if (i2 == 2) {
                    q1c0Var.B1();
                    q1c0Var.o3("", false);
                } else if (i2 != 3) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
        }
    }
}
