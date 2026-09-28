package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.instantwin.presentation.racingevent.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hoi implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hoi(String str, int i) {
        this.a = 2;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                joi joiVar = (joi) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(1502347692, new ioi(joiVar, 0), aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                break;
            case 1:
                jzn jznVar = (jzn) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                jznVar.getClass();
                ((Function1) obj3).invoke(new c.s(jznVar, iIntValue2));
                break;
            default:
                ((Integer) obj2).getClass();
                oa10.d((String) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hoi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
