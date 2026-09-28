package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g8e implements Function1 {
    public final /* synthetic */ z7e a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l600 l600Var = (l600) obj;
        l600Var.getClass();
        bc6 bc6Var = ((z7e.i) this.a).g;
        if (bc6Var.p() instanceof bzx) {
            zi50.a aVar = zi50.b;
            bc6Var.resumeWith(l600Var);
        } else {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_COMMON);
            aVar2.n("Continuation not active, resume not perform.", new Object[0]);
        }
        return Unit.a;
    }
}
