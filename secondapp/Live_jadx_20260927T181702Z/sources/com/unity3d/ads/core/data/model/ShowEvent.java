package com.unity3d.ads.core.data.model;

import com.unity3d.ads.adplayer.model.ShowStatus;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ShowEvent {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class CancelTimeout extends ShowEvent {

        @l
        public static final CancelTimeout INSTANCE = new CancelTimeout();

        private CancelTimeout() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Clicked extends ShowEvent {

        @l
        public static final Clicked INSTANCE = new Clicked();

        private Clicked() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Completed extends ShowEvent {

        @m
        private final String reason;

        @m
        private final String reasonDebug;

        @l
        private final ShowStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(@l ShowStatus status, @m String str, @m String str2) {
            super(null);
            m0.p(status, "status");
            this.status = status;
            this.reason = str;
            this.reasonDebug = str2;
        }

        public static /* synthetic */ Completed copy$default(Completed completed, ShowStatus showStatus, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                showStatus = completed.status;
            }
            if ((i10 & 2) != 0) {
                str = completed.reason;
            }
            if ((i10 & 4) != 0) {
                str2 = completed.reasonDebug;
            }
            return completed.copy(showStatus, str, str2);
        }

        @l
        public final ShowStatus component1() {
            return this.status;
        }

        @m
        public final String component2() {
            return this.reason;
        }

        @m
        public final String component3() {
            return this.reasonDebug;
        }

        @l
        public final Completed copy(@l ShowStatus status, @m String str, @m String str2) {
            m0.p(status, "status");
            return new Completed(status, str, str2);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) obj;
            return this.status == completed.status && m0.g(this.reason, completed.reason) && m0.g(this.reasonDebug, completed.reasonDebug);
        }

        @m
        public final String getReason() {
            return this.reason;
        }

        @m
        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        @l
        public final ShowStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.status.hashCode() * 31;
            String str = this.reason;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.reasonDebug;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @l
        public String toString() {
            return "Completed(status=" + this.status + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }

        public /* synthetic */ Completed(ShowStatus showStatus, String str, String str2, int i10, x xVar) {
            this(showStatus, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Error extends ShowEvent {
        private final int errorCode;

        @l
        private final String message;

        @l
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@l String message, int i10, @l String reason) {
            super(null);
            m0.p(message, "message");
            m0.p(reason, "reason");
            this.message = message;
            this.errorCode = i10;
            this.reason = reason;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.message;
            }
            if ((i11 & 2) != 0) {
                i10 = error.errorCode;
            }
            if ((i11 & 4) != 0) {
                str2 = error.reason;
            }
            return error.copy(str, i10, str2);
        }

        @l
        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        @l
        public final String component3() {
            return this.reason;
        }

        @l
        public final Error copy(@l String message, int i10, @l String reason) {
            m0.p(message, "message");
            m0.p(reason, "reason");
            return new Error(message, i10, reason);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return m0.g(this.message, error.message) && this.errorCode == error.errorCode && m0.g(this.reason, error.reason);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @l
        public final String getMessage() {
            return this.message;
        }

        @l
        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return (((this.message.hashCode() * 31) + this.errorCode) * 31) + this.reason.hashCode();
        }

        @l
        public String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ", reason=" + this.reason + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class LeftApplication extends ShowEvent {

        @l
        public static final LeftApplication INSTANCE = new LeftApplication();

        private LeftApplication() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class ReceivedReward extends ShowEvent {

        @l
        public static final ReceivedReward INSTANCE = new ReceivedReward();

        private ReceivedReward() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Started extends ShowEvent {

        @l
        public static final Started INSTANCE = new Started();

        private Started() {
            super(null);
        }
    }

    public /* synthetic */ ShowEvent(x xVar) {
        this();
    }

    private ShowEvent() {
    }
}
