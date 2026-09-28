package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class fny extends qlr implements Function0<Unit> {
    public final /* synthetic */ iny a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fny(iny inyVar) {
        super(0);
        this.a = inyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.c();
        return Unit.a;
    }
}
