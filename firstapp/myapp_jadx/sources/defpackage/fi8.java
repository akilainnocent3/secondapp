package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class fi8 implements Function1<AlertDialogCallbackType, Unit> {
    public final /* synthetic */ bc6 a;

    public fi8(bc6 bc6Var) {
        this.a = bc6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AlertDialogCallbackType alertDialogCallbackType) {
        AlertDialogCallbackType alertDialogCallbackType2 = alertDialogCallbackType;
        alertDialogCallbackType2.getClass();
        bc6 bc6Var = this.a;
        if (bc6Var.p() instanceof bzx) {
            zi50.a aVar = zi50.b;
            bc6Var.resumeWith(alertDialogCallbackType2);
        } else {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_COMMON);
            aVar2.n("Continuation not active, resume not perform.", new Object[0]);
        }
        return Unit.a;
    }
}
