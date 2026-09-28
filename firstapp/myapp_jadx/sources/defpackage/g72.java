package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.core.model.MyLog;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g72 implements Function1 {
    public final /* synthetic */ m480 a;

    public /* synthetic */ g72(m480 m480Var) {
        this.a = m480Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
        bc6 bc6Var = ((m480.f) this.a).a;
        if (bc6Var.p() instanceof bzx) {
            zi50.a aVar = zi50.b;
            bc6Var.resumeWith(alertDialogCallbackType);
        } else {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_COMMON);
            aVar2.n(vZBMKENANSz.ZWHlNYmjatf, new Object[0]);
        }
        return Unit.a;
    }
}
