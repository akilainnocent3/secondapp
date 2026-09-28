package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.share.manager.ShareImageProviders$generateShareImagesAsync$1", f = "ShareImageProviders.kt", l = {13}, m = "invokeSuspend", v = 2)
public final class a190 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ss30 a;
    public int b;
    public final /* synthetic */ ss30 c;
    public final /* synthetic */ t090 d;
    public final /* synthetic */ b190 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a190(ss30 ss30Var, t090 t090Var, b190 b190Var, v1b v1bVar) {
        super(2, v1bVar);
        this.c = ss30Var;
        this.d = t090Var;
        this.e = b190Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a190(this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a190) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ss30 ss30Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            ss30 ss30Var2 = this.c;
            this.a = ss30Var2;
            this.b = 1;
            Object objA = this.d.a(this.e, this);
            if (objA == y5bVar) {
                return y5bVar;
            }
            obj = objA;
            ss30Var = ss30Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ss30Var = this.a;
            uj50.b(obj);
        }
        ss30Var.accept(obj);
        return Unit.a;
    }
}
