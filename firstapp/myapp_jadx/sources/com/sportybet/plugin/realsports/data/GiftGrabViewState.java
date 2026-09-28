package com.sportybet.plugin.realsports.data;

import com.sporty.android.common_ui.uitext.UiText;
import defpackage.xh8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabViewState;", "", "title", "Lcom/sporty/android/common_ui/uitext/UiText;", "getTitle", "()Lcom/sporty/android/common_ui/uitext/UiText;", "Idle", "Running", "Lcom/sportybet/plugin/realsports/data/GiftGrabViewState$Idle;", "Lcom/sportybet/plugin/realsports/data/GiftGrabViewState$Running;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface GiftGrabViewState {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0012"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabViewState$Idle;", "Lcom/sportybet/plugin/realsports/data/GiftGrabViewState;", "title", "Lcom/sporty/android/common_ui/uitext/UiText;", "<init>", "(Lcom/sporty/android/common_ui/uitext/UiText;)V", "getTitle", "()Lcom/sporty/android/common_ui/uitext/UiText;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Idle implements GiftGrabViewState {
        public static final int $stable = 0;
        private final UiText title;

        public Idle(UiText uiText) {
            uiText.getClass();
            this.title = uiText;
        }

        public static /* synthetic */ Idle copy$default(Idle idle, UiText uiText, int i, Object obj) {
            if ((i & 1) != 0) {
                uiText = idle.title;
            }
            return idle.copy(uiText);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final UiText getTitle() {
            return this.title;
        }

        public final Idle copy(UiText title) {
            title.getClass();
            return new Idle(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Idle) && Intrinsics.g(this.title, ((Idle) other).title);
        }

        @Override // com.sportybet.plugin.realsports.data.GiftGrabViewState
        public UiText getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return xh8.a(this.title, "Idle(title=", ")");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabViewState$Running;", "Lcom/sportybet/plugin/realsports/data/GiftGrabViewState;", "title", "Lcom/sporty/android/common_ui/uitext/UiText;", "giftGrabButtonStatus", "Lcom/sportybet/plugin/realsports/data/GiftGrabButtonStatus;", "<init>", "(Lcom/sporty/android/common_ui/uitext/UiText;Lcom/sportybet/plugin/realsports/data/GiftGrabButtonStatus;)V", "getTitle", "()Lcom/sporty/android/common_ui/uitext/UiText;", "getGiftGrabButtonStatus", "()Lcom/sportybet/plugin/realsports/data/GiftGrabButtonStatus;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Running implements GiftGrabViewState {
        public static final int $stable = 8;
        private final GiftGrabButtonStatus giftGrabButtonStatus;
        private final UiText title;

        public Running(UiText uiText, GiftGrabButtonStatus giftGrabButtonStatus) {
            uiText.getClass();
            giftGrabButtonStatus.getClass();
            this.title = uiText;
            this.giftGrabButtonStatus = giftGrabButtonStatus;
        }

        public static /* synthetic */ Running copy$default(Running running, UiText uiText, GiftGrabButtonStatus giftGrabButtonStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                uiText = running.title;
            }
            if ((i & 2) != 0) {
                giftGrabButtonStatus = running.giftGrabButtonStatus;
            }
            return running.copy(uiText, giftGrabButtonStatus);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final UiText getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final GiftGrabButtonStatus getGiftGrabButtonStatus() {
            return this.giftGrabButtonStatus;
        }

        public final Running copy(UiText title, GiftGrabButtonStatus giftGrabButtonStatus) {
            title.getClass();
            giftGrabButtonStatus.getClass();
            return new Running(title, giftGrabButtonStatus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Running)) {
                return false;
            }
            Running running = (Running) other;
            return Intrinsics.g(this.title, running.title) && Intrinsics.g(this.giftGrabButtonStatus, running.giftGrabButtonStatus);
        }

        public final GiftGrabButtonStatus getGiftGrabButtonStatus() {
            return this.giftGrabButtonStatus;
        }

        @Override // com.sportybet.plugin.realsports.data.GiftGrabViewState
        public UiText getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.giftGrabButtonStatus.hashCode() + (this.title.hashCode() * 31);
        }

        public String toString() {
            return "Running(title=" + this.title + ", giftGrabButtonStatus=" + this.giftGrabButtonStatus + ")";
        }
    }

    UiText getTitle();
}
