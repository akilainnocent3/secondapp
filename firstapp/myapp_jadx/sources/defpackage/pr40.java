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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lpr40;", "Landroidx/fragment/app/Fragment;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "Lxjj;", "<init>", "()V", "Lcom/sportygames/newcms/b;", "cmsResource", "Lsq30;", "state", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class pr40 extends Fragment implements GameMainActivity.b, xjj {
    public GameDetails a;
    public final ttr b;

    public static final /* synthetic */ class a extends saj implements Function1<rn30, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(rn30 rn30Var) {
            rn30 rn30Var2 = rn30Var;
            rn30Var2.getClass();
            ((zr40) this.receiver).A1(rn30Var2);
            return Unit.a;
        }
    }

    public static final class b implements Function0<Fragment> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return pr40.this;
        }
    }

    public static final class c implements Function0<zr40> {
        public final /* synthetic */ b b;
        public final /* synthetic */ oa4 c;

        public c(b bVar, oa4 oa4Var) {
            this.b = bVar;
            this.c = oa4Var;
        }

        /* JADX WARN: Type inference failed for: r7v1, types: [j8i0, zr40] */
        @Override // kotlin.jvm.functions.Function0
        public final zr40 invoke() {
            v8i0 viewModelStore = pr40.this.getViewModelStore();
            pr40 pr40Var = pr40.this;
            cyb defaultViewModelCreationExtras = pr40Var.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(zr40.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(pr40Var), this.c);
        }
    }

    public pr40() {
        oa4 oa4Var = new oa4(this, 1);
        this.b = hwr.a(a1s.c, new c(new b(), oa4Var));
    }

    public final void j0(final int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-1424050406);
        int i2 = (bVarI.A(this) ? 4 : 2) | i;
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            orp.a(sjj.a(), pp8.b(263022713, new sa4(this, i3), bVarI), bVarI, 48);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: mr40
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

    public final zr40 m0() {
        return (zr40) this.b.getValue();
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
        composeView.setContent(new op8(1021521273, new Function2() { // from class: lr40
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
        m0().A1(rn30.q.a);
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
