package com.sportygames.featuredGames.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.featuredGames.model.FeaturedResponse;
import com.sportygames.featuredGames.view.FeaturedGames;
import defpackage.beh;
import defpackage.bmy;
import defpackage.bq40;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.fjd;
import defpackage.fq5;
import defpackage.geh;
import defpackage.h5e;
import defpackage.haj;
import defpackage.hb5;
import defpackage.iel;
import defpackage.jeh;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.paj;
import defpackage.qch;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.ssw;
import defpackage.ugh;
import defpackage.v8i0;
import defpackage.w8i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/sportygames/featuredGames/view/FeaturedGames;", "Landroid/widget/LinearLayout;", "Lw8i0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ljeh;", "a", "Ljeh;", "getBinding", "()Ljeh;", "setBinding", "(Ljeh;)V", "binding", "Lssw;", "", "c", "Lssw;", "getOpenGame", "()Lssw;", "openGame", "Lv8i0;", "getViewModelStore", "()Lv8i0;", "viewModelStore", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FeaturedGames extends LinearLayout implements w8i0 {
    public static final /* synthetic */ int C = 0;
    public String A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public jeh binding;
    public final ssw<Boolean> b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final ssw<String> openGame;
    public final ugh d;
    public final fq5 e;
    public qch f;
    public beh i;
    public List<FeaturedResponse> v;
    public ArrayList w;
    public ArrayList y;
    public boolean z;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class b implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public b(Function1 function1) {
            this.a = function1;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeaturedGames(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.featured_games, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.category_list;
        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.category_list, viewInflate);
        if (recyclerView != null) {
            i = R.id.game_list;
            RecyclerView recyclerView2 = (RecyclerView) h5e.a(R.id.game_list, viewInflate);
            if (recyclerView2 != null) {
                this.binding = new jeh((ConstraintLayout) viewInflate, recyclerView, recyclerView2);
                this.b = new ssw<>();
                this.openGame = new ssw<>();
                v8i0 viewModelStore = getViewModelStore();
                boolean z = this instanceof iel;
                r8i0.c defaultViewModelProviderFactory = fjd.a;
                r8i0.c defaultViewModelProviderFactory2 = z ? ((iel) this).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
                cyb defaultViewModelCreationExtras = z ? ((iel) this).getDefaultViewModelCreationExtras() : cyb.a.b;
                viewModelStore.getClass();
                defaultViewModelProviderFactory2.getClass();
                defaultViewModelCreationExtras.getClass();
                s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory2, defaultViewModelCreationExtras);
                dq7 dq7VarA = jq40.a(ugh.class);
                String strI = dq7VarA.i();
                if (strI == null) {
                    hb5.a("Local and anonymous classes can not be ViewModels");
                    throw null;
                }
                ugh ughVar = (ugh) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
                this.d = ughVar;
                v8i0 viewModelStore2 = getViewModelStore();
                defaultViewModelProviderFactory = z ? ((iel) this).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
                cyb defaultViewModelCreationExtras2 = z ? ((iel) this).getDefaultViewModelCreationExtras() : cyb.a.b;
                viewModelStore2.getClass();
                defaultViewModelProviderFactory.getClass();
                defaultViewModelCreationExtras2.getClass();
                s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory, defaultViewModelCreationExtras2);
                dq7 dq7VarA2 = jq40.a(fq5.class);
                String strI2 = dq7VarA2.i();
                if (strI2 == null) {
                    hb5.a("Local and anonymous classes can not be ViewModels");
                    throw null;
                }
                fq5 fq5Var = (fq5) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
                this.e = fq5Var;
                this.w = new ArrayList();
                this.A = "";
                ughVar.b.g(new b(new Function1() { // from class: deh
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r10v0, types: [m2g] */
                    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Iterable] */
                    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ArrayList arrayList;
                        ssw<Integer> sswVar;
                        ssw<Integer> sswVar2;
                        ssw<String> sswVar3;
                        ?? arrayList2;
                        FeaturedGames featuredGames = this.a;
                        ssw<Boolean> sswVar4 = featuredGames.b;
                        LoadingState loadingState = (LoadingState) obj;
                        int i2 = FeaturedGames.C;
                        int i3 = FeaturedGames.a.a[loadingState.getStatus().ordinal()];
                        int i4 = 1;
                        if (i3 != 1) {
                            if (i3 == 2) {
                                try {
                                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                                    List list = hTTPResponse != null ? (List) hTTPResponse.getData() : null;
                                    if (list == null || list.isEmpty()) {
                                        sswVar4.j(Boolean.FALSE);
                                    } else {
                                        HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                                        featuredGames.v = hTTPResponse2 != null ? (List) hTTPResponse2.getData() : null;
                                        sswVar4.j(Boolean.TRUE);
                                        List<FeaturedResponse> list2 = featuredGames.v;
                                        if (list2 != null) {
                                            ArrayList arrayList3 = new ArrayList();
                                            for (Object obj2 : list2) {
                                                List<FeaturedResponse.GameList> gameList = ((FeaturedResponse) obj2).getGameList();
                                                if (gameList != null && (!gameList.isEmpty())) {
                                                    arrayList3.add(obj2);
                                                }
                                            }
                                            arrayList = new ArrayList(arrayList3);
                                        } else {
                                            arrayList = new ArrayList();
                                        }
                                        featuredGames.w = arrayList;
                                        ArrayList arrayList4 = new ArrayList();
                                        int size = arrayList.size();
                                        int i5 = 0;
                                        int i6 = 0;
                                        int i7 = 0;
                                        while (i7 < size) {
                                            Object obj3 = arrayList.get(i7);
                                            i7++;
                                            int i8 = i6 + 1;
                                            if (i6 < 0) {
                                                b.q();
                                                throw null;
                                            }
                                            List<FeaturedResponse.GameList> gameList2 = ((FeaturedResponse) obj3).getGameList();
                                            if (gameList2 != null) {
                                                arrayList2 = new ArrayList(l48.r(gameList2, 10));
                                                Iterator it = gameList2.iterator();
                                                while (it.hasNext()) {
                                                    arrayList2.add(new Pair(Integer.valueOf(i6), (FeaturedResponse.GameList) it.next()));
                                                }
                                            } else {
                                                arrayList2 = m2g.a;
                                            }
                                            p48.w(arrayList2, arrayList4);
                                            i6 = i8;
                                        }
                                        featuredGames.y = arrayList4;
                                        ArrayList arrayList5 = featuredGames.w;
                                        Context context2 = featuredGames.getContext();
                                        context2.getClass();
                                        qch qchVar = new qch(context2, featuredGames.binding.b, arrayList5);
                                        featuredGames.f = qchVar;
                                        featuredGames.binding.b.setAdapter(qchVar);
                                        RecyclerView recyclerView3 = featuredGames.binding.b;
                                        featuredGames.getContext();
                                        recyclerView3.setLayoutManager(new LinearLayoutManager(0, false));
                                        ArrayList arrayList6 = featuredGames.y;
                                        if (arrayList6 == null) {
                                            Intrinsics.n("allGamesWithCategory");
                                            throw null;
                                        }
                                        Context context3 = featuredGames.getContext();
                                        context3.getClass();
                                        beh behVar = new beh(context3, arrayList6);
                                        featuredGames.i = behVar;
                                        featuredGames.binding.c.setAdapter(behVar);
                                        RecyclerView recyclerView4 = featuredGames.binding.c;
                                        featuredGames.getContext();
                                        recyclerView4.setLayoutManager(new LinearLayoutManager(0, false));
                                        ArrayList arrayList7 = featuredGames.y;
                                        if (arrayList7 == null) {
                                            Intrinsics.n("allGamesWithCategory");
                                            throw null;
                                        }
                                        featuredGames.binding.c.o0(1073741823 - (1073741823 % arrayList7.size()));
                                        beh behVar2 = featuredGames.i;
                                        if (behVar2 != null && (sswVar3 = behVar2.d) != null) {
                                            sswVar3.g(new FeaturedGames.b(new wic(featuredGames, i4)));
                                        }
                                        qch qchVar2 = featuredGames.f;
                                        if (qchVar2 != null && (sswVar2 = qchVar2.e) != null) {
                                            sswVar2.g(new FeaturedGames.b(new eeh(featuredGames, i5)));
                                        }
                                        qch qchVar3 = featuredGames.f;
                                        if (qchVar3 != null && (sswVar = qchVar3.f) != null) {
                                            sswVar.g(new FeaturedGames.b(new feh(featuredGames, i5)));
                                        }
                                        featuredGames.a();
                                        ArrayList arrayList8 = featuredGames.w;
                                        int size2 = arrayList8.size();
                                        int i9 = 0;
                                        int i10 = 0;
                                        while (i10 < size2) {
                                            Object obj4 = arrayList8.get(i10);
                                            i10++;
                                            int i11 = i9 + 1;
                                            if (i9 < 0) {
                                                b.q();
                                                throw null;
                                            }
                                            try {
                                                qch qchVar4 = featuredGames.f;
                                                if (qchVar4 != null) {
                                                    qchVar4.j(i9, i9 == 0);
                                                }
                                            } catch (Exception unused) {
                                            }
                                            i9 = i11;
                                        }
                                    }
                                } catch (Exception unused2) {
                                    sswVar4.j(Boolean.FALSE);
                                }
                            } else {
                                if (i3 != 3) {
                                    uhc.a();
                                    return null;
                                }
                                sswVar4.j(Boolean.FALSE);
                            }
                        }
                        return Unit.a;
                    }
                }));
                fq5Var.c.g(new b(new Function1() { // from class: ceh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        FeaturedGames featuredGames = this.a;
                        LoadingState loadingState = (LoadingState) obj;
                        int i2 = FeaturedGames.C;
                        int i3 = FeaturedGames.a.a[loadingState.getStatus().ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                try {
                                    ugh ughVar2 = featuredGames.d;
                                    String str = "sb_country=" + featuredGames.A;
                                    boolean z2 = featuredGames.B;
                                    ughVar2.getClass();
                                    dq40 dq40Var = new dq40();
                                    dq40Var.a = "";
                                    ej5.c(o8i0.d(ughVar2), null, null, new tgh(ughVar2, z2, dq40Var, str, null), 3);
                                    op5 op5Var = op5.a;
                                    List<? extends File> list = (List) loadingState.getData();
                                    op5Var.getClass();
                                    op5.b = list;
                                } catch (Exception unused) {
                                }
                            } else if (i3 != 3) {
                                uhc.a();
                                return null;
                            }
                        }
                        return Unit.a;
                    }
                }));
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a() {
        try {
            RecyclerView.o layoutManager = this.binding.c.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            bq40 bq40Var = new bq40();
            bq40Var.a = -1;
            this.binding.c.k(new geh(this, linearLayoutManager, bq40Var));
        } catch (Exception unused) {
        }
    }

    public final jeh getBinding() {
        return this.binding;
    }

    public final ssw<String> getOpenGame() {
        return this.openGame;
    }

    @Override // defpackage.w8i0
    public v8i0 getViewModelStore() {
        return new v8i0();
    }

    public final void setBinding(jeh jehVar) {
        jehVar.getClass();
        this.binding = jehVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeaturedGames(Context context) {
        this(context, null);
        context.getClass();
    }
}
