package defpackage;

import android.content.Context;
import androidx.fragment.app.e;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.b;
import com.sportygames.common.business.CommonGameDetails;
import com.sportygames.common.business.CommonLobbyMetaInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ik4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ik4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                mk4 mk4Var = (mk4) obj2;
                zo20 zo20Var = (zo20) obj;
                zo20Var.getClass();
                Integer num = zo20Var.a;
                String str = zo20Var.b;
                String str2 = zo20Var.c;
                String str3 = zo20Var.d;
                String str4 = zo20Var.e;
                String str5 = zo20Var.f;
                Boolean bool = zo20Var.g;
                String str6 = zo20Var.h;
                String str7 = zo20Var.i;
                List list = zo20Var.j;
                if (list == null) {
                    list = m2g.a;
                }
                CommonGameDetails commonGameDetails = new CommonGameDetails(num, null, null, str, str2, str3, null, str4, str5, bool, str6, str7, list, zo20Var.k, zo20Var.l, zo20Var.m, new CommonLobbyMetaInfo(null, zo20Var.n, zo20Var.o, zo20Var.p, null, null, null, zo20Var.q, zo20Var.r, zo20Var.s, 113, null), null, null, null, null, false, false, null, 16646214, null);
                f3 f3Var = (f3) mk4Var.a.getValue();
                Context contextRequireContext = mk4Var.requireContext();
                contextRequireContext.getClass();
                f3Var.a(commonGameDetails, contextRequireContext, null);
                e activity = mk4Var.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                break;
            case 1:
                tjw tjwVar = (tjw) obj2;
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                if (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive) {
                    b.b(tjwVar.e0);
                }
                break;
            default:
                zrd0 zrd0Var = (zrd0) obj;
                zrd0Var.getClass();
                ((Function1) obj2).invoke(new com.sportybet.android.instantwin.presentation.penalty.b.t.d(zrd0Var));
                break;
        }
        return Unit.a;
    }
}
