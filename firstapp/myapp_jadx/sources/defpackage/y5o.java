package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y5o extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        q5o q5oVar = (q5o) this.receiver;
        Context context = q5oVar.getContext();
        if (context != null) {
            q5oVar.q0().x1(context);
        }
        return Unit.a;
    }
}
