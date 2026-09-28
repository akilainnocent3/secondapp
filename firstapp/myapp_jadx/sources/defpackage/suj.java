package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.compose.lobbyv2.models.LobbyConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsuj;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class suj extends Fragment {
    public Activity a;
    public c2t b;
    public SpinKitView c;
    public AppCompatButton d;
    public ConstraintLayout e;
    public LinearLayout f;
    public FrameLayout i;
    public final String v = "LOBBY_FRAGMENT";

    public static final class a implements lfy, paj {
        public final /* synthetic */ puj a;

        public a(puj pujVar) {
            this.a = pujVar;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public final void j0(Bundle bundle, boolean z, boolean z2) {
        if (this.a == null || getView() == null || this.i == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new quj(this, z2, z, bundle));
    }

    public final void m0() {
        ConstraintLayout constraintLayout = this.e;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        SpinKitView spinKitView = this.c;
        if (spinKitView != null) {
            spinKitView.setVisibility(8);
        }
        AppCompatButton appCompatButton = this.d;
        if (appCompatButton != null) {
            appCompatButton.setVisibility(0);
        }
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public final void n0() {
        ConstraintLayout constraintLayout = this.e;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        SpinKitView spinKitView = this.c;
        if (spinKitView != null) {
            spinKitView.setVisibility(8);
        }
        AppCompatButton appCompatButton = this.d;
        if (appCompatButton != null) {
            appCompatButton.setVisibility(8);
        }
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof Activity) {
            this.a = (Activity) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        v8i0 viewModelStore = eVarRequireActivity.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = eVarRequireActivity.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, sd7.a(eVarRequireActivity, viewModelStore, defaultViewModelProviderFactory));
        dq7 dq7VarA = jq40.a(c2t.class);
        String strI = dq7VarA.i();
        if (strI != null) {
            this.b = (c2t) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        } else {
            hb5.a("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.entrance_lobby, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        SportyGamesManager.getInstance().setScreenName("sportygames/lobby");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final String lobbyVariant;
        LinearLayout linearLayout;
        view.getClass();
        super.onViewCreated(view, bundle);
        try {
            if (getContext() != null) {
                SportyGamesManager.getInstance().setVersionCode(getContext());
                SportyGamesManager.getInstance().setScreenName("sportygames/lobby");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.e = (ConstraintLayout) view.findViewById(R.id.container_layout);
        this.f = (LinearLayout) view.findViewById(R.id.container_parent);
        ConstraintLayout constraintLayout = this.e;
        this.d = constraintLayout != null ? (AppCompatButton) constraintLayout.findViewById(R.id.retry_button) : null;
        ConstraintLayout constraintLayout2 = this.e;
        this.c = constraintLayout2 != null ? (SpinKitView) constraintLayout2.findViewById(R.id.loader) : null;
        this.i = (FrameLayout) view.findViewById(R.id.lobby_fragment_container);
        Fragment fragmentH = getChildFragmentManager().H(this.v);
        AppCompatButton appCompatButton = this.d;
        int i = 0;
        if (appCompatButton != null) {
            appCompatButton.setOnClickListener(new nuj(this, i));
        }
        Context context = getContext();
        if (context != null && (linearLayout = this.f) != null) {
            linearLayout.setBackgroundColor(context.getColor(R.color.dummy_lobby_placeholder_bg));
        }
        if (fragmentH != null) {
            n0();
        } else {
            ConstraintLayout constraintLayout3 = this.e;
            if (constraintLayout3 != null) {
                constraintLayout3.setVisibility(0);
            }
            SpinKitView spinKitView = this.c;
            if (spinKitView != null) {
                spinKitView.setVisibility(0);
            }
            AppCompatButton appCompatButton2 = this.d;
            if (appCompatButton2 != null) {
                appCompatButton2.setVisibility(8);
            }
            FrameLayout frameLayout = this.i;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        }
        if (fragmentH == null) {
            c2t c2tVar = this.b;
            if (c2tVar == null) {
                Intrinsics.n("viewModel");
                throw null;
            }
            LobbyConfig lobbyConfig = c2tVar.b;
            if (lobbyConfig != null) {
                Bundle bundleD = c2tVar.a.d();
                if (bundleD == null && (bundleD = getArguments()) == null) {
                    bundleD = new Bundle();
                }
                bundleD.putBoolean("isChristmasThemeEnabled", lobbyConfig.isChristmasThemeEnabled());
                j0(bundleD, lobbyConfig.newLobby(), lobbyConfig.webViewLobby());
                c2t c2tVar2 = this.b;
                if (c2tVar2 == null) {
                    Intrinsics.n("viewModel");
                    throw null;
                }
                if (c2tVar2.a.d() != null) {
                    c2t c2tVar3 = this.b;
                    if (c2tVar3 == null) {
                        Intrinsics.n("viewModel");
                        throw null;
                    }
                    c2tVar3.a.m(null);
                }
            }
            c2t c2tVar4 = this.b;
            if (c2tVar4 == null) {
                Intrinsics.n("viewModel");
                throw null;
            }
            LobbyConfig lobbyConfig2 = c2tVar4.b;
            if (lobbyConfig2 == null || (lobbyVariant = lobbyConfig2.getLobbyVariant()) == null) {
                lobbyVariant = "";
            }
            c2t c2tVar5 = this.b;
            if (c2tVar5 == null) {
                Intrinsics.n("viewModel");
                throw null;
            }
            if (c2tVar5.b == null) {
                ej5.c(o8i0.d(c2tVar5), null, null, new z1t(new r8t(), new Function1() { // from class: ouj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LobbyConfig lobbyConfig3 = (LobbyConfig) obj;
                        suj sujVar = this.a;
                        if (lobbyConfig3 == null) {
                            sujVar.m0();
                        } else if (!Intrinsics.g(lobbyConfig3.getLobbyVariant(), lobbyVariant)) {
                            c2t c2tVar6 = sujVar.b;
                            if (c2tVar6 == null) {
                                Intrinsics.n("viewModel");
                                throw null;
                            }
                            Bundle bundleD2 = c2tVar6.a.d();
                            if (bundleD2 == null && (bundleD2 = sujVar.getArguments()) == null) {
                                bundleD2 = new Bundle();
                            }
                            bundleD2.putBoolean("isChristmasThemeEnabled", lobbyConfig3.isChristmasThemeEnabled());
                            sujVar.j0(bundleD2, lobbyConfig3.newLobby(), lobbyConfig3.webViewLobby());
                        }
                        return Unit.a;
                    }
                }, c2tVar5, null), 3);
            }
        }
        c2t c2tVar6 = this.b;
        if (c2tVar6 != null) {
            c2tVar6.a.f(getViewLifecycleOwner(), new a(new puj(this)));
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }
}
