package com.sportybet.plugin.realsports.data;

import defpackage.b6c;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabButtonStatus;", "", "Loading", "Loaded", "Lcom/sportybet/plugin/realsports/data/GiftGrabButtonStatus$Loaded;", "Lcom/sportybet/plugin/realsports/data/GiftGrabButtonStatus$Loading;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface GiftGrabButtonStatus {

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0010"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabButtonStatus$Loaded;", "Lcom/sportybet/plugin/realsports/data/GiftGrabButtonStatus;", "isEnable", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Loaded implements GiftGrabButtonStatus {
        public static final int $stable = 0;
        private final boolean isEnable;

        public Loaded(boolean z) {
            this.isEnable = z;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loaded.isEnable;
            }
            return loaded.copy(z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsEnable() {
            return this.isEnable;
        }

        public final Loaded copy(boolean isEnable) {
            return new Loaded(isEnable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && this.isEnable == ((Loaded) other).isEnable;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isEnable);
        }

        public final boolean isEnable() {
            return this.isEnable;
        }

        public String toString() {
            return b6c.a("Loaded(isEnable=", ")", this.isEnable);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabButtonStatus$Loading;", "Lcom/sportybet/plugin/realsports/data/GiftGrabButtonStatus;", "<init>", "()V", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Loading implements GiftGrabButtonStatus {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }
}
