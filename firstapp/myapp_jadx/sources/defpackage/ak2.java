package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ak2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;

    public /* synthetic */ ak2(haj hajVar, int i) {
        this.a = i;
        this.b = hajVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((Function0) hajVar).invoke();
                break;
            default:
                ((Function1) hajVar).invoke(b.j.a);
                break;
        }
        return Unit.a;
    }
}
