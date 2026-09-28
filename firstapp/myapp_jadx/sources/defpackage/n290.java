package defpackage;

import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class n290 extends qlr implements Function1<y.a, Unit> {
    public final /* synthetic */ y a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n290(y yVar) {
        super(1);
        this.a = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(y.a aVar) {
        aVar.s(this.a, 0, 0, 0.0f);
        return Unit.a;
    }
}
