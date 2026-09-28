package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.ui.DepositRequiredPlaybackCoverKt$DepositRequiredPlaybackCover$1$1", f = "DepositRequiredPlaybackCover.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r6e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ykg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6e(ykg ykgVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = ykgVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new r6e(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((r6e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.invoke();
        return Unit.a;
    }
}
