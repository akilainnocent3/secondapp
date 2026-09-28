package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import com.sporty.android.core.model.pocket.common.BankAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kw1 {
    public static final jw1 a(AssetData.AccountsBean accountsBean) {
        accountsBean.getClass();
        return new jw1(accountsBean.getBankId(), accountsBean.getBankCode(), accountsBean.getBankName(), accountsBean.getBankIconUrl(), Intrinsics.g(accountsBean.isDisabled(), Boolean.TRUE), false, Boolean.FALSE, null, false, false, null, 1824);
    }

    public static final jw1 b(BankAsset.EntityListBean entityListBean) {
        return new jw1(entityListBean.bankId, entityListBean.bankCode, entityListBean.bankName, entityListBean.bankIconUrl, false, Intrinsics.g(entityListBean.easyBankAccount, Boolean.TRUE), entityListBean.ranked, Integer.valueOf(entityListBean.rank), false, false, null, 1808);
    }
}
