package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.ironsource.ja, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4348ja extends WebView implements InterfaceC4559va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4542ua f62137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private Qc f62138b;

    public /* synthetic */ C4348ja(Context context, InterfaceC4542ua interfaceC4542ua, int i10, kotlin.jvm.internal.x xVar) {
        this(context, (i10 & 2) != 0 ? new InterfaceC4542ua.a(0, 1, null) : interfaceC4542ua);
    }

    @Override // com.ironsource.InterfaceC4559va
    public void a(@oy.l String script) {
        kotlin.jvm.internal.m0.p(script, "script");
        InterfaceC4542ua interfaceC4542ua = this.f62137a;
        InterfaceC4542ua interfaceC4542ua2 = null;
        if (interfaceC4542ua == null) {
            kotlin.jvm.internal.m0.S("javascriptEngine");
            interfaceC4542ua = null;
        }
        if (!interfaceC4542ua.a()) {
            InterfaceC4542ua interfaceC4542ua3 = this.f62137a;
            if (interfaceC4542ua3 == null) {
                kotlin.jvm.internal.m0.S("javascriptEngine");
                interfaceC4542ua3 = null;
            }
            interfaceC4542ua3.a(this);
        }
        InterfaceC4542ua interfaceC4542ua4 = this.f62137a;
        if (interfaceC4542ua4 == null) {
            kotlin.jvm.internal.m0.S("javascriptEngine");
        } else {
            interfaceC4542ua2 = interfaceC4542ua4;
        }
        interfaceC4542ua2.a(script);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, @oy.l KeyEvent event) {
        Qc qc2;
        kotlin.jvm.internal.m0.p(event, "event");
        if (i10 == 4 && (qc2 = this.f62138b) != null && qc2.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i10, event);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4348ja(@oy.l Context context, @oy.l InterfaceC4542ua javascriptEngine) {
        this(context);
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(javascriptEngine, "javascriptEngine");
        this.f62137a = javascriptEngine;
    }

    public final void a(@oy.m Qc qc2) {
        this.f62138b = qc2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4348ja(@oy.l Context context) {
        super(context);
        kotlin.jvm.internal.m0.p(context, "context");
    }

    public final void a() {
        this.f62138b = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4348ja(@oy.l Context context, @oy.l AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4348ja(@oy.l Context context, @oy.l AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(attrs, "attrs");
    }
}
