package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jv50 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jv50(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((vp60) obj).getClass();
                return ((Function0) obj2).invoke();
            default:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.f(((Number) ((wd0) obj2).d()).floatValue());
                return Unit.a;
        }
    }
}
