package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ua2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ua2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ijf0 ijf0Var = (ijf0) obj2;
                ytw ytwVar = (ytw) obj;
                if (!ulf0.b(ijf0Var.b, ((ijf0) ytwVar.getValue()).b) || !Intrinsics.g(ijf0Var.c, ((ijf0) ytwVar.getValue()).c)) {
                    ytwVar.setValue(ijf0Var);
                }
                break;
            default:
                ((Function1) obj2).invoke(((u670) obj).a);
                break;
        }
        return Unit.a;
    }
}
