package defpackage;

import android.graphics.BitmapShader;
import com.sporty.android.core.model.luckywheel.LuckyWheelColor;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sporty.android.platform.features.luckywheel.components.LuckyWheelKt$LuckyWheel$2$1$1", f = "LuckyWheel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g9u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ m6a0<LuckyWheelColor, ya5> a;
    public final /* synthetic */ LuckyWheelColor b;
    public final /* synthetic */ List<LuckyWheelColor> c;
    public final /* synthetic */ ytw d;
    public final /* synthetic */ osw e;
    public final /* synthetic */ ytw<Boolean> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9u(m6a0 m6a0Var, LuckyWheelColor luckyWheelColor, List list, ytw ytwVar, osw oswVar, ytw ytwVar2, v1b v1bVar) {
        super(2, v1bVar);
        this.a = m6a0Var;
        this.b = luckyWheelColor;
        this.c = list;
        this.d = ytwVar;
        this.e = oswVar;
        this.f = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g9u(this.a, this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g9u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ytw ytwVar = this.d;
        b01.b bVar = (b01.b) ytwVar.getValue();
        boolean z = bVar instanceof b01.b.d;
        ytw<Boolean> ytwVar2 = this.f;
        List<LuckyWheelColor> list = this.c;
        m6a0<LuckyWheelColor, ya5> m6a0Var = this.a;
        LuckyWheelColor luckyWheelColor = this.b;
        osw oswVar = this.e;
        if (z) {
            b01.b bVar2 = (b01.b) ytwVar.getValue();
            bVar2.getClass();
            m6a0Var.put(luckyWheelColor, new za5(new BitmapShader(w70.a(new t70(zbn.c(((b01.b.d) bVar2).b.a))), qc0.a(2), qc0.a(2))));
            oswVar.k(oswVar.D() + 1);
            if (oswVar.D() >= list.size()) {
                ytwVar2.setValue(Boolean.FALSE);
            }
        } else if (bVar instanceof b01.b.C0106b) {
            m6a0Var.put(luckyWheelColor, new soa0(j9u.b(luckyWheelColor)));
            oswVar.k(oswVar.D() + 1);
            if (oswVar.D() >= list.size()) {
                ytwVar2.setValue(Boolean.FALSE);
            }
        }
        return Unit.a;
    }
}
