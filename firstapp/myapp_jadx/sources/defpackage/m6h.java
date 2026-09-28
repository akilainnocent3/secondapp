package defpackage;

import com.sportybet.feature.facialrecognition.presentation.c;
import com.sportybet.feature.facialrecognition.presentation.g;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m6h extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        c cVar = (c) this.receiver;
        jvd0 jvd0Var = cVar.z;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        ej5.c(o8i0.d(cVar), null, null, new g(cVar, null), 3);
        return Unit.a;
    }
}
