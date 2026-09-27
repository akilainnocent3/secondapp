package com.unity3d.ads.core.data.model;

import cs.h;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@h
public final class AdDataRefreshToken {

    @l
    private final String data;

    private /* synthetic */ AdDataRefreshToken(String str) {
        this.data = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdDataRefreshToken m3109boximpl(String str) {
        return new AdDataRefreshToken(str);
    }

    @l
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m3110constructorimpl(@l String data) {
        m0.p(data, "data");
        return data;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3111equalsimpl(String str, Object obj) {
        return (obj instanceof AdDataRefreshToken) && m0.g(str, ((AdDataRefreshToken) obj).m3115unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3112equalsimpl0(String str, String str2) {
        return m0.g(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3113hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3114toStringimpl(String str) {
        return "AdDataRefreshToken(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m3111equalsimpl(this.data, obj);
    }

    @l
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m3113hashCodeimpl(this.data);
    }

    public String toString() {
        return m3114toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m3115unboximpl() {
        return this.data;
    }
}
