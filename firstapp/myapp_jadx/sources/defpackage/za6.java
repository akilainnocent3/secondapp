package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class za6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ za6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                ((ab6) obj3).b.m(vp60Var, (bb6) obj2);
                break;
            default:
                Function0 function0 = (Function0) obj3;
                j5i j5iVar = (j5i) obj;
                j5iVar.getClass();
                ((ytw) obj2).setValue(Boolean.valueOf(j5iVar.a()));
                if (!j5iVar.a()) {
                    function0.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
