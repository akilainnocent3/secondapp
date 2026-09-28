package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xjj0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AssetData assetData = (AssetData) obj;
        int i = akj0.O0;
        assetData.getClass();
        List<AssetData.AccountsBean> accounts = assetData.getAccounts();
        return accounts == null ? m2g.a : accounts;
    }
}
