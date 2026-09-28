package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fbg_dialog.FBGDialogViewModel$initialise$1", f = "FBGDialogViewModel.kt", l = {59}, m = "invokeSuspend", v = 1)
public final class d5h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ e5h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5h(e5h e5hVar, v1b<? super d5h> v1bVar) {
        super(2, v1bVar);
        this.b = e5hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d5h(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d5h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            e5h e5hVar = this.b;
            if (!e5hVar.d) {
                e5hVar.d = true;
                this.a = 1;
                Object objCollect = new yzh(e5hVar.a.a(new z4h(), new a5h(e5hVar, null)).a, new b5h(e5hVar, null)).collect(new c5h(e5hVar), this);
                if (objCollect != y5bVar) {
                    objCollect = Unit.a;
                }
                if (objCollect == y5bVar) {
                    return y5bVar;
                }
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
