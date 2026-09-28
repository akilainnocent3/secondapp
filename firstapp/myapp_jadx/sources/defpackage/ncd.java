package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ncd {
    public final m26 a;

    public ncd(m26 m26Var) {
        m26Var.getClass();
        this.a = m26Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    public static hch.d b(l8l l8lVar, List list) {
        boolean z;
        String string;
        boolean z2 = false;
        if (list != null && list.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((pnh0) it.next()) instanceof h8n) {
                z = true;
                break;
            }
        }
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                pnh0 pnh0Var = (pnh0) it2.next();
                if ((pnh0Var instanceof aq20) || v36.B(pnh0Var)) {
                    z2 = true;
                    break;
                }
            }
        }
        int iOrdinal = l8lVar.a().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            string = unh0.PREVIEW + " or " + unh0.VIDEO_CAPTURE;
            if (z2) {
                string = null;
            }
        } else {
            if (iOrdinal != 3) {
                uhc.a();
                return null;
            }
            string = unh0.IMAGE_CAPTURE.toString();
            if (z) {
                string = null;
            }
        }
        if (string != null) {
            return new hch.d(string, l8lVar);
        }
        return null;
    }

    public final hch a(e6s e6sVar, ArrayList arrayList, int i, List list) {
        if (i < arrayList.size()) {
            int i2 = i + 1;
            hch hchVarA = a(e6sVar, arrayList, i2, CollectionsKt.j0(list, arrayList.get(i)));
            return hchVarA instanceof hch.a ? hchVarA : a(e6sVar, arrayList, i2, list);
        }
        LinkedHashSet linkedHashSetE = yi80.e(e6sVar.c, list);
        pgt.a("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + linkedHashSetE + ", useCases = " + e6sVar.e);
        return this.a.p(new kg50(linkedHashSetE), e6sVar) ? new hch.a(new kg50(linkedHashSetE)) : hch.b.a;
    }
}
