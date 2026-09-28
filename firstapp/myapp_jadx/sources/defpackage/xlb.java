package defpackage;

import com.sportygames.commons.models.enums.PagingFetchType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xlb implements Function2 {
    public final /* synthetic */ enb a;

    public /* synthetic */ xlb(enb enbVar) {
        this.a = enbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        yt2 yt2VarQ0 = this.a.q0();
        PagingFetchType pagingFetchType = PagingFetchType.ARCHIVE_MORE;
        yt2VarQ0.getClass();
        pagingFetchType.getClass();
        ej5.c(o8i0.d(yt2VarQ0), null, null, new mt2(yt2VarQ0, pagingFetchType, iIntValue, iIntValue2, null), 3);
        return Unit.a;
    }
}
