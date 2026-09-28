package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class gny extends qlr implements Function0<Unit> {
    public final /* synthetic */ iny a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gny(iny inyVar) {
        super(0);
        this.a = inyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.d();
        return Unit.a;
    }
}
