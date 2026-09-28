package defpackage;

import com.esotericsoftware.spine.android.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.onepunch.components.MultiplierComponentKt$MultiplierComponent$1$1$3$2$1", f = "MultiplierComponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class pow extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<b> a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ytw<String> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pow(v1b v1bVar, ytw ytwVar, ytw ytwVar2, String str) {
        super(2, v1bVar);
        this.a = ytwVar;
        this.b = str;
        this.c = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        String str = this.b;
        return new pow(v1bVar, this.a, this.c, str);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pow) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b value = this.a.getValue();
        if (value == null) {
            return Unit.a;
        }
        ytw<String> ytwVar = this.c;
        String value2 = ytwVar.getValue();
        String str = this.b;
        if (!Intrinsics.g(value2, str)) {
            ytwVar.setValue(str);
            value.a().m(0, str, Intrinsics.g(str, "Stance"));
        }
        return Unit.a;
    }
}
