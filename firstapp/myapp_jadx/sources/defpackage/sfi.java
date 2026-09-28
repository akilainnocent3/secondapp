package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class sfi {
    public static jci a(int i, int i2) {
        Object[] objArr = {String.valueOf(i), String.valueOf(i2)};
        StringUiText stringUiText = vch0.a;
        return new jci(new ResourceUiText(R.string.component_wap_share_bet__flex_your_bet_vmintowin_of_vsize, ay0.S(objArr)));
    }

    public static zki b(String str, String str2, String str3, String str4, String str5, float f, sji sjiVar) {
        if (!StringsKt.N(str5, 'H')) {
            ib5.a("Expected resultSequence to contain 'H', but it did not.");
            return null;
        }
        String str6 = (String) StringsKt.f0(str5, new char[]{'H'}).get(0);
        int i = 0;
        for (int i2 = 0; i2 < str6.length(); i2++) {
            if (str6.charAt(i2) == 'A') {
                i++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < str6.length(); i4++) {
            if (str6.charAt(i4) == 'B') {
                i3++;
            }
        }
        List listC = c(str6, zji.b.a);
        String str7 = (String) StringsKt.f0(str5, new char[]{'H'}).get(1);
        int i5 = 0;
        for (int i6 = 0; i6 < str7.length(); i6++) {
            if (str7.charAt(i6) == 'A') {
                i5++;
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < str7.length(); i8++) {
            if (str7.charAt(i8) == 'B') {
                i7++;
            }
        }
        List listC2 = c(str7, zji.b.b);
        bli bliVar = new bli(str, str2, String.valueOf(i), String.valueOf(i + i5));
        bli bliVar2 = new bli(str3, str4, String.valueOf(i3), String.valueOf(i3 + i7));
        ngs ngsVarB = a.b();
        sji sjiVar2 = sji.KICK_OFF_LOGO;
        ngsVarB.add(new fki(a4h.b(ay0.v(new String[]{"lottie/football_base.lottie", "lottie/football_kick_off_ball.lottie", sjiVar != null ? sjiVar.a : null}))));
        ngsVarB.addAll(listC);
        ngsVarB.add(new vki(vki.a.a));
        ngsVarB.addAll(listC2);
        ngsVarB.add(new vki(vki.a.b));
        return new zki(bliVar, bliVar2, f, a4h.b(a.a(ngsVarB)));
    }

    public static List c(String str, zji.b bVar) {
        String str2;
        String strA = fu5.a("[^AB]", str, "");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strA.length(); i++) {
            char cCharAt = strA.charAt(i);
            zji zjiVar = null;
            Boolean bool = cCharAt != 'A' ? cCharAt != 'B' ? null : Boolean.FALSE : Boolean.TRUE;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                zji.a aVar = zBooleanValue ? zji.a.a : zji.a.b;
                if (zBooleanValue) {
                    sji sjiVar = sji.KICK_OFF_LOGO;
                    str2 = "lottie/football_home_goal.lottie";
                } else {
                    sji sjiVar2 = sji.KICK_OFF_LOGO;
                    str2 = "lottie/football_away_goal.lottie";
                }
                zjiVar = new zji(str2, bVar, aVar, zji.c.a);
            }
            if (zjiVar != null) {
                arrayList.add(zjiVar);
            }
        }
        if (arrayList.size() >= 2) {
            return arrayList;
        }
        if (arrayList.isEmpty()) {
            sji sjiVar3 = sji.KICK_OFF_LOGO;
            zji.a aVar2 = zji.a.a;
            zji.c cVar = zji.c.b;
            return b.k(new zji("lottie/football_home_no_goal.lottie", bVar, aVar2, cVar), new zji("lottie/football_away_no_goal.lottie", bVar, zji.a.b, cVar));
        }
        zji.a aVar3 = ((zji) CollectionsKt.T(arrayList)).c;
        zji.a aVar4 = zji.a.a;
        if (aVar3 == aVar4) {
            sji sjiVar4 = sji.KICK_OFF_LOGO;
            return CollectionsKt.j0(arrayList, new zji("lottie/football_away_no_goal.lottie", bVar, zji.a.b, zji.c.b));
        }
        sji sjiVar5 = sji.KICK_OFF_LOGO;
        return CollectionsKt.i0(arrayList, a.c(new zji("lottie/football_home_no_goal.lottie", bVar, aVar4, zji.c.b)));
    }

    public static ResourceUiText d(Set set, Set set2) {
        set.getClass();
        int i = set2.equals(set) ? R.string.common_functions__collapse_all : R.string.common_functions__expand_all;
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(i);
    }

    public static ResourceUiText e(zta0.a aVar, boolean z) {
        aVar.getClass();
        if (!z) {
            return null;
        }
        if (aVar.equals(zta0.a.C1422a.a)) {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.page_instant_virtual__speed_controller_normal);
        }
        StringUiText stringUiText2 = vch0.a;
        return new ResourceUiText(R.string.page_instant_virtual__speed_controller_turbo_2);
    }

    public static String f(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        return bjb0.L(s5y.a(bigDecimal), Locale.US);
    }

    public static String g(BigDecimal bigDecimal, String str) {
        str.getClass();
        bigDecimal.getClass();
        return str.concat(f(bigDecimal));
    }
}
