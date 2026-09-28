package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p2w implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p2w(Object obj, int i) {
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
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ytw ytwVar = (ytw) ((twd0) obj2).getValue();
                urr urrVarE0 = urrVar.e0();
                ytwVar.setValue(Boolean.valueOf(urrVarE0 != null ? eb9.b(urrVarE0).h(lk40.b(eb9.b(urrVar), 0.0f, 0.0f, 15)) : false));
                break;
            default:
                nn40 nn40Var = (nn40) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                nn40Var.s0();
                if (zBooleanValue) {
                    e activity = nn40Var.getActivity();
                    if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                        supportFragmentManager.Y();
                    }
                    nn40Var.K0();
                } else {
                    e activity2 = nn40Var.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
                break;
        }
        return Unit.a;
    }
}
