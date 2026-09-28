package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.homeshortcut.ShortcutUseCase$replaceAllHomeShortcuts$2", f = "ShortcutUseCase.kt", l = {97}, m = "invokeSuspend", v = 2)
public final class t790 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ l790 b;
    public final /* synthetic */ List<x690> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t790(v1b v1bVar, l790 l790Var, List list) {
        super(2, v1bVar);
        this.b = l790Var;
        this.c = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t790(v1bVar, this.b, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t790) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            y690 y690Var = this.b.a;
            List<x690> list = this.c;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (x690 x690Var : list) {
                arrayList.add(new ygm(x690Var.a, x690Var.i));
            }
            this.a = 1;
            if (y690Var.a(arrayList, this) == y5bVar) {
                return y5bVar;
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
