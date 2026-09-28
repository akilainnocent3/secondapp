package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.debugscreen.impl.antest.DebugVariantViewModel$fetchReadout$1", f = "DebugVariantViewModel.kt", l = {115}, m = "invokeSuspend", v = 2)
public final class c4d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ y3d b;
    public final /* synthetic */ x66<?> c;
    public final /* synthetic */ Function1<v1b<? super y3d.b.a>, Object> d;
    public final /* synthetic */ Function2<y3d.b, y3d.b.a, y3d.b> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c4d(y3d y3dVar, x66<?> x66Var, Function1<? super v1b<? super y3d.b.a>, ? extends Object> function1, Function2<? super y3d.b, ? super y3d.b.a, y3d.b> function2, v1b<? super c4d> v1bVar) {
        super(2, v1bVar);
        this.b = y3dVar;
        this.c = x66Var;
        this.d = function1;
        this.e = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c4d(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c4d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Map map;
        y3d.b bVar;
        Object value2;
        Map map2;
        y3d.b bVar2;
        String str = this.c.a;
        wwd0 wwd0Var = this.b.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        Function2<y3d.b, y3d.b.a, y3d.b> function2 = this.e;
        if (i == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
                map = (Map) value;
                bVar = (y3d.b) map.get(str);
                if (bVar == null) {
                    bVar = new y3d.b(0);
                }
            } while (!wwd0Var.g(value, kpu.i(map, new Pair(str, function2.invoke(bVar, y3d.b.a.C1323b.a)))));
            this.a = 1;
            obj = this.d.invoke(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        y3d.b.a aVar = (y3d.b.a) obj;
        do {
            value2 = wwd0Var.getValue();
            map2 = (Map) value2;
            bVar2 = (y3d.b) map2.get(str);
            if (bVar2 == null) {
                bVar2 = new y3d.b(0);
            }
        } while (!wwd0Var.g(value2, kpu.i(map2, new Pair(str, function2.invoke(bVar2, aVar)))));
        return Unit.a;
    }
}
