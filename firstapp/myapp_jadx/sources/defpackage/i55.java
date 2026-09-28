package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i55 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i55(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                j590 j590Var = (j590) obj2;
                a7l a7lVar = (a7l) obj;
                float fJ = ((t5a0) j590Var.e.j).j();
                float f = j590Var.e.e().f();
                float f2 = fJ < f ? f - fJ : 0.0f;
                a7lVar.v(f2 > 0.0f ? (Float.intBitsToFloat((int) (a7lVar.d() & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & a7lVar.d())) : 1.0f);
                a7lVar.z0(n09.a(0.5f, 0.0f));
                return Unit.a;
            default:
                String str = (String) obj;
                str.getClass();
                return new xk0((Context) obj2, str);
        }
    }
}
