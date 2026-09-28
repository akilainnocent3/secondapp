package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qoh implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lk50 lk50Var = (lk50) obj;
        lk50Var.getClass();
        if (lk50Var instanceof lk50.c) {
            for (xsh xshVar : (List) ((lk50.c) lk50Var).a) {
                soh sohVar = soh.c;
                String str = xshVar.a;
                sohVar.getClass();
                FirebaseMessaging.c().i.onSuccessTask(new cqh(str));
            }
        } else if (!(lk50Var instanceof lk50.a) && !(lk50Var instanceof lk50.b)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
