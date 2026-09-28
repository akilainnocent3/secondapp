package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p3g implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p3g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object objA;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((Function1) obj2).invoke(bool);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj2).invoke(new b.t(str));
                break;
            default:
                j7z.b bVar = (j7z.b) obj;
                bVar.getClass();
                wwd0 wwd0Var = ((c7z) obj2).f;
                do {
                    value = wwd0Var.getValue();
                    objA = (z6z) value;
                    z6z.a aVar = (z6z.a) (!(objA instanceof z6z.a) ? null : objA);
                    if (aVar != null) {
                        objA = z6z.a.a(aVar, bVar, null, false, 1019);
                    }
                } while (!wwd0Var.g(value, objA));
                break;
        }
        return Unit.a;
    }
}
