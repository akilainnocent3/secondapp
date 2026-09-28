package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.pocket.withdraw.transfer.RecipientData;
import com.sporty.android.core.model.pocket.withdraw.transfer.TransferStatus;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import com.sportybet.android.payment.security.nameconfirm.bvn.presentation.activity.TransferBvnActivity;
import com.sportybet.android.payment.security.sportypin.presentation.activity.TransferPinActivity;
import com.sportybet.android.user.ChangeUserInfoActivity;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lopj0;", "Lj82;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class opj0 extends a8m {
    public static final /* synthetic */ int k0 = 0;
    public psm a0;
    public bzi b0;
    public final q8i0 c0;
    public PopupWindow d0;
    public bc6 e0;
    public bc6 f0;
    public bc6 g0;
    public ee<Void> h0;
    public ee<Intent> i0;
    public ee<e0i0> j0;

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawTransferFragment$initTradingViewModel$1$1", f = "WithdrawTransferFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<TransferStatus, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = opj0.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransferStatus transferStatus, v1b<? super Unit> v1bVar) {
            return ((a) create(transferStatus, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Drawable drawable;
            Drawable drawable2;
            String strValueOf;
            String strValueOf2;
            TransferStatus transferStatus = (TransferStatus) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            csg0 csg0VarA = asg0.a(transferStatus);
            boolean z = csg0VarA instanceof csg0.b;
            opj0 opj0Var = opj0.this;
            if (z) {
                bzi bziVar = opj0Var.b0;
                if (bziVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                bziVar.M.setVisibility(8);
                bzi bziVar2 = opj0Var.b0;
                if (bziVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                bziVar2.y.setVisibility(8);
            } else if (Intrinsics.g(csg0VarA, csg0.c.a)) {
                bzi bziVar3 = opj0Var.b0;
                if (bziVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                bziVar3.M.setVisibility(0);
                bzi bziVar4 = opj0Var.b0;
                if (bziVar4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                bziVar4.y.setVisibility(8);
                int color = opj0Var.requireContext().getColor(R.color.text_type1_secondary);
                Drawable drawableA = iwh0.a(opj0Var.requireContext(), R.drawable.transfer_verify_check, opj0Var.requireContext().getColor(R.color.brand_quaternary));
                Drawable drawableA2 = iwh0.a(opj0Var.requireContext(), R.drawable.ic_keyboard_arrow_right_black_24dp, color);
                bzi bziVar5 = opj0Var.b0;
                if (bziVar5 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                TextView textView = bziVar5.v;
                Boolean bvn = transferStatus.getBvn();
                Boolean bool = Boolean.TRUE;
                textView.setEnabled(!Intrinsics.g(bvn, bool));
                bzi bziVar6 = opj0Var.b0;
                if (bziVar6 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                TextView textView2 = bziVar6.v;
                Drawable drawableA3 = iwh0.a(opj0Var.requireContext(), R.drawable.icon_bvn, color);
                boolean zG = Intrinsics.g(transferStatus.getBvn(), bool);
                bzi bziVar7 = opj0Var.b0;
                if (zG) {
                    if (bziVar7 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    TextView textView3 = bziVar7.v;
                    textView3.setTag(textView3.getId(), new Integer(R.drawable.transfer_verify_check));
                    drawable = drawableA;
                } else {
                    if (bziVar7 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    TextView textView4 = bziVar7.v;
                    textView4.setTag(textView4.getId(), new Integer(R.drawable.ic_keyboard_arrow_right_black_24dp));
                    drawable = drawableA2;
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawableA3, (Drawable) null, drawable, (Drawable) null);
                bzi bziVar8 = opj0Var.b0;
                if (bziVar8 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                bziVar8.S.setEnabled(!Intrinsics.g(transferStatus.getWithdrawPin(), bool));
                bzi bziVar9 = opj0Var.b0;
                if (bziVar9 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                TextView textView5 = bziVar9.S;
                Drawable drawableA4 = iwh0.a(opj0Var.requireContext(), R.drawable.icon_withdraw, color);
                boolean zG2 = Intrinsics.g(transferStatus.getWithdrawPin(), bool);
                bzi bziVar10 = opj0Var.b0;
                if (zG2) {
                    if (bziVar10 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    TextView textView6 = bziVar10.S;
                    textView6.setTag(textView6.getId(), new Integer(R.drawable.transfer_verify_check));
                    drawable2 = drawableA;
                } else {
                    if (bziVar10 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    TextView textView7 = bziVar10.S;
                    textView7.setTag(textView7.getId(), new Integer(R.drawable.ic_keyboard_arrow_right_black_24dp));
                    drawable2 = drawableA2;
                }
                textView5.setCompoundDrawablesWithIntrinsicBounds(drawableA4, (Drawable) null, drawable2, (Drawable) null);
                bzi bziVar11 = opj0Var.b0;
                if (bziVar11 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                bziVar11.A.setEnabled(!Intrinsics.g(transferStatus.getEmail(), bool));
                bzi bziVar12 = opj0Var.b0;
                if (bziVar12 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                TextView textView8 = bziVar12.A;
                Drawable drawableA5 = iwh0.a(opj0Var.requireContext(), R.drawable.icon_email, color);
                boolean zG3 = Intrinsics.g(transferStatus.getEmail(), bool);
                bzi bziVar13 = opj0Var.b0;
                if (zG3) {
                    if (bziVar13 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    TextView textView9 = bziVar13.A;
                    textView9.setTag(textView9.getId(), new Integer(R.drawable.transfer_verify_check));
                } else {
                    if (bziVar13 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    TextView textView10 = bziVar13.A;
                    textView10.setTag(textView10.getId(), new Integer(R.drawable.ic_keyboard_arrow_right_black_24dp));
                    drawableA = drawableA2;
                }
                textView8.setCompoundDrawablesWithIntrinsicBounds(drawableA5, (Drawable) null, drawableA, (Drawable) null);
            } else {
                if (!Intrinsics.g(csg0VarA, csg0.a.a)) {
                    uhc.a();
                    return null;
                }
                bzi bziVar14 = opj0Var.b0;
                if (bziVar14 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                bziVar14.y.setVisibility(0);
                bzi bziVar15 = opj0Var.b0;
                if (bziVar15 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                bziVar15.M.setVisibility(8);
            }
            bzi bziVar16 = opj0Var.b0;
            if (bziVar16 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            SimpleDescriptionListView simpleDescriptionListView = bziVar16.z;
            psm psmVar = opj0Var.a0;
            if (psmVar == null) {
                Intrinsics.n("countryManager");
                throw null;
            }
            String strF = psmVar.f();
            String strA = n4d.a(transferStatus.getMaxDailyTransferAmount());
            String strA2 = n4d.a(transferStatus.getMinTransferAmount());
            String strA3 = n4d.a(transferStatus.getMaxTransferAmount());
            Integer maxRecipients = transferStatus.getMaxRecipients();
            String str = (maxRecipients == null || (strValueOf2 = String.valueOf(maxRecipients.intValue())) == null) ? "--" : strValueOf2;
            Integer maxSenders = transferStatus.getMaxSenders();
            simpleDescriptionListView.setDescriptionList(kotlin.collections.a.c(sn5.d(opj0Var, R.string.component_supporter__transfer_rules_tip, strF, strA, strA2, strA3, str, (maxSenders == null || (strValueOf = String.valueOf(maxSenders.intValue())) == null) ? "--" : strValueOf)));
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawTransferFragment$initTradingViewModel$1$2", f = "WithdrawTransferFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<c330, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = opj0.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c330 c330Var, v1b<? super Unit> v1bVar) {
            return ((b) create(c330Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            c330 c330Var = (c330) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            bzi bziVar = opj0.this.b0;
            if (bziVar != null) {
                b330.a(bziVar.L, c330Var);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawTransferFragment$initTradingViewModel$1$3", f = "WithdrawTransferFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<StringUiText, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = opj0.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(StringUiText stringUiText, v1b<? super Unit> v1bVar) {
            return ((c) create(stringUiText, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            StringUiText stringUiText = (StringUiText) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            opj0 opj0Var = opj0.this;
            bzi bziVar = opj0Var.b0;
            if (bziVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView = bziVar.w;
            opj0Var.requireContext().getClass();
            stringUiText.getClass();
            textView.setText(stringUiText.a);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawTransferFragment$initTradingViewModel$1$4", f = "WithdrawTransferFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = opj0.this.new d(v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((d) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            opj0 opj0Var = opj0.this;
            bzi bziVar = opj0Var.b0;
            if (bziVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            Editable text = bziVar.F.getText();
            if (!Intrinsics.g(text != null ? text.toString() : null, str)) {
                bzi bziVar2 = opj0Var.b0;
                if (bziVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                bziVar2.F.setText(str);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawTransferFragment$initTradingViewModel$1$5", f = "WithdrawTransferFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = opj0.this.new e(v1bVar);
            eVar.a = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
            return ((e) create(uiText, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            UiText uiText = (UiText) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            opj0 opj0Var = opj0.this;
            bzi bziVar = opj0Var.b0;
            String string = null;
            if (bziVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ClearEditText clearEditText = bziVar.F;
            if (uiText != null) {
                Context contextRequireContext = opj0Var.requireContext();
                contextRequireContext.getClass();
                string = uiText.e(contextRequireContext).toString();
            }
            clearEditText.setError(string);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawTransferFragment$initTradingViewModel$1$6", f = "WithdrawTransferFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<xyx, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = opj0.this.new f(v1bVar);
            fVar.a = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xyx xyxVar, v1b<? super Unit> v1bVar) {
            return ((f) create(xyxVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            xyx xyxVar = (xyx) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            bzi bziVar = opj0.this.b0;
            if (bziVar != null) {
                ow.b(bziVar.b, xyxVar);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawTransferFragment$initTradingViewModel$1$7", f = "WithdrawTransferFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g gVar = opj0.this.new g(v1bVar);
            gVar.a = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
            return ((g) create(uiText, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            UiText uiText = (UiText) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            opj0 opj0Var = opj0.this;
            bzi bziVar = opj0Var.b0;
            String string = null;
            if (bziVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ClearEditText clearEditText = bziVar.b;
            if (uiText != null) {
                Context contextRequireContext = opj0Var.requireContext();
                contextRequireContext.getClass();
                string = uiText.e(contextRequireContext).toString();
            }
            clearEditText.setError(string);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawTransferFragment$initTradingViewModel$1$8", f = "WithdrawTransferFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<rpj0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public h(v1b<? super h> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h hVar = opj0.this.new h(v1bVar);
            hVar.a = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(rpj0 rpj0Var, v1b<? super Unit> v1bVar) {
            return ((h) create(rpj0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y200 y200Var;
            PopupWindow popupWindow;
            rpj0 rpj0Var = (rpj0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = rpj0Var instanceof rpj0.c;
            Object obj2 = null;
            final opj0 opj0Var = opj0.this;
            if (z) {
                List<RecipientData> list = ((rpj0.c) rpj0Var).a;
                Context context = opj0Var.getContext();
                if (context != null && !list.isEmpty() && ((popupWindow = opj0Var.d0) == null || !popupWindow.isShowing())) {
                    LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(context);
                    linearLayoutCompat.setOrientation(1);
                    linearLayoutCompat.setBackgroundResource(R.drawable.bg_gray_transfer);
                    linearLayoutCompat.setOnTouchListener(new View.OnTouchListener() { // from class: bpj0
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            PopupWindow popupWindow2;
                            opj0 opj0Var2 = opj0Var;
                            PopupWindow popupWindow3 = opj0Var2.d0;
                            if (popupWindow3 == null || !popupWindow3.isShowing() || (popupWindow2 = opj0Var2.d0) == null) {
                                return false;
                            }
                            popupWindow2.dismiss();
                            return false;
                        }
                    });
                    linearLayoutCompat.setTag(linearLayoutCompat.getId(), "recipientListDropdown");
                    for (final RecipientData recipientData : list) {
                        View viewInflate = opj0Var.getLayoutInflater().inflate(R.layout.transfer_recipient_item, (ViewGroup) linearLayoutCompat, false);
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        int i = R.id.phone;
                        TextView textView = (TextView) h5e.a(R.id.phone, viewInflate);
                        if (textView != null) {
                            i = R.id.prefix;
                            TextView textView2 = (TextView) h5e.a(R.id.prefix, viewInflate);
                            if (textView2 != null) {
                                psm psmVar = opj0Var.a0;
                                if (psmVar == null) {
                                    Intrinsics.n("countryManager");
                                    throw null;
                                }
                                textView2.setText(psmVar.M());
                                textView.setText(recipientData.phone);
                                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: cpj0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        opj0 opj0Var2 = opj0Var;
                                        hqj0 hqj0VarP0 = opj0Var2.P0();
                                        String str = recipientData.phone;
                                        if (str != null) {
                                            wwd0 wwd0Var = hqj0VarP0.q0;
                                            wwd0Var.getClass();
                                            wwd0Var.k(null, str);
                                        }
                                        PopupWindow popupWindow2 = opj0Var2.d0;
                                        if (popupWindow2 != null) {
                                            popupWindow2.dismiss();
                                        }
                                    }
                                });
                                linearLayoutCompat.addView(linearLayout);
                            }
                        }
                        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                        return null;
                    }
                    bzi bziVar = opj0Var.b0;
                    if (bziVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    PopupWindow popupWindow2 = new PopupWindow((View) linearLayoutCompat, bziVar.E.getWidth(), -2, false);
                    opj0Var.d0 = popupWindow2;
                    popupWindow2.setTouchInterceptor(new View.OnTouchListener() { // from class: dpj0
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            int action = motionEvent.getAction();
                            bzi bziVar2 = opj0Var.b0;
                            if (action == 4) {
                                if (bziVar2 != null) {
                                    return bziVar2.F.isFocused();
                                }
                                Intrinsics.n("binding");
                                throw null;
                            }
                            if (bziVar2 != null) {
                                return !bziVar2.F.isFocused();
                            }
                            Intrinsics.n("binding");
                            throw null;
                        }
                    });
                    PopupWindow popupWindow3 = opj0Var.d0;
                    if (popupWindow3 != null) {
                        popupWindow3.setOutsideTouchable(true);
                    }
                    int[] iArr = new int[2];
                    bzi bziVar2 = opj0Var.b0;
                    if (bziVar2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    bziVar2.E.getLocationOnScreen(iArr);
                    PopupWindow popupWindow4 = opj0Var.d0;
                    if (popupWindow4 != null) {
                        bzi bziVar3 = opj0Var.b0;
                        if (bziVar3 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        FrameLayout frameLayout = bziVar3.E;
                        popupWindow4.showAtLocation(frameLayout, 0, iArr[0], frameLayout.getHeight() + iArr[1] + 2);
                    }
                }
            } else if (rpj0Var instanceof rpj0.d) {
                sn5.d(opj0Var, R.string.component_supporter__confirm_to_transfer, new Object[0]);
                String strD = sn5.d(opj0Var, R.string.common_functions__confirm, new Object[0]);
                String strD2 = sn5.d(opj0Var, R.string.common_functions__cancel, new Object[0]);
                rpj0.d dVar = (rpj0.d) rpj0Var;
                String strA = lx5.a("+", dVar.a, " ", dVar.b);
                String strA2 = n4d.a(dVar.c);
                ppj0 ppj0Var = new ppj0(opj0Var);
                cua cuaVar = new cua();
                cuaVar.c = strA;
                cuaVar.d = strA2;
                cuaVar.a = strD;
                cuaVar.b = strD2;
                cuaVar.e = ppj0Var;
                cuaVar.show(opj0Var.getParentFragmentManager(), cua.class.getSimpleName());
            } else if (rpj0Var instanceof rpj0.b) {
                opj0Var.e0 = ((rpj0.b) rpj0Var).a;
                ee<Void> eeVar = opj0Var.h0;
                if (eeVar == null) {
                    Intrinsics.n("setTransferBvnLauncher");
                    throw null;
                }
                eeVar.b(null);
            } else if (rpj0Var instanceof rpj0.a) {
                opj0Var.f0 = ((rpj0.a) rpj0Var).a;
                ee<Intent> eeVar2 = opj0Var.i0;
                if (eeVar2 == null) {
                    Intrinsics.n("setEmailLauncher");
                    throw null;
                }
                opj0Var.z0();
                androidx.fragment.app.e eVarRequireActivity = opj0Var.requireActivity();
                eVarRequireActivity.getClass();
                Intent intent = new Intent(eVarRequireActivity, (Class<?>) ChangeUserInfoActivity.class);
                intent.putExtra("title_property", 6);
                eeVar2.b(intent);
            } else if (Intrinsics.g(rpj0Var, rpj0.e.a)) {
                e400 e400VarY0 = opj0Var.y0();
                z200 value = e400VarY0.x1().getValue();
                if (value != null && (y200Var = (y200) e400VarY0.v.getValue()) != null) {
                    for (Object obj3 : value.a) {
                        if (!Intrinsics.g((y200) obj3, y200Var)) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    y200 y200Var2 = (y200) obj2;
                    if (y200Var2 != null) {
                        e400VarY0.z1(y200Var2);
                    }
                }
            } else {
                if (!(rpj0Var instanceof rpj0.f)) {
                    uhc.a();
                    return null;
                }
                rpj0.f fVar = (rpj0.f) rpj0Var;
                opj0Var.g0 = fVar.b;
                ee<e0i0> eeVar3 = opj0Var.j0;
                if (eeVar3 == null) {
                    Intrinsics.n("verifyOtpForEnableTransferLauncher");
                    throw null;
                }
                eeVar3.b(new e0i0(fVar.a));
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawTransferFragment$initTradingViewModel$1$9", f = "WithdrawTransferFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends tje0 implements Function2<c330, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public i(v1b<? super i> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            i iVar = opj0.this.new i(v1bVar);
            iVar.a = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c330 c330Var, v1b<? super Unit> v1bVar) {
            return ((i) create(c330Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            c330 c330Var = (c330) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            bzi bziVar = opj0.this.b0;
            if (bziVar != null) {
                b330.a(bziVar.H, c330Var);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawTransferFragment$initTradingViewModel$2", f = "WithdrawTransferFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j extends tje0 implements Function2<y200, v1b<? super Unit>, Object> {
        public j(v1b<? super j> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return opj0.this.new j(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(y200 y200Var, v1b<? super Unit> v1bVar) {
            return ((j) create(y200Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            PopupWindow popupWindow;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            opj0 opj0Var = opj0.this;
            PopupWindow popupWindow2 = opj0Var.d0;
            if (popupWindow2 != null && popupWindow2.isShowing() && (popupWindow = opj0Var.d0) != null) {
                popupWindow.dismiss();
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class k extends qlr implements Function0<v8i0> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return opj0.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class l extends qlr implements Function0<cyb> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return opj0.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class m extends qlr implements Function0<r8i0.c> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return opj0.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public opj0() {
        super(R.layout.fragment_withdraw_transfer);
        this.Y = false;
        this.Z = false;
        this.c0 = new q8i0(jq40.a(hqj0.class), new k(), new m(), new l());
    }

    @Override // defpackage.s62
    public final HintView D0() {
        return null;
    }

    @Override // defpackage.s62
    public final FrameLayout E0() {
        bzi bziVar = this.b0;
        if (bziVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = bziVar.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final SwipeRefreshLayout G0() {
        bzi bziVar = this.b0;
        if (bziVar != null) {
            return bziVar.J;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82, defpackage.s62
    public final void K0() {
        super.K0();
        hqj0 hqj0VarP0 = P0();
        g1i g1iVar = new g1i(hqj0VarP0.A0, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(hqj0VarP0.o0, new b(null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        g1i g1iVar3 = new g1i(hqj0VarP0.C0, new c(null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar3, lifecycle3, bVar);
        g1i g1iVar4 = new g1i(hqj0VarP0.r0, new d(null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar4, lifecycle4, bVar);
        g1i g1iVar5 = new g1i(hqj0VarP0.t0, new e(null));
        s9s lifecycle5 = getLifecycle();
        lifecycle5.getClass();
        arr.a(g1iVar5, lifecycle5, bVar);
        g1i g1iVar6 = new g1i(hqj0VarP0.T, new f(null));
        s9s lifecycle6 = getLifecycle();
        lifecycle6.getClass();
        arr.a(g1iVar6, lifecycle6, bVar);
        g1i g1iVar7 = new g1i(hqj0VarP0.v0, new g(null));
        s9s lifecycle7 = getLifecycle();
        lifecycle7.getClass();
        arr.a(g1iVar7, lifecycle7, bVar);
        g1i g1iVar8 = new g1i(hqj0VarP0.y0, new h(null));
        s9s lifecycle8 = getLifecycle();
        lifecycle8.getClass();
        arr.a(g1iVar8, lifecycle8, bVar);
        g1i g1iVar9 = new g1i(hqj0VarP0.m0, new i(null));
        s9s lifecycle9 = getLifecycle();
        lifecycle9.getClass();
        arr.a(g1iVar9, lifecycle9, bVar);
        g1i g1iVar10 = new g1i(y0().v, new j(null));
        s9s lifecycle10 = getLifecycle();
        lifecycle10.getClass();
        arr.a(g1iVar10, lifecycle10, bVar);
    }

    @Override // defpackage.j82, defpackage.s62
    public final void L0() {
        super.L0();
        bzi bziVar = this.b0;
        if (bziVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r910.b(bziVar.C);
        bzi bziVar2 = this.b0;
        if (bziVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView = bziVar2.I;
        psm psmVar = this.a0;
        if (psmVar == null) {
            Intrinsics.n("countryManager");
            throw null;
        }
        textView.setText(psmVar.M());
        bzi bziVar3 = this.b0;
        if (bziVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bziVar3.F.setErrorView(bziVar3.G);
        bzi bziVar4 = this.b0;
        if (bziVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bziVar4.F.setTextChangedListener(new ClearEditText.b() { // from class: fpj0
            @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
            public final void l(CharSequence charSequence) {
                String string = StringsKt.t0(charSequence.toString()).toString();
                hqj0 hqj0VarP0 = this.a.P0();
                string.getClass();
                wwd0 wwd0Var = hqj0VarP0.q0;
                wwd0Var.getClass();
                wwd0Var.k(null, string);
                hqj0VarP0.s0.setValue(null);
            }
        });
        bzi bziVar5 = this.b0;
        if (bziVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bziVar5.b.setErrorView(bziVar5.d);
        bzi bziVar6 = this.b0;
        if (bziVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bziVar6.F.setOnTouchListener(new View.OnTouchListener() { // from class: gpj0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                hqj0 hqj0VarP0 = this.a.P0();
                List list = (List) hqj0VarP0.B0.a.getValue();
                if (list.isEmpty()) {
                    return false;
                }
                hqj0VarP0.x0.a(new rpj0.c(list));
                return false;
            }
        });
        bzi bziVar7 = this.b0;
        if (bziVar7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bziVar7.K.setOnTouchListener(new View.OnTouchListener() { // from class: hpj0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                PopupWindow popupWindow;
                opj0 opj0Var = this.a;
                PopupWindow popupWindow2 = opj0Var.d0;
                if (popupWindow2 == null || !popupWindow2.isShowing() || (popupWindow = opj0Var.d0) == null) {
                    return false;
                }
                popupWindow.dismiss();
                return false;
            }
        });
        bzi bziVar8 = this.b0;
        if (bziVar8 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bziVar8.H.setOnClickListener(new View.OnClickListener() { // from class: ipj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                opj0 opj0Var = this.a;
                bzi bziVar9 = opj0Var.b0;
                if (bziVar9 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                lop.b(bziVar9.b, Boolean.FALSE);
                hqj0 hqj0VarP0 = opj0Var.P0();
                ej5.c(o8i0.d(hqj0VarP0), null, null, new tpj0(hqj0VarP0, null), 3);
            }
        });
        bzi bziVar9 = this.b0;
        if (bziVar9 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bziVar9.M.setOnClickListener(new jpj0());
        bzi bziVar10 = this.b0;
        if (bziVar10 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bziVar10.v.setOnClickListener(new View.OnClickListener() { // from class: kpj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hqj0 hqj0VarP0 = this.a.P0();
                ej5.c(o8i0.d(hqj0VarP0), null, null, new ypj0(hqj0VarP0, null), 3);
            }
        });
        bzi bziVar11 = this.b0;
        if (bziVar11 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bziVar11.S.setOnClickListener(new View.OnClickListener() { // from class: lpj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hqj0 hqj0VarP0 = this.a.P0();
                ej5.c(o8i0.d(hqj0VarP0), null, null, new xpj0(hqj0VarP0, null), 3);
            }
        });
        bzi bziVar12 = this.b0;
        if (bziVar12 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bziVar12.A.setOnClickListener(new View.OnClickListener() { // from class: mpj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hqj0 hqj0VarP0 = this.a.P0();
                ej5.c(o8i0.d(hqj0VarP0), null, null, new wpj0(hqj0VarP0, null), 3);
            }
        });
        bzi bziVar13 = this.b0;
        if (bziVar13 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bziVar13.L.setOnClickListener(new View.OnClickListener() { // from class: apj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hqj0 hqj0VarP0 = this.a.P0();
                ej5.c(o8i0.d(hqj0VarP0), null, null, new upj0(hqj0VarP0, null), 3);
            }
        });
        bzi bziVar14 = this.b0;
        if (bziVar14 != null) {
            bziVar14.y.setOnClickListener(new jpj0());
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // defpackage.j82
    public final TextView O0() {
        bzi bziVar = this.b0;
        if (bziVar != null) {
            return bziVar.N;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82
    public final TextView P0() {
        bzi bziVar = this.b0;
        if (bziVar != null) {
            return bziVar.P;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82
    public final View R0() {
        bzi bziVar = this.b0;
        if (bziVar != null) {
            return bziVar.R;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final hqj0 P0() {
        return (hqj0) this.c0.getValue();
    }

    @Override // defpackage.s62
    public final List<ClearEditText> m0() {
        bzi bziVar = this.b0;
        if (bziVar != null) {
            return kotlin.collections.a.c(bziVar.b);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> n0() {
        bzi bziVar = this.b0;
        if (bziVar != null) {
            return kotlin.collections.a.c(bziVar.c);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout o0() {
        bzi bziVar = this.b0;
        if (bziVar != null) {
            return bziVar.e;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0();
        TransferBvnActivity.a aVar = TransferBvnActivity.A;
        aVar.getClass();
        ee<Void> eeVarRegisterForActivityResult = registerForActivityResult(aVar, new ud() { // from class: zoj0
            @Override // defpackage.ud
            public final void a(Object obj) {
                bc6 bc6Var = this.a.e0;
                if (bc6Var != null) {
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar2 = zi50.b;
                        bc6Var.resumeWith(null);
                    } else {
                        itf0.a aVar3 = itf0.a;
                        aVar3.q(MyLog.TAG_COMMON);
                        aVar3.n("Continuation not active, resume not perform.", new Object[0]);
                    }
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.h0 = eeVarRegisterForActivityResult;
        ee<Intent> eeVarRegisterForActivityResult2 = registerForActivityResult(new f67(), new npj0(this));
        eeVarRegisterForActivityResult2.getClass();
        this.i0 = eeVarRegisterForActivityResult2;
        C0();
        TransferPinActivity.a aVar2 = TransferPinActivity.C;
        aVar2.getClass();
        ee<e0i0> eeVarRegisterForActivityResult3 = registerForActivityResult(aVar2, new ud() { // from class: epj0
            @Override // defpackage.ud
            public final void a(Object obj) {
                bc6 bc6Var = this.a.g0;
                if (bc6Var != null) {
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar3 = zi50.b;
                        bc6Var.resumeWith(null);
                    } else {
                        itf0.a aVar4 = itf0.a;
                        aVar4.q(MyLog.TAG_COMMON);
                        aVar4.n("Continuation not active, resume not perform.", new Object[0]);
                    }
                }
            }
        });
        eeVarRegisterForActivityResult3.getClass();
        this.j0 = eeVarRegisterForActivityResult3;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_withdraw_transfer, viewGroup, false);
        int i2 = R.id.amount;
        ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.amount, viewInflate);
        if (clearEditText != null) {
            i2 = R.id.amount_container;
            if (((FrameLayout) h5e.a(R.id.amount_container, viewInflate)) != null) {
                i2 = R.id.amount_label;
                TextView textView = (TextView) h5e.a(R.id.amount_label, viewInflate);
                if (textView != null) {
                    i2 = R.id.amount_warning;
                    TextView textView2 = (TextView) h5e.a(R.id.amount_warning, viewInflate);
                    if (textView2 != null) {
                        i2 = R.id.anti_interaction_mask;
                        FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.anti_interaction_mask, viewInflate);
                        if (frameLayout != null) {
                            i2 = R.id.balance;
                            TextView textView3 = (TextView) h5e.a(R.id.balance, viewInflate);
                            if (textView3 != null) {
                                i2 = R.id.balance_label;
                                TextView textView4 = (TextView) h5e.a(R.id.balance_label, viewInflate);
                                if (textView4 != null) {
                                    i2 = R.id.bvn_entrance;
                                    TextView textView5 = (TextView) h5e.a(R.id.bvn_entrance, viewInflate);
                                    if (textView5 != null) {
                                        i2 = R.id.cool_down_timer_text_view;
                                        TextView textView6 = (TextView) h5e.a(R.id.cool_down_timer_text_view, viewInflate);
                                        if (textView6 != null) {
                                            i2 = R.id.cool_down_view;
                                            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.cool_down_view, viewInflate);
                                            if (linearLayout != null) {
                                                i2 = R.id.description_list_view;
                                                SimpleDescriptionListView simpleDescriptionListView = (SimpleDescriptionListView) h5e.a(R.id.description_list_view, viewInflate);
                                                if (simpleDescriptionListView != null) {
                                                    i2 = R.id.email_entrance;
                                                    TextView textView7 = (TextView) h5e.a(R.id.email_entrance, viewInflate);
                                                    if (textView7 != null) {
                                                        i2 = R.id.init_failed_mask;
                                                        LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.init_failed_mask, viewInflate);
                                                        if (loadingViewNew != null) {
                                                            i2 = R.id.init_mask;
                                                            ComposeView composeView = (ComposeView) h5e.a(R.id.init_mask, viewInflate);
                                                            if (composeView != null) {
                                                                i2 = R.id.loading_mask;
                                                                LoadingViewNew loadingViewNew2 = (LoadingViewNew) h5e.a(R.id.loading_mask, viewInflate);
                                                                if (loadingViewNew2 != null) {
                                                                    i2 = R.id.mobile_container;
                                                                    FrameLayout frameLayout2 = (FrameLayout) h5e.a(R.id.mobile_container, viewInflate);
                                                                    if (frameLayout2 != null) {
                                                                        i2 = R.id.mobile_number;
                                                                        ClearEditText clearEditText2 = (ClearEditText) h5e.a(R.id.mobile_number, viewInflate);
                                                                        if (clearEditText2 != null) {
                                                                            i2 = R.id.mobile_number_warning;
                                                                            TextView textView8 = (TextView) h5e.a(R.id.mobile_number_warning, viewInflate);
                                                                            if (textView8 != null) {
                                                                                i2 = R.id.mobile_tint;
                                                                                if (((TextView) h5e.a(R.id.mobile_tint, viewInflate)) != null) {
                                                                                    i2 = R.id.next;
                                                                                    ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, viewInflate);
                                                                                    if (progressButton != null) {
                                                                                        i2 = R.id.prefix;
                                                                                        TextView textView9 = (TextView) h5e.a(R.id.prefix, viewInflate);
                                                                                        if (textView9 != null) {
                                                                                            i2 = R.id.swipe;
                                                                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe, viewInflate);
                                                                                            if (swipeRefreshLayout != null) {
                                                                                                i2 = R.id.transfer_content_view;
                                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.transfer_content_view, viewInflate);
                                                                                                if (constraintLayout != null) {
                                                                                                    i2 = R.id.transfer_verifying_enable_button;
                                                                                                    ProgressButton progressButton2 = (ProgressButton) h5e.a(R.id.transfer_verifying_enable_button, viewInflate);
                                                                                                    if (progressButton2 != null) {
                                                                                                        i2 = R.id.transfer_verifying_view;
                                                                                                        LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.transfer_verifying_view, viewInflate);
                                                                                                        if (linearLayout2 != null) {
                                                                                                            i2 = R.id.wh_tax_description;
                                                                                                            TextView textView10 = (TextView) h5e.a(R.id.wh_tax_description, viewInflate);
                                                                                                            if (textView10 != null) {
                                                                                                                i2 = R.id.withdraw_banner;
                                                                                                                AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) h5e.a(R.id.withdraw_banner, viewInflate);
                                                                                                                if (aspectRatioImageView != null) {
                                                                                                                    i2 = R.id.withdrawable_balance;
                                                                                                                    TextView textView11 = (TextView) h5e.a(R.id.withdrawable_balance, viewInflate);
                                                                                                                    if (textView11 != null) {
                                                                                                                        i2 = R.id.withdrawable_balance_label;
                                                                                                                        TextView textView12 = (TextView) h5e.a(R.id.withdrawable_balance_label, viewInflate);
                                                                                                                        if (textView12 != null) {
                                                                                                                            i2 = R.id.withdrawable_help;
                                                                                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.withdrawable_help, viewInflate);
                                                                                                                            if (appCompatImageView != null) {
                                                                                                                                i2 = R.id.withdrawal_pin_entrance;
                                                                                                                                TextView textView13 = (TextView) h5e.a(R.id.withdrawal_pin_entrance, viewInflate);
                                                                                                                                if (textView13 != null) {
                                                                                                                                    FrameLayout frameLayout3 = (FrameLayout) viewInflate;
                                                                                                                                    this.b0 = new bzi(frameLayout3, clearEditText, textView, textView2, frameLayout, textView3, textView4, textView5, textView6, linearLayout, simpleDescriptionListView, textView7, loadingViewNew, composeView, loadingViewNew2, frameLayout2, clearEditText2, textView8, progressButton, textView9, swipeRefreshLayout, constraintLayout, progressButton2, linearLayout2, textView10, aspectRatioImageView, textView11, textView12, appCompatImageView, textView13);
                                                                                                                                    frameLayout3.getClass();
                                                                                                                                    return frameLayout3;
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
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        hqj0 hqj0VarP0 = P0();
        TransferStatus transferStatus = (TransferStatus) P0().A0.a.getValue();
        transferStatus.getClass();
        ej5.c(o8i0.d(hqj0VarP0), null, null, new spj0(transferStatus, hqj0VarP0, null), 3);
    }

    @Override // defpackage.s62
    public final List<TextView> p0() {
        bzi bziVar = this.b0;
        if (bziVar != null) {
            return kotlin.collections.a.c(bziVar.i);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> q0() {
        bzi bziVar = this.b0;
        if (bziVar != null) {
            return kotlin.collections.a.c(bziVar.f);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final AspectRatioImageView r0() {
        bzi bziVar = this.b0;
        if (bziVar != null) {
            return bziVar.O;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final SimpleDescriptionListView t0() {
        bzi bziVar = this.b0;
        if (bziVar != null) {
            return bziVar.z;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew u0() {
        bzi bziVar = this.b0;
        if (bziVar != null) {
            return bziVar.B;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final ComposeView v0() {
        bzi bziVar = this.b0;
        if (bziVar != null) {
            return bziVar.C;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew w0() {
        bzi bziVar = this.b0;
        if (bziVar != null) {
            return bziVar.D;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82
    public final TextView Q0() {
        bzi bziVar = this.b0;
        if (bziVar != null) {
            return bziVar.Q;
        }
        Intrinsics.n(rarBonoqWB.ExQfVZQCEUnZeo);
        throw null;
    }
}
