package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.feature.gift.gift.presentation.b;
import com.sportybet.feature.gift.gift.presentation.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gsk implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gsk(z6z z6zVar, OtpData.Register register, Function1 function1, int i) {
        this.c = z6zVar;
        this.d = register;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        final Function1 function1 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj4;
                Function0 function2 = (Function0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zM = aVar.M(function1);
                    Object objY = aVar.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: jsk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(new b.e(false, true));
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    h.d(function0, (Function0) objY, function2, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                m6z.a((z6z) obj4, (OtpData.Register) obj3, function1, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gsk(Function1 function1, Function0 function0, Function0 function2) {
        this.c = function0;
        this.b = function1;
        this.d = function2;
    }
}
