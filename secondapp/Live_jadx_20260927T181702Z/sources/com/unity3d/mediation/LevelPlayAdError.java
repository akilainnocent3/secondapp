package com.unity3d.mediation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayAdError {

    @l
    public static final a Companion = new a(null);
    public static final int ERROR_CODE_INVALID_AD_UNIT_ID = 626;
    public static final int ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK = 625;
    public static final int ERROR_CODE_LOAD_FAILED_ALREADY_CALLED = 627;
    public static final int ERROR_CODE_LOAD_WHILE_SHOW = 629;
    public static final int ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED = 624;
    public static final int ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK = 628;
    public static final int ERROR_CODE_SHOW_WHILE_LOAD = 631;
    public static final int ERROR_CODE_SHOW_WHILE_SHOW = 630;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @m
    private final IronSourceError f76271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    private final String f76272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m
    private final String f76273c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        private a() {
        }
    }

    public LevelPlayAdError(@m IronSourceError ironSourceError, @l String adId, @m String str) {
        m0.p(adId, "adId");
        this.f76271a = ironSourceError;
        this.f76272b = adId;
        this.f76273c = str;
    }

    @l
    public final String getAdId() {
        return this.f76272b;
    }

    @m
    public final String getAdUnitId() {
        return this.f76273c;
    }

    public final int getErrorCode() {
        IronSourceError ironSourceError = this.f76271a;
        if (ironSourceError != null) {
            return ironSourceError.getErrorCode();
        }
        return 0;
    }

    @l
    public final String getErrorMessage() {
        IronSourceError ironSourceError = this.f76271a;
        String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        return errorMessage == null ? "" : errorMessage;
    }

    @l
    public String toString() {
        String str = this.f76273c;
        IronSourceError ironSourceError = this.f76271a;
        return "adUnitId: " + str + " " + (ironSourceError != null ? ironSourceError.toString() : null);
    }

    public /* synthetic */ LevelPlayAdError(IronSourceError ironSourceError, String str, String str2, int i10, x xVar) {
        this(ironSourceError, str, (i10 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdError(@l String adId, @l String adUnitId, int i10, @l String errorMessage) {
        this(new IronSourceError(i10, errorMessage), adId, adUnitId);
        m0.p(adId, "adId");
        m0.p(adUnitId, "adUnitId");
        m0.p(errorMessage, "errorMessage");
    }
}
