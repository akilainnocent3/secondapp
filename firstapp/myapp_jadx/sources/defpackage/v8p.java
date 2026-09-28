package defpackage;

import com.esotericsoftware.spine.android.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyjet.components.JetAnimationKt$JetAnimation$5$1", f = "JetAnimation.kt", l = {}, m = "invokeSuspend", v = 1)
public final class v8p extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<b> a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8p(v1b v1bVar, ytw ytwVar, String str) {
        super(2, v1bVar);
        this.a = ytwVar;
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new v8p(v1bVar, this.a, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((v8p) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b value = this.a.getValue();
        if (value != null) {
            value.a().m(0, this.b, true);
        }
        return Unit.a;
    }
}
