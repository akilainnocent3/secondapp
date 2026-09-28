package defpackage;

import com.sportybet.plugin.realsports.data.GiftGrabResult;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.lgg.confirm.GiftGrabConfirmViewModel$giftGrab$2", f = "GiftGrabConfirmViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fkk extends tje0 implements Function2<lk50<? extends GiftGrabResult>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ gkk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkk(gkk gkkVar, v1b<? super fkk> v1bVar) {
        super(2, v1bVar);
        this.b = gkkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fkk fkkVar = new fkk(this.b, v1bVar);
        fkkVar.a = obj;
        return fkkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends GiftGrabResult> lk50Var, v1b<? super Unit> v1bVar) {
        return ((fkk) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        cmk cVar;
        hmk hmkVar;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ohp<Object>[] ohpVarArr = gkk.w;
        gkk gkkVar = this.b;
        vwd0 vwd0Var = gkkVar.f;
        ohp<?>[] ohpVarArr2 = gkk.w;
        cmk cmkVar = (cmk) vwd0Var.a(gkkVar, ohpVarArr2[0]);
        if (!(cmkVar instanceof cmk.b)) {
            cmkVar = null;
        }
        cmk.b bVar = (cmk.b) cmkVar;
        if (bVar != null) {
            boolean z = lk50Var instanceof lk50.b;
            if (z) {
                uxs uxsVar = uxs.LOADING;
                String str = bVar.a;
                String str2 = bVar.b;
                boolean z2 = bVar.d;
                str.getClass();
                str2.getClass();
                cVar = new cmk.b(uxsVar, str, str2, z2);
            } else {
                boolean z3 = lk50Var instanceof lk50.c;
                cVar = cmk.d.a;
                if (z3) {
                    GiftGrabResult giftGrabResult = (GiftGrabResult) ((lk50.c) lk50Var).a;
                    int resultCode = giftGrabResult.getResultCode();
                    if (resultCode == 10) {
                        hmk hmkVar2 = gkkVar.d;
                        if (hmkVar2 != null) {
                            wwd0 wwd0Var = hmkVar2.H;
                            Boolean bool = Boolean.TRUE;
                            wwd0Var.getClass();
                            wwd0Var.k(null, bool);
                        }
                        cVar = new cmk.c(bjb0.U(giftGrabResult.getAmount(), Locale.US), giftGrabResult.getCurrency());
                    } else if (resultCode == 30) {
                        cVar = cmk.a.a;
                    }
                } else if (!(lk50Var instanceof lk50.a)) {
                    uhc.a();
                    return null;
                }
            }
            gkkVar.f.b(gkkVar, ohpVarArr2[0], cVar);
            if (!z && (hmkVar = gkkVar.d) != null) {
                hmkVar.z1();
            }
        }
        return Unit.a;
    }
}
