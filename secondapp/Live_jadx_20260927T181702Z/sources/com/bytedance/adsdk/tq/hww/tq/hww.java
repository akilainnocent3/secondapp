package com.bytedance.adsdk.tq.hww.tq;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class hww<K, A> {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final sd<K> f32071hv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    protected com.bytedance.adsdk.tq.vgm.tq<A> f32073sd;
    final List<InterfaceC0297hww> hww = new ArrayList(1);
    private boolean vy = false;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected float f32074tq = 0.0f;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private A f32070hu = null;
    private float vgm = -1.0f;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private float f32072ok = -1.0f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class hv<T> implements sd<T> {
        private final com.bytedance.adsdk.tq.vgm.hww<T> hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private float f32075tq = -1.0f;

        public hv(List<? extends com.bytedance.adsdk.tq.vgm.hww<T>> list) {
            this.hww = list.get(0);
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public boolean hww() {
            return false;
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public float sd() {
            return this.hww.sd();
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public com.bytedance.adsdk.tq.vgm.hww<T> tq() {
            return this.hww;
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public float vy() {
            return this.hww.vy();
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public boolean hww(float f10) {
            return !this.hww.hv();
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public boolean tq(float f10) {
            if (this.f32075tq == f10) {
                return true;
            }
            this.f32075tq = f10;
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.tq.hww.tq.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0297hww {
        void hww();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface sd<T> {
        boolean hww();

        boolean hww(float f10);

        float sd();

        com.bytedance.adsdk.tq.vgm.hww<T> tq();

        boolean tq(float f10);

        float vy();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class tq<T> implements sd<T> {
        private tq() {
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public boolean hww() {
            return true;
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public float sd() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public com.bytedance.adsdk.tq.vgm.hww<T> tq() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public float vy() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public boolean hww(float f10) {
            return false;
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public boolean tq(float f10) {
            throw new IllegalStateException("not implemented");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class vy<T> implements sd<T> {
        private final List<? extends com.bytedance.adsdk.tq.vgm.hww<T>> hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private com.bytedance.adsdk.tq.vgm.hww<T> f32076sd = null;
        private float vy = -1.0f;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private com.bytedance.adsdk.tq.vgm.hww<T> f32077tq = sd(0.0f);

        public vy(List<? extends com.bytedance.adsdk.tq.vgm.hww<T>> list) {
            this.hww = list;
        }

        private com.bytedance.adsdk.tq.vgm.hww<T> sd(float f10) {
            List<? extends com.bytedance.adsdk.tq.vgm.hww<T>> list = this.hww;
            com.bytedance.adsdk.tq.vgm.hww<T> hwwVar = list.get(list.size() - 1);
            if (f10 >= hwwVar.sd()) {
                return hwwVar;
            }
            for (int size = this.hww.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.tq.vgm.hww<T> hwwVar2 = this.hww.get(size);
                if (this.f32077tq != hwwVar2 && hwwVar2.hww(f10)) {
                    return hwwVar2;
                }
            }
            return this.hww.get(0);
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public boolean hww() {
            return false;
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public com.bytedance.adsdk.tq.vgm.hww<T> tq() {
            return this.f32077tq;
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public float vy() {
            List<? extends com.bytedance.adsdk.tq.vgm.hww<T>> list = this.hww;
            return list.get(list.size() - 1).vy();
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public boolean hww(float f10) {
            if (this.f32077tq.hww(f10)) {
                return !this.f32077tq.hv();
            }
            this.f32077tq = sd(f10);
            return true;
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public boolean tq(float f10) {
            com.bytedance.adsdk.tq.vgm.hww<T> hwwVar = this.f32076sd;
            com.bytedance.adsdk.tq.vgm.hww<T> hwwVar2 = this.f32077tq;
            if (hwwVar == hwwVar2 && this.vy == f10) {
                return true;
            }
            this.f32076sd = hwwVar2;
            this.vy = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.tq.hww.tq.hww.sd
        public float sd() {
            return this.hww.get(0).sd();
        }
    }

    public hww(List<? extends com.bytedance.adsdk.tq.vgm.hww<K>> list) {
        this.f32071hv = hww(list);
    }

    private float rs() {
        if (this.vgm == -1.0f) {
            this.vgm = this.f32071hv.sd();
        }
        return this.vgm;
    }

    public float hu() {
        if (this.f32072ok == -1.0f) {
            this.f32072ok = this.f32071hv.vy();
        }
        return this.f32072ok;
    }

    public float hv() {
        com.bytedance.adsdk.tq.vgm.hww<K> hwwVarSd = sd();
        if (hwwVarSd == null || hwwVarSd.hv()) {
            return 0.0f;
        }
        return hwwVarSd.f32351sd.getInterpolation(vy());
    }

    public abstract A hww(com.bytedance.adsdk.tq.vgm.hww<K> hwwVar, float f10);

    public void hww() {
        this.vy = true;
    }

    public float ok() {
        return this.f32074tq;
    }

    public com.bytedance.adsdk.tq.vgm.hww<K> sd() {
        com.bytedance.adsdk.tq.hv.hww("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.tq.vgm.hww<K> hwwVarTq = this.f32071hv.tq();
        com.bytedance.adsdk.tq.hv.tq("BaseKeyframeAnimation#getCurrentKeyframe");
        return hwwVarTq;
    }

    public void tq() {
        for (int i10 = 0; i10 < this.hww.size(); i10++) {
            this.hww.get(i10).hww();
        }
    }

    public A vgm() {
        float fVy = vy();
        if (this.f32073sd == null && this.f32071hv.tq(fVy)) {
            return this.f32070hu;
        }
        com.bytedance.adsdk.tq.vgm.hww<K> hwwVarSd = sd();
        Interpolator interpolator = hwwVarSd.vy;
        A aHww = (interpolator == null || hwwVarSd.f32347hv == null) ? hww(hwwVarSd, hv()) : hww(hwwVarSd, fVy, interpolator.getInterpolation(fVy), hwwVarSd.f32347hv.getInterpolation(fVy));
        this.f32070hu = aHww;
        return aHww;
    }

    public float vy() {
        if (this.vy) {
            return 0.0f;
        }
        com.bytedance.adsdk.tq.vgm.hww<K> hwwVarSd = sd();
        if (hwwVarSd.hv()) {
            return 0.0f;
        }
        return (this.f32074tq - hwwVarSd.sd()) / (hwwVarSd.vy() - hwwVarSd.sd());
    }

    public void hww(InterfaceC0297hww interfaceC0297hww) {
        this.hww.add(interfaceC0297hww);
    }

    public void hww(float f10) {
        if (this.f32071hv.hww()) {
            return;
        }
        if (f10 < rs()) {
            f10 = rs();
        } else if (f10 > hu()) {
            f10 = hu();
        }
        if (f10 == this.f32074tq) {
            return;
        }
        this.f32074tq = f10;
        if (this.f32071hv.hww(f10)) {
            tq();
        }
    }

    public A hww(com.bytedance.adsdk.tq.vgm.hww<K> hwwVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> sd<T> hww(List<? extends com.bytedance.adsdk.tq.vgm.hww<T>> list) {
        if (list.isEmpty()) {
            return new tq();
        }
        if (list.size() == 1) {
            return new hv(list);
        }
        return new vy(list);
    }
}
