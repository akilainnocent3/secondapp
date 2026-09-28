package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", f = "BasicTextContextMenuProvider.kt", l = {130}, m = "invokeSuspend")
public final class la2 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ka2 b;
    public final /* synthetic */ ka2.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la2(ka2 ka2Var, ka2.a aVar, v1b<? super la2> v1bVar) {
        super(1, v1bVar);
        this.b = ka2Var;
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new la2(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((la2) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ka2.a aVar = this.c;
        ytw ytwVar = this.b.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                ((x5a0) ytwVar).setValue(aVar);
                this.a = 1;
                Object objA = aVar.b.a(this);
                if (objA != y5bVar) {
                    objA = Unit.a;
                }
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ((x5a0) ytwVar).setValue(null);
            return Unit.a;
        } catch (Throwable th) {
            ((x5a0) ytwVar).setValue(null);
            throw th;
        }
    }
}
