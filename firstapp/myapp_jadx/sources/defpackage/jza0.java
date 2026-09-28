package defpackage;

import androidx.fragment.app.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jza0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jza0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        iny onBackPressedDispatcher;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a1b0 a1b0Var = (a1b0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    e activity = a1b0Var.getActivity();
                    if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                        onBackPressedDispatcher.d();
                    }
                } else {
                    e activity2 = a1b0Var.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
                return Unit.a;
            default:
                Long l = (Long) obj;
                l.getClass();
                return ((Function1) obj2).invoke(l);
        }
    }
}
