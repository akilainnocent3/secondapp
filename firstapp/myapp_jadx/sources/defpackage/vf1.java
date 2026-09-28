package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.AutoSizeTextKt$AutoSizeTextShared$1$1", f = "AutoSizeText.kt", l = {}, m = "invokeSuspend", v = 1)
public final class vf1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<omf0> a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ytw<omf0> d;
    public final /* synthetic */ ytw<omf0> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf1(ytw<omf0> ytwVar, long j, long j2, ytw<omf0> ytwVar2, ytw<omf0> ytwVar3, v1b<? super vf1> v1bVar) {
        super(2, v1bVar);
        this.a = ytwVar;
        this.b = j;
        this.c = j2;
        this.d = ytwVar2;
        this.e = ytwVar3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vf1(this.a, this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vf1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        omf0 value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ytw<omf0> ytwVar = this.a;
        if (ytwVar != null && (value = ytwVar.getValue()) != null) {
            long j = value.a;
            this.d.setValue(value);
            float fC = omf0.c(j) / omf0.c(this.c);
            long j2 = this.b;
            d2l.a(j2);
            this.e.setValue(new omf0(gkw.a(fC, j2, 1095216660480L & j2)));
        }
        return Unit.a;
    }
}
