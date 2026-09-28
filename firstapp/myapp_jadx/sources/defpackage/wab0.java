package defpackage;

import com.sportygames.spinmatch.components.BetConfig;
import java.util.HashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.views.SpinMatchFragment$setupUiListeners$6$1", f = "SpinMatchFragment.kt", l = {630}, m = "invokeSuspend", v = 1)
public final class wab0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kab0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wab0(kab0 kab0Var, v1b<? super wab0> v1bVar) {
        super(2, v1bVar);
        this.b = kab0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wab0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wab0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        kk2 binding;
        kk2 binding2;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(300L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        kab0 kab0Var = this.b;
        fo80 fo80Var = kab0Var.c;
        if (fo80Var != null) {
            fo80Var.c0.E();
        }
        fo80 fo80Var2 = kab0Var.c;
        if (fo80Var2 != null) {
            BetConfig betConfig = fo80Var2.c;
            Set<Integer> setKeySet = kab0Var.f.keySet();
            setKeySet.getClass();
            betConfig.J(CollectionsKt.A0(setKeySet));
        }
        kab0Var.f = new HashMap<>();
        fo80 fo80Var3 = kab0Var.c;
        if (fo80Var3 != null) {
            fo80Var3.i.J(new Double(0.0d), new Double(0.0d));
        }
        fo80 fo80Var4 = kab0Var.c;
        if (fo80Var4 != null) {
            fo80Var4.i.I(false);
        }
        fo80 fo80Var5 = kab0Var.c;
        if (fo80Var5 != null) {
            fo80Var5.d.setVisibility(0);
        }
        fo80 fo80Var6 = kab0Var.c;
        if (fo80Var6 != null) {
            fo80Var6.i.setVisibility(0);
        }
        fo80 fo80Var7 = kab0Var.c;
        if (fo80Var7 != null) {
            fo80Var7.c.H();
        }
        fo80 fo80Var8 = kab0Var.c;
        if (fo80Var8 != null && (binding2 = fo80Var8.i.getBinding()) != null) {
            binding2.e.setText("--");
        }
        fo80 fo80Var9 = kab0Var.c;
        if (fo80Var9 != null && (binding = fo80Var9.i.getBinding()) != null) {
            binding.c.setText("--");
        }
        fo80 fo80Var10 = kab0Var.c;
        if (fo80Var10 != null) {
            fo80Var10.H.setVisibility(8);
        }
        kab0Var.p0();
        return Unit.a;
    }
}
