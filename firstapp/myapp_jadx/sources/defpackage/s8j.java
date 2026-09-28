package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportygames.fruithunt.viewmodels.FruitHuntViewModel$setEnabled$1", f = "FruitHuntViewModel.kt", l = {41}, m = "invokeSuspend", v = 1)
public final class s8j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ o8j b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8j(o8j o8jVar, boolean z, v1b<? super s8j> v1bVar) {
        super(2, v1bVar);
        this.b = o8jVar;
        this.c = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s8j(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s8j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = this.b.y;
            Boolean boolValueOf = Boolean.valueOf(this.c);
            this.a = 1;
            wwd0Var.getClass();
            wwd0Var.k(null, boolValueOf);
            if (Unit.a == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a(lobGSRIlnSGJY.CMJz);
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
