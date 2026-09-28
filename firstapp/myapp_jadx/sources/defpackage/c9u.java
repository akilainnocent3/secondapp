package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.newcms.b;
import com.sportygames.newcms.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lc9u;", "Landroidx/fragment/app/Fragment;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "Lxjj;", "<init>", "()V", "Lpui0;", "state", "Lcom/sportygames/newcms/b;", "cmsRepo", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c9u extends Fragment implements GameMainActivity.b, xjj {
    public GameDetails a;
    public final ttr b;

    public static final class a implements Function0<Fragment> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return c9u.this;
        }
    }

    public static final class b implements Function0<yui0> {
        public final /* synthetic */ a b;
        public final /* synthetic */ z8u c;

        public b(a aVar, z8u z8uVar) {
            this.b = aVar;
            this.c = z8uVar;
        }

        /* JADX WARN: Type inference failed for: r7v1, types: [j8i0, yui0] */
        @Override // kotlin.jvm.functions.Function0
        public final yui0 invoke() {
            v8i0 viewModelStore = c9u.this.getViewModelStore();
            c9u c9uVar = c9u.this;
            cyb defaultViewModelCreationExtras = c9uVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(yui0.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(c9uVar), this.c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z8u] */
    public c9u() {
        ?? r0 = new Function0() { // from class: z8u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GameDetails gameDetails = this.a.a;
                if (gameDetails == null) {
                    Intrinsics.n("gameDetails");
                    throw null;
                }
                String name = gameDetails.getName();
                if (name == null) {
                    name = "";
                }
                return new wrz(2, ay0.U(new Object[]{new amj(name)}));
            }
        };
        this.b = hwr.a(a1s.c, new b(new a(), r0));
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
        e activity = getActivity();
        if (activity != null) {
            zpe0 zpe0Var = zpe0.a;
            elf.a(activity, new aqe0(0, 0, 2, zpe0Var), new aqe0(0, 0, 2, zpe0Var));
        }
        ((yui0) this.b.getValue()).C1();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(464216683, new Function2() { // from class: y8u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                final c9u c9uVar = this.a;
                ttr ttrVar = c9uVar.b;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ytw ytwVarC = wyh.c(((yui0) ttrVar.getValue()).d0, aVar, 0, 7);
                    final ytw ytwVarC2 = wyh.c(((yui0) ttrVar.getValue()).E, aVar, 0, 7);
                    orp.a(sjj.a(), pp8.b(-131042038, new Function2() { // from class: a9u
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                b bVar = (b) ytwVarC2.getValue();
                                final c9u c9uVar2 = c9uVar;
                                final twd0 twd0Var = ytwVarC;
                                c.a(bVar, pp8.b(-1590499645, new Function2() { // from class: b9u
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        a aVar3 = (a) obj5;
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        int i = 1;
                                        if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            pui0 pui0Var = (pui0) twd0Var.getValue();
                                            c9u c9uVar3 = c9uVar2;
                                            yui0 yui0Var = (yui0) c9uVar3.b.getValue();
                                            boolean zA = aVar3.A(yui0Var);
                                            Object objY = aVar3.y();
                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                            if (zA || objY == c0042a) {
                                                euf eufVar = new euf(1, yui0Var, yui0.class, "handleEvent", "handleEvent(Lcom/sportygames/wheelanddeal/WDEvent;)V", 0);
                                                aVar3.r(eufVar);
                                                objY = eufVar;
                                            }
                                            Function1 function1 = (Function1) ((chp) objY);
                                            boolean zA2 = aVar3.A(c9uVar3);
                                            Object objY2 = aVar3.y();
                                            if (zA2 || objY2 == c0042a) {
                                                objY2 = new hlk(c9uVar3, i);
                                                aVar3.r(objY2);
                                            }
                                            aui0.a(pui0Var, function1, (Function0) objY2, aVar3, 8);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), aVar2, 48);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 48);
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
}
