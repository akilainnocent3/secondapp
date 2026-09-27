package com.yandex.div.evaluable.types;

import cs.h;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@h
public final class Url {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final String value;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private final boolean isValid(String str) {
            try {
                new URL(str);
                return true;
            } catch (MalformedURLException unused) {
                return false;
            }
        }

        @l
        /* JADX INFO: renamed from: from-VcSV9u8, reason: not valid java name */
        public final String m3360fromVcSV9u8(@l String urlString) throws IllegalArgumentException {
            m0.p(urlString, "urlString");
            if (isValid(urlString)) {
                return Url.m3354constructorimpl(urlString);
            }
            throw new IllegalArgumentException("Invalid url " + urlString);
        }

        private Companion() {
        }
    }

    private /* synthetic */ Url(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Url m3353boximpl(String str) {
        return new Url(str);
    }

    @l
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m3354constructorimpl(@l String value) {
        m0.p(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3355equalsimpl(String str, Object obj) {
        return (obj instanceof Url) && m0.g(str, ((Url) obj).m3359unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3356equalsimpl0(String str, String str2) {
        return m0.g(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3357hashCodeimpl(String str) {
        return str.hashCode();
    }

    public boolean equals(Object obj) {
        return m3355equalsimpl(this.value, obj);
    }

    @l
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m3357hashCodeimpl(this.value);
    }

    @l
    public String toString() {
        return m3358toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m3359unboximpl() {
        return this.value;
    }

    @l
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3358toStringimpl(String str) {
        return str;
    }
}
