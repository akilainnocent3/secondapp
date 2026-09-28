package com.sportybet.plugin.realsports.betslip.virtualkeyboard;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;
import defpackage.b6y;
import defpackage.bmy;
import defpackage.cid0;
import defpackage.fse;
import defpackage.gku;
import defpackage.h5e;
import defpackage.imn;
import defpackage.jrm;
import defpackage.lrm;
import defpackage.n4p;
import defpackage.nte;
import defpackage.nzm;
import defpackage.p8k;
import defpackage.pfd;
import defpackage.pk2;
import defpackage.qd90;
import defpackage.qop;
import defpackage.rk30;
import defpackage.rop;
import defpackage.sn5;
import defpackage.u02;
import defpackage.uqm;
import defpackage.vop;
import defpackage.vxw;
import defpackage.y8k;
import defpackage.zi50;
import defpackage.zu7;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002[\\B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001bR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006]"}, d2 = {"Lcom/sportybet/plugin/realsports/betslip/virtualkeyboard/KeyboardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/sportybet/plugin/realsports/betslip/virtualkeyboard/c$b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "listener", "", "setOnKeyBoardClickListener", "(Lcom/sportybet/plugin/realsports/betslip/virtualkeyboard/c$b;)V", "Lcom/sportybet/plugin/realsports/betslip/virtualkeyboard/KeyboardView$b;", "setOnValueChangeListener", "(Lcom/sportybet/plugin/realsports/betslip/virtualkeyboard/KeyboardView$b;)V", "Landroid/view/View$OnClickListener;", "setOnDoneButtonClickListener", "(Landroid/view/View$OnClickListener;)V", AnalyticsParam.EVENT_STATUS, "setQuickToolBar", "(I)V", "Ljava/math/BigDecimal;", "currentDefaultStake", "setCurrentDefaultStake", "(Ljava/math/BigDecimal;)V", "minStake", "setMinStake", "maxStake", "setMaxStake", "Luqm;", "R", "Luqm;", "getAccountHelper", "()Luqm;", "setAccountHelper", "(Luqm;)V", "accountHelper", "Ljrm;", "S", "Ljrm;", "getBetItem", "()Ljrm;", "setBetItem", "(Ljrm;)V", "betItem", "Llrm;", "T", "Llrm;", "getBetStore", "()Llrm;", "setBetStore", "(Llrm;)V", "betStore", "Lvxw;", "U", "Lvxw;", "getMyFavoriteRepository", "()Lvxw;", "setMyFavoriteRepository", "(Lvxw;)V", "myFavoriteRepository", "Ly8k;", "V", "Ly8k;", "getGetMinStakeUseCase", "()Ly8k;", "setGetMinStakeUseCase", "(Ly8k;)V", "getMinStakeUseCase", "Lp8k;", "W", "Lp8k;", "getGetMaxStakeUseCase", "()Lp8k;", "setGetMaxStakeUseCase", "(Lp8k;)V", "getMaxStakeUseCase", "Lnzm;", "a0", "Lnzm;", "getStakeConfigAgent", "()Lnzm;", "setStakeConfigAgent", "(Lnzm;)V", "stakeConfigAgent", "getInputValue", "()Ljava/math/BigDecimal;", "inputValue", "a", "b", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class KeyboardView extends Hilt_KeyboardView implements c.b {
    public static final /* synthetic */ int b0 = 0;
    public final cid0 H;
    public final ArrayList I;
    public final c J;
    public final boolean K;
    public EditText L;
    public b M;
    public int N;
    public int O;
    public BigDecimal P;
    public BigDecimal Q;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public uqm accountHelper;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public jrm betItem;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public lrm betStore;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public vxw myFavoriteRepository;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public y8k getMinStakeUseCase;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public p8k getMaxStakeUseCase;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public nzm stakeConfigAgent;

    public static final class a extends u02 {
        public final int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            context.getClass();
            this.c = context.getColor(R.color.line_type1_secondary);
        }

        @Override // defpackage.u02
        public final nte j(int i) {
            int i2 = this.c;
            if (i == 6 || i == 13) {
                qd90 qd90Var = new qd90(true, i2, 1.0f, 0.0f);
                qd90 qd90Var2 = new qd90(false, -10066330, 0.0f, 0.0f);
                nte nteVar = new nte();
                nteVar.a = qd90Var2;
                nteVar.b = qd90Var2;
                nteVar.c = qd90Var2;
                nteVar.d = qd90Var;
                return nteVar;
            }
            qd90 qd90Var3 = new qd90(true, i2, 1.0f, 0.0f);
            qd90 qd90Var4 = new qd90(true, i2, 1.0f, 0.0f);
            qd90 qd90Var5 = new qd90(false, -10066330, 0.0f, 0.0f);
            nte nteVar2 = new nte();
            nteVar2.a = qd90Var5;
            nteVar2.b = qd90Var5;
            nteVar2.c = qd90Var3;
            nteVar2.d = qd90Var4;
            return nteVar2;
        }
    }

    public interface b {
        void a();

        void b();

        void c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.spr_layout_key_board, this);
        int i2 = R.id.default_stake_checkbox;
        CheckBox checkBox = (CheckBox) h5e.a(R.id.default_stake_checkbox, this);
        if (checkBox != null) {
            i2 = R.id.default_stake_container;
            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.default_stake_container, this);
            if (linearLayout != null) {
                i2 = R.id.done;
                TextView textView = (TextView) h5e.a(R.id.done, this);
                if (textView != null) {
                    i2 = R.id.quick_btn_1;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.quick_btn_1, this);
                    if (appCompatTextView != null) {
                        i2 = R.id.quick_btn_2;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.quick_btn_2, this);
                        if (appCompatTextView2 != null) {
                            i2 = R.id.quick_btn_3;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.quick_btn_3, this);
                            if (appCompatTextView3 != null) {
                                i2 = R.id.quick_tool_bar;
                                LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.quick_tool_bar, this);
                                if (linearLayout2 != null) {
                                    i2 = R.id.quick_tool_bar_divider;
                                    View viewA = h5e.a(R.id.quick_tool_bar_divider, this);
                                    if (viewA != null) {
                                        i2 = R.id.recycler_view;
                                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler_view, this);
                                        if (recyclerView != null) {
                                            this.H = new cid0(this, checkBox, linearLayout, textView, appCompatTextView, appCompatTextView2, appCompatTextView3, linearLayout2, viewA, recyclerView);
                                            ArrayList arrayList = new ArrayList();
                                            this.I = arrayList;
                                            this.N = 1;
                                            this.O = 1;
                                            BigDecimal bigDecimal = BigDecimal.ZERO;
                                            bigDecimal.getClass();
                                            this.P = bigDecimal;
                                            this.Q = bigDecimal;
                                            setBackgroundColor(getResources().getColor(R.color.text_type1_primary, null));
                                            int i3 = 0;
                                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.s, i, 0);
                                            typedArrayObtainStyledAttributes.getClass();
                                            try {
                                                this.K = typedArrayObtainStyledAttributes.getBoolean(0, false);
                                                typedArrayObtainStyledAttributes.recycle();
                                                int i4 = 0;
                                                while (i4 < 14) {
                                                    arrayList.add((i4 < 0 || i4 >= 6) ? i4 == 6 ? "" : (7 > i4 || i4 >= 10) ? i4 == 10 ? "0" : i4 == 11 ? "." : i4 == 12 ? CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS : i4 == 13 ? sn5.c(this, R.string.common_functions__clear, new Object[0]) : sn5.c(this, R.string.common_functions__nan, new Object[0]) : String.valueOf(i4) : String.valueOf(i4 + 1));
                                                    i4++;
                                                }
                                                cid0 cid0Var = this.H;
                                                KeyboardView keyboardView = cid0Var.a;
                                                RecyclerView recyclerView2 = cid0Var.y;
                                                keyboardView.getContext();
                                                GridLayoutManager gridLayoutManager = new GridLayoutManager(8);
                                                gridLayoutManager.Z = new vop();
                                                c cVar = new c(arrayList, this.K);
                                                this.J = cVar;
                                                cVar.c = this;
                                                recyclerView2.setLayoutManager(gridLayoutManager);
                                                recyclerView2.setAdapter(this.J);
                                                Context context2 = getContext();
                                                context2.getClass();
                                                recyclerView2.i(new a(context2));
                                                cid0Var.c.setOnClickListener(new View.OnClickListener() { // from class: pop
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i5 = KeyboardView.b0;
                                                        KeyboardView keyboardView2 = this.a;
                                                        int i6 = keyboardView2.O;
                                                        if (i6 == 1) {
                                                            keyboardView2.O = 2;
                                                        } else if (i6 == 2) {
                                                            keyboardView2.O = 1;
                                                        }
                                                        keyboardView2.H();
                                                    }
                                                });
                                                cid0Var.b.setOnClickListener(new qop(this, i3));
                                                if (!isInEditMode()) {
                                                    G();
                                                }
                                                BigDecimal bigDecimalH = getStakeConfigAgent().h();
                                                bigDecimalH.getClass();
                                                setCurrentDefaultStake(bigDecimalH);
                                                setMinStake(getGetMinStakeUseCase().a());
                                                setMaxStake(getGetMaxStakeUseCase().a());
                                                return;
                                            } catch (Throwable th) {
                                                typedArrayObtainStyledAttributes.recycle();
                                                throw th;
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
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public static final void I(KeyboardView keyboardView, View.OnClickListener onClickListener, cid0 cid0Var) {
        if (keyboardView.N == 3 && keyboardView.O == 2) {
            keyboardView.getAccountHelper().setCustomDefaultStake(keyboardView.getInputValue());
            keyboardView.setCurrentDefaultStake(keyboardView.getInputValue());
            String string = keyboardView.getInputValue().toString();
            string.getClass();
            Context context = keyboardView.getContext();
            context.getClass();
            imn imnVar = new imn(0L, string, pk2.a(context, string));
            keyboardView.getBetStore().n();
            keyboardView.getBetStore().x(string);
            keyboardView.getBetStore().L(imnVar);
            keyboardView.getBetStore().i(imnVar);
            if (keyboardView.getBetItem().m0()) {
                keyboardView.getBetStore().t(keyboardView.getInputValue().toString());
            }
        }
        onClickListener.onClick(cid0Var.d);
    }

    public static final void K(KeyboardView keyboardView, View view) {
        view.getClass();
        Object tag = view.getTag();
        tag.getClass();
        BigDecimal bigDecimal = (BigDecimal) tag;
        EditText editText = keyboardView.L;
        if (editText == null) {
            return;
        }
        editText.setText(b6y.c(keyboardView.getInputValue().add(bigDecimal)));
        editText.setSelection(editText.getText().length());
        b bVar = keyboardView.M;
        if (bVar != null) {
            bVar.b();
        }
        if (keyboardView.N == 3) {
            keyboardView.M();
        }
    }

    private final BigDecimal getInputValue() {
        Object bVar;
        String string;
        Editable text;
        try {
            zi50.a aVar = zi50.b;
            EditText editText = this.L;
            if (editText == null || (text = editText.getText()) == null || (string = text.toString()) == null) {
                string = "0";
            }
            bVar = new BigDecimal(string);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = BigDecimal.ZERO;
        if (bVar instanceof zi50.b) {
            bVar = obj;
        }
        return (BigDecimal) bVar;
    }

    private final void setCurrentDefaultStake(BigDecimal currentDefaultStake) {
    }

    private final void setMaxStake(BigDecimal maxStake) {
        this.Q = maxStake;
    }

    private final void setMinStake(BigDecimal minStake) {
        this.P = minStake;
    }

    private final void setQuickToolBar(int status) {
        this.N = status;
        cid0 cid0Var = this.H;
        if (status == 1) {
            cid0Var.v.setVisibility(8);
            cid0Var.w.setVisibility(8);
            return;
        }
        if (status == 2) {
            cid0Var.v.setVisibility(0);
            cid0Var.w.setVisibility(0);
            cid0Var.c.setVisibility(8);
            G();
            return;
        }
        if (status != 3) {
            return;
        }
        cid0Var.v.setVisibility(0);
        cid0Var.w.setVisibility(0);
        cid0Var.c.setVisibility(0);
        M();
        G();
    }

    public final void E() {
        if (F()) {
            this.L = null;
            setVisibility(8);
        }
    }

    public final boolean F() {
        return getVisibility() == 0;
    }

    public final void G() {
        List<BigDecimal> listI = getStakeConfigAgent().i();
        vxw myFavoriteRepository = getMyFavoriteRepository();
        zu7.a aVar = zu7.a;
        pfd pfdVar = fse.a;
        myFavoriteRepository.e(gku.a, new rop(this, this.H, listI));
    }

    public final void H() {
        int i = this.O;
        cid0 cid0Var = this.H;
        if (i == 1) {
            cid0Var.b.setEnabled(true);
            cid0Var.b.setChecked(false);
        } else if (i == 2) {
            cid0Var.b.setEnabled(true);
            cid0Var.b.setChecked(true);
        } else if (i != 3) {
            cid0Var.b.setEnabled(false);
        } else {
            cid0Var.b.setEnabled(false);
        }
    }

    public final void J(TextView textView, BigDecimal bigDecimal) {
        DecimalFormat decimalFormat = b6y.a;
        textView.setText("+" + b6y.b.format(bigDecimal.doubleValue()));
        textView.setTag(bigDecimal);
        textView.setOnClickListener(new View.OnClickListener() { // from class: sop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeyboardView.K(this.a, view);
            }
        });
    }

    public final void L(EditText editText, int i) {
        this.L = editText;
        setQuickToolBar(i);
        setVisibility(0);
    }

    public final void M() {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(getInputValue().doubleValue());
        BigDecimal bigDecimalH = getStakeConfigAgent().h();
        BigDecimal bigDecimal = this.P;
        BigDecimal bigDecimal2 = this.Q;
        bigDecimalValueOf.getClass();
        this.O = (bigDecimalValueOf.compareTo(bigDecimal) < 0 || bigDecimalValueOf.compareTo(bigDecimal2) > 0 || bigDecimalH.compareTo(bigDecimalValueOf) == 0 || !getAccountHelper().isLogin()) ? 3 : 1;
        H();
    }

    public final void N(n4p n4pVar) {
        if (n4pVar != null) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(n4pVar.j);
            bigDecimalValueOf.getClass();
            setMinStake(bigDecimalValueOf);
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(n4pVar.k);
            bigDecimalValueOf2.getClass();
            setMaxStake(bigDecimalValueOf2);
            M();
        }
    }

    @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.c.b
    public final void b(View view, RecyclerView.d0 d0Var) {
        EditText editText = this.L;
        if (editText == null) {
            return;
        }
        int selectionStart = editText.getSelectionStart();
        if (editText.getText() != null) {
            Editable text = editText.getText();
            text.getClass();
            if (text.length() > 0 && selectionStart > 0) {
                editText.getText().delete(selectionStart - 1, selectionStart);
            }
        }
        b bVar = this.M;
        if (bVar != null) {
            bVar.a();
        }
        if (this.N == 3) {
            M();
        }
    }

    @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.c.b
    public final void e(View view, RecyclerView.d0 d0Var, int i) {
        EditText editText = this.L;
        if (editText == null) {
            return;
        }
        if ((i == 10 || i == 12) && editText.getText().toString().length() == 0) {
            return;
        }
        if (i == 13) {
            if (editText.getText() != null) {
                Editable text = editText.getText();
                text.getClass();
                if (text.length() > 0) {
                    editText.getText().delete(0, editText.getText().length());
                }
            }
            b bVar = this.M;
            if (bVar != null) {
                bVar.c();
            }
            if (this.N == 3) {
                M();
                return;
            }
            return;
        }
        String string = editText.getText().toString();
        if (Intrinsics.g(string, ".") && editText.getSelectionStart() > 0) {
            editText.getText().insert(0, "0");
        }
        int iS = StringsKt.S(string, '.', 0, 6);
        int length = string.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (string.charAt(i3) == '.') {
                i2++;
            }
        }
        int selectionStart = editText.getSelectionStart();
        ArrayList arrayList = this.I;
        if (i2 == 0) {
            if (i != 11 || string.length() - selectionStart <= 2) {
                editText.getText().insert(selectionStart, (CharSequence) arrayList.get(i));
            }
        } else if (i2 == 1 && i != 11 && (selectionStart <= iS || (string.length() - iS) - 1 < 2)) {
            editText.getText().insert(selectionStart, (CharSequence) arrayList.get(i));
        }
        b bVar2 = this.M;
        if (bVar2 != null) {
            bVar2.b();
        }
        if (this.N == 3) {
            M();
        }
    }

    public final uqm getAccountHelper() {
        uqm uqmVar = this.accountHelper;
        if (uqmVar != null) {
            return uqmVar;
        }
        Intrinsics.n("accountHelper");
        throw null;
    }

    public final jrm getBetItem() {
        jrm jrmVar = this.betItem;
        if (jrmVar != null) {
            return jrmVar;
        }
        Intrinsics.n("betItem");
        throw null;
    }

    public final lrm getBetStore() {
        lrm lrmVar = this.betStore;
        if (lrmVar != null) {
            return lrmVar;
        }
        Intrinsics.n("betStore");
        throw null;
    }

    public final p8k getGetMaxStakeUseCase() {
        p8k p8kVar = this.getMaxStakeUseCase;
        if (p8kVar != null) {
            return p8kVar;
        }
        Intrinsics.n("getMaxStakeUseCase");
        throw null;
    }

    public final y8k getGetMinStakeUseCase() {
        y8k y8kVar = this.getMinStakeUseCase;
        if (y8kVar != null) {
            return y8kVar;
        }
        Intrinsics.n("getMinStakeUseCase");
        throw null;
    }

    public final vxw getMyFavoriteRepository() {
        vxw vxwVar = this.myFavoriteRepository;
        if (vxwVar != null) {
            return vxwVar;
        }
        Intrinsics.n("myFavoriteRepository");
        throw null;
    }

    public final nzm getStakeConfigAgent() {
        nzm nzmVar = this.stakeConfigAgent;
        if (nzmVar != null) {
            return nzmVar;
        }
        Intrinsics.n("stakeConfigAgent");
        throw null;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (getMyFavoriteRepository().r() && F()) {
            G();
        }
    }

    @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.c.b
    public final void s(View view, RecyclerView.d0 d0Var) {
        EditText editText = this.L;
        if (editText == null) {
            return;
        }
        if (editText.getText() != null) {
            Editable text = editText.getText();
            text.getClass();
            if (text.length() > 0) {
                editText.getText().delete(0, editText.getText().length());
            }
        }
        b bVar = this.M;
        if (bVar != null) {
            bVar.c();
        }
        if (this.N == 3) {
            M();
        }
    }

    public final void setAccountHelper(uqm uqmVar) {
        uqmVar.getClass();
        this.accountHelper = uqmVar;
    }

    public final void setBetItem(jrm jrmVar) {
        jrmVar.getClass();
        this.betItem = jrmVar;
    }

    public final void setBetStore(lrm lrmVar) {
        lrmVar.getClass();
        this.betStore = lrmVar;
    }

    public final void setGetMaxStakeUseCase(p8k p8kVar) {
        p8kVar.getClass();
        this.getMaxStakeUseCase = p8kVar;
    }

    public final void setGetMinStakeUseCase(y8k y8kVar) {
        y8kVar.getClass();
        this.getMinStakeUseCase = y8kVar;
    }

    public final void setMyFavoriteRepository(vxw vxwVar) {
        vxwVar.getClass();
        this.myFavoriteRepository = vxwVar;
    }

    public final void setOnDoneButtonClickListener(final View.OnClickListener listener) {
        listener.getClass();
        final cid0 cid0Var = this.H;
        cid0Var.d.setOnClickListener(new View.OnClickListener() { // from class: nop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeyboardView.I(this.a, listener, cid0Var);
            }
        });
    }

    public final void setOnKeyBoardClickListener(c.b listener) {
        c cVar = this.J;
        if (cVar != null) {
            cVar.c = listener;
        }
    }

    public final void setOnValueChangeListener(b listener) {
        this.M = listener;
    }

    public final void setStakeConfigAgent(nzm nzmVar) {
        nzmVar.getClass();
        this.stakeConfigAgent = nzmVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyboardView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ KeyboardView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
