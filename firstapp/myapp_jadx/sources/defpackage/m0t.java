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
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sporty.android.core.model.welcomereward.DepositFloatingIconPage;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.compose.lobbyv2.models.LobbyConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm0t;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "sportygame"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m0t extends dvl {
    public FrameLayout A;
    public u43 B;
    public final String C = "LOBBY_FRAGMENT";
    public j7e D;
    public hzm f;
    public Activity i;
    public d2t v;
    public SpinKitView w;
    public AppCompatButton y;
    public ConstraintLayout z;

    public final void m0(Bundle bundle, boolean z, boolean z2) {
        if (this.i != null) {
            hzm hzmVar = this.f;
            if (hzmVar == null) {
                Intrinsics.n("agent");
                throw null;
            }
            hzmVar.a(bundle);
            if (getView() == null || this.A == null) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new k0t(this, z2, z, bundle));
        }
    }

    public final void n0() {
        ConstraintLayout constraintLayout = this.z;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        SpinKitView spinKitView = this.w;
        if (spinKitView != null) {
            spinKitView.setVisibility(8);
        }
        AppCompatButton appCompatButton = this.y;
        if (appCompatButton != null) {
            appCompatButton.setVisibility(0);
        }
        FrameLayout frameLayout = this.A;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public final void o0() {
        ConstraintLayout constraintLayout = this.z;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        SpinKitView spinKitView = this.w;
        if (spinKitView != null) {
            spinKitView.setVisibility(8);
        }
        AppCompatButton appCompatButton = this.y;
        if (appCompatButton != null) {
            appCompatButton.setVisibility(8);
        }
        FrameLayout frameLayout = this.A;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dvl, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof Activity) {
            this.i = (Activity) context;
        }
        if (context instanceof u43) {
            this.B = (u43) context;
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
        dq7 dq7VarA = jq40.a(d2t.class);
        String strI = dq7VarA.i();
        if (strI != null) {
            this.v = (d2t) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        } else {
            hb5.a("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dummy_lobby, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        j7e j7eVar = this.D;
        if (j7eVar != null) {
            j7eVar.a();
        } else {
            Intrinsics.n("depositToUnlockBtManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            u43 u43Var = this.B;
            if (u43Var != null) {
                u43Var.D();
            }
        } catch (Exception unused) {
        }
        j7e j7eVar = this.D;
        if (j7eVar == null) {
            Intrinsics.n("depositToUnlockBtManager");
            throw null;
        }
        e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        j7eVar.d(eVarRequireActivity, DepositFloatingIconPage.GAME);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String lobbyVariant;
        view.getClass();
        super.onViewCreated(view, bundle);
        try {
            if (getContext() != null) {
                SportyGamesManager.getInstance().setVersionCode(getContext());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.container_layout);
        this.z = constraintLayout;
        this.y = constraintLayout != null ? (AppCompatButton) constraintLayout.findViewById(R.id.retry_button) : null;
        ConstraintLayout constraintLayout2 = this.z;
        this.w = constraintLayout2 != null ? (SpinKitView) constraintLayout2.findViewById(R.id.loader) : null;
        this.A = (FrameLayout) view.findViewById(R.id.lobby_fragment_container);
        Fragment fragmentH = getChildFragmentManager().H(this.C);
        AppCompatButton appCompatButton = this.y;
        if (appCompatButton != null) {
            appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: j0t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    m0t m0tVar = this.a;
                    d2t d2tVar = m0tVar.v;
                    if (d2tVar == null) {
                        Intrinsics.n("viewModel");
                        throw null;
                    }
                    sk0 sk0Var = new sk0(m0tVar, 1);
                    ej5.c(o8i0.d(d2tVar), null, null, new a2t(new r8t(), sk0Var, d2tVar, null), 3);
                }
            });
        }
        if (fragmentH != null) {
            o0();
        } else {
            ConstraintLayout constraintLayout3 = this.z;
            if (constraintLayout3 != null) {
                constraintLayout3.setVisibility(0);
            }
            SpinKitView spinKitView = this.w;
            if (spinKitView != null) {
                spinKitView.setVisibility(0);
            }
            AppCompatButton appCompatButton2 = this.y;
            if (appCompatButton2 != null) {
                appCompatButton2.setVisibility(8);
            }
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        }
        d2t d2tVar = this.v;
        if (d2tVar == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        Bundle bundleD = d2tVar.b.d();
        if (bundleD == null) {
            bundleD = new Bundle();
        }
        int i = 1;
        if (fragmentH == null) {
            d2t d2tVar2 = this.v;
            if (d2tVar2 == null) {
                Intrinsics.n("viewModel");
                throw null;
            }
            LobbyConfig lobbyConfig = d2tVar2.c;
            if (lobbyConfig != null) {
                bundleD.putBoolean("isChristmasThemeEnabled", lobbyConfig.isChristmasThemeEnabled());
                m0(bundleD, lobbyConfig.newLobby(), lobbyConfig.webViewLobby());
                d2t d2tVar3 = this.v;
                if (d2tVar3 == null) {
                    Intrinsics.n("viewModel");
                    throw null;
                }
                if (d2tVar3.b.d() != null) {
                    d2t d2tVar4 = this.v;
                    if (d2tVar4 == null) {
                        Intrinsics.n("viewModel");
                        throw null;
                    }
                    d2tVar4.b.m(null);
                }
            }
            d2t d2tVar5 = this.v;
            if (d2tVar5 == null) {
                Intrinsics.n("viewModel");
                throw null;
            }
            LobbyConfig lobbyConfig2 = d2tVar5.c;
            if (lobbyConfig2 == null || (lobbyVariant = lobbyConfig2.getLobbyVariant()) == null) {
                lobbyVariant = "";
            }
            d2t d2tVar6 = this.v;
            if (d2tVar6 == null) {
                Intrinsics.n("viewModel");
                throw null;
            }
            if (d2tVar6.c == null) {
                ej5.c(o8i0.d(d2tVar6), null, null, new a2t(new r8t(), new xgo(i, this, lobbyVariant), d2tVar6, null), 3);
            }
        } else {
            hzm hzmVar = this.f;
            if (hzmVar == null) {
                Intrinsics.n("agent");
                throw null;
            }
            hzmVar.a(bundleD);
        }
        d2t d2tVar7 = this.v;
        if (d2tVar7 != null) {
            d2tVar7.b.f(getViewLifecycleOwner(), new n0t(new i7j(this, i)));
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }
}
