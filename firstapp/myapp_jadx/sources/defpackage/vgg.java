package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.evenodd.views.fragments.EvenOddFragment$showCampaignToast$1", f = "EvenOddFragment.kt", l = {1943}, m = "invokeSuspend", v = 1)
public final class vgg extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fgg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgg(fgg fggVar, v1b<? super vgg> v1bVar) {
        super(2, v1bVar);
        this.b = fggVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vgg(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vgg) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(1800L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        fgg fggVar = this.b;
        if (fggVar.getActivity() != null) {
            jhg jhgVar = (jhg) fggVar.b;
            if (jhgVar != null) {
                jhgVar.L.setVisibility(8);
            }
            jhg jhgVar2 = (jhg) fggVar.b;
            if (jhgVar2 != null) {
                jhgVar2.L.setClickable(false);
            }
        }
        return Unit.a;
    }
}
