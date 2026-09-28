package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m0o implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m0o(int i, Object obj, Object obj2) {
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
                Function0 function0 = (Function0) obj2;
                ytw ytwVar = (ytw) obj;
                if (!((Boolean) ytwVar.getValue()).booleanValue()) {
                    ytwVar.setValue(Boolean.TRUE);
                    function0.invoke();
                }
                break;
            default:
                bi6 bi6Var = (bi6) obj2;
                pl6 pl6Var = (pl6) obj;
                if (bi6Var != null) {
                    bi6Var.a.d.j(pl6Var.a.id);
                }
                break;
        }
        return Unit.a;
    }
}
