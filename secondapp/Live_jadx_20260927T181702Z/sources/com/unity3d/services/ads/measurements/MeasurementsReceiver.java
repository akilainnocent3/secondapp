package com.unity3d.services.ads.measurements;

import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"NewApi", "MissingPermission"})
public final class MeasurementsReceiver implements OutcomeReceiver {

    @l
    private final MeasurementsEvents errorEvent;

    @l
    private final IEventSender eventSender;

    @l
    private final MeasurementsEvents successEvent;

    public MeasurementsReceiver(@l IEventSender eventSender, @l MeasurementsEvents successEvent, @l MeasurementsEvents errorEvent) {
        m0.p(eventSender, "eventSender");
        m0.p(successEvent, "successEvent");
        m0.p(errorEvent, "errorEvent");
        this.eventSender = eventSender;
        this.successEvent = successEvent;
        this.errorEvent = errorEvent;
    }

    public void onResult(@l Object p10) {
        m0.p(p10, "p0");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.successEvent, new Object[0]);
    }

    public void onError(@l Exception error) {
        m0.p(error, "error");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.errorEvent, error.toString());
    }
}
