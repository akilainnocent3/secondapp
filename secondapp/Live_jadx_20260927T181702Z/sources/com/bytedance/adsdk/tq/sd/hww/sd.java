package com.bytedance.adsdk.tq.sd.hww;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class sd extends khx<com.bytedance.adsdk.tq.sd.tq.vy, com.bytedance.adsdk.tq.sd.tq.vy> {
    public sd(List<com.bytedance.adsdk.tq.vgm.hww<com.bytedance.adsdk.tq.sd.tq.vy>> list) {
        super(hww(list));
    }

    private static List<com.bytedance.adsdk.tq.vgm.hww<com.bytedance.adsdk.tq.sd.tq.vy>> hww(List<com.bytedance.adsdk.tq.vgm.hww<com.bytedance.adsdk.tq.sd.tq.vy>> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, hww(list.get(i10)));
        }
        return list;
    }

    @Override // com.bytedance.adsdk.tq.sd.hww.khx, com.bytedance.adsdk.tq.sd.hww.ed
    public /* bridge */ /* synthetic */ List sd() {
        return super.sd();
    }

    @Override // com.bytedance.adsdk.tq.sd.hww.khx
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.bytedance.adsdk.tq.sd.hww.khx, com.bytedance.adsdk.tq.sd.hww.ed
    public /* bridge */ /* synthetic */ boolean tq() {
        return super.tq();
    }

    private static com.bytedance.adsdk.tq.vgm.hww<com.bytedance.adsdk.tq.sd.tq.vy> hww(com.bytedance.adsdk.tq.vgm.hww<com.bytedance.adsdk.tq.sd.tq.vy> hwwVar) {
        com.bytedance.adsdk.tq.sd.tq.vy vyVar = hwwVar.hww;
        com.bytedance.adsdk.tq.sd.tq.vy vyVar2 = hwwVar.f32352tq;
        if (vyVar == null || vyVar2 == null || vyVar.hww().length == vyVar2.hww().length) {
            return hwwVar;
        }
        float[] fArrHww = hww(vyVar.hww(), vyVar2.hww());
        return hwwVar.hww(vyVar.hww(fArrHww), vyVar2.hww(fArrHww));
    }

    public static float[] hww(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    @Override // com.bytedance.adsdk.tq.sd.hww.ed
    public com.bytedance.adsdk.tq.hww.tq.hww<com.bytedance.adsdk.tq.sd.tq.vy, com.bytedance.adsdk.tq.sd.tq.vy> hww() {
        return new com.bytedance.adsdk.tq.hww.tq.hv(this.hww);
    }
}
