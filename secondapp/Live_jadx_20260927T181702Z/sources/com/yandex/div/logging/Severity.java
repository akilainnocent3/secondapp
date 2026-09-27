package com.yandex.div.logging;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public enum Severity {
    ERROR,
    WARNING,
    INFO,
    DEBUG,
    VERBOSE;

    public final boolean isAtLeast(@l Severity severity) {
        return ordinal() >= severity.ordinal();
    }
}
