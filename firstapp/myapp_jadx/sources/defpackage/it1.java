package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crazyrider.components.BackgroundViewKt$GameScreenBackground$1$1", f = "BackgroundView.kt", l = {}, m = "invokeSuspend", v = 1)
public final class it1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ String a;
    public final /* synthetic */ ytw<Boolean> b;
    public final /* synthetic */ ytw<Boolean> c;
    public final /* synthetic */ ytw<Boolean> d;
    public final /* synthetic */ ytw<Boolean> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it1(String str, ytw<Boolean> ytwVar, ytw<Boolean> ytwVar2, ytw<Boolean> ytwVar3, ytw<Boolean> ytwVar4, v1b<? super it1> v1bVar) {
        super(2, v1bVar);
        this.a = str;
        this.b = ytwVar;
        this.c = ytwVar2;
        this.d = ytwVar3;
        this.e = ytwVar4;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new it1(this.a, this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((it1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (Intrinsics.g(this.a, "ROUND_WAITING")) {
            mt1.c(this.b, false);
            mt1.d(this.c, false);
            mt1.e(this.d, false);
            this.e.setValue(Boolean.FALSE);
        }
        return Unit.a;
    }
}
