package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class lbl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lbl(Object obj, int i) {
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
                long j = ((vbl) obj2).a;
                a7lVar.B(Float.intBitsToFloat((int) (j >> 32)));
                a7lVar.f(Float.intBitsToFloat((int) (j & 4294967295L)));
                break;
            default:
                ((Function1) obj2).invoke(new mak0.f(((Boolean) obj).booleanValue()));
                break;
        }
        return Unit.a;
    }
}
