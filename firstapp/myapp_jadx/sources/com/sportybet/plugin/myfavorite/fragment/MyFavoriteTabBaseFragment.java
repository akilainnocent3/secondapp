package com.sportybet.plugin.myfavorite.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.patron.FavoriteTournament;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.fragment.MyFavoriteTabBaseFragment;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import com.sportybet.plugin.myfavorite.widget.BottomLayout;
import com.sportybet.plugin.realsports.data.MyFavoriteSport;
import com.sportybet.plugin.realsports.data.MySelectedMarket;
import defpackage.czw;
import defpackage.iww;
import defpackage.izw;
import defpackage.j9j;
import defpackage.jww;
import defpackage.k9j;
import defpackage.lfb0;
import defpackage.lfy;
import defpackage.m12;
import defpackage.mfb0;
import defpackage.nvw;
import defpackage.pvw;
import defpackage.sn5;
import defpackage.uyw;
import defpackage.vyw;
import defpackage.xui;
import defpackage.xxw;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MyFavoriteTabBaseFragment extends m12 implements BottomLayout.a, k9j, j9j {
    public TabLayout A;
    public ViewPager B;
    public iww C;
    public BottomLayout D;
    public ArrayList E;
    public LoadingViewNew G;
    public b H;
    public MyFavoriteTypeEnum y;
    public String z = null;
    public int F = 0;
    public boolean I = false;
    public boolean J = false;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MyFavoriteTypeEnum.values().length];
            a = iArr;
            try {
                iArr[MyFavoriteTypeEnum.SPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MyFavoriteTypeEnum.LEAGUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MyFavoriteTypeEnum.MARKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface b {
        void b(MyFavoriteTypeEnum myFavoriteTypeEnum);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    @Override // com.sportybet.plugin.myfavorite.widget.BottomLayout.a
    public final void S() {
        boolean zA;
        MyFavoriteTypeEnum myFavoriteTypeEnum = this.y;
        MyFavoriteTypeEnum myFavoriteTypeEnum2 = MyFavoriteTypeEnum.SPORT;
        String str = null;
        if (myFavoriteTypeEnum == myFavoriteTypeEnum2) {
            zA = izw.a();
        } else if (myFavoriteTypeEnum != MyFavoriteTypeEnum.LEAGUE) {
            zA = false;
        } else {
            ArrayList arrayList = this.E;
            List<FavoriteTournament> listM = izw.a.a().m((arrayList == null || arrayList.size() <= 0 || this.F >= this.E.size()) ? null : ((MyFavoriteSport) this.E.get(this.F)).id);
            if (listM == null || listM.size() <= 0) {
                zA = false;
            } else {
                zA = true;
            }
        }
        if (zA) {
            czw.a(myFavoriteTypeEnum == myFavoriteTypeEnum2 ? R.string.my_favourites_settings__leagues_and_teams_removed : R.string.my_favourites_settings__teams_from_this_league_removed);
        }
        if (this.C != null) {
            ArrayList arrayList2 = this.E;
            if (arrayList2 != null && arrayList2.size() > 0 && this.F < this.E.size()) {
                str = ((MyFavoriteSport) this.E.get(this.F)).id;
            }
            this.C.B1(new pvw(str, 1));
        }
    }

    @Override // com.sportybet.plugin.myfavorite.widget.BottomLayout.a
    public final void Z() {
        iww iwwVar;
        if (this.I || (iwwVar = this.C) == null) {
            return;
        }
        iwwVar.x1();
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getF() {
        if (this.y == null) {
            return "MyFavoriteTabBaseFragment-undefine";
        }
        return "MyFavoriteTabBaseFragment-" + this.y;
    }

    public final void m0() {
        this.A.n();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = a.a[this.y.ordinal()];
        if (i == 1) {
            MyFavoriteTypeEnum myFavoriteTypeEnum = this.y;
            nvw nvwVar = new nvw();
            Bundle bundle = new Bundle();
            bundle.putSerializable("favorite_type", myFavoriteTypeEnum);
            nvwVar.setArguments(bundle);
            arrayList.add(nvwVar);
            arrayList2.add(" ");
        } else if (i == 2) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.E;
            if (arrayList4 != null) {
                int size = arrayList4.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList4.get(i2);
                    i2++;
                    MyFavoriteSport myFavoriteSport = (MyFavoriteSport) obj;
                    String str = myFavoriteSport.name;
                    String str2 = myFavoriteSport.id;
                    xxw xxwVar = izw.a;
                    if (xxwVar.a().l(str2) > 0) {
                        str = str + " (" + xxwVar.a().l(myFavoriteSport.id) + ")";
                    }
                    arrayList3.add(str);
                }
            }
            arrayList2.addAll(arrayList3);
            ArrayList arrayList5 = this.E;
            if (arrayList5 != null) {
                int size2 = arrayList5.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList5.get(i3);
                    i3++;
                    MyFavoriteTypeEnum myFavoriteTypeEnum2 = this.y;
                    String str3 = ((MyFavoriteSport) obj2).id;
                    nvw nvwVar2 = new nvw();
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable("favorite_type", myFavoriteTypeEnum2);
                    bundle2.putString("sport", str3);
                    nvwVar2.setArguments(bundle2);
                    arrayList.add(nvwVar2);
                }
            }
        } else if (i == 3) {
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = this.E;
            if (arrayList7 != null) {
                int size3 = arrayList7.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = arrayList7.get(i4);
                    i4++;
                    MyFavoriteSport myFavoriteSport2 = (MyFavoriteSport) obj3;
                    mfb0 mfb0VarE = lfb0.d().e(myFavoriteSport2.id);
                    String strG = mfb0VarE != null ? mfb0VarE.c().g(requireContext()) : "";
                    String str4 = myFavoriteSport2.id;
                    xxw xxwVar2 = izw.a;
                    if (xxwVar2.a().t(str4) > 0) {
                        strG = strG + " (" + xxwVar2.a().t(myFavoriteSport2.id) + ")";
                    }
                    arrayList6.add(strG);
                }
            }
            arrayList2.addAll(arrayList6);
            ArrayList arrayList8 = this.E;
            if (arrayList8 != null) {
                int size4 = arrayList8.size();
                int i5 = 0;
                while (i5 < size4) {
                    Object obj4 = arrayList8.get(i5);
                    i5++;
                    MyFavoriteTypeEnum myFavoriteTypeEnum3 = this.y;
                    String str5 = ((MyFavoriteSport) obj4).id;
                    nvw nvwVar3 = new nvw();
                    Bundle bundle3 = new Bundle();
                    bundle3.putSerializable("favorite_type", myFavoriteTypeEnum3);
                    bundle3.putString("sport", str5);
                    nvwVar3.setArguments(bundle3);
                    arrayList.add(nvwVar3);
                }
            }
        }
        int size5 = arrayList2.size();
        TabLayout tabLayout = this.A;
        if (size5 > 1) {
            tabLayout.setVisibility(0);
        } else {
            tabLayout.setVisibility(8);
        }
        this.B.setAdapter(new xui(getChildFragmentManager(), arrayList, arrayList2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() instanceof b) {
            this.H = (b) getActivity();
        }
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.y = (MyFavoriteTypeEnum) getArguments().getSerializable("favorite_type");
            vyw vywVarFromBundle = vyw.fromBundle(getArguments());
            if (vywVarFromBundle != null) {
                this.z = vywVarFromBundle.a;
            }
        }
        this.C = jww.a(requireActivity(), this.y);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_my_favorite_tab_base, viewGroup, false);
        this.D = (BottomLayout) viewInflate.findViewById(R.id.bottom_layout);
        this.B = (ViewPager) viewInflate.findViewById(R.id.view_pager);
        TabLayout tabLayout = (TabLayout) viewInflate.findViewById(R.id.tab);
        this.A = tabLayout;
        tabLayout.setTabGravity(0);
        this.A.setTabMode(0);
        this.A.setupWithViewPager(this.B);
        this.A.a(new uyw(this));
        this.D.setCallBackListener(this);
        this.G = (LoadingViewNew) viewInflate.findViewById(R.id.loading);
        if (!TextUtils.isEmpty(this.z)) {
            this.D.setRightButtonText(this.z);
        }
        if (this.y == MyFavoriteTypeEnum.MARKET && TextUtils.equals(this.z, sn5.d(this, R.string.common_functions__next, new Object[0]))) {
            this.D.setRightButtonText(sn5.d(this, R.string.common_functions__finish, new Object[0]));
        }
        m0();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.C.C1();
        this.C.a.f(getViewLifecycleOwner(), new lfy() { // from class: syw
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                MySelectedMarket mySelectedMarket;
                List<String> list;
                hqc hqcVar = (hqc) obj;
                boolean z = hqcVar instanceof nqc;
                MyFavoriteTabBaseFragment myFavoriteTabBaseFragment = this.a;
                if (!z) {
                    boolean z2 = hqcVar instanceof lqc;
                    LoadingViewNew loadingViewNew = myFavoriteTabBaseFragment.G;
                    if (z2) {
                        loadingViewNew.d();
                        return;
                    } else if (hqcVar instanceof kqc) {
                        loadingViewNew.a();
                        zyf0.a(R.string.common_feedback__something_went_wrong_tip);
                        return;
                    } else {
                        loadingViewNew.a();
                        zyf0.a(R.string.common_feedback__sorry_something_went_wrong);
                        return;
                    }
                }
                myFavoriteTabBaseFragment.G.a();
                MyFavoriteTypeEnum myFavoriteTypeEnum = myFavoriteTabBaseFragment.y;
                size = 0;
                size = 0;
                int size = 0;
                try {
                    if (myFavoriteTypeEnum == MyFavoriteTypeEnum.LEAGUE) {
                        ozw ozwVar = (ozw) ((nqc) hqcVar).a;
                        ArrayList arrayList = myFavoriteTabBaseFragment.E;
                        if (arrayList == null || arrayList.size() == 0) {
                            ArrayList arrayList2 = ozwVar.d;
                            myFavoriteTabBaseFragment.E = arrayList2;
                            if (arrayList2.size() > 0) {
                                myFavoriteTabBaseFragment.m0();
                            }
                        }
                        int iIntValue = ozwVar.a != null ? ((Integer) ozwVar.b.get(((MyFavoriteSport) myFavoriteTabBaseFragment.E.get(myFavoriteTabBaseFragment.F)).id)).intValue() : 0;
                        mfb0 mfb0VarE = lfb0.d().e(((MyFavoriteSport) myFavoriteTabBaseFragment.E.get(myFavoriteTabBaseFragment.F)).id);
                        String strG = mfb0VarE != null ? mfb0VarE.c().g(myFavoriteTabBaseFragment.requireContext()) : "";
                        if (iIntValue > 0) {
                            strG = strG + " (" + iIntValue + ")";
                        }
                        myFavoriteTabBaseFragment.A.k(myFavoriteTabBaseFragment.F).e(strG);
                        return;
                    }
                    if (myFavoriteTypeEnum != MyFavoriteTypeEnum.MARKET) {
                        if (myFavoriteTypeEnum == MyFavoriteTypeEnum.SPORT) {
                            myFavoriteTabBaseFragment.D.setEnableButton(((h1x) ((nqc) hqcVar).a).a.size() > 0);
                            return;
                        }
                        return;
                    }
                    pzw pzwVar = (pzw) ((nqc) hqcVar).a;
                    ArrayList arrayList3 = myFavoriteTabBaseFragment.E;
                    if (arrayList3 == null || arrayList3.size() == 0) {
                        myFavoriteTabBaseFragment.E = pzwVar.c;
                        myFavoriteTabBaseFragment.m0();
                    }
                    LinkedHashMap linkedHashMap = pzwVar.a;
                    if (linkedHashMap != null && (mySelectedMarket = (MySelectedMarket) linkedHashMap.get(((MyFavoriteSport) myFavoriteTabBaseFragment.E.get(myFavoriteTabBaseFragment.F)).id)) != null && (list = mySelectedMarket.marketIds) != null) {
                        size = list.size();
                    }
                    String strG2 = lfb0.d().e(((MyFavoriteSport) myFavoriteTabBaseFragment.E.get(myFavoriteTabBaseFragment.F)).id).c().g(myFavoriteTabBaseFragment.requireContext());
                    if (size > 0) {
                        strG2 = strG2 + " (" + size + ")";
                    }
                    myFavoriteTabBaseFragment.A.k(myFavoriteTabBaseFragment.F).e(strG2);
                } catch (Exception unused) {
                }
            }
        });
        this.C.b.f(getViewLifecycleOwner(), new lfy() { // from class: tyw
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                ArrayList arrayList;
                hqc hqcVar = (hqc) obj;
                boolean z = hqcVar instanceof iqc;
                MyFavoriteTabBaseFragment myFavoriteTabBaseFragment = this.a;
                if (z) {
                    myFavoriteTabBaseFragment.J = true;
                    return;
                }
                if (hqcVar instanceof nqc) {
                    myFavoriteTabBaseFragment.G.a();
                    myFavoriteTabBaseFragment.I = false;
                    MyFavoriteTabBaseFragment.b bVar = myFavoriteTabBaseFragment.H;
                    if (bVar == null || !myFavoriteTabBaseFragment.J) {
                        return;
                    }
                    bVar.b(myFavoriteTabBaseFragment.y);
                    myFavoriteTabBaseFragment.J = true;
                    return;
                }
                if (hqcVar instanceof lqc) {
                    myFavoriteTabBaseFragment.G.d();
                    myFavoriteTabBaseFragment.I = true;
                    return;
                }
                if (hqcVar instanceof kqc) {
                    myFavoriteTabBaseFragment.G.a();
                    myFavoriteTabBaseFragment.I = false;
                    zyf0.a(R.string.common_feedback__something_went_wrong_tip);
                    return;
                }
                if (hqcVar instanceof jqc) {
                    myFavoriteTabBaseFragment.G.a();
                    myFavoriteTabBaseFragment.I = false;
                    if (myFavoriteTabBaseFragment.y == MyFavoriteTypeEnum.LEAGUE && (arrayList = myFavoriteTabBaseFragment.E) != null && arrayList.size() == 0) {
                        LoadingViewNew loadingViewNew = myFavoriteTabBaseFragment.G;
                        String strD = sn5.d(myFavoriteTabBaseFragment, R.string.my_favourites_settings__no_league, new Object[0]);
                        loadingViewNew.setVisibility(0);
                        loadingViewNew.b.setVisibility(8);
                        loadingViewNew.a.setVisibility(8);
                        loadingViewNew.c.setVisibility(0);
                        TextView textView = loadingViewNew.c;
                        if (TextUtils.isEmpty(strD)) {
                            strD = sn5.c(loadingViewNew, R.string.common_feedback__no_items_available_for_purchase, new Object[0]);
                        }
                        textView.setText(strD);
                        if (TextUtils.equals(myFavoriteTabBaseFragment.z, sn5.d(myFavoriteTabBaseFragment, R.string.common_functions__next, new Object[0]))) {
                            return;
                        }
                        myFavoriteTabBaseFragment.D.setVisibility(8);
                    }
                }
            }
        });
        this.C.z1();
    }
}
