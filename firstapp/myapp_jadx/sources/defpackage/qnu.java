package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.manage.viewmodel.ManageCustomCodeViewModel$onCodeValueChange$1", f = "ManageCustomCodeViewModel.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class qnu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rnu b;
    public final /* synthetic */ lnu c;
    public final /* synthetic */ gdc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnu(rnu rnuVar, lnu lnuVar, gdc gdcVar, v1b<? super qnu> v1bVar) {
        super(2, v1bVar);
        this.b = rnuVar;
        this.c = lnuVar;
        this.d = gdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qnu(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qnu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        rnu rnuVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = rnuVar.a;
            mnu mnuVarA = mnu.a((mnu) rnuVar.b.a.getValue(), true);
            wwd0Var.getClass();
            wwd0Var.k(null, mnuVarA);
            this.a = 1;
            if (hkd.b(1000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        int iOrdinal = this.c.ordinal();
        gdc gdcVar = this.d;
        if (iOrdinal == 0) {
            rnuVar.getClass();
            rnuVar.y1(new onu(rnuVar, gdcVar, null));
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return null;
            }
            rnuVar.getClass();
            rnuVar.y1(new nnu(rnuVar, gdcVar, null));
        }
        return Unit.a;
    }
}
