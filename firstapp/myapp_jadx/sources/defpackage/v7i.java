package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.viewmodel.FollowCodeViewModel$onAccountChanged$1", f = "FollowCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v7i extends tje0 implements Function2<b6i, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ u7i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7i(u7i u7iVar, v1b<? super v7i> v1bVar) {
        super(2, v1bVar);
        this.b = u7iVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        v7i v7iVar = new v7i(this.b, v1bVar);
        v7iVar.a = obj;
        return v7iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b6i b6iVar, v1b<? super Unit> v1bVar) {
        return ((v7i) create(b6iVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        b6i b6iVar = (b6i) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (b6iVar instanceof b6i.b) {
            u7i u7iVar = this.b;
            if (!u7iVar.e.hasPersonalPage()) {
                wuw<b6i> wuwVar = u7iVar.v;
                wuwVar.getClass();
                wuwVar.a.c(b6iVar);
            }
        }
        return Unit.a;
    }
}
