package defpackage;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CustomProgressButton;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.ads.AdsData;
import com.sporty.android.core.model.common.Range;
import com.sporty.android.core.model.pay.BountyAndTaxConfigs;
import com.sporty.android.core.model.pay.QuickInput;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sporty.android.core.model.pocket.deposit.QuickInputItem;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class gjp extends oll implements View.OnClickListener, TextWatcher, TextView.OnEditorActionListener, znd.a {
    public static final AtomicInteger r0 = new AtomicInteger(0);
    public ClearEditText C;
    public ComposeView D;
    public CustomProgressButton E;
    public BigDecimal F;
    public String G;
    public BigDecimal H;
    public String I;
    public boolean J;
    public b K;
    public ProgressDialog L;
    public androidx.appcompat.app.b M;
    public su5<BaseResponse<xdp>> N;
    public boolean O;
    public su5<BaseResponse<AdsData>> P;
    public TextView Q;
    public su5<BaseResponse<BankTradeData>> R;
    public final AtomicBoolean S;
    public RecyclerView T;
    public znd U;
    public a V;
    public final ArrayList W;
    public View X;
    public long Y;
    public LinearLayout Z;
    public HintView a0;
    public TextView b0;
    public ImageView c0;
    public String d0;
    public boolean e0;
    public pjp f0;
    public ujp g0;
    public psm h0;
    public e i0;
    public n8e j0;
    public rdd0 k0;
    public c0e l0;
    public k650 m0;
    public y8j n0;
    public ComposeView o0;
    public LoadingViewNew p0;
    public ComposeView q0;

    public class a extends GridLayoutManager {
        public a() {
            super(6, 1);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final RecyclerView.LayoutParams G() {
            return new GridLayoutManager.LayoutParams(-1, zch0.a(gjp.this.T.getContext(), 44));
        }
    }

    public static class b extends Handler {
        public WeakReference<gjp> a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            gjp gjpVar = this.a.get();
            if (gjpVar != null && message.what == 1) {
                AtomicInteger atomicInteger = gjp.r0;
                if (atomicInteger.getAndIncrement() < 3) {
                    int i = atomicInteger.get();
                    if (gjpVar.getActivity() != null) {
                        su5<BaseResponse<BankTradeData>> su5Var = gjpVar.R;
                        if (su5Var != null) {
                            su5Var.cancel();
                        }
                        if (!gjpVar.L.isShowing()) {
                            gjpVar.L.show();
                        }
                        su5<BaseResponse<BankTradeData>> su5VarD = ap0.g().D(gjpVar.I);
                        gjpVar.R = su5VarD;
                        su5VarD.G(new ijp(gjpVar, i));
                    }
                    sendEmptyMessageDelayed(1, 2000L);
                }
            }
        }
    }

    public gjp() {
        super(1);
        this.F = BigDecimal.valueOf(0L);
        this.H = null;
        this.J = false;
        this.O = false;
        this.S = new AtomicBoolean(false);
        this.W = new ArrayList();
        this.e0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b bVar = new b();
        bVar.a = new WeakReference<>(this);
        this.K = bVar;
        ProgressDialog progressDialog = new ProgressDialog(getActivity(), R.style.BrandProgressDialogTheme);
        this.L = progressDialog;
        progressDialog.setTitle((CharSequence) null);
        this.L.setMessage(sn5.d(this, R.string.page_payment__being_processed_dot, new Object[0]));
        this.L.setIndeterminate(true);
        this.L.setCanceledOnTouchOutside(false);
        this.L.setCancelable(false);
        this.L.setOnCancelListener(null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.fragment_root) {
            ClearEditText clearEditText = this.C;
            if (clearEditText != null) {
                lop.b(clearEditText, Boolean.FALSE);
                return;
            }
            return;
        }
        if (id == R.id.deposit_btn) {
            pjp pjpVar = this.f0;
            if (pjpVar != null) {
                ej5.c(o8i0.d(pjpVar), null, null, new mjp(pjpVar, null), 3);
            }
            ClearEditText clearEditText2 = this.C;
            if (clearEditText2 != null) {
                lop.b(clearEditText2, Boolean.FALSE);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.X;
        if (view != null) {
            return view;
        }
        int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_online_deposit, viewGroup, false);
        this.X = viewInflate;
        CustomProgressButton customProgressButton = (CustomProgressButton) viewInflate.findViewById(R.id.deposit_btn);
        this.E = customProgressButton;
        this.n0.d(customProgressButton, "fs-unmask");
        this.n0.e(this.E, "deposit-button");
        this.o0 = (ComposeView) this.X.findViewById(R.id.init_mask);
        this.p0 = (LoadingViewNew) this.X.findViewById(R.id.init_failed_mask);
        this.o0.setOnClickListener(new rip());
        this.p0.setOnClickListener(new View.OnClickListener() { // from class: xip
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AtomicInteger atomicInteger = gjp.r0;
                this.a.f0.F1();
            }
        });
        ComposeView composeView = this.o0;
        u6i0.a aVar = u6i0.a.a;
        composeView.setViewCompositionStrategy(aVar);
        ComposeView composeView2 = this.o0;
        composeView2.getClass();
        r910.b(composeView2);
        TextView textView = (TextView) this.X.findViewById(R.id.deposit_note);
        this.Q = textView;
        textView.setText(sn5.d(this, R.string.page_payment__gifts_on_your_1st_deposit_of, "%"));
        this.Q.setCompoundDrawablesWithIntrinsicBounds(iwh0.a(requireActivity(), R.drawable.deposit_coin, Color.parseColor("#f8be1c")), (Drawable) null, (Drawable) null, (Drawable) null);
        q0(false);
        this.E.setText(sn5.d(this, R.string.common_functions__top_up_now, new Object[0]));
        this.E.setOnClickListener(this);
        this.E.setDescTextVisible(false);
        ClearEditText clearEditText = (ClearEditText) this.X.findViewById(R.id.amount_edit_text);
        this.C = clearEditText;
        clearEditText.clearFocus();
        this.C.setHint(sn5.d(this, R.string.page_payment__enter_deposit_amount, new Object[0]));
        this.C.setFilters(new InputFilter[]{new vo6()});
        this.C.setOnEditorActionListener(this);
        this.C.setErrorView((TextView) this.X.findViewById(R.id.error));
        this.C.addTextChangedListener(this);
        this.C.setError((String) null);
        this.X.findViewById(R.id.fragment_root).setOnClickListener(this);
        TextView textView2 = (TextView) this.X.findViewById(R.id.mpesa_number);
        this.T = (RecyclerView) this.X.findViewById(R.id.select_recycler_view);
        this.T.getContext();
        this.V = new a();
        this.a0 = (HintView) this.X.findViewById(R.id.hint_view);
        this.Z = (LinearLayout) this.X.findViewById(R.id.description_container);
        TextView textView3 = (TextView) this.X.findViewById(R.id.select_amount_title);
        this.b0 = textView3;
        textView3.setText(sn5.d(this, R.string.page_payment__select_amount, new Object[0]) + " (" + a8b.d().trim() + ")");
        TextView textView4 = (TextView) this.X.findViewById(R.id.deposit_from);
        textView4.setText(((Object) textView4.getText()) + " :");
        ((TextView) this.X.findViewById(R.id.withdraw_amount_text)).setText(sn5.d(this, R.string.common_functions__amount, new Object[0]) + " (" + a8b.d().trim() + ")");
        if (getArguments() != null) {
            String string = getArguments().getString("phone_number");
            this.G = string;
            if (string != null && string.length() > 4) {
                String str = this.G;
                textView2.setText(sn5.d(this, R.string.app_common__star_number, str.substring(str.length() - 4)));
            }
        }
        this.c0 = (ImageView) this.X.findViewById(R.id.momo_telecom_icon);
        this.H = new BigDecimal(this.m0.c("ke_deposit_max_daily_trans")).divide(new BigDecimal(10000), RoundingMode.HALF_UP);
        this.q0 = (ComposeView) this.X.findViewById(R.id.deposit_banner_compose_view);
        ComposeView composeView3 = (ComposeView) this.X.findViewById(R.id.compose_order_container);
        this.D = composeView3;
        composeView3.setVisibility(8);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(pjp.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return null;
        }
        pjp pjpVar = (pjp) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.f0 = pjpVar;
        pjpVar.D1();
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        v8i0 viewModelStore2 = eVarRequireActivity.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = eVarRequireActivity.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, sd7.a(eVarRequireActivity, viewModelStore2, defaultViewModelProviderFactory2));
        dq7 dq7VarA2 = jq40.a(ujp.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return null;
        }
        ujp ujpVar = (ujp) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        this.g0 = ujpVar;
        ujpVar.b = log0.a;
        i2i.b(this.f0.D).f(getViewLifecycleOwner(), new lfy() { // from class: yip
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                wgn wgnVar = (wgn) obj;
                AtomicInteger atomicInteger = gjp.r0;
                boolean z = wgnVar instanceof wgn.c;
                gjp gjpVar = this.a;
                if (z) {
                    ComposeView composeView4 = gjpVar.o0;
                    if (composeView4 != null) {
                        composeView4.setVisibility(0);
                    }
                    LoadingViewNew loadingViewNew = gjpVar.p0;
                    if (loadingViewNew != null) {
                        loadingViewNew.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (wgnVar instanceof wgn.b) {
                    ComposeView composeView5 = gjpVar.o0;
                    if (composeView5 != null) {
                        composeView5.setVisibility(8);
                    }
                    LoadingViewNew loadingViewNew2 = gjpVar.p0;
                    if (loadingViewNew2 != null) {
                        loadingViewNew2.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (wgnVar instanceof wgn.a) {
                    ComposeView composeView6 = gjpVar.o0;
                    if (composeView6 != null) {
                        composeView6.setVisibility(8);
                    }
                    LoadingViewNew loadingViewNew3 = gjpVar.p0;
                    if (loadingViewNew3 != null) {
                        loadingViewNew3.c(((wgn.a) wgnVar).a.e(gjpVar.requireContext()));
                    }
                }
            }
        });
        i2i.b(this.f0.i).f(getViewLifecycleOwner(), new lfy() { // from class: zip
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                a aVar2 = (a) obj;
                AtomicInteger atomicInteger = gjp.r0;
                gjp gjpVar = this.a;
                View view2 = gjpVar.X;
                if (view2 == null || view2.getRootView() == null) {
                    return;
                }
                gjpVar.i0.d(aVar2, gjpVar, gjpVar.X.getRootView(), null);
            }
        });
        i2i.b(this.f0.i0).f(getViewLifecycleOwner(), new ajp(this, i));
        i2i.b(this.f0.O).f(getViewLifecycleOwner(), new lfy() { // from class: bjp
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                List<String> list;
                PayHintData payHintData = (PayHintData) obj;
                AtomicInteger atomicInteger = gjp.r0;
                if (payHintData != null) {
                    gjp gjpVar = this.a;
                    if (gjpVar.Z == null || (list = payHintData.descriptionLines) == null) {
                        return;
                    }
                    for (String str2 : list) {
                        if (!TextUtils.isEmpty(str2)) {
                            TextView textView5 = new TextView(gjpVar.Z.getContext());
                            textView5.setTextSize(12.0f);
                            textView5.setTextColor(Color.parseColor("#9ca0ab"));
                            textView5.setText(str2);
                            gjpVar.Z.addView(textView5);
                        }
                    }
                }
            }
        });
        i2i.b(this.f0.b1).f(getViewLifecycleOwner(), new lfy() { // from class: cjp
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                o200 o200Var = (o200) obj;
                AtomicInteger atomicInteger = gjp.r0;
                UiText uiText = o200Var.a;
                gjp gjpVar = this.a;
                HintView hintView = gjpVar.a0;
                if (uiText == null) {
                    hintView.setVisibility(8);
                    return;
                }
                hintView.setVisibility(0);
                gjpVar.a0.setHintInHtml(o200Var.a.e(gjpVar.requireContext()), 63);
                gjpVar.a0.setTypeColor(o200Var.b);
            }
        });
        i2i.b(this.f0.f1.N()).f(getViewLifecycleOwner(), new lfy() { // from class: djp
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                BountyAndTaxConfigs bountyAndTaxConfigs = (BountyAndTaxConfigs) obj;
                AtomicInteger atomicInteger = gjp.r0;
                if (bountyAndTaxConfigs != null) {
                    List<QuickInput> quickInputs = bountyAndTaxConfigs.getQuickInputs();
                    ArrayList arrayList = new ArrayList(l48.r(quickInputs, 10));
                    for (QuickInput quickInput : quickInputs) {
                        QuickInputItem quickInputItem = new QuickInputItem();
                        quickInputItem.amount = quickInput.getAmount();
                        quickInputItem.bounty = quickInput.getBounty();
                        quickInputItem.btnText = quickInput.getBtnText();
                        quickInputItem.text = quickInput.getText();
                        quickInputItem.order = quickInput.getOrder();
                        quickInputItem.line = 1;
                        quickInputItem.isSelected = false;
                        arrayList.add(quickInputItem);
                    }
                    boolean zG = Intrinsics.g(bountyAndTaxConfigs.getDepositQuickInputButtonDisplay(), Boolean.TRUE);
                    gjp gjpVar = this.a;
                    ArrayList arrayList2 = gjpVar.W;
                    if (!zG || arrayList.isEmpty()) {
                        gjpVar.T.setVisibility(8);
                        gjpVar.b0.setVisibility(8);
                        return;
                    }
                    gjpVar.Y = 0L;
                    Collections.sort(arrayList);
                    arrayList2.clear();
                    int size = arrayList.size();
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        QuickInputItem quickInputItem2 = (QuickInputItem) obj2;
                        int i4 = quickInputItem2.line;
                        if (i4 == 1) {
                            i2++;
                        } else if (i4 == 2 && gjpVar.Y == 0) {
                            gjpVar.Y = quickInputItem2.amount;
                        }
                    }
                    if (i2 == 1) {
                        QuickInputItem quickInputItem3 = new QuickInputItem();
                        quickInputItem3.line = 1;
                        arrayList.add(1, quickInputItem3);
                    }
                    gjpVar.V.Z = new kjp();
                    gjpVar.b0.setVisibility(0);
                    arrayList2.addAll(arrayList);
                    znd zndVar = new znd();
                    zndVar.a = arrayList2;
                    zndVar.b = gjpVar;
                    gjpVar.U = zndVar;
                    gjpVar.T.setLayoutManager(gjpVar.V);
                    RecyclerView recyclerView = gjpVar.T;
                    recyclerView.i(new el40(zch0.a(recyclerView.getContext(), 10), zch0.a(gjpVar.T.getContext(), 6)));
                    gjpVar.T.setAdapter(gjpVar.U);
                }
            }
        });
        i2i.b(this.f0.U0).f(getViewLifecycleOwner(), new ejp(this, 0));
        i2i.b(this.f0.E0).f(getViewLifecycleOwner(), new lfy() { // from class: fjp
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                ChannelAsset.Channel channel = (ChannelAsset.Channel) obj;
                AtomicInteger atomicInteger = gjp.r0;
                if (channel == null || channel.getChannelIconUrl() == null || channel.getChannelIconUrl().isEmpty()) {
                    return;
                }
                String channelIconUrl = channel.getChannelIconUrl();
                gjp gjpVar = this.a;
                gjpVar.d0 = channelIconUrl;
                com.bumptech.glide.a.b(gjpVar.getContext()).d(gjpVar).p(gjpVar.d0).j().M(gjpVar.c0);
            }
        });
        i2i.b(this.f0.p1).f(getViewLifecycleOwner(), new lfy() { // from class: sip
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                List<Range> depositTaxRanges;
                AtomicInteger atomicInteger = gjp.r0;
                gjp gjpVar = this.a;
                androidx.fragment.app.e activity = gjpVar.getActivity();
                if (gjpVar.f0 == null || activity == null || activity.isFinishing() || gjpVar.isDetached()) {
                    return;
                }
                if (!vox.d(activity)) {
                    zyf0.c(1, sn5.d(gjpVar, R.string.common_feedback__no_internet_connection_try_again, new Object[0]));
                    gjpVar.k0.a(new ind("mobile_network"), k00.c);
                    return;
                }
                if (gjpVar.O) {
                    zyf0.c(1, sn5.d(gjpVar, R.string.common_feedback__dont_repeat_deposit, new Object[0]));
                    return;
                }
                gjpVar.E.setLoading(true);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("phoneNo", "254".concat(gjpVar.G.substring(1)));
                    jSONObject.put("payAmount", gjpVar.F.multiply(BigDecimal.valueOf(10000L)));
                    pjp pjpVar2 = gjpVar.f0;
                    BigDecimal bigDecimalC = p54.c(gjpVar.F);
                    pjpVar2.getClass();
                    bigDecimalC.getClass();
                    BountyAndTaxConfigs value = pjpVar2.f1.N().getValue();
                    if (value == null || (depositTaxRanges = value.getDepositTaxRanges()) == null) {
                        depositTaxRanges = m2g.a;
                    }
                    depositTaxRanges.getClass();
                    jSONObject.put("taxAmount", pjpVar2.u(bigDecimalC, depositTaxRanges));
                    jSONObject.put("payChId", gjpVar.f0.l1.a.getValue());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                su5<BaseResponse<xdp>> su5Var = gjpVar.N;
                if (su5Var != null) {
                    su5Var.cancel();
                }
                su5<BaseResponse<xdp>> su5VarA = ap0.g().a(jSONObject.toString());
                gjpVar.N = su5VarA;
                su5VarA.G(new hjp(gjpVar));
            }
        });
        i2i.b(this.f0.w).f(getViewLifecycleOwner(), new lfy() { // from class: tip
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                spg0 spg0Var = (spg0) obj;
                AtomicInteger atomicInteger = gjp.r0;
                boolean z = spg0Var instanceof spg0.e;
                gjp gjpVar = this.a;
                if (z) {
                    gjpVar.g0.c.a(Unit.a);
                    return;
                }
                if (spg0Var instanceof spg0.h) {
                    vxo.b(gjpVar.requireContext(), ((spg0.h) spg0Var).a.e(gjpVar.requireContext()).toString());
                } else if (spg0Var instanceof spg0.i) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(((spg0.i) spg0Var).a.e(gjpVar.requireContext()).toString()));
                    intent.addFlags(268435456);
                    gjpVar.startActivity(intent);
                }
            }
        });
        yyh.b(this.f0.i1.x0(), getViewLifecycleOwner(), s9s.b.d, new Function1() { // from class: wip
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                final String str2 = (String) obj;
                AtomicInteger atomicInteger = gjp.r0;
                boolean zIsEmpty = str2.isEmpty();
                gjp gjpVar = this.a;
                ComposeView composeView4 = gjpVar.q0;
                if (zIsEmpty) {
                    composeView4.setVisibility(8);
                } else {
                    composeView4.setVisibility(0);
                    ComposeView composeView5 = gjpVar.q0;
                    composeView5.getClass();
                    mla.i(composeView5, new op8(1209214331, new Function2() { // from class: pqd
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                oqd.a(0, 2, aVar2, null, str2);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, true));
                }
                return Unit.a;
            }
        });
        this.D.setViewCompositionStrategy(aVar);
        ComposeView composeView4 = this.D;
        final pjp pjpVar2 = this.f0;
        composeView4.getClass();
        pjpVar2.getClass();
        composeView4.setContent(new op8(86732302, new Function2() { // from class: pip
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ytw ytwVarC = wyh.c((uwd0) pjpVar2.n1.getValue(), aVar2, 0, 7);
                    or0.a(null, false, false, null, pp8.b(1662508901, new Function2() { // from class: qip
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                nag.a(0, aVar3, null, (List) ytwVarC.getValue());
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, aVar2), aVar2, 24576);
                } else {
                    aVar2.G();
                }
                return Unit.a;
            }
        }, true));
        return this.X;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.L = null;
        }
        ClearEditText clearEditText = this.C;
        if (clearEditText != null) {
            lop.b(clearEditText, Boolean.FALSE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ClearEditText clearEditText = this.C;
        if (clearEditText != null) {
            lop.b(clearEditText, Boolean.FALSE);
        }
        this.i0.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        ClearEditText clearEditText = this.C;
        if (clearEditText != null) {
            lop.b(clearEditText, Boolean.FALSE);
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        lop.a(this.C);
        wwd0 wwd0Var = this.f0.G0;
        Boolean bool = Boolean.FALSE;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.J || this.I == null) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("spotId", "depositBanner");
                jSONArray.put(jSONObject2);
                jSONObject.put("adSpots", jSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            su5<BaseResponse<AdsData>> su5Var = this.P;
            if (su5Var != null) {
                su5Var.cancel();
            }
            pjp pjpVar = this.f0;
            su5<BaseResponse<AdsData>> su5VarA = pjpVar.g1.a(jSONObject.toString());
            this.P = su5VarA;
            su5VarA.G(new jjp(this));
        } else {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null && !vox.d(activity)) {
                zyf0.c(1, sn5.d(this, R.string.common_feedback__no_internet_connection_try_again, new Object[0]));
                return;
            }
            this.K.sendEmptyMessage(1);
        }
        wwd0 wwd0Var = this.f0.G0;
        Boolean bool = Boolean.TRUE;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        vw vwVar = (vw) i2i.b((lyh) this.g0.e.getValue()).d();
        String string = charSequence.toString();
        if (TextUtils.isEmpty(string)) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
            this.F = bigDecimalValueOf;
            pjp pjpVar = this.f0;
            BigDecimal bigDecimalC = p54.c(bigDecimalValueOf);
            pjpVar.getClass();
            bigDecimalC.getClass();
            wwd0 wwd0Var = pjpVar.m1;
            wwd0Var.getClass();
            wwd0Var.k(null, bigDecimalC);
            this.C.setError((String) null);
            q0(false);
            this.D.setVisibility(8);
        } else {
            BigDecimal bigDecimal = new BigDecimal(string);
            this.F = bigDecimal;
            pjp pjpVar2 = this.f0;
            BigDecimal bigDecimalC2 = p54.c(bigDecimal);
            pjpVar2.getClass();
            bigDecimalC2.getClass();
            wwd0 wwd0Var2 = pjpVar2.m1;
            wwd0Var2.getClass();
            wwd0Var2.k(null, bigDecimalC2);
            if (string.contains(".") || string.matches("[0]+")) {
                this.C.setError(sn5.d(this, R.string.page_payment__please_enter_a_valid_integer, new Object[0]));
                q0(false);
                this.E.setDescTextVisible(false);
                this.D.setVisibility(8);
                r0(this.F.multiply(BigDecimal.valueOf(10000L)));
                return;
            }
            if (vwVar == null) {
                itf0.a.a("get amount from viewmodel null", new Object[0]);
                return;
            }
            T t = vwVar.b;
            BigDecimal bigDecimal2 = (BigDecimal) vwVar.a;
            if (this.F.compareTo(bigDecimal2) < 0) {
                this.C.setError(sn5.d(this, R.string.page_payment__the_minimum_deposit_amount_is_vcurrency_vamount, a8b.e(), String.format(Locale.US, "%,.2f", BigDecimal.valueOf(bigDecimal2.longValue()), 2, RoundingMode.HALF_UP)));
                q0(false);
                this.E.setDescTextVisible(false);
                this.D.setVisibility(8);
                r0(this.F.multiply(BigDecimal.valueOf(10000L)));
                return;
            }
            BigDecimal bigDecimal3 = (BigDecimal) t;
            int iCompareTo = this.F.compareTo(bigDecimal3);
            ClearEditText clearEditText = this.C;
            if (iCompareTo > 0) {
                clearEditText.setError(sn5.d(this, R.string.page_payment__the_maximum_deposit_amount_is_vcurrency_vamount, a8b.e(), String.format(Locale.US, "%,.2f", BigDecimal.valueOf(bigDecimal3.longValue()), 2, RoundingMode.HALF_UP)));
                q0(false);
                this.E.setDescTextVisible(false);
                this.D.setVisibility(8);
                r0(this.F.multiply(BigDecimal.valueOf(10000L)));
                return;
            }
            clearEditText.setError((String) null);
            q0(true);
            this.D.setVisibility(0);
        }
        r0(this.F.multiply(BigDecimal.valueOf(10000L)));
    }

    public final void p0(int i, String str) {
        this.J = false;
        androidx.fragment.app.e activity = getActivity();
        if (activity == null || activity.isFinishing() || isDetached()) {
            return;
        }
        if (i != 0) {
            if (i == 1 && !activity.isFinishing()) {
                if (TextUtils.isEmpty(str)) {
                    str = sn5.d(this, R.string.page_payment__sorry_your_payment_request_has_a_problem_options_tip, new Object[0]);
                }
                androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(activity);
                AlertController.b bVar = aVar.a;
                bVar.f = str;
                bVar.k = false;
                aVar.setTitle(sn5.d(this, R.string.page_payment__error_during_transaction, new Object[0])).setPositiveButton(R.string.common_functions__ok, new vip()).f();
                return;
            }
            return;
        }
        if (activity.isFinishing()) {
            return;
        }
        androidx.appcompat.app.b bVarCreate = this.M;
        if (bVarCreate == null) {
            if (TextUtils.isEmpty(str)) {
                str = sn5.d(this, R.string.common_payment_providers__deposit_request_confirm_msg, new Object[0]);
            }
            androidx.appcompat.app.b.a aVar2 = new androidx.appcompat.app.b.a(activity);
            AlertController.b bVar2 = aVar2.a;
            bVar2.f = str;
            bVar2.k = false;
            bVarCreate = aVar2.setPositiveButton(R.string.common_functions__ok, new DialogInterface.OnClickListener() { // from class: uip
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    AtomicInteger atomicInteger = gjp.r0;
                    gjp gjpVar = this.a;
                    gjpVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(AnalyticsEvent.DEPOSIT, true);
                    bundle.putInt("key_param_tx_category", aqg0.e.c.a);
                    sh8.c().c(o7d.a(wae.ME_TRANSACTIONS), bundle);
                    if (gjpVar.getActivity() == null || gjpVar.getActivity().isFinishing()) {
                        return;
                    }
                    gjpVar.getActivity().finish();
                }
            }).create();
            this.M = bVarCreate;
        }
        if (bVarCreate.isShowing()) {
            return;
        }
        this.M.show();
    }

    public final void q0(boolean z) {
        this.E.setEnabled(z);
    }

    public final void r0(BigDecimal bigDecimal) {
        this.E.setText(sn5.d(this, R.string.common_functions__top_up_now, new Object[0]));
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            QuickInputItem quickInputItem = (QuickInputItem) obj;
            if (bigDecimal.compareTo(BigDecimal.valueOf(quickInputItem.amount)) != 0 || !this.e0) {
                z = false;
            }
            quickInputItem.isSelected = z;
        }
        znd zndVar = this.U;
        if (zndVar != null) {
            zndVar.notifyDataSetChanged();
        }
        this.e0 = false;
        long jLongValue = bigDecimal.longValue();
        BountyAndTaxConfigs value = this.f0.f1.N().getValue();
        Long lValueOf = value == null ? 0L : Long.valueOf(this.f0.u(BigDecimal.valueOf(jLongValue), value.getBountyRanges()));
        boolean zIsEnabled = this.E.isEnabled();
        CustomProgressButton customProgressButton = this.E;
        if (!zIsEnabled) {
            customProgressButton.setDescTextVisible(false);
            return;
        }
        customProgressButton.setText(sn5.d(this, R.string.page_payment__pay_vnum__KE, String.format(Locale.US, "%,.0f", BigDecimal.valueOf(bigDecimal.longValue()).divide(BigDecimal.valueOf(10000L), 0, RoundingMode.HALF_UP))));
        BountyAndTaxConfigs value2 = this.f0.f1.N().getValue();
        if (!(value2 != null ? Intrinsics.g(value2.getDepositButtonTextDisplay(), Boolean.TRUE) : false) || lValueOf.longValue() <= 0) {
            this.E.setDescTextVisible(false);
        } else {
            this.E.setDescView(sn5.d(this, R.string.page_payment__get_vcurrency_vnum_extra_after_top_up__KE, a8b.e(), bjb0.f0(p54.b(BigDecimal.valueOf(lValueOf.longValue())).toString())));
            this.E.setDescTextVisible(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
