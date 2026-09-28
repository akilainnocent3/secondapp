package defpackage;

import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vf0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vf0(Object obj, int i) {
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
                a7lVar.f(a7lVar.C1(8.0f) * ((m7n) obj2).a);
                break;
            default:
                y.a.A((y.a) obj, (y) obj2, 0, 0);
                break;
        }
        return Unit.a;
    }
}
