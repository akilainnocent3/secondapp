package defpackage;

import com.sportybet.android.instantwin.presentation.promotiondialog.model.InstantWinPromotionDialogInput;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.manager.promotion.InstantWinPromotionManagerImpl$promotionDialogFlow$3$2", f = "InstantWinPromotionManagerImpl.kt", l = {159}, m = "invokeSuspend", v = 2)
public final class tio extends tje0 implements iaj<myh<? super InstantWinPromotionDialogInput>, Throwable, Long, v1b<? super Boolean>, Object> {
    public int a;
    public /* synthetic */ long b;

    @Override // defpackage.iaj
    public final Object d(myh<? super InstantWinPromotionDialogInput> myhVar, Throwable th, Long l, v1b<? super Boolean> v1bVar) {
        long jLongValue = l.longValue();
        tio tioVar = new tio(4, v1bVar);
        tioVar.b = jLongValue;
        return tioVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        long j = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        boolean z = true;
        if (i == 0) {
            uj50.b(obj);
            if (j < 2) {
                this.b = j;
                this.a = 1;
                if (hkd.b((1 + j) * 1500, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                z = false;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Boolean.valueOf(z);
    }
}
