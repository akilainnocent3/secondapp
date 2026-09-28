package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class opw implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ opw(Object obj, int i) {
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
                a7lVar.b(((Number) ((wd0) obj2).d()).floatValue());
                break;
            default:
                a7l a7lVar2 = (a7l) obj;
                a7lVar2.getClass();
                a7lVar2.u(((Number) ((twd0) obj2).getValue()).floatValue());
                break;
        }
        return Unit.a;
    }
}
