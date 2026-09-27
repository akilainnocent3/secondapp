package com.yandex.div.core.view2.spannable;

import k.k;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class MaskData {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Particles extends MaskData {
        private final int color;
        private final float density;
        private final boolean isAnimated;
        private final boolean isEnabled;
        private final float particleSize;

        public Particles(@k int i10, float f10, boolean z10, boolean z11, float f11) {
            super(null);
            this.color = i10;
            this.density = f10;
            this.isAnimated = z10;
            this.isEnabled = z11;
            this.particleSize = f11;
        }

        public static /* synthetic */ Particles copy$default(Particles particles, int i10, float f10, boolean z10, boolean z11, float f11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = particles.color;
            }
            if ((i11 & 2) != 0) {
                f10 = particles.density;
            }
            if ((i11 & 4) != 0) {
                z10 = particles.isAnimated;
            }
            if ((i11 & 8) != 0) {
                z11 = particles.isEnabled;
            }
            if ((i11 & 16) != 0) {
                f11 = particles.particleSize;
            }
            float f12 = f11;
            boolean z12 = z10;
            return particles.copy(i10, f10, z12, z11, f12);
        }

        public final int component1() {
            return this.color;
        }

        public final float component2() {
            return this.density;
        }

        public final boolean component3() {
            return this.isAnimated;
        }

        public final boolean component4() {
            return this.isEnabled;
        }

        public final float component5() {
            return this.particleSize;
        }

        @l
        public final Particles copy(@k int i10, float f10, boolean z10, boolean z11, float f11) {
            return new Particles(i10, f10, z10, z11, f11);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Particles)) {
                return false;
            }
            Particles particles = (Particles) obj;
            return this.color == particles.color && Float.compare(this.density, particles.density) == 0 && this.isAnimated == particles.isAnimated && this.isEnabled == particles.isEnabled && Float.compare(this.particleSize, particles.particleSize) == 0;
        }

        public final int getColor() {
            return this.color;
        }

        public final float getDensity() {
            return this.density;
        }

        public final float getParticleSize() {
            return this.particleSize;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public int hashCode() {
            int iFloatToIntBits = ((this.color * 31) + Float.floatToIntBits(this.density)) * 31;
            boolean z10 = this.isAnimated;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int i10 = (iFloatToIntBits + r10) * 31;
            boolean z11 = this.isEnabled;
            return ((i10 + (z11 ? 1 : z11)) * 31) + Float.floatToIntBits(this.particleSize);
        }

        public final boolean isAnimated() {
            return this.isAnimated;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        @l
        public String toString() {
            return "Particles(color=" + this.color + ", density=" + this.density + ", isAnimated=" + this.isAnimated + ", isEnabled=" + this.isEnabled + ", particleSize=" + this.particleSize + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Solid extends MaskData {
        private final int color;
        private final boolean isEnabled;

        public Solid(@k int i10, boolean z10) {
            super(null);
            this.color = i10;
            this.isEnabled = z10;
        }

        public static /* synthetic */ Solid copy$default(Solid solid, int i10, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = solid.color;
            }
            if ((i11 & 2) != 0) {
                z10 = solid.isEnabled;
            }
            return solid.copy(i10, z10);
        }

        public final int component1() {
            return this.color;
        }

        public final boolean component2() {
            return this.isEnabled;
        }

        @l
        public final Solid copy(@k int i10, boolean z10) {
            return new Solid(i10, z10);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Solid)) {
                return false;
            }
            Solid solid = (Solid) obj;
            return this.color == solid.color && this.isEnabled == solid.isEnabled;
        }

        public final int getColor() {
            return this.color;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int i10 = this.color * 31;
            boolean z10 = this.isEnabled;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return i10 + r10;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        @l
        public String toString() {
            return "Solid(color=" + this.color + ", isEnabled=" + this.isEnabled + ')';
        }
    }

    public /* synthetic */ MaskData(x xVar) {
        this();
    }

    private MaskData() {
    }
}
