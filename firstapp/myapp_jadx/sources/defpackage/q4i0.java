package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.article.presentation.viewmodel.VideoDetailViewModel$loadVideoDetail$1", f = "VideoDetailViewModel.kt", l = {100}, m = "invokeSuspend", v = 2)
public final class q4i0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ p4i0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4i0(p4i0 p4i0Var, String str, v1b<? super q4i0> v1bVar) {
        super(2, v1bVar);
        this.b = p4i0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q4i0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((q4i0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object value2;
        p4i0 p4i0Var = this.b;
        wwd0 wwd0Var = p4i0Var.e;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            rgk rgkVar = p4i0Var.b;
            this.a = 1;
            objA = rgkVar.a(this.c, this);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        if (zi50.a(objA) == null) {
            o3i0 o3i0Var = (o3i0) objA;
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, o4i0.a((o4i0) value2, false, o3i0Var, null, false, false, null, false, 116)));
            p4i0Var.d.g(new z4i0.a(o3i0Var.a, o3i0Var.g));
        } else {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, o4i0.a((o4i0) value, false, null, null, true, false, null, false, 118)));
        }
        return Unit.a;
    }
}
