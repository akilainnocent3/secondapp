package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.UserData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xvj implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ xvj(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String patronId;
        switch (this.a) {
            case 0:
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
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return Unit.a;
            case 1:
                x8y x8yVar = (x8y) obj;
                x8yVar.getClass();
                return x8yVar.k;
            case 2:
                ((String) obj).getClass();
                return Unit.a;
            default:
                tcf tcfVar = (tcf) obj;
                tcfVar.getClass();
                Paint paint = new Paint();
                paint.setColor(r58.l(j58.c(0.15f, r58.d(4278255555L))));
                paint.setAntiAlias(true);
                paint.setMaskFilter(new BlurMaskFilter(tcfVar.C1(40.0f), BlurMaskFilter.Blur.OUTER));
                i40.c(tcfVar.F1().a()).drawRoundRect(0.0f, 0.0f, Float.intBitsToFloat((int) (tcfVar.d() >> 32)), Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)), tcfVar.C1(8.0f), tcfVar.C1(8.0f), paint);
                return Unit.a;
        }
    }
}
