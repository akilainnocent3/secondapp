package com.sportybet.android.globalpay.pixBtg.deposit;

import android.os.Bundle;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositFragment;
import com.sportybet.android.globalpay.pixBtg.deposit.f;
import com.sportybet.android.globalpay.pixBtg.deposit.g;
import com.sportybet.android.globalpay.pixBtg.deposit.k;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.facialrecognition.model.FacialRecognitionResult;
import defpackage.a1s;
import defpackage.app;
import defpackage.bmy;
import defpackage.bnh0;
import defpackage.c0d;
import defpackage.c0e;
import defpackage.cyb;
import defpackage.d630;
import defpackage.d810;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ej5;
import defpackage.g5e;
import defpackage.ga00;
import defpackage.grd;
import defpackage.h5e;
import defpackage.hhp;
import defpackage.hwr;
import defpackage.i6i0;
import defpackage.ib5;
import defpackage.iel;
import defpackage.jq40;
import defpackage.jvd0;
import defpackage.jxi;
import defpackage.k710;
import defpackage.lrd;
import defpackage.lyh;
import defpackage.m850;
import defpackage.mla;
import defpackage.mw;
import defpackage.myh;
import defpackage.np;
import defpackage.nzl;
import defpackage.ohp;
import defpackage.op8;
import defpackage.q6h;
import defpackage.q8i0;
import defpackage.qe10;
import defpackage.qlr;
import defpackage.qp;
import defpackage.qvw;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.saj;
import defpackage.sli;
import defpackage.sv4;
import defpackage.tj5;
import defpackage.tje0;
import defpackage.ttr;
import defpackage.tvw;
import defpackage.u6h;
import defpackage.u710;
import defpackage.ud;
import defpackage.ue10;
import defpackage.uj50;
import defpackage.uzh;
import defpackage.v1b;
import defpackage.v4c;
import defpackage.v5b;
import defpackage.v710;
import defpackage.v8i0;
import defpackage.vqd;
import defpackage.w710;
import defpackage.w8i0;
import defpackage.wwd0;
import defpackage.wyh;
import defpackage.x1b;
import defpackage.xp;
import defpackage.y5b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/android/globalpay/pixBtg/deposit/PixBtgDepositFragment;", "Llrd;", "<init>", "()V", "Lcom/sportybet/android/globalpay/pixBtg/deposit/f;", "uiState", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PixBtgDepositFragment extends nzl {
    public static final /* synthetic */ ohp<Object>[] m0 = {new d630(0, PixBtgDepositFragment.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentPixBtgDepositBinding;")};
    public bnh0 g0;
    public final String h0;
    public final ga00 i0;
    public final i6i0 j0;
    public final q8i0 k0;
    public final ee<u6h> l0;

    public static final /* synthetic */ class a extends saj implements Function1<View, jxi> {
        public static final a a = new a(1, jxi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentPixBtgDepositBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final jxi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.amount;
            ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.amount, view2);
            if (clearEditText != null) {
                i = R.id.amount_container;
                if (((FrameLayout) h5e.a(R.id.amount_container, view2)) != null) {
                    i = R.id.amount_label;
                    TextView textView = (TextView) h5e.a(R.id.amount_label, view2);
                    if (textView != null) {
                        i = R.id.amount_warning;
                        TextView textView2 = (TextView) h5e.a(R.id.amount_warning, view2);
                        if (textView2 != null) {
                            i = R.id.dialogs_compose_view;
                            ComposeView composeView = (ComposeView) h5e.a(R.id.dialogs_compose_view, view2);
                            if (composeView != null) {
                                i = R.id.header_and_banks_compose_view;
                                ComposeView composeView2 = (ComposeView) h5e.a(R.id.header_and_banks_compose_view, view2);
                                if (composeView2 != null) {
                                    i = R.id.inline_footer_compose_view;
                                    ComposeView composeView3 = (ComposeView) h5e.a(R.id.inline_footer_compose_view, view2);
                                    if (composeView3 != null) {
                                        i = R.id.loaded_content_container;
                                        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.loaded_content_container, view2);
                                        if (linearLayout != null) {
                                            i = R.id.placeholder_compose_view;
                                            ComposeView composeView4 = (ComposeView) h5e.a(R.id.placeholder_compose_view, view2);
                                            if (composeView4 != null) {
                                                i = R.id.quick_input_and_footer_compose_view;
                                                ComposeView composeView5 = (ComposeView) h5e.a(R.id.quick_input_and_footer_compose_view, view2);
                                                if (composeView5 != null) {
                                                    i = R.id.scrollable_content;
                                                    if (((ScrollView) h5e.a(R.id.scrollable_content, view2)) != null) {
                                                        i = R.id.sticky_footer_compose_view;
                                                        ComposeView composeView6 = (ComposeView) h5e.a(R.id.sticky_footer_compose_view, view2);
                                                        if (composeView6 != null) {
                                                            i = R.id.top_bar_compose_view;
                                                            ComposeView composeView7 = (ComposeView) h5e.a(R.id.top_bar_compose_view, view2);
                                                            if (composeView7 != null) {
                                                                return new jxi(linearLayout, textView, textView2, composeView, composeView2, composeView3, composeView4, composeView5, composeView6, composeView7, (ConstraintLayout) view2, clearEditText);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositFragment$onLoadedStatePropertyChanged$$inlined$collectWithLifecycle$default$1", f = "PixBtgDepositFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PixBtgDepositFragment b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ Function1 d;

        @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositFragment$onLoadedStatePropertyChanged$$inlined$collectWithLifecycle$default$1$1", f = "PixBtgDepositFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ Function1 d;

            /* JADX INFO: renamed from: com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositFragment$b$a$a, reason: collision with other inner class name */
            public static final class C0230a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ Function1 b;

                public C0230a(v5b v5bVar, Function1 function1) {
                    this.b = function1;
                    this.a = v5bVar;
                }

                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    this.b.invoke(t);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v1b v1bVar, lyh lyhVar, Function1 function1) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = function1;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(v1bVar, this.c, this.d);
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
                    C0230a c0230a = new C0230a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c0230a, this) == y5bVar) {
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
        public b(PixBtgDepositFragment pixBtgDepositFragment, lyh lyhVar, v1b v1bVar, Function1 function1) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = pixBtgDepositFragment;
            this.c = lyhVar;
            this.d = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new b(this.b, this.c, v1bVar, this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(null, this.c, this.d);
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

    public static final class c implements lyh<Object> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositFragment$onLoadedStatePropertyChanged$$inlined$filterIsInstance$1", f = "PixBtgDepositFragment.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositFragment$onLoadedStatePropertyChanged$$inlined$filterIsInstance$1$2", f = "PixBtgDepositFragment.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (obj instanceof com.sportybet.android.globalpay.pixBtg.deposit.f.c) {
                        aVar.b = 1;
                        if (this.a.emit(obj, aVar) == y5bVar) {
                            return y5bVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public c(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Object> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class d<T> implements lyh<T> {
        public final /* synthetic */ c a;
        public final /* synthetic */ Function1 b;

        @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositFragment$onLoadedStatePropertyChanged$$inlined$map$1", f = "PixBtgDepositFragment.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return d.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ Function1 b;

            @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositFragment$onLoadedStatePropertyChanged$$inlined$map$1$2", f = "PixBtgDepositFragment.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, Function1 function1) {
                this.a = myhVar;
                this.b = function1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objInvoke = this.b.invoke((com.sportybet.android.globalpay.pixBtg.deposit.f.c) obj);
                    aVar.b = 1;
                    if (this.a.emit(objInvoke, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public d(c cVar, Function1 function1) {
            this.a = cVar;
            this.b = function1;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class e extends qlr implements Function0<Fragment> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return PixBtgDepositFragment.this;
        }
    }

    public static final class f extends qlr implements Function0<w8i0> {
        public final /* synthetic */ e a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.a = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class g extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class h extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
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

    public static final class i extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? PixBtgDepositFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public PixBtgDepositFragment() {
        super(R.layout.fragment_pix_btg_deposit);
        this.e0 = false;
        this.f0 = false;
        this.h0 = String.valueOf(320);
        this.i0 = ga00.DEPOSIT;
        this.j0 = g5e.a(a.a);
        ttr ttrVarA = hwr.a(a1s.c, new f(new e()));
        this.k0 = new q8i0(jq40.a(com.sportybet.android.globalpay.pixBtg.deposit.g.class), new g(ttrVarA), new i(ttrVarA), new h(ttrVarA));
        ee<u6h> eeVarRegisterForActivityResult = registerForActivityResult(new q6h(), new ud() { // from class: q710
            @Override // defpackage.ud
            public final void a(Object obj) {
                FacialRecognitionResult facialRecognitionResult = (FacialRecognitionResult) obj;
                ohp<Object>[] ohpVarArr = PixBtgDepositFragment.m0;
                facialRecognitionResult.getClass();
                g gVarF1 = this.a.F1();
                int i2 = 1;
                switch (facialRecognitionResult.a.ordinal()) {
                    case 0:
                        gVarF1.H1(new isn(1));
                        gVarF1.H1(new x810());
                        ej5.c(o8i0.d(gVarF1), null, null, new k(gVarF1, null), 3);
                        break;
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        gVarF1.H1(new ncs(gVarF1, i2));
                        break;
                    case 2:
                        gVarF1.H1(new u810());
                        break;
                    default:
                        uhc.a();
                        break;
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.l0 = eeVarRegisterForActivityResult;
    }

    public final void D1(int i2, op8 op8Var, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-2062373278);
        int i3 = (bVarI.A(this) ? 32 : 16) | i2;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            com.sportybet.android.globalpay.pixBtg.deposit.f fVar = (com.sportybet.android.globalpay.pixBtg.deposit.f) wyh.c(F1().K, bVarI, 0, 7).getValue();
            com.sportybet.android.globalpay.pixBtg.deposit.f.c cVar = fVar instanceof com.sportybet.android.globalpay.pixBtg.deposit.f.c ? (com.sportybet.android.globalpay.pixBtg.deposit.f.c) fVar : null;
            if (cVar == null) {
                bVarI.N(-654965587);
            } else {
                bVarI.N(-654965586);
                op8Var.invoke(cVar, bVarI, 56);
            }
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new k710(this, op8Var, i2, 0);
        }
    }

    public final jxi E1() {
        return (jxi) this.j0.a(this, m0[0]);
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: F0, reason: from getter */
    public final ga00 getI0() {
        return this.i0;
    }

    public final com.sportybet.android.globalpay.pixBtg.deposit.g F1() {
        return (com.sportybet.android.globalpay.pixBtg.deposit.g) this.k0.getValue();
    }

    public final <T> void G1(Function1<? super com.sportybet.android.globalpay.pixBtg.deposit.f.c, ? extends T> function1, Function1<? super T, Unit> function2) {
        lyh lyhVarB = uzh.b(new d(new c(F1().K), function1));
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new b(this, lyhVarB, null, function2), 3);
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final String getH0() {
        return this.h0;
    }

    @Override // defpackage.c000
    public final void N0() {
        super.N0();
        Editable text = E1().b.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() > 0) {
            com.sportybet.android.globalpay.pixBtg.deposit.g gVarF1 = F1();
            int i2 = 1;
            gVarF1.Q = B1(new sv4(this, 2)) && q0();
            gVarF1.I1(new sli(gVarF1, i2));
        }
    }

    @Override // defpackage.lrd
    /* JADX INFO: renamed from: i1 */
    public final String getH0() {
        return "";
    }

    @Override // defpackage.lrd
    /* JADX INFO: renamed from: l1 */
    public final boolean getC0() {
        return false;
    }

    @Override // defpackage.lrd
    public final String n1() {
        return null;
    }

    @Override // defpackage.lrd
    /* JADX INFO: renamed from: o1 */
    public final boolean getZ() {
        return false;
    }

    @Override // defpackage.lrd, defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        F1().S = tj5.b(this);
    }

    @Override // defpackage.lrd, defpackage.m12, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.sportybet.android.globalpay.pixBtg.deposit.g gVarF1 = F1();
        c0e c0eVar = gVarF1.F;
        qe10 qe10VarA1 = gVarF1.A1();
        if (qe10VarA1.b.getValue() instanceof com.sportybet.android.globalpay.pixBtg.deposit.f.c) {
            jvd0 jvd0Var = qe10VarA1.j;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            qe10VarA1.j = ej5.c(qe10VarA1.a, null, null, new ue10(qe10VarA1, null), 3);
        }
        if (!c0eVar.a()) {
            c0eVar.b();
        }
        if (gVarF1.K.getValue() instanceof com.sportybet.android.globalpay.pixBtg.deposit.f.c) {
            gVarF1.y1(com.sportybet.android.globalpay.pixBtg.deposit.c.b.a);
            gVarF1.C.g();
        }
    }

    @Override // defpackage.c000
    public final ClearEditText r0() {
        return E1().b;
    }

    @Override // defpackage.lrd
    public final void r1() {
        final jxi jxiVarE1 = E1();
        int i2 = 1;
        G1(new np(1), new Function1() { // from class: m710
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str = (String) obj;
                ohp<Object>[] ohpVarArr = PixBtgDepositFragment.m0;
                str.getClass();
                jxiVarE1.c.setText(sn5.d(this, R.string.common_functions__amount_label, str));
                return Unit.a;
            }
        });
        G1(new xp(1), new v710(1, new u710(this, PixBtgDepositFragment.class, "balanceValue", "getBalanceValue()D", 0), hhp.class, "set", "set(Ljava/lang/Object;)V", 0));
        ClearEditText clearEditText = jxiVarE1.b;
        clearEditText.clearFocus();
        clearEditText.setErrorView(jxiVarE1.d);
        r0().setTextChangedListener(new vqd(this, new w710(1, F1(), com.sportybet.android.globalpay.pixBtg.deposit.g.class, "onAmountValidated", "onAmountValidated(Z)V", 0), new grd(1, this, lrd.class, "setAmountError", "setAmountError(Ljava/lang/String;)V", 0)));
        jxiVarE1.b.addTextChangedListener(new d810(this));
        clearEditText.setKeyListener(DigitsKeyListener.getInstance(v4c.a.a() + "0123456789"));
        clearEditText.setRawInputType(8194);
        clearEditText.setFilters(new mw[]{new mw()});
        mla.h(this, jxiVarE1.e, new op8(-1264122372, new qvw(this, i2), true));
        mla.h(this, jxiVarE1.A, new op8(603268197, new Function2() { // from class: n710
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = PixBtgDepositFragment.m0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strE = pwo.e(R.string.common_functions__deposit, aVar);
                    PixBtgDepositFragment pixBtgDepositFragment = this.a;
                    g gVarF1 = pixBtgDepositFragment.F1();
                    boolean zA = aVar.A(gVarF1);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        y710 y710Var = new y710(0, gVarF1, g.class, "onBackClicked", "onBackClicked()V", 0);
                        aVar.r(y710Var);
                        objY = y710Var;
                    }
                    Function0 function0 = (Function0) ((chp) objY);
                    g gVarF2 = pixBtgDepositFragment.F1();
                    boolean zA2 = aVar.A(gVarF2);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        z710 z710Var = new z710(0, gVarF2, g.class, "onHelpClicked", "onHelpClicked()V", 0);
                        aVar.r(z710Var);
                        objY2 = z710Var;
                    }
                    Function0 function1 = (Function0) ((chp) objY2);
                    g gVarF3 = pixBtgDepositFragment.F1();
                    boolean zA3 = aVar.A(gVarF3);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        a810 a810Var = new a810(0, gVarF3, g.class, "onTransactionsClicked", "onTransactionsClicked()V", 0);
                        aVar.r(a810Var);
                        objY3 = a810Var;
                    }
                    bb10.a(strE, null, function0, function1, (Function0) ((chp) objY3), aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        mla.h(this, jxiVarE1.w, new op8(1753100484, new Function2() { // from class: o710
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                jxi jxiVar = jxiVarE1;
                LinearLayout linearLayout = jxiVar.v;
                ComposeView composeView = jxiVar.w;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = PixBtgDepositFragment.m0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    PixBtgDepositFragment pixBtgDepositFragment = this;
                    f fVar = (f) wyh.c(pixBtgDepositFragment.F1().K, aVar, 0, 7).getValue();
                    if (fVar instanceof f.d) {
                        aVar.N(-185635966);
                        aVar.H();
                        composeView.setVisibility(0);
                        linearLayout.setVisibility(8);
                        pixBtgDepositFragment.T0();
                    } else if (Intrinsics.g(fVar, f.b.a)) {
                        aVar.N(-185444510);
                        composeView.setVisibility(0);
                        linearLayout.setVisibility(8);
                        pixBtgDepositFragment.N0();
                        g gVarF1 = pixBtgDepositFragment.F1();
                        boolean zA = aVar.A(gVarF1);
                        Object objY = aVar.y();
                        if (zA || objY == a.C0041a.a) {
                            b810 b810Var = new b810(0, gVarF1, g.class, "onDismissErrorStateGenericErrorDialog", "onDismissErrorStateGenericErrorDialog()V", 0);
                            aVar.r(b810Var);
                            objY = b810Var;
                        }
                        ip9.a((Function0) ((chp) objY), aVar, 0);
                        aVar.H();
                    } else if (fVar instanceof f.a) {
                        aVar.N(-185084042);
                        composeView.setVisibility(0);
                        linearLayout.setVisibility(8);
                        pixBtgDepositFragment.N0();
                        h88.a(null, aVar, 0);
                        aVar.H();
                    } else {
                        if (!(fVar instanceof f.c)) {
                            throw rg.a(1102389593, aVar);
                        }
                        aVar.N(-184851294);
                        aVar.H();
                        composeView.setVisibility(8);
                        linearLayout.setVisibility(0);
                        pixBtgDepositFragment.N0();
                    }
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        mla.h(this, jxiVarE1.f, new op8(-1392034525, new Function2() { // from class: p710
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = PixBtgDepositFragment.m0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final PixBtgDepositFragment pixBtgDepositFragment = this.a;
                    pixBtgDepositFragment.D1(6, pp8.b(-742352903, new gaj() { // from class: f710
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            f.c cVar = (f.c) obj3;
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            ohp<Object>[] ohpVarArr2 = PixBtgDepositFragment.m0;
                            cVar.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= (iIntValue2 & 8) == 0 ? aVar2.M(cVar) : aVar2.A(cVar) ? 4 : 2;
                            }
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                shl shlVar = cVar.c;
                                g gVarF1 = pixBtgDepositFragment.F1();
                                boolean zA = aVar2.A(gVarF1);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    c810 c810Var = new c810(0, gVarF1, g.class, "onNewBankAccountSelected", "onNewBankAccountSelected()V", 0);
                                    aVar2.r(c810Var);
                                    objY = c810Var;
                                }
                                me10.c(shlVar, true, null, null, (Function0) ((chp) objY), aVar2, 48, 12);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        mla.h(this, jxiVarE1.y, new op8(-242202238, new tvw(this, i2), true));
        jxi jxiVarE2 = E1();
        mla.h(this, jxiVarE2.z, new op8(-50460368, new Function2() { // from class: i710
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = PixBtgDepositFragment.m0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final PixBtgDepositFragment pixBtgDepositFragment = this.a;
                    pixBtgDepositFragment.D1(6, pp8.b(1971576326, new gaj() { // from class: l710
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            f.c cVar = (f.c) obj3;
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            ohp<Object>[] ohpVarArr2 = PixBtgDepositFragment.m0;
                            cVar.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= (iIntValue2 & 8) == 0 ? aVar2.M(cVar) : aVar2.A(cVar) ? 4 : 2;
                            }
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                qpi qpiVar = cVar.g;
                                PixBtgDepositFragment pixBtgDepositFragment2 = pixBtgDepositFragment;
                                g gVarF1 = pixBtgDepositFragment2.F1();
                                boolean zA = aVar2.A(gVarF1);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    r710 r710Var = new r710(1, gVarF1, g.class, "onBankLinkingCheckboxClicked", "onBankLinkingCheckboxClicked(Z)V", 0);
                                    aVar2.r(r710Var);
                                    objY = r710Var;
                                }
                                Function1 function1 = (Function1) ((chp) objY);
                                g gVarF2 = pixBtgDepositFragment2.F1();
                                boolean zA2 = aVar2.A(gVarF2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    s710 s710Var = new s710(0, gVarF2, g.class, "onProceedClicked", "onProceedClicked()V", 0);
                                    aVar2.r(s710Var);
                                    objY2 = s710Var;
                                }
                                Function0 function0 = (Function0) ((chp) objY2);
                                g gVarF3 = pixBtgDepositFragment2.F1();
                                boolean zA3 = aVar2.A(gVarF3);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    t710 t710Var = new t710(0, gVarF3, g.class, "onViewPendingDepositsClicked", "onViewPendingDepositsClicked()V", 0);
                                    aVar2.r(t710Var);
                                    objY3 = t710Var;
                                }
                                xd10.a(qpiVar, function1, function0, (Function0) ((chp) objY3), aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        mla.h(this, jxiVarE2.i, new op8(-50460368, new Function2() { // from class: i710
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = PixBtgDepositFragment.m0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final PixBtgDepositFragment pixBtgDepositFragment = this.a;
                    pixBtgDepositFragment.D1(6, pp8.b(1971576326, new gaj() { // from class: l710
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            f.c cVar = (f.c) obj3;
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            ohp<Object>[] ohpVarArr2 = PixBtgDepositFragment.m0;
                            cVar.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= (iIntValue2 & 8) == 0 ? aVar2.M(cVar) : aVar2.A(cVar) ? 4 : 2;
                            }
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                qpi qpiVar = cVar.g;
                                PixBtgDepositFragment pixBtgDepositFragment2 = pixBtgDepositFragment;
                                g gVarF1 = pixBtgDepositFragment2.F1();
                                boolean zA = aVar2.A(gVarF1);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    r710 r710Var = new r710(1, gVarF1, g.class, "onBankLinkingCheckboxClicked", "onBankLinkingCheckboxClicked(Z)V", 0);
                                    aVar2.r(r710Var);
                                    objY = r710Var;
                                }
                                Function1 function1 = (Function1) ((chp) objY);
                                g gVarF2 = pixBtgDepositFragment2.F1();
                                boolean zA2 = aVar2.A(gVarF2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    s710 s710Var = new s710(0, gVarF2, g.class, "onProceedClicked", "onProceedClicked()V", 0);
                                    aVar2.r(s710Var);
                                    objY2 = s710Var;
                                }
                                Function0 function0 = (Function0) ((chp) objY2);
                                g gVarF3 = pixBtgDepositFragment2.F1();
                                boolean zA3 = aVar2.A(gVarF3);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    t710 t710Var = new t710(0, gVarF3, g.class, "onViewPendingDepositsClicked", "onViewPendingDepositsClicked()V", 0);
                                    aVar2.r(t710Var);
                                    objY3 = t710Var;
                                }
                                xd10.a(qpiVar, function1, function0, (Function0) ((chp) objY3), aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        new app(lifecycle, E1().a, new qp(jxiVarE2, 1));
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: s0 */
    public final String getJ0() {
        return String.valueOf(F1().O);
    }

    @Override // defpackage.lrd
    public final void u1() {
    }

    @Override // defpackage.lrd
    public final String w1(BankTradeData bankTradeData) {
        return "";
    }

    @Override // defpackage.lrd
    public final void x1() {
    }
}
