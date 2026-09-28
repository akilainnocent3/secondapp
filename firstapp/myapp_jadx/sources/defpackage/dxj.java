package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.UserData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class dxj implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String patronId;
        String strP = (String) obj;
        strP.getClass();
        if (strP.length() == 0) {
            return Unit.a;
        }
        try {
            String str = "";
            if (StringsKt.M(strP, "user-name:", false)) {
                strP = c.p(strP, "user-name:", "", false);
            }
            UserData userData = (UserData) new eal().e(strP, UserData.class);
            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
            if (userData != null && (patronId = userData.getPatronId()) != null) {
                str = patronId;
            }
            sportyGamesManager.setPatronId(str);
            SportyGamesManager.getInstance().setUserId(userData != null ? String.valueOf(userData.getId()) : null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.a;
    }
}
