package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.f;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoViewModel$observeGiftSelection$1", f = "BuildAndGoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pi5 extends tje0 implements Function2<m780, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi5(f fVar, v1b<? super pi5> v1bVar) {
        super(2, v1bVar);
        this.b = fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pi5 pi5Var = new pi5(this.b, v1bVar);
        pi5Var.a = obj;
        return pi5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(m780 m780Var, v1b<? super Unit> v1bVar) {
        return ((pi5) create(m780Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        BigDecimal bigDecimalG;
        Object value;
        m780 m780Var = (m780) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.C;
        if (m780Var != null && (str = m780Var.a) != null && (bigDecimalG = b.g(str)) != null) {
            BigDecimal bigDecimalG2 = b.g((String) wwd0Var.getValue());
            if (bigDecimalG2 == null) {
                bigDecimalG2 = BigDecimal.ZERO;
            }
            if (bigDecimalG.compareTo(bigDecimalG2) > 0) {
                String string = bigDecimalG.toString();
                string.getClass();
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, string));
            }
        }
        return Unit.a;
    }
}
