package com.bytedance.sdk.component.adexpress.dynamic.hv;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.tq.ed;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import fw.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lk.e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f34080hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private double f34081hv;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private String f34082ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private ed f34083rs;
    private double vgm;
    public Map<String, sd> hww = new HashMap();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public Map<String, sd> f34085tq = new HashMap();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public Map<String, sd> f34084sd = new HashMap();
    private double vy = Math.random();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww implements Cloneable {
        float hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        float f34086sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        boolean f34087tq;

        public Object clone() {
            try {
                return (hww) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class sd {
        float hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        float f34088tq;

        public sd() {
        }

        public String toString() {
            return "UnitSize{width=" + this.hww + ", height=" + this.f34088tq + b.f85383j;
        }

        public sd(float f10, float f11) {
            this.hww = f10;
            this.f34088tq = f11;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.hv.tq$tq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0312tq {

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        float f34089hv;
        float hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        int f34090sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        int f34091tq;
        double vy;

        public static JSONObject hww(C0312tq c0312tq) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", c0312tq.hww);
                jSONObject.put("letterSpacing", c0312tq.f34091tq);
                jSONObject.put("lineHeight", c0312tq.vy);
                jSONObject.put("maxWidth", c0312tq.f34089hv);
                jSONObject.put("fontWeight", c0312tq.f34090sd);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public tq(double d10, int i10, double d11, String str, ed edVar) {
        this.f34081hv = d10;
        this.f34080hu = i10;
        this.vgm = d11;
        this.f34082ok = str;
        this.f34083rs = edVar;
    }

    private sd hu(com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar, float f10, float f11) {
        new sd();
        com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHv = okVar.nod().hv();
        okVar.nod().sd();
        huVarHv.xe();
        float fJpb = huVarHv.jpb();
        int iFxi = huVarHv.fxi();
        double dMg = huVarHv.mg();
        int iJi = huVarHv.ji();
        boolean zCj = huVarHv.cj();
        boolean zEp = huVarHv.ep();
        int iZeu = huVarHv.zeu();
        C0312tq c0312tq = new C0312tq();
        c0312tq.hww = fJpb;
        c0312tq.f34091tq = iFxi;
        c0312tq.f34090sd = iJi;
        c0312tq.vy = dMg;
        c0312tq.f34089hv = f10;
        return hww(okVar.nod().sd(), c0312tq, zCj, zEp, iZeu, okVar);
    }

    private sd hv(com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar, float f10, float f11) {
        String str = okVar.sd() + e.f104695m + f10 + e.f104695m + f11;
        if (this.f34084sd.containsKey(str)) {
            return this.f34084sd.get(str);
        }
        sd sdVarHu = hu(okVar, f10, f11);
        this.f34084sd.put(str, sdVarHu);
        return sdVarHu;
    }

    public sd hww(com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar, float f10, float f11) {
        float f12;
        if (TextUtils.isEmpty(okVar.nod().sd()) && okVar.nod().hv().icx() == null) {
            return new sd(0.0f, 0.0f);
        }
        if (TextUtils.equals(okVar.nod().tq(), "creative-playable-bait")) {
            return new sd(0.0f, 0.0f);
        }
        float fOk = okVar.ok();
        float fRs = okVar.rs();
        com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHv = okVar.nod().hv();
        String strMw = huVarHv.mw();
        String strZvy = huVarHv.zvy();
        float fEd = okVar.ed();
        float fKhx = okVar.khx();
        float fWeu = okVar.weu();
        float fWgt = okVar.wgt();
        if (TextUtils.equals(strMw, "fixed")) {
            f10 = Math.min(fOk, f10);
            if (TextUtils.equals(strZvy, "auto")) {
                f12 = tq(okVar, f10 - fWeu, f11 - fWgt).f34088tq;
                fRs = f12 + fWgt;
            }
        } else if (TextUtils.equals(strMw, "auto")) {
            sd sdVarTq = tq(okVar, f10 - fWeu, f11 - fWgt);
            f10 = sdVarTq.hww + fWeu;
            if (TextUtils.equals(strZvy, "auto")) {
                f12 = sdVarTq.f34088tq;
                fRs = f12 + fWgt;
            }
        } else if (!TextUtils.equals(strMw, "flex")) {
            f10 = fOk;
        } else if (TextUtils.equals(strZvy, "auto")) {
            f12 = tq(okVar, f10 - fWeu, f11 - fWgt).f34088tq;
            fRs = f12 + fWgt;
        }
        if (TextUtils.equals(strZvy, "scale")) {
            float fRound = Math.round((f10 - fEd) / fRs) + fKhx;
            if (fRound > f11) {
                f10 = Math.round((f11 - fKhx) * fRs) + fEd;
            } else {
                f11 = fRound;
            }
        } else if (TextUtils.equals(strZvy, "fixed")) {
            f11 = Math.min(fRs + fKhx, f11);
        } else if (!TextUtils.equals(strZvy, "flex")) {
            f11 = fRs;
        }
        sd sdVar = new sd();
        sdVar.hww = f10;
        sdVar.f34088tq = f11;
        return sdVar;
    }

    public sd sd(com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar, float f10, float f11) {
        if (okVar == null) {
            return null;
        }
        sd sdVarHww = hww(okVar);
        if (sdVarHww != null && (sdVarHww.hww != 0.0f || sdVarHww.f34088tq != 0.0f)) {
            return sdVarHww;
        }
        sd sdVarVy = vy(okVar, f10, f11);
        hww(okVar, sdVarVy);
        return sdVarVy;
    }

    public sd tq(com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar, float f10, float f11) {
        sd sdVar = new sd();
        if (okVar.nod().hv() == null) {
            return sdVar;
        }
        sd sdVarHv = hv(okVar, f10, f11);
        float f12 = sdVarHv.hww;
        float f13 = sdVarHv.f34088tq;
        sdVar.hww = Math.min(f12, f10);
        sdVar.f34088tq = Math.min(f13, f11);
        return sdVar;
    }

    public sd vy(com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar, float f10, float f11) {
        float fMin;
        float f12;
        float f13;
        sd sdVar = new sd();
        float f14 = 0.0f;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            sdVar.hww = 0.0f;
            sdVar.f34088tq = 0.0f;
            return sdVar;
        }
        if (okVar.jpb()) {
            return hww(okVar, f10, f11);
        }
        float fOk = okVar.ok();
        float fRs = okVar.rs();
        float fWeu = okVar.weu();
        float fWgt = okVar.wgt();
        com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHv = okVar.nod().hv();
        String strMw = huVarHv.mw();
        String strZvy = huVarHv.zvy();
        float fMin2 = ((TextUtils.equals(strMw, "flex") || TextUtils.equals(strMw, "auto")) ? f10 : Math.min(fOk, f10)) - fWeu;
        if (TextUtils.equals(strZvy, "scale")) {
            fMin = Math.round(fMin2 / fRs) + fWgt;
            if (fMin > f11) {
                fMin2 = Math.round((f11 - fWgt) * fRs);
            }
        } else {
            fMin = (TextUtils.equals(strZvy, "auto") || TextUtils.equals(strZvy, "flex")) ? f11 : Math.min(fRs, f11);
        }
        float f15 = fMin - fWgt;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok>> listBs = okVar.bs();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> list : listBs) {
            float f16 = f14;
            float f17 = fWeu;
            sd sdVarTq = tq(list, fMin2, f15);
            if (tq(list)) {
                f13 = f16 + 1.0f;
            } else {
                fMax = Math.max(fMax, sdVarTq.hww);
                f13 = f16;
            }
            float f18 = f13;
            float f19 = fMin2;
            fMax2 = okVar.nod().tq().equals("carousel") ? Math.max(okVar.rs(), sdVarTq.f34088tq) : fMax2 + sdVarTq.f34088tq;
            fWeu = f17;
            f14 = f18;
            fMin2 = f19;
        }
        float f20 = f14;
        float f21 = fMin2;
        float f22 = fWeu;
        if (!TextUtils.equals(strMw, "auto")) {
            f12 = f21;
        } else if (f20 == listBs.size()) {
            f12 = f10;
        } else {
            for (List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> list2 : listBs) {
                sd(list2);
                tq(list2, fMax, f15);
            }
            f12 = fMax;
        }
        if (TextUtils.equals(strZvy, "auto")) {
            if (fMax2 <= f11) {
                f15 = fMax2;
            } else {
                hww(listBs, f12, f15);
            }
        } else if ((TextUtils.equals(strZvy, "fixed") || TextUtils.equals(strZvy, "flex")) && f15 < fMax2) {
            hww(listBs, f12, f15);
        }
        sdVar.hww = Math.min(f12 + f22, f10);
        sdVar.f34088tq = Math.min(f15 + fWgt, f11);
        return sdVar;
    }

    private sd sd(List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> list, float f10, float f11) {
        float fMax;
        vy(list);
        sd sdVar = new sd();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHv = okVar.nod().hv();
            if (huVarHv.wyi() == 1 || huVarHv.wyi() == 2) {
                arrayList.add(okVar);
            }
            if (huVarHv.wyi() != 1 && huVarHv.wyi() != 2) {
                arrayList2.add(okVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sd((com.bytedance.sdk.component.adexpress.dynamic.vy.ok) it.next(), f10, f11);
        }
        if (arrayList2.size() <= 0) {
            return sdVar;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(sd(it2.next(), f10, f11).hww));
        }
        ArrayList arrayList4 = new ArrayList();
        int i10 = 0;
        while (true) {
            fMax = 0.0f;
            if (i10 >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar2 = arrayList2.get(i10);
            String strMw = okVar2.nod().hv().mw();
            float fOk = okVar2.ok();
            boolean zEquals = TextUtils.equals(strMw, "flex");
            if (TextUtils.equals(strMw, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok>> listBs = okVar2.bs();
                if (listBs == null || listBs.size() <= 0) {
                    zEquals = false;
                    break;
                }
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok>> it3 = listBs.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        zEquals = false;
                        break;
                    }
                    if (tq(it3.next())) {
                        zEquals = true;
                        break;
                    }
                }
            }
            hww hwwVar = new hww();
            if (!zEquals) {
                fOk = ((Float) arrayList3.get(i10)).floatValue();
            }
            hwwVar.hww = fOk;
            hwwVar.f34087tq = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i10)).floatValue();
            }
            hwwVar.f34086sd = fMax;
            arrayList4.add(hwwVar);
            i10++;
        }
        hww(arrayList4, f10, arrayList2);
        List<hww> listHww = nod.hww(f10, arrayList4);
        float f12 = 0.0f;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            f12 += listHww.get(i11).hww;
            if (((Float) arrayList3.get(i11)).floatValue() != listHww.get(i11).hww) {
                vy(arrayList2.get(i11));
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> it4 = arrayList2.iterator();
        int i12 = 0;
        boolean z10 = false;
        while (it4.hasNext()) {
            i12++;
            if (!tq(it4.next())) {
                z10 = false;
                break;
            }
            if (i12 == arrayList2.size()) {
                z10 = true;
            }
        }
        fMax = z10 ? f11 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar3 = arrayList2.get(i13);
            sd sdVarSd = sd(okVar3, listHww.get(i13).hww, f11);
            if (!tq(okVar3)) {
                fMax = Math.max(fMax, sdVarSd.f34088tq);
            }
            arrayList5.add(sdVarSd);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((sd) it5.next()).f34088tq));
        }
        if (!z10) {
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar4 = arrayList2.get(i14);
                if (tq(okVar4) && ((Float) arrayList6.get(i14)).floatValue() != fMax) {
                    vy(okVar4);
                    sd(okVar4, listHww.get(i14).hww, fMax);
                }
            }
        }
        sdVar.hww = f12;
        sdVar.f34088tq = fMax;
        return sdVar;
    }

    private boolean tq(List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok>> listBs;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().nod().hv().mw(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z10 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar : list) {
                if (TextUtils.equals(okVar.nod().hv().mw(), "auto") && (listBs = okVar.bs()) != null) {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok>> it2 = listBs.iterator();
                    int i10 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> next = it2.next();
                            i10++;
                            if (tq(next)) {
                                if (i10 == next.size()) {
                                    z10 = true;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return z10;
        }
    }

    private String hv(com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar) {
        return okVar.sd();
    }

    private sd tq(List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> list, float f10, float f11) {
        sd sdVarHww = hww(list);
        if (sdVarHww != null && (sdVarHww.hww != 0.0f || sdVarHww.f34088tq != 0.0f)) {
            return sdVarHww;
        }
        sd sdVarSd = sd(list, f10, f11);
        hww(list, sdVarSd);
        return sdVarSd;
    }

    private boolean tq(com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar) {
        if (okVar == null) {
            return false;
        }
        if (TextUtils.equals(okVar.nod().hv().zvy(), "flex")) {
            return true;
        }
        return sd(okVar);
    }

    private sd hww(String str, C0312tq c0312tq, boolean z10, boolean z11, int i10, com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar) {
        return vhb.hww(str, okVar.nod().tq(), C0312tq.hww(c0312tq).toString(), z10, z11, i10, okVar, this.f34081hv, this.f34080hu, this.vgm, this.f34082ok, this.f34083rs);
    }

    private void hww(List<List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok>> list, float f10, float f11) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok>> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (hww(it.next(), false)) {
                z10 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> list2 : list) {
            hww hwwVar = new hww();
            boolean zHww = hww(list2, !z10);
            hwwVar.hww = zHww ? 1.0f : tq(list2, f10, f11).f34088tq;
            hwwVar.f34087tq = !zHww;
            arrayList.add(hwwVar);
        }
        List<hww> listHww = nod.hww(f11, arrayList);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((hww) arrayList.get(i10)).hww != listHww.get(i10).hww) {
                List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> list3 = list.get(i10);
                sd(list3);
                tq(list3, f10, listHww.get(i10).hww);
            }
        }
    }

    private void vy(com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar) {
        this.hww.remove(hv(okVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok>> listBs = okVar.bs();
        if (listBs == null || listBs.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok>> it = listBs.iterator();
        while (it.hasNext()) {
            sd(it.next());
        }
    }

    private String vy(List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String strSd = list.get(i10).sd();
            if (i10 < list.size() - 1) {
                sb2.append(strSd);
                sb2.append(TokenBuilder.TOKEN_DELIMITER);
            } else {
                sb2.append(strSd);
            }
        }
        return sb2.toString();
    }

    private boolean hww(List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> list, boolean z10) {
        for (com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.vy.hu huVarHv = okVar.nod().hv();
            String strZvy = huVarHv.zvy();
            if (TextUtils.equals(strZvy, "flex") || (z10 && ((TextUtils.equals(huVarHv.mw(), "flex") && TextUtils.equals(huVarHv.zvy(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.vy.hv.hww.get(okVar.nod().tq()).intValue() == 7) || TextUtils.equals(strZvy, "flex")))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> it = list.iterator();
        while (it.hasNext()) {
            if (sd(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean sd(com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok>> listBs;
        if (!okVar.jpb() && TextUtils.equals(okVar.nod().hv().zvy(), "auto") && (listBs = okVar.bs()) != null && listBs.size() > 0) {
            if (listBs.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> it = listBs.get(0).iterator();
                while (it.hasNext()) {
                    if (!tq(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok>> it2 = listBs.iterator();
            while (it2.hasNext()) {
                if (hww(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void hww(List<hww> list, float f10, List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> list2) {
        float f11 = 0.0f;
        for (hww hwwVar : list) {
            if (hwwVar.f34087tq) {
                f11 += hwwVar.hww;
            }
        }
        if (f11 > f10) {
            int i10 = 0;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (list.get(i11).f34087tq && list2.get(i11).kv()) {
                    i10++;
                }
            }
            if (i10 > 0) {
                float fCeil = (float) (Math.ceil(((f11 - f10) / i10) * 1000.0f) / 1000.0d);
                for (int i12 = 0; i12 < list2.size(); i12++) {
                    hww hwwVar2 = list.get(i12);
                    if (hwwVar2.f34087tq && list2.get(i12).kv()) {
                        hwwVar2.hww -= fCeil;
                    }
                }
            }
        }
    }

    private void sd(List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f34085tq.remove(vy(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> it = list.iterator();
        while (it.hasNext()) {
            vy(it.next());
        }
    }

    public void hww() {
        this.f34084sd.clear();
        this.hww.clear();
        this.f34085tq.clear();
    }

    public sd hww(com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar) {
        return this.hww.get(hv(okVar));
    }

    public sd hww(List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> list) {
        return this.f34085tq.get(vy(list));
    }

    private void hww(com.bytedance.sdk.component.adexpress.dynamic.vy.ok okVar, sd sdVar) {
        this.hww.put(hv(okVar), sdVar);
    }

    private void hww(List<com.bytedance.sdk.component.adexpress.dynamic.vy.ok> list, sd sdVar) {
        this.f34085tq.put(vy(list), sdVar);
    }
}
