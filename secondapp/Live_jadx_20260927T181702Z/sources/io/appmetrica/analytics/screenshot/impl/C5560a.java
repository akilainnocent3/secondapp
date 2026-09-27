package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.C5560a;
import kotlin.jvm.internal.o0;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5560a extends o0 implements ds.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5563d f99066a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5560a(C5563d c5563d) {
        super(0);
        this.f99066a = c5563d;
    }

    public static final void a(C5563d c5563d) {
        ((C5582x) c5563d.f99072b).a("AndroidApiScreenshotCaptor");
    }

    @Override // ds.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C5563d c5563d = this.f99066a;
        return new Activity.ScreenCaptureCallback() { // from class: yq.a
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C5560a.a(c5563d);
            }
        };
    }
}
