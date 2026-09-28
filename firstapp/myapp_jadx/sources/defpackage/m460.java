package defpackage;

import androidx.fragment.app.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m460 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m460(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                l560 l560Var = (l560) obj2;
                if (((Boolean) obj).booleanValue()) {
                    l560Var.p0();
                } else {
                    e activity = l560Var.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
                break;
            default:
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                ((foa0) obj2).w.j(f1e0Var.c);
                break;
        }
        return Unit.a;
    }
}
