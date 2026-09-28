package defpackage;

import android.accounts.Account;
import android.database.Cursor;
import android.util.Base64;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ww6 implements tit, fq60.a {
    @Override // defpackage.tit
    public void w(Account account, boolean z) {
        int i = ChallengeActivity.e;
    }

    @Override // fq60.a
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            byte[] bArrDecode = null;
            if (string == null) {
                bmy.a(UccrWswQGaIj.gyExUuDekUR);
                return null;
            }
            kw20 kw20VarB = nw20.b(cursor.getInt(2));
            String string2 = cursor.getString(3);
            if (string2 != null) {
                bArrDecode = Base64.decode(string2, 0);
            }
            arrayList.add(new ml1(string, bArrDecode, kw20VarB));
        }
        return arrayList;
    }
}
