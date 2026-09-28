package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.core.model.pocket.globalpay.ChannelData;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.globalpay.GlobalDepositActivity;
import com.sportybet.android.globalpay.GlobalWithdrawActivity;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lq730;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "b", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q730 extends x0m {
    public com.google.android.material.tabs.c A;
    public r730 B;
    public List<o800.a> C;
    public final i6i0 f = g5e.a(c.a);
    public final q8i0 i;
    public ViewPager2 v;
    public b w;
    public TabLayout y;
    public String z;
    public static final /* synthetic */ ohp<Object>[] E = {new d630(0, q730.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentProviderSelectBinding;")};
    public static final a D = new a();

    public static final class a {
    }

    public static final class b extends yxi {
        public final ArrayList y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment, List<o800.a> list, String str) {
            super(fragment);
            list.getClass();
            str.getClass();
            this.y = new ArrayList();
            wae.a aVar = wae.b;
            if (!str.equals(AnalyticsEvent.DEPOSIT)) {
                if (str.equals("withdraw")) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ChannelData channelData = ((o800.a) it.next()).b;
                        int id = channelData.getId();
                        c100 c100Var = c100.e;
                        if (id == 26003 || id == 27003 || id == 29007) {
                            ArrayList arrayList = this.y;
                            int id2 = channelData.getId();
                            yhf yhfVar = new yhf();
                            yhfVar.setArguments(vj5.a(new Pair("CHANNEL_ID", Integer.valueOf(id2))));
                            arrayList.add(yhfVar);
                        } else if (id == 28001 || id == 28001 || id == 28001 || id == 28001) {
                            ArrayList arrayList2 = this.y;
                            nay.a aVar2 = nay.j0;
                            String bankCode = channelData.getBankCode();
                            aVar2.getClass();
                            nay nayVar = new nay();
                            nayVar.setArguments(vj5.a(new Pair("EXTRA_BANK_CODE", bankCode)));
                            arrayList2.add(nayVar);
                        } else if (id == 31008) {
                            ArrayList arrayList3 = this.y;
                            int id3 = channelData.getId();
                            h8y h8yVar = new h8y();
                            h8yVar.setArguments(vj5.a(new Pair("NUVEI_CHANNEL_ID", Integer.valueOf(id3))));
                            arrayList3.add(h8yVar);
                        } else if (id == 34002) {
                            ArrayList arrayList4 = this.y;
                            yva0.a aVar3 = yva0.c0;
                            int id4 = channelData.getId();
                            aVar3.getClass();
                            yva0 yva0Var = new yva0();
                            yva0Var.setArguments(vj5.a(new Pair("SPEI_BY_STP_CHANNEL_ID", Integer.valueOf(id4))));
                            arrayList4.add(yva0Var);
                        } else if (id == 35001 || id == 35002 || id == 36002 || id == 36001) {
                            ArrayList arrayList5 = this.y;
                            a0w.a aVar4 = a0w.f0;
                            String strValueOf = String.valueOf(channelData.getId());
                            String name = channelData.getName();
                            aVar4.getClass();
                            strValueOf.getClass();
                            name.getClass();
                            a0w a0wVar = new a0w();
                            a0wVar.setArguments(vj5.a(new Pair("CHANNEL_ID", strValueOf), new Pair("CHANNEL_NAME", name)));
                            arrayList5.add(a0wVar);
                        } else if (id == 202) {
                            ArrayList arrayList6 = this.y;
                            String name2 = channelData.getName();
                            name2.getClass();
                            cfu cfuVar = new cfu();
                            cfuVar.setArguments(vj5.a(new Pair("CHANNEL_NAME", name2)));
                            arrayList6.add(cfuVar);
                        }
                    }
                    return;
                }
                return;
            }
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ChannelData channelData2 = ((o800.a) it2.next()).b;
                int id5 = channelData2.getId();
                c100 c100Var2 = c100.e;
                if (id5 == 26004 || id5 == 26001 || id5 == 26002) {
                    ArrayList arrayList7 = this.y;
                    String strValueOf2 = String.valueOf(channelData2.getId());
                    strValueOf2.getClass();
                    khz khzVar = new khz();
                    khzVar.setArguments(vj5.a(new Pair("CHANNEL_ID", strValueOf2)));
                    arrayList7.add(khzVar);
                } else if (id5 == 27002) {
                    this.y.add(new mvy());
                } else if (id5 == 33001) {
                    this.y.add(new ivy());
                } else if (id5 == 33003) {
                    this.y.add(new ljb0());
                } else if (id5 == 27001) {
                    ArrayList arrayList8 = this.y;
                    za00.l0.getClass();
                    arrayList8.add(new za00());
                } else if (id5 == 28002) {
                    ArrayList arrayList9 = this.y;
                    qay.l0.getClass();
                    arrayList9.add(new qay());
                } else if (id5 == 30001) {
                    ArrayList arrayList10 = this.y;
                    bg4.l0.getClass();
                    arrayList10.add(new bg4());
                } else if (id5 == 29001 || id5 == 29004 || id5 == 29002 || id5 == 29003 || id5 == 29005 || id5 == 29006) {
                    ArrayList arrayList11 = this.y;
                    exi0.a aVar5 = exi0.m0;
                    String strValueOf3 = String.valueOf(channelData2.getId());
                    aVar5.getClass();
                    strValueOf3.getClass();
                    exi0 exi0Var = new exi0();
                    exi0Var.setArguments(vj5.a(new Pair("CHANNEL_ID", strValueOf3)));
                    arrayList11.add(exi0Var);
                } else if (id5 == 31001 || id5 == 31004 || id5 == 31006) {
                    ArrayList arrayList12 = this.y;
                    int id6 = channelData2.getId();
                    com.sportybet.android.globalpay.nuvei.deposit.a aVar6 = new com.sportybet.android.globalpay.nuvei.deposit.a();
                    Bundle bundle = new Bundle();
                    bundle.putInt("NUVEI_CHANNEL_ID", id6);
                    aVar6.setArguments(bundle);
                    arrayList12.add(aVar6);
                } else if (id5 == 34001) {
                    ArrayList arrayList13 = this.y;
                    int id7 = channelData2.getId();
                    qva0 qva0Var = new qva0();
                    qva0Var.setArguments(vj5.a(new Pair("SPEI_BY_STP_CHANNEL_ID", Integer.valueOf(id7))));
                    arrayList13.add(qva0Var);
                } else if (id5 == 202) {
                    ArrayList arrayList14 = this.y;
                    String name3 = channelData2.getName();
                    name3.getClass();
                    fdu fduVar = new fdu();
                    fduVar.setArguments(vj5.a(new Pair("CHANNEL_NAME", name3)));
                    arrayList14.add(fduVar);
                }
            }
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

    public static final /* synthetic */ class c extends saj implements Function1<View, nxi> {
        public static final c a = new c(1, nxi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentProviderSelectBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final nxi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.provider_tab;
            TabLayout tabLayout = (TabLayout) h5e.a(R.id.provider_tab, view2);
            if (tabLayout != null) {
                i = R.id.viewPager;
                ViewPager2 viewPager2 = (ViewPager2) h5e.a(R.id.viewPager, view2);
                if (viewPager2 != null) {
                    return new nxi((ConstraintLayout) view2, tabLayout, viewPager2);
                }
            }
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    public static final class d extends qlr implements Function0<Fragment> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return q730.this;
        }
    }

    public static final class e extends qlr implements Function0<w8i0> {
        public final /* synthetic */ d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.a = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class h extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? q730.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public q730() {
        ttr ttrVarA = hwr.a(a1s.c, new e(new d()));
        this.i = new q8i0(jq40.a(x730.class), new f(ttrVarA), new h(ttrVarA), new g(ttrVarA));
    }

    public final nxi m0() {
        return (nxi) this.f.a(this, E[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.google.android.material.tabs.c cVar = this.A;
        if (cVar != null) {
            cVar.b();
        }
        this.A = null;
        r730 r730Var = this.B;
        if (r730Var != null) {
            ViewPager2 viewPager2 = this.v;
            if (viewPager2 == null) {
                Intrinsics.n("viewPager");
                throw null;
            }
            viewPager2.f(r730Var);
        }
        this.B = null;
        this.w = null;
        this.C = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.v = m0().c;
        this.y = m0().b;
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        if (eVarRequireActivity instanceof GlobalDepositActivity) {
            wae.a aVar = wae.b;
            this.z = AnalyticsEvent.DEPOSIT;
        } else if (eVarRequireActivity instanceof GlobalWithdrawActivity) {
            wae.a aVar2 = wae.b;
            this.z = "withdraw";
        }
        q8i0 q8i0Var = this.i;
        f1i f1iVar = new f1i(((x730) q8i0Var.getValue()).d);
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new s730(viewLifecycleOwner, f1iVar, null, this), 3);
        f1i f1iVar2 = new f1i(((x730) q8i0Var.getValue()).e);
        ibs viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        ej5.c(ebs.a(viewLifecycleOwner2.getLifecycle()), null, null, new t730(viewLifecycleOwner2, f1iVar2, null, this), 3);
        wwd0 wwd0Var = ((x730) q8i0Var.getValue()).c;
        ibs viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        ej5.c(ebs.a(viewLifecycleOwner3.getLifecycle()), null, null, new u730(viewLifecycleOwner3, wwd0Var, null, this), 3);
    }
}
