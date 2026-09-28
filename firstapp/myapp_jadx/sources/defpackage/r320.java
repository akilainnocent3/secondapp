package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.slider.RangeSlider;
import com.sporty.android.common.network.data.JsonErrorThrowable;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoOutcomeDto;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.sportybet.android.bookingcode.presentation.activity.HighLiabilityCodeActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Share;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002²\u0006\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lr320;", "Lm12;", "Lly7;", "Lhz7;", "<init>", "()V", "Lcom/sporty/android/core/model/worldcuptournament/WorldCupTeam;", "selectedTeam", "", "teams", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class r320 extends b0m implements ly7, hz7 {
    public lxi B;
    public kz1 C;
    public LinearLayoutManager D;
    public yx7 E;
    public final ix7 F;
    public iy7.e G;
    public hy7 H;
    public boolean I;
    public int J;
    public final SimpleDateFormat K;
    public String L;
    public final q8i0 M;
    public final q8i0 N;
    public lz1 O;
    public mg6 P;
    public final mpe0 Q;
    public final mpe0 R;
    public azm S;
    public t090 T;
    public iym U;

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[jz7.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jz7 jz7Var = jz7.a;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                jz7 jz7Var2 = jz7.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[wae.values().length];
            try {
                iArr2[82] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                wae.a aVar = wae.b;
                iArr2[62] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                wae.a aVar2 = wae.b;
                iArr2[8] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr2;
            int[] iArr3 = new int[hy7.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                hy7 hy7Var = hy7.a;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                hy7 hy7Var2 = hy7.a;
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                hy7 hy7Var3 = hy7.a;
                iArr3[4] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                hy7 hy7Var4 = hy7.a;
                iArr3[0] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                hy7 hy7Var5 = hy7.a;
                iArr3[5] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            b = iArr3;
            int[] iArr4 = new int[my7.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                my7 my7Var = my7.a;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                my7 my7Var2 = my7.a;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                my7 my7Var3 = my7.a;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class b implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public b(Function1 function1) {
            this.a = function1;
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

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class c extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((r320) this.receiver).n0();
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class d extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? r320.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class e extends qlr implements Function0<Fragment> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return r320.this;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
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

    /* JADX INFO: loaded from: classes5.dex */
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

    /* JADX INFO: loaded from: classes5.dex */
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

    /* JADX INFO: loaded from: classes5.dex */
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? r320.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class j extends qlr implements Function0<Fragment> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return r320.this;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class k extends qlr implements Function0<w8i0> {
        public final /* synthetic */ j a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.a = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class l extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class m extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ttr ttrVar) {
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

    public r320() {
        this.z = false;
        this.A = false;
        ix7 ix7Var = new ix7();
        ix7Var.a = null;
        ix7Var.b = null;
        ix7Var.c = null;
        ix7Var.d = false;
        this.F = ix7Var;
        this.H = hy7.f;
        this.J = -1;
        my7 my7Var = my7.a;
        this.K = new SimpleDateFormat("EEE", Locale.getDefault());
        this.L = "CODEHUB_POPULAR_CODES";
        e eVar = new e();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new f(eVar));
        this.M = new q8i0(jq40.a(mz7.class), new g(ttrVarA), new i(ttrVarA), new h(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new k(new j()));
        this.N = new q8i0(jq40.a(eja0.class), new l(ttrVarA2), new d(ttrVarA2), new m(ttrVarA2));
        this.Q = hwr.b(new yha(this, 1));
        this.R = hwr.b(new rwe(this, 1));
    }

    public static String o0(String str, String str2) {
        if (str.length() <= 6) {
            return str;
        }
        String strConcat = str.substring(0, 6).concat("...");
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"~"}, false, 0, 6, null);
        if (listSplit$default.size() > 1) {
            String str3 = (String) listSplit$default.get(0);
            if (str3.length() > 5 || (!StringsKt.M(strConcat, str2, false) && StringsKt.M(str, str2, false))) {
                return str3.concat("~...");
            }
        }
        return strConcat;
    }

    public static void u0(r320 r320Var, my7 my7Var) {
        lxi lxiVar = r320Var.B;
        if (lxiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView = lxiVar.B;
        ProgressBar progressBar = lxiVar.y;
        LinearLayout linearLayout = lxiVar.v;
        ImageView imageView = lxiVar.i;
        int iOrdinal = my7Var.ordinal();
        if (iOrdinal == 0) {
            linearLayout.setVisibility(8);
            lxiVar.A.setRefreshing(false);
            return;
        }
        if (iOrdinal == 1) {
            linearLayout.setVisibility(0);
            progressBar.setVisibility(0);
            imageView.setVisibility(8);
            textView.setText(sn5.d(r320Var, R.string.common_functions__loading_with_dot, new Object[0]));
            return;
        }
        int i2 = R.drawable.ic_no_data;
        if (iOrdinal == 2) {
            linearLayout.setVisibility(0);
            progressBar.setVisibility(8);
            imageView.setVisibility(0);
            textView.setText(r320Var.q0());
            imageView.setImageDrawable(gr0.a(r320Var.requireContext(), R.drawable.ic_no_data));
            return;
        }
        if (iOrdinal != 3) {
            uhc.a();
            return;
        }
        linearLayout.setVisibility(0);
        progressBar.setVisibility(8);
        imageView.setVisibility(0);
        textView.setText(r320Var.q0());
        Context contextRequireContext = r320Var.requireContext();
        if (r320Var.p0() != jz7.c) {
            i2 = R.drawable.ic_exclamation;
        }
        imageView.setImageDrawable(gr0.a(contextRequireContext, i2));
    }

    @Override // defpackage.ly7
    public final void H(BookingCodeInfoDto bookingCodeInfoDto, int i2) {
        bookingCodeInfoDto.getClass();
        List<BookingCodeInfoOutcomeDto> outcomeInfos = bookingCodeInfoDto.getOutcomeInfos();
        if (outcomeInfos == null || outcomeInfos.isEmpty()) {
            return;
        }
        this.J = i2;
        mz7 mz7VarR0 = r0();
        ej5.c(o8i0.d(mz7VarR0), null, null, new nz7(bookingCodeInfoDto, mz7VarR0, wae.MULTI_MAKER, null), 3);
    }

    @Override // defpackage.ly7
    public final void N(BookingCodeInfoDto bookingCodeInfoDto, int i2) {
        bookingCodeInfoDto.getClass();
        List<BookingCodeInfoOutcomeDto> outcomeInfos = bookingCodeInfoDto.getOutcomeInfos();
        if (outcomeInfos == null || outcomeInfos.isEmpty()) {
            return;
        }
        this.J = i2;
        mz7 mz7VarR0 = r0();
        ej5.c(o8i0.d(mz7VarR0), null, null, new nz7(bookingCodeInfoDto, mz7VarR0, wae.BET_SLIP, null), 3);
        if (p0() == jz7.b) {
            iym iymVar = this.U;
            if (iymVar != null) {
                iymVar.d(AnalyticsEvent.CODE_HUB_ADD_TO_BET_SLIP);
            } else {
                Intrinsics.n("openTelemetryLogger");
                throw null;
            }
        }
    }

    @Override // defpackage.ly7
    public final void W(BookingCodeInfoDto bookingCodeInfoDto, int i2) {
        bookingCodeInfoDto.getClass();
        if (TextUtils.isEmpty(bookingCodeInfoDto.getBookingCode())) {
            return;
        }
        this.J = i2;
        mz7 mz7VarR0 = r0();
        wae waeVar = wae.SHARE;
        BookingCodeFilterDto bookingCodeFilterDto = mz7.h0;
        ej5.c(o8i0.d(mz7VarR0), null, null, new rz7(bookingCodeInfoDto, mz7VarR0, waeVar, null, null, null), 3);
    }

    @Override // defpackage.hz7
    public final void Y(BookingCodeInfoOutcomeDto bookingCodeInfoOutcomeDto) {
        String eventId = bookingCodeInfoOutcomeDto.getEventId();
        String sportId = bookingCodeInfoOutcomeDto.getSportId();
        if (eventId == null || sportId == null) {
            return;
        }
        xyd0.a.a(eventId, sportId, false, null).show(requireActivity().getSupportFragmentManager(), "statisticsDialogFragment");
    }

    public final void n0() {
        if (this.I) {
            this.I = false;
            this.H = hy7.f;
            lxi lxiVar = this.B;
            if (lxiVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            lxiVar.E.setVisibility(8);
            lxi lxiVar2 = this.B;
            if (lxiVar2 != null) {
                lxiVar2.E.setContent(fk9.a);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r3v49, types: [androidx.recyclerview.widget.RecyclerView$f, kz1] */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73 */
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
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        g08 g08Var;
        ?? ww7Var;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_popular_code, viewGroup, false);
        int i3 = R.id.bFilterCountry;
        Button button = (Button) h5e.a(R.id.bFilterCountry, viewInflate);
        if (button != null) {
            i3 = R.id.bFilterFolds;
            Button button2 = (Button) h5e.a(R.id.bFilterFolds, viewInflate);
            if (button2 != null) {
                i3 = R.id.bFilterOdds;
                Button button3 = (Button) h5e.a(R.id.bFilterOdds, viewInflate);
                if (button3 != null) {
                    i3 = R.id.bFilterSort;
                    Button button4 = (Button) h5e.a(R.id.bFilterSort, viewInflate);
                    if (button4 != null) {
                        i3 = R.id.bFilterTime;
                        Button button5 = (Button) h5e.a(R.id.bFilterTime, viewInflate);
                        if (button5 != null) {
                            i3 = R.id.ivInfo;
                            ImageView imageView = (ImageView) h5e.a(R.id.ivInfo, viewInflate);
                            if (imageView != null) {
                                i3 = R.id.llInfo;
                                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.llInfo, viewInflate);
                                if (linearLayout != null) {
                                    i3 = R.id.lytFilter;
                                    View viewA = h5e.a(R.id.lytFilter, viewInflate);
                                    if (viewA != null) {
                                        int i4 = R.id.btnApply;
                                        AppCompatButton appCompatButton = (AppCompatButton) h5e.a(R.id.btnApply, viewA);
                                        if (appCompatButton != null) {
                                            i4 = R.id.btnReset;
                                            AppCompatButton appCompatButton2 = (AppCompatButton) h5e.a(R.id.btnReset, viewA);
                                            if (appCompatButton2 != null) {
                                                i4 = R.id.containerBtns;
                                                LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.containerBtns, viewA);
                                                if (linearLayout2 != null) {
                                                    i4 = R.id.llOptions;
                                                    LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.llOptions, viewA);
                                                    if (linearLayout3 != null) {
                                                        i4 = R.id.lytRangeItem;
                                                        View viewA2 = h5e.a(R.id.lytRangeItem, viewA);
                                                        if (viewA2 != null) {
                                                            int i5 = R.id.divider;
                                                            View viewA3 = h5e.a(R.id.divider, viewA2);
                                                            if (viewA3 != null) {
                                                                i5 = R.id.rangeEditor;
                                                                View viewA4 = h5e.a(R.id.rangeEditor, viewA2);
                                                                if (viewA4 != null) {
                                                                    EditText editText = (EditText) h5e.a(R.id.etRangeBegin, viewA4);
                                                                    if (editText != null) {
                                                                        EditText editText2 = (EditText) h5e.a(R.id.etRangeEnd, viewA4);
                                                                        if (editText2 == null) {
                                                                            i2 = R.id.etRangeEnd;
                                                                        } else if (((TextView) h5e.a(R.id.tvTilde, viewA4)) != null) {
                                                                            web0 web0Var = new web0((ConstraintLayout) viewA4, editText, editText2);
                                                                            i5 = R.id.range_slider;
                                                                            RangeSlider rangeSlider = (RangeSlider) h5e.a(R.id.range_slider, viewA2);
                                                                            if (rangeSlider != null) {
                                                                                i5 = R.id.tvCustom;
                                                                                TextView textView = (TextView) h5e.a(R.id.tvCustom, viewA2);
                                                                                if (textView != null) {
                                                                                    i5 = R.id.tvRangeOutput;
                                                                                    TextView textView2 = (TextView) h5e.a(R.id.tvRangeOutput, viewA2);
                                                                                    if (textView2 != null) {
                                                                                        xeb0 xeb0Var = new xeb0((ConstraintLayout) viewA2, viewA3, web0Var, rangeSlider, textView, textView2);
                                                                                        i4 = R.id.vBackground;
                                                                                        View viewA5 = h5e.a(R.id.vBackground, viewA);
                                                                                        if (viewA5 != null) {
                                                                                            i4 = R.id.vDismissOverlay;
                                                                                            View viewA6 = h5e.a(R.id.vDismissOverlay, viewA);
                                                                                            if (viewA6 != null) {
                                                                                                veb0 veb0Var = new veb0((ConstraintLayout) viewA, appCompatButton, appCompatButton2, linearLayout2, linearLayout3, xeb0Var, viewA5, viewA6);
                                                                                                i3 = R.id.pbLoading;
                                                                                                ProgressBar progressBar = (ProgressBar) h5e.a(R.id.pbLoading, viewInflate);
                                                                                                if (progressBar != null) {
                                                                                                    i3 = R.id.rvCards;
                                                                                                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.rvCards, viewInflate);
                                                                                                    if (recyclerView != null) {
                                                                                                        i3 = R.id.swipe_to_refresh;
                                                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe_to_refresh, viewInflate);
                                                                                                        if (swipeRefreshLayout != null) {
                                                                                                            i3 = R.id.tvInfo;
                                                                                                            TextView textView3 = (TextView) h5e.a(R.id.tvInfo, viewInflate);
                                                                                                            if (textView3 != null) {
                                                                                                                i3 = R.id.vFilterBorderProvider;
                                                                                                                View viewA7 = h5e.a(R.id.vFilterBorderProvider, viewInflate);
                                                                                                                if (viewA7 != null) {
                                                                                                                    i3 = R.id.worldCupCountryFilterCompose;
                                                                                                                    ComposeView composeView = (ComposeView) h5e.a(R.id.worldCupCountryFilterCompose, viewInflate);
                                                                                                                    if (composeView != null) {
                                                                                                                        i3 = R.id.worldCupTeamPickerOverlay;
                                                                                                                        ComposeView composeView2 = (ComposeView) h5e.a(R.id.worldCupTeamPickerOverlay, viewInflate);
                                                                                                                        if (composeView2 != null) {
                                                                                                                            lxi lxiVar = new lxi((ConstraintLayout) viewInflate, button, button2, button3, button4, button5, imageView, linearLayout, veb0Var, progressBar, recyclerView, swipeRefreshLayout, textView3, viewA7, composeView, composeView2);
                                                                                                                            this.B = lxiVar;
                                                                                                                            Context contextRequireContext = requireContext();
                                                                                                                            contextRequireContext.getClass();
                                                                                                                            if (r0b.d(contextRequireContext)) {
                                                                                                                                for (Button button6 : kotlin.collections.b.k(button, button5, button2, button3, button4)) {
                                                                                                                                    button6.setBackgroundColor(requireContext().getColor(R.color.background_general_primary));
                                                                                                                                    button6.setTextColor(requireContext().getColor(R.color.white));
                                                                                                                                }
                                                                                                                                lxiVar.C.setBackgroundColor(requireContext().getColor(R.color.brand_secondary_variable_type1));
                                                                                                                            }
                                                                                                                            lxi lxiVar2 = this.B;
                                                                                                                            if (lxiVar2 == null) {
                                                                                                                                Intrinsics.n("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            ?? r1 = lxiVar2.z;
                                                                                                                            int iOrdinal = p0().ordinal();
                                                                                                                            int i6 = 1;
                                                                                                                            if (iOrdinal == 0) {
                                                                                                                                g08Var = (g08) this.R.getValue();
                                                                                                                                if (g08Var == null) {
                                                                                                                                    g08Var = g08.CODEHUB_POPULAR_CODES;
                                                                                                                                }
                                                                                                                            } else if (iOrdinal == 1) {
                                                                                                                                g08Var = g08.PRE_CANNED_BET_BUILDER_CODEHUB;
                                                                                                                            } else {
                                                                                                                                if (iOrdinal != 2) {
                                                                                                                                    uhc.a();
                                                                                                                                    return null;
                                                                                                                                }
                                                                                                                                g08Var = g08.CODEHUB_POPULAR_CODES;
                                                                                                                            }
                                                                                                                            this.L = g08Var.name();
                                                                                                                            int iOrdinal2 = p0().ordinal();
                                                                                                                            if (iOrdinal2 == 0) {
                                                                                                                                ww7Var = new ww7(this, this);
                                                                                                                            } else if (iOrdinal2 == 1) {
                                                                                                                                mz7 mz7VarR0 = r0();
                                                                                                                                mz7VarR0.T = BookingCodeFilterDto.copy$default(mz7VarR0.T, false, null, 0, null, null, null, null, "BB", 127, null);
                                                                                                                                ww7Var = new rw7(this, this);
                                                                                                                            } else {
                                                                                                                                if (iOrdinal2 != 2) {
                                                                                                                                    uhc.a();
                                                                                                                                    return null;
                                                                                                                                }
                                                                                                                                mz7 mz7VarR1 = r0();
                                                                                                                                mz7VarR1.g0 = true;
                                                                                                                                mz7VarR1.b0 = kotlin.collections.a.c("sr:tournament:16");
                                                                                                                                mz7VarR1.c0 = kotlin.collections.b.k("BB", "NON_BB");
                                                                                                                                mz7VarR1.e0 = 20;
                                                                                                                                mz7VarR1.z1((WorldCupTeam) mz7VarR1.B.a().a.getValue());
                                                                                                                                ww7Var = new zz7(this, this);
                                                                                                                            }
                                                                                                                            this.C = ww7Var;
                                                                                                                            r1.setAdapter(ww7Var);
                                                                                                                            requireContext();
                                                                                                                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                                                                                                                            this.D = linearLayoutManager;
                                                                                                                            r1.setLayoutManager(linearLayoutManager);
                                                                                                                            LinearLayoutManager linearLayoutManager2 = this.D;
                                                                                                                            if (linearLayoutManager2 == null) {
                                                                                                                                Intrinsics.n("linearLayoutManager");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            r1.k(new v320(this, linearLayoutManager2));
                                                                                                                            lxi lxiVar3 = this.B;
                                                                                                                            if (lxiVar3 == null) {
                                                                                                                                Intrinsics.n("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            ConstraintLayout constraintLayout = lxiVar3.a;
                                                                                                                            constraintLayout.getClass();
                                                                                                                            lxi lxiVar4 = this.B;
                                                                                                                            if (lxiVar4 == null) {
                                                                                                                                Intrinsics.n("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            this.E = new yx7(constraintLayout, lxiVar4.w, new m320(this), new n320(this));
                                                                                                                            this.H = hy7.f;
                                                                                                                            for (hy7 hy7Var : hy7.values()) {
                                                                                                                                y0(hy7Var, false);
                                                                                                                                Button buttonW0 = w0(hy7Var);
                                                                                                                                if (buttonW0 != null) {
                                                                                                                                    buttonW0.setOnClickListener(new ayo(i6, this, hy7Var));
                                                                                                                                }
                                                                                                                            }
                                                                                                                            if (p0() == jz7.c) {
                                                                                                                                lxi lxiVar5 = this.B;
                                                                                                                                if (lxiVar5 == null) {
                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                ComposeView composeView3 = lxiVar5.D;
                                                                                                                                lxiVar5.f.setVisibility(4);
                                                                                                                                lxiVar5.b.setVisibility(8);
                                                                                                                                composeView3.setVisibility(0);
                                                                                                                                mz7 mz7VarR2 = r0();
                                                                                                                                if (((Collection) mz7VarR2.O.getValue()).isEmpty()) {
                                                                                                                                    ej5.c(o8i0.d(mz7VarR2), null, null, new sz7(mz7VarR2, null), 3);
                                                                                                                                }
                                                                                                                                Context contextRequireContext2 = requireContext();
                                                                                                                                contextRequireContext2.getClass();
                                                                                                                                final boolean zD = r0b.d(contextRequireContext2);
                                                                                                                                composeView3.setContent(new op8(779335838, new Function2() { // from class: i320
                                                                                                                                    @Override // kotlin.jvm.functions.Function2
                                                                                                                                    public final Object invoke(Object obj, Object obj2) {
                                                                                                                                        a aVar = (a) obj;
                                                                                                                                        int iIntValue = ((Integer) obj2).intValue();
                                                                                                                                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                                                                                            final r320 r320Var = this.a;
                                                                                                                                            final boolean z = zD;
                                                                                                                                            o0z.a(null, null, null, null, null, pp8.b(1638225039, new Function2() { // from class: j320
                                                                                                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                                                                                                @Override // kotlin.jvm.functions.Function2
                                                                                                                                                public final Object invoke(Object obj3, Object obj4) {
                                                                                                                                                    a aVar2 = (a) obj3;
                                                                                                                                                    int iIntValue2 = ((Integer) obj4).intValue();
                                                                                                                                                    if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                                                                                                        r320 r320Var2 = r320Var;
                                                                                                                                                        WorldCupTeam worldCupTeam = (WorldCupTeam) wyh.c(r320Var2.r0().Q, aVar2, 0, 7).getValue();
                                                                                                                                                        boolean zA = aVar2.A(r320Var2);
                                                                                                                                                        Object objY = aVar2.y();
                                                                                                                                                        if (zA || objY == a.C0041a.a) {
                                                                                                                                                            x320 x320Var = new x320(0, r320Var2, r320.class, "showWorldCupTeamPicker", "showWorldCupTeamPicker()V", 0);
                                                                                                                                                            aVar2.r(x320Var);
                                                                                                                                                            objY = x320Var;
                                                                                                                                                        }
                                                                                                                                                        c08.a(worldCupTeam, (Function0) ((chp) objY), z, null, aVar2, 0);
                                                                                                                                                    } else {
                                                                                                                                                        aVar2.G();
                                                                                                                                                    }
                                                                                                                                                    return Unit.a;
                                                                                                                                                }
                                                                                                                                            }, aVar), aVar, 196608);
                                                                                                                                        } else {
                                                                                                                                            aVar.G();
                                                                                                                                        }
                                                                                                                                        return Unit.a;
                                                                                                                                    }
                                                                                                                                }, true));
                                                                                                                            }
                                                                                                                            lxi lxiVar6 = this.B;
                                                                                                                            if (lxiVar6 == null) {
                                                                                                                                Intrinsics.n("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            lxiVar6.w.v.setOnClickListener(new View.OnClickListener() { // from class: o320
                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                public final void onClick(View view) {
                                                                                                                                    this.a.s0();
                                                                                                                                }
                                                                                                                            });
                                                                                                                            lxi lxiVar7 = this.B;
                                                                                                                            if (lxiVar7 == null) {
                                                                                                                                Intrinsics.n("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            lxiVar7.A.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: p320
                                                                                                                                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                                                                                                                                public final void i() {
                                                                                                                                    r320 r320Var = this.a;
                                                                                                                                    lxi lxiVar8 = r320Var.B;
                                                                                                                                    if (lxiVar8 == null) {
                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    lxiVar8.A.setRefreshing(true);
                                                                                                                                    kz1 kz1Var = r320Var.C;
                                                                                                                                    if (kz1Var == null) {
                                                                                                                                        Intrinsics.n("adapter");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    kz1Var.f();
                                                                                                                                    r320Var.r0().C1();
                                                                                                                                }
                                                                                                                            });
                                                                                                                            androidx.fragment.app.e eVarRequireActivity = requireActivity();
                                                                                                                            eVarRequireActivity.getClass();
                                                                                                                            eVarRequireActivity.getOnBackPressedDispatcher().a(this, new vc(new kft(this, 1)));
                                                                                                                            mz7 mz7VarR3 = r0();
                                                                                                                            mz7VarR3.B1(mz7VarR3.T, false);
                                                                                                                            lxi lxiVar8 = this.B;
                                                                                                                            if (lxiVar8 == null) {
                                                                                                                                Intrinsics.n("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            ConstraintLayout constraintLayout2 = lxiVar8.a;
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
                                                                        } else {
                                                                            i2 = R.id.tvTilde;
                                                                        }
                                                                    } else {
                                                                        i2 = R.id.etRangeBegin;
                                                                    }
                                                                    bmy.a("Missing required view with ID: ".concat(viewA4.getResources().getResourceName(i2)));
                                                                    return null;
                                                                }
                                                            }
                                                            bmy.a("Missing required view with ID: ".concat(viewA2.getResources().getResourceName(i5)));
                                                            return null;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i4)));
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        int i2 = 1;
        r0().D.f(getViewLifecycleOwner(), new b(new qd6(this, i2)));
        r0().H.f(getViewLifecycleOwner(), new b(new Function1() { // from class: q320
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                r320.u0(this.a, my7.a);
                return Unit.a;
            }
        }));
        r0().F.f(getViewLifecycleOwner(), new b(new sia(this, i2)));
        r0().V.f(getViewLifecycleOwner(), new b(new Function1() { // from class: g320
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                lz1 lz1Var;
                int i3;
                Map mapA;
                boolean z;
                Double totalOdds;
                jox joxVar = (jox) obj;
                boolean z2 = joxVar instanceof jox.a;
                r320 r320Var = this.a;
                String str = iKBWavCysVP.QcfKCRBigpQzxv;
                if (z2) {
                    mg6 mg6Var = (mg6) ((jox.a) joxVar).a;
                    lxi lxiVar = r320Var.B;
                    if (lxiVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    RecyclerView.d0 d0VarK = lxiVar.z.K(r320Var.J);
                    if (d0VarK != null) {
                        if (!(d0VarK instanceof lz1)) {
                            d0VarK = null;
                        }
                        lz1Var = (lz1) d0VarK;
                    } else {
                        lz1Var = null;
                    }
                    Integer num = mg6Var.d;
                    String strD = mg6Var.e;
                    if (num != null && num.intValue() == 10000) {
                        wae waeVar = mg6Var.a;
                        BookingCodeInfoDto bookingCodeInfoDto = mg6Var.b;
                        int i4 = mg6Var.h;
                        List<Event> list = mg6Var.c;
                        String str2 = mg6Var.f;
                        int i5 = waeVar == null ? -1 : r320.a.a[waeVar.ordinal()];
                        if (i5 == 1) {
                            if (lz1Var != null) {
                                lz1Var.b();
                            }
                            if (list != null) {
                                azm azmVar = r320Var.S;
                                if (azmVar == null) {
                                    Intrinsics.n("router");
                                    throw null;
                                }
                                wae waeVar2 = wae.MULTI_MAKER;
                                int i6 = MultiMakerActivity.E;
                                ArrayList arrayListA = sd9.a(list);
                                String str3 = mg6Var.f;
                                bew bewVar = bew.ADD_TO_BETSLIP_DIRECTLY;
                                azmVar.e(waeVar2, MultiMakerActivity.a.b(true, r320Var.L, 1, Integer.valueOf(i4), str3, arrayListA, 129));
                            }
                        } else if (i5 == 2) {
                            iym iymVar = r320Var.U;
                            if (iymVar == null) {
                                Intrinsics.n("openTelemetryLogger");
                                throw null;
                            }
                            PageMeta.INSTANCE.getClass();
                            iymVar.f(AnalyticsEvent.CODE_HUB_POPULAR_ADD_TO_BETSLIP, new PageMeta("codehub", null));
                            if (lz1Var != null) {
                                lz1Var.a();
                            }
                            boolean zIsEmpty = ((ArrayList) iu2.d()).isEmpty();
                            if (list != null) {
                                boolean z3 = r320Var.p0() == jz7.b || (bookingCodeInfoDto != null && xx4.a(bookingCodeInfoDto));
                                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                                if (!list.isEmpty()) {
                                    if (z3) {
                                        mapA = apg.a(list);
                                    } else {
                                        mapA = o2g.a;
                                        mapA.getClass();
                                    }
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        Event event = (Event) it.next();
                                        if (event.markets != null && !event.isBetBuilderChild()) {
                                            List<Market> list2 = event.markets;
                                            list2.getClass();
                                            for (Market market : list2) {
                                                boolean z4 = zIsEmpty;
                                                List<Outcome> list3 = market.outcomes;
                                                if (list3 != null) {
                                                    z = z3;
                                                    if (market.status != 3) {
                                                        Iterator it2 = list3.iterator();
                                                        while (it2.hasNext()) {
                                                            Outcome outcome = (Outcome) it2.next();
                                                            arrayList.add(z ? g880.z(new Selection(event, market, outcome, (List) mapA.get(market.id))) : g880.z(new Selection(event, market, outcome)));
                                                            it2 = it2;
                                                            it = it;
                                                        }
                                                    }
                                                } else {
                                                    z = z3;
                                                }
                                                zIsEmpty = z4;
                                                z3 = z;
                                                it = it;
                                            }
                                        }
                                        zIsEmpty = zIsEmpty;
                                        z3 = z3;
                                        it = it;
                                    }
                                }
                                boolean z5 = zIsEmpty;
                                boolean z6 = z3;
                                Context contextRequireContext = r320Var.requireContext();
                                Intent intent = new Intent(r320Var.requireContext(), (Class<?>) BetslipActivity.class);
                                if (z5) {
                                    int size = arrayList.size();
                                    int i7 = 0;
                                    while (i7 < size) {
                                        Parcelable parcelable = arrayList.get(i7);
                                        i7++;
                                        Selection selection = (Selection) parcelable;
                                        ArrayList<? extends Parcelable> arrayList2 = arrayList;
                                        iu2.t(selection.a, selection.b, selection.c, true, false, z6 ? selection.d : null, 16336);
                                        arrayList = arrayList2;
                                    }
                                } else {
                                    intent.putExtra("extra_show_replace_dialog", true);
                                    intent.putParcelableArrayListExtra("extra_selection_item", arrayList).getClass();
                                }
                                intent.putExtra("share_code", str2);
                                bew bewVar2 = bew.ADD_TO_BETSLIP_DIRECTLY;
                                intent.putExtra("multi_maker_code_action", 2);
                                intent.putExtra("code_provider", i4);
                                intent.putExtra("action_load_booking_code_from", r320Var.L);
                                intent.putExtra("action_load_booking_code_from", r320Var.L);
                                Integer num2 = mg6Var.i;
                                if (num2 != null) {
                                    intent.putExtra("extra_booking_code_order_type", num2.intValue());
                                }
                                yrh0.s(contextRequireContext, intent, true);
                            }
                        } else if (i5 != 3) {
                            if (lz1Var != null) {
                                lz1Var.a();
                            }
                            if (lz1Var != null) {
                                lz1Var.b();
                            }
                            Intent intent2 = new Intent(r320Var.requireContext(), (Class<?>) HighLiabilityCodeActivity.class);
                            intent2.putExtra("share_code", str2);
                            intent2.putExtra("code_hub_edit", true);
                            intent2.putExtra("action_load_booking_code_from", r320Var.L);
                            bew bewVar3 = bew.ADD_TO_BETSLIP_DIRECTLY;
                            intent2.putExtra("multi_maker_code_action", 3);
                            intent2.putExtra("code_provider", i4);
                            String strH1 = iu2.a.j().h1(list != null ? list.size() : 0, false);
                            Integer foldsAmount = bookingCodeInfoDto != null ? bookingCodeInfoDto.getFoldsAmount() : null;
                            intent2.putExtra("summary", strH1 + oAudzpbdOhCI.xVsOhz + foldsAmount + " x " + String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf((bookingCodeInfoDto == null || (totalOdds = bookingCodeInfoDto.getTotalOdds()) == null) ? 0.0d : totalOdds.doubleValue())}, 1)));
                            intent2.putExtra("is_smart_remix_available", mg6Var.j);
                            list.getClass();
                            intent2.putParcelableArrayListExtra("booking_code_event", (ArrayList) list);
                            r320Var.startActivity(intent2);
                        } else if (!r320Var.i.hasPersonalPage()) {
                            ej5.c(ebs.a(r320Var.getLifecycle()), null, null, new t320(r320Var, lz1Var, mg6Var, null), 3);
                        } else if (!TextUtils.isEmpty(str2)) {
                            r320Var.P = mg6Var;
                            r320Var.O = lz1Var;
                            eja0 eja0Var = (eja0) r320Var.N.getValue();
                            if (str2 != null) {
                                str = str2;
                            }
                            eja0Var.x1(str);
                        }
                    } else if ((num != null && num.intValue() == 11000) || (num != null && num.intValue() == 19000)) {
                        if (lz1Var != null) {
                            lz1Var.a();
                            lz1Var.c();
                            lz1Var.b();
                        }
                        if (TextUtils.isEmpty(strD)) {
                            i3 = 0;
                            strD = sn5.d(r320Var, R.string.page_load_code__code_expired, new Object[0]);
                        } else {
                            i3 = 0;
                        }
                        zyf0.c(i3, strD);
                    }
                } else if (joxVar instanceof jox.c) {
                    r320Var.t0(str, ((jox.c) joxVar).a);
                } else if (joxVar instanceof jox.d) {
                    r320Var.t0(null, null);
                }
                return Unit.a;
            }
        }));
        ((eja0) this.N.getValue()).i.f(getViewLifecycleOwner(), new b(new yc6(this, i2)));
    }

    public final jz7 p0() {
        return (jz7) this.Q.getValue();
    }

    public final String q0() {
        if (p0() == jz7.c) {
            return sn5.d(this, R.string.page_code_hub__no_world_cup_codes, new Object[0]);
        }
        return Intrinsics.g(r0().T, mz7.h0) ? sn5.d(this, R.string.page_code_hub__temporary_unavailable, new Object[0]) : sn5.d(this, R.string.page_code_hub__no_results, new Object[0]);
    }

    public final mz7 r0() {
        return (mz7) this.M.getValue();
    }

    public final void s0() {
        if (this.I) {
            n0();
            return;
        }
        hy7 hy7Var = this.H;
        hy7 hy7Var2 = hy7.f;
        if (hy7Var == hy7Var2) {
            requireActivity().finish();
            return;
        }
        yx7 yx7Var = this.E;
        if (yx7Var == null) {
            Intrinsics.n("filterHandler");
            throw null;
        }
        yx7Var.e();
        y0(this.H, false);
        this.H = hy7Var2;
    }

    public final void t0(String str, Throwable th) {
        lz1 lz1Var;
        String message;
        String message2;
        String message3;
        lxi lxiVar = this.B;
        if (lxiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView.d0 d0VarK = lxiVar.z.K(this.J);
        if (d0VarK != null) {
            if (!(d0VarK instanceof lz1)) {
                d0VarK = null;
            }
            lz1Var = (lz1) d0VarK;
        } else {
            lz1Var = null;
        }
        if (lz1Var != null) {
            lz1Var.a();
            lz1Var.c();
            lz1Var.b();
        }
        if (str != null && str.length() != 0) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            js.d(contextRequireContext, R.string.common_functions__error, str, new h320(), null, 32);
            return;
        }
        if (th instanceof SocketTimeoutException) {
            zyf0.c(0, sn5.d(this, R.string.page_load_code__request_time_out, new Object[0]));
            return;
        }
        String strD = "";
        if ((th instanceof SprThrowable) || (th instanceof JsonErrorThrowable)) {
            fk50 fk50Var = (fk50) th;
            message = fk50Var != null ? fk50Var.getMessage() : null;
            if (message == null || message.length() == 0) {
                strD = sn5.d(this, R.string.common_feedback__the_code_was_not_loaded_successfully_tip, new Object[0]);
            } else if (fk50Var != null && (message2 = fk50Var.getMessage()) != null) {
                strD = message2;
            }
            zyf0.c(0, strD);
            return;
        }
        if (th instanceof fk50) {
            UiText text = ((fk50) th).getText();
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            text.getClass();
            zyf0.c(0, text.e(contextRequireContext2).toString());
            return;
        }
        message = th != null ? th.getMessage() : null;
        if (message == null || message.length() == 0) {
            strD = sn5.d(this, R.string.common_feedback__the_code_was_not_loaded_successfully_tip, new Object[0]);
        } else if (th != null && (message3 = th.getMessage()) != null) {
            strD = message3;
        }
        zyf0.c(0, strD);
    }

    public final Button w0(hy7 hy7Var) {
        lxi lxiVar = this.B;
        if (lxiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        Button button = lxiVar.c;
        Button button2 = lxiVar.d;
        Button button3 = lxiVar.e;
        if (p0() == jz7.c) {
            int iOrdinal = hy7Var.ordinal();
            if (iOrdinal == 0) {
                return lxiVar.b;
            }
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4 && iOrdinal != 5) {
                            uhc.a();
                            return null;
                        }
                        return null;
                    }
                    return button3;
                }
                return button2;
            }
            return button;
        }
        int iOrdinal2 = hy7Var.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return lxiVar.f;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    if (iOrdinal2 != 4) {
                        if (iOrdinal2 != 5) {
                            uhc.a();
                            return null;
                        }
                    }
                    return button3;
                }
                return button2;
            }
            return button;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:65:0x0110  */
    /* JADX WARN: Code duplicated, block: B:67:0x0118  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    public final void y0(hy7 hy7Var, boolean z) {
        String strSubstring;
        boolean z2;
        int i2;
        SpannableString spannableString;
        int i3;
        int iOrdinal;
        Button buttonW0 = w0(hy7Var);
        if (buttonW0 != null) {
            int iOrdinal2 = hy7Var.ordinal();
            String strD = null;
            ix7 ix7Var = this.F;
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    strSubstring = ix7Var.a;
                } else if (iOrdinal2 == 2) {
                    strSubstring = ix7Var.b;
                } else if (iOrdinal2 == 3) {
                    strSubstring = ix7Var.c;
                } else if (iOrdinal2 == 4 && ix7Var.d) {
                    strSubstring = sn5.d(this, R.string.common_functions__sort, new Object[0]);
                }
                if (p0() == jz7.c || hy7Var != hy7.a) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    buttonW0.setTextColor(requireContext().getColor(R.color.white));
                } else if (TextUtils.isEmpty(strSubstring)) {
                    buttonW0.setTextColor(requireContext().getColor(R.color.text_type1_primary));
                } else {
                    buttonW0.setTextColor(requireContext().getColor(R.color.brand_quaternary));
                }
                if (strSubstring == null) {
                    iOrdinal = hy7Var.ordinal();
                    if (iOrdinal != 0) {
                        strD = sn5.d(this, R.string.common_functions__country, new Object[0]);
                    } else if (iOrdinal != 1) {
                        strD = sn5.d(this, R.string.common_functions__time, new Object[0]);
                    } else if (iOrdinal != 2) {
                        strD = sn5.d(this, R.string.page_code_hub__folds, new Object[0]);
                    } else if (iOrdinal != 3) {
                        strD = sn5.d(this, R.string.page_code_hub__odds, new Object[0]);
                    } else if (iOrdinal != 4) {
                        strD = sn5.d(this, R.string.common_functions__sort, new Object[0]);
                    } else if (iOrdinal != 5) {
                        uhc.a();
                        return;
                    }
                    if (hy7Var != hy7.a || strD == null || strD.length() == 0 || strD.length() <= 6) {
                        strSubstring = strD;
                    } else {
                        strSubstring = strD.substring(0, 6);
                    }
                    if (strSubstring == null) {
                        strSubstring = "";
                    }
                }
                if (hy7Var == hy7.a) {
                    if (z2) {
                        i3 = R.drawable.ic_world_cup_filter_white;
                    } else {
                        i3 = R.drawable.ic_odds_filter;
                    }
                    rv6 rv6Var = new rv6(requireContext(), i3);
                    String strConcat = strSubstring.concat("   ");
                    spannableString = new SpannableString(strConcat);
                    spannableString.setSpan(rv6Var, strConcat.length() - 1, strConcat.length(), 33);
                } else {
                    Context contextRequireContext = requireContext();
                    if (z) {
                        i2 = R.drawable.ic_filter_open_green;
                    } else {
                        i2 = R.drawable.ic_filter_close_grey;
                    }
                    rv6 rv6Var2 = new rv6(contextRequireContext, i2);
                    String strConcat2 = strSubstring.concat("   ");
                    SpannableString spannableString2 = new SpannableString(strConcat2);
                    spannableString2.setSpan(rv6Var2, strConcat2.length() - 1, strConcat2.length(), 33);
                    spannableString = spannableString2;
                }
                buttonW0.setText(spannableString);
            }
            ix7Var.getClass();
            strSubstring = null;
            if (p0() == jz7.c) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                buttonW0.setTextColor(requireContext().getColor(R.color.white));
            } else if (TextUtils.isEmpty(strSubstring)) {
                buttonW0.setTextColor(requireContext().getColor(R.color.text_type1_primary));
            } else {
                buttonW0.setTextColor(requireContext().getColor(R.color.brand_quaternary));
            }
            if (strSubstring == null) {
                iOrdinal = hy7Var.ordinal();
                if (iOrdinal != 0) {
                    strD = sn5.d(this, R.string.common_functions__country, new Object[0]);
                } else if (iOrdinal != 1) {
                    strD = sn5.d(this, R.string.common_functions__time, new Object[0]);
                } else if (iOrdinal != 2) {
                    strD = sn5.d(this, R.string.page_code_hub__folds, new Object[0]);
                } else if (iOrdinal != 3) {
                    strD = sn5.d(this, R.string.page_code_hub__odds, new Object[0]);
                } else if (iOrdinal != 4) {
                    strD = sn5.d(this, R.string.common_functions__sort, new Object[0]);
                } else if (iOrdinal != 5) {
                    uhc.a();
                    return;
                }
                if (hy7Var != hy7.a) {
                    strSubstring = strD;
                } else {
                    strSubstring = strD;
                }
                if (strSubstring == null) {
                    strSubstring = "";
                }
            }
            if (hy7Var == hy7.a) {
                if (z2) {
                    i3 = R.drawable.ic_world_cup_filter_white;
                } else {
                    i3 = R.drawable.ic_odds_filter;
                }
                rv6 rv6Var3 = new rv6(requireContext(), i3);
                String strConcat3 = strSubstring.concat("   ");
                spannableString = new SpannableString(strConcat3);
                spannableString.setSpan(rv6Var3, strConcat3.length() - 1, strConcat3.length(), 33);
            } else {
                Context contextRequireContext2 = requireContext();
                if (z) {
                    i2 = R.drawable.ic_filter_open_green;
                } else {
                    i2 = R.drawable.ic_filter_close_grey;
                }
                rv6 rv6Var4 = new rv6(contextRequireContext2, i2);
                String strConcat4 = strSubstring.concat("   ");
                SpannableString spannableString3 = new SpannableString(strConcat4);
                spannableString3.setSpan(rv6Var4, strConcat4.length() - 1, strConcat4.length(), 33);
                spannableString = spannableString3;
            }
            buttonW0.setText(spannableString);
        }
    }

    public final void z0() {
        if (this.I) {
            return;
        }
        int i2 = 1;
        this.I = true;
        this.H = hy7.a;
        yx7 yx7Var = this.E;
        if (yx7Var == null) {
            Intrinsics.n("filterHandler");
            throw null;
        }
        yx7Var.e();
        lxi lxiVar = this.B;
        if (lxiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ComposeView composeView = lxiVar.E;
        composeView.setVisibility(0);
        composeView.setContent(new op8(-767058257, new owe(this, i2), true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object v0(lz1 lz1Var, mg6 mg6Var, zha0 zha0Var, x1b x1bVar) {
        s320 s320Var;
        ArrayList arrayList;
        List list;
        mg6 mg6Var2 = mg6Var;
        zha0 zha0Var2 = zha0Var;
        if (x1bVar instanceof s320) {
            s320Var = (s320) x1bVar;
            int i2 = s320Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s320Var.i = i2 - Integer.MIN_VALUE;
            } else {
                s320Var = new s320(this, x1bVar);
            }
        } else {
            s320Var = new s320(this, x1bVar);
        }
        Object objA = s320Var.e;
        y5b y5bVar = y5b.a;
        int i3 = s320Var.i;
        if (i3 == 0) {
            uj50.b(objA);
            if (lz1Var != null) {
                lz1Var.c();
            }
            if (mg6Var2 != null) {
                String str = mg6Var2.f;
                List<Event> list2 = mg6Var2.c;
                if (list2 != null) {
                    LinkedHashMap linkedHashMapA = apg.a(list2);
                    arrayList = new ArrayList(iu2.d());
                    iu2.b();
                    for (Event event : list2) {
                        if (event.markets != null && !event.isBetBuilderChild()) {
                            for (Market market : event.markets) {
                                List<Outcome> list3 = market.outcomes;
                                if (list3 != null && market.status != 3) {
                                    Iterator<Outcome> it = list3.iterator();
                                    while (it.hasNext()) {
                                        iu2.t(event, market, it.next(), true, false, (List) linkedHashMapA.get(market.id), 16336);
                                    }
                                }
                            }
                        }
                    }
                    g93.b(new Share(str, mg6Var2.g));
                    List listA0 = CollectionsKt.A0(iu2.d());
                    String str2 = zha0Var2.d;
                    t090 t090Var = this.T;
                    if (t090Var == null) {
                        Intrinsics.n("shareImageProvider");
                        throw null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    b190 b190Var = new b190(listA0, null, str2, str);
                    s320Var.a = mg6Var2;
                    s320Var.b = zha0Var2;
                    s320Var.c = arrayList;
                    s320Var.d = listA0;
                    s320Var.i = 1;
                    objA = t090Var.a(b190Var, s320Var);
                    if (objA == y5bVar) {
                        return y5bVar;
                    }
                    list = listA0;
                }
            }
            return Unit.a;
        }
        if (i3 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list = s320Var.d;
        ArrayList arrayList2 = s320Var.c;
        zha0Var2 = s320Var.b;
        mg6 mg6Var3 = s320Var.a;
        uj50.b(objA);
        arrayList = arrayList2;
        mg6Var2 = mg6Var3;
        c190 c190Var = (c190) objA;
        String str3 = c190Var.a;
        String str4 = c190Var.b;
        iu2.b();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            Selection selection = (Selection) obj;
            iu2.t(selection.a, selection.b, selection.c, true, false, selection.d, 16336);
        }
        String strA = o7d.a(wae.SHARE);
        String str5 = mg6Var2.g;
        String str6 = mg6Var2.f;
        String strA2 = zha0Var2.a();
        boolean zX = g880.x(list);
        StringBuilder sbA = crh0.a(strA, "?imageUri=", str3, "&imageWithUserUri=", str4);
        hxa.c(sbA, "&linkUrl=", str5, "&shareCode=", str6);
        sh8.c().e(x9d.a(strA2, "&isSingleBetBuilder=", qUnCRF.nltkiJkSYfIPPRj, sbA, zX));
        return Unit.a;
    }
}
