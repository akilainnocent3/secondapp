package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mi4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mi4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.u(((Number) ((twd0) obj2).getValue()).floatValue());
                a7lVar.z0(n09.a(0.5f, 0.36f));
                break;
            default:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((Function1) obj2).invoke(new jxo(urrVar.a()));
                break;
        }
        return Unit.a;
    }
}
