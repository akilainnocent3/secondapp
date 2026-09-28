package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.foryou.presentation.ForYouFeedViewModel$follow$1", f = "ForYouFeedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class csi extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bsi b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csi(bsi bsiVar, String str, v1b<? super csi> v1bVar) {
        super(2, v1bVar);
        this.b = bsiVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        csi csiVar = new csi(this.b, this.c, v1bVar);
        csiVar.a = obj;
        return csiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((csi) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.c;
        boolean z2 = true;
        String str = this.c;
        bsi bsiVar = this.b;
        if (z) {
            bsiVar.D1(str, true, y7i.a.a);
            wuw<qqi> wuwVar = bsiVar.B;
            qqi.g gVar = new qqi.g(str);
            wuwVar.getClass();
            wuwVar.a.c(gVar);
        } else {
            boolean z3 = false;
            if (lk50Var instanceof lk50.a) {
                Throwable th = ((lk50.a) lk50Var).a;
                SprThrowable sprThrowable = (SprThrowable) (th instanceof SprThrowable ? th : null);
                if (sprThrowable != null) {
                    int d = sprThrowable.getD();
                    if (d != 17001) {
                        if (d != 17002) {
                        }
                        z3 = z2;
                    } else {
                        bsiVar.B.a(qqi.e.a);
                    }
                    z2 = false;
                    z3 = z2;
                }
                bsiVar.D1(str, z3, z3 ? y7i.a.a : y7i.c.a);
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                bsiVar.D1(str, false, y7i.b.a);
            }
        }
        return Unit.a;
    }
}
