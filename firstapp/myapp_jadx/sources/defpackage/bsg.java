package defpackage;

import androidx.recyclerview.widget.r;
import com.sportybet.plugin.realsports.data.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventUseCase$insertCacheEvent$2", f = "EventUseCase.kt", l = {r.d.DEFAULT_DRAG_ANIMATION_DURATION}, m = "invokeSuspend", v = 2)
public final class bsg extends tje0 implements Function2<v5b, v1b<? super zi50<? extends Unit>>, Object> {
    public int a;
    public final /* synthetic */ csg b;
    public final /* synthetic */ Event c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsg(csg csgVar, Event event, int i, v1b<? super bsg> v1bVar) {
        super(2, v1bVar);
        this.b = csgVar;
        this.c = event;
        this.d = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bsg(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends Unit>> v1bVar) {
        return ((bsg) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objH;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            kmg kmgVar = this.b.d;
            this.a = 1;
            objH = kmgVar.h(this.c, this.d, this);
            if (objH == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objH = ((zi50) obj).a;
        }
        return new zi50(objH);
    }
}
