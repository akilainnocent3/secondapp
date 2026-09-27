package com.yandex.div.core.view2.logging;

import cv.g0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class EventMessageBuilder {

    @l
    private final StringBuilder consolidatedEvents = new StringBuilder();

    public final void appendEventMessage(@l String str, @l String str2) {
        if (this.consolidatedEvents.length() > 0) {
            this.consolidatedEvents.append(", ");
        }
        this.consolidatedEvents.append(str + " (" + str2 + ')');
    }

    @m
    public final String buildEventsLogMessage() {
        StringBuilder sb2 = this.consolidatedEvents;
        if (sb2.length() <= 0) {
            return null;
        }
        String string = sb2.toString();
        g0.g0(sb2);
        return string;
    }
}
