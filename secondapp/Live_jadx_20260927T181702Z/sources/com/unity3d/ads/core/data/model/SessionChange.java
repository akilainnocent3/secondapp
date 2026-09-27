package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class SessionChange {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class PrivacyFsmChange extends SessionChange {

        @l
        private final ByteString value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrivacyFsmChange(@l ByteString value) {
            super(null);
            m0.p(value, "value");
            this.value = value;
        }

        public static /* synthetic */ PrivacyFsmChange copy$default(PrivacyFsmChange privacyFsmChange, ByteString byteString, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                byteString = privacyFsmChange.value;
            }
            return privacyFsmChange.copy(byteString);
        }

        @l
        public final ByteString component1() {
            return this.value;
        }

        @l
        public final PrivacyFsmChange copy(@l ByteString value) {
            m0.p(value, "value");
            return new PrivacyFsmChange(value);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrivacyFsmChange) && m0.g(this.value, ((PrivacyFsmChange) obj).value);
        }

        @l
        public final ByteString getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @l
        public String toString() {
            return "PrivacyFsmChange(value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class UserConsentChange extends SessionChange {

        @l
        private final ByteString value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserConsentChange(@l ByteString value) {
            super(null);
            m0.p(value, "value");
            this.value = value;
        }

        public static /* synthetic */ UserConsentChange copy$default(UserConsentChange userConsentChange, ByteString byteString, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                byteString = userConsentChange.value;
            }
            return userConsentChange.copy(byteString);
        }

        @l
        public final ByteString component1() {
            return this.value;
        }

        @l
        public final UserConsentChange copy(@l ByteString value) {
            m0.p(value, "value");
            return new UserConsentChange(value);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserConsentChange) && m0.g(this.value, ((UserConsentChange) obj).value);
        }

        @l
        public final ByteString getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @l
        public String toString() {
            return "UserConsentChange(value=" + this.value + ')';
        }
    }

    public /* synthetic */ SessionChange(x xVar) {
        this();
    }

    private SessionChange() {
    }
}
