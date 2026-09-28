package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class c8e implements Function0<Unit> {
    public final /* synthetic */ bc6 a;
    public final /* synthetic */ Object b;

    public c8e(bc6 bc6Var, Object obj) {
        this.a = bc6Var;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        bc6 bc6Var = this.a;
        if (bc6Var.p() instanceof bzx) {
            zi50.a aVar = zi50.b;
            bc6Var.resumeWith(this.b);
        } else {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_COMMON);
            aVar2.n("Continuation not active, resume not perform.", new Object[0]);
        }
        return Unit.a;
    }
}
