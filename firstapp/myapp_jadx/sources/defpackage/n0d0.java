package defpackage;

import androidx.fragment.app.FragmentManager;
import com.sportybet.android.instantwin.presentation.penalty.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n0d0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n0d0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj;
                function1.invoke(b.InterfaceC0294b.c.a);
                function1.invoke(b.h.C0297b.a);
                break;
            default:
                FragmentManager parentFragmentManager = ((eeh0) obj).getParentFragmentManager();
                parentFragmentManager.getClass();
                new aeh0().show(parentFragmentManager, "UniqueBookingCodeDetailsBottomSheetDialog");
                break;
        }
        return Unit.a;
    }
}
