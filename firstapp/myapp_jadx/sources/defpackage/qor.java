package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qor implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qor(int i, Object obj, Object obj2) {
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
                Function1 function1 = (Function1) obj2;
                int iIntValue = ((Integer) obj).intValue();
                nk0.d dVar = (nk0.d) CollectionsKt.firstOrNull(((nk0) obj3).b(iIntValue, iIntValue, "URL"));
                if (dVar != null) {
                    function1.invoke(dVar.a);
                }
                break;
            default:
                uf00 uf00Var = (uf00) obj3;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szrVar.d(uf00Var.size(), new k890(new q79(2), uf00Var), new l890(uf00Var), new op8(2039820996, new m890(uf00Var, (abf) obj2), true));
                break;
        }
        return Unit.a;
    }
}
