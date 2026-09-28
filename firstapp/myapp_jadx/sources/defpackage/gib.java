package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gib implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gib(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zqy zqyVar = (zqy) obj;
                if (((Boolean) ((x5a0) zqyVar.p0().e).getValue()).booleanValue()) {
                    zqyVar.Y0();
                }
                ((x5a0) zqyVar.p0().e).setValue(Boolean.FALSE);
                ((x5a0) zqyVar.p0().B).setValue(0);
                break;
            default:
                Function1 function1 = (Function1) obj;
                function1.invoke(b.a.d.a);
                function1.invoke(b.q.a.a);
                break;
        }
        return Unit.a;
    }
}
