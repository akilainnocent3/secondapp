package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ro2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ro2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((zo2) obj2).z.invoke(str);
                break;
            default:
                Function0 function0 = (Function0) obj2;
                j5i j5iVar = (j5i) obj;
                j5iVar.getClass();
                if (j5iVar.a()) {
                    function0.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
