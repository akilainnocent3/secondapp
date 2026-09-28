package defpackage;

import com.sportybet.plugin.realsports.data.OutrightDisplayData;
import com.sportybet.plugin.realsports.outrights.detail.OutrightsActivity;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.outrights.detail.OutrightsActivity$observeOutright$2", f = "OutrightsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class icz extends tje0 implements Function2<lk50<? extends List<? extends OutrightDisplayData>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ OutrightsActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icz(OutrightsActivity outrightsActivity, v1b<? super icz> v1bVar) {
        super(2, v1bVar);
        this.b = outrightsActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        icz iczVar = new icz(this.b, v1bVar);
        iczVar.a = obj;
        return iczVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends OutrightDisplayData>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((icz) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = OutrightsActivity.F;
        boolean z = lk50Var instanceof lk50.a;
        OutrightsActivity outrightsActivity = this.b;
        if (z) {
            abz abzVar = outrightsActivity.e;
            if (abzVar == null) {
                Intrinsics.n("outrightCategoryAdapter");
                throw null;
            }
            abzVar.i(m2g.a);
            abz abzVar2 = outrightsActivity.e;
            if (abzVar2 == null) {
                Intrinsics.n("outrightCategoryAdapter");
                throw null;
            }
            abzVar2.c = true;
        } else if (lk50Var instanceof lk50.c) {
            abz abzVar3 = outrightsActivity.e;
            if (abzVar3 == null) {
                Intrinsics.n("outrightCategoryAdapter");
                throw null;
            }
            T t = ((lk50.c) lk50Var).a;
            Collection collection = (Collection) t;
            if (collection.isEmpty()) {
                collection = m2g.a;
            }
            abzVar3.i((List) collection);
            abz abzVar4 = outrightsActivity.e;
            if (abzVar4 == null) {
                Intrinsics.n("outrightCategoryAdapter");
                throw null;
            }
            abzVar4.c = ((List) t).isEmpty();
        }
        return Unit.a;
    }
}
