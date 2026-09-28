package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class a8e implements Function1<Object, Unit> {
    public final /* synthetic */ Function0<Unit> a;
    public final /* synthetic */ bc6 b;

    public a8e(Function0 function0, bc6 bc6Var) {
        this.a = function0;
        this.b = bc6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        obj.getClass();
        this.a.invoke();
        bc6 bc6Var = this.b;
        if (bc6Var.p() instanceof bzx) {
            zi50.a aVar = zi50.b;
            bc6Var.resumeWith(obj);
        } else {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_COMMON);
            aVar2.n("Continuation not active, resume not perform.", new Object[0]);
        }
        return Unit.a;
    }
}
