package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sporty.android.common_ui.widgets.CashOutLoadingButton;
import com.sporty.android.core.model.cashout.AutoCashOut;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Bet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final class dhd0 {

    @c0d(c = "com.sportybet.android.cashoutphase3.viewholder.SprCashOutMatchBriefPhase3ComposeViewKt$SprCashOutMatchBriefPhase3ComposeView$1$1", f = "SprCashOutMatchBriefPhase3ComposeView.kt", l = {48}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public ytw a;
        public int b;
        public final /* synthetic */ hwu c;
        public final /* synthetic */ xo6 d;
        public final /* synthetic */ Context e;
        public final /* synthetic */ ytw<yl6> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hwu hwuVar, xo6 xo6Var, Context context, ytw<yl6> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = hwuVar;
            this.d = xo6Var;
            this.e = context;
            this.f = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ytw<yl6> ytwVar;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                ytw<yl6> ytwVar2 = this.f;
                this.a = ytwVar2;
                this.b = 1;
                pfd pfdVar = fse.a;
                Object objD = ej5.d(odd.b, new ehd0(this.c, this.e, this.d, null), this);
                if (objD == y5bVar) {
                    return y5bVar;
                }
                obj = objD;
                ytwVar = ytwVar2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ytwVar = this.a;
                uj50.b(obj);
            }
            ytwVar.setValue((yl6) obj);
            return Unit.a;
        }
    }

    public static final void a(final d dVar, final Function1<? super xgd0, Unit> function1, final hwu hwuVar, final yl6 yl6Var, final bi6 bi6Var, final xo6 xo6Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-1983945444);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(hwuVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(yl6Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? bVarI.M(bi6Var) : bVarI.A(bi6Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & 262144) == 0 ? bVarI.M(xo6Var) : bVarI.A(xo6Var) ? 131072 : 65536;
        }
        boolean z = false;
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            boolean z2 = (i2 & 112) == 32;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = new gaj() { // from class: zgd0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        LayoutInflater layoutInflater = (LayoutInflater) obj;
                        ViewGroup viewGroup = (ViewGroup) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        layoutInflater.getClass();
                        viewGroup.getClass();
                        View viewInflate = layoutInflater.inflate(R.layout.spr_cash_out_match_brief_phase_3, viewGroup, false);
                        if (zBooleanValue) {
                            viewGroup.addView(viewInflate);
                        }
                        int i3 = R.id.auto_cashout_info_container;
                        View viewA = h5e.a(R.id.auto_cashout_info_container, viewInflate);
                        if (viewA != null) {
                            i3 = R.id.auto_cashout_status;
                            TextView textView = (TextView) h5e.a(R.id.auto_cashout_status, viewInflate);
                            if (textView != null) {
                                i3 = R.id.auto_cashout_status_icon;
                                ImageView imageView = (ImageView) h5e.a(R.id.auto_cashout_status_icon, viewInflate);
                                if (imageView != null) {
                                    i3 = R.id.bottom_spacer;
                                    if (((Space) h5e.a(R.id.bottom_spacer, viewInflate)) != null) {
                                        i3 = R.id.cash_out;
                                        CashOutLoadingButton cashOutLoadingButton = (CashOutLoadingButton) h5e.a(R.id.cash_out, viewInflate);
                                        if (cashOutLoadingButton != null) {
                                            i3 = R.id.fallback_text;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.fallback_text, viewInflate);
                                            if (appCompatTextView != null) {
                                                i3 = R.id.fallback_tip_mark;
                                                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.fallback_tip_mark, viewInflate);
                                                if (appCompatImageView != null) {
                                                    i3 = R.id.group_auto_cashout;
                                                    Group group = (Group) h5e.a(R.id.group_auto_cashout, viewInflate);
                                                    if (group != null) {
                                                        i3 = R.id.no_cashout_reason;
                                                        TextView textView2 = (TextView) h5e.a(R.id.no_cashout_reason, viewInflate);
                                                        if (textView2 != null) {
                                                            i3 = R.id.note_container;
                                                            ComposeView composeView = (ComposeView) h5e.a(R.id.note_container, viewInflate);
                                                            if (composeView != null) {
                                                                i3 = R.id.stake;
                                                                TextView textView3 = (TextView) h5e.a(R.id.stake, viewInflate);
                                                                if (textView3 != null) {
                                                                    i3 = R.id.teams;
                                                                    TextView textView4 = (TextView) h5e.a(R.id.teams, viewInflate);
                                                                    if (textView4 != null) {
                                                                        i3 = R.id.view_detail;
                                                                        TextView textView5 = (TextView) h5e.a(R.id.view_detail, viewInflate);
                                                                        if (textView5 != null) {
                                                                            xgd0 xgd0Var = new xgd0((ConstraintLayout) viewInflate, viewA, textView, imageView, cashOutLoadingButton, appCompatTextView, appCompatImageView, group, textView2, composeView, textView3, textView4, textView5);
                                                                            function1.invoke(xgd0Var);
                                                                            return xgd0Var;
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
                        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                        return null;
                    }
                };
                bVarI.r(objY);
            }
            gaj gajVar = (gaj) objY;
            boolean z3 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((458752 & i2) == 131072 || ((i2 & 262144) != 0 && bVarI.A(xo6Var)));
            if ((57344 & i2) == 16384 || ((i2 & 32768) != 0 && bVarI.A(bi6Var))) {
                z = true;
            }
            boolean z4 = z3 | z;
            Object objY2 = bVarI.y();
            if (z4 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: ahd0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str;
                        String str2;
                        xgd0 xgd0Var = (xgd0) obj;
                        xgd0Var.getClass();
                        ComposeView composeView = xgd0Var.y;
                        final pl6 pl6Var = hwuVar.a;
                        if (pl6Var == null) {
                            return Unit.a;
                        }
                        ConstraintLayout constraintLayout = xgd0Var.a;
                        Group group = xgd0Var.v;
                        TextView textView = xgd0Var.c;
                        ImageView imageView = xgd0Var.d;
                        TextView textView2 = xgd0Var.w;
                        CashOutLoadingButton cashOutLoadingButton = xgd0Var.e;
                        constraintLayout.setTag(pl6Var);
                        cashOutLoadingButton.setTag(pl6Var);
                        xgd0Var.B.setTag(pl6Var);
                        TextView textView3 = xgd0Var.A;
                        yl6 yl6Var2 = yl6Var;
                        textView3.setText(yl6Var2.a);
                        xgd0Var.z.setText(yl6Var2.b);
                        boolean z5 = pl6Var.a.isFallbackCashOut && !pl6Var.v;
                        xgd0Var.f.setVisibility(z5 ? 0 : 8);
                        xgd0Var.i.setVisibility(z5 ? 0 : 8);
                        Bet bet = pl6Var.a;
                        String strP = ((bet.isCalcByFE ? bet.isCashAbleJS : bet.isCashable) || (str = bet.notCashableReason) == null || StringsKt.U(str) || (str2 = bet.notCashableReason) == null) ? null : c.p(str2, ".", "", false);
                        if (strP != null) {
                            textView2.setVisibility(0);
                            textView2.setText(strP);
                        } else {
                            textView2.setVisibility(8);
                        }
                        String str3 = yl6Var2.d;
                        if (str3 != null) {
                            composeView.setVisibility(0);
                            szx.b(composeView, str3, yl6Var2.c, e0y.OpenBetsCollapsed, null);
                            zi50.a aVar2 = zi50.b;
                        } else {
                            composeView.setVisibility(8);
                        }
                        mn6 mn6Var = yl6Var2.e;
                        if (mn6Var instanceof mn6.a) {
                            mn6.a aVar3 = (mn6.a) mn6Var;
                            Boolean bool = aVar3.c;
                            String str4 = aVar3.b;
                            String str5 = aVar3.a;
                            if (aVar3.d) {
                                cashOutLoadingButton.setCashOutTextWithBg(str5, str4);
                            } else {
                                cashOutLoadingButton.setCashOutText(str5, str4);
                            }
                            boolean z6 = aVar3.e;
                            final bi6 bi6Var2 = bi6Var;
                            if (z6) {
                                cashOutLoadingButton.setDisabledStyleClickable(xo6Var.u, new m0o(1, bi6Var2, pl6Var));
                            } else {
                                cashOutLoadingButton.setEnabled(bool.booleanValue());
                                cashOutLoadingButton.setBtnClickedShowPopupListener(new Function0() { // from class: chd0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        bi6 bi6Var3 = bi6Var2;
                                        if (bi6Var3 != null) {
                                            pl6 pl6Var2 = pl6Var;
                                            pl6Var2.getClass();
                                            bi6Var3.a.i(pl6Var2, false);
                                        }
                                        return Unit.a;
                                    }
                                });
                            }
                            cashOutLoadingButton.setVisibility(0);
                        } else {
                            if (!Intrinsics.g(mn6Var, mn6.b.a)) {
                                uhc.a();
                                return null;
                            }
                            cashOutLoadingButton.setEnabled(false);
                            cashOutLoadingButton.setVisibility(8);
                        }
                        AutoCashOut autoCashOut = pl6Var.b;
                        if (autoCashOut != null) {
                            if (autoCashOut.isAutoCashoutSuccessful()) {
                                imageView.setVisibility(8);
                                sn5.f(textView, R.string.cashout__auto_cashout_successful, new Object[0]);
                            } else {
                                imageView.setVisibility(0);
                                sn5.f(textView, R.string.bet_history__auto_cashout_rule_is_on, new Object[0]);
                            }
                            group.setVisibility(0);
                        } else {
                            imageView.setVisibility(8);
                            group.setVisibility(8);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            id0.a(gajVar, dVar, (Function1) objY2, bVarI, (i2 << 3) & 112);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: bhd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dhd0.a(dVar, function1, hwuVar, yl6Var, bi6Var, xo6Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final hwu hwuVar, final xo6 xo6Var, final bi6 bi6Var, final Function1<? super xgd0, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        ytw ytwVar;
        hwuVar.getClass();
        xo6Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(1035871764);
        int i2 = i | (bVarI.M(hwuVar) ? 4 : 2) | (bVarI.A(xo6Var) ? 32 : 16) | (bVarI.M(bi6Var) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(new yl6(null, null, null, null, null, 63));
                bVarI.r(objY);
            }
            ytw ytwVar2 = (ytw) objY;
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            boolean zA = ((i2 & 14) == 4) | ((i2 & 112) == 32 || bVarI.A(xo6Var)) | bVarI.A(context);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                ytwVar = ytwVar2;
                a aVar2 = new a(hwuVar, xo6Var, context, ytwVar, null);
                bVarI.r(aVar2);
                objY2 = aVar2;
            } else {
                ytwVar = ytwVar2;
            }
            xvf.e(bVarI, hwuVar, (Function2) objY2);
            d dVarG = j.g(d.a.b, 1.0f);
            yl6 yl6Var = (yl6) ytwVar.getValue();
            int i3 = i2 << 6;
            a(dVarG, function1, hwuVar, yl6Var, bi6Var, xo6Var, bVarI, ((i2 >> 6) & 112) | 6 | (i3 & 896) | (i3 & 57344) | 262144 | ((i2 << 12) & 458752));
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(xo6Var, bi6Var, function1, i) { // from class: ygd0
                public final /* synthetic */ xo6 b;
                public final /* synthetic */ bi6 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(65);
                    dhd0.b(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
