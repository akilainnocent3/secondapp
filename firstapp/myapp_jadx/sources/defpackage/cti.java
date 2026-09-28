package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cti implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cti(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                iti itiVar = (iti) obj2;
                Context context = (Context) obj;
                context.getClass();
                if (!((Boolean) itiVar.c.getValue()).booleanValue()) {
                    ej5.c(o8i0.d(itiVar), null, null, new hti(itiVar, context, null), 3);
                }
                return Unit.a;
            default:
                return Float.valueOf((((y1o) obj2).f - ((osw) obj).D()) / 2.0f);
        }
    }
}
