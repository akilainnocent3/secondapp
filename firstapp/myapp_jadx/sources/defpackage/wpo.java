package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wpo implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wpo(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
            default:
                zni0 zni0Var = (zni0) obj;
                zni0Var.v0().H1();
                om5 om5Var = zni0Var.C;
                if (om5Var != null) {
                    om5Var.a(zni0Var);
                    return Unit.a;
                }
                Intrinsics.n("registerUpdatePhoneNumberLauncher");
                throw null;
        }
    }
}
