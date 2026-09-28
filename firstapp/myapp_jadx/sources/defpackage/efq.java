package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lefq;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class efq extends j8i0 {
    public final wdq a;
    public final vdq b;
    public final odd c;
    public final wwd0 d;
    public final wwd0 e;
    public final wwd0 f;
    public jvd0 i;
    public boolean v;
    public final ku90<ccr> w;
    public final v340 y;

    @c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.gift.presentation.LNGiftTabViewModel$fetchGifts$1", f = "LNGiftTabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends qcn<? extends ocq>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ efq c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, efq efqVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = efqVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends qcn<? extends ocq>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            efq efqVar = this.c;
            wwd0 wwd0Var = efqVar.d;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean zG = Intrinsics.g(lk50Var, lk50.b.a);
            boolean z = this.b;
            if (zG) {
                if (!z) {
                    wwd0Var.setValue(lk50Var);
                }
            } else if (lk50Var instanceof lk50.a) {
                if (!z) {
                    wwd0Var.getClass();
                    wwd0Var.k(null, lk50Var);
                }
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                wwd0Var.getClass();
                wwd0Var.k(null, lk50Var);
            }
            if (!(lk50Var instanceof lk50.b)) {
                wwd0 wwd0Var2 = efqVar.e;
                Boolean bool = Boolean.FALSE;
                wwd0Var2.getClass();
                wwd0Var2.k(null, bool);
            }
            return Unit.a;
        }
    }

    public efq(wdq wdqVar, vdq vdqVar, rdd0 rdd0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        wdqVar.getClass();
        vdqVar.getClass();
        rdd0Var.getClass();
        this.a = wdqVar;
        this.b = vdqVar;
        this.c = oddVar;
        wwd0 wwd0VarA = xwd0.a(lk50.b.a);
        this.d = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(Boolean.FALSE);
        this.e = wwd0VarA2;
        xf00 xf00Var = xf00.i;
        xf00Var.getClass();
        wwd0 wwd0VarA3 = xwd0.a(xf00Var);
        this.f = wwd0VarA3;
        this.w = new ku90<>();
        this.y = e1i.e(r1i.a(wwd0VarA, wwd0VarA3, wwd0VarA2, new ffq(this, null)), o8i0.d(this), q490.a.a, new dfq(0));
        djr.a(rdd0Var, cjr.m.a);
    }

    public final void x1() {
        if (this.v) {
            jvd0 jvd0Var = this.i;
            if (jvd0Var == null || !jvd0Var.isActive()) {
                lk50 lk50Var = (lk50) this.d.getValue();
                boolean z = lk50Var instanceof lk50.c;
                boolean z2 = z && !((Collection) ((lk50.c) lk50Var).a).isEmpty();
                if (z2) {
                    Boolean bool = Boolean.TRUE;
                    wwd0 wwd0Var = this.e;
                    wwd0Var.getClass();
                    wwd0Var.k(null, bool);
                }
                wdq wdqVar = this.a;
                this.i = kzh.d(ozh.c(new g1i(bm50.a(new i0i(z ? wdqVar.c.e() : wdqVar.c.a())), new a(z2, this, null)), this.c), o8i0.d(this));
            }
        }
    }
}
