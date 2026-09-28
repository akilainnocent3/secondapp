package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.newcms.b;
import com.sportygames.newcms.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lhua0;", "Landroidx/fragment/app/Fragment;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "Lxjj;", "<init>", "()V", "Lcom/sportygames/newcms/b;", "cmsResource", "Leg60;", "state", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class hua0 extends Fragment implements GameMainActivity.b, xjj {
    public GameDetails a;
    public final ttr b;

    public static final /* synthetic */ class a extends saj implements Function1<vc60, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(vc60 vc60Var) {
            vc60 vc60Var2 = vc60Var;
            vc60Var2.getClass();
            ((uua0) this.receiver).A1(vc60Var2);
            return Unit.a;
        }
    }

    public static final class b implements Function0<Fragment> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return hua0.this;
        }
    }

    public static final class c implements Function0<uua0> {
        public final /* synthetic */ b b;
        public final /* synthetic */ qha c;

        public c(b bVar, qha qhaVar) {
            this.b = bVar;
            this.c = qhaVar;
        }

        /* JADX WARN: Type inference failed for: r7v1, types: [j8i0, uua0] */
        @Override // kotlin.jvm.functions.Function0
        public final uua0 invoke() {
            v8i0 viewModelStore = hua0.this.getViewModelStore();
            hua0 hua0Var = hua0.this;
            cyb defaultViewModelCreationExtras = hua0Var.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(uua0.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(hua0Var), this.c);
        }
    }

    public hua0() {
        qha qhaVar = new qha(this, 2);
        this.b = hwr.a(a1s.c, new c(new b(), qhaVar));
    }

    public final void j0(final int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(67169953);
        int i2 = (bVarI.A(this) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            orp.a(sjj.a(), pp8.b(-199933790, new Function2() { // from class: eua0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final hua0 hua0Var = this.a;
                        final ytw ytwVarC = wyh.c(hua0Var.m0().X, aVar2, 0, 7);
                        final ytw ytwVarC2 = wyh.c(hua0Var.m0().Y, aVar2, 0, 7);
                        vob0.a(6, pp8.b(214340456, new Function2() { // from class: gua0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar3 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    c.a((b) ytwVarC.getValue(), pp8.b(-799723953, new ie60(hua0Var, ytwVarC2), aVar3), aVar3, 48);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 48);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: fua0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.j0(iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    public final uua0 m0() {
        return (uua0) this.b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        GameDetails gameDetails = arguments != null ? (GameDetails) arguments.getParcelable("key_game_details") : null;
        gameDetails.getClass();
        this.a = gameDetails;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            zpe0 zpe0Var = zpe0.a;
            elf.a(activity, new aqe0(0, 0, 2, zpe0Var), new aqe0(0, 0, 2, zpe0Var));
        }
        m0().y1();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new op8(-154072618, new Function2() { // from class: dua0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.a.j0(0, aVar);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m0().A1(vc60.v.a);
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void d0() {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
