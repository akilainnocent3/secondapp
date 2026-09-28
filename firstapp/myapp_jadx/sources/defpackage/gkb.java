package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gkb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gkb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentManager supportFragmentManager;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                enb enbVar = (enb) obj2;
                if (((Boolean) obj).booleanValue()) {
                    e activity = enbVar.getActivity();
                    if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                        if (supportFragmentManager.L() > 0) {
                            supportFragmentManager.b0(-1, 1, "CONFIRM_DIALOG_FRAGMENT");
                        }
                        enbVar.p0 = null;
                    }
                } else {
                    e activity2 = enbVar.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((Function1) obj2).invoke(bool);
                break;
        }
        return Unit.a;
    }
}
