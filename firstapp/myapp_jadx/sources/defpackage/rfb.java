package defpackage;

import androidx.compose.runtime.a;
import com.sportygames.commons.models.enums.PagingFetchType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rfb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rfb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((fgb) obj4).T0().x1(((Integer) obj).intValue(), ((Integer) obj2).intValue(), PagingFetchType.ARCHIVE_MORE, (String) obj3);
                break;
            default:
                j130 j130Var = (j130) obj4;
                d030 d030Var = (d030) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jz20 jz20Var = j130Var.i;
                    ohp<Object>[] ohpVarArr = d030.S;
                    a230 a230VarS0 = d030Var.s0();
                    boolean zA = aVar.A(a230VarS0);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        m030 m030Var = new m030(1, a230VarS0, a230.class, "handleAction", "handleAction(Lcom/sportybet/feature/profile/model/ProfileAction;)V", 0);
                        aVar.r(m030Var);
                        objY = m030Var;
                    }
                    mz20.a(jz20Var, (Function1) ((chp) objY), aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }
}
