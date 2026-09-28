package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import com.sportygames.spinmatch.components.BetConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ok2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ok2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                Function1<? super Integer, Unit> function1 = ((BetConfig) obj2).H;
                if (function1 != null) {
                    function1.invoke(num);
                    return Unit.a;
                }
                Intrinsics.n("betConfigListener");
                throw null;
            default:
                Function1 function2 = (Function1) obj2;
                String str = (String) obj;
                str.getClass();
                function2.invoke(new b.f(str));
                function2.invoke(b.o.a.a);
                return Unit.a;
        }
    }
}
