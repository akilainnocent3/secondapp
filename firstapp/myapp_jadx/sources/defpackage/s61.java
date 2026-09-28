package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s61 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ s61(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                l91 l91Var = (l91) obj;
                l91Var.getClass();
                function1.invoke(l91Var);
                break;
            default:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                if (((int) (urrVar.a() >> 32)) != 0 && ((int) (urrVar.a() & 4294967295L)) != 0) {
                    long jD = eb9.d(urrVar);
                    int iB = ycv.b(Float.intBitsToFloat((int) (jD >> 32)));
                    int iB2 = ycv.b(Float.intBitsToFloat((int) (jD & 4294967295L)));
                    function1.invoke(new owo(iB, iB2, ((int) (urrVar.a() >> 32)) + iB, ((int) (4294967295L & urrVar.a())) + iB2));
                }
                break;
        }
        return Unit.a;
    }
}
