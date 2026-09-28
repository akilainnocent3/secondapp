package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jmu implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ haj c;

    public /* synthetic */ jmu(boolean z, Function0 function0) {
        this.b = z;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        haj hajVar = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((Function1) hajVar).invoke(Boolean.valueOf(!z));
                break;
            default:
                Function0 function0 = (Function0) hajVar;
                if (z) {
                    function0.invoke();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ jmu(boolean z, Function1 function1) {
        this.c = function1;
        this.b = z;
    }
}
