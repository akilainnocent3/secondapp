package defpackage;

import com.sportybet.android.multimaker.presentation.widget.view.MultiMakerOddsHeaderView;
import com.sportybet.android.multimaker.presentation.widget.view.MultiMakerOddsRangeSeekBarSelectionOdds;
import com.sportybet.android.multimaker.presentation.widget.view.MultiMakerOddsRangeSeekBarTotalOdds;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.widget.filter.range.OddsRangePopupView$showOddsRangePopup$1", f = "OddsRangePopupView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qky extends tje0 implements Function2<ohw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ sky b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qky(sky skyVar, v1b<? super qky> v1bVar) {
        super(2, v1bVar);
        this.b = skyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qky qkyVar = new qky(this.b, v1bVar);
        qkyVar.a = obj;
        return qkyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ohw ohwVar, v1b<? super Unit> v1bVar) {
        return ((qky) create(ohwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ohw ohwVar = (ohw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        pid0 pid0Var = this.b.b;
        MultiMakerOddsHeaderView multiMakerOddsHeaderView = pid0Var.d;
        MultiMakerOddsRangeSeekBarSelectionOdds multiMakerOddsRangeSeekBarSelectionOdds = pid0Var.e;
        MultiMakerOddsRangeSeekBarTotalOdds multiMakerOddsRangeSeekBarTotalOdds = pid0Var.f;
        multiMakerOddsHeaderView.setIsTotalOddsModeVisible(ohwVar.a);
        MultiMakerOddsHeaderView multiMakerOddsHeaderView2 = pid0Var.d;
        mhw mhwVar = ohwVar.b;
        multiMakerOddsHeaderView2.setOddsRangeMode(mhwVar);
        int iOrdinal = mhwVar.ordinal();
        if (iOrdinal == 0) {
            multiMakerOddsHeaderView2.setOddsRangeText(ohwVar.e);
            nhw nhwVar = ohwVar.g;
            multiMakerOddsRangeSeekBarSelectionOdds.setRange(nhwVar.a, nhwVar.b);
            multiMakerOddsRangeSeekBarSelectionOdds.setProgress(nhwVar.c, nhwVar.d);
            multiMakerOddsRangeSeekBarSelectionOdds.setVisibility(0);
            multiMakerOddsRangeSeekBarTotalOdds.setVisibility(4);
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return null;
            }
            multiMakerOddsHeaderView2.setOddsRangeText(ohwVar.f);
            nhw nhwVar2 = ohwVar.h;
            multiMakerOddsRangeSeekBarTotalOdds.setRange(nhwVar2.a, nhwVar2.b);
            multiMakerOddsRangeSeekBarTotalOdds.setProgress(nhwVar2.c, nhwVar2.d);
            multiMakerOddsRangeSeekBarSelectionOdds.setVisibility(4);
            multiMakerOddsRangeSeekBarTotalOdds.setVisibility(0);
        }
        return Unit.a;
    }
}
