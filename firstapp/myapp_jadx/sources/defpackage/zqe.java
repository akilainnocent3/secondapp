package defpackage;

import com.sportybet.android.basepay.data.CommonConfigRepository;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes6.dex */
public final class zqe extends CommonConfigRepository<List<? extends wqe>> implements xqe {
    @Override // com.sportybet.android.basepay.data.CommonConfigRepository
    public final List<dc8.a> buildParams() {
        return a.c(new dc8.a("pocket", "paych.disable.alert.content"));
    }

    @Override // com.sportybet.android.basepay.data.CommonConfigRepository
    public final List<? extends wqe> convert(Object obj) {
        obj.getClass();
        List list = (List) new eal().f(dc8.f(0, qva.c(new eal().j(obj)).c(), null), new yqe().getType());
        list.getClass();
        return CollectionsKt.R(list);
    }
}
