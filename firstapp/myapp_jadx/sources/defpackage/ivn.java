package defpackage;

import com.sportybet.android.instantwin.presentation.racingevent.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ivn implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;

    public /* synthetic */ ivn(haj hajVar, int i) {
        this.a = i;
        this.b = hajVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) hajVar;
                function1.invoke(c.a.e.a);
                function1.invoke(c.a.C0305a.a);
                break;
            default:
                ((Function0) hajVar).invoke();
                break;
        }
        return Unit.a;
    }
}
