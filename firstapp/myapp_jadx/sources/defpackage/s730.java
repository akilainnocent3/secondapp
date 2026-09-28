package defpackage;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.providerselect.ProviderSelectFragment$initViewModel$$inlined$collectWithLifecycle$default$1", f = "ProviderSelectFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class s730 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ f1i c;
    public final /* synthetic */ q730 d;

    @c0d(c = "com.sportybet.android.globalpay.providerselect.ProviderSelectFragment$initViewModel$$inlined$collectWithLifecycle$default$1$1", f = "ProviderSelectFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ f1i c;
        public final /* synthetic */ q730 d;

        /* JADX INFO: renamed from: s730$a$a, reason: collision with other inner class name */
        public static final class C1080a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ q730 b;

            public C1080a(v5b v5bVar, q730 q730Var) {
                this.b = q730Var;
                this.a = v5bVar;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x004a  */
            /* JADX WARN: Code duplicated, block: B:26:0x0053  */
            /* JADX WARN: Code duplicated, block: B:28:0x005a  */
            /* JADX WARN: Code duplicated, block: B:30:0x0062  */
            /* JADX WARN: Code duplicated, block: B:31:0x0065  */
            /* JADX WARN: Code duplicated, block: B:34:0x0074  */
            /* JADX WARN: Code duplicated, block: B:36:0x007d  */
            /* JADX WARN: Code duplicated, block: B:38:0x0081  */
            /* JADX WARN: Code duplicated, block: B:41:0x009e  */
            /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
            /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
            /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
            /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
            /* JADX WARN: Code duplicated, block: B:51:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
            /* JADX WARN: Code duplicated, block: B:64:0x0103  */
            /* JADX WARN: Code duplicated, block: B:66:0x010f  */
            /* JADX WARN: Code duplicated, block: B:68:0x0113  */
            /* JADX WARN: Code duplicated, block: B:75:0x0130  */
            /* JADX WARN: Code duplicated, block: B:77:0x0134  */
            /* JADX WARN: Code duplicated, block: B:79:0x0138  */
            /* JADX WARN: Code duplicated, block: B:81:0x013c  */
            /* JADX WARN: Code duplicated, block: B:83:0x0140  */
            /* JADX WARN: Code duplicated, block: B:85:0x0144  */
            /* JADX WARN: Code duplicated, block: B:87:0x0148  */
            /* JADX WARN: Code duplicated, block: B:89:0x014c  */
            /* JADX WARN: Code duplicated, block: B:91:0x0150  */
            /* JADX WARN: Code duplicated, block: B:93:0x00ff A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:94:0x00fb A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:95:0x00f5 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:96:0x00e2 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:97:0x00e3 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x00f9 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:99:0x00f9 A[SYNTHETIC] */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                q730.b bVar;
                String str;
                ViewPager2 viewPager2;
                TabLayout tabLayout;
                int i;
                r730 r730Var;
                ViewPager2 viewPager3;
                TabLayout tabLayout2;
                ViewPager2 viewPager4;
                Iterator<T> it;
                int i2;
                boolean zHasNext;
                int i3;
                TabLayout tabLayout3;
                TabLayout tabLayout4;
                ViewPager2 viewPager5;
                TabLayout.g gVarK;
                TextView textView;
                T next;
                int i4;
                final o800.a aVar;
                TabLayout tabLayout5;
                TabLayout.g gVarK2;
                View viewInflate;
                ImageView imageView;
                final List<o800.a> list = (List) t;
                q730.a aVar2 = q730.D;
                final q730 q730Var = this.b;
                if (q730Var.w == null) {
                    q730Var.C = list;
                    str = q730Var.z;
                    if (str != null) {
                        Intrinsics.n("action");
                        throw null;
                    }
                    bVar = new q730.b(q730Var, list, str);
                    q730Var.w = bVar;
                    viewPager2 = q730Var.v;
                    if (viewPager2 != null) {
                        Intrinsics.n("viewPager");
                        throw null;
                    }
                    viewPager2.setAdapter(bVar);
                    tabLayout = q730Var.y;
                    if (tabLayout != null) {
                        Intrinsics.n("tabLayout");
                        throw null;
                    }
                    if (list.size() <= 1) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    tabLayout.setVisibility(i);
                    r730Var = new r730(q730Var);
                    q730Var.B = r730Var;
                    viewPager3 = q730Var.v;
                    if (viewPager3 != null) {
                        Intrinsics.n("viewPager");
                        throw null;
                    }
                    viewPager3.c(r730Var);
                    tabLayout2 = q730Var.y;
                    if (tabLayout2 != null) {
                        Intrinsics.n("tabLayout");
                        throw null;
                    }
                    viewPager4 = q730Var.v;
                    if (viewPager4 != null) {
                        Intrinsics.n("viewPager");
                        throw null;
                    }
                    c cVar = new c(tabLayout2, viewPager4, false, false, new c.b() { // from class: o730
                        @Override // com.google.android.material.tabs.c.b
                        public final void a(TabLayout.g gVar, int i5) {
                            q730.a aVar3 = q730.D;
                            UiText uiText = ((o800.a) list.get(i5)).a;
                            Context contextRequireContext = q730Var.requireContext();
                            contextRequireContext.getClass();
                            gVar.e(uiText.e(contextRequireContext).toString());
                        }
                    });
                    cVar.a();
                    q730Var.A = cVar;
                    it = list.iterator();
                    i2 = 0;
                    while (true) {
                        zHasNext = it.hasNext();
                        i3 = R.id.text1;
                        if (zHasNext) {
                            tabLayout3 = q730Var.y;
                            if (tabLayout3 != null) {
                                Intrinsics.n("tabLayout");
                                throw null;
                            }
                            tabLayout3.a(new v730());
                            tabLayout4 = q730Var.y;
                            if (tabLayout4 != null) {
                                Intrinsics.n("tabLayout");
                                throw null;
                            }
                            viewPager5 = q730Var.v;
                            if (viewPager5 != null) {
                                Intrinsics.n("viewPager");
                                throw null;
                            }
                            gVarK = tabLayout4.k(viewPager5.getCurrentItem());
                            if (gVarK == null && (textView = (TextView) gVarK.h.findViewById(R.id.text1)) != null) {
                                textView.setTextAppearance(com.sportybet.android.gp.tz.R.style.InnerPaymentTabSelected);
                                break;
                            }
                            break;
                            break;
                        }
                        next = it.next();
                        i4 = i2 + 1;
                        if (i2 >= 0) {
                            b.q();
                            throw null;
                        }
                        aVar = (o800.a) next;
                        if (!aVar.c) {
                            tabLayout5 = q730Var.y;
                            if (tabLayout5 != null) {
                                Intrinsics.n("tabLayout");
                                throw null;
                            }
                            gVarK2 = tabLayout5.k(i2);
                            if (gVarK2 != null) {
                                viewInflate = q730Var.getLayoutInflater().inflate(com.sportybet.android.gp.tz.R.layout.inner_payment_tab, (ViewGroup) null, false);
                                imageView = (ImageView) h5e.a(com.sportybet.android.gp.tz.R.id.tab_icon, viewInflate);
                                if (imageView != null) {
                                    i3 = com.sportybet.android.gp.tz.R.id.tab_icon;
                                } else if (((TextView) h5e.a(R.id.text1, viewInflate)) != null) {
                                    imageView.setOnClickListener(new View.OnClickListener() { // from class: p730
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            q730.a aVar3 = q730.D;
                                            x730 x730Var = (x730) q730Var.i.getValue();
                                            int id = aVar.b.getId();
                                            v800 v800Var = x730Var.a;
                                            et7 et7Var = v800Var.m;
                                            if (et7Var != null) {
                                                ej5.c(et7Var, null, null, new s800(id, v800Var, null), 3);
                                            }
                                        }
                                    });
                                    gVarK2.c((LinearLayout) viewInflate);
                                }
                                bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                                return null;
                            }
                            continue;
                        }
                        i2 = i4;
                    }
                } else if (!Intrinsics.g(q730Var.C, list)) {
                    r730 r730Var2 = q730Var.B;
                    if (r730Var2 != null) {
                        ViewPager2 viewPager6 = q730Var.v;
                        if (viewPager6 == null) {
                            Intrinsics.n("viewPager");
                            throw null;
                        }
                        viewPager6.f(r730Var2);
                    }
                    q730Var.B = null;
                    c cVar2 = q730Var.A;
                    if (cVar2 != null) {
                        cVar2.b();
                    }
                    q730Var.A = null;
                    TabLayout tabLayout6 = q730Var.y;
                    if (tabLayout6 == null) {
                        Intrinsics.n("tabLayout");
                        throw null;
                    }
                    tabLayout6.e0.clear();
                    q730Var.C = list;
                    str = q730Var.z;
                    if (str != null) {
                        Intrinsics.n("action");
                        throw null;
                    }
                    bVar = new q730.b(q730Var, list, str);
                    q730Var.w = bVar;
                    viewPager2 = q730Var.v;
                    if (viewPager2 != null) {
                        Intrinsics.n("viewPager");
                        throw null;
                    }
                    viewPager2.setAdapter(bVar);
                    tabLayout = q730Var.y;
                    if (tabLayout != null) {
                        Intrinsics.n("tabLayout");
                        throw null;
                    }
                    if (list.size() <= 1) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    tabLayout.setVisibility(i);
                    r730Var = new r730(q730Var);
                    q730Var.B = r730Var;
                    viewPager3 = q730Var.v;
                    if (viewPager3 != null) {
                        Intrinsics.n("viewPager");
                        throw null;
                    }
                    viewPager3.c(r730Var);
                    tabLayout2 = q730Var.y;
                    if (tabLayout2 != null) {
                        Intrinsics.n("tabLayout");
                        throw null;
                    }
                    viewPager4 = q730Var.v;
                    if (viewPager4 != null) {
                        Intrinsics.n("viewPager");
                        throw null;
                    }
                    c cVar3 = new c(tabLayout2, viewPager4, false, false, new c.b() { // from class: o730
                        @Override // com.google.android.material.tabs.c.b
                        public final void a(TabLayout.g gVar, int i5) {
                            q730.a aVar3 = q730.D;
                            UiText uiText = ((o800.a) list.get(i5)).a;
                            Context contextRequireContext = q730Var.requireContext();
                            contextRequireContext.getClass();
                            gVar.e(uiText.e(contextRequireContext).toString());
                        }
                    });
                    cVar3.a();
                    q730Var.A = cVar3;
                    it = list.iterator();
                    i2 = 0;
                    while (true) {
                        zHasNext = it.hasNext();
                        i3 = R.id.text1;
                        if (zHasNext) {
                            tabLayout3 = q730Var.y;
                            if (tabLayout3 != null) {
                                Intrinsics.n("tabLayout");
                                throw null;
                            }
                            tabLayout3.a(new v730());
                            tabLayout4 = q730Var.y;
                            if (tabLayout4 != null) {
                                Intrinsics.n("tabLayout");
                                throw null;
                            }
                            viewPager5 = q730Var.v;
                            if (viewPager5 != null) {
                                Intrinsics.n("viewPager");
                                throw null;
                            }
                            gVarK = tabLayout4.k(viewPager5.getCurrentItem());
                            if (gVarK == null) {
                                break;
                            }
                            textView.setTextAppearance(com.sportybet.android.gp.tz.R.style.InnerPaymentTabSelected);
                            break;
                        }
                        next = it.next();
                        i4 = i2 + 1;
                        if (i2 >= 0) {
                            b.q();
                            throw null;
                        }
                        aVar = (o800.a) next;
                        if (!aVar.c) {
                            tabLayout5 = q730Var.y;
                            if (tabLayout5 != null) {
                                Intrinsics.n("tabLayout");
                                throw null;
                            }
                            gVarK2 = tabLayout5.k(i2);
                            if (gVarK2 != null) {
                                viewInflate = q730Var.getLayoutInflater().inflate(com.sportybet.android.gp.tz.R.layout.inner_payment_tab, (ViewGroup) null, false);
                                imageView = (ImageView) h5e.a(com.sportybet.android.gp.tz.R.id.tab_icon, viewInflate);
                                if (imageView != null) {
                                    i3 = com.sportybet.android.gp.tz.R.id.tab_icon;
                                } else if (((TextView) h5e.a(R.id.text1, viewInflate)) != null) {
                                    imageView.setOnClickListener(new View.OnClickListener() { // from class: p730
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            q730.a aVar3 = q730.D;
                                            x730 x730Var = (x730) q730Var.i.getValue();
                                            int id = aVar.b.getId();
                                            v800 v800Var = x730Var.a;
                                            et7 et7Var = v800Var.m;
                                            if (et7Var != null) {
                                                ej5.c(et7Var, null, null, new s800(id, v800Var, null), 3);
                                            }
                                        }
                                    });
                                    gVarK2.c((LinearLayout) viewInflate);
                                }
                                bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                                return null;
                            }
                            continue;
                        }
                        i2 = i4;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1i f1iVar, v1b v1bVar, q730 q730Var) {
            super(2, v1bVar);
            this.c = f1iVar;
            this.d = q730Var;
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
                C1080a c1080a = new C1080a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1080a, this) == y5bVar) {
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
    public s730(ibs ibsVar, f1i f1iVar, v1b v1bVar, q730 q730Var) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = ibsVar;
        this.c = f1iVar;
        this.d = q730Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new s730(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s730) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
