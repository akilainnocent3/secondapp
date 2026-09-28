package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cos implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cos(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Context context = ((aos) obj).a.getContext();
                context.getClass();
                gby.c(context);
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(cp50.l.a);
                return Unit.a;
            default:
                ((i2i0) obj).dismissAllowingStateLoss();
                return null;
        }
    }
}
