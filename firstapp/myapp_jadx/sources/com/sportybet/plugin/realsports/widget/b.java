package com.sportybet.plugin.realsports.widget;

import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.seekbar.RangeSeekBar;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import defpackage.fmh;
import defpackage.gky;
import defpackage.voy;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements voy {
    public final /* synthetic */ OddsFilterSettingView a;

    public b(OddsFilterSettingView oddsFilterSettingView) {
        this.a = oddsFilterSettingView;
    }

    @Override // defpackage.voy
    public final void a(RangeSeekBar rangeSeekBar, float f, float f2) {
        OddsFilterSettingView oddsFilterSettingView = this.a;
        oddsFilterSettingView.Q = f;
        oddsFilterSettingView.R = f2;
        oddsFilterSettingView.M.setText(gky.a(oddsFilterSettingView.getMinOddsDesc()) + " ~ " + gky.a(oddsFilterSettingView.getMaxOddsDesc()));
        oddsFilterSettingView.I();
    }

    @Override // defpackage.voy
    public final void b(RangeSeekBar rangeSeekBar) {
        float fD = rangeSeekBar.getLeftSeekBar().d();
        OddsFilterSettingView oddsFilterSettingView = this.a;
        oddsFilterSettingView.Q = fD;
        oddsFilterSettingView.R = rangeSeekBar.getRightSeekBar().d();
        oddsFilterSettingView.H();
        OddsFilterSettingView.d dVar = oddsFilterSettingView.a0;
        if (dVar != null) {
            String minOddsDesc = oddsFilterSettingView.getMinOddsDesc();
            String maxOddsDesc = oddsFilterSettingView.getMaxOddsDesc();
            PreMatchSportActivity.b bVar = ((fmh) dVar).a.b;
            if (bVar != null) {
                minOddsDesc.getClass();
                maxOddsDesc.getClass();
                PreMatchSportActivity preMatchSportActivity = bVar.a;
                preMatchSportActivity.I1().z1(minOddsDesc.equals(preMatchSportActivity.getCMSString(R.string.component_odds_filters__max, new Object[0])) ? new BigDecimal(Reader.READ_DONE) : new BigDecimal(minOddsDesc), maxOddsDesc.equals(preMatchSportActivity.getCMSString(R.string.component_odds_filters__max, new Object[0])) ? new BigDecimal(Reader.READ_DONE) : new BigDecimal(maxOddsDesc));
            }
        }
    }
}
