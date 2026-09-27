package com.monetization.ads.mediation.base.initialize;

import com.inmobi.unification.sdk.InitializationStatus;
import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface MediatedAdapterInitializationResult {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Failure implements MediatedAdapterInitializationResult {
        private final int errorCode;

        @l
        private final String errorMessage;

        public Failure(int i10, @l String str) {
            this.errorCode = i10;
            this.errorMessage = str;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = failure.errorCode;
            }
            if ((i11 & 2) != 0) {
                str = failure.errorMessage;
            }
            return failure.copy(i10, str);
        }

        public final int component1() {
            return this.errorCode;
        }

        @l
        public final String component2() {
            return this.errorMessage;
        }

        @l
        public final Failure copy(int i10, @l String str) {
            return new Failure(i10, str);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.errorCode == failure.errorCode && m0.g(this.errorMessage, failure.errorMessage);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @l
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode() + (this.errorCode * 31);
        }

        @l
        public String toString() {
            return "Failure(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Success implements MediatedAdapterInitializationResult {

        @l
        public static final Success INSTANCE = new Success();

        private Success() {
        }

        public boolean equals(@m Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public int hashCode() {
            return 287796421;
        }

        @l
        public String toString() {
            return InitializationStatus.SUCCESS;
        }
    }
}
