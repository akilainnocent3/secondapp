package defpackage;

import com.esotericsoftware.spine.android.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyjet.components.JetAnimationKt$JetAnimation$1$1", f = "JetAnimation.kt", l = {}, m = "invokeSuspend", v = 1)
public final class s8p extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ytw<Boolean> b;
    public final /* synthetic */ ytw<b> c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8p(boolean z, ytw<Boolean> ytwVar, ytw<b> ytwVar2, String str, v1b<? super s8p> v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = ytwVar;
        this.c = ytwVar2;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s8p(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s8p) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = this.a;
        ytw<b> ytwVar = this.c;
        if (z) {
            String str = this.b.getValue().booleanValue() ? "Sporty_Santa_Jet" : "Sporty_Jet";
            b value = ytwVar.getValue();
            if (value != null) {
                value.a().m(0, str, true);
            }
        } else {
            b value2 = ytwVar.getValue();
            if (value2 != null) {
                value2.a().m(0, this.d, true);
            }
        }
        return Unit.a;
    }
}
