package defpackage;

import java.text.NumberFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.component.header.GameHeaderKt$GameHeader$2$1", f = "GameHeader.kt", l = {}, m = "invokeSuspend", v = 1)
public final class njj extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> a;
    public final /* synthetic */ double b;
    public final /* synthetic */ ytw<Boolean> c;
    public final /* synthetic */ ytw<j58> d;
    public final /* synthetic */ ytw<String> e;
    public final /* synthetic */ osw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njj(Function0<Unit> function0, double d, ytw<Boolean> ytwVar, ytw<j58> ytwVar2, ytw<String> ytwVar3, osw oswVar, v1b<? super njj> v1bVar) {
        super(2, v1bVar);
        this.a = function0;
        this.b = d;
        this.c = ytwVar;
        this.d = ytwVar2;
        this.e = ytwVar3;
        this.f = oswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new njj(this.a, this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((njj) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.invoke();
        double d = this.b;
        Boolean boolValueOf = Boolean.valueOf(d > 0.0d);
        ytw<Boolean> ytwVar = this.c;
        ytwVar.setValue(boolValueOf);
        boolean zBooleanValue = ytwVar.getValue().booleanValue();
        ytw<String> ytwVar2 = this.e;
        ytw<j58> ytwVar3 = this.d;
        if (zBooleanValue) {
            ytwVar3.setValue(new j58(r58.d(4279620393L)));
            NumberFormat numberFormat = d6f.a;
            ytwVar2.setValue("+".concat(d6f.a(Math.abs(d))));
        } else {
            ytwVar3.setValue(new j58(r58.d(4294451232L)));
            NumberFormat numberFormat2 = d6f.a;
            ytwVar2.setValue("-".concat(d6f.a(Math.abs(d))));
        }
        osw oswVar = this.f;
        oswVar.k(oswVar.D() + 1);
        return Unit.a;
    }
}
