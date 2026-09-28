package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class u50 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ AndroidComposeView a;
    public final /* synthetic */ wc0 b;
    public final /* synthetic */ op8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u50(AndroidComposeView androidComposeView, wc0 wc0Var, op8 op8Var) {
        super(2);
        this.a = androidComposeView;
        this.b = wc0Var;
        this.c = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            kna.a(this.a, this.b, this.c, aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
