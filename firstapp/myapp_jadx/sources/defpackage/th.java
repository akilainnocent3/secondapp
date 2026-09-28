package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class th implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ th(Object obj, int i) {
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
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((mjj0) obj2).Q1(ijf0Var);
                break;
            default:
                m410 m410Var = (m410) obj2;
                if (((Boolean) obj).booleanValue()) {
                    m410Var.H0();
                    e activity = m410Var.getActivity();
                    if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                        supportFragmentManager.Y();
                    }
                } else {
                    e activity2 = m410Var.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
                break;
        }
        return Unit.a;
    }
}
