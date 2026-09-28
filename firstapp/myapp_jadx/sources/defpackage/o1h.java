package defpackage;

import android.content.Context;
import android.view.View;
import com.sportygames.sportyherov2.components.SideBetTabContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o1h implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o1h(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return new q1h.b(new q1h.a((View) obj3, (Function0) obj2));
            default:
                final a6c0 a6c0Var = (a6c0) obj3;
                ytw ytwVar = (ytw) obj2;
                Context context = (Context) obj;
                context.getClass();
                SideBetTabContainer sideBetTabContainer = new SideBetTabContainer(context, null);
                a6c0Var.j = sideBetTabContainer;
                rs80 binding = sideBetTabContainer.getBinding();
                if (binding != null) {
                    gr60.a(binding.f, new pac(a6c0Var, 2));
                    gr60.a(binding.B, new Function1() { // from class: r5c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            ((View) obj4).getClass();
                            a6c0Var.e(b6c0.b);
                            return Unit.a;
                        }
                    });
                    gr60.a(binding.H, new sac(a6c0Var, 1));
                }
                a6c0.a(sideBetTabContainer);
                a6c0.b(sideBetTabContainer, (b6c0) ((x5a0) a6c0Var.h).getValue(), ((Boolean) ytwVar.getValue()).booleanValue());
                return sideBetTabContainer;
        }
    }
}
