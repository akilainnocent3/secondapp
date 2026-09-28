package defpackage;

import com.sportybet.android.instantwin.presentation.legendsrace.b;
import com.sportybet.android.instantwin.presentation.legendsrace.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class amc0 extends pf implements Function2<x5f, v1b<? super Unit>, Object> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x5f x5fVar, v1b<? super Unit> v1bVar) {
        x5f x5fVar2 = x5fVar;
        c cVar = (c) this.a;
        ku90<b> ku90Var = cVar.v;
        if (x5fVar2 instanceof x5f.a) {
            ku90Var.a(new b.a(((x5f.a) x5fVar2).a, cVar.d.B("sr:sport:3")));
        } else if (x5fVar2 instanceof x5f.b) {
            ku90Var.a(new b.d(((x5f.b) x5fVar2).a));
        } else {
            if (!(x5fVar2 instanceof x5f.c)) {
                uhc.a();
                return null;
            }
            ku90Var.a(new b.c(((x5f.c) x5fVar2).a));
        }
        return Unit.a;
    }
}
