package defpackage;

import com.sporty.android.core.model.cms.CMSResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.usecase.GetPayHintDescriptionLinesUseCase$invoke$cmsResponsesResult$1", f = "GetPayHintDescriptionLinesUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cak extends tje0 implements Function2<lk50<? extends List<? extends CMSResponse>>, v1b<? super Boolean>, Object> {
    public /* synthetic */ Object a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cak cakVar = new cak(2, v1bVar);
        cakVar.a = obj;
        return cakVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends CMSResponse>> lk50Var, v1b<? super Boolean> v1bVar) {
        return ((cak) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(!Intrinsics.g(lk50Var, lk50.b.a));
    }
}
