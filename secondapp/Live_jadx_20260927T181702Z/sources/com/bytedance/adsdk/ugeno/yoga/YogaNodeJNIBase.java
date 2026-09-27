package com.bytedance.adsdk.ugeno.yoga;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@com.bytedance.adsdk.ugeno.yoga.hww.hww
public abstract class YogaNodeJNIBase extends nod implements Cloneable {

    @com.bytedance.adsdk.ugeno.yoga.hww.hww
    private float[] arr;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private Object f32790hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private tq f32791hv;
    protected long hww;

    @com.bytedance.adsdk.ugeno.yoga.hww.hww
    private int mLayoutDirection;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private List<YogaNodeJNIBase> f32792sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private YogaNodeJNIBase f32793tq;
    private boolean vgm;
    private vgm vy;

    private YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.vgm = true;
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.hww = j10;
    }

    @com.bytedance.adsdk.ugeno.yoga.hww.hww
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List<YogaNodeJNIBase> list = this.f32792sd;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i10);
        this.f32792sd.add(i10, yogaNodeJNIBase);
        yogaNodeJNIBase.f32793tq = this;
        return yogaNodeJNIBase.hww;
    }

    @com.bytedance.adsdk.ugeno.yoga.hww.hww
    public final float baseline(float f10, float f11) {
        return this.f32791hv.hww(this, f10, f11);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hu(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.hww, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hv(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.hww, f10);
    }

    @com.bytedance.adsdk.ugeno.yoga.hww.hww
    public final long measure(float f10, int i10, float f11, int i11) {
        if (ny()) {
            return this.vy.hww(this, f10, ok.hww(i10), f11, ok.hww(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void nod(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.hww, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void ny(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.hww, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void ok(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.hww, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void rs(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.hww, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    /* JADX INFO: renamed from: sd, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase hww(int i10) {
        List<YogaNodeJNIBase> list = this.f32792sd;
        if (list != null) {
            return list.get(i10);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void vgm(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.hww, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    /* JADX INFO: renamed from: vhb, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase tq() {
        return this.f32793tq;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    /* JADX INFO: renamed from: vy, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase tq(int i10) {
        List<YogaNodeJNIBase> list = this.f32792sd;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i10);
        yogaNodeJNIBaseRemove.f32793tq = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.hww, yogaNodeJNIBaseRemove.hww);
        return yogaNodeJNIBaseRemove;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public float hu() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hv() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.hww);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public int hww() {
        List<YogaNodeJNIBase> list = this.f32792sd;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public Object nod() {
        return this.f32790hu;
    }

    public boolean ny() {
        return this.vy != null;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public float ok() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public float rs() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public float vgm() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void vhb(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.hww, f10);
    }

    private void tq(nod nodVar) {
        nod();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hww(nod nodVar, int i10) {
        if (nodVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) nodVar;
            if (yogaNodeJNIBase.f32793tq == null) {
                if (this.f32792sd == null) {
                    this.f32792sd = new ArrayList(4);
                }
                this.f32792sd.add(i10, yogaNodeJNIBase);
                yogaNodeJNIBase.f32793tq = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.hww, yogaNodeJNIBase.hww, i10);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void sd(hww hwwVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.hww, hwwVar.hww());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void tq(hww hwwVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.hww, hwwVar.hww());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void sd(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.hww, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void tq(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.hww, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void sd() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.hww);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void tq(vy vyVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.hww, vyVar.hww(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void vy(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.hww, f10);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void sd(vy vyVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.hww, vyVar.hww(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void vy() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.hww);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public int hww(nod nodVar) {
        List<YogaNodeJNIBase> list = this.f32792sd;
        if (list == null) {
            return -1;
        }
        return list.indexOf(nodVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hww(float f10, float f11) {
        tq((nod) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f32792sd;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.tq(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].hww;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.hww, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hww(sd sdVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.hww, sdVar.hww());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hww(hv hvVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.hww, hvVar.hww());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hww(hu huVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.hww, huVar.hww());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hww(hww hwwVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.hww, hwwVar.hww());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hww(ed edVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.hww, edVar.hww());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hww(khx khxVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.hww, khxVar.hww());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hww(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.hww, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hww(vy vyVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.hww, vyVar.hww(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hww(vgm vgmVar) {
        this.vy = vgmVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.hww, vgmVar != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hww(boolean z10) {
        YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(this.hww, z10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.nod
    public void hww(Object obj) {
        this.f32790hu = obj;
    }
}
