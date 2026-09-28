package defpackage;

import com.sporty.android.platform.features.account.register.presentation.RegistrationSuccessfulActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class axr implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ axr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        v720 binding;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new bxr((dxr.a) obj2);
            case 1:
                m410 m410Var = (m410) obj2;
                ((Boolean) obj).getClass();
                ((x5a0) m410Var.l1).setValue(Boolean.TRUE);
                ixi ixiVar = (ixi) m410Var.b;
                if (ixiVar != null && (binding = ixiVar.b.getBinding()) != null) {
                    binding.d.setStatus(false);
                }
                return Unit.a;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                RegistrationSuccessfulActivity.a aVar = RegistrationSuccessfulActivity.d;
                ((RegistrationSuccessfulActivity) obj2).A1(zBooleanValue, dag.REGISTER);
                return Unit.a;
        }
    }
}
