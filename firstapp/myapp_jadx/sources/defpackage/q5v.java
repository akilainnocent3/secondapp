package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.CreateEvent;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.viewmodel.MatchEventViewModel$fetchCreateEventData$1", f = "MatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q5v extends tje0 implements Function2<lk50<? extends CreateEvent>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ z5v b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5v(z5v z5vVar, String str, boolean z, v1b<? super q5v> v1bVar) {
        super(2, v1bVar);
        this.b = z5vVar;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        q5v q5vVar = new q5v(this.b, this.c, this.d, v1bVar);
        q5vVar.a = obj;
        return q5vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends CreateEvent> lk50Var, v1b<? super Unit> v1bVar) {
        return ((q5v) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        z5v z5vVar = this.b;
        wwd0 wwd0Var = z5vVar.Q;
        wwd0 wwd0Var2 = z5vVar.P;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.a) {
            wwd0Var2.getClass();
            wwd0Var2.k(null, lk50Var);
            lk50.a aVar = new lk50.a(((lk50.a) lk50Var).a);
            wwd0Var.getClass();
            wwd0Var.k(null, aVar);
        } else {
            lk50.b bVar = lk50.b.a;
            if (Intrinsics.g(lk50Var, bVar)) {
                wwd0Var2.setValue(bVar);
                wwd0Var.setValue(bVar);
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                T t = ((lk50.c) lk50Var).a;
                CreateEvent createEvent = t instanceof CreateEvent ? (CreateEvent) t : null;
                if (createEvent != null) {
                    n4p n4pVar = z5vVar.z;
                    String str = n4pVar.t;
                    z5vVar.V = createEvent.leagues;
                    n4pVar.t = createEvent.roundId;
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(createEvent.getMinStake());
                    bigDecimalValueOf.getClass();
                    n4pVar.j = p54.b(bigDecimalValueOf).doubleValue();
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(createEvent.getMaxStake());
                    bigDecimalValueOf2.getClass();
                    n4pVar.k = p54.b(bigDecimalValueOf2).doubleValue();
                    BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(createEvent.getMaxPayout());
                    bigDecimalValueOf3.getClass();
                    n4pVar.l = p54.b(bigDecimalValueOf3);
                    if (this.d && str != null && !str.equals(createEvent.roundId)) {
                        n4pVar.d();
                        n4pVar.x(null);
                    }
                }
                eko ekoVar = z5vVar.f.a;
                String str2 = this.c;
                kzh.d(new yzh(new g1i(bm50.a(ekoVar.x(str2)), new s5v(null, z5vVar)), new t5v(null, z5vVar)), o8i0.d(z5vVar));
                if (createEvent != null) {
                    z5vVar.d1(createEvent.roundId, str2);
                }
                wwd0Var2.getClass();
                wwd0Var2.k(null, lk50Var);
            }
        }
        return Unit.a;
    }
}
