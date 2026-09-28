package defpackage;

import com.esotericsoftware.spine.android.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportykick.components.WaitingComponentKt$WaitingComponent$1$1", f = "WaitingComponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class nwi0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<b> a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwi0(v1b v1bVar, ytw ytwVar, String str) {
        super(2, v1bVar);
        this.a = ytwVar;
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nwi0(v1bVar, this.a, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nwi0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b value = this.a.getValue();
        if (value != null) {
            zi0 zi0VarA = value.a();
            String str = this.b;
            zi0VarA.m(0, Intrinsics.g(str, "ROUND_PRE_START") ? "kick-sb" : "idle-sb", Intrinsics.g(str, "ROUND_WAITING"));
        }
        return Unit.a;
    }
}
