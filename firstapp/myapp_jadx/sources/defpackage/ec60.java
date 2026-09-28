package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.SBComposeKeyboardUtil$stickyKeyboard$1$1", f = "SBComposeKeyboardUtil.kt", l = {}, m = "invokeSuspend", v = 1)
public final class ec60 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ dc60.a b;
    public final /* synthetic */ ytw<Boolean> c;
    public final /* synthetic */ isw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec60(boolean z, dc60.a aVar, ytw<Boolean> ytwVar, isw iswVar, v1b<? super ec60> v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = aVar;
        this.c = ytwVar;
        this.d = iswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ec60(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ec60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!this.a) {
            dc60 dc60Var = dc60.a;
            if (this.c.getValue().booleanValue()) {
                this.b.a = this.d.j();
            }
        }
        return Unit.a;
    }
}
