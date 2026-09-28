package defpackage;

import com.esotericsoftware.spine.android.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.sportyherocompose.components.MultipliercomponentKt$Multipliercomponent$2$1", f = "Multipliercomponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class jrw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<b> a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrw(ytw<b> ytwVar, String str, boolean z, v1b<? super jrw> v1bVar) {
        super(2, v1bVar);
        this.a = ytwVar;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jrw(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jrw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b value = this.a.getValue();
        if (value != null) {
            value.a().m(0, this.b, this.c);
        }
        return Unit.a;
    }
}
