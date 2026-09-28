package defpackage;

import androidx.fragment.app.FragmentManager;
import com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig;
import com.sporty.android.core.model.config.VersionData;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.android.update.data.VersionUpdateInput;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$showForceUpdateDialogIfNeeded$1", f = "CashOutFragment.kt", l = {2516}, m = "invokeSuspend", v = 2)
public final class fl6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl6(b bVar, v1b<? super fl6> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fl6(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fl6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        final b bVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            y1i0 y1i0Var = (y1i0) bVar.a0.getValue();
            this.a = 1;
            obj = y1i0Var.x1(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        Pair pair = (Pair) obj;
        if (pair == null) {
            return Unit.a;
        }
        VersionAutoUpdateConfig versionAutoUpdateConfig = (VersionAutoUpdateConfig) pair.a;
        final VersionData versionData = (VersionData) pair.b;
        y1i0 y1i0Var2 = (y1i0) bVar.a0.getValue();
        kkh0 kkh0Var = bVar.K;
        if (kkh0Var == null) {
            Intrinsics.n("updateNavigator");
            throw null;
        }
        y1i0Var2.y1(kkh0Var);
        i2i0 i2i0VarM0 = i2i0.m0(new VersionUpdateInput.DefaultContent(versionAutoUpdateConfig, versionData), new i2i0.b() { // from class: el6
            @Override // i2i0.b
            public final void a() {
                ((y1i0) bVar.a0.getValue()).a.i(versionData);
            }
        });
        FragmentManager childFragmentManager = bVar.getChildFragmentManager();
        childFragmentManager.getClass();
        i2i0VarM0.show(childFragmentManager, "VersionUpdateDialogFragment");
        return Unit.a;
    }
}
