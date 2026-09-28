package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class di7 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AssetData assetData = (AssetData) obj2;
        ((ut60) obj).getClass();
        assetData.getClass();
        List<AssetData.AccountsBean> accounts = assetData.getAccounts();
        if (accounts == null || accounts.isEmpty()) {
            return a.c(vt60.c);
        }
        Object obj3 = ut60.b.a;
        if (obj3.equals(obj3)) {
            vt60.a.getClass();
            return vt60.b;
        }
        uhc.a();
        return null;
    }
}
