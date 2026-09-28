package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class coe0 {
    public static final aoe0.a a(jw1 jw1Var, Integer num) {
        jw1Var.getClass();
        int i = jw1Var.a;
        return new aoe0.a(i, jw1Var.c, jw1Var.d, jw1Var.g, jw1Var.h, num != null && i == num.intValue(), false, jw1Var.j, jw1Var.k);
    }

    public static final aoe0.b b(AssetData.AccountsBean accountsBean, AssetData.AccountsBean accountsBean2) {
        Object next;
        accountsBean.getClass();
        Integer numValueOf = Integer.valueOf(accountsBean.getId());
        String bankName = accountsBean.getBankName();
        String bankIconUrl = accountsBean.getBankIconUrl();
        String accountNumber = accountsBean.getAccountNumber();
        String accountName = accountsBean.getAccountName();
        boolean z = false;
        if (accountsBean2 != null && accountsBean.getId() == accountsBean2.getId()) {
            z = true;
        }
        Boolean boolIsDefault = accountsBean.isDefault();
        Boolean bool = Boolean.TRUE;
        boolean zG = Intrinsics.g(boolIsDefault, bool);
        boolean zG2 = Intrinsics.g(accountsBean.isDisabled(), bool);
        aoe0.b.a.C0082a c0082a = aoe0.b.a.b;
        Integer status = accountsBean.getStatus();
        c0082a.getClass();
        Iterator<T> it = aoe0.b.a.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i = ((aoe0.b.a) next).a;
            if (status != null && i == status.intValue()) {
                break;
            }
        }
        aoe0.b.a aVar = (aoe0.b.a) next;
        if ((64 & 16) != 0) {
            accountName = null;
        }
        return new aoe0.b(numValueOf, bankName, bankIconUrl, accountNumber, accountName, z, false, zG, zG2, (64 & 512) == 0 ? aVar : null);
    }

    public static final aoe0.h c(ChannelAsset.Channel channel, String str) {
        channel.getClass();
        if (channel.getChannelSendName() == null) {
            return null;
        }
        String channelSendName = channel.getChannelSendName();
        if (channelSendName == null) {
            channelSendName = "";
        }
        return new aoe0.h(channelSendName, channel.getChannelShowName(), channel.getChannelIconUrl(), Intrinsics.g(channel.getChannelSendName(), str), false);
    }
}
