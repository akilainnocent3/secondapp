package com.cleveradssolutions.internal.content;

import android.util.Log;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends wc.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Throwable f43418u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String title, Throwable cause) {
        super(0, title);
        m0.p(title, "title");
        m0.p(cause, "cause");
        this.f43418u = cause;
    }

    @Override // wc.b
    public final String toString() {
        return super.b() + "\nCause: " + Log.getStackTraceString(this.f43418u);
    }
}
