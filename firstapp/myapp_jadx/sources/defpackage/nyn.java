package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingMarketLayout;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class nyn {
    public static final dxn a(NetworkInstantRacingMarketLayout networkInstantRacingMarketLayout) {
        Object obj;
        Object next;
        String str;
        String lowerCase;
        String lowerCase2;
        uag uagVar = oyn.c;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        do {
            obj = null;
            if (!bVarA.hasNext()) {
                next = null;
                break;
            }
            next = bVarA.next();
            String str2 = ((oyn) next).a;
            Locale locale = Locale.ROOT;
            lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            String mode = networkInstantRacingMarketLayout.getMode();
            if (mode != null) {
                lowerCase2 = mode.toLowerCase(locale);
                lowerCase2.getClass();
            } else {
                lowerCase2 = null;
            }
        } while (!lowerCase.equals(lowerCase2));
        oyn oynVar = (oyn) next;
        if (oynVar == null) {
            return null;
        }
        int iOrdinal = oynVar.ordinal();
        if (iOrdinal == 0) {
            return dxn.d.a;
        }
        if (iOrdinal == 1) {
            return dxn.c.a;
        }
        if (iOrdinal == 2) {
            Map<String, String> parameterMap = networkInstantRacingMarketLayout.getParameterMap();
            String str3 = parameterMap != null ? parameterMap.get("guideMarketType") : null;
            str = str3 != null ? str3 : "";
            uag uagVar2 = jzn.f;
            q3.b bVarA2 = ocx.a(uagVar2, uagVar2);
            while (bVarA2.hasNext()) {
                Object next2 = bVarA2.next();
                String str4 = ((jzn) next2).a;
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = str4.toLowerCase(locale2);
                lowerCase3.getClass();
                String lowerCase4 = str.toLowerCase(locale2);
                lowerCase4.getClass();
                if (lowerCase3.equals(lowerCase4)) {
                    obj = next2;
                    break;
                }
            }
            return new dxn.a((jzn) obj);
        }
        if (iOrdinal != 3) {
            uhc.a();
            return null;
        }
        Map<String, String> parameterMap2 = networkInstantRacingMarketLayout.getParameterMap();
        String str5 = parameterMap2 != null ? parameterMap2.get("guideMarketType") : null;
        str = str5 != null ? str5 : "";
        uag uagVar3 = jzn.f;
        q3.b bVarA3 = ocx.a(uagVar3, uagVar3);
        while (bVarA3.hasNext()) {
            Object next3 = bVarA3.next();
            String str6 = ((jzn) next3).a;
            Locale locale3 = Locale.ROOT;
            String lowerCase5 = str6.toLowerCase(locale3);
            lowerCase5.getClass();
            String lowerCase6 = str.toLowerCase(locale3);
            lowerCase6.getClass();
            if (lowerCase5.equals(lowerCase6)) {
                obj = next3;
                break;
            }
        }
        return new dxn.b((jzn) obj);
    }
}
