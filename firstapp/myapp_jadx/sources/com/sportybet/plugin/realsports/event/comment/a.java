package com.sportybet.plugin.realsports.event.comment;

import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.ShareBetData;
import defpackage.f00;
import defpackage.g08;
import defpackage.qz3;
import defpackage.vgb0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements View.OnClickListener {
    public final /* synthetic */ ShareBetData a;

    public a(ReplyPanel.b bVar, ShareBetData shareBetData) {
        this.a = shareBetData;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String shareCode = this.a.getShareCode();
        int i = ReplyPanel.T;
        g08 g08Var = g08.UNKNOWN;
        f00 f00Var = vgb0.a;
        Map mapSingletonMap = Collections.singletonMap("from", "SINGLE_PREMATCH_BET");
        mapSingletonMap.getClass();
        vgb0.c(AnalyticsEvent.COMMENT_LOAD_BOOKING_CODE, mapSingletonMap, false);
        qz3.k(shareCode, "SINGLE_PREMATCH_BET");
    }
}
