package com.applovin.shadow.okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class ForwardingTimeout extends Timeout {

    @oy.l
    private Timeout delegate;

    public ForwardingTimeout(@oy.l Timeout delegate) {
        m0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.applovin.shadow.okio.Timeout
    @oy.l
    public Timeout clearDeadline() {
        return this.delegate.clearDeadline();
    }

    @Override // com.applovin.shadow.okio.Timeout
    @oy.l
    public Timeout clearTimeout() {
        return this.delegate.clearTimeout();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    @cs.j(name = "delegate")
    @oy.l
    public final Timeout delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Timeout
    public boolean hasDeadline() {
        return this.delegate.hasDeadline();
    }

    /* JADX INFO: renamed from: setDelegate, reason: collision with other method in class */
    public final /* synthetic */ void m154setDelegate(Timeout timeout) {
        m0.p(timeout, "<set-?>");
        this.delegate = timeout;
    }

    @Override // com.applovin.shadow.okio.Timeout
    public void throwIfReached() throws IOException {
        this.delegate.throwIfReached();
    }

    @Override // com.applovin.shadow.okio.Timeout
    @oy.l
    public Timeout timeout(long j10, @oy.l TimeUnit unit) {
        m0.p(unit, "unit");
        return this.delegate.timeout(j10, unit);
    }

    @Override // com.applovin.shadow.okio.Timeout
    public long timeoutNanos() {
        return this.delegate.timeoutNanos();
    }

    @Override // com.applovin.shadow.okio.Timeout
    @oy.l
    public Timeout deadlineNanoTime(long j10) {
        return this.delegate.deadlineNanoTime(j10);
    }

    @oy.l
    public final ForwardingTimeout setDelegate(@oy.l Timeout delegate) {
        m0.p(delegate, "delegate");
        this.delegate = delegate;
        return this;
    }
}
