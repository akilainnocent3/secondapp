package com.bytedance.adsdk.tq.hww.hww;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class vy implements ed, hv, com.bytedance.adsdk.tq.hww.tq.hww.InterfaceC0297hww {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final String f32050hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final RectF f32051hv;
    private final Paint hww;
    private List<ed> nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final List<sd> f32052ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final com.bytedance.adsdk.tq.rs f32053rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final Matrix f32054sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final RectF f32055tq;
    private final boolean vgm;
    private com.bytedance.adsdk.tq.hww.tq.wgt vhb;
    private final Path vy;

    public vy(com.bytedance.adsdk.tq.rs rsVar, com.bytedance.adsdk.tq.sd.sd.hww hwwVar, com.bytedance.adsdk.tq.sd.tq.wgt wgtVar, com.bytedance.adsdk.tq.vgm vgmVar) {
        this(rsVar, hwwVar, wgtVar.hww(), wgtVar.sd(), hww(rsVar, vgmVar, hwwVar, wgtVar.tq()), hww(wgtVar.tq()));
    }

    private boolean hv() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f32052ok.size(); i11++) {
            if ((this.f32052ok.get(i11) instanceof hv) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    private static List<sd> hww(com.bytedance.adsdk.tq.rs rsVar, com.bytedance.adsdk.tq.vgm vgmVar, com.bytedance.adsdk.tq.sd.sd.hww hwwVar, List<com.bytedance.adsdk.tq.sd.tq.sd> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            sd sdVarHww = list.get(i10).hww(rsVar, vgmVar, hwwVar);
            if (sdVarHww != null) {
                arrayList.add(sdVarHww);
            }
        }
        return arrayList;
    }

    public Matrix sd() {
        com.bytedance.adsdk.tq.hww.tq.wgt wgtVar = this.vhb;
        if (wgtVar != null) {
            return wgtVar.vy();
        }
        this.f32054sd.reset();
        return this.f32054sd;
    }

    public List<ed> tq() {
        if (this.nod == null) {
            this.nod = new ArrayList();
            for (int i10 = 0; i10 < this.f32052ok.size(); i10++) {
                sd sdVar = this.f32052ok.get(i10);
                if (sdVar instanceof ed) {
                    this.nod.add((ed) sdVar);
                }
            }
        }
        return this.nod;
    }

    @Override // com.bytedance.adsdk.tq.hww.hww.ed
    public Path vy() {
        this.f32054sd.reset();
        com.bytedance.adsdk.tq.hww.tq.wgt wgtVar = this.vhb;
        if (wgtVar != null) {
            this.f32054sd.set(wgtVar.vy());
        }
        this.vy.reset();
        if (this.vgm) {
            return this.vy;
        }
        for (int size = this.f32052ok.size() - 1; size >= 0; size--) {
            sd sdVar = this.f32052ok.get(size);
            if (sdVar instanceof ed) {
                this.vy.addPath(((ed) sdVar).vy(), this.f32054sd);
            }
        }
        return this.vy;
    }

    public vy(com.bytedance.adsdk.tq.rs rsVar, com.bytedance.adsdk.tq.sd.sd.hww hwwVar, String str, boolean z10, List<sd> list, com.bytedance.adsdk.tq.sd.hww.ny nyVar) {
        this.hww = new com.bytedance.adsdk.tq.hww.hww();
        this.f32055tq = new RectF();
        this.f32054sd = new Matrix();
        this.vy = new Path();
        this.f32051hv = new RectF();
        this.f32050hu = str;
        this.f32053rs = rsVar;
        this.vgm = z10;
        this.f32052ok = list;
        if (nyVar != null) {
            com.bytedance.adsdk.tq.hww.tq.wgt wgtVarNod = nyVar.nod();
            this.vhb = wgtVarNod;
            wgtVarNod.hww(hwwVar);
            this.vhb.hww(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            sd sdVar = list.get(size);
            if (sdVar instanceof nod) {
                arrayList.add((nod) sdVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((nod) arrayList.get(size2)).hww(list.listIterator(list.size()));
        }
    }

    public static com.bytedance.adsdk.tq.sd.hww.ny hww(List<com.bytedance.adsdk.tq.sd.tq.sd> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.bytedance.adsdk.tq.sd.tq.sd sdVar = list.get(i10);
            if (sdVar instanceof com.bytedance.adsdk.tq.sd.hww.ny) {
                return (com.bytedance.adsdk.tq.sd.hww.ny) sdVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.tq.hww.tq.hww.InterfaceC0297hww
    public void hww() {
        this.f32053rs.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.tq.hww.hww.sd
    public void hww(List<sd> list, List<sd> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f32052ok.size());
        arrayList.addAll(list);
        for (int size = this.f32052ok.size() - 1; size >= 0; size--) {
            sd sdVar = this.f32052ok.get(size);
            sdVar.hww(arrayList, this.f32052ok.subList(0, size));
            arrayList.add(sdVar);
        }
    }

    @Override // com.bytedance.adsdk.tq.hww.hww.hv
    public void hww(Canvas canvas, Matrix matrix, int i10) {
        if (this.vgm) {
            return;
        }
        this.f32054sd.set(matrix);
        com.bytedance.adsdk.tq.hww.tq.wgt wgtVar = this.vhb;
        if (wgtVar != null) {
            this.f32054sd.preConcat(wgtVar.vy());
            i10 = (int) (((((this.vhb.hww() == null ? 100 : this.vhb.hww().vgm().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.f32053rs.rs() && hv() && i10 != 255;
        if (z10) {
            this.f32055tq.set(0.0f, 0.0f, 0.0f, 0.0f);
            hww(this.f32055tq, this.f32054sd, true);
            this.hww.setAlpha(i10);
            com.bytedance.adsdk.tq.hu.hu.hww(canvas, this.f32055tq, this.hww);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.f32052ok.size() - 1; size >= 0; size--) {
            sd sdVar = this.f32052ok.get(size);
            if (sdVar instanceof hv) {
                ((hv) sdVar).hww(canvas, this.f32054sd, i10);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.tq.hww.hww.hv
    public void hww(RectF rectF, Matrix matrix, boolean z10) {
        this.f32054sd.set(matrix);
        com.bytedance.adsdk.tq.hww.tq.wgt wgtVar = this.vhb;
        if (wgtVar != null) {
            this.f32054sd.preConcat(wgtVar.vy());
        }
        this.f32051hv.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f32052ok.size() - 1; size >= 0; size--) {
            sd sdVar = this.f32052ok.get(size);
            if (sdVar instanceof hv) {
                ((hv) sdVar).hww(this.f32051hv, this.f32054sd, z10);
                rectF.union(this.f32051hv);
            }
        }
    }
}
