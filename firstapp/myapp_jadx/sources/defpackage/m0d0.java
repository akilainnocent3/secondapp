package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.instantwin.presentation.penalty.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m0d0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m0d0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                zrd0 zrd0Var = (zrd0) obj;
                String str = (String) obj2;
                zrd0Var.getClass();
                str.getClass();
                ((Function1) obj3).invoke(new b.s.e(zrd0Var, str));
                break;
            default:
                aeh0 aeh0Var = (aeh0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = aVar.A(aeh0Var);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new ryr(aeh0Var, 2);
                        aVar.r(objY);
                    }
                    ceh0.b((Function0) objY, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }
}
