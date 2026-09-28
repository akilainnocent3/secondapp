package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.presentation.uievent.MultiMakerAddToBetSlipOptionsUiEvent;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgfw;", "Lr02;", "Lk9j;", "Lj9j;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gfw extends cxl implements k9j, j9j {
    public y8j f;
    public rdd0 i;
    public final String v = "MultiMakerRadioDialog";
    public vie w;

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getV() {
        return this.v;
    }

    @Override // defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_add_to_betslip, (ViewGroup) null, false);
        int i = R.id.mm_all_selections_add;
        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) h5e.a(R.id.mm_all_selections_add, viewInflate);
        if (appCompatRadioButton != null) {
            i = R.id.mm_btn_cancel;
            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.mm_btn_cancel, viewInflate);
            if (appCompatTextView != null) {
                i = R.id.mm_btn_ok;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.mm_btn_ok, viewInflate);
                if (appCompatTextView2 != null) {
                    i = R.id.mm_locked_selections_add;
                    AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) h5e.a(R.id.mm_locked_selections_add, viewInflate);
                    if (appCompatRadioButton2 != null) {
                        i = R.id.mm_radio_group;
                        if (((RadioGroup) h5e.a(R.id.mm_radio_group, viewInflate)) != null) {
                            i = R.id.mm_to_betslip_title;
                            if (((TextView) h5e.a(R.id.mm_to_betslip_title, viewInflate)) != null) {
                                this.w = new vie((ConstraintLayout) viewInflate, appCompatRadioButton, appCompatTextView, appCompatTextView2, appCompatRadioButton2);
                                Dialog dialog = new Dialog(requireContext());
                                vie vieVar = this.w;
                                if (vieVar == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                dialog.setContentView(vieVar.a);
                                Window window = dialog.getWindow();
                                if (window != null) {
                                    window.setLayout(Math.min(getResources().getDisplayMetrics().widthPixels, bqe.a(480.0f)), -2);
                                    window.setBackgroundDrawable(new InsetDrawable((Drawable) new ColorDrawable(0), bqe.a(40.0f)));
                                }
                                dialog.setCancelable(false);
                                setCancelable(false);
                                final vie vieVar2 = this.w;
                                if (vieVar2 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                vieVar2.d.setOnClickListener(new View.OnClickListener() { // from class: efw
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_MULTI_MAKER_ADD_TO_BET_SLIP_OPTIONS_DIALOG", vieVar2.b.isChecked() ? MultiMakerAddToBetSlipOptionsUiEvent.AllSelections.a : MultiMakerAddToBetSlipOptionsUiEvent.LockedSelectionsOnly.a));
                                        gfw gfwVar = this.a;
                                        gfwVar.getParentFragmentManager().m0("REQUEST_KET_SHOW_MULTI_MAKER_ADD_TO_BET_SLIP_OPTIONS_DIALOG", bundleA);
                                        gfwVar.dismissAllowingStateLoss();
                                    }
                                });
                                vieVar2.c.setOnClickListener(new b8(this, 1));
                                AppCompatRadioButton appCompatRadioButton3 = vieVar2.e;
                                Bundle arguments = getArguments();
                                appCompatRadioButton3.setEnabled(arguments != null ? arguments.getBoolean("ARG_IS_LOCKED_SELECTIONS_ONLY_OPTION_ENABLED") : false);
                                vie vieVar3 = this.w;
                                if (vieVar3 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                vieVar3.b.setChecked(true);
                                vie vieVar4 = this.w;
                                if (vieVar4 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                rdd0 rdd0Var = this.i;
                                if (rdd0Var == null) {
                                    Intrinsics.n("sportyTrackingUseCase");
                                    throw null;
                                }
                                rdd0Var.a(sfw.a, k00.d);
                                y8j y8jVar = this.f;
                                if (y8jVar == null) {
                                    Intrinsics.n("fullStoryCommonManager");
                                    throw null;
                                }
                                AppCompatTextView appCompatTextView3 = vieVar4.d;
                                tfw.a.getClass();
                                y8jVar.c(appCompatTextView3, tfw.b);
                                y8j y8jVar2 = this.f;
                                if (y8jVar2 == null) {
                                    Intrinsics.n("fullStoryCommonManager");
                                    throw null;
                                }
                                vie vieVar5 = this.w;
                                if (vieVar5 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ConstraintLayout constraintLayout = vieVar5.a;
                                constraintLayout.getClass();
                                y8jVar2.d(constraintLayout, "fs-unmask");
                                return dialog;
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
