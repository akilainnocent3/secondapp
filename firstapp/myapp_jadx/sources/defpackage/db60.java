package defpackage;

import com.esotericsoftware.spine.android.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.card.SBCardKt$WinLine$3$1", f = "SBCard.kt", l = {}, m = "invokeSuspend", v = 1)
public final class db60 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ytw<Boolean> b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db60(ytw<Boolean> ytwVar, boolean z, b bVar, v1b<? super db60> v1bVar) {
        super(2, v1bVar);
        this.b = ytwVar;
        this.c = z;
        this.d = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        db60 db60Var = new db60(this.b, this.c, this.d, v1bVar);
        db60Var.a = obj;
        return db60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((db60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.b.getValue().booleanValue()) {
            try {
                zi50.a aVar = zi50.b;
                boolean z = this.c;
                b bVar = this.d;
                if (z) {
                    bVar.a().m(0, "animation", false);
                } else {
                    bVar.a().h();
                    Unit unit = Unit.a;
                }
            } catch (Throwable unused) {
                zi50.a aVar2 = zi50.b;
            }
        }
        return Unit.a;
    }
}
