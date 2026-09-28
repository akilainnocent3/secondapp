package defpackage;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.SelectedGiftData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.betorder.RecyclerView.CustomLinearLayoutManager;
import com.sportybet.plugin.realsports.betorder.RecyclerView.PullRefreshRecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrok;", "Lcom/google/android/material/bottomsheet/c;", "Lbtk;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rok extends lrl implements btk {
    public boolean A;
    public m840 B;
    public int C;
    public String D;
    public int E;
    public long F;
    public boolean G;
    public String H;
    public boolean I;
    public boolean J;
    public int K;
    public zpk L;
    public Function1<? super GiftDetails, Unit> f;
    public thd0 i;
    public final q8i0 v;
    public lq1 w;
    public eqk y;
    public final ArrayList<GiftDetails> z;

    public static final class a implements lfy, paj {
        public final /* synthetic */ ook a;

        public a(ook ookVar) {
            this.a = ookVar;
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

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return rok.this;
        }
    }

    public static final class c extends qlr implements Function0<w8i0> {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
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

    public static final class f extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? rok.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public rok() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.v = new q8i0(jq40.a(yyk.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
        this.z = new ArrayList<>();
        this.J = true;
    }

    public final void m0() {
        if (!this.A) {
            thd0 thd0Var = this.i;
            if (thd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            thd0Var.c.K();
        }
        ((yyk) this.v.getValue()).z1(this.C);
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getClass();
        com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) dialogOnCreateDialog;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorG = bVar.g();
        bottomSheetBehaviorG.L(3);
        bottomSheetBehaviorG.Y = true;
        bottomSheetBehaviorG.Z = false;
        Window window = bVar.getWindow();
        if (window != null) {
            window.setDimAmount(0.1f);
            window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0f000000")));
        }
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.spr_fragment_gifts, viewGroup, false);
        int i = R.id.container;
        if (((ConstraintLayout) h5e.a(R.id.container, viewInflate)) != null) {
            i = R.id.goback;
            ImageButton imageButton = (ImageButton) h5e.a(R.id.goback, viewInflate);
            if (imageButton != null) {
                FrameLayout frameLayout = (FrameLayout) viewInflate;
                int i2 = R.id.loading;
                LoadingView loadingView = (LoadingView) h5e.a(R.id.loading, viewInflate);
                if (loadingView != null) {
                    i2 = R.id.mPullRefreshRecyclerView;
                    PullRefreshRecyclerView pullRefreshRecyclerView = (PullRefreshRecyclerView) h5e.a(R.id.mPullRefreshRecyclerView, viewInflate);
                    if (pullRefreshRecyclerView != null) {
                        i2 = R.id.textView;
                        if (((TextView) h5e.a(R.id.textView, viewInflate)) != null) {
                            i2 = R.id.title_container;
                            if (((FrameLayout) h5e.a(R.id.title_container, viewInflate)) != null) {
                                this.i = new thd0(frameLayout, imageButton, loadingView, pullRefreshRecyclerView);
                                frameLayout.getClass();
                                return frameLayout;
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i = arguments.getInt("order_biz_type", 1);
            this.C = i;
            this.G = i == 3;
            this.K = arguments.getInt("betslip_type", g93.a().getTypeName());
            this.D = arguments.getString("key_gift_id");
            this.E = arguments.getInt("key_gift_kind");
            arguments.getString("key_gift_value");
            this.H = arguments.getString("quick_stake");
            this.I = arguments.getBoolean("gift_quick_bet", false);
            this.J = arguments.getBoolean("is_support_free_bet", true);
            this.F = arguments.getLong("jackpot_total_stake", 0L);
        }
        boolean z = this.I;
        if (z) {
            this.K = 1;
            this.J = true;
        }
        eqk eqkVar = this.y;
        if (eqkVar == null) {
            Intrinsics.n("giftPickerFactoryImpl");
            throw null;
        }
        int i2 = this.C;
        int i3 = this.K;
        String str = this.H;
        if (str == null) {
            str = "";
        }
        this.L = eqkVar.a(i2, i3, z, str, null);
        thd0 thd0Var = this.i;
        if (thd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        thd0Var.b.setOnClickListener(new View.OnClickListener() { // from class: lok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.dismiss();
            }
        });
        thd0 thd0Var2 = this.i;
        if (thd0Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        thd0Var2.c.setOnClickListener(new View.OnClickListener() { // from class: mok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.m0();
            }
        });
        thd0 thd0Var3 = this.i;
        if (thd0Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        thd0Var3.c.setEnabled(true);
        thd0 thd0Var4 = this.i;
        if (thd0Var4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        PullRefreshRecyclerView pullRefreshRecyclerView = thd0Var4.d;
        pullRefreshRecyclerView.setOnRefreshListener(new qok(this));
        thd0 thd0Var5 = this.i;
        if (thd0Var5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        PullRefreshRecyclerView pullRefreshRecyclerView2 = thd0Var5.d;
        requireContext();
        pullRefreshRecyclerView2.setLayoutManager(new CustomLinearLayoutManager());
        thd0 thd0Var6 = this.i;
        if (thd0Var6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        thd0Var6.d.i0.i(new dor(bqe.a(20.0f)));
        pullRefreshRecyclerView.l0 = true;
        pullRefreshRecyclerView.setEnabled(true);
        pullRefreshRecyclerView.n0 = false;
        ((yyk) this.v.getValue()).G.f(getViewLifecycleOwner(), new a(new ook(this)));
        m0();
    }

    @Override // defpackage.btk
    public final void V(SelectedGiftData selectedGiftData, int i) {
        selectedGiftData.getClass();
        GiftDetails rawGift = selectedGiftData.getRawGift();
        if (rawGift != null) {
            Function1<? super GiftDetails, Unit> function1 = this.f;
            if (function1 != null) {
                function1.invoke(rawGift);
            } else {
                Intrinsics.n(xOgHBQVl.fBhgxqAghfpjpA);
                throw null;
            }
        }
        dismiss();
    }
}
