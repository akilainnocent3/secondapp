package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.ghaccount.register.GHAccountRegisterViewModel$submit$3", f = "GHAccountRegisterViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class scj extends tje0 implements Function2<lk50<? extends Void>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ tcj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scj(tcj tcjVar, v1b<? super scj> v1bVar) {
        super(2, v1bVar);
        this.b = tcjVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        scj scjVar = new scj(this.b, v1bVar);
        scjVar.a = obj;
        return scjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Void> lk50Var, v1b<? super Unit> v1bVar) {
        return ((scj) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.b;
        tcj tcjVar = this.b;
        if (z) {
            ohp<Object>[] ohpVarArr = tcj.y;
            tcjVar.y1(jdj.a(tcjVar.x1(), null, null, uxs.LOADING, zs00.c.a, 127));
        } else if (lk50Var instanceof lk50.c) {
            ohp<Object>[] ohpVarArr2 = tcj.y;
            tcjVar.y1(jdj.a(tcjVar.x1(), null, null, null, zs00.b.a, 255));
            tcjVar.v.a(new fdj.e(tcjVar.x1().f.a.b));
            tcjVar.z1();
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            Throwable th = ((lk50.a) lk50Var).a;
            ohp<Object>[] ohpVarArr3 = tcj.y;
            if (th instanceof SprThrowable) {
                tcjVar.getClass();
                SprThrowable sprThrowable = (SprThrowable) th;
                int d = sprThrowable.getD();
                if (d == 11600) {
                    tcjVar.y1(jdj.a(tcjVar.x1(), null, null, null, new zs00.a(vch0.d(sprThrowable.getE()), true), 255));
                } else if (d == 11601) {
                    tcjVar.y1(jdj.a(tcjVar.x1(), null, null, null, zs00.b.a, 255));
                    tcjVar.v.a(new fdj.e(tcjVar.x1().f.a.b));
                } else if (d != 11611) {
                    tcjVar.y1(jdj.a(tcjVar.x1(), null, null, null, new zs00.a(vch0.d(sprThrowable.getE())), 255));
                } else {
                    tcjVar.y1(jdj.a(tcjVar.x1(), null, null, null, new zs00.a(vch0.d(sprThrowable.getE()), true), 255));
                }
            } else {
                jdj jdjVarX1 = tcjVar.x1();
                StringUiText stringUiText = vch0.a;
                tcjVar.y1(jdj.a(jdjVarX1, null, null, null, new zs00.a(new ResourceUiText(R.string.common_feedback__something_went_wrong_tip)), 255));
            }
            tcjVar.z1();
        }
        return Unit.a;
    }
}
