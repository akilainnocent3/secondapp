package com.sportybet.android.account.international.data.model;

import com.sporty.android.core.model.pocket.globalpay.WalletAddressData;
import com.sporty.android.core.model.pocket.globalpay.WalletAddressListData;
import defpackage.l48;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0006*\u00020\u0007¨\u0006\b"}, d2 = {"toDomainModel", "Lcom/sportybet/android/account/international/data/model/WalletAddressDomainModel;", "Lcom/sporty/android/core/model/pocket/globalpay/WalletAddressData;", "isSelected", "", "toDto", "Lcom/sportybet/android/account/international/data/model/WalletAddressListDomainModel;", "Lcom/sporty/android/core/model/pocket/globalpay/WalletAddressListData;", "africa-bet-android"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class WalletAddressDomainModelKt {
    public static final WalletAddressListDomainModel toDomainModel(WalletAddressListData walletAddressListData) {
        walletAddressListData.getClass();
        String currency = walletAddressListData.getCurrency();
        List<WalletAddressData> wallets = walletAddressListData.getWallets();
        ArrayList arrayList = new ArrayList(l48.r(wallets, 10));
        Iterator<T> it = wallets.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomainModel$default((WalletAddressData) it.next(), false, 1, null));
        }
        return new WalletAddressListDomainModel(currency, arrayList);
    }

    public static /* synthetic */ WalletAddressDomainModel toDomainModel$default(WalletAddressData walletAddressData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toDomainModel(walletAddressData, z);
    }

    public static final WalletAddressData toDto(WalletAddressDomainModel walletAddressDomainModel) {
        walletAddressDomainModel.getClass();
        boolean zIsDefault = walletAddressDomainModel.isDefault();
        String code = walletAddressDomainModel.getCode();
        String title = walletAddressDomainModel.getTitle();
        String flag = walletAddressDomainModel.getFlag();
        if (flag == null) {
            flag = "";
        }
        return new WalletAddressData(zIsDefault, code, title, flag, walletAddressDomainModel.getStatus());
    }

    public static final WalletAddressDomainModel toDomainModel(WalletAddressData walletAddressData, boolean z) {
        walletAddressData.getClass();
        return new WalletAddressDomainModel(walletAddressData.getWalletId(), walletAddressData.getWalletAddress(), walletAddressData.isDefault(), walletAddressData.getWalletName(), z, walletAddressData.getStatus());
    }
}
