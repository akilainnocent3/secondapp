package defpackage;

import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gf0 extends qlr implements Function1<y.a, Unit> {
    public final /* synthetic */ y a;
    public final /* synthetic */ f0b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf0(y yVar, f0b f0bVar) {
        super(1);
        this.a = yVar;
        this.b = f0bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(y.a aVar) {
        aVar.s(this.a, 0, 0, ((t5a0) this.b.c).j());
        return Unit.a;
    }
}
