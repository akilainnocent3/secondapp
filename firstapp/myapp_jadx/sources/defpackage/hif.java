package defpackage;

import com.sporty.android.core.model.pocket.common.BankAsset;
import com.sportybet.feature.winning.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hif implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ hif(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                BankAsset bankAsset = (BankAsset) obj;
                int i = sif.k1;
                bankAsset.getClass();
                List<BankAsset.EntityListBean> list = bankAsset.entityList;
                list.getClass();
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                for (BankAsset.EntityListBean entityListBean : list) {
                    entityListBean.getClass();
                    arrayList.add(kw1.b(entityListBean));
                }
                return arrayList;
            default:
                return ((a) obj).a;
        }
    }
}
