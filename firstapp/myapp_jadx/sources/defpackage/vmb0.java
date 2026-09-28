package defpackage;

import com.esotericsoftware.spine.android.b;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.sportycar.components.SportyCarMultiplierSpineKt$SportyCarSpeedometerSpine$2$1$1", f = "SportyCarMultiplierSpine.kt", l = {}, m = "invokeSuspend", v = 1)
public final class vmb0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<b> a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ float d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmb0(ytw<b> ytwVar, boolean z, String str, float f, String str2, v1b<? super vmb0> v1bVar) {
        super(2, v1bVar);
        this.a = ytwVar;
        this.b = z;
        this.c = str;
        this.d = f;
        this.e = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vmb0(this.a, this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vmb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b value = this.a.getValue();
        if (value == null) {
            return Unit.a;
        }
        if (this.b) {
            value.a().h = 0.0f;
            return Unit.a;
        }
        value.a().h = 1.0f;
        Pair<String, Boolean> pairF = umb0.f(this.c);
        umb0.e(value, pairF.a, pairF.b.booleanValue(), this.d, null, false, 0.0f);
        return Unit.a;
    }
}
