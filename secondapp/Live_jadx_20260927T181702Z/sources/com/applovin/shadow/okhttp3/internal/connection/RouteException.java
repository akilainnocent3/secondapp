package com.applovin.shadow.okhttp3.internal.connection;

import dr.t;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class RouteException extends RuntimeException {

    @l
    private final IOException firstConnectException;

    @l
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(@l IOException firstConnectException) {
        super(firstConnectException);
        m0.p(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    public final void addConnectException(@l IOException e10) throws IllegalAccessException, InvocationTargetException {
        m0.p(e10, "e");
        t.a(this.firstConnectException, e10);
        this.lastConnectException = e10;
    }

    @l
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    @l
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
