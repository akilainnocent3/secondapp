package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class LoadEvent {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Completed extends LoadEvent {

        @l
        public static final Completed INSTANCE = new Completed();

        private Completed() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Error extends LoadEvent {
        private final int errorCode;

        @l
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@l String message, int i10) {
            super(null);
            m0.p(message, "message");
            this.message = message;
            this.errorCode = i10;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.message;
            }
            if ((i11 & 2) != 0) {
                i10 = error.errorCode;
            }
            return error.copy(str, i10);
        }

        @l
        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        @l
        public final Error copy(@l String message, int i10) {
            m0.p(message, "message");
            return new Error(message, i10);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return m0.g(this.message, error.message) && this.errorCode == error.errorCode;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @l
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.errorCode;
        }

        @l
        public String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ')';
        }
    }

    public /* synthetic */ LoadEvent(x xVar) {
        this();
    }

    private LoadEvent() {
    }
}
