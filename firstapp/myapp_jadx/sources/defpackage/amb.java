package defpackage;

import com.sportygames.commons.models.GiftItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class amb implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GiftItem giftItem = (GiftItem) obj;
        giftItem.getClass();
        return Boolean.valueOf(giftItem.getCurBal() < 1.0d);
    }
}
