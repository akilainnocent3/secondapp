package com.sportybet.plugin.realsports.prematch.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import com.sportybet.plugin.realsports.data.QuickMarketSpotEnum;
import com.sportybet.plugin.realsports.prematch.widget.MarketsTabs;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import defpackage.lsu;
import defpackage.osu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/widget/MarketsTabs;", "Lcom/google/android/material/tabs/TabLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "getSelectedMarket", "()Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "Lkotlin/Function1;", "", "q0", "Lkotlin/jvm/functions/Function1;", "getMarketSelected", "()Lkotlin/jvm/functions/Function1;", "setMarketSelected", "(Lkotlin/jvm/functions/Function1;)V", "marketSelected", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MarketsTabs extends TabLayout {
    public static final /* synthetic */ int r0 = 0;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public Function1<? super RegularMarketRule, Unit> marketSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketsTabs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.marketSelected = new lsu();
        a(new osu(this));
    }

    public final Function1<RegularMarketRule, Unit> getMarketSelected() {
        return this.marketSelected;
    }

    public final RegularMarketRule getSelectedMarket() {
        TabLayout.g gVarK = k(getSelectedTabPosition());
        Object obj = gVarK != null ? gVarK.a : null;
        return (RegularMarketRule) (obj instanceof RegularMarketRule ? obj : null);
    }

    public final void setMarketSelected(Function1<? super RegularMarketRule, Unit> function1) {
        function1.getClass();
        this.marketSelected = function1;
    }

    public final void x(QuickMarketSpotEnum quickMarketSpotEnum, String str, final String str2, final Function1<? super RegularMarketRule, Unit> function1) {
        quickMarketSpotEnum.getClass();
        TabLayout.g gVarK = k(getSelectedTabPosition());
        Object obj = gVarK != null ? gVarK.a : null;
        final RegularMarketRule regularMarketRule = (RegularMarketRule) (obj instanceof RegularMarketRule ? obj : null);
        n();
        QuickMarketHelper.fetch(quickMarketSpotEnum, str, new QuickMarketHelper.FetchCallback() { // from class: nsu
            @Override // com.sportybet.plugin.realsports.data.QuickMarketHelper.FetchCallback
            public final void onResult(List list) {
                MarketsTabs marketsTabs;
                TabLayout.g gVarK2;
                RegularMarketRule regularMarketRule2;
                int i = MarketsTabs.r0;
                list.getClass();
                Iterator it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    marketsTabs = this.a;
                    boolean z = false;
                    if (!zHasNext) {
                        break;
                    }
                    RegularMarketRule regularMarketRule3 = (RegularMarketRule) it.next();
                    TabLayout.g gVarL = marketsTabs.l();
                    gVarL.a = regularMarketRule3;
                    marketsTabs.getContext();
                    HashSet hashSet = tru.a;
                    String str3 = regularMarketRule3.b;
                    String str4 = regularMarketRule3.a;
                    gVarL.e(str3);
                    String str5 = str2;
                    if ((!TextUtils.isEmpty(str5) && Intrinsics.g(str5, str4)) || ((regularMarketRule2 = regularMarketRule) != null && Intrinsics.g(regularMarketRule2.a, str4))) {
                        z = true;
                    }
                    marketsTabs.d(gVarL, z);
                }
                if (marketsTabs.k(marketsTabs.getSelectedTabPosition()) == null && marketsTabs.getChildCount() > 0 && (gVarK2 = marketsTabs.k(0)) != null) {
                    gVarK2.b();
                }
                function1.invoke(marketsTabs.getSelectedMarket());
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarketsTabs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarketsTabs(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ MarketsTabs(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
