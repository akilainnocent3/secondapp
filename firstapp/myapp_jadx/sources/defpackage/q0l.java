package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.globalpay.GlobalDepositActivity;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.GlobalDepositActivity$initViewModel$$inlined$collectWithLifecycle$default$2", f = "GlobalDepositActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class q0l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ GlobalDepositActivity b;
    public final /* synthetic */ f1i c;
    public final /* synthetic */ GlobalDepositActivity d;

    @c0d(c = "com.sportybet.android.globalpay.GlobalDepositActivity$initViewModel$$inlined$collectWithLifecycle$default$2$1", f = "GlobalDepositActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ f1i c;
        public final /* synthetic */ GlobalDepositActivity d;

        /* JADX INFO: renamed from: q0l$a$a, reason: collision with other inner class name */
        public static final class C0993a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ GlobalDepositActivity b;

            public C0993a(v5b v5bVar, GlobalDepositActivity globalDepositActivity) {
                this.b = globalDepositActivity;
                this.a = v5bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                TabLayout.TabView tabView;
                a1l.d dVar = (a1l.d) t;
                final GlobalDepositActivity globalDepositActivity = this.b;
                if (!globalDepositActivity.i && !dVar.a.isEmpty()) {
                    final List<o800> list = dVar.a;
                    Integer num = dVar.b;
                    zc zcVar = globalDepositActivity.d;
                    if (zcVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ViewPager2 viewPager2 = zcVar.w;
                    TabLayout tabLayout = zcVar.f;
                    gxi gxiVar = new gxi(globalDepositActivity, list, ga00.DEPOSIT);
                    boolean zIsEmpty = gxiVar.y.isEmpty();
                    ConstraintLayout constraintLayout = zcVar.c;
                    if (zIsEmpty) {
                        constraintLayout.setVisibility(0);
                        viewPager2.setVisibility(8);
                        tabLayout.setVisibility(8);
                        zcVar.i.setVisibility(8);
                    } else {
                        constraintLayout.setVisibility(8);
                        viewPager2.setAdapter(gxiVar);
                        globalDepositActivity.e = list;
                        o0l o0lVar = globalDepositActivity.v;
                        if (o0lVar != null) {
                            viewPager2.f(o0lVar);
                        }
                        o0l o0lVar2 = new o0l(globalDepositActivity, list, zcVar);
                        globalDepositActivity.v = o0lVar2;
                        viewPager2.c(o0lVar2);
                        new c(tabLayout, viewPager2, false, false, new c.b() { // from class: k0l
                            @Override // com.google.android.material.tabs.c.b
                            public final void a(TabLayout.g gVar, int i) {
                                String string;
                                int i2 = GlobalDepositActivity.w;
                                GlobalDepositActivity globalDepositActivity2 = globalDepositActivity;
                                if (i == 0) {
                                    string = globalDepositActivity2.getCMSString(R.string.common_functions__all, new Object[0]);
                                } else {
                                    string = ((o800) list.get(i - 1)).a.e(globalDepositActivity2).toString();
                                }
                                gVar.e(string);
                            }
                        }).a();
                        final zc zcVar2 = globalDepositActivity.d;
                        if (zcVar2 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        TextView textView = zcVar2.e;
                        TabLayout tabLayout2 = zcVar2.f;
                        if (!tabLayout2.isLaidOut() || tabLayout2.isLayoutRequested()) {
                            tabLayout2.addOnLayoutChangeListener(new n0l(zcVar2));
                        } else {
                            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                            if (layoutParams == null) {
                                bmy.a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                return null;
                            }
                            TabLayout.g gVarK = tabLayout2.k(0);
                            layoutParams.width = (gVarK == null || (tabView = gVarK.h) == null) ? 0 : tabView.getWidth();
                            textView.setLayoutParams(layoutParams);
                            textView.setVisibility(0);
                        }
                        textView.setOnClickListener(new View.OnClickListener() { // from class: l0l
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i = GlobalDepositActivity.w;
                                TabLayout tabLayout3 = zcVar2.f;
                                tabLayout3.s(tabLayout3.k(0), true);
                            }
                        });
                        final yp40 yp40Var = new yp40();
                        tabLayout2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: m0l
                            @Override // android.view.View.OnScrollChangeListener
                            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                                int i5 = GlobalDepositActivity.w;
                                view.getClass();
                                zc zcVar3 = zcVar2;
                                yp40 yp40Var2 = yp40Var;
                                if (i == 0) {
                                    zcVar3.e.setBackgroundColor(globalDepositActivity.getColor(R.color.background_general_primary));
                                    yp40Var2.a = false;
                                } else {
                                    if (yp40Var2.a) {
                                        return;
                                    }
                                    zcVar3.e.setBackgroundResource(R.drawable.background_deposit_tab_all);
                                    yp40Var2.a = true;
                                }
                            }
                        });
                        if (num != null) {
                            tabLayout.s(tabLayout.k(num.intValue() + 1), true);
                        }
                    }
                    globalDepositActivity.i = true;
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1i f1iVar, v1b v1bVar, GlobalDepositActivity globalDepositActivity) {
            super(2, v1bVar);
            this.c = f1iVar;
            this.d = globalDepositActivity;
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
                C0993a c0993a = new C0993a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0993a, this) == y5bVar) {
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
    public q0l(GlobalDepositActivity globalDepositActivity, f1i f1iVar, v1b v1bVar, GlobalDepositActivity globalDepositActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = globalDepositActivity;
        this.c = f1iVar;
        this.d = globalDepositActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new q0l(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((q0l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
