package defpackage;

import android.util.Base64;
import android.view.View;
import com.sportybet.android.cashoutphase3.b;
import com.sportygames.pocketrocket.model.response.RecentRoundMultiplier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mj6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mj6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                View view = (View) obj;
                view.getClass();
                if (Intrinsics.g(bVar.s0().m0.a.getValue(), Boolean.TRUE) && view.getVisibility() == 0) {
                    qry.a(view, new dl6(view, bVar, view));
                }
                break;
            case 1:
                a920 a920Var = (a920) obj2;
                Object objE = new eal().e(x54.a(Base64.decode((String) obj, 0)), RecentRoundMultiplier.class);
                objE.getClass();
                RecentRoundMultiplier.Coefficients data = ((RecentRoundMultiplier) objE).getData();
                if (data != null) {
                    zh40 zh40Var = a920Var.f;
                    if (zh40Var != null) {
                        zh40Var.a.add(0, data);
                        zh40Var.notifyDataSetChanged();
                    } else {
                        a920Var.i.add(0, data);
                        a920Var.c(a920Var.i);
                    }
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((ij60) obj2).d(str);
                break;
        }
        return Unit.a;
    }
}
