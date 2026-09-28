package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Market;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.presentation.smartremix.HighLiabilitySmartRemixViewModel$onSmartRemixConfirmationConfirmed$1", f = "HighLiabilitySmartRemixViewModel.kt", l = {104}, m = "invokeSuspend", v = 2)
public final class hkl extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ gkl b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Integer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkl(gkl gklVar, ArrayList arrayList, String str, Integer num, v1b v1bVar) {
        super(2, v1bVar);
        this.b = gklVar;
        this.c = arrayList;
        this.d = str;
        this.e = num;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hkl(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hkl) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        gkl gklVar = this.b;
        jrm jrmVar = gklVar.d;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ArrayList arrayList = this.c;
            if (!arrayList.isEmpty()) {
                j8s j8sVarW = jrmVar.w();
                if (j8sVarW instanceof j8s.c) {
                    jrmVar.k0(j8s.c.a((j8s.c) j8sVarW, true));
                }
                jrmVar.G(true);
                gklVar.e.clear();
                gklVar.f.clear();
                if (!jrmVar.W()) {
                    jrmVar.r0(k53.REAL);
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    Selection selection = (Selection) obj2;
                    Market market = selection.b;
                    if (market.outcomes != null && market.status != 3) {
                        jrmVar.j0(selection.a, market, selection.c, k980.DEFAULT);
                    }
                }
            }
            b390 b390Var = gklVar.w;
            j2a0.a aVar = new j2a0.a(this.d, this.e);
            this.a = 1;
            if (b390Var.emit(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        gklVar.y1(null, ((k2a0) gklVar.i.getValue()).a);
        return Unit.a;
    }
}
