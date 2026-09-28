package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a6z implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a6z(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                g74 g74Var = (g74) obj;
                g74Var.getClass();
                ((Function1) obj2).invoke(new q5z.b(g74Var));
                break;
            default:
                xcf0 xcf0Var = (xcf0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                try {
                    zi50.a aVar = zi50.b;
                    dj5.b(new wcf0(xcf0Var, zBooleanValue, null));
                    Unit unit = Unit.a;
                } catch (Throwable unused) {
                    zi50.a aVar2 = zi50.b;
                }
                xcf0Var.b.a();
                break;
        }
        return Unit.a;
    }
}
