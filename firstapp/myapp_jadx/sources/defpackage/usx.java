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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lusx;", "Landroidx/fragment/app/Fragment;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "Lxjj;", "<init>", "()V", "Lcom/sportygames/newcms/b;", "cmsResource", "Lebx;", "state", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class usx extends Fragment implements GameMainActivity.b, xjj {
    public GameDetails a;
    public final ttr b;

    public static final /* synthetic */ class a extends saj implements Function1<z8x, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(z8x z8xVar) {
            z8x z8xVar2 = z8xVar;
            z8xVar2.getClass();
            ((gux) this.receiver).z1(z8xVar2);
            return Unit.a;
        }
    }

    public static final class b implements Function0<Fragment> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return usx.this;
        }
    }

    public static final class c implements Function0<gux> {
        public final /* synthetic */ b b;
        public final /* synthetic */ bgj c;

        public c(b bVar, bgj bgjVar) {
            this.b = bVar;
            this.c = bgjVar;
        }

        /* JADX WARN: Type inference failed for: r7v1, types: [gux, j8i0] */
        @Override // kotlin.jvm.functions.Function0
        public final gux invoke() {
            v8i0 viewModelStore = usx.this.getViewModelStore();
            usx usxVar = usx.this;
            cyb defaultViewModelCreationExtras = usxVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(gux.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(usxVar), this.c);
        }
    }

    public usx() {
        bgj bgjVar = new bgj(this, 1);
        this.b = hwr.a(a1s.c, new c(new b(), bgjVar));
    }

    public final void j0(final int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-591283429);
        int i2 = (bVarI.A(this) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            orp.a(sjj.a(), pp8.b(-281564870, new Function2() { // from class: qsx
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    final usx usxVar = this.a;
                    ttr ttrVar = usxVar.b;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final ytw ytwVarC = wyh.c(((gux) ttrVar.getValue()).K, aVar2, 0, 7);
                        final ytw ytwVarC2 = wyh.c(((gux) ttrVar.getValue()).Q, aVar2, 0, 7);
                        vob0.a(6, pp8.b(-323965132, new Function2() { // from class: ssx
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar3 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    b bVar = (b) ytwVarC.getValue();
                                    final usx usxVar2 = usxVar;
                                    final twd0 twd0Var = ytwVarC2;
                                    c.a(bVar, pp8.b(-1695190739, new Function2() { // from class: tsx
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            a aVar4 = (a) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            int i3 = 2;
                                            if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                ebx ebxVar = (ebx) twd0Var.getValue();
                                                usx usxVar3 = usxVar2;
                                                gux guxVar = (gux) usxVar3.b.getValue();
                                                boolean zA = aVar4.A(guxVar);
                                                Object objY = aVar4.y();
                                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                                if (zA || objY == c0042a) {
                                                    usx.a aVar5 = new usx.a(1, guxVar, gux.class, "handleEvent", "handleEvent(Lcom/sportygames/nightnday/presentation/NNDEvent;)V", 0);
                                                    aVar4.r(aVar5);
                                                    objY = aVar5;
                                                }
                                                Function1 function1 = (Function1) ((chp) objY);
                                                boolean zA2 = aVar4.A(usxVar3);
                                                Object objY2 = aVar4.y();
                                                if (zA2 || objY2 == c0042a) {
                                                    objY2 = new r56(usxVar3, i3);
                                                    aVar4.r(objY2);
                                                }
                                                fux.a(ebxVar, function1, (Function0) objY2, aVar4, 0);
                                            } else {
                                                aVar4.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar3), aVar3, 48);
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
            eVarZ.d = new Function2(i) { // from class: rsx
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
        ((gux) this.b.getValue()).x1();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new op8(1739276575, new Function2() { // from class: psx
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
