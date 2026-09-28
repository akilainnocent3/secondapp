package defpackage;

import com.sportygames.commons.models.enums.PagingFetchType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class uw10 implements Function2 {
    public final /* synthetic */ zy10 a;

    public /* synthetic */ uw10(zy10 zy10Var) {
        this.a = zy10Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        au2 au2VarU0 = this.a.U0();
        PagingFetchType pagingFetchType = PagingFetchType.ARCHIVE_MORE;
        pagingFetchType.getClass();
        ej5.c(o8i0.d(au2VarU0), null, null, new pt2(au2VarU0, pagingFetchType, iIntValue, iIntValue2, null), 3);
        return Unit.a;
    }
}
