package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.Reader;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.realsports.OddsFilterEventCountData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.seekbar.RangeSeekBar;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.OddsFilterSettingView;
import defpackage.ay0;
import defpackage.bmy;
import defpackage.dq7;
import defpackage.fmh;
import defpackage.gky;
import defpackage.h5e;
import defpackage.jq40;
import defpackage.kyl;
import defpackage.lq1;
import defpackage.niy;
import defpackage.sn5;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public class OddsFilterSettingView extends kyl {
    public static final String[] d0 = {"1", "1.1", "1.2", "1.3", "1.4", "1.5", "2", "2.5", "3", "3.5", "4", "5", "10", "20", ""};
    public lq1 H;
    public final ArrayList<String> I;
    public final ArrayList<TextView> J;
    public RangeSeekBar K;
    public TextView L;
    public TextView M;
    public TextView N;
    public ConstraintLayout O;
    public View P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public List<Event> U;
    public RegularMarketRule V;
    public a W;
    public d a0;
    public b b0;
    public c c0;

    public interface a {
        void a(String str, String str2);
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public interface d {
    }

    public OddsFilterSettingView(Context context) {
        super(context);
        if (!isInEditMode()) {
            E();
        }
        this.I = new ArrayList<>();
        this.J = new ArrayList<>();
        this.U = new ArrayList();
        M(context);
    }

    public static int K(float f) {
        if (f >= 0.0f && f < 7.142857f) {
            return 0;
        }
        if (f >= 7.142857f && f < 14.285714f) {
            return 1;
        }
        if (f >= 14.285714f && f < 21.428572f) {
            return 2;
        }
        if (f >= 21.428572f && f < 28.571428f) {
            return 3;
        }
        if (f >= 28.571428f && f < 35.714287f) {
            return 4;
        }
        if (f >= 35.714287f && f < 42.857143f) {
            return 5;
        }
        if (f >= 42.857143f && f < 50.0f) {
            return 6;
        }
        if (f >= 50.0f && f < 57.142857f) {
            return 7;
        }
        if (f >= 57.142857f && f < 64.28571f) {
            return 8;
        }
        if (f >= 64.28571f && f < 71.42857f) {
            return 9;
        }
        if (f >= 71.42857f && f < 78.57143f) {
            return 10;
        }
        if (f >= 78.57143f && f < 85.71429f) {
            return 11;
        }
        if (f < 85.71429f || f >= 92.85714f) {
            return (f < 92.85714f || f >= 100.0f) ? 14 : 13;
        }
        return 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getMaxOddsDesc() {
        return d0[K(this.R)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getMinOddsDesc() {
        return d0[K(this.Q)];
    }

    public final void H() {
        if (this.U.isEmpty() || this.V == null) {
            return;
        }
        int i = 0;
        String strC = sn5.c(this, R.string.component_odds_filters__custom, new Object[0]);
        String minOddsDesc = getMinOddsDesc();
        String maxOddsDesc = getMaxOddsDesc();
        BigDecimal bigDecimal = TextUtils.equals(minOddsDesc, sn5.c(this, R.string.component_odds_filters__max, new Object[0])) ? new BigDecimal(Reader.READ_DONE) : new BigDecimal(minOddsDesc);
        BigDecimal bigDecimal2 = TextUtils.equals(maxOddsDesc, sn5.c(this, R.string.component_odds_filters__max, new Object[0])) ? new BigDecimal(Reader.READ_DONE) : new BigDecimal(maxOddsDesc);
        Iterator<Event> it = this.U.iterator();
        while (it.hasNext()) {
            if (it.next().hasAnyOutcomeInOddsRange(this.V.a, bigDecimal, bigDecimal2)) {
                i++;
            }
        }
        this.L.setText(strC + " (" + i + ")");
    }

    public final void I() {
        boolean z = K(this.Q) == 0 && K(this.R) == 14;
        TextView textView = this.N;
        if (z) {
            textView.setEnabled(false);
        } else {
            textView.setEnabled(K(this.Q) != K(this.R));
        }
    }

    public final void J() {
        L(0);
        this.K.setProgress(0.0f, 100.0f);
        this.S = 0.0f;
        this.T = 100.0f;
        b bVar = this.b0;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void L(int i) {
        this.L.setTextColor(getResources().getColor(i == -1 ? R.color.brand_quaternary : R.color.text_type1_primary));
        int i2 = 0;
        while (true) {
            ArrayList<TextView> arrayList = this.J;
            if (i2 >= arrayList.size()) {
                return;
            }
            arrayList.get(i2).setTextColor(getResources().getColor(i == i2 ? R.color.brand_quaternary : R.color.text_type1_primary));
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:4:0x003c  */
    public final void M(Context context) {
        BOConfigValueBundle bOConfigValueBundleE;
        OddsFilterEventCountData.Item[] itemArr;
        this.P = LayoutInflater.from(context).inflate(R.layout.spr_sports_odds_layout, (ViewGroup) this, true);
        findViewById(R.id.root).setOnClickListener(new niy());
        String strB = sn5.b(context, R.string.component_odds_filters__max, new Object[0]);
        d0[14] = strB;
        ArrayList<String> arrayList = this.I;
        arrayList.add(strB);
        lq1 lq1Var = this.H;
        lq1Var.getClass();
        BOConfigParam bOConfigParam = BOConfigParam.OddsFilterRangePreFixed;
        if (bOConfigParam == null || (bOConfigValueBundleE = lq1Var.e()) == null) {
            itemArr = null;
        } else {
            BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(OddsFilterEventCountData.Item[].class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (!(configValue instanceof OddsFilterEventCountData.Item[])) {
                        configValue = null;
                    }
                } else if (!(configValue instanceof String) || (configValue = StringsKt.toIntOrNull((String) configValue)) == null) {
                    itemArr = null;
                } else if (!(configValue instanceof OddsFilterEventCountData.Item[])) {
                    configValue = null;
                }
                itemArr = (OddsFilterEventCountData.Item[]) configValue;
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (!(configValue instanceof OddsFilterEventCountData.Item[])) {
                        configValue = null;
                    }
                } else if (!(configValue instanceof String) || (configValue = StringsKt.s0((String) configValue)) == null) {
                    itemArr = null;
                } else if (!(configValue instanceof OddsFilterEventCountData.Item[])) {
                    configValue = null;
                }
                itemArr = (OddsFilterEventCountData.Item[]) configValue;
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (!(configValue instanceof OddsFilterEventCountData.Item[])) {
                        configValue = null;
                    }
                } else if (!(configValue instanceof String) || (configValue = kotlin.text.b.i((String) configValue)) == null) {
                    itemArr = null;
                } else if (!(configValue instanceof OddsFilterEventCountData.Item[])) {
                    configValue = null;
                }
                itemArr = (OddsFilterEventCountData.Item[]) configValue;
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (!(configValue instanceof OddsFilterEventCountData.Item[])) {
                        configValue = null;
                    }
                } else if (!(configValue instanceof String) || (configValue = kotlin.text.b.h((String) configValue)) == null) {
                    itemArr = null;
                } else if (!(configValue instanceof OddsFilterEventCountData.Item[])) {
                    configValue = null;
                }
                itemArr = (OddsFilterEventCountData.Item[]) configValue;
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (!(configValue instanceof OddsFilterEventCountData.Item[])) {
                        configValue = null;
                    }
                } else if (!(configValue instanceof String) || (configValue = StringsKt.r0((String) configValue)) == null) {
                    itemArr = null;
                } else if (!(configValue instanceof OddsFilterEventCountData.Item[])) {
                    configValue = null;
                }
                itemArr = (OddsFilterEventCountData.Item[]) configValue;
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue == null || (configValue = configValue.toString()) == null) {
                    itemArr = null;
                } else {
                    if (!(configValue instanceof OddsFilterEventCountData.Item[])) {
                        configValue = null;
                    }
                    itemArr = (OddsFilterEventCountData.Item[]) configValue;
                }
            } else if (configValue != null) {
                if (!(configValue instanceof OddsFilterEventCountData.Item[])) {
                    configValue = null;
                }
                itemArr = (OddsFilterEventCountData.Item[]) configValue;
            } else {
                itemArr = null;
            }
        }
        List listS = itemArr != null ? ay0.S(itemArr) : null;
        if (listS == null) {
            arrayList.addAll(Arrays.asList("1.2", "1.5", "2.0"));
        } else {
            for (int i = 0; i < listS.size(); i++) {
                Double parsedDisplayValue = ((OddsFilterEventCountData.Item) listS.get(i)).getParsedDisplayValue();
                if (parsedDisplayValue != null) {
                    arrayList.add(parsedDisplayValue.toString());
                }
            }
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.btn_odds_container);
        linearLayout.removeAllViews();
        for (final int i2 = 0; i2 < arrayList.size(); i2++) {
            final String str = arrayList.get(i2);
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.spr_sports_odds_btn_item, (ViewGroup) linearLayout, false);
            linearLayout.addView(viewInflate);
            TextView textView = (TextView) h5e.a(R.id.btn_odds, viewInflate);
            if (textView == null) {
                bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.btn_odds)));
                return;
            }
            textView.setText(i2 == 0 ? sn5.c(this, R.string.component_odds_filters__all, new Object[0]) : sn5.c(this, R.string.component_odds_filters__odds, new Object[0]) + " ≤" + gky.a(str));
            textView.setOnClickListener(new View.OnClickListener() { // from class: riy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OddsFilterSettingView.b bVar;
                    String[] strArr = OddsFilterSettingView.d0;
                    OddsFilterSettingView oddsFilterSettingView = this.a;
                    int i3 = i2;
                    oddsFilterSettingView.L(i3);
                    if (i3 == 0 && (bVar = oddsFilterSettingView.b0) != null) {
                        bVar.a();
                        return;
                    }
                    OddsFilterSettingView.a aVar = oddsFilterSettingView.W;
                    if (aVar != null) {
                        aVar.a("1", str);
                    }
                }
            });
            this.J.add(textView);
        }
        this.O = (ConstraintLayout) findViewById(R.id.title);
        RangeSeekBar rangeSeekBar = (RangeSeekBar) findViewById(R.id.range_slider);
        this.K = rangeSeekBar;
        rangeSeekBar.setOnRangeChangedListener(new com.sportybet.plugin.realsports.widget.b(this));
        this.Q = 0.0f;
        this.S = 0.0f;
        this.R = 100.0f;
        this.T = 100.0f;
        this.L = (TextView) findViewById(R.id.odds_range_desc);
        TextView textView2 = (TextView) findViewById(R.id.odds_range_value);
        this.M = textView2;
        textView2.setText(gky.a(getMinOddsDesc()) + " ~ " + gky.a(getMaxOddsDesc()));
        ((TextView) findViewById(R.id.filter_min)).setText(gky.a(getMinOddsDesc()));
        ((TextView) findViewById(R.id.filter_max)).setText(gky.a(getMaxOddsDesc()));
        this.K.setRange(this.S, this.T);
        TextView textView3 = (TextView) findViewById(R.id.btn_apply);
        this.N = textView3;
        textView3.setOnClickListener(new View.OnClickListener() { // from class: oiy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String[] strArr = OddsFilterSettingView.d0;
                this.a.N();
            }
        });
        I();
        ((TextView) findViewById(R.id.btn_clear)).setOnClickListener(new View.OnClickListener() { // from class: piy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String[] strArr = OddsFilterSettingView.d0;
                this.a.J();
            }
        });
        ((ImageView) findViewById(R.id.close)).setOnClickListener(new View.OnClickListener() { // from class: qiy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String[] strArr = OddsFilterSettingView.d0;
                OddsFilterSettingView oddsFilterSettingView = this.a;
                if (oddsFilterSettingView.c0 == null) {
                    return;
                }
                oddsFilterSettingView.K.setProgress(oddsFilterSettingView.S, oddsFilterSettingView.T);
                oddsFilterSettingView.c0.a();
            }
        });
        this.K.setProgress(this.S, this.T);
        L(0);
    }

    public final /* synthetic */ void N() {
        L(-1);
        this.S = this.Q;
        this.T = this.R;
        a aVar = this.W;
        if (aVar != null) {
            aVar.a(getMinOddsDesc(), getMaxOddsDesc());
        }
    }

    public void setDismissListener(View.OnClickListener onClickListener) {
        this.P.setOnClickListener(onClickListener);
    }

    public void setEventCounts(OddsFilterEventCountData oddsFilterEventCountData) {
        String strC;
        if (oddsFilterEventCountData.getPrefixed() == null && oddsFilterEventCountData.getCustom() == null) {
            setEventCounts(new ArrayList(), null);
            return;
        }
        if (oddsFilterEventCountData.getPrefixed() == null || oddsFilterEventCountData.getPrefixed().isEmpty()) {
            if (oddsFilterEventCountData.getCustom() != null) {
                String strC2 = sn5.c(this, R.string.component_odds_filters__custom, new Object[0]);
                int count = oddsFilterEventCountData.getCustom().getCount();
                this.L.setText(strC2 + " (" + count + ")");
                return;
            }
            return;
        }
        int i = 0;
        while (true) {
            ArrayList<TextView> arrayList = this.J;
            if (i >= arrayList.size()) {
                break;
            }
            boolean z = i == 0;
            String str = this.I.get(i);
            OddsFilterEventCountData.Item itemFindPrefixedItem = oddsFilterEventCountData.findPrefixedItem(z ? null : str);
            if (z) {
                strC = sn5.c(this, R.string.component_odds_filters__all, new Object[0]);
            } else {
                strC = sn5.c(this, R.string.component_odds_filters__odds, new Object[0]) + " ≤" + gky.a(str);
            }
            int count2 = itemFindPrefixedItem != null ? itemFindPrefixedItem.getCount() : 0;
            arrayList.get(i).setText(strC + " (" + count2 + ")");
            i++;
        }
        int iK = K(this.Q);
        int iK2 = K(this.R);
        if (iK == 0 && iK2 == 14) {
            OddsFilterEventCountData.Item itemFindPrefixedItem2 = oddsFilterEventCountData.findPrefixedItem(null);
            String strC3 = sn5.c(this, R.string.component_odds_filters__custom, new Object[0]);
            int count3 = itemFindPrefixedItem2 != null ? itemFindPrefixedItem2.getCount() : 0;
            this.L.setText(strC3 + " (" + count3 + ")");
            return;
        }
        d dVar = this.a0;
        if (dVar != null) {
            String minOddsDesc = getMinOddsDesc();
            String maxOddsDesc = getMaxOddsDesc();
            PreMatchSportActivity.b bVar = ((fmh) dVar).a.b;
            if (bVar != null) {
                minOddsDesc.getClass();
                maxOddsDesc.getClass();
                PreMatchSportActivity preMatchSportActivity = bVar.a;
                preMatchSportActivity.I1().z1(minOddsDesc.equals(preMatchSportActivity.getCMSString(R.string.component_odds_filters__max, new Object[0])) ? new BigDecimal(Reader.READ_DONE) : new BigDecimal(minOddsDesc), maxOddsDesc.equals(preMatchSportActivity.getCMSString(R.string.component_odds_filters__max, new Object[0])) ? new BigDecimal(Reader.READ_DONE) : new BigDecimal(maxOddsDesc));
            }
        }
    }

    public void setNoShowTitle() {
        this.O.setVisibility(8);
    }

    public void setOnApplyClickListener(a aVar) {
        this.W = aVar;
    }

    public void setOnClearClickListener(b bVar) {
        this.b0 = bVar;
    }

    public void setOnCloseFilterListener(c cVar) {
        this.c0 = cVar;
    }

    public void setOnRangeChangeListener(d dVar) {
        this.a0 = dVar;
    }

    public OddsFilterSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            E();
        }
        this.I = new ArrayList<>();
        this.J = new ArrayList<>();
        this.U = new ArrayList();
        M(context);
    }

    public OddsFilterSettingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            E();
        }
        this.I = new ArrayList<>();
        this.J = new ArrayList<>();
        this.U = new ArrayList();
        M(context);
    }

    public void setEventCounts(List<Event> list, RegularMarketRule regularMarketRule) {
        String strC;
        this.U = list;
        this.V = regularMarketRule;
        int i = 0;
        while (true) {
            ArrayList<TextView> arrayList = this.J;
            if (i >= arrayList.size()) {
                break;
            }
            ArrayList<String> arrayList2 = this.I;
            if (i == 0) {
                strC = sn5.c(this, R.string.component_odds_filters__all, new Object[0]);
            } else {
                strC = sn5.c(this, R.string.component_odds_filters__odds, new Object[0]) + " ≤" + gky.a(arrayList2.get(i));
            }
            if (!list.isEmpty() && regularMarketRule != null) {
                int size = list.size();
                if (i >= 1) {
                    BigDecimal bigDecimal = BigDecimal.ONE;
                    BigDecimal bigDecimal2 = new BigDecimal(arrayList2.get(i));
                    Iterator<Event> it = list.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        if (it.next().hasAnyOutcomeInOddsRange(regularMarketRule.a, bigDecimal, bigDecimal2)) {
                            i2++;
                        }
                    }
                    size = i2;
                }
                arrayList.get(i).setText(strC + " (" + size + ")");
            } else {
                arrayList.get(i).setText(strC);
            }
            i++;
        }
        if (!list.isEmpty() && regularMarketRule != null) {
            H();
        } else {
            this.L.setText(sn5.c(this, R.string.component_odds_filters__custom, new Object[0]));
        }
    }
}
