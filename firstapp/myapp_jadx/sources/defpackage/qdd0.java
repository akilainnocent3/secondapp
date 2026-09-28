package defpackage;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqdd0;", "Lj8i0;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qdd0 extends j8i0 {
    public iym a;
    public final wwd0 b;

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.SportyTrackingSharedViewModel$1", f = "SportyTrackingSharedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Pair<? extends y200, ? extends y200>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = qdd0.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Pair<? extends y200, ? extends y200> pair, v1b<? super Unit> v1bVar) {
            return ((a) create(pair, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            pdd0 pndVar;
            Pair pair = (Pair) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            y200 y200Var = (y200) pair.a;
            y200 y200Var2 = (y200) pair.b;
            if (y200Var == null) {
                return Unit.a;
            }
            if (y200Var2 != null && y200Var.getClass().isAssignableFrom(y200Var2.getClass())) {
                y200Var = y200Var2;
            }
            iym iymVar = qdd0.this.a;
            if (iymVar == null) {
                Intrinsics.n("openTelemetryLogger");
                throw null;
            }
            if (y200Var instanceof y300) {
                pndVar = new ahj0(y200Var.b());
            } else {
                if (!(y200Var instanceof a300)) {
                    uhc.a();
                    return null;
                }
                pndVar = new pnd(y200Var.b());
            }
            gym.a(iymVar, pndVar);
            return Unit.a;
        }
    }

    public qdd0() {
        wwd0 wwd0VarA = xwd0.a(new Pair(null, null));
        this.b = wwd0VarA;
        e1i.e(new g1i(szh.a(wwd0VarA, 100L), new a(null)), o8i0.d(this), q490.a.a, new Pair(null, null));
    }
}
