package com.unity3d.ads.core.data.datasource;

import f0.i;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class VolumeSettingsChange {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class MuteChange extends VolumeSettingsChange {
        private final boolean isMuted;

        public MuteChange(boolean z10) {
            super(null);
            this.isMuted = z10;
        }

        public static /* synthetic */ MuteChange copy$default(MuteChange muteChange, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = muteChange.isMuted;
            }
            return muteChange.copy(z10);
        }

        public final boolean component1() {
            return this.isMuted;
        }

        @l
        public final MuteChange copy(boolean z10) {
            return new MuteChange(z10);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MuteChange) && this.isMuted == ((MuteChange) obj).isMuted;
        }

        public int hashCode() {
            boolean z10 = this.isMuted;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public final boolean isMuted() {
            return this.isMuted;
        }

        @l
        public String toString() {
            return "MuteChange(isMuted=" + this.isMuted + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class VolumeChange extends VolumeSettingsChange {
        private final double volume;

        public VolumeChange(double d10) {
            super(null);
            this.volume = d10;
        }

        public static /* synthetic */ VolumeChange copy$default(VolumeChange volumeChange, double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = volumeChange.volume;
            }
            return volumeChange.copy(d10);
        }

        public final double component1() {
            return this.volume;
        }

        @l
        public final VolumeChange copy(double d10) {
            return new VolumeChange(d10);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VolumeChange) && Double.compare(this.volume, ((VolumeChange) obj).volume) == 0;
        }

        public final double getVolume() {
            return this.volume;
        }

        public int hashCode() {
            return i.a(this.volume);
        }

        @l
        public String toString() {
            return "VolumeChange(volume=" + this.volume + ')';
        }
    }

    public /* synthetic */ VolumeSettingsChange(x xVar) {
        this();
    }

    private VolumeSettingsChange() {
    }
}
