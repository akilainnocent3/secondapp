package defpackage;

import android.text.TextUtils;
import com.sporty.android.common.network.data.BaseResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class rvw extends iww implements lfy<hqc> {
    public final mo0 A;
    public final ozw B;
    public final ayw f;
    public final uww i;
    public final jlv v;
    public final jlv w;
    public HashMap y;
    public HashMap z;

    public rvw(vxw vxwVar, ayw aywVar) {
        super(vxwVar);
        ssw<hqc> sswVar = new ssw<>();
        this.y = new LinkedHashMap();
        this.z = new LinkedHashMap();
        this.A = l840.a();
        this.B = new ozw();
        this.f = aywVar;
        uww uwwVar = new uww();
        uwwVar.a = sswVar;
        this.i = uwwVar;
        jlv jlvVarB = fks.b(aywVar.b(), this.e.b(), new qvw(this, 0));
        this.v = jlvVarB;
        jlv jlvVarC = tsg0.c(sswVar, new gq(this, 1));
        this.w = jlvVarC;
        jlvVarB.g(this);
        jlvVarC.g(this);
    }

    @Override // defpackage.iww
    public final su5<BaseResponse> A1() {
        return this.A.g(new ArrayList(this.B.a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iww
    public final void B1(pvw pvwVar) {
        int i = pvwVar.b;
        T t = pvwVar.a;
        ssw<hqc> sswVar = this.a;
        ozw ozwVar = this.B;
        if (i == 1) {
            String str = (String) t;
            if (str != null) {
                LinkedHashMap linkedHashMap = ozwVar.c;
                HashSet hashSet = ozwVar.a;
                if (linkedHashMap != null && linkedHashMap.get(str) != null) {
                    for (rww rwwVar : (List) ozwVar.c.get(str)) {
                        hashSet.remove(rwwVar.b);
                        rwwVar.c = hashSet.contains(rwwVar.b);
                    }
                }
            }
            ozwVar.b.put(str, 0);
            sswVar.m(new nqc(ozwVar));
            return;
        }
        if (i == 2) {
            ovw ovwVar = (ovw) t;
            LinkedHashMap linkedHashMap2 = ozwVar.b;
            LinkedHashMap linkedHashMap3 = ozwVar.b;
            String str2 = ovwVar.a;
            String str3 = ovwVar.b.b;
            linkedHashMap3.put(str2, Integer.valueOf((linkedHashMap2.get(str2) != null ? ((Integer) linkedHashMap3.get(str2)).intValue() : 0) + 1));
            ozwVar.a.add(str3);
            D1(str2, str3, true);
            sswVar.m(new nqc(ozwVar));
            return;
        }
        if (i == 3) {
            ovw ovwVar2 = (ovw) t;
            LinkedHashMap linkedHashMap4 = ozwVar.b;
            LinkedHashMap linkedHashMap5 = ozwVar.b;
            String str4 = ovwVar2.a;
            String str5 = ovwVar2.b.b;
            linkedHashMap5.put(str4, Integer.valueOf((linkedHashMap4.get(str4) == null ? 0 : ((Integer) linkedHashMap5.get(str4)).intValue()) - 1));
            ozwVar.a.remove(str5);
            D1(str4, str5, false);
            sswVar.m(new nqc(ozwVar));
        }
    }

    public final void D1(String str, String str2, boolean z) {
        for (rww rwwVar : (List) this.B.c.get(str)) {
            if (TextUtils.equals(rwwVar.b, str2)) {
                rwwVar.c = z;
            }
        }
    }

    @Override // defpackage.lfy
    public final void u1(hqc hqcVar) {
        this.a.m(hqcVar);
    }

    @Override // defpackage.iww
    public final void y1() {
        this.v.k(this);
        this.w.k(this);
    }

    @Override // defpackage.iww
    public final void z1() {
        this.e.get();
        this.f.getAll();
    }
}
