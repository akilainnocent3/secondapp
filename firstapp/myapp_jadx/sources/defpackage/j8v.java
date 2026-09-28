package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legendsrace.component.runningpage.MatchTrackerVideoViewKt$OverlayAnimation$2$1", f = "MatchTrackerVideoView.kt", l = {173}, m = "invokeSuspend", v = 2)
public final class j8v extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ flc0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ytw<Boolean> e;
    public final /* synthetic */ ont f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8v(flc0 flc0Var, long j, long j2, ytw ytwVar, ont ontVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = flc0Var;
        this.c = j;
        this.d = j2;
        this.e = ytwVar;
        this.f = ontVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j8v(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j8v) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        ytw<Boolean> ytwVar = this.e;
        if (i == 0) {
            uj50.b(obj);
            ytwVar.setValue(Boolean.FALSE);
            int iOrdinal = this.b.b.ordinal();
            if (iOrdinal == 0) {
                ytwVar.setValue(Boolean.TRUE);
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                xmt value = this.f.getValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (value != null) {
                    long j = this.c;
                    if (j > 0) {
                        long jB = (j - (jCurrentTimeMillis - this.d)) - ((long) value.b());
                        if (jB > 0) {
                            this.a = 1;
                            if (hkd.b(jB, this) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    }
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ytwVar.setValue(Boolean.TRUE);
        return Unit.a;
    }
}
