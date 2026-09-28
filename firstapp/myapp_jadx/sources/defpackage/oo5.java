package defpackage;

import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/* JADX INFO: loaded from: classes7.dex */
public final class oo5 extends a implements l5b {
    public final /* synthetic */ ro5 a;
    public final /* synthetic */ to5 b;
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo5(ro5 ro5Var, to5 to5Var, List list) {
        super(l5b.a.a);
        this.a = ro5Var;
        this.b = to5Var;
        this.c = list;
    }

    @Override // defpackage.l5b
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        th.printStackTrace();
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(odd.b), null, null, new qo5(this.a, this.b, null, this.c), 3);
    }
}
