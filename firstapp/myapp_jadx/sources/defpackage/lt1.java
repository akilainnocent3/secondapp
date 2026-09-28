package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crazyrider.components.BackgroundViewKt$GameScreenBackground$4$1", f = "BackgroundView.kt", l = {}, m = "invokeSuspend", v = 1)
public final class lt1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ String a;
    public final /* synthetic */ inj b;
    public final /* synthetic */ inj c;
    public final /* synthetic */ double d;
    public final /* synthetic */ ytw<Boolean> e;
    public final /* synthetic */ ytw<Boolean> f;
    public final /* synthetic */ ytw<Boolean> i;
    public final /* synthetic */ ytw<Boolean> v;
    public final /* synthetic */ ytw<Boolean> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt1(String str, inj injVar, inj injVar2, double d, ytw<Boolean> ytwVar, ytw<Boolean> ytwVar2, ytw<Boolean> ytwVar3, ytw<Boolean> ytwVar4, ytw<Boolean> ytwVar5, v1b<? super lt1> v1bVar) {
        super(2, v1bVar);
        this.a = str;
        this.b = injVar;
        this.c = injVar2;
        this.d = d;
        this.e = ytwVar;
        this.f = ytwVar2;
        this.i = ytwVar3;
        this.v = ytwVar4;
        this.w = ytwVar5;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lt1(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lt1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = this.a;
        if (Intrinsics.g(str, "ROUND_ONGOING") || Intrinsics.g(str, "ROUND_END_WAIT")) {
            int iOrdinal = this.b.ordinal();
            ytw<Boolean> ytwVar = this.i;
            ytw<Boolean> ytwVar2 = this.e;
            ytw<Boolean> ytwVar3 = this.f;
            if (iOrdinal != 0) {
                inj injVar = this.c;
                if (iOrdinal != 1) {
                    if (iOrdinal != 3) {
                        if (iOrdinal == 4 && injVar.compareTo(inj.e) <= 0) {
                            mt1.e(ytwVar3, true);
                            mt1.c(ytwVar2, false);
                            mt1.d(ytwVar, false);
                        }
                    } else if (injVar.compareTo(inj.d) <= 0) {
                        mt1.d(ytwVar, true);
                        mt1.c(ytwVar2, false);
                        mt1.e(ytwVar3, false);
                    }
                } else if (injVar.compareTo(inj.b) <= 0 && this.d < 1.8d) {
                    mt1.c(ytwVar2, true);
                    mt1.e(ytwVar3, false);
                    mt1.d(ytwVar, false);
                }
            } else {
                mt1.c(ytwVar2, false);
                mt1.e(ytwVar3, false);
                mt1.d(ytwVar, false);
            }
            Boolean value = this.v.getValue();
            value.getClass();
            this.w.setValue(value);
        }
        return Unit.a;
    }
}
