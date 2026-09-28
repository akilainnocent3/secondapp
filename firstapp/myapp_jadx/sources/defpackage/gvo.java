package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgvo;", "Landroidx/fragment/app/d;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gvo extends d {
    public yhd0 a;
    public c b;
    public final wuo c = new Runnable() { // from class: wuo
        /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r2v9 */
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
        @Override // java.lang.Runnable
        public final void run() {
            ?? r2;
            int marginEnd;
            View view;
            final gvo gvoVar = this.a;
            yhd0 yhd0Var = gvoVar.a;
            if (yhd0Var != null && gvoVar.isAdded()) {
                TabLayout tabLayout = yhd0Var.b;
                if (tabLayout.getTabCount() == 0 || tabLayout.getWidth() == 0) {
                    return;
                }
                gvo.j0(tabLayout, false);
                IntRange intRangeN = f.n(0, tabLayout.getTabCount());
                ArrayList arrayList = new ArrayList(l48.r(intRangeN, 10));
                Iterator<Integer> it = intRangeN.iterator();
                while (((mwo) it).c) {
                    TabLayout.g gVarK = tabLayout.k(((zvo) it).nextInt());
                    if (gVarK == null || (view = gVarK.f) == null) {
                        marginEnd = 0;
                    } else {
                        Context context = tabLayout.getContext();
                        context.getClass();
                        view.measure(0, View.MeasureSpec.makeMeasureSpec(r0b.a(context, 32), 1073741824));
                        int measuredWidth = view.getMeasuredWidth();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        marginEnd = measuredWidth + (marginLayoutParams != null ? marginLayoutParams.getMarginEnd() : 0);
                    }
                    arrayList.add(Integer.valueOf(marginEnd));
                }
                Integer num = (Integer) CollectionsKt.e0(arrayList);
                if (num == null) {
                    r2 = 0;
                } else if (tabLayout.getTabCount() * num.intValue() <= tabLayout.getWidth()) {
                    r2 = 1;
                } else {
                    r2 = 0;
                }
                tabLayout.setTabMode(r2);
                tabLayout.setTabGravity(r2 == 0 ? 2 : 0);
                gvo.j0(tabLayout, r2);
                tabLayout.post(new Runnable() { // from class: avo
                    @Override // java.lang.Runnable
                    public final void run() {
                        gvoVar.m0();
                    }
                });
            }
        }
    };
    public final xuo d = new ViewTreeObserver.OnScrollChangedListener() { // from class: xuo
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            this.a.m0();
        }
    };

    public static final class a extends yxi {
        public final ArrayList A;
        public final ArrayList y;
        public final ArrayList z;

        public a(gvo gvoVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            super(gvoVar);
            this.y = arrayList;
            this.z = arrayList2;
            this.A = arrayList3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int getItemCount() {
            return this.y.size();
        }

        @Override // defpackage.yxi
        public final Fragment k(int i) {
            return (Fragment) this.y.get(i);
        }
    }

    public static final class b implements TabLayout.d {
        public b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
            gVar.getClass();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) {
            TextView textView;
            gVar.getClass();
            View view = gVar.f;
            if (view != null && (textView = (TextView) view.findViewById(R.id.tab_title)) != null) {
                textView.setTextColor(gVar.h.getContext().getColor(R.color.text_type1_primary));
            }
            gvo.this.m0();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
            TextView textView;
            gVar.getClass();
            View view = gVar.f;
            if (view == null || (textView = (TextView) view.findViewById(R.id.tab_title)) == null) {
                return;
            }
            textView.setTextColor(gVar.h.getContext().getColor(R.color.text_type2_primary));
        }
    }

    public static void j0(TabLayout tabLayout, boolean z) {
        View view;
        int i = z ? -1 : -2;
        int tabCount = tabLayout.getTabCount();
        int i2 = 0;
        while (i2 < tabCount) {
            TabLayout.g gVarK = tabLayout.k(i2);
            if (gVarK != null && (view = gVarK.f) != null) {
                Context context = tabLayout.getContext();
                context.getClass();
                boolean z2 = i2 < tabLayout.getTabCount() - 1;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, r0b.a(context, 32));
                if (z2) {
                    layoutParams.setMarginEnd(r0b.a(context, 4));
                }
                view.setLayoutParams(layoutParams);
            }
            i2++;
        }
    }

    public final void m0() {
        yhd0 yhd0Var = this.a;
        if (yhd0Var == null) {
            return;
        }
        TabLayout tabLayout = yhd0Var.b;
        ImageView imageView = yhd0Var.c;
        ImageView imageView2 = yhd0Var.d;
        if (tabLayout.getTabCount() == 0) {
            return;
        }
        TabLayout.g gVarK = tabLayout.k(tabLayout.getTabCount() - 1);
        int i = 8;
        imageView.setVisibility(tabLayout.getScrollX() > 0 ? 0 : 8);
        int width = tabLayout.getWidth();
        TabLayout.TabView tabView = gVarK != null ? gVarK.h : null;
        if (tabView != null && tabView.getRight() > tabLayout.getScrollX() + width) {
            i = 0;
        }
        imageView2.setVisibility(i);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.InsureInfoDialog);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, zuy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(final LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object bVar;
        T t;
        ?? r2 = zuy.a;
        layoutInflater.getClass();
        dq40 dq40Var = new dq40();
        dq40Var.a = r2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z2 = arguments.getBoolean("key_show_any_win_info");
            z3 = arguments.getBoolean("key_show_flex_bet_info");
            z4 = arguments.getBoolean("key_show_cut_bet_info");
            z5 = arguments.getBoolean("key_show_one_two_up_info");
            z6 = arguments.getBoolean("key_show_early_payout_info");
            String string = arguments.getString("key_one_two_up_state");
            if (string == null) {
                t = r2;
            } else {
                try {
                    zi50.a aVar = zi50.b;
                    bVar = zuy.valueOf(string);
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                Object obj = zuy.a;
                if (bVar instanceof zi50.b) {
                    bVar = obj;
                }
                t = (zuy) bVar;
            }
            if (t == r2) {
                z5 = false;
            }
            dq40Var.a = t;
            z = arguments.getBoolean("key_is_one_cut_v3", false);
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.spr_insure_info_dialog, (ViewGroup) null, false);
        int i = R.id.close;
        ImageView imageView = (ImageView) h5e.a(R.id.close, viewInflate);
        if (imageView != null) {
            i = R.id.tab_layout;
            TabLayout tabLayout = (TabLayout) h5e.a(R.id.tab_layout, viewInflate);
            if (tabLayout != null) {
                i = R.id.tab_left_arrow;
                ImageView imageView2 = (ImageView) h5e.a(R.id.tab_left_arrow, viewInflate);
                if (imageView2 != null) {
                    i = R.id.tab_right_arrow;
                    ImageView imageView3 = (ImageView) h5e.a(R.id.tab_right_arrow, viewInflate);
                    if (imageView3 != null) {
                        i = R.id.viewPager;
                        ViewPager2 viewPager2 = (ViewPager2) h5e.a(R.id.viewPager, viewInflate);
                        if (viewPager2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            this.a = new yhd0(constraintLayout, imageView, tabLayout, imageView2, imageView3, viewPager2);
                            imageView.setOnClickListener(new View.OnClickListener() { // from class: yuo
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    this.a.dismiss();
                                }
                            });
                            ArrayList arrayList = new ArrayList();
                            final ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            if (z3) {
                                arrayList.add(new evh());
                                arrayList2.add(sn5.d(this, R.string.common_bet_ways__flex, new Object[0]));
                                arrayList3.add(Integer.valueOf(R.drawable.ic_flexible_active));
                            }
                            if (z5) {
                                wry wryVar = new wry();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("key_one_two_up_state", ((zuy) dq40Var.a).name());
                                wryVar.setArguments(bundle2);
                                arrayList.add(wryVar);
                                arrayList2.add(sn5.d(this, R.string.common_bet_ways__1up_and_2up, new Object[0]));
                                arrayList3.add(Integer.valueOf(R.drawable.ic_up_flag_normal));
                            }
                            if (z6) {
                                arrayList.add(new ikf());
                                arrayList2.add(sn5.d(this, R.string.component_betslip__early_goals, new Object[0]));
                                arrayList3.add(Integer.valueOf(R.drawable.ic_early_payout_active));
                            }
                            if (z4) {
                                eqy eqyVar = new eqy();
                                Bundle bundle3 = new Bundle();
                                bundle3.putBoolean("key_is_one_cut_v3", z);
                                eqyVar.setArguments(bundle3);
                                arrayList.add(eqyVar);
                                arrayList2.add(sn5.d(this, R.string.common_bet_ways__one_cut, new Object[0]));
                                arrayList3.add(Integer.valueOf(R.drawable.ic_one_cut_active));
                            }
                            if (z2) {
                                arrayList.add(new ol0());
                                arrayList2.add(sn5.d(this, R.string.common_bet_ways__any_win, new Object[0]));
                                arrayList3.add(Integer.valueOf(R.drawable.ic_any_win_active));
                            }
                            final a aVar3 = new a(this, arrayList, arrayList2, arrayList3);
                            viewPager2.setAdapter(aVar3);
                            viewPager2.setOffscreenPageLimit(2);
                            viewPager2.setUserInputEnabled(false);
                            c cVar = new c(tabLayout, viewPager2, false, false, new c.b(this, layoutInflater, arrayList2) { // from class: zuo
                                public final /* synthetic */ LayoutInflater b;
                                public final /* synthetic */ ArrayList c;

                                {
                                    this.b = layoutInflater;
                                    this.c = arrayList2;
                                }

                                @Override // com.google.android.material.tabs.c.b
                                public final void a(TabLayout.g gVar, int i2) {
                                    gvo.a aVar4 = this.a;
                                    ArrayList arrayList4 = aVar4.z;
                                    String str = (String) ((i2 < 0 || i2 >= arrayList4.size()) ? "" : arrayList4.get(i2));
                                    ArrayList arrayList5 = aVar4.A;
                                    int iIntValue = ((Number) ((i2 < 0 || i2 >= arrayList5.size()) ? 0 : arrayList5.get(i2))).intValue();
                                    boolean z7 = i2 == 0;
                                    boolean z8 = i2 < this.c.size() - 1;
                                    View viewInflate2 = this.b.inflate(R.layout.spr_insure_custom_tab, (ViewGroup) null, false);
                                    int i3 = R.id.tab_image;
                                    ImageView imageView4 = (ImageView) h5e.a(R.id.tab_image, viewInflate2);
                                    if (imageView4 != null) {
                                        i3 = R.id.tab_title;
                                        TextView textView = (TextView) h5e.a(R.id.tab_title, viewInflate2);
                                        if (textView != null) {
                                            View view = (LinearLayout) viewInflate2;
                                            imageView4.setImageResource(iIntValue);
                                            textView.setText(str);
                                            textView.setTextColor(view.getContext().getColor(z7 ? R.color.text_type1_primary : R.color.text_type2_primary));
                                            Context context = view.getContext();
                                            context.getClass();
                                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, r0b.a(context, 32));
                                            if (z8) {
                                                layoutParams.setMarginEnd(r0b.a(context, 4));
                                            }
                                            view.setLayoutParams(layoutParams);
                                            gVar.c(view);
                                            gVar.h.setGravity(80);
                                            return;
                                        }
                                    }
                                    bmy.a("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i3)));
                                }
                            });
                            cVar.a();
                            this.b = cVar;
                            tabLayout.a(new b());
                            tabLayout.getViewTreeObserver().addOnScrollChangedListener(this.d);
                            yhd0 yhd0Var = this.a;
                            if (yhd0Var != null) {
                                final TabLayout tabLayout2 = yhd0Var.b;
                                final ImageView imageView4 = yhd0Var.c;
                                final ImageView imageView5 = yhd0Var.d;
                                tabLayout2.post(new Runnable() { // from class: bvo
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.a.m0();
                                    }
                                });
                                imageView4.setOnClickListener(new View.OnClickListener() { // from class: cvo
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        final TabLayout tabLayout3 = tabLayout2;
                                        TabLayout.g gVarK = tabLayout3.k(0);
                                        if (gVarK != null) {
                                            gVarK.b();
                                        }
                                        tabLayout3.post(new Runnable() { // from class: fvo
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                tabLayout3.scrollTo(0, 0);
                                            }
                                        });
                                        imageView5.setVisibility(0);
                                        imageView4.setVisibility(8);
                                    }
                                });
                                imageView5.setOnClickListener(new View.OnClickListener() { // from class: dvo
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        final TabLayout tabLayout3 = tabLayout2;
                                        final int tabCount = tabLayout3.getTabCount();
                                        TabLayout.g gVarK = tabLayout3.k(tabCount - 1);
                                        if (gVarK != null) {
                                            gVarK.b();
                                        }
                                        tabLayout3.post(new Runnable() { // from class: evo
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i2 = tabCount - 1;
                                                TabLayout tabLayout4 = tabLayout3;
                                                TabLayout.g gVarK2 = tabLayout4.k(i2);
                                                TabLayout.TabView tabView = gVarK2 != null ? gVarK2.h : null;
                                                if (tabView != null) {
                                                    tabLayout4.scrollTo(tabView.getRight() - tabLayout4.getWidth(), 0);
                                                }
                                            }
                                        });
                                        imageView4.setVisibility(0);
                                        imageView5.setVisibility(8);
                                    }
                                });
                            }
                            constraintLayout.getClass();
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        yhd0 yhd0Var = this.a;
        if (yhd0Var != null) {
            TabLayout tabLayout = yhd0Var.b;
            tabLayout.removeCallbacks(this.c);
            tabLayout.getViewTreeObserver().removeOnScrollChangedListener(this.d);
            yhd0Var.e.setAdapter(null);
        }
        c cVar = this.b;
        if (cVar != null) {
            cVar.b();
        }
        this.b = null;
        this.a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        int iA = r0b.a(contextRequireContext, 32);
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        int iA2 = r0b.a(contextRequireContext2, 560);
        int width = requireActivity().getWindow().getDecorView().getWidth();
        Integer numValueOf = Integer.valueOf(width);
        if (width <= 0) {
            numValueOf = null;
        }
        int iMin = Math.min((numValueOf != null ? numValueOf.intValue() : getResources().getDisplayMetrics().widthPixels) - iA, iA2);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(iMin, -2);
        }
        yhd0 yhd0Var = this.a;
        if (yhd0Var != null) {
            yhd0Var.b.post(this.c);
        }
    }
}
