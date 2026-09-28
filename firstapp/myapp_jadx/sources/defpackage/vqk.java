package defpackage;

import android.os.Parcelable;
import com.sporty.android.core.model.gift.GiftUsablePushData;
import com.sportybet.core.domain.model.ApplicableCategoryIds;
import com.sportybet.feature.gift.giftreceived.domain.model.ReceivedGift;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class vqk {
    public final uqk a;

    public vqk(uqk uqkVar) {
        this.a = uqkVar;
    }

    public final ReceivedGift a(GiftUsablePushData giftUsablePushData) {
        awk awkVar;
        String currency = giftUsablePushData.getCurrency();
        if (currency == null) {
            currency = this.a.a.b();
        }
        String strE = s5y.e(Long.valueOf(giftUsablePushData.getAmount()));
        Integer numValueOf = Integer.valueOf(giftUsablePushData.getKind());
        awk awkVar2 = awk.None;
        awk[] awkVarArrValues = awk.values();
        int length = awkVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                awkVar = null;
                break;
            }
            awkVar = awkVarArrValues[i];
            if (Integer.valueOf(awkVar.a).equals(numValueOf)) {
                break;
            }
            i++;
        }
        if (awkVar != null) {
            awkVar2 = awkVar;
        }
        List<Integer> bizTypeScope = giftUsablePushData.getBizTypeScope();
        Parcelable.Creator<ApplicableCategoryIds> creator = ApplicableCategoryIds.CREATOR;
        bizTypeScope.getClass();
        return new ReceivedGift(currency, strE, awkVar2, bizTypeScope);
    }
}
