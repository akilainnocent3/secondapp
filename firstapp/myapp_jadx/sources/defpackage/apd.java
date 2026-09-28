package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.instantwin.presentation.racingevent.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class apd implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ apd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                jpd jpdVar = (jpd) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(-1620507410, new dpd(jpdVar, i2), aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                break;
            default:
                jzn jznVar = (jzn) obj;
                String str = (String) obj2;
                jznVar.getClass();
                str.getClass();
                ((Function1) obj3).invoke(new c.u(jznVar, str));
                break;
        }
        return Unit.a;
    }
}
