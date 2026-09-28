package defpackage;

import android.content.res.Resources;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import nl.dionsegijn.konfetti.xml.KonfettiView;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.multilevel.common.components.CelebrationViewKt$CelebrationView$2$1", f = "CelebrationView.kt", l = {}, m = "invokeSuspend", v = 1)
public final class dv6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ytw<KonfettiView> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv6(boolean z, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dv6(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dv6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        KonfettiView value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a && (value = this.b.getValue()) != null) {
            List listK = b.k(new xw90(1.0f, 3, 4), new xw90(1.2f, 4, 4));
            List listK2 = b.k(new Integer(-204406), new Integer(-36243), new Integer(-774035), new Integer(-4944401), new Integer(-12326533));
            TimeUnit.MILLISECONDS.getClass();
            x0g x0gVar = new x0g();
            x0gVar.a = 650L;
            x0gVar.b = 0.0125f;
            value.a.add(new kuz(value.b(new guz(listK, listK2, new i620.b(new i620.c(0.0d, 0.0d), new i620.c(1.0d, 0.0d)), x0gVar, 7040)), Resources.getSystem().getDisplayMetrics().density));
            value.invalidate();
        }
        return Unit.a;
    }
}
