package defpackage;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSingleBetHandlerImpl$init$5", f = "ScheduledFootballSingleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yj70 extends tje0 implements Function2<Pair<? extends BigDecimal, ? extends ft90>, v1b<? super et90>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bk70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj70(bk70 bk70Var, v1b<? super yj70> v1bVar) {
        super(2, v1bVar);
        this.b = bk70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yj70 yj70Var = new yj70(this.b, v1bVar);
        yj70Var.a = obj;
        return yj70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends BigDecimal, ? extends ft90> pair, v1b<? super et90> v1bVar) {
        return ((yj70) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BigDecimal bigDecimal = (BigDecimal) pair.a;
        ft90 ft90Var = (ft90) pair.b;
        ft90Var.getClass();
        bigDecimal.getClass();
        if (!ft90Var.c) {
            return et90.h;
        }
        List<cz2> list = ft90Var.a;
        Map<String, String> map = ft90Var.b;
        BigDecimal bigDecimalMin = BigDecimal.ZERO;
        BigDecimal bigDecimalAdd = bigDecimalMin;
        BigDecimal bigDecimalMin2 = bigDecimalAdd;
        BigDecimal bigDecimalAdd2 = bigDecimalMin2;
        BigDecimal bigDecimalMin3 = bigDecimalAdd2;
        BigDecimal bigDecimalAdd3 = bigDecimalMin3;
        for (cz2 cz2Var : list) {
            BigDecimal bigDecimal2 = cz2Var.d;
            BigDecimal bigDecimal3 = BigDecimal.ZERO;
            bigDecimalMin2 = bigDecimalMin2.compareTo(bigDecimal3) > 0 ? bigDecimalMin2.min(bigDecimal2) : bigDecimal2;
            bigDecimalAdd2.getClass();
            bigDecimalAdd2 = bigDecimalAdd2.add(bigDecimal2);
            bigDecimalAdd2.getClass();
            String str = map.get(cz2Var.c);
            BigDecimal bigDecimalG = str != null ? b.g(str) : null;
            if (bigDecimalG != null && bigDecimalG.compareTo(bigDecimal3) > 0) {
                bigDecimalMin3 = bigDecimalMin3.compareTo(bigDecimal3) > 0 ? bigDecimalMin3.min(bigDecimalG) : bigDecimalG;
                bigDecimalAdd3.getClass();
                bigDecimalAdd3 = bigDecimalAdd3.add(bigDecimalG);
                bigDecimalAdd3.getClass();
                BigDecimal bigDecimalMultiply = bigDecimalG.multiply(bigDecimal2);
                bigDecimalMin = bigDecimalMin.compareTo(bigDecimal3) > 0 ? bigDecimalMin.min(bigDecimalMultiply) : bigDecimalMultiply;
                bigDecimalAdd.getClass();
                bigDecimalMultiply.getClass();
                bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply);
                bigDecimalAdd.getClass();
            }
        }
        long size = list.size();
        bigDecimalMin2.getClass();
        bigDecimalAdd2.getClass();
        bigDecimalMin3.getClass();
        bigDecimalAdd3.getClass();
        return new et90(size, bigDecimalMin2, bigDecimalAdd2, bigDecimalMin3, bigDecimalAdd3, (BigDecimal) f.b(bigDecimalMin, bigDecimal), (BigDecimal) f.b(bigDecimalAdd, bigDecimal));
    }
}
