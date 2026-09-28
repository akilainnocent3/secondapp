package com.sportygames.crash.models;

import com.sportygames.sportyherov2.remote.models.RainTopicResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/sportygames/crash/models/RainUiAction;", "", "<init>", "()V", "SetCloudIcon", "HideToasts", "ShowActiveToast", "DeferActiveToastUntilMultiplierVisible", "Lcom/sportygames/crash/models/RainUiAction$DeferActiveToastUntilMultiplierVisible;", "Lcom/sportygames/crash/models/RainUiAction$HideToasts;", "Lcom/sportygames/crash/models/RainUiAction$SetCloudIcon;", "Lcom/sportygames/crash/models/RainUiAction$ShowActiveToast;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RainUiAction {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportygames/crash/models/RainUiAction$DeferActiveToastUntilMultiplierVisible;", "Lcom/sportygames/crash/models/RainUiAction;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeferActiveToastUntilMultiplierVisible extends RainUiAction {
        public static final int $stable = 0;
        public static final DeferActiveToastUntilMultiplierVisible INSTANCE = new DeferActiveToastUntilMultiplierVisible();

        private DeferActiveToastUntilMultiplierVisible() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportygames/crash/models/RainUiAction$HideToasts;", "Lcom/sportygames/crash/models/RainUiAction;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HideToasts extends RainUiAction {
        public static final int $stable = 0;
        public static final HideToasts INSTANCE = new HideToasts();

        private HideToasts() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sportygames/crash/models/RainUiAction$SetCloudIcon;", "Lcom/sportygames/crash/models/RainUiAction;", "enabled", "", "type", "", "<init>", "(ZLjava/lang/String;)V", "getEnabled", "()Z", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetCloudIcon extends RainUiAction {
        public static final int $stable = 0;
        private final boolean enabled;
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetCloudIcon(boolean z, String str) {
            super(null);
            str.getClass();
            this.enabled = z;
            this.type = str;
        }

        public static /* synthetic */ SetCloudIcon copy$default(SetCloudIcon setCloudIcon, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = setCloudIcon.enabled;
            }
            if ((i & 2) != 0) {
                str = setCloudIcon.type;
            }
            return setCloudIcon.copy(z, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final SetCloudIcon copy(boolean enabled, String type) {
            type.getClass();
            return new SetCloudIcon(enabled, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetCloudIcon)) {
                return false;
            }
            SetCloudIcon setCloudIcon = (SetCloudIcon) other;
            return this.enabled == setCloudIcon.enabled && Intrinsics.g(this.type, setCloudIcon.type);
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (Boolean.hashCode(this.enabled) * 31);
        }

        public String toString() {
            return "SetCloudIcon(enabled=" + this.enabled + ", type=" + this.type + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/sportygames/crash/models/RainUiAction$ShowActiveToast;", "Lcom/sportygames/crash/models/RainUiAction;", "topicResponse", "Lcom/sportygames/sportyherov2/remote/models/RainTopicResponse;", "<init>", "(Lcom/sportygames/sportyherov2/remote/models/RainTopicResponse;)V", "getTopicResponse", "()Lcom/sportygames/sportyherov2/remote/models/RainTopicResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowActiveToast extends RainUiAction {
        public static final int $stable = 0;
        private final RainTopicResponse topicResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowActiveToast(RainTopicResponse rainTopicResponse) {
            super(null);
            rainTopicResponse.getClass();
            this.topicResponse = rainTopicResponse;
        }

        public static /* synthetic */ ShowActiveToast copy$default(ShowActiveToast showActiveToast, RainTopicResponse rainTopicResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                rainTopicResponse = showActiveToast.topicResponse;
            }
            return showActiveToast.copy(rainTopicResponse);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RainTopicResponse getTopicResponse() {
            return this.topicResponse;
        }

        public final ShowActiveToast copy(RainTopicResponse topicResponse) {
            topicResponse.getClass();
            return new ShowActiveToast(topicResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowActiveToast) && Intrinsics.g(this.topicResponse, ((ShowActiveToast) other).topicResponse);
        }

        public final RainTopicResponse getTopicResponse() {
            return this.topicResponse;
        }

        public int hashCode() {
            return this.topicResponse.hashCode();
        }

        public String toString() {
            return "ShowActiveToast(topicResponse=" + this.topicResponse + ")";
        }
    }

    public /* synthetic */ RainUiAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RainUiAction() {
    }
}
