package defpackage;

import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositBankTransferFragment$initViewModel$2", f = "DepositBankTransferFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qod extends tje0 implements Function2<z200, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ nod b;
    public final /* synthetic */ dq40<z200> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qod(nod nodVar, dq40<z200> dq40Var, v1b<? super qod> v1bVar) {
        super(2, v1bVar);
        this.b = nodVar;
        this.c = dq40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qod qodVar = new qod(this.b, this.c, v1bVar);
        qodVar.a = obj;
        return qodVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(z200 z200Var, v1b<? super Unit> v1bVar) {
        return ((qod) create(z200Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, z200] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ?? r0 = (z200) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ohp<Object>[] ohpVarArr = nod.d;
        nod nodVar = this.b;
        y200 y200Var = (y200) nodVar.m0().i.getValue();
        nodVar.j0().d.setAdapter(new nod.a(nodVar, r0.a));
        ViewPager2 viewPager2 = nodVar.j0().d;
        List<y200> list = r0.a;
        int i = 0;
        viewPager2.setCurrentItem(CollectionsKt.X(list, y200Var), false);
        nodVar.j0().c.setVisibility(list.isEmpty() ? 8 : 0);
        nodVar.j0().c.n();
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            y200 y200Var2 = (y200) obj2;
            TabLayout.g gVarL = nodVar.j0().c.l();
            gVarL.a = y200Var2.j();
            gVarL.d = y200Var2.i();
            gVarL.f();
            ResourceUiText resourceUiTextH = y200Var2.h();
            Context contextRequireContext = nodVar.requireContext();
            contextRequireContext.getClass();
            gVarL.e(resourceUiTextH.e(contextRequireContext));
            nodVar.j0().c.c(gVarL, i, Intrinsics.g(y200Var, y200Var2));
            i = i2;
        }
        this.c.a = r0;
        return Unit.a;
    }
}
