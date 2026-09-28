package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class p67 {
    public static final ChannelAsset a(List<PaymentChannel> list) {
        int i;
        list.getClass();
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        for (PaymentChannel paymentChannel : list) {
            if (paymentChannel.isSupportMobileMoneyDeposit() && paymentChannel.isSupportMobileMoneyWithdraw()) {
                i = 0;
            } else if (paymentChannel.isSupportMobileMoneyDeposit()) {
                i = 1;
            } else {
                i = paymentChannel.isSupportMobileMoneyWithdraw() ? 2 : -1;
            }
            arrayList.add(new ChannelAsset.Channel(paymentChannel.getChannelShowName(), 1, i, paymentChannel.getChannelIconUrl(), paymentChannel.getChannelSendName(), paymentChannel.getPayChId(), paymentChannel.getChannelIconResId(), paymentChannel.isSupportPaybill(), null, null, 768, null));
        }
        return new ChannelAsset(arrayList, list.size());
    }
}
