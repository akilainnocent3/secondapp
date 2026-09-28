package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class v50 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ AndroidComposeView a;
    public final /* synthetic */ op8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v50(AndroidComposeView androidComposeView, op8 op8Var, int i) {
        super(2);
        this.a = androidComposeView;
        this.b = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        int iA = qj40.a(1);
        AndroidCompositionLocals_androidKt.a(this.a, this.b, aVar, iA);
        return Unit.a;
    }
}
