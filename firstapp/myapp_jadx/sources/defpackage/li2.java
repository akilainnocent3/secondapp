package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class li2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ li2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object bVar;
        rgt rgtVarL;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(b.q.C0329b.a);
                return Unit.a;
            default:
                rob0 rob0Var = (rob0) obj;
                try {
                    zi50.a aVar = zi50.b;
                    i1z i1zVarProvideOpenTelemetry = rob0Var.a.provideOpenTelemetry();
                    bVar = (i1zVarProvideOpenTelemetry != null && (rgtVarL = i1zVarProvideOpenTelemetry.l()) != null) ? rgtVarL.d("sportygames.otlp.logger") : null;
                    break;
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                return (ogt) (bVar instanceof zi50.b ? null : bVar);
        }
    }
}
