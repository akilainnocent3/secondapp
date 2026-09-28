package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.book.domain.entity.Category;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.CategoriesResponse;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jf1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jf1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection collection;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        int currentItem;
        cn80 cn80Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                if (((Boolean) ((ytw) obj2).getValue()).booleanValue()) {
                    lzaVar.b2();
                }
                return Unit.a;
            case 1:
                final GamesLobbyMainFragment gamesLobbyMainFragment = (GamesLobbyMainFragment) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = GamesLobbyMainFragment.a.a[loadingState.getStatus().ordinal()];
                final int i3 = 0;
                if (i2 == 1) {
                    gamesLobbyMainFragment.W = true;
                    GamesLobbyMainFragment.Z = false;
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse == null || (collection = (List) hTTPResponse.getData()) == null) {
                        collection = m2g.a;
                    }
                    gamesLobbyMainFragment.R.clear();
                    if (collection.isEmpty()) {
                        gamesLobbyMainFragment.E0();
                    } else {
                        try {
                            gamesLobbyMainFragment.R.add(new CategoriesResponse("-1", "All", "", "", "true"));
                            if (gamesLobbyMainFragment.y.length() > 0) {
                                gamesLobbyMainFragment.R.add(new CategoriesResponse("-2", gamesLobbyMainFragment.L, "", "", "true"));
                            }
                            Iterator it = collection.iterator();
                            while (it.hasNext()) {
                                gamesLobbyMainFragment.R.add((CategoriesResponse) it.next());
                            }
                            ArrayList<CategoriesResponse> arrayList = gamesLobbyMainFragment.B;
                            ArrayList<CategoriesResponse> arrayList2 = gamesLobbyMainFragment.R;
                            if ((arrayList == null || arrayList2 == null) ? false : Arrays.equals(arrayList.toArray(new CategoriesResponse[0]), arrayList2.toArray(new CategoriesResponse[0]))) {
                                gamesLobbyMainFragment.d = null;
                                g1t g1tVar = gamesLobbyMainFragment.z;
                                if (g1tVar == null) {
                                    Intrinsics.n("adapter");
                                    throw null;
                                }
                                g1tVar.A = null;
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
                                wdy wdyVar = e5yVar.a;
                                wdyVar.b = true;
                                wdyVar.a.onNext(wdyVar);
                            } else {
                                gamesLobbyMainFragment.B.clear();
                                gamesLobbyMainFragment.B.addAll(gamesLobbyMainFragment.R);
                                cn80 cn80Var2 = (cn80) gamesLobbyMainFragment.b;
                                if (cn80Var2 != null) {
                                    cn80Var2.C.n();
                                }
                                int i4 = 0;
                                for (CategoriesResponse categoriesResponse : gamesLobbyMainFragment.R) {
                                    int i5 = i4 + 1;
                                    String id = categoriesResponse.getId();
                                    String name = categoriesResponse.getName();
                                    gamesLobbyMainFragment.D0(id, name != null ? StringsKt.u0(name).toString() : null, categoriesResponse.getImageUrl(), i4, false);
                                    i4 = i5;
                                }
                                cn80 cn80Var3 = (cn80) gamesLobbyMainFragment.b;
                                if (cn80Var3 != null) {
                                    cn80Var3.C.setTabMode(0);
                                }
                                ViewPager2 viewPager2 = gamesLobbyMainFragment.v;
                                if (viewPager2 == null || (currentItem = viewPager2.getCurrentItem()) <= 2) {
                                    currentItem = 2;
                                }
                                float dimension = (gamesLobbyMainFragment.getResources().getDimension(R.dimen._46sdp) + gamesLobbyMainFragment.getResources().getDimension(R.dimen._5sdp)) * (currentItem - 2);
                                cn80 cn80Var4 = (cn80) gamesLobbyMainFragment.b;
                                if (cn80Var4 != null) {
                                    cn80Var4.C.smoothScrollTo((int) dimension, 0);
                                }
                            }
                            cn80 cn80Var5 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var5 != null) {
                                cn80Var5.G.setVisibility(0);
                            }
                            cn80 cn80Var6 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var6 != null) {
                                cn80Var6.C.setVisibility(0);
                            }
                            cn80 cn80Var7 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var7 != null) {
                                cn80Var7.D.setVisibility(8);
                            }
                            cn80 cn80Var8 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var8 != null) {
                                cn80Var8.e.setVisibility(8);
                            }
                            cn80 cn80Var9 = (cn80) gamesLobbyMainFragment.b;
                            ViewGroup.LayoutParams layoutParams = cn80Var9 != null ? cn80Var9.G.getLayoutParams() : null;
                            layoutParams.getClass();
                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                            layoutParams2.height = (int) gamesLobbyMainFragment.getResources().getDimension(R.dimen._60sdp);
                            cn80 cn80Var10 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var10 != null) {
                                cn80Var10.G.setLayoutParams(layoutParams2);
                            }
                            cn80 cn80Var11 = (cn80) gamesLobbyMainFragment.b;
                            ViewGroup.LayoutParams layoutParams3 = cn80Var11 != null ? cn80Var11.C.getLayoutParams() : null;
                            layoutParams3.getClass();
                            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                            layoutParams4.height = (int) gamesLobbyMainFragment.getResources().getDimension(R.dimen._60sdp);
                            cn80 cn80Var12 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var12 != null) {
                                cn80Var12.C.setPadding(0, (int) gamesLobbyMainFragment.getResources().getDimension(R.dimen._2sdp), 0, 0);
                            }
                            cn80 cn80Var13 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var13 != null) {
                                cn80Var13.C.setLayoutParams(layoutParams4);
                            }
                        } catch (Exception unused) {
                        }
                        cn80 cn80Var14 = (cn80) gamesLobbyMainFragment.b;
                        hec hecVar = cn80Var14 != null ? cn80Var14.A : null;
                        hecVar.getClass();
                        gamesLobbyMainFragment.M = hecVar;
                        hecVar.c.setText("Search");
                        op5 op5Var = op5.a;
                        hec hecVar2 = gamesLobbyMainFragment.M;
                        op5.r(op5Var, b.f(hecVar2 != null ? hecVar2.c : null), null, 4);
                        hec hecVar3 = gamesLobbyMainFragment.M;
                        if (hecVar3 != null && (constraintLayout3 = hecVar3.a) != null) {
                            constraintLayout3.setVisibility(0);
                        }
                        hec hecVar4 = gamesLobbyMainFragment.M;
                        if (hecVar4 != null) {
                            hecVar4.b.setImageResource(R.drawable.sg_search_icon);
                        }
                        hec hecVar5 = gamesLobbyMainFragment.M;
                        if (hecVar5 != null && (constraintLayout2 = hecVar5.d) != null) {
                            constraintLayout2.setBackgroundResource(R.drawable.sg_search_tab_selector);
                        }
                        hec hecVar6 = gamesLobbyMainFragment.M;
                        if (hecVar6 != null && (constraintLayout = hecVar6.a) != null) {
                            constraintLayout.setOnClickListener(new avj(gamesLobbyMainFragment, i3));
                        }
                        if (!Intrinsics.g(gamesLobbyMainFragment.P, Boolean.FALSE) || gamesLobbyMainFragment.t0()) {
                            ck60 ck60Var = gamesLobbyMainFragment.O;
                            if (ck60Var != null) {
                                ck60Var.b("search_visited", true);
                            }
                        } else {
                            gamesLobbyMainFragment.Q = ej5.c(ebs.a(gamesLobbyMainFragment.getLifecycle()), null, null, new pvj(gamesLobbyMainFragment, null), 3);
                        }
                    }
                    gamesLobbyMainFragment.C0(gamesLobbyMainFragment.R);
                    Bundle bundle = gamesLobbyMainFragment.d;
                    if (bundle != null) {
                        String string = bundle.containsKey(Category.CATEGORY_ID) ? bundle.getString(Category.CATEGORY_ID) : null;
                        if (string != null) {
                            String strP = c.p(string, "+", " ", false);
                            Iterator<CategoriesResponse> it2 = gamesLobbyMainFragment.R.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    int i6 = i3 + 1;
                                    if (!Intrinsics.g(it2.next().getName(), strP)) {
                                        i3 = i6;
                                    }
                                } else {
                                    i3 = -1;
                                }
                            }
                            if (i3 >= 0 && (cn80Var = (cn80) gamesLobbyMainFragment.b) != null) {
                                cn80Var.C.postDelayed(new Runnable() { // from class: bvj
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        TabLayout.g gVarK;
                                        cn80 cn80Var15 = (cn80) gamesLobbyMainFragment.b;
                                        if (cn80Var15 == null || (gVarK = cn80Var15.C.k(i3)) == null) {
                                            return;
                                        }
                                        gVarK.b();
                                    }
                                }, 200L);
                            }
                        }
                    }
                    gamesLobbyMainFragment.d = null;
                } else if (i2 == 2) {
                    gamesLobbyMainFragment.B.clear();
                    GamesLobbyMainFragment.Z = false;
                    gamesLobbyMainFragment.E0();
                    gamesLobbyMainFragment.C0(new ArrayList<>());
                    gamesLobbyMainFragment.d = null;
                    cn80 cn80Var15 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var15 != null) {
                        cn80Var15.e.setVisibility(8);
                    }
                    cn80 cn80Var16 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var16 != null) {
                        cn80Var16.G.setVisibility(8);
                    }
                    gamesLobbyMainFragment.W = false;
                } else if (i2 != 3) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
            case 2:
                int i7 = PreMatchEventActivity.a2;
                ((PreMatchEventActivity) obj2).n2();
                return Unit.a;
            default:
                une0 une0Var = (une0) obj;
                une0Var.getClass();
                ((nne0) obj2).c.invoke(une0Var);
                return Unit.a;
        }
    }
}
