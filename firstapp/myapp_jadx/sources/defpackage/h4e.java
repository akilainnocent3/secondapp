package defpackage;

import com.sporty.android.core.model.pocket.common.BankAsset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h4e implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BankAsset bankAsset = (BankAsset) obj;
        bankAsset.getClass();
        List<BankAsset.EntityListBean> list = bankAsset.entityList;
        list.getClass();
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        for (BankAsset.EntityListBean entityListBean : list) {
            entityListBean.getClass();
            arrayList.add(kw1.b(entityListBean));
        }
        return arrayList;
    }
}
