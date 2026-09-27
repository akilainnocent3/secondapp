package com.bytedance.adsdk.ugeno.hv;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import fw.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
class vy {

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    static final /* synthetic */ boolean f32490sd = true;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private long[] f32491hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private boolean[] f32492hv;
    int[] hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    long[] f32493tq;
    private final com.bytedance.adsdk.ugeno.hv.hww vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        List<sd> hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        int f32494tq;

        public void hww() {
            this.hww = null;
            this.f32494tq = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class tq implements Comparable<tq> {
        int hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        int f32495tq;

        private tq() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public int compareTo(tq tqVar) {
            int i10 = this.f32495tq;
            int i11 = tqVar.f32495tq;
            return i10 != i11 ? i10 - i11 : this.hww - tqVar.hww;
        }

        public String toString() {
            return "Order{order=" + this.f32495tq + ", index=" + this.hww + b.f85383j;
        }
    }

    public vy(com.bytedance.adsdk.ugeno.hv.hww hwwVar) {
        this.vy = hwwVar;
    }

    private int hu(com.bytedance.adsdk.ugeno.hv.tq tqVar, boolean z10) {
        return z10 ? tqVar.wgt() : tqVar.weu();
    }

    private int hv(com.bytedance.adsdk.ugeno.hv.tq tqVar, boolean z10) {
        return z10 ? tqVar.khx() : tqVar.ed();
    }

    private int sd(boolean z10) {
        return z10 ? this.vy.getPaddingTop() : this.vy.getPaddingStart();
    }

    private int vy(boolean z10) {
        return z10 ? this.vy.getPaddingBottom() : this.vy.getPaddingEnd();
    }

    public int hww(long j10) {
        return (int) j10;
    }

    public int tq(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] hww(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.vy.getFlexItemCount();
        List<tq> listTq = tq(flexItemCount);
        tq tqVar = new tq();
        if (view == null || !(layoutParams instanceof com.bytedance.adsdk.ugeno.hv.tq)) {
            tqVar.f32495tq = 1;
        } else {
            tqVar.f32495tq = ((com.bytedance.adsdk.ugeno.hv.tq) layoutParams).sd();
        }
        if (i10 == -1 || i10 == flexItemCount || i10 >= this.vy.getFlexItemCount()) {
            tqVar.hww = flexItemCount;
        } else {
            tqVar.hww = i10;
            while (i10 < flexItemCount) {
                listTq.get(i10).hww++;
                i10++;
            }
        }
        listTq.add(tqVar);
        return hww(flexItemCount + 1, listTq, sparseIntArray);
    }

    public long tq(int i10, int i11) {
        return (((long) i10) & 4294967295L) | (((long) i11) << 32);
    }

    private int sd(com.bytedance.adsdk.ugeno.hv.tq tqVar, boolean z10) {
        if (z10) {
            return tqVar.ed();
        }
        return tqVar.khx();
    }

    private List<tq> tq(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            com.bytedance.adsdk.ugeno.hv.tq tqVar = (com.bytedance.adsdk.ugeno.hv.tq) this.vy.hww(i11).getLayoutParams();
            tq tqVar2 = new tq();
            tqVar2.f32495tq = tqVar.sd();
            tqVar2.hww = i11;
            arrayList.add(tqVar2);
        }
        return arrayList;
    }

    private int vy(com.bytedance.adsdk.ugeno.hv.tq tqVar, boolean z10) {
        if (z10) {
            return tqVar.weu();
        }
        return tqVar.wgt();
    }

    private void sd(int i10) {
        boolean[] zArr = this.f32492hv;
        if (zArr == null) {
            this.f32492hv = new boolean[Math.max(i10, 10)];
        } else if (zArr.length < i10) {
            this.f32492hv = new boolean[Math.max(zArr.length * 2, i10)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public boolean tq(SparseIntArray sparseIntArray) {
        int flexItemCount = this.vy.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View viewHww = this.vy.hww(i10);
            if (viewHww != null && ((com.bytedance.adsdk.ugeno.hv.tq) viewHww.getLayoutParams()).sd() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    public void tq(hww hwwVar, int i10, int i11) {
        hww(hwwVar, i11, i10, Integer.MAX_VALUE, 0, -1, (List<sd>) null);
    }

    private int tq(boolean z10) {
        if (z10) {
            return this.vy.getPaddingEnd();
        }
        return this.vy.getPaddingBottom();
    }

    public int[] hww(SparseIntArray sparseIntArray) {
        int flexItemCount = this.vy.getFlexItemCount();
        return hww(flexItemCount, tq(flexItemCount), sparseIntArray);
    }

    private int tq(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int[] hww(int i10, List<tq> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (tq tqVar : list) {
            int i12 = tqVar.hww;
            iArr[i11] = i12;
            sparseIntArray.append(i12, tqVar.f32495tq);
            i11++;
        }
        return iArr;
    }

    private int tq(com.bytedance.adsdk.ugeno.hv.tq tqVar, boolean z10) {
        if (z10) {
            return tqVar.tq();
        }
        return tqVar.hww();
    }

    private void tq(int i10, int i11, sd sdVar, int i12, int i13, boolean z10) {
        float f10;
        float f11;
        int iMax;
        int iVgm;
        int i14 = sdVar.f32484hv;
        float f12 = sdVar.vhb;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 > i14) {
            return;
        }
        float f14 = (i14 - i12) / f12;
        sdVar.f32484hv = i13 + sdVar.f32483hu;
        if (!z10) {
            sdVar.vgm = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z11 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < sdVar.f32486ok) {
            int i17 = sdVar.weu + i15;
            View viewTq = this.vy.tq(i17);
            if (viewTq == null || viewTq.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
            } else {
                com.bytedance.adsdk.ugeno.hv.tq tqVar = (com.bytedance.adsdk.ugeno.hv.tq) viewTq.getLayoutParams();
                int flexDirection = this.vy.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewTq.getMeasuredHeight();
                    long[] jArr = this.f32491hu;
                    if (jArr != null) {
                        measuredHeight = tq(jArr[i17]);
                    }
                    int measuredWidth = viewTq.getMeasuredWidth();
                    long[] jArr2 = this.f32491hu;
                    if (jArr2 != null) {
                        measuredWidth = hww(jArr2[i17]);
                    }
                    if (!this.f32492hv[i17] && tqVar.hv() > f10) {
                        float fHv = measuredHeight - (tqVar.hv() * f14);
                        if (i15 == sdVar.f32486ok - 1) {
                            fHv += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fHv);
                        if (iRound < tqVar.ok()) {
                            iRound = tqVar.ok();
                            this.f32492hv[i17] = true;
                            sdVar.vhb -= tqVar.hv();
                            z11 = true;
                        } else {
                            f15 += fHv - iRound;
                            double d10 = f15;
                            if (d10 > 1.0d) {
                                iRound++;
                                f15 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                iRound--;
                                f15 += 1.0f;
                            }
                        }
                        int iHww = hww(i10, tqVar, sdVar.f32482ed);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewTq.measure(iHww, iMakeMeasureSpec);
                        int measuredWidth2 = viewTq.getMeasuredWidth();
                        int measuredHeight2 = viewTq.getMeasuredHeight();
                        hww(i17, iHww, iMakeMeasureSpec, viewTq);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i16, measuredWidth + tqVar.ed() + tqVar.weu() + this.vy.hww(viewTq));
                    sdVar.f32484hv += measuredHeight + tqVar.khx() + tqVar.wgt();
                    f11 = f14;
                } else {
                    int measuredWidth3 = viewTq.getMeasuredWidth();
                    long[] jArr3 = this.f32491hu;
                    if (jArr3 != null) {
                        measuredWidth3 = hww(jArr3[i17]);
                    }
                    int measuredHeight3 = viewTq.getMeasuredHeight();
                    long[] jArr4 = this.f32491hu;
                    f11 = f14;
                    if (jArr4 != null) {
                        measuredHeight3 = tq(jArr4[i17]);
                    }
                    if (!this.f32492hv[i17] && tqVar.hv() > f10) {
                        float fHv2 = measuredWidth3 - (f11 * tqVar.hv());
                        if (i15 == sdVar.f32486ok - 1) {
                            fHv2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fHv2);
                        if (iRound2 < tqVar.vgm()) {
                            iVgm = tqVar.vgm();
                            this.f32492hv[i17] = true;
                            sdVar.vhb -= tqVar.hv();
                            z11 = true;
                        } else {
                            f15 += fHv2 - iRound2;
                            double d11 = f15;
                            if (d11 > 1.0d) {
                                iVgm = iRound2 + 1;
                                f15 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                iVgm = iRound2 - 1;
                                f15 += 1.0f;
                            } else {
                                iVgm = iRound2;
                            }
                        }
                        int iTq = tq(i11, tqVar, sdVar.f32482ed);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iVgm, 1073741824);
                        viewTq.measure(iMakeMeasureSpec2, iTq);
                        int measuredWidth4 = viewTq.getMeasuredWidth();
                        int measuredHeight4 = viewTq.getMeasuredHeight();
                        hww(i17, iMakeMeasureSpec2, iTq, viewTq);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i16, measuredHeight3 + tqVar.khx() + tqVar.wgt() + this.vy.hww(viewTq));
                    sdVar.f32484hv += measuredWidth3 + tqVar.ed() + tqVar.weu();
                    iMax = iMax2;
                }
                sdVar.vgm = Math.max(sdVar.vgm, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i14 == sdVar.f32484hv) {
            return;
        }
        tq(i10, i11, sdVar, i12, i13, true);
    }

    public void hww(hww hwwVar, int i10, int i11) {
        hww(hwwVar, i10, i11, Integer.MAX_VALUE, 0, -1, (List<sd>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void hww(hww hwwVar, int i10, int i11, int i12, int i13, int i14, List<sd> list) {
        int i15;
        int i16;
        int i17;
        int i18;
        int iHww;
        int i19;
        int i20;
        int i21;
        sd sdVar;
        int i22;
        int i23;
        boolean z10;
        int i24;
        boolean z11;
        int i25;
        int i26 = i10;
        boolean zHww = this.vy.hww();
        int mode = View.MeasureSpec.getMode(i26);
        int size = View.MeasureSpec.getSize(i26);
        List<sd> arrayList = list == null ? new ArrayList() : list;
        hwwVar.hww = arrayList;
        boolean z12 = i14 == -1;
        int iHww2 = hww(zHww);
        int iTq = tq(zHww);
        int iSd = sd(zHww);
        int iVy = vy(zHww);
        sd sdVar2 = new sd();
        int i27 = i13;
        sdVar2.weu = i27;
        int i28 = iHww2 + iTq;
        sdVar2.f32484hv = i28;
        int flexItemCount = this.vy.getFlexItemCount();
        boolean z13 = z12;
        sd sdVar3 = sdVar2;
        int i29 = Integer.MIN_VALUE;
        int i30 = 0;
        int iCombineMeasuredStates = 0;
        int i31 = 0;
        while (i27 < flexItemCount) {
            View viewTq = this.vy.tq(i27);
            if (viewTq == null) {
                if (hww(i27, flexItemCount, sdVar3)) {
                    hww(arrayList, sdVar3, i27, i30);
                }
                i16 = i28;
            } else {
                i16 = i28;
                if (viewTq.getVisibility() == 8) {
                    sdVar3.f32487rs++;
                    sdVar3.f32486ok++;
                    if (hww(i27, flexItemCount, sdVar3)) {
                        hww(arrayList, sdVar3, i27, i30);
                    }
                } else {
                    if (viewTq instanceof CompoundButton) {
                        hww((CompoundButton) viewTq);
                    }
                    com.bytedance.adsdk.ugeno.hv.tq tqVar = (com.bytedance.adsdk.ugeno.hv.tq) viewTq.getLayoutParams();
                    int i32 = flexItemCount;
                    if (tqVar.hu() == 4) {
                        sdVar3.khx.add(Integer.valueOf(i27));
                    }
                    int iHww3 = hww(tqVar, zHww);
                    if (tqVar.ny() != -1.0f && mode == 1073741824) {
                        iHww3 = Math.round(size * tqVar.ny());
                    }
                    if (zHww) {
                        iHww = this.vy.hww(i26, i16 + sd(tqVar, true) + vy(tqVar, true), iHww3);
                        i17 = i30;
                        int iTq2 = this.vy.tq(i11, iSd + iVy + hv(tqVar, true) + hu(tqVar, true) + i30, tq(tqVar, true));
                        viewTq.measure(iHww, iTq2);
                        hww(i27, iHww, iTq2, viewTq);
                        i18 = 0;
                    } else {
                        i17 = i30;
                        i18 = 0;
                        int iHww4 = this.vy.hww(i11, iSd + iVy + hv(tqVar, false) + hu(tqVar, false) + i17, tq(tqVar, false));
                        int iTq3 = this.vy.tq(i26, i16 + sd(tqVar, false) + vy(tqVar, false), iHww3);
                        viewTq.measure(iHww4, iTq3);
                        hww(i27, iHww4, iTq3, viewTq);
                        iHww = iTq3;
                    }
                    hww(viewTq, i27);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewTq.getMeasuredState());
                    int i33 = i18;
                    i19 = i27;
                    int i34 = iHww;
                    sd sdVar4 = sdVar3;
                    int i35 = i31;
                    i20 = i16;
                    i21 = i17;
                    boolean z14 = zHww;
                    size = size;
                    if (hww(viewTq, mode, size, sdVar3.f32484hv, hww(viewTq, zHww) + sd(tqVar, zHww) + vy(tqVar, zHww), tqVar, i19, i35, arrayList.size())) {
                        if (sdVar4.tq() > 0) {
                            hww(arrayList, sdVar4, i19 > 0 ? i19 - 1 : i33, i21);
                            i25 = i21 + sdVar4.vgm;
                        } else {
                            i25 = i21;
                        }
                        if (z14) {
                            if (tqVar.tq() == -1) {
                                com.bytedance.adsdk.ugeno.hv.hww hwwVar2 = this.vy;
                                viewTq.measure(i34, hwwVar2.tq(i11, hwwVar2.getPaddingTop() + this.vy.getPaddingBottom() + tqVar.khx() + tqVar.wgt() + i25, tqVar.tq()));
                                hww(viewTq, i19);
                            }
                        } else if (tqVar.hww() == -1) {
                            com.bytedance.adsdk.ugeno.hv.hww hwwVar3 = this.vy;
                            viewTq.measure(hwwVar3.hww(i11, hwwVar3.getPaddingLeft() + this.vy.getPaddingRight() + tqVar.ed() + tqVar.weu() + i25, tqVar.hww()), i34);
                            hww(viewTq, i19);
                        }
                        sd sdVar5 = new sd();
                        sdVar5.f32486ok = 1;
                        sdVar5.f32484hv = i20;
                        sdVar5.weu = i19;
                        i21 = i25;
                        i22 = i33;
                        sdVar = sdVar5;
                        i23 = Integer.MIN_VALUE;
                    } else {
                        sdVar = sdVar4;
                        sdVar.f32486ok++;
                        i22 = i35 + 1;
                        i23 = i29;
                    }
                    sdVar.f32481bs = (sdVar.f32481bs ? 1 : 0) | (tqVar.vy() != 0.0f ? 1 : i33);
                    sdVar.jpb = (sdVar.jpb ? 1 : 0) | (tqVar.hv() != 0.0f ? 1 : i33);
                    int[] iArr = this.hww;
                    if (iArr != null) {
                        iArr[i19] = arrayList.size();
                    }
                    z10 = z14;
                    sdVar.f32484hv += hww(viewTq, z10) + sd(tqVar, z10) + vy(tqVar, z10);
                    sdVar.nod += tqVar.vy();
                    sdVar.vhb += tqVar.hv();
                    this.vy.hww(viewTq, i19, i22, sdVar);
                    int iMax = Math.max(i23, tq(viewTq, z10) + hv(tqVar, z10) + hu(tqVar, z10) + this.vy.hww(viewTq));
                    sdVar.vgm = Math.max(sdVar.vgm, iMax);
                    if (z10) {
                        if (this.vy.getFlexWrap() != 2) {
                            sdVar.f32485ny = Math.max(sdVar.f32485ny, viewTq.getBaseline() + tqVar.khx());
                        } else {
                            sdVar.f32485ny = Math.max(sdVar.f32485ny, (viewTq.getMeasuredHeight() - viewTq.getBaseline()) + tqVar.wgt());
                        }
                    }
                    i24 = i32;
                    if (hww(i19, i24, sdVar)) {
                        hww(arrayList, sdVar, i19, i21);
                        i21 += sdVar.vgm;
                    }
                    if (i14 != -1 && arrayList.size() > 0) {
                        if (arrayList.get(arrayList.size() - 1).wgt >= i14 && i19 >= i14 && !z13) {
                            i21 = -sdVar.hww();
                            z11 = true;
                        }
                        if (i21 <= i12 && z11) {
                            i15 = iCombineMeasuredStates;
                            hwwVar.f32494tq = i15;
                        } else {
                            i29 = iMax;
                            z13 = z11;
                            i31 = i22;
                        }
                    }
                    z11 = z13;
                    if (i21 <= i12) {
                    }
                    i29 = iMax;
                    z13 = z11;
                    i31 = i22;
                }
                int i36 = i19 + 1;
                zHww = z10;
                sdVar3 = sdVar;
                i28 = i20;
                i30 = i21;
                i26 = i10;
                flexItemCount = i24;
                i27 = i36;
                mode = mode;
            }
            i19 = i27;
            mode = mode;
            i24 = flexItemCount;
            i21 = i30;
            z10 = zHww;
            i20 = i16;
            sdVar = sdVar3;
            int i37 = i19 + 1;
            zHww = z10;
            sdVar3 = sdVar;
            i28 = i20;
            i30 = i21;
            i26 = i10;
            flexItemCount = i24;
            i27 = i37;
            mode = mode;
        }
        i15 = iCombineMeasuredStates;
        hwwVar.f32494tq = i15;
    }

    private int tq(int i10, com.bytedance.adsdk.ugeno.hv.tq tqVar, int i11) {
        com.bytedance.adsdk.ugeno.hv.hww hwwVar = this.vy;
        int iTq = hwwVar.tq(i10, hwwVar.getPaddingTop() + this.vy.getPaddingBottom() + tqVar.khx() + tqVar.wgt() + i11, tqVar.tq());
        int size = View.MeasureSpec.getSize(iTq);
        if (size > tqVar.nod()) {
            return View.MeasureSpec.makeMeasureSpec(tqVar.nod(), View.MeasureSpec.getMode(iTq));
        }
        return size < tqVar.ok() ? View.MeasureSpec.makeMeasureSpec(tqVar.ok(), View.MeasureSpec.getMode(iTq)) : iTq;
    }

    public void tq(int i10, int i11, int i12) {
        int mode;
        int size;
        int flexDirection = this.vy.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
        } else {
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            mode = mode2;
            size = size2;
        }
        List<sd> flexLinesInternal = this.vy.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.vy.getSumOfCrossSize() + i12;
            int i13 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).vgm = size - i12;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.vy.getAlignContent();
                if (alignContent == 1) {
                    int i14 = size - sumOfCrossSize;
                    sd sdVar = new sd();
                    sdVar.vgm = i14;
                    flexLinesInternal.add(0, sdVar);
                    return;
                }
                if (alignContent == 2) {
                    this.vy.setFlexLines(hww(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f10 = 0.0f;
                        while (i13 < size4) {
                            arrayList.add(flexLinesInternal.get(i13));
                            if (i13 != flexLinesInternal.size() - 1) {
                                sd sdVar2 = new sd();
                                if (i13 == flexLinesInternal.size() - 2) {
                                    sdVar2.vgm = Math.round(f10 + size3);
                                    f10 = 0.0f;
                                } else {
                                    sdVar2.vgm = Math.round(size3);
                                }
                                int i15 = sdVar2.vgm;
                                f10 += size3 - i15;
                                if (f10 > 1.0f) {
                                    sdVar2.vgm = i15 + 1;
                                    f10 -= 1.0f;
                                } else if (f10 < -1.0f) {
                                    sdVar2.vgm = i15 - 1;
                                    f10 += 1.0f;
                                }
                                arrayList.add(sdVar2);
                            }
                            i13++;
                        }
                        this.vy.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.vy.setFlexLines(hww(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    sd sdVar3 = new sd();
                    sdVar3.vgm = size5;
                    for (sd sdVar4 : flexLinesInternal) {
                        arrayList2.add(sdVar3);
                        arrayList2.add(sdVar4);
                        arrayList2.add(sdVar3);
                    }
                    this.vy.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i13 < size7) {
                        sd sdVar5 = flexLinesInternal.get(i13);
                        float f12 = sdVar5.vgm + size6;
                        if (i13 == flexLinesInternal.size() - 1) {
                            f12 += f11;
                            f11 = 0.0f;
                        }
                        int iRound = Math.round(f12);
                        f11 += f12 - iRound;
                        if (f11 > 1.0f) {
                            iRound++;
                            f11 -= 1.0f;
                        } else if (f11 < -1.0f) {
                            iRound--;
                            f11 += 1.0f;
                        }
                        sdVar5.vgm = iRound;
                        i13++;
                    }
                }
            }
        }
    }

    private void hww(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.hv.tq tqVar = (com.bytedance.adsdk.ugeno.hv.tq) compoundButton.getLayoutParams();
        int iVgm = tqVar.vgm();
        int iOk = tqVar.ok();
        Drawable drawableHww = com.bytedance.adsdk.ugeno.vgm.hv.hww(compoundButton);
        int minimumWidth = drawableHww == null ? 0 : drawableHww.getMinimumWidth();
        int minimumHeight = drawableHww != null ? drawableHww.getMinimumHeight() : 0;
        if (iVgm == -1) {
            iVgm = minimumWidth;
        }
        tqVar.hww(iVgm);
        if (iOk == -1) {
            iOk = minimumHeight;
        }
        tqVar.tq(iOk);
    }

    private int hww(boolean z10) {
        if (z10) {
            return this.vy.getPaddingStart();
        }
        return this.vy.getPaddingTop();
    }

    private int hww(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private void tq(View view, int i10, int i11) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.hv.tq tqVar = (com.bytedance.adsdk.ugeno.hv.tq) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - tqVar.ed()) - tqVar.weu()) - this.vy.hww(view), tqVar.vgm()), tqVar.rs());
        long[] jArr = this.f32491hu;
        if (jArr != null) {
            measuredHeight = tq(jArr[i11]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        hww(i11, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    private int hww(com.bytedance.adsdk.ugeno.hv.tq tqVar, boolean z10) {
        if (z10) {
            return tqVar.hww();
        }
        return tqVar.tq();
    }

    private boolean hww(View view, int i10, int i11, int i12, int i13, com.bytedance.adsdk.ugeno.hv.tq tqVar, int i14, int i15, int i16) {
        if (this.vy.getFlexWrap() == 0) {
            return false;
        }
        if (tqVar.vhb()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.vy.getMaxLine();
        if (maxLine != -1 && maxLine <= i16 + 1) {
            return false;
        }
        int iHww = this.vy.hww(view, i14, i15);
        if (iHww > 0) {
            i13 += iHww;
        }
        return i11 < i12 + i13;
    }

    private boolean hww(int i10, int i11, sd sdVar) {
        return i10 == i11 - 1 && sdVar.tq() != 0;
    }

    private void hww(List<sd> list, sd sdVar, int i10, int i11) {
        sdVar.f32482ed = i11;
        this.vy.hww(sdVar);
        sdVar.wgt = i10;
        list.add(sdVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void hww(View view, int i10) {
        boolean z10;
        com.bytedance.adsdk.ugeno.hv.tq tqVar = (com.bytedance.adsdk.ugeno.hv.tq) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z11 = true;
        if (measuredWidth < tqVar.vgm()) {
            measuredWidth = tqVar.vgm();
        } else {
            if (measuredWidth > tqVar.rs()) {
                measuredWidth = tqVar.rs();
            } else {
                z10 = false;
            }
            if (measuredHeight < tqVar.ok()) {
                measuredHeight = tqVar.ok();
            } else if (measuredHeight > tqVar.nod()) {
                measuredHeight = tqVar.nod();
            } else {
                z11 = z10;
            }
            if (z11) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                hww(i10, iMakeMeasureSpec, iMakeMeasureSpec2, view);
            }
        }
        z10 = true;
        if (measuredHeight < tqVar.ok()) {
            measuredHeight = tqVar.ok();
        } else if (measuredHeight > tqVar.nod()) {
            measuredHeight = tqVar.nod();
        } else {
            z11 = z10;
        }
        if (z11) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            hww(i10, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
        }
    }

    public void hww(int i10, int i11) {
        hww(i10, i11, 0);
    }

    public void hww(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        sd(this.vy.getFlexItemCount());
        if (i12 >= this.vy.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.vy.getFlexDirection();
        int flexDirection2 = this.vy.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = this.vy.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.vy.getPaddingLeft();
            paddingRight = this.vy.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = this.vy.getLargestMainSize();
            }
            paddingLeft = this.vy.getPaddingTop();
            paddingRight = this.vy.getPaddingBottom();
        }
        int i15 = paddingLeft + paddingRight;
        int i16 = size;
        int[] iArr = this.hww;
        int i17 = iArr != null ? iArr[i12] : 0;
        List<sd> flexLinesInternal = this.vy.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i17 < size2) {
            sd sdVar = flexLinesInternal.get(i17);
            int i18 = sdVar.f32484hv;
            if (i18 < i16 && sdVar.f32481bs) {
                i13 = i10;
                i14 = i11;
                hww(i13, i14, sdVar, i16, i15, false);
            } else {
                i13 = i10;
                i14 = i11;
                if (i18 > i16 && sdVar.jpb) {
                    tq(i13, i14, sdVar, i16, i15, false);
                }
            }
            i17++;
            i10 = i13;
            i11 = i14;
        }
    }

    private void hww(int i10, int i11, sd sdVar, int i12, int i13, boolean z10) {
        int i14;
        float f10;
        float f11;
        int iMax;
        double d10;
        double d11;
        float f12 = sdVar.nod;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 < (i14 = sdVar.f32484hv)) {
            return;
        }
        float f14 = (i12 - i14) / f12;
        sdVar.f32484hv = i13 + sdVar.f32483hu;
        if (!z10) {
            sdVar.vgm = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z11 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < sdVar.f32486ok) {
            int i17 = sdVar.weu + i15;
            View viewTq = this.vy.tq(i17);
            if (viewTq == null || viewTq.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
                z11 = z11;
            } else {
                com.bytedance.adsdk.ugeno.hv.tq tqVar = (com.bytedance.adsdk.ugeno.hv.tq) viewTq.getLayoutParams();
                int flexDirection = this.vy.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewTq.getMeasuredHeight();
                    long[] jArr = this.f32491hu;
                    if (jArr != null) {
                        measuredHeight = tq(jArr[i17]);
                    }
                    int measuredWidth = viewTq.getMeasuredWidth();
                    long[] jArr2 = this.f32491hu;
                    f11 = f14;
                    boolean z12 = z11;
                    if (jArr2 != null) {
                        measuredWidth = hww(jArr2[i17]);
                    }
                    if (this.f32492hv[i17] || tqVar.vy() <= f10) {
                        z11 = z12;
                    } else {
                        float fVy = measuredHeight + (tqVar.vy() * f11);
                        if (i15 == sdVar.f32486ok - 1) {
                            fVy += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fVy);
                        if (iRound > tqVar.nod()) {
                            iRound = tqVar.nod();
                            this.f32492hv[i17] = true;
                            sdVar.nod -= tqVar.vy();
                            z11 = true;
                        } else {
                            f15 += fVy - iRound;
                            double d12 = f15;
                            if (d12 > 1.0d) {
                                iRound++;
                                d11 = d12 - 1.0d;
                            } else {
                                if (d12 < -1.0d) {
                                    iRound--;
                                    d11 = d12 + 1.0d;
                                }
                                z11 = z12;
                            }
                            f15 = (float) d11;
                            z11 = z12;
                        }
                        int iHww = hww(i10, tqVar, sdVar.f32482ed);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewTq.measure(iHww, iMakeMeasureSpec);
                        int measuredWidth2 = viewTq.getMeasuredWidth();
                        int measuredHeight2 = viewTq.getMeasuredHeight();
                        hww(i17, iHww, iMakeMeasureSpec, viewTq);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i16, measuredWidth + tqVar.ed() + tqVar.weu() + this.vy.hww(viewTq));
                    sdVar.f32484hv += measuredHeight + tqVar.khx() + tqVar.wgt();
                } else {
                    f11 = f14;
                    boolean z13 = z11;
                    int measuredWidth3 = viewTq.getMeasuredWidth();
                    long[] jArr3 = this.f32491hu;
                    if (jArr3 != null) {
                        measuredWidth3 = hww(jArr3[i17]);
                    }
                    int measuredHeight3 = viewTq.getMeasuredHeight();
                    long[] jArr4 = this.f32491hu;
                    if (jArr4 != null) {
                        measuredHeight3 = tq(jArr4[i17]);
                    }
                    if (this.f32492hv[i17] || tqVar.vy() <= f10) {
                        z11 = z13;
                    } else {
                        float fVy2 = measuredWidth3 + (tqVar.vy() * f11);
                        if (i15 == sdVar.f32486ok - 1) {
                            fVy2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fVy2);
                        if (iRound2 > tqVar.rs()) {
                            iRound2 = tqVar.rs();
                            this.f32492hv[i17] = true;
                            sdVar.nod -= tqVar.vy();
                            z11 = true;
                        } else {
                            f15 += fVy2 - iRound2;
                            double d13 = f15;
                            if (d13 > 1.0d) {
                                iRound2++;
                                d10 = d13 - 1.0d;
                            } else {
                                if (d13 < -1.0d) {
                                    iRound2--;
                                    d10 = d13 + 1.0d;
                                }
                                z11 = z13;
                            }
                            f15 = (float) d10;
                            z11 = z13;
                        }
                        int iTq = tq(i11, tqVar, sdVar.f32482ed);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewTq.measure(iMakeMeasureSpec2, iTq);
                        int measuredWidth4 = viewTq.getMeasuredWidth();
                        int measuredHeight4 = viewTq.getMeasuredHeight();
                        hww(i17, iMakeMeasureSpec2, iTq, viewTq);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i16, measuredHeight3 + tqVar.khx() + tqVar.wgt() + this.vy.hww(viewTq));
                    sdVar.f32484hv += measuredWidth3 + tqVar.ed() + tqVar.weu();
                    iMax = iMax2;
                }
                sdVar.vgm = Math.max(sdVar.vgm, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i14 == sdVar.f32484hv) {
            return;
        }
        hww(i10, i11, sdVar, i12, i13, true);
    }

    private int hww(int i10, com.bytedance.adsdk.ugeno.hv.tq tqVar, int i11) {
        com.bytedance.adsdk.ugeno.hv.hww hwwVar = this.vy;
        int iHww = hwwVar.hww(i10, hwwVar.getPaddingLeft() + this.vy.getPaddingRight() + tqVar.ed() + tqVar.weu() + i11, tqVar.hww());
        int size = View.MeasureSpec.getSize(iHww);
        if (size > tqVar.rs()) {
            return View.MeasureSpec.makeMeasureSpec(tqVar.rs(), View.MeasureSpec.getMode(iHww));
        }
        return size < tqVar.vgm() ? View.MeasureSpec.makeMeasureSpec(tqVar.vgm(), View.MeasureSpec.getMode(iHww)) : iHww;
    }

    private List<sd> hww(List<sd> list, int i10, int i11) {
        int i12 = (i10 - i11) / 2;
        ArrayList arrayList = new ArrayList();
        sd sdVar = new sd();
        sdVar.vgm = i12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                arrayList.add(sdVar);
            }
            arrayList.add(list.get(i13));
            if (i13 == list.size() - 1) {
                arrayList.add(sdVar);
            }
        }
        return arrayList;
    }

    public void hww() {
        hww(0);
    }

    public void hww(int i10) {
        View viewTq;
        if (i10 >= this.vy.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.vy.getFlexDirection();
        if (this.vy.getAlignItems() == 4) {
            int[] iArr = this.hww;
            List<sd> flexLinesInternal = this.vy.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i11 = iArr != null ? iArr[i10] : 0; i11 < size; i11++) {
                sd sdVar = flexLinesInternal.get(i11);
                int i12 = sdVar.f32486ok;
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = sdVar.weu + i13;
                    if (i13 < this.vy.getFlexItemCount() && (viewTq = this.vy.tq(i14)) != null && viewTq.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.hv.tq tqVar = (com.bytedance.adsdk.ugeno.hv.tq) viewTq.getLayoutParams();
                        if (tqVar.hu() == -1 || tqVar.hu() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                }
                                tq(viewTq, sdVar.vgm, i14);
                            } else {
                                hww(viewTq, sdVar.vgm, i14);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (sd sdVar2 : this.vy.getFlexLinesInternal()) {
            for (Integer num : sdVar2.khx) {
                View viewTq2 = this.vy.tq(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                    }
                    tq(viewTq2, sdVar2.vgm, num.intValue());
                } else {
                    hww(viewTq2, sdVar2.vgm, num.intValue());
                }
            }
        }
    }

    private void hww(View view, int i10, int i11) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.hv.tq tqVar = (com.bytedance.adsdk.ugeno.hv.tq) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - tqVar.khx()) - tqVar.wgt()) - this.vy.hww(view), tqVar.ok()), tqVar.nod());
        long[] jArr = this.f32491hu;
        if (jArr != null) {
            measuredWidth = hww(jArr[i11]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        hww(i11, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    public void hww(View view, sd sdVar, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.hv.tq tqVar = (com.bytedance.adsdk.ugeno.hv.tq) view.getLayoutParams();
        int alignItems = this.vy.getAlignItems();
        if (tqVar.hu() != -1) {
            alignItems = tqVar.hu();
        }
        int i14 = sdVar.vgm;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.vy.getFlexWrap() != 2) {
                    int i15 = i11 + i14;
                    view.layout(i10, (i15 - view.getMeasuredHeight()) - tqVar.wgt(), i12, i15 - tqVar.wgt());
                    return;
                } else {
                    view.layout(i10, (i11 - i14) + view.getMeasuredHeight() + tqVar.khx(), i12, (i13 - i14) + view.getMeasuredHeight() + tqVar.khx());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i14 - view.getMeasuredHeight()) + tqVar.khx()) - tqVar.wgt()) / 2;
                if (this.vy.getFlexWrap() != 2) {
                    int i16 = i11 + measuredHeight;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                } else {
                    int i17 = i11 - measuredHeight;
                    view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.vy.getFlexWrap() != 2) {
                    int iMax = Math.max(sdVar.f32485ny - view.getBaseline(), tqVar.khx());
                    view.layout(i10, i11 + iMax, i12, i13 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((sdVar.f32485ny - view.getMeasuredHeight()) + view.getBaseline(), tqVar.wgt());
                    view.layout(i10, i11 - iMax2, i12, i13 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.vy.getFlexWrap() != 2) {
            view.layout(i10, i11 + tqVar.khx(), i12, i13 + tqVar.khx());
        } else {
            view.layout(i10, i11 - tqVar.wgt(), i12, i13 - tqVar.wgt());
        }
    }

    public void hww(View view, sd sdVar, boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.hv.tq tqVar = (com.bytedance.adsdk.ugeno.hv.tq) view.getLayoutParams();
        int alignItems = this.vy.getAlignItems();
        if (tqVar.hu() != -1) {
            alignItems = tqVar.hu();
        }
        int i14 = sdVar.vgm;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z10) {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - tqVar.weu(), i11, ((i12 + i14) - view.getMeasuredWidth()) - tqVar.weu(), i13);
                    return;
                } else {
                    view.layout((i10 - i14) + view.getMeasuredWidth() + tqVar.ed(), i11, (i12 - i14) + view.getMeasuredWidth() + tqVar.ed(), i13);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i14 - view.getMeasuredWidth()) + com.bytedance.adsdk.ugeno.vgm.hu.hww(marginLayoutParams)) - com.bytedance.adsdk.ugeno.vgm.hu.tq(marginLayoutParams)) / 2;
                if (!z10) {
                    view.layout(i10 + measuredWidth, i11, i12 + measuredWidth, i13);
                    return;
                } else {
                    view.layout(i10 - measuredWidth, i11, i12 - measuredWidth, i13);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z10) {
            view.layout(i10 + tqVar.ed(), i11, i12 + tqVar.ed(), i13);
        } else {
            view.layout(i10 - tqVar.weu(), i11, i12 - tqVar.weu(), i13);
        }
    }

    private void hww(int i10, int i11, int i12, View view) {
        long[] jArr = this.f32493tq;
        if (jArr != null) {
            jArr[i10] = tq(i11, i12);
        }
        long[] jArr2 = this.f32491hu;
        if (jArr2 != null) {
            jArr2[i10] = tq(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
