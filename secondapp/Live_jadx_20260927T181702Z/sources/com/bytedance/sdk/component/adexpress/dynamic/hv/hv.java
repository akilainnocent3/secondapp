package com.bytedance.sdk.component.adexpress.dynamic.hv;

import android.text.TextUtils;
import androidx.media3.session.fe;
import com.bytedance.sdk.component.adexpress.tq.ed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l3.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv {
    public com.bytedance.sdk.component.adexpress.dynamic.vy.tq hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.vy.ok f34076sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected tq f34077tq;
    private hww vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        float hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        float f34078sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        float f34079tq;
    }

    public hv(double d10, int i10, double d11, String str, ed edVar) {
        this.f34077tq = new tq(d10, i10, d11, str, edVar);
    }

    public void hww(hww hwwVar) {
        this.vy = hwwVar;
    }

    public void hww() {
        this.f34077tq.hww();
    }

    public void hww(com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar, float f10, float f11) {
        if (okVar != null) {
            this.f34076sd = okVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar2 = this.f34076sd;
        float fOk = okVar2.ok();
        float fRs = okVar2.rs();
        float f12 = TextUtils.equals(okVar2.nod().hv().zvy(), "fixed") ? fRs : 65536.0f;
        this.f34077tq.hww();
        this.f34077tq.sd(okVar2, fOk, f12);
        tq.sd sdVarHww = this.f34077tq.hww(okVar2);
        com.bytedance.sdk.component.adexpress.dynamic.vy.tq tqVar = new com.bytedance.sdk.component.adexpress.dynamic.vy.tq();
        tqVar.hww = f10;
        tqVar.f34265tq = f11;
        if (sdVarHww != null) {
            fOk = sdVarHww.hww;
        }
        tqVar.f34264sd = fOk;
        if (sdVarHww != null) {
            fRs = sdVarHww.f34088tq;
        }
        tqVar.vy = fRs;
        tqVar.f34261hv = "root";
        tqVar.f34263rs = 1280.0f;
        tqVar.f34260hu = okVar2;
        okVar2.sd(f10);
        tqVar.f34260hu.vy(tqVar.f34265tq);
        tqVar.f34260hu.hv(tqVar.f34264sd);
        tqVar.f34260hu.hu(tqVar.vy);
        com.bytedance.sdk.component.adexpress.dynamic.vy.tq tqVarHww = hww(tqVar, 0.0f);
        this.hww = tqVarHww;
        hww(tqVarHww);
    }

    public void hww(com.bytedance.sdk.component.adexpress.dynamic.vy.tq tqVar) {
        if (tqVar == null) {
            return;
        }
        tqVar.f34260hu.nod().tq();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.vy.tq>> list = tqVar.vgm;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.vy.tq> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.vy.tq> it = list2.iterator();
                while (it.hasNext()) {
                    hww(it.next());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0340  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0219  */
    public com.bytedance.sdk.component.adexpress.dynamic.vy.tq hww(com.bytedance.sdk.component.adexpress.dynamic.vy.tq tqVar, float f10) {
        float fHww;
        float fHww2;
        float fHww3;
        float fHww4;
        float f11;
        com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar = tqVar.f34260hu;
        if (okVar != null) {
            okVar.hnv();
            List<List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok>> listBs = okVar.bs();
            if (listBs != null && listBs.size() > 0) {
                com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHv = okVar.nod().hv();
                float fBs = huVarHv.bs();
                float fWgt = huVarHv.wgt();
                float fKhx = huVarHv.khx();
                float fWeu = huVarHv.weu();
                float fNy = huVarHv.ny();
                String strQm = huVarHv.qm();
                String strNpz = huVarHv.npz();
                float f12 = tqVar.hww + fWeu;
                float f13 = tqVar.f34265tq + fBs;
                float f14 = (tqVar.f34264sd - fWeu) - fWgt;
                float f15 = 2.0f;
                float f16 = fNy * 2.0f;
                float f17 = f14 - f16;
                float f18 = ((tqVar.vy - fBs) - fKhx) - f16;
                com.bytedance.sdk.component.adexpress.dynamic.vy.rs rsVar = new com.bytedance.sdk.component.adexpress.dynamic.vy.rs(f12, f13);
                if (tqVar.vgm == null) {
                    tqVar.vgm = new ArrayList();
                }
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok>> it = listBs.iterator();
                float f19 = 0.0f;
                while (it.hasNext()) {
                    float f20 = f15;
                    tq.sd sdVarHww = this.f34077tq.hww(it.next());
                    if (sdVarHww != null) {
                        f19 += sdVarHww.f34088tq;
                    }
                    f15 = f20;
                }
                float f21 = f15;
                String str = "space-between";
                String str2 = "space-around";
                int i10 = 1;
                if (f19 >= f18) {
                    fHww = 0.0f;
                    fHww2 = 0.0f;
                } else {
                    if (TextUtils.equals(strNpz, "center")) {
                        fHww2 = (f18 - f19) / f21;
                    } else if (TextUtils.equals(strNpz, "flex-end")) {
                        fHww2 = f18 - f19;
                    } else if (TextUtils.equals(strNpz, "space-around")) {
                        fHww2 = nod.hww((f18 - f19) / (listBs.size() + 1));
                        fHww = fHww2;
                    } else {
                        if (!TextUtils.equals(strNpz, "space-between") || listBs.size() <= 1) {
                            fHww = 0.0f;
                        } else {
                            fHww = nod.hww((f18 - f19) / (listBs.size() - 1));
                        }
                        fHww2 = 0.0f;
                    }
                    fHww = 0.0f;
                }
                rsVar.f34258tq += fHww2;
                float f22 = f10;
                int i11 = 0;
                while (i11 < listBs.size()) {
                    List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> list = listBs.get(i11);
                    i11++;
                    int i12 = i10;
                    if (i11 >= tqVar.vgm.size()) {
                        int i13 = 0;
                        for (int size = (i11 - tqVar.vgm.size()) + 1; i13 < size; size = size) {
                            tqVar.vgm.add(new ArrayList());
                            i13++;
                        }
                    }
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> it2 = list.iterator();
                    float f23 = 0.0f;
                    while (true) {
                        it2 = it2;
                        if (!it2.hasNext()) {
                            break;
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.vy.ok next = it2.next();
                        com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHv2 = next.nod().hv();
                        float f24 = f23;
                        String strMw = huVarHv2.mw();
                        float f25 = fHww;
                        int iWyi = huVarHv2.wyi();
                        f22 = f22;
                        if (TextUtils.equals(strMw, "flex") || iWyi == i12 || iWyi == 2) {
                            f23 = f24;
                        } else {
                            tq.sd sdVarHww2 = this.f34077tq.hww(next);
                            f23 = sdVarHww2 != null ? f24 + sdVarHww2.hww : f24;
                        }
                        fHww = f25;
                        i12 = 1;
                    }
                    float f26 = fHww;
                    float f27 = f22;
                    float fMax = Math.max(f17 - f23, 0.0f);
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> it3 = list.iterator();
                    float f28 = 0.0f;
                    while (it3.hasNext()) {
                        com.bytedance.sdk.component.adexpress.dynamic.vy.ok next2 = it3.next();
                        com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHv3 = next2.nod().hv();
                        it3 = it3;
                        float f29 = f28;
                        if (huVarHv3.wyi() == 1 || huVarHv3.wyi() == 2) {
                            f28 = f29;
                        } else {
                            tq.sd sdVarHww3 = this.f34077tq.hww(next2);
                            f28 = sdVarHww3 != null ? f29 + sdVarHww3.hww : f29;
                        }
                    }
                    float f30 = f28;
                    if (f30 >= f17) {
                        fHww3 = 0.0f;
                        fHww4 = 0.0f;
                    } else {
                        if (TextUtils.equals(strQm, "center")) {
                            fHww3 = (f17 - f30) / f21;
                        } else if (TextUtils.equals(strQm, "flex-end")) {
                            fHww3 = f17 - f30;
                        } else if (TextUtils.equals(strQm, str2)) {
                            fHww3 = nod.hww((f17 - f30) / (list.size() + 1));
                            fHww4 = fHww3;
                        } else if (!TextUtils.equals(strQm, str) || list.size() <= 1) {
                            fHww3 = 0.0f;
                        } else {
                            fHww4 = nod.hww((f17 - f30) / (list.size() - 1.0f));
                            fHww3 = 0.0f;
                        }
                        fHww4 = 0.0f;
                    }
                    rsVar.hww += fHww3;
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> it4 = list.iterator();
                    float fMax2 = 0.0f;
                    while (it4.hasNext()) {
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> it5 = it4;
                        com.bytedance.sdk.component.adexpress.dynamic.vy.ok next3 = it4.next();
                        float f31 = fHww4;
                        float f32 = this.f34077tq.hww(next3) != null ? this.f34077tq.hww(next3).f34088tq : 0.0f;
                        com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHv4 = next3.nod().hv();
                        fMax2 = Math.max(fMax2, (huVarHv4.wyi() == 1 || huVarHv4.wyi() == 2) ? 0.0f : f32);
                        it4 = it5;
                        fHww4 = f31;
                    }
                    float f33 = fHww4;
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> it6 = list.iterator();
                    while (it6.hasNext()) {
                        com.bytedance.sdk.component.adexpress.dynamic.vy.ok next4 = it6.next();
                        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> it7 = it6;
                        tq.sd sdVarHww4 = this.f34077tq.hww(next4);
                        String str3 = str;
                        com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHv5 = next4.nod().hv();
                        String str4 = strQm;
                        float fCe = huVarHv5.ce();
                        float fXas = huVarHv5.xas();
                        float fYtm = huVarHv5.ytm();
                        float fEt = huVarHv5.et();
                        float f34 = sdVarHww4 == null ? 0.0f : sdVarHww4.hww;
                        float f35 = sdVarHww4 == null ? 0.0f : sdVarHww4.f34088tq;
                        float f36 = f34;
                        float f37 = TextUtils.equals(okVar.sd(), "root") ? i11 : f27;
                        float f38 = fMax2;
                        com.bytedance.sdk.component.adexpress.dynamic.vy.rs rsVarHww = huVarHv5.wyi() == 2 ? hww(huVarHv5, this.f34077tq.hww(this.f34076sd), new tq.sd((f36 - fXas) - fEt, (f35 - fCe) - fYtm)) : huVarHv5.wyi() == 1 ? hww(tqVar, huVarHv5, (f36 - fXas) - fEt, (f35 - fCe) - fYtm) : rsVar;
                        String strAs = huVarHv.as();
                        if (f38 <= f35 || TextUtils.equals(strAs, "flex-start")) {
                            f11 = 0.0f;
                        } else {
                            strAs.getClass();
                            if (strAs.equals("center")) {
                                f11 = (f38 - f35) / f21;
                            } else if (strAs.equals("flex-end")) {
                                f11 = f38 - f35;
                            } else {
                                f11 = 0.0f;
                            }
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.vy.tq tqVar2 = new com.bytedance.sdk.component.adexpress.dynamic.vy.tq();
                        tqVar2.hww = rsVarHww.hww + fEt;
                        tqVar2.f34265tq = rsVarHww.f34258tq + fCe + f11;
                        tqVar2.f34264sd = (f36 - fXas) - fEt;
                        tqVar2.vy = (f35 - fCe) - fYtm;
                        tqVar2.f34261hv = tqVar.f34261hv + fe.F + next4.sd();
                        tqVar2.f34262ok = tqVar;
                        tqVar2.f34260hu = next4;
                        tqVar2.f34263rs = fMax;
                        tqVar2.nod = list;
                        next4.sd(tqVar2.hww);
                        tqVar2.f34260hu.vy(tqVar2.f34265tq);
                        tqVar2.f34260hu.hv(tqVar2.f34264sd);
                        tqVar2.f34260hu.hu(tqVar2.vy);
                        tqVar.vgm.get(i11).add(hww(tqVar2, f37));
                        if (huVarHv5.wyi() != 1 && huVarHv5.wyi() != 2) {
                            rsVar.hww += f36 + f33;
                        }
                        f27 = f37;
                        strQm = str4;
                        str = str3;
                        fMax2 = f38;
                        f17 = f17;
                        str2 = str2;
                        it6 = it7;
                    }
                    rsVar.hww = f12;
                    rsVar.f34258tq += fMax2 + f26;
                    i10 = 1;
                    listBs = listBs;
                    f22 = f27;
                    fHww = f26;
                }
            }
        }
        return tqVar;
    }

    private com.bytedance.sdk.component.adexpress.dynamic.vy.rs hww(com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVar, tq.sd sdVar, tq.sd sdVar2) {
        float fFc = huVar.fc();
        float fGsa = huVar.gsa();
        float fHh = huVar.hh();
        float fKft = huVar.kft();
        boolean zBq = huVar.bq();
        boolean zJk = huVar.jk();
        boolean zWal = huVar.wal();
        boolean zFp = huVar.fp();
        if (!zBq) {
            if (zJk) {
                float f10 = this.vy.hww;
                fFc = ((f10 != 0.0f ? Math.min(f10, sdVar.hww) : sdVar.hww) - fHh) - sdVar2.hww;
            } else {
                fFc = 0.0f;
            }
        }
        if (!zWal) {
            if (zFp) {
                float f11 = this.vy.f34079tq;
                if (f11 == 0.0f) {
                    f11 = sdVar.f34088tq;
                }
                fGsa = (f11 - fKft) - sdVar2.f34088tq;
            } else {
                fGsa = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.vy.rs(fFc, fGsa);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.vy.rs hww(com.bytedance.sdk.component.adexpress.dynamic.vy.tq tqVar, com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVar, float f10, float f11) {
        float f12;
        float f13;
        float f14 = tqVar.hww;
        float f15 = tqVar.f34265tq;
        float fFc = huVar.fc();
        float fGsa = huVar.gsa();
        float fHh = huVar.hh();
        float fKft = huVar.kft();
        boolean zBq = huVar.bq();
        boolean zJk = huVar.jk();
        boolean zWal = huVar.wal();
        boolean zFp = huVar.fp();
        String strEb = huVar.eb();
        float f16 = tqVar.f34264sd;
        float f17 = tqVar.vy;
        if (TextUtils.equals(strEb, "0")) {
            if (zBq) {
                f14 = tqVar.hww + fFc;
            } else if (zJk) {
                f14 = ((tqVar.hww + f16) - fHh) - f10;
            }
            if (zWal) {
                f13 = tqVar.f34265tq;
                f15 = f13 + fGsa;
            } else if (zFp) {
                f12 = tqVar.f34265tq;
                f15 = ((f12 + f17) - fKft) - f11;
            }
        } else if (TextUtils.equals(strEb, "1")) {
            f14 = tqVar.hww + ((f16 - f10) / 2.0f);
            if (zWal) {
                f13 = tqVar.f34265tq;
                f15 = f13 + fGsa;
            } else if (zFp) {
                f12 = tqVar.f34265tq;
                f15 = ((f12 + f17) - fKft) - f11;
            }
        } else if (TextUtils.equals(strEb, "2")) {
            f15 = tqVar.f34265tq + ((f17 - f11) / 2.0f);
            if (zBq) {
                f14 = tqVar.hww + fFc;
            } else if (zJk) {
                f14 = ((tqVar.hww + f16) - fHh) - f10;
            }
        } else if (TextUtils.equals(strEb, a.Z4)) {
            f14 = tqVar.hww + ((f16 - f10) / 2.0f);
            f15 = tqVar.f34265tq + ((f17 - f11) / 2.0f);
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.vy.rs(f14, f15);
    }
}
