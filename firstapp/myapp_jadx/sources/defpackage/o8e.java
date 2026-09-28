package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o8e implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o8e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                cg6 cg6Var = (cg6) obj;
                cg6Var.getClass();
                ((vtw) obj2).a(cg6Var);
                return Unit.a;
            default:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(!((Set) obj2).contains(str));
        }
    }
}
