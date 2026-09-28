package defpackage;

import com.sportygames.common.business.CommonGameDetails;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uvg implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        num.intValue();
        CommonGameDetails commonGameDetails = (CommonGameDetails) obj2;
        commonGameDetails.getClass();
        Integer id = commonGameDetails.getId();
        return id == null ? num : id;
    }
}
