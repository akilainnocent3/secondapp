package com.vungle.ads.internal.util;

import android.util.Log;
import cs.o;
import cv.v;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class Logger {

    @l
    public static final Companion Companion = new Companion(null);
    private static boolean enabled;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @o
        public final int d(@l String tag, @l String message) {
            m0.p(tag, "tag");
            m0.p(message, "message");
            if (Logger.enabled) {
                return Log.d(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        @o
        public final int e(@l String tag, @l String message) {
            m0.p(tag, "tag");
            m0.p(message, "message");
            if (Logger.enabled) {
                return Log.e(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        public final void enable(boolean z10) {
            Companion companion = Logger.Companion;
            Logger.enabled = z10;
        }

        @l
        public final String eraseSensitiveData(@l String str) {
            m0.p(str, "<this>");
            Pattern patternCompile = Pattern.compile("[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}");
            m0.o(patternCompile, "compile(\"[\\\\d]{1,3}\\\\.[\\…[\\\\d]{1,3}\\\\.[\\\\d]{1,3}\")");
            return new v(patternCompile).q(str, "xxx.xxx.xxx.xxx");
        }

        @o
        public final int i(@l String tag, @l String message) {
            m0.p(tag, "tag");
            m0.p(message, "message");
            if (Logger.enabled) {
                return Log.i(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        @o
        public final int w(@l String tag, @l String message) {
            m0.p(tag, "tag");
            m0.p(message, "message");
            if (Logger.enabled) {
                return Log.w(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        private Companion() {
        }

        @o
        public final int e(@l String tag, @l String message, @l Throwable throwable) {
            m0.p(tag, "tag");
            m0.p(message, "message");
            m0.p(throwable, "throwable");
            if (!Logger.enabled) {
                return -1;
            }
            return Log.e(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
        }

        @o
        public final int w(@l String tag, @l ds.a<String> message) {
            m0.p(tag, "tag");
            m0.p(message, "message");
            if (Logger.enabled) {
                return Log.w(tag, eraseSensitiveData(message.invoke()));
            }
            return -1;
        }
    }

    @o
    public static final int d(@l String str, @l String str2) {
        return Companion.d(str, str2);
    }

    @o
    public static final int e(@l String str, @l String str2) {
        return Companion.e(str, str2);
    }

    @o
    public static final int i(@l String str, @l String str2) {
        return Companion.i(str, str2);
    }

    @o
    public static final int w(@l String str, @l ds.a<String> aVar) {
        return Companion.w(str, aVar);
    }

    @o
    public static final int e(@l String str, @l String str2, @l Throwable th2) {
        return Companion.e(str, str2, th2);
    }

    @o
    public static final int w(@l String str, @l String str2) {
        return Companion.w(str, str2);
    }
}
