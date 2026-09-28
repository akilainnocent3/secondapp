package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dh7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dh7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object objA;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (hh) ((hh7) obj).a.invoke();
            case 1:
                ((Function0) obj).invoke();
                return Unit.a;
            case 2:
                wwd0 wwd0Var = ((c7z) obj).f;
                do {
                    value = wwd0Var.getValue();
                    objA = (z6z) value;
                    z6z.a aVar = (z6z.a) (!(objA instanceof z6z.a) ? null : objA);
                    if (aVar != null) {
                        objA = z6z.a.a(aVar, j7z.d.a, null, false, 1019);
                    }
                } while (!wwd0Var.g(value, objA));
                return Unit.a;
            default:
                ((Function1) obj).invoke(b.q.e.a);
                return Unit.a;
        }
    }
}
