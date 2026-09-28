package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.payment.deposit.presentation.fragment.AddNewMobileNumberDialogFragment$initViewModel$1$6", f = "AddNewMobileNumberDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zj extends tje0 implements Function2<a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ pj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(pj pjVar, v1b<? super zj> v1bVar) {
        super(2, v1bVar);
        this.b = pjVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zj zjVar = new zj(this.b, v1bVar);
        zjVar.a = obj;
        return zjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, v1b<? super Unit> v1bVar) {
        return ((zj) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a aVar = (a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        pj pjVar = this.b;
        e eVar = pjVar.w;
        if (eVar == null) {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
        zui zuiVar = pjVar.y;
        if (zuiVar != null) {
            eVar.d(aVar, pjVar, zuiVar.a, null);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
