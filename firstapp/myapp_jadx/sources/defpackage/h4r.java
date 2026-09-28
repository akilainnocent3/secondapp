package defpackage;

import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h4r implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h4r(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(Boolean.valueOf(!((q4r) obj).b));
                break;
            default:
                o540 o540Var = (o540) obj2;
                o540Var.s0();
                ((pxi) obj).i.setVisibility(8);
                gym.a(o540Var.p0(), mn2.a);
                if (o540Var.q0().C1()) {
                    FragmentManager parentFragmentManager = o540Var.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    ibs viewLifecycleOwner = o540Var.getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    parentFragmentManager.n0("REQUEST_KEY_SHOW_DELETE_HISTORY_TUTORIAL_DIALOG", viewLifecycleOwner, new uld(parentFragmentManager));
                    if (parentFragmentManager.H("DeleteHistoryTutorialDialog") == null) {
                        new vld().show(parentFragmentManager, "DeleteHistoryTutorialDialog");
                    } else {
                        parentFragmentManager.g("REQUEST_KEY_SHOW_DELETE_HISTORY_TUTORIAL_DIALOG");
                    }
                }
                d740 d740VarQ0 = o540Var.q0();
                ej5.c(o8i0.d(d740VarQ0), null, null, new q740(d740VarQ0, null, null), 3);
                break;
        }
        return Unit.a;
    }
}
