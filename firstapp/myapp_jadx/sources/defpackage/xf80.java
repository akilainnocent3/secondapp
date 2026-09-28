package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public class xf80 {
    public final List<c26> a;
    public final Range<Integer> b;
    public final Set<l8l> c;
    public final List<l8l> d;
    public final List<pnh0> e;
    public final tf80 f;
    public final ScheduledExecutorService g;

    public xf80(List list, ArrayList arrayList) {
        Object next;
        String str;
        String str2;
        String str3;
        boolean zH;
        Range<Integer> range = k8e0.a;
        t3g t3gVar = t3g.a;
        m2g m2gVar = m2g.a;
        list.getClass();
        range.getClass();
        t3gVar.getClass();
        m2gVar.getClass();
        this.a = list;
        this.b = range;
        this.c = t3gVar;
        this.d = m2gVar;
        List<pnh0> listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList));
        this.e = listA0;
        this.f = new tf80();
        ScheduledExecutorService scheduledExecutorServiceA = mku.a();
        scheduledExecutorServiceA.getClass();
        this.g = scheduledExecutorServiceA;
        if (!range.equals(range)) {
            Iterator<pnh0> it = listA0.iterator();
            while (it.hasNext()) {
                if (it.next().f.S()) {
                    hb5.a("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                    throw null;
                }
            }
        }
        List<l8l> list2 = this.d;
        Set<l8l> set = this.c;
        if (set.isEmpty() && list2.isEmpty()) {
            return;
        }
        Set<l8l> set2 = set;
        ArrayList arrayList2 = new ArrayList(l48.r(set2, 10));
        Iterator<T> it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((l8l) it2.next()).a());
        }
        for (kch kchVar : CollectionsKt.A0(CollectionsKt.D0(arrayList2))) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : set2) {
                if (((l8l) obj).a() == kchVar) {
                    arrayList3.add(obj);
                }
            }
            if (arrayList3.size() > 1) {
                r2z.a(arrayList3, "requiredFeatures has conflicting feature values: ");
                throw null;
            }
        }
        if (CollectionsKt.N(list2).size() != list2.size()) {
            hqm.a(list2, "Duplicate values in preferredFeatures(", 41);
            throw null;
        }
        LinkedHashSet linkedHashSetY = CollectionsKt.Y(set2, list2);
        if (!linkedHashSetY.isEmpty()) {
            r2z.a(linkedHashSetY, "requiredFeatures and preferredFeatures have duplicate values: ");
            throw null;
        }
        for (pnh0 pnh0Var : this.e) {
            unh0.b.getClass();
            if (unh0.a.a(pnh0Var) == unh0.UNDEFINED) {
                ndv.b(pnh0Var, " is not supported with feature group");
                throw null;
            }
            String str4 = pnh0Var instanceof aq20 ? "Preview" : pnh0Var instanceof h8n ? "ImageCapture" : pnh0Var instanceof x7n ? "ImageAnalysis" : v36.B(pnh0Var) ? "VideoCapture" : "UseCase";
            Iterator<T> it3 = kch.f.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                unh0.b.getClass();
                int iOrdinal = ((kch) next).ordinal();
                if (iOrdinal == 0) {
                    zH = pnh0Var.f.H();
                } else if (iOrdinal == 1) {
                    zH = pnh0Var.f.S();
                } else if (iOrdinal == 2) {
                    zH = pnh0Var.f.e(snh0.J) || pnh0Var.f.e(snh0.K);
                } else {
                    if (iOrdinal != 3) {
                        uhc.a();
                        throw null;
                    }
                    zH = pnh0Var.f.e(i8n.S);
                }
            } while (!zH);
            kch kchVar2 = (kch) next;
            if (kchVar2 != null) {
                StringBuilder sb = new StringBuilder("A ");
                sb.append(kchVar2.name());
                sb.append(" value is set to ");
                sb.append(str4);
                sb.append(" despite using feature groups. Do not use APIs like ");
                sb.append(str4);
                sb.append(".Builder.");
                int iOrdinal2 = kchVar2.ordinal();
                if (iOrdinal2 == 0) {
                    str = "setDynamicRange";
                } else if (iOrdinal2 == 1) {
                    str = "setTargetFrameRateRange";
                } else if (iOrdinal2 == 2) {
                    str = v36.B(pnh0Var) ? "setVideoStabilizationEnabled" : "setPreviewStabilizationEnabled";
                } else {
                    if (iOrdinal2 != 3) {
                        uhc.a();
                        throw null;
                    }
                    str = "setOutputFormat";
                }
                sb.append(str);
                sb.append(" while using feature groups. If ");
                int iOrdinal3 = kchVar2.ordinal();
                if (iOrdinal3 == 0) {
                    str2 = "HDR";
                } else if (iOrdinal3 == 1) {
                    str2 = "60 FPS";
                } else if (iOrdinal3 == 2) {
                    str2 = "stabilization";
                } else {
                    if (iOrdinal3 != 3) {
                        uhc.a();
                        throw null;
                    }
                    str2 = "JPEG_R output format";
                }
                sb.append(str2);
                sb.append(" is required, instead set ");
                int iOrdinal4 = kchVar2.ordinal();
                if (iOrdinal4 == 0) {
                    str3 = "GroupableFeature.HDR_HLG10";
                } else if (iOrdinal4 == 1) {
                    str3 = "GroupableFeature.FPS_60";
                } else if (iOrdinal4 == 2) {
                    str3 = "GroupableFeature.PREVIEW_STABILIZATION";
                } else {
                    if (iOrdinal4 != 3) {
                        uhc.a();
                        throw null;
                    }
                    str3 = "GroupableFeature.IMAGE_ULTRA_HDR";
                }
                kb5.a(uf80.a(sb, str3, " as either a required or preferred feature."));
                throw null;
            }
        }
        if (this.a.isEmpty()) {
            return;
        }
        hb5.a("Effects aren't supported with feature group yet");
        throw null;
    }
}
