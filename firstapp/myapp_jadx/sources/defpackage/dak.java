package defpackage;

import com.sporty.android.core.model.cms.CMSRequest;
import com.sporty.android.core.model.cms.CMSResponse;
import com.sporty.android.core.model.pocket.common.PayHintData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dak {
    public final wo5 a;
    public final uqm b;

    public dak(wo5 wo5Var, uqm uqmVar) {
        wo5Var.getClass();
        uqmVar.getClass();
        this.a = wo5Var;
        this.b = uqmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable a(x1b x1bVar, String str, List list) {
        bak bakVar;
        ArrayList arrayList;
        Object next;
        String value;
        if (x1bVar instanceof bak) {
            bakVar = (bak) x1bVar;
            int i = bakVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bakVar.d = i - Integer.MIN_VALUE;
            } else {
                bakVar = new bak(this, x1bVar);
            }
        } else {
            bakVar = new bak(this, x1bVar);
        }
        Object obj = bakVar.b;
        y5b y5bVar = y5b.a;
        int i2 = bakVar.d;
        int i3 = 0;
        if (i2 == 0) {
            ArrayList arrayListA = j9f.a(obj);
            for (Object obj2 : list) {
                if (Intrinsics.g(((PayHintData) obj2).methodId, str)) {
                    arrayListA.add(obj2);
                }
            }
            if (arrayListA.isEmpty()) {
                zi50.a aVar = zi50.b;
                return m2g.a;
            }
            ArrayList arrayList2 = new ArrayList(l48.r(arrayListA, 10));
            int size = arrayListA.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj3 = arrayListA.get(i4);
                i4++;
                Collection collection = ((PayHintData) obj3).descriptionLines;
                if (collection == null) {
                    collection = m2g.a;
                }
                arrayList2.add(collection);
            }
            ArrayList arrayListS = l48.s(arrayList2);
            ArrayList arrayList3 = new ArrayList(l48.r(arrayListA, 10));
            int size2 = arrayListA.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj4 = arrayListA.get(i5);
                i5++;
                Collection collection2 = ((PayHintData) obj4).descriptionLinesCMS;
                if (collection2 == null) {
                    collection2 = m2g.a;
                }
                arrayList3.add(collection2);
            }
            ArrayList arrayListS2 = l48.s(arrayList3);
            if (arrayListS2.isEmpty()) {
                zi50.a aVar2 = zi50.b;
                return arrayListS;
            }
            String languageCode = this.b.getLanguageCode();
            languageCode.getClass();
            ArrayList arrayList4 = new ArrayList(l48.r(arrayListS2, 10));
            int i6 = 0;
            for (int size3 = arrayListS2.size(); i6 < size3; size3 = size3) {
                PayHintData.DescriptionLineCMS descriptionLineCMS = (PayHintData.DescriptionLineCMS) arrayListS2.get(i6);
                arrayList4.add(new CMSRequest(descriptionLineCMS.getKey(), descriptionLineCMS.getPage(), null, languageCode, 4, null));
                i6++;
            }
            lyh lyhVarA = this.a.a(arrayList4);
            cak cakVar = new cak(2, null);
            bakVar.a = arrayListS2;
            bakVar.d = 1;
            Object objB = s0i.b(lyhVarA, cakVar, bakVar);
            if (objB == y5bVar) {
                return y5bVar;
            }
            obj = objB;
            arrayList = arrayListS2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = bakVar.a;
            uj50.b(obj);
        }
        lk50 lk50Var = (lk50) obj;
        if (lk50Var instanceof lk50.a) {
            zi50.a aVar3 = zi50.b;
            return uj50.a(((lk50.a) lk50Var).a);
        }
        lk50Var.getClass();
        List list2 = (List) ((lk50.c) lk50Var).a;
        ArrayList arrayList5 = new ArrayList(l48.r(arrayList, 10));
        int size4 = arrayList.size();
        while (i3 < size4) {
            Object obj5 = arrayList.get(i3);
            i3++;
            PayHintData.DescriptionLineCMS descriptionLineCMS2 = (PayHintData.DescriptionLineCMS) obj5;
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                CMSResponse cMSResponse = (CMSResponse) next;
                if (Intrinsics.g(cMSResponse.getPage(), descriptionLineCMS2.getPage()) && Intrinsics.g(cMSResponse.getKey(), descriptionLineCMS2.getKey())) {
                    break;
                }
            }
            CMSResponse cMSResponse2 = (CMSResponse) next;
            if (cMSResponse2 == null || (value = cMSResponse2.getValue()) == null) {
                value = descriptionLineCMS2.getDefault();
            }
            arrayList5.add(value);
        }
        zi50.a aVar4 = zi50.b;
        return arrayList5;
    }
}
