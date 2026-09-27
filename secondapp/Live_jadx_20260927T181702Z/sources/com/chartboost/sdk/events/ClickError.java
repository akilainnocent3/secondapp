package com.chartboost.sdk.events;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import sr.a;
import sr.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ClickError implements CBError {

    @l
    private final Code code;

    @m
    private final Exception exception;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Code {
        INTERNAL(0),
        URI_INVALID(1),
        URI_UNRECOGNIZED(2);

        private static final /* synthetic */ a $ENTRIES = c.c(values());
        private final int errorCode;

        Code(int i10) {
            this.errorCode = i10;
        }

        @l
        public static a<Code> getEntries() {
            return $ENTRIES;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    public ClickError(@l Code code, @m Exception exc) {
        m0.p(code, "code");
        this.code = code;
        this.exception = exc;
    }

    @l
    public final Code getCode() {
        return this.code;
    }

    @Override // com.chartboost.sdk.events.CBError
    @m
    public Exception getException() {
        return this.exception;
    }

    @l
    public String toString() {
        return "Chartboost ClickError: " + this.code.name() + " with exception " + getException();
    }

    public /* synthetic */ ClickError(Code code, Exception exc, int i10, x xVar) {
        this(code, (i10 & 2) != 0 ? null : exc);
    }
}
