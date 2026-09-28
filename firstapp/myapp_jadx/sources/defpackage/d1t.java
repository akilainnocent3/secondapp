package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.lobby.remote.models.AddFavouriteRequest;
import com.sportygames.lobby.remote.models.AddFavouriteResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld1t;", "Ll12;", "Ljct;", "Lbo80;", "", "Lkah;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d1t extends l12<jct, bo80> implements kah {
    public boolean B;
    public r0t C;
    public TabLayout c;
    public Bundle d;
    public c0t f;
    public ArrayList i;
    public String v;
    public boolean y;
    public float z;
    public final yjj e = new yjj();
    public String w = "";
    public final ema A = new ema();

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<Boolean, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            bool.booleanValue();
            ((d1t) this.receiver).getClass();
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<Throwable, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Throwable th2 = th;
            th2.getClass();
            ((d1t) this.receiver).getClass();
            th2.printStackTrace();
            return Unit.a;
        }
    }

    public static final class d implements lfy, paj {
        public final /* synthetic */ s0t a;

        public d(s0t s0tVar) {
            this.a = s0tVar;
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

    @Override // defpackage.kah
    public final void R(String str, int i, vo80 vo80Var) {
        Integer numValueOf;
        ssw<LoadingState<HTTPResponse<List<GameDetails>>>> sswVar;
        ssw<LoadingState<HTTPResponse<AddFavouriteResponse>>> sswVar2;
        vo80Var.getClass();
        if (this.B) {
            return;
        }
        this.B = true;
        c0t c0tVar = this.f;
        if (c0tVar != null) {
            AbstractCollection abstractCollectionA = c0tVar.f.a();
            if (abstractCollectionA == null) {
                abstractCollectionA = new ArrayList();
            }
            Iterator it = abstractCollectionA.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    numValueOf = null;
                    break;
                }
                int i3 = i2 + 1;
                if (String.valueOf(((GameDetails) it.next()).getId()).equals(str) && i2 < abstractCollectionA.size()) {
                    numValueOf = Integer.valueOf(i2);
                    break;
                }
                i2 = i3;
            }
        } else {
            numValueOf = null;
            break;
        }
        if (numValueOf != null) {
            c0t c0tVar2 = this.f;
            if (i == 1) {
                if (c0tVar2 != null) {
                    c0tVar2.i(numValueOf.intValue(), true);
                }
                jct jctVar = (jct) this.a;
                if (jctVar != null) {
                    ej5.c(o8i0.d(jctVar), null, null, new kct(jctVar, new AddFavouriteRequest(str), null, null), 3);
                }
                final int iIntValue = numValueOf.intValue();
                jct jctVar2 = (jct) this.a;
                if (jctVar2 == null || (sswVar2 = jctVar2.c) == null) {
                    return;
                }
                sswVar2.f(getViewLifecycleOwner(), new lfy() { // from class: c1t
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        ssw<LoadingState<HTTPResponse<AddFavouriteResponse>>> sswVar3;
                        ssw<LoadingState<HTTPResponse<AddFavouriteResponse>>> sswVar4;
                        LoadingState<HTTPResponse<AddFavouriteResponse>> loadingStateD;
                        HTTPResponse<AddFavouriteResponse> data;
                        Integer code;
                        r0t r0tVar;
                        ssw<LoadingState<HTTPResponse<AddFavouriteResponse>>> sswVar5;
                        LoadingState loadingState = (LoadingState) obj;
                        int i4 = d1t.a.a[loadingState.getStatus().ordinal()];
                        d1t d1tVar = this.a;
                        if (i4 == 1) {
                            jct jctVar3 = (jct) d1tVar.a;
                            if (jctVar3 != null && (sswVar4 = jctVar3.c) != null && (loadingStateD = sswVar4.d()) != null && (data = loadingStateD.getData()) != null) {
                                data.setData(null);
                            }
                            jct jctVar4 = (jct) d1tVar.a;
                            if (jctVar4 != null && (sswVar3 = jctVar4.c) != null) {
                                sswVar3.l(d1tVar.getViewLifecycleOwner());
                            }
                            d1tVar.p0();
                            return;
                        }
                        if (i4 != 2) {
                            if (i4 != 3) {
                                uhc.a();
                                return;
                            }
                            c0t c0tVar3 = d1tVar.f;
                            if (c0tVar3 != null) {
                                j01<GameDetails> j01Var = c0tVar3.f;
                                int i5 = iIntValue;
                                GameDetails gameDetailsB = j01Var.b(i5);
                                if (gameDetailsB != null) {
                                    gameDetailsB.setFavourite(false);
                                    gameDetailsB.setFavouriteMessage("Error! Please try again");
                                    gameDetailsB.setFavouriteRun(true);
                                }
                                c0tVar3.notifyItemChanged(i5);
                            }
                            jct jctVar5 = (jct) d1tVar.a;
                            if (jctVar5 != null && (sswVar5 = jctVar5.c) != null) {
                                sswVar5.l(d1tVar.getViewLifecycleOwner());
                            }
                            ResultWrapper.GenericError error = loadingState.getError();
                            if (error != null && (code = error.getCode()) != null && code.intValue() == 403 && (r0tVar = d1tVar.C) != null) {
                                r0tVar.a0();
                            }
                            d1tVar.p0();
                        }
                    }
                });
                return;
            }
            if (c0tVar2 != null) {
                c0tVar2.i(numValueOf.intValue(), false);
            }
            jct jctVar3 = (jct) this.a;
            if (jctVar3 != null) {
                jctVar3.x1(new AddFavouriteRequest(str), null);
            }
            final int iIntValue2 = numValueOf.intValue();
            jct jctVar4 = (jct) this.a;
            if (jctVar4 == null || (sswVar = jctVar4.e) == null) {
                return;
            }
            sswVar.f(getViewLifecycleOwner(), new lfy() { // from class: t0t
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    ssw<LoadingState<HTTPResponse<List<GameDetails>>>> sswVar3;
                    ssw<LoadingState<HTTPResponse<List<GameDetails>>>> sswVar4;
                    LoadingState<HTTPResponse<List<GameDetails>>> loadingStateD;
                    HTTPResponse<List<GameDetails>> data;
                    Integer code;
                    r0t r0tVar;
                    ssw<LoadingState<HTTPResponse<List<GameDetails>>>> sswVar5;
                    LoadingState loadingState = (LoadingState) obj;
                    int i4 = d1t.a.a[loadingState.getStatus().ordinal()];
                    d1t d1tVar = this.a;
                    if (i4 == 1) {
                        jct jctVar5 = (jct) d1tVar.a;
                        if (jctVar5 != null && (sswVar4 = jctVar5.e) != null && (loadingStateD = sswVar4.d()) != null && (data = loadingStateD.getData()) != null) {
                            data.setData(null);
                        }
                        jct jctVar6 = (jct) d1tVar.a;
                        if (jctVar6 != null && (sswVar3 = jctVar6.e) != null) {
                            sswVar3.l(d1tVar.getViewLifecycleOwner());
                        }
                        d1tVar.p0();
                        return;
                    }
                    if (i4 != 3) {
                        return;
                    }
                    c0t c0tVar3 = d1tVar.f;
                    if (c0tVar3 != null) {
                        j01<GameDetails> j01Var = c0tVar3.f;
                        int i5 = iIntValue2;
                        GameDetails gameDetailsB = j01Var.b(i5);
                        if (gameDetailsB != null) {
                            gameDetailsB.setFavourite(true);
                            gameDetailsB.setFavouriteMessage("Error! Please try again");
                            gameDetailsB.setFavouriteRun(true);
                        }
                        c0tVar3.notifyItemChanged(i5);
                    }
                    jct jctVar7 = (jct) d1tVar.a;
                    if (jctVar7 != null && (sswVar5 = jctVar7.e) != null) {
                        sswVar5.l(d1tVar.getViewLifecycleOwner());
                    }
                    ResultWrapper.GenericError error = loadingState.getError();
                    if (error != null && (code = error.getCode()) != null && code.intValue() == 403 && (r0tVar = d1tVar.C) != null) {
                        r0tVar.a0();
                    }
                    d1tVar.p0();
                }
            });
        }
    }

    @Override // defpackage.l12
    public final g6i0 o0() {
        View viewInflate = getLayoutInflater().inflate(R.layout.sg_fragment_lobby_all, (ViewGroup) null, false);
        int i = R.id.include_layout;
        View viewA = h5e.a(R.id.include_layout, viewInflate);
        if (viewA != null) {
            yn80 yn80VarA = yn80.a(viewA);
            i = R.id.lobby_list;
            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.lobby_list, viewInflate);
            if (recyclerView != null) {
                i = R.id.swipe_container;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe_container, viewInflate);
                if (swipeRefreshLayout != null) {
                    i = R.id.swipe_container_error;
                    SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) h5e.a(R.id.swipe_container_error, viewInflate);
                    if (swipeRefreshLayout2 != null) {
                        return new bo80((RelativeLayout) viewInflate, yn80VarA, recyclerView, swipeRefreshLayout, swipeRefreshLayout2);
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.A.dispose();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.C = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        brs brsVar;
        j01<GameDetails> j01Var;
        super.onResume();
        if (isVisible()) {
            boolean z = GamesLobbyMainFragment.Z;
            if (isDetached() || z) {
                return;
            }
            if (!this.y) {
                this.y = true;
                jct jctVar = (jct) this.a;
                if (jctVar == null || (brsVar = jctVar.w) == null) {
                    return;
                }
                brsVar.f(getViewLifecycleOwner(), new d(new s0t(this)));
                return;
            }
            c0t c0tVar = this.f;
            if (c0tVar != null && (j01Var = c0tVar.f) != null) {
                j01Var.e(null);
            }
            jct jctVar2 = (jct) this.a;
            if (jctVar2 != null) {
                iuj iujVarD = jctVar2.E.d();
                if (iujVarD != null) {
                    iujVarD.b.a();
                }
                znz.c cVar = jctVar2.J;
                nct nctVar = new nct(jctVar2, jctVar2.a);
                cVar.getClass();
                k5b k5bVarA = gf8.a(fw0.f);
                jctVar2.w = new brs(cVar, new vje0(k5bVarA, new ypc(k5bVarA, nctVar)), gf8.a(fw0.e), k5bVarA);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        d1t d1tVar;
        e activity;
        TabLayout.g gVarK;
        view.getClass();
        super.onViewCreated(view, bundle);
        bo80 bo80Var = (bo80) this.b;
        if (bo80Var != null) {
            bo80Var.d.setColorSchemeColors(requireContext().getColor(R.color.swipe_color));
        }
        String str = this.v;
        c0t c0tVar = null;
        String str2 = null;
        if (str == null || str.length() == 0) {
            jct jctVar = (jct) this.a;
            if (jctVar != null) {
                jctVar.B = null;
            }
        } else {
            jct jctVar2 = (jct) this.a;
            if (jctVar2 != null) {
                String str3 = this.v;
                jctVar2.B = str3 != null ? Integer.valueOf(Integer.parseInt(str3)) : null;
            }
        }
        Bundle bundle2 = this.d;
        VM vm = this.a;
        if (bundle2 != null) {
            jct jctVar3 = (jct) vm;
            if (jctVar3 != null) {
                jctVar3.C = null;
            }
        } else {
            jct jctVar4 = (jct) vm;
            if (jctVar4 != null) {
                jctVar4.C = 20;
            }
        }
        bo80 bo80Var2 = (bo80) this.b;
        if (bo80Var2 != null) {
            bo80Var2.d.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: u0t
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                public final void i() {
                    this.a.r0(true);
                }
            });
        }
        bo80 bo80Var3 = (bo80) this.b;
        if (bo80Var3 != null) {
            bo80Var3.e.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: v0t
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                public final void i() {
                    this.a.r0(true);
                }
            });
        }
        bo80 bo80Var4 = (bo80) this.b;
        if (bo80Var4 != null) {
            bo80Var4.b.i.setOnClickListener(new View.OnClickListener() { // from class: w0t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.r0(false);
                }
            });
        }
        ArrayList arrayList = this.i;
        if (arrayList == null || (activity = getActivity()) == null) {
            d1tVar = this;
        } else {
            TabLayout tabLayout = this.c;
            int i = (tabLayout == null || (gVarK = tabLayout.k(1)) == null) ? 0 : gVarK.i;
            r0t r0tVar = this.C;
            String str4 = this.w;
            if (str4 != null) {
                if (str4.length() == 0) {
                    str4 = "All";
                }
                str2 = str4;
            }
            d1tVar = this;
            c0tVar = new c0t(activity, i, d1tVar, r0tVar, str2, arrayList);
        }
        d1tVar.f = c0tVar;
        bo80 bo80Var5 = (bo80) d1tVar.b;
        if (bo80Var5 != null) {
            RecyclerView recyclerView = bo80Var5.c;
            d1tVar.requireContext();
            recyclerView.setLayoutManager(new GridLayoutManager(2));
        }
        bo80 bo80Var6 = (bo80) d1tVar.b;
        if (bo80Var6 != null) {
            bo80Var6.c.setAdapter(d1tVar.f);
        }
        e1t e1tVar = new e1t(d1tVar);
        bo80 bo80Var7 = (bo80) d1tVar.b;
        if (bo80Var7 != null) {
            bo80Var7.c.k(e1tVar);
        }
        ema emaVar = d1tVar.A;
        if (e5y.b == null) {
            synchronized (e5y.class) {
                try {
                    if (e5y.b == null) {
                        e5y.b = new e5y();
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e5y e5yVar = e5y.b;
        e5yVar.getClass();
        ddy ddyVarA = e5yVar.a();
        final x0t x0tVar = new x0t();
        tdy tdyVar = new tdy(ddyVarA, new faj() { // from class: y0t
            @Override // defpackage.faj
            public final Object apply(Object obj) {
                obj.getClass();
                return (Boolean) x0tVar.invoke(obj);
            }
        });
        final b bVar = new b(1, d1tVar, d1t.class, "onGetObservableSuccess", "onGetObservableSuccess(Z)V", 0);
        pya pyaVar = new pya() { // from class: z0t
            @Override // defpackage.pya
            public final void accept(Object obj) {
                bVar.invoke(obj);
            }
        };
        final c cVar = new c(1, d1tVar, d1t.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        rlr rlrVar = new rlr(pyaVar, new pya() { // from class: a1t
            @Override // defpackage.pya
            public final void accept(Object obj) {
                cVar.invoke(obj);
            }
        }, taj.c);
        tdyVar.a(rlrVar);
        emaVar.b(rlrVar);
    }

    public final void p0() {
        jct jctVar = (jct) this.a;
        if (jctVar != null) {
            r750.b(jctVar, 1200L, new gho(this, 1));
        }
    }

    public final void q0() {
        bo80 bo80Var = (bo80) this.b;
        if (bo80Var != null) {
            bo80Var.d.setRefreshing(false);
        }
        bo80 bo80Var2 = (bo80) this.b;
        if (bo80Var2 != null) {
            bo80Var2.e.setRefreshing(false);
        }
    }

    public final void r0(boolean z) {
        r0t r0tVar;
        bo80 bo80Var = (bo80) this.b;
        if (bo80Var != null) {
            bo80Var.c.setVisibility(0);
        }
        if (!z && (r0tVar = this.C) != null) {
            r0tVar.M();
        }
        r0t r0tVar2 = this.C;
        if (r0tVar2 != null) {
            r0tVar2.a0();
        }
        bo80 bo80Var2 = (bo80) this.b;
        if (bo80Var2 != null) {
            bo80Var2.b.f.setVisibility(8);
        }
    }

    public final void s0(r0t r0tVar) {
        r0tVar.getClass();
        this.C = r0tVar;
    }

    public final void t0(String str, String str2) {
        r0t r0tVar = this.C;
        if (r0tVar != null) {
            r0tVar.A();
        }
        r0t r0tVar2 = this.C;
        if (r0tVar2 != null) {
            r0tVar2.r();
        }
        bo80 bo80Var = (bo80) this.b;
        if (bo80Var != null) {
            bo80Var.c.setVisibility(8);
        }
        bo80 bo80Var2 = (bo80) this.b;
        if (bo80Var2 != null) {
            bo80Var2.d.setVisibility(8);
        }
        bo80 bo80Var3 = (bo80) this.b;
        if (bo80Var3 != null) {
            bo80Var3.e.setVisibility(0);
        }
        bo80 bo80Var4 = (bo80) this.b;
        if (bo80Var4 != null) {
            bo80Var4.b.d.setText(str);
        }
        bo80 bo80Var5 = (bo80) this.b;
        if (bo80Var5 != null) {
            bo80Var5.b.e.setText(str2);
        }
        bo80 bo80Var6 = (bo80) this.b;
        op5.r(op5.a, kotlin.collections.b.f(bo80Var6 != null ? bo80Var6.b.i : null), null, 4);
    }
}
