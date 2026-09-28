package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$customCodeName$1", f = "CustomCodeViewModel.kt", l = {355}, m = "invokeSuspend", v = 2)
public final class vcc extends tje0 implements Function2<myh<? super lk50<? extends Pair<? extends String, ? extends String>>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bdc c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcc(bdc bdcVar, String str, String str2, v1b<? super vcc> v1bVar) {
        super(2, v1bVar);
        this.c = bdcVar;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vcc vccVar = new vcc(this.c, this.d, this.e, v1bVar);
        vccVar.b = obj;
        return vccVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends Pair<? extends String, ? extends String>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((vcc) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String strX1;
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            jdc jdcVar = (jdc) this.c.y.getValue();
            boolean z = jdcVar instanceof jdc.a;
            String str = this.e;
            String str2 = this.d;
            if (z) {
                strX1 = bdc.x1(str2, str, ((jdc.a) jdcVar).a.a);
            } else {
                strX1 = jdcVar instanceof jdc.d ? bdc.x1(str2, str, ((jdc.d) jdcVar).a.a) : "";
            }
            lk50 aVar = str2.length() == 0 ? new lk50.a(new Throwable("username not found")) : new lk50.c(new Pair(strX1, str2));
            this.b = null;
            this.a = 1;
            if (myhVar.emit(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
