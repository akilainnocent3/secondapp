package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.common.ui.compose.ComposeKeyboardUtil$stickyKeyboard$1$1", f = "ComposeKeyboardUtil.kt", l = {}, m = "invokeSuspend", v = 1)
public final class kfa extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ jfa.a b;
    public final /* synthetic */ ytw<Boolean> c;
    public final /* synthetic */ isw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfa(boolean z, jfa.a aVar, ytw<Boolean> ytwVar, isw iswVar, v1b<? super kfa> v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = aVar;
        this.c = ytwVar;
        this.d = iswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kfa(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kfa) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!this.a) {
            jfa jfaVar = jfa.a;
            if (this.c.getValue().booleanValue()) {
                this.b.a = this.d.j();
            }
        }
        return Unit.a;
    }
}
