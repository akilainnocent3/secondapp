package com.monetization.ads.quality.base.model;

import gi.j;
import kotlin.jvm.internal.x;
import oy.l;
import yads.g8;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AdQualityVerificationError {

    @l
    private static final g8 Code = new g8();

    @Deprecated
    public static final int INTERNAL_ERROR = 1;

    @Deprecated
    public static final int INVALID_REQUEST = 2;

    @Deprecated
    public static final int UNKNOWN_ERROR = 0;
    private final int code;

    @l
    private final String description;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DisabledError extends AdQualityVerificationError {

        @l
        public static final DisabledError INSTANCE = new DisabledError();

        private DisabledError() {
            super(1, "The ad verification is disabled by configuration", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class InitializationAlreadyInProcess extends AdQualityVerificationError {
        public InitializationAlreadyInProcess() {
            super(1, "The verification initialization is already in progress", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class InternalError extends AdQualityVerificationError {
        public InternalError(@l String str) {
            super(1, "The ad verification build in error: " + str, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class InvalidAdObject extends AdQualityVerificationError {
        public InvalidAdObject() {
            super(2, "The ad object for verification is invalid", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class InvalidInit extends AdQualityVerificationError {
        public InvalidInit(@l String str) {
            super(1, "The verifier initialization error: " + str, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class LowUsagePercent extends AdQualityVerificationError {

        @l
        public static final LowUsagePercent INSTANCE = new LowUsagePercent();

        private LowUsagePercent() {
            super(1, "The ad verification is not in percent usage", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class TimeoutError extends AdQualityVerificationError {
        public TimeoutError(long j10) {
            super(1, "The ad verifications timed out after " + j10, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class UnknownError extends AdQualityVerificationError {
        public UnknownError(@l String str) {
            super(0, "The ad verification failed with error: " + str, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class UnsupportedNetwork extends AdQualityVerificationError {
        public UnsupportedNetwork() {
            super(2, "The network is unsupported for verification", null);
        }
    }

    public /* synthetic */ AdQualityVerificationError(int i10, String str, x xVar) {
        this(i10, str);
    }

    public final int getCode() {
        return this.code;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public String toString() {
        return "Ad verification error: (code: " + this.code + ", description: " + this.description + j.f86771d;
    }

    private AdQualityVerificationError(int i10, String str) {
        this.code = i10;
        this.description = str;
    }
}
