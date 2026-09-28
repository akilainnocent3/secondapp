package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.globalpay.GlobalWithdrawActivity;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.GlobalWithdrawActivity$initViewModel$$inlined$collectWithLifecycle$default$2", f = "GlobalWithdrawActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class c3l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ GlobalWithdrawActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ GlobalWithdrawActivity d;

    @c0d(c = "com.sportybet.android.globalpay.GlobalWithdrawActivity$initViewModel$$inlined$collectWithLifecycle$default$2$1", f = "GlobalWithdrawActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ GlobalWithdrawActivity d;

        /* JADX INFO: renamed from: c3l$a$a, reason: collision with other inner class name */
        public static final class C0153a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ GlobalWithdrawActivity b;

            public C0153a(v5b v5bVar, GlobalWithdrawActivity globalWithdrawActivity) {
                this.b = globalWithdrawActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                TabLayout.TabView tabView;
                final List<o800> list = (List) t;
                final GlobalWithdrawActivity globalWithdrawActivity = this.b;
                if (!globalWithdrawActivity.v && !list.isEmpty()) {
                    ad adVar = globalWithdrawActivity.d;
                    if (adVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ViewPager2 viewPager2 = adVar.y;
                    TabLayout tabLayout = adVar.A;
                    View view = adVar.v;
                    ConstraintLayout constraintLayout = adVar.d;
                    gxi gxiVar = new gxi(globalWithdrawActivity, list, ga00.WITHDRAW);
                    int i = 0;
                    if (gxiVar.y.isEmpty()) {
                        constraintLayout.setVisibility(0);
                        viewPager2.setVisibility(8);
                        tabLayout.setVisibility(8);
                        view.setVisibility(8);
                    } else {
                        viewPager2.setAdapter(gxiVar);
                        new c(tabLayout, viewPager2, false, false, new c.b() { // from class: w2l
                            @Override // com.google.android.material.tabs.c.b
                            public final void a(TabLayout.g gVar, int i2) {
                                String string;
                                int i3 = GlobalWithdrawActivity.y;
                                GlobalWithdrawActivity globalWithdrawActivity2 = globalWithdrawActivity;
                                if (i2 == 0) {
                                    string = globalWithdrawActivity2.getCMSString(R.string.common_functions__all, new Object[0]);
                                } else {
                                    string = ((o800) list.get(i2 - 1)).a.e(globalWithdrawActivity2).toString();
                                }
                                gVar.e(string);
                            }
                        }).a();
                        view.setVisibility(0);
                        if (globalWithdrawActivity.A1().w || globalWithdrawActivity.getCountryManager().R()) {
                            constraintLayout.setVisibility(8);
                            globalWithdrawActivity.e = list;
                            a3l a3lVar = globalWithdrawActivity.w;
                            if (a3lVar != null) {
                                viewPager2.f(a3lVar);
                            }
                            a3l a3lVar2 = new a3l(globalWithdrawActivity, list);
                            globalWithdrawActivity.w = a3lVar2;
                            viewPager2.c(a3lVar2);
                            int intExtra = globalWithdrawActivity.getIntent().getIntExtra("withdrawChannelId", 0);
                            if (intExtra != 0) {
                                List<o800> list2 = globalWithdrawActivity.e;
                                if (list2 == null) {
                                    Intrinsics.n("providersTabs");
                                    throw null;
                                }
                                Iterator<o800> it = list2.iterator();
                                loop1: while (true) {
                                    if (!it.hasNext()) {
                                        i = -1;
                                        break;
                                    }
                                    List<o800.a> list3 = it.next().b.a;
                                    if (list3 == null || !list3.isEmpty()) {
                                        Iterator<T> it2 = list3.iterator();
                                        while (it2.hasNext()) {
                                            if (((o800.a) it2.next()).b.getId() == intExtra) {
                                                break loop1;
                                            }
                                        }
                                    }
                                    i++;
                                }
                                if (i >= 0) {
                                    ad adVar2 = globalWithdrawActivity.d;
                                    if (adVar2 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    TabLayout tabLayout2 = adVar2.A;
                                    tabLayout2.s(tabLayout2.k(i + 1), true);
                                }
                            }
                        } else {
                            adVar.f.setImageResource(R.drawable.ic_security);
                            String cMSString = globalWithdrawActivity.getCMSString(R.string.page_withdraw__enhanced_protection, new Object[0]);
                            String cMSString2 = globalWithdrawActivity.getCMSString(R.string.page_withdraw__no_deposited_tips, new Object[0]);
                            adVar.i.setText(cMSString);
                            adVar.e.setText(cMSString2);
                            adVar.a.announceForAccessibility(cMSString + cMSString2);
                            viewPager2.setVisibility(8);
                            constraintLayout.setVisibility(0);
                            int size = list.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                ad adVar3 = globalWithdrawActivity.d;
                                if (adVar3 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                TabLayout.g gVarK = adVar3.A.k(i2);
                                if (gVarK != null && (tabView = gVarK.h) != null) {
                                    tabView.setEnabled(false);
                                    tabView.setSelected(false);
                                }
                            }
                        }
                    }
                    globalWithdrawActivity.v = true;
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, GlobalWithdrawActivity globalWithdrawActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = globalWithdrawActivity;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar, this.d);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0153a c0153a = new C0153a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0153a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3l(GlobalWithdrawActivity globalWithdrawActivity, lyh lyhVar, v1b v1bVar, GlobalWithdrawActivity globalWithdrawActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = globalWithdrawActivity;
        this.c = lyhVar;
        this.d = globalWithdrawActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new c3l(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c3l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(this.c, null, this.d);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
