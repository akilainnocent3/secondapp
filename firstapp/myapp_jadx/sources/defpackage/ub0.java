package defpackage;

import android.content.Intent;
import androidx.fragment.app.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ub0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ub0(int i, Object obj, Object obj2) {
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
                urr urrVarInvoke = ((xb0) obj2).c.invoke();
                return ((bef0) obj).S0(urrVarInvoke).j(urrVarInvoke.i0(0L));
            default:
                n2j n2jVar = (n2j) obj2;
                Intent intent = (Intent) obj;
                e activity = n2jVar.getActivity();
                if (activity != null) {
                    activity.startActivity(intent);
                }
                n2jVar.H = true;
                return Unit.a;
        }
    }
}
