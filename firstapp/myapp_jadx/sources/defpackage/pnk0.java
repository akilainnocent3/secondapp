package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class pnk0 implements Iterable, ipk0, rok0 {
    public final TreeMap a;
    public final TreeMap b;

    public pnk0(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                l(i, (ipk0) list.get(i));
            }
        }
    }

    @Override // defpackage.ipk0
    public final ipk0 a() {
        pnk0 pnk0Var = new pnk0();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof rok0;
            TreeMap treeMap = pnk0Var.a;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (ipk0) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((ipk0) entry.getValue()).a());
            }
        }
        return pnk0Var;
    }

    @Override // defpackage.rok0
    public final ipk0 b(String str) {
        ipk0 ipk0Var;
        if ("length".equals(str)) {
            return new eok0(Double.valueOf(j()));
        }
        return (!f(str) || (ipk0Var = (ipk0) this.b.get(str)) == null) ? ipk0.o : ipk0Var;
    }

    @Override // defpackage.rok0
    public final void e(String str, ipk0 ipk0Var) {
        TreeMap treeMap = this.b;
        if (ipk0Var == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, ipk0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pnk0)) {
            return false;
        }
        pnk0 pnk0Var = (pnk0) obj;
        if (j() != pnk0Var.j()) {
            return false;
        }
        TreeMap treeMap = this.a;
        if (treeMap.isEmpty()) {
            return pnk0Var.a.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!k(iIntValue).equals(pnk0Var.k(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.rok0
    public final boolean f(String str) {
        return "length".equals(str) || this.b.containsKey(str);
    }

    public final List h() {
        ArrayList arrayList = new ArrayList(j());
        for (int i = 0; i < j(); i++) {
            arrayList.add(k(i));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final Iterator i() {
        return this.a.keySet().iterator();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new jnk0(this);
    }

    public final int j() {
        TreeMap treeMap = this.a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final ipk0 k(int i) {
        ipk0 ipk0Var;
        if (i < j()) {
            return (!m(i) || (ipk0Var = (ipk0) this.a.get(Integer.valueOf(i))) == null) ? ipk0.o : ipk0Var;
        }
        mae0.a("Attempting to get element outside of current array");
        return null;
    }

    public final void l(int i, ipk0 ipk0Var) {
        if (i > 32468) {
            ib5.a("Array too large");
            return;
        }
        if (i < 0) {
            mae0.a(t7l.b(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
            return;
        }
        TreeMap treeMap = this.a;
        if (ipk0Var == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), ipk0Var);
        }
    }

    public final boolean m(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.a;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        mae0.a(t7l.b(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
        return false;
    }

    public final void n(int i) {
        TreeMap treeMap = this.a;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            treeMap.put(numValueOf, ipk0.o);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            ipk0 ipk0Var = (ipk0) treeMap.get(numValueOf2);
            if (ipk0Var != null) {
                treeMap.put(Integer.valueOf(i - 1), ipk0Var);
                treeMap.remove(numValueOf2);
            }
        }
    }

    public final String o(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= j()) {
                    break;
                }
                ipk0 ipk0VarK = k(i);
                sb.append(str2);
                if (!(ipk0VarK instanceof bqk0) && !(ipk0VarK instanceof apk0)) {
                    sb.append(ipk0VarK.zzc());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final String toString() {
        return o(",");
    }

    @Override // defpackage.ipk0
    public final String zzc() {
        return o(",");
    }

    @Override // defpackage.ipk0
    public final Double zzd() {
        TreeMap treeMap = this.a;
        if (treeMap.size() == 1) {
            return k(0).zzd();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // defpackage.ipk0
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // defpackage.ipk0
    public final Iterator zzf() {
        return new fnk0(this, this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0201  */
    /* JADX WARN: Code duplicated, block: B:102:0x020b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0210  */
    /* JADX WARN: Code duplicated, block: B:106:0x0232  */
    /* JADX WARN: Code duplicated, block: B:107:0x0238  */
    /* JADX WARN: Code duplicated, block: B:110:0x0243  */
    /* JADX WARN: Code duplicated, block: B:112:0x0260  */
    /* JADX WARN: Code duplicated, block: B:113:0x0266  */
    /* JADX WARN: Code duplicated, block: B:117:0x0275 A[LOOP:2: B:115:0x0270->B:117:0x0275, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x0284  */
    /* JADX WARN: Code duplicated, block: B:121:0x028a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0296  */
    /* JADX WARN: Code duplicated, block: B:126:0x029e  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:139:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:141:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:147:0x0309  */
    /* JADX WARN: Code duplicated, block: B:148:0x030d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0313  */
    /* JADX WARN: Code duplicated, block: B:152:0x0329 A[LOOP:3: B:151:0x0327->B:152:0x0329, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x0339  */
    /* JADX WARN: Code duplicated, block: B:156:0x033f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0354  */
    /* JADX WARN: Code duplicated, block: B:161:0x035b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0367  */
    /* JADX WARN: Code duplicated, block: B:172:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:173:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:175:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:177:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:179:0x03c4 A[LOOP:5: B:178:0x03c2->B:179:0x03c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:182:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:184:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:186:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:188:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:190:0x0404  */
    /* JADX WARN: Code duplicated, block: B:196:0x041f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0422  */
    /* JADX WARN: Code duplicated, block: B:200:0x042e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0436  */
    /* JADX WARN: Code duplicated, block: B:205:0x0442  */
    /* JADX WARN: Code duplicated, block: B:207:0x044c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0454  */
    /* JADX WARN: Code duplicated, block: B:211:0x0469  */
    /* JADX WARN: Code duplicated, block: B:213:0x046f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0475  */
    /* JADX WARN: Code duplicated, block: B:217:0x047d  */
    /* JADX WARN: Code duplicated, block: B:219:0x0482  */
    /* JADX WARN: Code duplicated, block: B:221:0x048a  */
    /* JADX WARN: Code duplicated, block: B:223:0x0490  */
    /* JADX WARN: Code duplicated, block: B:225:0x049c  */
    /* JADX WARN: Code duplicated, block: B:227:0x04ae A[LOOP:6: B:224:0x049a->B:227:0x04ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:232:0x04cb A[LOOP:7: B:230:0x04c5->B:232:0x04cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:236:0x04ef A[LOOP:8: B:234:0x04e9->B:236:0x04ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:239:0x0514  */
    /* JADX WARN: Code duplicated, block: B:241:0x051c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0526  */
    /* JADX WARN: Code duplicated, block: B:246:0x0542  */
    /* JADX WARN: Code duplicated, block: B:248:0x055c  */
    /* JADX WARN: Code duplicated, block: B:249:0x0564  */
    /* JADX WARN: Code duplicated, block: B:252:0x0574  */
    /* JADX WARN: Code duplicated, block: B:253:0x057b  */
    /* JADX WARN: Code duplicated, block: B:256:0x0580  */
    /* JADX WARN: Code duplicated, block: B:258:0x0586  */
    /* JADX WARN: Code duplicated, block: B:260:0x0592  */
    /* JADX WARN: Code duplicated, block: B:269:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:271:0x05be  */
    /* JADX WARN: Code duplicated, block: B:273:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:276:0x05da  */
    /* JADX WARN: Code duplicated, block: B:278:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:280:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:282:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:284:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:286:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:288:0x0618  */
    /* JADX WARN: Code duplicated, block: B:289:0x0623  */
    /* JADX WARN: Code duplicated, block: B:291:0x0629  */
    /* JADX WARN: Code duplicated, block: B:294:0x063d  */
    /* JADX WARN: Code duplicated, block: B:296:0x065b  */
    /* JADX WARN: Code duplicated, block: B:299:0x0664 A[LOOP:10: B:297:0x065c->B:299:0x0664, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:302:0x067c A[LOOP:11: B:302:0x067c->B:318:0x06ce, LOOP_START, PHI: r9 r35
      0x067c: PHI (r9v4 int) = (r9v3 int), (r9v5 int) binds: [B:301:0x067a, B:318:0x06ce] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r35v1 java.util.TreeMap) = (r35v0 java.util.TreeMap), (r35v4 java.util.TreeMap) binds: [B:301:0x067a, B:318:0x06ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:304:0x0682  */
    /* JADX WARN: Code duplicated, block: B:306:0x0690  */
    /* JADX WARN: Code duplicated, block: B:308:0x0696  */
    /* JADX WARN: Code duplicated, block: B:310:0x069c  */
    /* JADX WARN: Code duplicated, block: B:311:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:313:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:315:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:323:0x06f4 A[LOOP:13: B:323:0x06f4->B:325:0x06f7, LOOP_START, PHI: r0
      0x06f4: PHI (r0v33 int) = (r0v32 int), (r0v34 int) binds: [B:293:0x063b, B:325:0x06f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:325:0x06f7 A[LOOP:13: B:323:0x06f4->B:325:0x06f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:327:0x0709  */
    /* JADX WARN: Code duplicated, block: B:329:0x0711  */
    /* JADX WARN: Code duplicated, block: B:331:0x0717  */
    /* JADX WARN: Code duplicated, block: B:333:0x0722  */
    /* JADX WARN: Code duplicated, block: B:335:0x0736  */
    /* JADX WARN: Code duplicated, block: B:337:0x073c  */
    /* JADX WARN: Code duplicated, block: B:339:0x0742  */
    /* JADX WARN: Code duplicated, block: B:342:0x0760 A[LOOP:14: B:340:0x075a->B:342:0x0760, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:344:0x0777  */
    /* JADX WARN: Code duplicated, block: B:345:0x077c  */
    /* JADX WARN: Code duplicated, block: B:347:0x0784  */
    /* JADX WARN: Code duplicated, block: B:349:0x0790  */
    /* JADX WARN: Code duplicated, block: B:351:0x0797  */
    /* JADX WARN: Code duplicated, block: B:353:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:358:0x07bd A[LOOP:16: B:356:0x07b7->B:358:0x07bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:362:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:364:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:366:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:375:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x06ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x06d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x06c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x07d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x07d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x07b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Code duplicated, block: B:56:0x012f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x014f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0170  */
    /* JADX WARN: Code duplicated, block: B:65:0x0176  */
    /* JADX WARN: Code duplicated, block: B:67:0x017a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0182  */
    /* JADX WARN: Code duplicated, block: B:72:0x018d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fb  */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d3, code lost:
    
        if (defpackage.k2h.f(r7, r2, (defpackage.fpk0) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).j() != r7.j()) goto L170;
     */
    @Override // defpackage.ipk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ipk0 c(java.lang.String r37, defpackage.g3l0 r38, java.util.ArrayList r39) {
        /*
            Method dump skipped, instruction units count: 2130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pnk0.c(java.lang.String, g3l0, java.util.ArrayList):ipk0");
    }

    public pnk0() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }
}
