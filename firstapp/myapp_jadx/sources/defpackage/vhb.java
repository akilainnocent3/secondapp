package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vhb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vhb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zqy zqyVar = (zqy) obj;
                zqyVar.b0 = 1;
                zob zobVarW0 = zqyVar.w0();
                zobVarW0.getClass();
                ej5.c(o8i0.d(zobVarW0), null, null, new cpb(zobVarW0, null), 3);
                break;
            case 1:
                n5g n5gVar = (n5g) obj;
                ej5.c(o8i0.d(n5gVar), n5gVar.b, null, new m5g(n5gVar, null), 2);
                break;
            default:
                ((Function1) ((chp) obj)).invoke(lvk.d.a);
                break;
        }
        return Unit.a;
    }
}
