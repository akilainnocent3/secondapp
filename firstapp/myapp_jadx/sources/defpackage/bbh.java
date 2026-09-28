package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.lobby.remote.models.AddFavouriteRequest;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.UpdateFavouriteRequest;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbbh;", "Ll12;", "Ljct;", "Lco80;", "", "Lkah;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class bbh extends l12<jct, co80> implements kah {
    public GamesLobbyMainFragment A;
    public final int[] B;
    public final int[] C;
    public final mpe0 D;
    public final b E;
    public jah c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean i;
    public boolean v;
    public float w;
    public final ema y;
    public final long z;

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

    public static final class b extends RecyclerView.h {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void e(int i, int i2) {
            co80 co80Var;
            if (i2 != 0 || (co80Var = (co80) bbh.this.b) == null) {
                return;
            }
            co80Var.d.o0(0);
        }
    }

    public static final class c extends r.g {
        public c() {
            super(51, 0);
        }

        public final void a(int i, int i2) {
            AbstractList arrayList;
            j01<GameDetails> j01Var;
            zj60 bridge;
            j01<GameDetails> j01Var2;
            bbh bbhVar = bbh.this;
            try {
                jah jahVar = bbhVar.c;
                if (jahVar == null || (j01Var2 = jahVar.e) == null || (arrayList = j01Var2.a()) == null) {
                    arrayList = new ArrayList();
                }
                String str = ((GameDetails) arrayList.get(i)).getName() + "_" + ((GameDetails) arrayList.get(i2)).getName() + "_";
                String str2 = (i + 1) + "_" + (i2 + 1);
                String str3 = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
                Bundle bundleA = whs.a("games", str, "tile_position", str2);
                bundleA.putString("user_state", str3);
                SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
                    ((bk60) bridge).a("swap_favourite", bundleA);
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(arrayList);
                Object obj = arrayList2.get(i);
                obj.getClass();
                ((GameDetails) arrayList2.get(i)).getId();
                arrayList2.set(i, arrayList2.get(i2));
                arrayList2.set(i2, (GameDetails) obj);
                znz.c.a aVar = new znz.c.a();
                aVar.b(arrayList2.size());
                int i3 = 0;
                aVar.d = false;
                znz.c cVarA = aVar.a();
                jah jahVar2 = bbhVar.c;
                if (jahVar2 != null && (j01Var = jahVar2.e) != null) {
                    j01Var.e(((jct) bbhVar.a) != null ? jct.y1(arrayList2, cVarA) : null);
                }
                jah jahVar3 = bbhVar.c;
                if (jahVar3 != null) {
                    jahVar3.notifyDataSetChanged();
                }
                jct jctVar = (jct) bbhVar.a;
                if (jctVar != null) {
                    jctVar.F1(new UpdateFavouriteRequest(String.valueOf(((GameDetails) arrayList.get(i)).getId()), String.valueOf(((GameDetails) arrayList.get(i2)).getId()), String.valueOf(((GameDetails) arrayList.get(i)).getPosition()), String.valueOf(((GameDetails) arrayList.get(i2)).getPosition())));
                }
                jct jctVar2 = (jct) bbhVar.a;
                if (jctVar2 != null) {
                    brs brsVar = jctVar2.z;
                    if (brsVar != null) {
                        brsVar.f(bbhVar.getViewLifecycleOwner(), new f(new rah(bbhVar, i3)));
                    } else {
                        Intrinsics.n("updateFavPagedLiveData");
                        throw null;
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean canDropOver(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            recyclerView.getClass();
            d0Var.getClass();
            d0Var2.getClass();
            int i = 0;
            if (bbh.this.d) {
                return false;
            }
            Iterator<View> it = new r7i0(recyclerView).iterator();
            while (true) {
                t7i0 t7i0Var = (t7i0) it;
                if (!t7i0Var.hasNext()) {
                    return super.canDropOver(recyclerView, d0Var, d0Var2);
                }
                int i2 = i + 1;
                t7i0Var.next();
                if (Integer.valueOf(recyclerView.Q(recyclerView.getChildAt(i)).getPosition()).equals(Integer.valueOf(d0Var2.getPosition()))) {
                    d0Var2.itemView.setAlpha(0.2f);
                } else {
                    recyclerView.Q(recyclerView.getChildAt(i)).itemView.setAlpha(1.0f);
                }
                i = i2;
            }
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void clearView(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            GamesLobbyMainFragment gamesLobbyMainFragment;
            j01<GameDetails> j01Var;
            znz<GameDetails> znzVarA;
            bbh bbhVar = bbh.this;
            recyclerView.getClass();
            d0Var.getClass();
            super.clearView(recyclerView, d0Var);
            try {
                if (bbhVar.d) {
                    return;
                }
                Iterator<View> it = new r7i0(recyclerView).iterator();
                int i = 0;
                while (true) {
                    t7i0 t7i0Var = (t7i0) it;
                    if (!t7i0Var.hasNext()) {
                        break;
                    }
                    t7i0Var.next();
                    recyclerView.Q(recyclerView.getChildAt(i)).itemView.setAlpha(1.0f);
                    i++;
                }
                int i2 = bbhVar.B[0];
                int i3 = bbhVar.C[0];
                if (i2 == i3) {
                    jah jahVar = bbhVar.c;
                    int iA = (jahVar == null || (j01Var = jahVar.e) == null || (znzVarA = j01Var.a()) == null) ? 0 : znzVarA.d.a();
                    jct jctVar = (jct) bbhVar.a;
                    if (jctVar != null) {
                        jctVar.E1(bbhVar, iA);
                    }
                } else {
                    a(i2, i3);
                }
                co80 co80Var = (co80) bbhVar.b;
                if (co80Var != null) {
                    co80Var.e.setEnabled(true);
                }
                if (!bbhVar.isAdded() || (gamesLobbyMainFragment = bbhVar.A) == null) {
                    return;
                }
                gamesLobbyMainFragment.H0(false);
            } catch (Exception unused) {
            }
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
            GamesLobbyMainFragment gamesLobbyMainFragment;
            bbh bbhVar = bbh.this;
            canvas.getClass();
            recyclerView.getClass();
            d0Var.getClass();
            try {
                if (bbhVar.d) {
                    return;
                }
                super.onChildDraw(canvas, recyclerView, d0Var, f, f2, i, z);
                co80 co80Var = (co80) bbhVar.b;
                if (co80Var != null) {
                    co80Var.e.setEnabled(!z);
                }
                if (bbhVar.isAdded() && (gamesLobbyMainFragment = bbhVar.A) != null) {
                    gamesLobbyMainFragment.H0(true);
                }
                View view = d0Var.itemView;
                view.getClass();
                Drawable drawable = bbhVar.requireActivity().getDrawable(R.drawable.placeholder);
                if (drawable != null) {
                    drawable.setBounds(view.getLeft() + ((int) bbhVar.getResources().getDimension(R.dimen._4sdp)), view.getTop() + ((int) bbhVar.getResources().getDimension(R.dimen._5sdp)), view.getRight() - ((int) bbhVar.getResources().getDimension(R.dimen._6sdp)), view.getBottom() - ((int) bbhVar.getResources().getDimension(R.dimen._6sdp)));
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
            } catch (Exception unused) {
            }
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean onMove(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            recyclerView.getClass();
            d0Var.getClass();
            d0Var2.getClass();
            bbh bbhVar = bbh.this;
            bbhVar.B[0] = d0Var.getAdapterPosition();
            bbhVar.C[0] = d0Var2.getAdapterPosition();
            bbhVar.f = true;
            bbhVar.v = true;
            return false;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void onSwiped(RecyclerView.d0 d0Var, int i) {
            d0Var.getClass();
        }
    }

    public static final /* synthetic */ class d extends saj implements Function1<Boolean, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            bool.booleanValue();
            ((bbh) this.receiver).getClass();
            return Unit.a;
        }
    }

    public static final /* synthetic */ class e extends saj implements Function1<Throwable, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Throwable th2 = th;
            th2.getClass();
            ((bbh) this.receiver).getClass();
            th2.printStackTrace();
            return Unit.a;
        }
    }

    public static final class f implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public f(Function1 function1) {
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

    public bbh() {
        new yjj();
        this.d = true;
        this.f = true;
        this.y = new ema();
        this.z = 500L;
        this.B = new int[1];
        this.C = new int[1];
        this.D = hwr.b(new zah(this, 0));
        this.E = new b();
    }

    @Override // defpackage.kah
    public final void R(String str, int i, vo80 vo80Var) {
        ArrayList arrayList;
        j01<GameDetails> j01Var;
        j01<GameDetails> j01Var2;
        ArrayList arrayList2;
        vo80Var.getClass();
        ((r) this.D.getValue()).j(null);
        jah jahVar = this.c;
        if (jahVar != null) {
            znz<GameDetails> znzVarA = jahVar.e.a();
            if (znzVarA != null) {
                arrayList2 = new ArrayList();
                for (GameDetails gameDetails : znzVarA) {
                    if (!str.equals(String.valueOf(gameDetails.getId()))) {
                        arrayList2.add(gameDetails);
                    }
                }
            } else {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                int size = arrayList2.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    ((GameDetails) obj).setPosition(Integer.valueOf(i4));
                    i2 = i4;
                }
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            boolean zIsEmpty = arrayList.isEmpty();
            B b2 = this.b;
            if (zIsEmpty) {
                co80 co80Var = (co80) b2;
                if (co80Var != null) {
                    co80Var.c.setVisibility(0);
                }
                jah jahVar2 = this.c;
                if (jahVar2 != null && (j01Var = jahVar2.e) != null) {
                    j01Var.e(null);
                }
            } else {
                co80 co80Var2 = (co80) b2;
                if (co80Var2 != null) {
                    co80Var2.c.setVisibility(8);
                }
                znz.c.a aVar = new znz.c.a();
                aVar.b(arrayList.size());
                aVar.d = false;
                znz.c cVarA = aVar.a();
                jah jahVar3 = this.c;
                if (jahVar3 != null && (j01Var2 = jahVar3.e) != null) {
                    j01Var2.e(((jct) this.a) != null ? jct.y1(arrayList, cVarA) : null);
                }
                jah jahVar4 = this.c;
                if (jahVar4 != null) {
                    jahVar4.notifyDataSetChanged();
                }
            }
        }
        jct jctVar = (jct) this.a;
        if (jctVar != null) {
            jctVar.x1(new AddFavouriteRequest(str), null);
        }
    }

    @Override // defpackage.l12
    public final g6i0 o0() {
        View viewInflate = getLayoutInflater().inflate(R.layout.sg_fragment_lobby_favourite, (ViewGroup) null, false);
        int i = R.id.include_layout;
        View viewA = h5e.a(R.id.include_layout, viewInflate);
        if (viewA != null) {
            yn80 yn80VarA = yn80.a(viewA);
            i = R.id.no_favourite;
            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.no_favourite, viewInflate);
            if (linearLayout != null) {
                i = R.id.sg_favourite_list;
                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.sg_favourite_list, viewInflate);
                if (recyclerView != null) {
                    i = R.id.swipe_container;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe_container, viewInflate);
                    if (swipeRefreshLayout != null) {
                        i = R.id.swipe_container_error;
                        SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) h5e.a(R.id.swipe_container_error, viewInflate);
                        if (swipeRefreshLayout2 != null) {
                            return new co80((RelativeLayout) viewInflate, yn80VarA, linearLayout, recyclerView, swipeRefreshLayout, swipeRefreshLayout2);
                        }
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
        this.y.dispose();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        brs brsVar;
        ssw<LoadingState<List<GameDetails>>> sswVar;
        super.onPause();
        jct jctVar = (jct) this.a;
        if (jctVar != null && (sswVar = jctVar.v) != null) {
            sswVar.l(this);
        }
        jct jctVar2 = (jct) this.a;
        if (jctVar2 != null && (brsVar = jctVar2.y) != null) {
            brsVar.l(this);
        }
        jah jahVar = this.c;
        if (jahVar != null) {
            jahVar.unregisterAdapterDataObserver(this.E);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        brs brsVar;
        j01<GameDetails> j01Var;
        super.onResume();
        this.f = true;
        boolean z = GamesLobbyMainFragment.Z;
        if (!isDetached() && isVisible() && !z) {
            if (this.i) {
                jah jahVar = this.c;
                if (jahVar != null && (j01Var = jahVar.e) != null) {
                    j01Var.e(null);
                }
                jct jctVar = (jct) this.a;
                if (jctVar != null) {
                    ibs viewLifecycleOwner = getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    jctVar.E1(viewLifecycleOwner, 20);
                }
            } else {
                this.i = true;
                jct jctVar2 = (jct) this.a;
                if (jctVar2 != null && (brsVar = jctVar2.y) != null) {
                    brsVar.f(getViewLifecycleOwner(), new f(new yah(this, 0)));
                }
            }
        }
        jah jahVar2 = this.c;
        if (jahVar2 != null) {
            jahVar2.registerAdapterDataObserver(this.E);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ssw<LoadingState<HTTPResponse<List<GameDetails>>>> sswVar;
        view.getClass();
        super.onViewCreated(view, bundle);
        co80 co80Var = (co80) this.b;
        if (co80Var != null) {
            co80Var.e.setColorSchemeColors(requireContext().getColor(R.color.swipe_color));
        }
        co80 co80Var2 = (co80) this.b;
        if (co80Var2 != null) {
            co80Var2.e.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: oah
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                public final void i() {
                    this.a.p0();
                }
            });
        }
        co80 co80Var3 = (co80) this.b;
        if (co80Var3 != null) {
            co80Var3.f.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: uah
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                public final void i() {
                    this.a.p0();
                }
            });
        }
        co80 co80Var4 = (co80) this.b;
        int i = 0;
        if (co80Var4 != null) {
            co80Var4.b.i.setOnClickListener(new vah(this, i));
        }
        jct jctVar = (jct) this.a;
        if (jctVar != null) {
            jctVar.D = 20;
        }
        androidx.fragment.app.e activity = getActivity();
        this.c = activity != null ? new jah(activity, this, this.A, this) : null;
        co80 co80Var5 = (co80) this.b;
        if (co80Var5 != null) {
            RecyclerView recyclerView = co80Var5.d;
            requireContext();
            recyclerView.setLayoutManager(new GridLayoutManager(2));
        }
        co80 co80Var6 = (co80) this.b;
        if (co80Var6 != null) {
            co80Var6.d.setAdapter(this.c);
        }
        cbh cbhVar = new cbh(this);
        co80 co80Var7 = (co80) this.b;
        if (co80Var7 != null) {
            co80Var7.d.k(cbhVar);
        }
        jct jctVar2 = (jct) this.a;
        if (jctVar2 != null && (sswVar = jctVar2.e) != null) {
            sswVar.f(getViewLifecycleOwner(), new f(new pah(this, i)));
        }
        ema emaVar = this.y;
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
        tdy tdyVar = new tdy(e5yVar.a(), new wgc(new wah()));
        xgc xgcVar = new xgc(new d(1, this, bbh.class, "onGetObservableSuccess", "onGetObservableSuccess(Z)V", 0));
        final e eVar = new e(1, this, bbh.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        rlr rlrVar = new rlr(xgcVar, new pya() { // from class: xah
            @Override // defpackage.pya
            public final void accept(Object obj) {
                eVar.invoke(obj);
            }
        }, taj.c);
        tdyVar.a(rlrVar);
        emaVar.b(rlrVar);
    }

    public final void p0() {
        co80 co80Var = (co80) this.b;
        if (co80Var != null) {
            co80Var.d.setVisibility(0);
        }
        GamesLobbyMainFragment gamesLobbyMainFragment = this.A;
        if (gamesLobbyMainFragment != null) {
            gamesLobbyMainFragment.a0();
        }
        co80 co80Var2 = (co80) this.b;
        if (co80Var2 != null) {
            co80Var2.b.f.setVisibility(8);
        }
    }

    public final void q0(int i) {
        co80 co80Var;
        if (!this.f || (co80Var = (co80) this.b) == null) {
            return;
        }
        co80Var.c.setVisibility(i);
    }
}
