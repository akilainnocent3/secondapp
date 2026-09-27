package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ny extends YogaNodeJNIBase {
    public void ed() {
        long j10 = this.hww;
        if (j10 != 0) {
            this.hww = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j10);
        }
    }

    public void finalize() throws Throwable {
        try {
            ed();
        } finally {
            super.finalize();
        }
    }
}
