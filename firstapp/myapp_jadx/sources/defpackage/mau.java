package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mau implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mau(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                if (((Boolean) ((ytw) obj2).getValue()).booleanValue()) {
                    lzaVar.b2();
                }
                break;
            case 1:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((ytw) obj2).setValue(new jxo(urrVar.a()));
                break;
            default:
                Function0 function0 = (Function0) obj2;
                iu20 iu20Var = (iu20) obj;
                iu20Var.getClass();
                if (iu20Var instanceof iu20.a) {
                    function0.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
