package defpackage;

import androidx.compose.runtime.a;
import com.sportygames.commons.models.enums.PagingFetchType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cla implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cla(wkg wkgVar, int i) {
        this.a = 1;
        this.b = wkgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                op8 op8Var = (op8) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    op8Var.invoke(aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                qit.a((wkg) obj3, (a) obj, qj40.a(1));
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                int iIntValue3 = ((Integer) obj2).intValue();
                du2 du2VarU0 = ((a1b0) obj3).u0();
                PagingFetchType pagingFetchType = PagingFetchType.ARCHIVE_MORE;
                pagingFetchType.getClass();
                ej5.c(o8i0.d(du2VarU0), null, null, new st2(du2VarU0, pagingFetchType, iIntValue2, iIntValue3, null), 3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cla(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
