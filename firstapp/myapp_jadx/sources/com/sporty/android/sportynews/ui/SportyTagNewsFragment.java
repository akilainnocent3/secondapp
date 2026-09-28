package com.sporty.android.sportynews.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.sportynews.ui.SportyTagNewsFragment;
import com.sportybet.android.gp.tz.R;
import defpackage.a1s;
import defpackage.atc0;
import defpackage.c0d;
import defpackage.cfx;
import defpackage.ctc0;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.ey0;
import defpackage.fvn;
import defpackage.hwr;
import defpackage.ib5;
import defpackage.ibs;
import defpackage.iel;
import defpackage.jq40;
import defpackage.lx5;
import defpackage.m850;
import defpackage.mpe0;
import defpackage.myh;
import defpackage.n4m;
import defpackage.op8;
import defpackage.pcd0;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.s9s;
import defpackage.tje0;
import defpackage.ttr;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.vj5;
import defpackage.w8i0;
import defpackage.wsc0;
import defpackage.y5b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sporty/android/sportynews/ui/SportyTagNewsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lfzs;", "isLoading", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyTagNewsFragment extends n4m {
    public final cfx f = new cfx(jq40.a(pcd0.class), new b());
    public final mpe0 i = hwr.b(new fvn(this, 2));
    public wsc0 v;
    public final q8i0 w;

    @c0d(c = "com.sporty.android.sportynews.ui.SportyTagNewsFragment$onCreateView$1", f = "SportyTagNewsFragment.kt", l = {81}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.sporty.android.sportynews.ui.SportyTagNewsFragment$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.sportynews.ui.SportyTagNewsFragment$onCreateView$1$1", f = "SportyTagNewsFragment.kt", l = {82}, m = "invokeSuspend", v = 2)
        public static final class C0216a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SportyTagNewsFragment b;

            /* JADX INFO: renamed from: com.sporty.android.sportynews.ui.SportyTagNewsFragment$a$a$a, reason: collision with other inner class name */
            public static final class C0217a<T> implements myh {
                public final /* synthetic */ SportyTagNewsFragment a;

                public C0217a(SportyTagNewsFragment sportyTagNewsFragment) {
                    this.a = sportyTagNewsFragment;
                }

                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    atc0 atc0Var = (atc0) obj;
                    boolean z = atc0Var instanceof atc0.a;
                    SportyTagNewsFragment sportyTagNewsFragment = this.a;
                    if (z) {
                        sportyTagNewsFragment.requireActivity().finish();
                    } else if (atc0Var instanceof atc0.b) {
                        NavHostFragment.a.a(sportyTagNewsFragment).j();
                    } else {
                        if (!(atc0Var instanceof atc0.c)) {
                            uhc.a();
                            return null;
                        }
                        atc0.c cVar = (atc0.c) atc0Var;
                        String str = cVar.b;
                        ey0[] ey0VarArr = ey0.a;
                        NavHostFragment.a.a(sportyTagNewsFragment).f(Intrinsics.g(str, "Article") ? R.id.tag_to_article_detail_fragment : R.id.tag_to_video_detail_fragment, vj5.a(new Pair("articleId", cVar.a), new Pair("type", str)));
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0216a(SportyTagNewsFragment sportyTagNewsFragment, v1b<? super C0216a> v1bVar) {
                super(2, v1bVar);
                this.b = sportyTagNewsFragment;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0216a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                ((C0216a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                return y5b.a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to com.sporty.android.sportynews.ui.SportyTagNewsFragment$a$a for r5v2 'this'  v1b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    y5b r0 = defpackage.y5b.a
                    int r1 = r5.a
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L14
                    if (r1 == r3) goto L10
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r5)
                    return r2
                L10:
                    defpackage.uj50.b(r6)
                    goto L33
                L14:
                    defpackage.uj50.b(r6)
                    com.sporty.android.sportynews.ui.SportyTagNewsFragment r6 = r5.b
                    q8i0 r1 = r6.w
                    java.lang.Object r1 = r1.getValue()
                    ctc0 r1 = (defpackage.ctc0) r1
                    t340 r1 = r1.i
                    com.sporty.android.sportynews.ui.SportyTagNewsFragment$a$a$a r4 = new com.sporty.android.sportynews.ui.SportyTagNewsFragment$a$a$a
                    r4.<init>(r6)
                    r5.a = r3
                    a390<T> r6 = r1.a
                    java.lang.Object r5 = r6.collect(r4, r5)
                    if (r5 != r0) goto L33
                    return r0
                L33:
                    defpackage.fkd.a()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sporty.android.sportynews.ui.SportyTagNewsFragment.a.C0216a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return SportyTagNewsFragment.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                SportyTagNewsFragment sportyTagNewsFragment = SportyTagNewsFragment.this;
                ibs viewLifecycleOwner = sportyTagNewsFragment.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                s9s.b bVar = s9s.b.d;
                C0216a c0216a = new C0216a(sportyTagNewsFragment, null);
                this.a = 1;
                if (m850.b(viewLifecycleOwner, bVar, c0216a, this) == y5bVar) {
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

    public static final class b implements Function0<Bundle> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            SportyTagNewsFragment sportyTagNewsFragment = SportyTagNewsFragment.this;
            Bundle arguments = sportyTagNewsFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            lx5.b(sportyTagNewsFragment, "Fragment ", " has null arguments");
            return null;
        }
    }

    public static final class c extends qlr implements Function0<Fragment> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return SportyTagNewsFragment.this;
        }
    }

    public static final class d extends qlr implements Function0<w8i0> {
        public final /* synthetic */ c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
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

    public SportyTagNewsFragment() {
        Function0 function0 = new Function0() { // from class: ocd0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SportyTagNewsFragment sportyTagNewsFragment = this.a;
                wsc0 wsc0Var = sportyTagNewsFragment.v;
                if (wsc0Var != null) {
                    return new dtc0(new xtc0(wsc0Var), (String) sportyTagNewsFragment.i.getValue());
                }
                Intrinsics.n("repo");
                throw null;
            }
        };
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.w = new q8i0(jq40.a(ctc0.class), new e(ttrVarA), function0, new f(ttrVarA));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ej5.c(ebs.a(getLifecycle()), null, null, new a(null), 3);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(1678621337, new Function2() { // from class: ncd0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                SportyTagNewsFragment sportyTagNewsFragment = this.a;
                q8i0 q8i0Var = sportyTagNewsFragment.w;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aVar.G();
                } else if (((fzs) wyh.c(((ctc0) q8i0Var.getValue()).e, aVar, 0, 7).getValue()) instanceof fzs.b) {
                    aVar.N(1504205521);
                    aga.a(0, aVar);
                    aVar.H();
                } else {
                    aVar.N(1504270652);
                    xcd0.b((ctc0) q8i0Var.getValue(), (String) sportyTagNewsFragment.i.getValue(), aVar, 8);
                    aVar.H();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
