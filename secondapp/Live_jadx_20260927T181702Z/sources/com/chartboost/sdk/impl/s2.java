package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebViewClient;
import com.chartboost.sdk.impl.s2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class s2 extends o3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(Context context) {
        super(context);
        kotlin.jvm.internal.m0.p(context, "context");
    }

    public static final boolean a(yg ygVar, View view, MotionEvent motionEvent) {
        if (ygVar != null) {
            kotlin.jvm.internal.m0.m(motionEvent);
            ygVar.a(motionEvent);
        }
        return motionEvent.getAction() == 2;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(@oy.l WebViewClient client) {
        kotlin.jvm.internal.m0.p(client, "client");
        super.setWebViewClient(client);
        final yg ygVarA = client instanceof t2 ? ((t2) client).a() : null;
        setOnTouchListener(new View.OnTouchListener() { // from class: uc.n0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return s2.a(ygVarA, view, motionEvent);
            }
        });
    }
}
