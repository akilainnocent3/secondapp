package com.unity3d.ads.core.data.model;

import cs.h;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@h
public final class ImpressionConfig {

    @l
    private final String data;

    private /* synthetic */ ImpressionConfig(String str) {
        this.data = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImpressionConfig m3116boximpl(String str) {
        return new ImpressionConfig(str);
    }

    @l
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m3117constructorimpl(@l String data) {
        m0.p(data, "data");
        return data;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3118equalsimpl(String str, Object obj) {
        return (obj instanceof ImpressionConfig) && m0.g(str, ((ImpressionConfig) obj).m3122unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3119equalsimpl0(String str, String str2) {
        return m0.g(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3120hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3121toStringimpl(String str) {
        return "ImpressionConfig(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m3118equalsimpl(this.data, obj);
    }

    @l
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m3120hashCodeimpl(this.data);
    }

    public String toString() {
        return m3121toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m3122unboximpl() {
        return this.data;
    }
}
