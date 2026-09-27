package com.yandex.mobile.ads.common;

import cs.k;
import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class AdRequestError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f76801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f76802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f76803c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Code {
        public static final int INTERNAL_ERROR = 1;
        public static final int INVALID_REQUEST = 2;
        public static final int NETWORK_ERROR = 3;
        public static final int NO_FILL = 4;
        public static final int SYSTEM_ERROR = 5;
        public static final int UNKNOWN_ERROR = 0;
    }

    @k
    public AdRequestError(int i10, @l String str) {
        this(i10, str, null, 4, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m0.g(AdRequestError.class, obj.getClass())) {
            return false;
        }
        AdRequestError adRequestError = (AdRequestError) obj;
        if (this.f76801a == adRequestError.f76801a && m0.g(this.f76803c, adRequestError.f76803c)) {
            return m0.g(this.f76802b, adRequestError.f76802b);
        }
        return false;
    }

    @m
    public final String getAdUnitId() {
        return this.f76803c;
    }

    public final int getCode() {
        return this.f76801a;
    }

    @l
    public final String getDescription() {
        return this.f76802b;
    }

    public int hashCode() {
        int iHashCode = ((this.f76802b.hashCode() * 31) + this.f76801a) * 31;
        String str = this.f76803c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @l
    public String toString() {
        int i10 = this.f76801a;
        String str = this.f76802b;
        String str2 = this.f76803c;
        if (str2 == null) {
            str2 = "";
        }
        return "AdRequestError (code: " + i10 + ", description: " + str + ", adUnitId: " + str2 + j.f86771d;
    }

    @k
    public AdRequestError(int i10, @l String str, @m String str2) {
        this.f76801a = i10;
        this.f76802b = str;
        this.f76803c = str2;
    }

    public /* synthetic */ AdRequestError(int i10, String str, String str2, int i11, x xVar) {
        this(i10, str, (i11 & 4) != 0 ? null : str2);
    }
}
