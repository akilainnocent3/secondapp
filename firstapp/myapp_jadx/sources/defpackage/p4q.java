package defpackage;

import androidx.compose.runtime.a;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p4q implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p4q(o4q o4qVar, int i) {
        this.a = 0;
        this.b = o4qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                q4q.a((o4q) obj3, (a) obj, qj40.a(1));
                break;
            case 1:
                Function1 function1 = (Function1) obj3;
                zrd0 zrd0Var = (zrd0) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                zrd0Var.getClass();
                function1.invoke(new b.y.c(zrd0Var, zBooleanValue));
                function1.invoke(b.z.a.a);
                break;
            default:
                final fpb0 fpb0Var = (fpb0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    scv.b(null, null, null, pp8.b(-720407665, new Function2() { // from class: dpb0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            xqb0 xqb0Var;
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                fpb0 fpb0Var2 = fpb0Var;
                                uqb0 uqb0Var = fpb0Var2.h;
                                Fragment fragment = fpb0Var2.a;
                                ytw ytwVarB = n95.b(uqb0Var.b, aVar2);
                                ytw<String> ytwVar = fpb0Var2.i;
                                ytw<String> ytwVar2 = fpb0Var2.j;
                                ytw<String> ytwVar3 = fpb0Var2.k;
                                ytw<String> ytwVar4 = fpb0Var2.l;
                                twd0<Boolean> twd0Var = gci0.h;
                                xqb0 xqb0Var2 = (xqb0) ytwVarB.getValue();
                                String str = (String) ((x5a0) ytwVar).getValue();
                                String str2 = (String) ((x5a0) ytwVar2).getValue();
                                String str3 = (String) ((x5a0) ytwVar3).getValue();
                                String str4 = (String) ((x5a0) ytwVar4).getValue();
                                op5 op5Var = op5.a;
                                String string = fragment.getString(R.string.no_bets);
                                string.getClass();
                                op5Var.getClass();
                                String strB = op5.b(string, "No bets have been placed yet", null);
                                String string2 = fragment.getString(R.string.round_id_cms_tournament);
                                string2.getClass();
                                String strB2 = op5.b(string2, "Round ID", null);
                                String string3 = fragment.getString(R.string.name_cms);
                                string3.getClass();
                                String strB3 = op5.b(string3, "Name", null);
                                String string4 = fragment.getString(R.string.bet_text_small);
                                string4.getClass();
                                String strB4 = op5.b(string4, "Bet", null);
                                try {
                                    if (strB4.length() == 0) {
                                        xqb0Var = xqb0Var2;
                                    } else {
                                        String strSubstring = strB4.substring(0, 1);
                                        Locale locale = Locale.ROOT;
                                        String upperCase = strSubstring.toUpperCase(locale);
                                        upperCase.getClass();
                                        xqb0Var = xqb0Var2;
                                        try {
                                            String lowerCase = strB4.substring(1).toLowerCase(locale);
                                            lowerCase.getClass();
                                            strB4 = upperCase.concat(lowerCase);
                                        } catch (Exception unused) {
                                        }
                                    }
                                } catch (Exception unused2) {
                                }
                                String string5 = fragment.getString(R.string.coeff_cms);
                                string5.getClass();
                                String strB5 = op5.b(string5, "Coeff", null);
                                String string6 = fragment.getString(R.string.win_cms);
                                string6.getClass();
                                String strB6 = op5.b(string6, "Win", null);
                                String string7 = fragment.getString(R.string.your_highest_coefficient);
                                string7.getClass();
                                String strB7 = op5.b(string7, "YOUR HIGHEST CO-EFFICIENT", null);
                                boolean zA = aVar2.A(fpb0Var2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new gh70(fpb0Var2, 1);
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zA2 = aVar2.A(fpb0Var2);
                                String str5 = strB4;
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new jib(fpb0Var2, 2);
                                    aVar2.r(objY2);
                                }
                                Function0 function2 = (Function0) objY2;
                                boolean zA3 = aVar2.A(fpb0Var2);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    objY3 = new z5g(fpb0Var2, 1);
                                    aVar2.r(objY3);
                                }
                                Function0 function3 = (Function0) objY3;
                                boolean zA4 = aVar2.A(fpb0Var2);
                                Object objY4 = aVar2.y();
                                if (zA4 || objY4 == c0042a) {
                                    objY4 = new l5g(fpb0Var2, 2);
                                    aVar2.r(objY4);
                                }
                                Function0 function4 = (Function0) objY4;
                                boolean zA5 = aVar2.A(fpb0Var2);
                                Object objY5 = aVar2.y();
                                if (zA5 || objY5 == c0042a) {
                                    objY5 = new kuk(fpb0Var2, 1);
                                    aVar2.r(objY5);
                                }
                                Function1 function5 = (Function1) ((chp) objY5);
                                boolean zBooleanValue2 = ((Boolean) ((x5a0) fpb0Var2.m).getValue()).booleanValue();
                                Boolean bool = (Boolean) ((x5a0) twd0Var).getValue();
                                lqb0.j(xqb0Var, str, str2, str3, str4, strB, strB2, strB3, str5, strB5, strB6, strB7, function0, function2, function3, function4, function5, zBooleanValue2, bool != null ? bool.booleanValue() : false, op5.i((String) fpb0Var2.d.invoke()), aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 3072, 7);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ p4q(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
