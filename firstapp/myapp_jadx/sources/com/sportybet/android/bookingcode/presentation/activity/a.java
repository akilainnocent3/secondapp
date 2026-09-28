package com.sportybet.android.bookingcode.presentation.activity;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.bookingcode.presentation.activity.a;
import com.sportybet.android.bookingcode.presentation.uistate.HighLiabilityItemUiState;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import com.twilio.voice.EventKeys;
import defpackage.a93;
import defpackage.a9s;
import defpackage.apg;
import defpackage.arr;
import defpackage.bmy;
import defpackage.bqe;
import defpackage.ckl;
import defpackage.cyb;
import defpackage.f9s;
import defpackage.g1i;
import defpackage.gkl;
import defpackage.h5e;
import defpackage.h9s;
import defpackage.hb5;
import defpackage.jeb0;
import defpackage.jq40;
import defpackage.k00;
import defpackage.m2g;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.r8s;
import defpackage.s8s;
import defpackage.s9s;
import defpackage.sn5;
import defpackage.u8s;
import defpackage.ujl;
import defpackage.v8i0;
import defpackage.v8s;
import defpackage.xrl;
import defpackage.y2i0;
import defpackage.y8j;
import defpackage.ya8;
import defpackage.za8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/bookingcode/presentation/activity/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a extends xrl {
    public boolean A;
    public InterfaceC0220a B;
    public y8j C;
    public jeb0 f;
    public final q8i0 i = new q8i0(jq40.a(gkl.class), new b(), new d(), new c());
    public ujl v;
    public List<? extends Event> w;
    public String y;
    public String z;

    /* JADX INFO: renamed from: com.sportybet.android.bookingcode.presentation.activity.a$a, reason: collision with other inner class name */
    public interface InterfaceC0220a {
        void Q0();

        void p0();
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return a.this.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return a.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return a.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public final jeb0 m0() {
        jeb0 jeb0Var = this.f;
        if (jeb0Var != null) {
            return jeb0Var;
        }
        hb5.a("Required value was null.");
        return null;
    }

    public final gkl n0() {
        return (gkl) this.i.getValue();
    }

    public final boolean o0() {
        List<? extends Event> list = this.w;
        if (list == null) {
            Intrinsics.n("itemList");
            throw null;
        }
        if (list.isEmpty()) {
            return false;
        }
        for (Event event : list) {
            if (event.isBetBuilderChild() || event.isBetBuilderParent()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xrl, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.B = context instanceof InterfaceC0220a ? (InterfaceC0220a) context : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleRequireArguments = requireArguments();
        bundleRequireArguments.getClass();
        List<? extends Event> parcelableArrayList = bundleRequireArguments.getParcelableArrayList("arg_booking_code_event");
        if (parcelableArrayList == null) {
            parcelableArrayList = m2g.a;
        }
        this.w = parcelableArrayList;
        String string = bundleRequireArguments.getString("arg_share_code");
        if (string == null) {
            string = "";
        }
        this.y = string;
        String string2 = bundleRequireArguments.getString("arg_summary");
        this.z = string2 != null ? string2 : "";
        this.A = bundleRequireArguments.getBoolean("arg_is_smart_remix_available");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.spm_fragment_high_liability_code, viewGroup, false);
        int i = R.id.background_mask;
        if (((FrameLayout) h5e.a(R.id.background_mask, viewInflate)) != null) {
            i = R.id.btnClose;
            ImageButton imageButton = (ImageButton) h5e.a(R.id.btnClose, viewInflate);
            if (imageButton != null) {
                i = R.id.btnEditInMM;
                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.btnEditInMM, viewInflate);
                if (linearLayout != null) {
                    i = R.id.btnHeaderSmartRemix;
                    LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.btnHeaderSmartRemix, viewInflate);
                    if (linearLayout2 != null) {
                        i = R.id.btnSmartRemix;
                        LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.btnSmartRemix, viewInflate);
                        if (linearLayout3 != null) {
                            i = R.id.ivEditInMM;
                            ImageView imageView = (ImageView) h5e.a(R.id.ivEditInMM, viewInflate);
                            if (imageView != null) {
                                i = R.id.ivHeaderSmartRemix;
                                if (((ImageView) h5e.a(R.id.ivHeaderSmartRemix, viewInflate)) != null) {
                                    i = R.id.ivSmartRemix;
                                    if (((ImageView) h5e.a(R.id.ivSmartRemix, viewInflate)) != null) {
                                        i = R.id.layoutBottomActions;
                                        if (((LinearLayout) h5e.a(R.id.layoutBottomActions, viewInflate)) != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            i = R.id.layoutHeaderDesc;
                                            if (((ConstraintLayout) h5e.a(R.id.layoutHeaderDesc, viewInflate)) != null) {
                                                i = R.id.loadingMask;
                                                View viewA = h5e.a(R.id.loadingMask, viewInflate);
                                                if (viewA != null) {
                                                    i = R.id.loadingSpinner;
                                                    ProgressBar progressBar = (ProgressBar) h5e.a(R.id.loadingSpinner, viewInflate);
                                                    if (progressBar != null) {
                                                        i = R.id.rvItems;
                                                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.rvItems, viewInflate);
                                                        if (recyclerView != null) {
                                                            i = R.id.spaceTop;
                                                            if (((FrameLayout) h5e.a(R.id.spaceTop, viewInflate)) != null) {
                                                                i = R.id.spacerEditInMM;
                                                                View viewA2 = h5e.a(R.id.spacerEditInMM, viewInflate);
                                                                if (viewA2 != null) {
                                                                    i = R.id.spacerHeaderSmartRemix;
                                                                    View viewA3 = h5e.a(R.id.spacerHeaderSmartRemix, viewInflate);
                                                                    if (viewA3 != null) {
                                                                        i = R.id.spacerSmartRemix;
                                                                        View viewA4 = h5e.a(R.id.spacerSmartRemix, viewInflate);
                                                                        if (viewA4 != null) {
                                                                            i = R.id.tvEditInMM;
                                                                            TextView textView = (TextView) h5e.a(R.id.tvEditInMM, viewInflate);
                                                                            if (textView != null) {
                                                                                i = R.id.tvHeaderCode;
                                                                                TextView textView2 = (TextView) h5e.a(R.id.tvHeaderCode, viewInflate);
                                                                                if (textView2 != null) {
                                                                                    i = R.id.tvHeaderDesc;
                                                                                    TextView textView3 = (TextView) h5e.a(R.id.tvHeaderDesc, viewInflate);
                                                                                    if (textView3 != null) {
                                                                                        i = R.id.tvHeaderSmartRemix;
                                                                                        if (((TextView) h5e.a(R.id.tvHeaderSmartRemix, viewInflate)) != null) {
                                                                                            i = R.id.tvSmartRemix;
                                                                                            if (((TextView) h5e.a(R.id.tvSmartRemix, viewInflate)) != null) {
                                                                                                i = R.id.tvSummary;
                                                                                                TextView textView4 = (TextView) h5e.a(R.id.tvSummary, viewInflate);
                                                                                                if (textView4 != null) {
                                                                                                    i = R.id.vWhiteBody;
                                                                                                    View viewA5 = h5e.a(R.id.vWhiteBody, viewInflate);
                                                                                                    if (viewA5 != null) {
                                                                                                        this.f = new jeb0(constraintLayout, imageButton, linearLayout, linearLayout2, linearLayout3, imageView, viewA, progressBar, recyclerView, viewA2, viewA3, viewA4, textView, textView2, textView3, textView4, viewA5);
                                                                                                        ConstraintLayout constraintLayout2 = m0().a;
                                                                                                        constraintLayout2.getClass();
                                                                                                        return constraintLayout2;
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.B = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        List<? extends Event> list = this.w;
        if (list == null) {
            Intrinsics.n("itemList");
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Event event : list) {
            List<? extends Event> list2 = this.w;
            if (list2 == null) {
                Intrinsics.n("itemList");
                throw null;
            }
            HighLiabilityItemUiState highLiabilityItemUiStateG = apg.g(event, list2);
            if (highLiabilityItemUiStateG != null) {
                arrayList.add(highLiabilityItemUiStateG);
            }
        }
        TextView textView = m0().C;
        String str = this.y;
        if (str == null) {
            Intrinsics.n(EventKeys.ERROR_CODE);
            throw null;
        }
        textView.setText(str);
        TextView textView2 = m0().E;
        String str2 = this.z;
        if (str2 == null) {
            Intrinsics.n("summary");
            throw null;
        }
        textView2.setText(str2);
        this.v = new ujl(arrayList);
        m0().w.i(new y2i0(bqe.a(8.0f), bqe.a(1.0f), bqe.a(12.0f)));
        RecyclerView recyclerView = m0().w;
        ujl ujlVar = this.v;
        if (ujlVar == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        recyclerView.setAdapter(ujlVar);
        RecyclerView recyclerView2 = m0().w;
        requireContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        int i = 1;
        boolean z = this.A && !o0();
        m0().D.setText(StringsKt.t0(Html.fromHtml(sn5.d(this, z ? R.string.component_betslip__high_liability_smart_remix_description : R.string.page_code_hub__high_liability_code_desc, new Object[0]), 0, null, null)));
        m0().c.setBackgroundColor(m0().c.getContext().getColor(z ? R.color.bg_brand_sub_tertiary_d_base : R.color.bg_brand_sub_primary_d_base));
        m0().B.setTextColor(m0().c.getContext().getColor(z ? R.color.text_inverse_primary : R.color.text_color_brand_tertiary));
        m0().B.setText(sn5.d(this, z ? R.string.common_functions__multi_maker : R.string.page_code_hub__high_liability_dialog_btn, new Object[0]));
        m0().f.setVisibility(!z ? 0 : 8);
        m0().y.setVisibility(!z ? 0 : 8);
        m0().d.setVisibility(z ? 0 : 8);
        m0().e.setVisibility(z ? 0 : 8);
        y8j y8jVar = this.C;
        if (z) {
            if (y8jVar == null) {
                Intrinsics.n("fullStoryCommonManager");
                throw null;
            }
            LinearLayout linearLayout = m0().c;
            f9s f9sVar = f9s.a;
            f9sVar.getClass();
            y8jVar.e(linearLayout, f9s.b);
            y8j y8jVar2 = this.C;
            if (y8jVar2 == null) {
                Intrinsics.n("fullStoryCommonManager");
                throw null;
            }
            ImageButton imageButton = m0().b;
            a9s a9sVar = a9s.a;
            a9sVar.getClass();
            y8jVar2.e(imageButton, a9s.b);
            gkl gklVarN0 = n0();
            gklVarN0.c.a(h9s.a, k00.d, k00.c);
            gklVarN0.z1(f9sVar);
            gklVarN0.z1(a9sVar);
        } else {
            if (y8jVar == null) {
                Intrinsics.n("fullStoryCommonManager");
                throw null;
            }
            LinearLayout linearLayout2 = m0().c;
            v8s.a.getClass();
            y8jVar.e(linearLayout2, v8s.b);
            y8j y8jVar3 = this.C;
            if (y8jVar3 == null) {
                Intrinsics.n("fullStoryCommonManager");
                throw null;
            }
            ImageButton imageButton2 = m0().b;
            s8s.a.getClass();
            y8jVar3.e(imageButton2, s8s.b);
            gkl gklVarN1 = n0();
            gklVarN1.z1(u8s.a);
            gklVarN1.z1(r8s.a);
        }
        m0().c.setOnClickListener(new View.OnClickListener() { // from class: akl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a aVar = this.a;
                if (!aVar.A || aVar.o0()) {
                    aVar.n0().z1(t8s.a);
                } else {
                    aVar.n0().z1(e9s.a);
                }
                if (aVar.o0()) {
                    Context contextRequireContext = aVar.requireContext();
                    contextRequireContext.getClass();
                    js.b(contextRequireContext, sn5.d(aVar, R.string.page_code_hub__high_liability_bb_removed_dialog_title, new Object[0]), sn5.d(aVar, R.string.page_code_hub__high_liability_bb_removed_dialog_message, new Object[0]), sn5.d(aVar, R.string.common_functions__ok, new Object[0]), sn5.d(aVar, R.string.common_functions__cancel, new Object[0]), new bkl(aVar, 0), null, 136);
                } else {
                    a.InterfaceC0220a interfaceC0220a = aVar.B;
                    if (interfaceC0220a != null) {
                        interfaceC0220a.p0();
                    }
                }
            }
        });
        m0().b.setOnClickListener(new ya8(this, i));
        m0().e.setOnClickListener(new za8(this, i));
        m0().d.setOnClickListener(new a93(this, 2));
        g1i g1iVar = new g1i(n0().v, new ckl(2, this, a.class, "renderSmartRemixUiState", "renderSmartRemixUiState(Lcom/sportybet/android/bookingcode/presentation/smartremix/SmartRemixUiState;)V", 4));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
    }
}
