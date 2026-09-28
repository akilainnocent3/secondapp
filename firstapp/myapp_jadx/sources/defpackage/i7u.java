package defpackage;

import com.sporty.android.core.model.security.sportypin.SportyPinStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i7u implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ i7u(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                jdr jdrVar = (jdr) obj;
                jdrVar.getClass();
                function1.invoke(new nvp.c(jdrVar));
                break;
            default:
                String str = (String) obj;
                str.getClass();
                if (!Intrinsics.g(str, SportyPinStatus.Blocked.getValue())) {
                    function1.invoke(str);
                }
                break;
        }
        return Unit.a;
    }
}
