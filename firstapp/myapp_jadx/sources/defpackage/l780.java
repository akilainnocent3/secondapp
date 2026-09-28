package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.SelectedGiftData;

/* JADX INFO: loaded from: classes7.dex */
public final class l780 {
    public static final SelectedGiftData a(GiftDetails giftDetails, String str, boolean z) {
        str.getClass();
        return new SelectedGiftData(str, giftDetails.getKind(), giftDetails.getGiftId(), bjb0.W(giftDetails.getLeastOrderAmount()), 1, giftDetails, z, true, true, null);
    }
}
