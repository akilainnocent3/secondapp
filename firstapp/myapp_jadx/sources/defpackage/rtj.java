package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rtj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rtj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                ssw<String> sswVar = ((fuj) obj2).f;
                String str = f1e0Var.c;
                if (str == null) {
                    str = "";
                }
                sswVar.j(str);
                return Unit.a;
            case 1:
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                float[] fArrA = t58.a();
                float f = ((aq40) obj2).a;
                t58.b(f, f, f, fArrA);
                b90 b90VarA = c90.a();
                b90VarA.k(new u58(fArrA));
                lc6 lc6VarA = lzaVar.F1().a();
                try {
                    lc6VarA.s(pk40.b(0L, lzaVar.F1().d()), b90VarA);
                    lzaVar.b2();
                    return Unit.a;
                } finally {
                    lc6VarA.f();
                }
            case 2:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                a aVar = (a) obj;
                int i2 = PreMatchEventActivity.a2;
                e eVar = preMatchEventActivity.z;
                if (eVar != null) {
                    eVar.c(aVar, preMatchEventActivity, preMatchEventActivity.findViewById(R.id.root), preMatchEventActivity);
                    return Unit.a;
                }
                Intrinsics.n("commonUiEventProcessor");
                throw null;
            default:
                a1b0 a1b0Var = (a1b0) obj2;
                CampaignTopicResponse campaignTopicResponse = (CampaignTopicResponse) obj;
                boolean z = campaignTopicResponse != null && (Intrinsics.g(campaignTopicResponse.getCampaignStatus(), "ENDED") || (campaignTopicResponse.isLastCampaignTier() && Intrinsics.g(campaignTopicResponse.getUserActivityStatus(), "ACTIVE")));
                float f2 = z ? 0.5f : 0.35f;
                wxi wxiVar = a1b0Var.v;
                TextView textView = wxiVar != null ? wxiVar.X : null;
                TextView textView2 = wxiVar != null ? wxiVar.U : null;
                ViewGroup.LayoutParams layoutParams = textView != null ? textView.getLayoutParams() : null;
                layoutParams.getClass();
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ViewGroup.LayoutParams layoutParams3 = textView2 != null ? textView2.getLayoutParams() : null;
                layoutParams3.getClass();
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams2.R = f2;
                textView.setLayoutParams(layoutParams2);
                layoutParams4.R = f2;
                textView2.setLayoutParams(layoutParams4);
                wxi wxiVar2 = a1b0Var.v;
                if (z) {
                    if (wxiVar2 != null) {
                        wxiVar2.B.setVisibility(8);
                    }
                } else if (wxiVar2 != null) {
                    wxiVar2.B.setVisibility(0);
                }
                return Unit.a;
        }
    }
}
