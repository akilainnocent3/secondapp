package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class InitializationException extends Exception {

    @l
    private final Configuration config;

    @l
    private final ErrorState errorState;

    @l
    private final Exception originalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(@l ErrorState errorState, @l Exception originalException, @l Configuration config) {
        super(originalException);
        m0.p(errorState, "errorState");
        m0.p(originalException, "originalException");
        m0.p(config, "config");
        this.errorState = errorState;
        this.originalException = originalException;
        this.config = config;
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, ErrorState errorState, Exception exc, Configuration configuration, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            errorState = initializationException.errorState;
        }
        if ((i10 & 2) != 0) {
            exc = initializationException.originalException;
        }
        if ((i10 & 4) != 0) {
            configuration = initializationException.config;
        }
        return initializationException.copy(errorState, exc, configuration);
    }

    @l
    public final ErrorState component1() {
        return this.errorState;
    }

    @l
    public final Exception component2() {
        return this.originalException;
    }

    @l
    public final Configuration component3() {
        return this.config;
    }

    @l
    public final InitializationException copy(@l ErrorState errorState, @l Exception originalException, @l Configuration config) {
        m0.p(errorState, "errorState");
        m0.p(originalException, "originalException");
        m0.p(config, "config");
        return new InitializationException(errorState, originalException, config);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) obj;
        return this.errorState == initializationException.errorState && m0.g(this.originalException, initializationException.originalException) && m0.g(this.config, initializationException.config);
    }

    @l
    public final Configuration getConfig() {
        return this.config;
    }

    @l
    public final ErrorState getErrorState() {
        return this.errorState;
    }

    @l
    public final Exception getOriginalException() {
        return this.originalException;
    }

    public int hashCode() {
        return (((this.errorState.hashCode() * 31) + this.originalException.hashCode()) * 31) + this.config.hashCode();
    }

    @Override // java.lang.Throwable
    @l
    public String toString() {
        return "InitializationException(errorState=" + this.errorState + ", originalException=" + this.originalException + ", config=" + this.config + ')';
    }
}
