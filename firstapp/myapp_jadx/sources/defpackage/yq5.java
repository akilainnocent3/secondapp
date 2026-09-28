package defpackage;

import android.util.Log;
import androidx.window.layout.oKr.TEFcJcMqR;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.data.CashOut;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class yq5 {
    public final s b;
    public boolean c = false;
    public final e a = e.b;

    public static class a {
        public final String a;
        public final b b;
        public final String c;

        public a(String str, b bVar, String str2) {
            this.a = str;
            this.b = bVar;
            this.c = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final /* synthetic */ b[] e;

        static {
            b bVar = new b("EXISTS", 0);
            a = bVar;
            b bVar2 = new b("EQUALS", 1);
            b = bVar2;
            b bVar3 = new b("INCLUDES", 2);
            c = bVar3;
            b bVar4 = new b("DASHMATCH", 3);
            d = bVar4;
            e = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) e.clone();
        }
    }

    public static class c extends dr60.h {

        public static class a {
            public final int a;
            public final int b;

            public a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }
        }

        public c(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public static int r(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            if (i >= 65 && i <= 70) {
                return i - 55;
            }
            if (i < 97 || i > 102) {
                return -1;
            }
            return i - 87;
        }

        public final String s() {
            int iR;
            if (f()) {
                return null;
            }
            char cCharAt = this.a.charAt(this.b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.b++;
            int iIntValue = h().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = h().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = h().intValue();
                        } else {
                            int iR2 = r(iIntValue);
                            if (iR2 != -1) {
                                for (int i = 1; i <= 5 && (iR = r((iIntValue = h().intValue()))) != -1; i++) {
                                    iR2 = (iR2 * 16) + iR;
                                }
                                sb.append((char) iR2);
                            }
                        }
                    }
                }
                sb.append((char) iIntValue);
                iIntValue = h().intValue();
            }
            return sb.toString();
        }

        public final String t() {
            int i;
            boolean zF = f();
            int i2 = this.b;
            String str = this.a;
            if (zF) {
                i = i2;
            } else {
                int iCharAt = str.charAt(i2);
                if (iCharAt == 45) {
                    iCharAt = a();
                }
                if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                    i = i2;
                } else {
                    int iA = a();
                    while (true) {
                        if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && !((iA >= 48 && iA <= 57) || iA == 45 || iA == 95))) {
                            break;
                        }
                        iA = a();
                    }
                    i = this.b;
                }
                this.b = i2;
            }
            if (i == i2) {
                return null;
            }
            String strSubstring = str.substring(i2, i);
            this.b = i;
            return strSubstring;
        }

        /* JADX WARN: Code duplicated, block: B:125:0x01d7  */
        /* JADX WARN: Code duplicated, block: B:187:0x0308  */
        /* JADX WARN: Code duplicated, block: B:22:0x004c  */
        /* JADX WARN: Code duplicated, block: B:241:0x03d8  */
        /* JADX WARN: Code duplicated, block: B:250:0x0415  */
        /* JADX WARN: Code duplicated, block: B:255:0x042e  */
        /* JADX WARN: Code duplicated, block: B:257:0x0432  */
        /* JADX WARN: Code duplicated, block: B:261:0x0446  */
        /* JADX WARN: Code duplicated, block: B:265:0x0455  */
        /* JADX WARN: Code duplicated, block: B:281:0x044f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:282:0x0442 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v3, types: [yq5$b] */
        /* JADX WARN: Type inference failed for: r10v60 */
        /* JADX WARN: Type inference failed for: r10v61 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v18 */
        /* JADX WARN: Type inference failed for: r11v19, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r11v22 */
        /* JADX WARN: Type inference failed for: r11v23 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v2, types: [yq5$d] */
        /* JADX WARN: Type inference failed for: r6v9 */
        /* JADX WARN: Type inference failed for: r7v20 */
        /* JADX WARN: Type inference failed for: r7v24, types: [yq5$c$a] */
        /* JADX WARN: Type inference failed for: r7v26 */
        /* JADX WARN: Type inference failed for: r7v33 */
        /* JADX WARN: Type inference failed for: r8v10, types: [yq5$r] */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v12, types: [yq5$r] */
        /* JADX WARN: Type inference failed for: r8v13, types: [yq5$r] */
        /* JADX WARN: Type inference failed for: r8v14, types: [yq5$r] */
        /* JADX WARN: Type inference failed for: r8v15, types: [yq5$r] */
        /* JADX WARN: Type inference failed for: r8v16, types: [yq5$r] */
        /* JADX WARN: Type inference failed for: r8v19 */
        /* JADX WARN: Type inference failed for: r8v20 */
        /* JADX WARN: Type inference failed for: r8v21 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v9, types: [yq5$r] */
        public final ArrayList u() throws xq5 {
            ArrayList arrayList;
            ?? r6;
            ?? rVar;
            ArrayList arrayList2;
            Object obj;
            String strK;
            char c;
            int i;
            qxo qxoVarA;
            a aVar;
            ?? r7;
            a aVar2;
            Object obj2;
            g gVar;
            Object obj3;
            ArrayList arrayListU;
            ArrayList arrayList3;
            k kVar;
            String str = null;
            if (f()) {
                return null;
            }
            int i2 = 1;
            ArrayList arrayList4 = new ArrayList(1);
            q qVar = new q();
            while (!f() && !f()) {
                int i3 = this.b;
                ArrayList arrayList5 = qVar.a;
                char c2 = '+';
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    r6 = str;
                } else if (d('>')) {
                    q();
                    r6 = d.b;
                } else if (d('+')) {
                    q();
                    r6 = d.c;
                } else {
                    r6 = str;
                }
                if (d('*')) {
                    rVar = new r(r6, str);
                } else {
                    String strT = t();
                    if (strT != null) {
                        r rVar2 = new r(r6, strT);
                        qVar.b += i2;
                        rVar = rVar2;
                    } else {
                        rVar = str;
                    }
                }
                while (!f()) {
                    boolean zD = d('.');
                    b bVar = b.b;
                    if (zD) {
                        if (rVar == 0) {
                            rVar = new r(r6, str);
                        }
                        String strT2 = t();
                        if (strT2 == null) {
                            throw new xq5("Invalid \".class\" simpleSelectors");
                        }
                        rVar.a("class", bVar, strT2);
                        qVar.a();
                    } else if (d('#')) {
                        if (rVar == 0) {
                            rVar = new r(r6, str);
                        }
                        String strT3 = t();
                        if (strT3 == null) {
                            throw new xq5("Invalid \"#id\" simpleSelectors");
                        }
                        rVar.a(AnalyticsParam.EVENT_PARAM_ID, bVar, strT3);
                        qVar.b += CashOut.BIG_NUMBER;
                    } else if (d('[')) {
                        if (rVar == 0) {
                            rVar = new r(r6, str);
                        }
                        q();
                        String strT4 = t();
                        if (strT4 == null) {
                            throw new xq5("Invalid attribute simpleSelectors");
                        }
                        q();
                        if (!d('=')) {
                            if (e("~=")) {
                                obj = bVar;
                                obj = b.c;
                            } else if (e("|=")) {
                                obj = bVar;
                                obj = b.d;
                            } else {
                                obj = bVar;
                                obj = str;
                            }
                        }
                        if (obj != null) {
                            q();
                            if (f()) {
                                strK = str;
                            } else {
                                strK = k();
                                if (strK == null) {
                                    strK = t();
                                }
                            }
                            if (strK == null) {
                                throw new xq5("Invalid attribute simpleSelectors");
                            }
                            q();
                        } else {
                            strK = str;
                        }
                        ?? r10 = obj;
                        if (!d(']')) {
                            throw new xq5("Invalid attribute simpleSelectors");
                        }
                        if (obj == null) {
                            r10 = b.a;
                        }
                        rVar.a(strT4, r10, strK);
                        qVar.a();
                    } else {
                        rVar = rVar;
                        if (d(':')) {
                            if (rVar == 0) {
                                rVar = new r(r6, str);
                            }
                            String strT5 = t();
                            if (strT5 == null) {
                                throw new xq5("Invalid pseudo class");
                            }
                            i iVar = (i) i.e.get(strT5);
                            if (iVar == null) {
                                iVar = i.d;
                            }
                            switch (iVar.ordinal()) {
                                case 0:
                                    c = c2;
                                    n nVar = new n();
                                    qVar.a();
                                    obj2 = nVar;
                                    arrayList3 = rVar.d;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        rVar.d = arrayList3;
                                    }
                                    arrayList3.add(obj2);
                                    c2 = c;
                                    str = null;
                                    break;
                                case 1:
                                    c = c2;
                                    m mVar = new m();
                                    qVar.a();
                                    obj2 = mVar;
                                    arrayList3 = rVar.d;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        rVar.d = arrayList3;
                                    }
                                    arrayList3.add(obj2);
                                    c2 = c;
                                    str = null;
                                    break;
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    String str2 = str;
                                    boolean z = iVar == i.a || iVar == i.b;
                                    boolean z2 = iVar == i.b || iVar == i.c;
                                    if (f()) {
                                        r7 = str2;
                                        c = '+';
                                    } else {
                                        int i4 = this.b;
                                        if (d('(')) {
                                            q();
                                            if (e("odd")) {
                                                aVar2 = new a(2, 1);
                                            } else {
                                                if (e("even")) {
                                                    aVar2 = new a(2, 0);
                                                } else {
                                                    int i5 = (!d('+') && d('-')) ? -1 : 1;
                                                    int i6 = this.b;
                                                    int i7 = this.c;
                                                    String str3 = this.a;
                                                    qxo qxoVarA2 = qxo.a(i6, i7, str3);
                                                    if (qxoVarA2 != null) {
                                                        this.b = qxoVarA2.a;
                                                    }
                                                    if (d('n') || d('N')) {
                                                        if (qxoVarA2 == null) {
                                                            qxoVarA2 = new qxo(1L, this.b);
                                                        }
                                                        q();
                                                        c = '+';
                                                        boolean zD2 = d('+');
                                                        i = (zD2 || !(zD2 = d('-'))) ? 1 : -1;
                                                        if (zD2) {
                                                            q();
                                                            qxoVarA = qxo.a(this.b, i7, str3);
                                                            if (qxoVarA != null) {
                                                                this.b = qxoVarA.a;
                                                            } else {
                                                                this.b = i4;
                                                            }
                                                        } else {
                                                            qxoVarA = null;
                                                        }
                                                    } else {
                                                        qxoVarA = qxoVarA2;
                                                        i = i5;
                                                        qxoVarA2 = null;
                                                        i5 = 1;
                                                        c = '+';
                                                    }
                                                    aVar = new a(qxoVarA2 == null ? 0 : ((int) qxoVarA2.b) * i5, qxoVarA == null ? 0 : ((int) qxoVarA.b) * i);
                                                    q();
                                                    r7 = aVar;
                                                    if (!d(')')) {
                                                        this.b = i4;
                                                    }
                                                }
                                                r7 = 0;
                                            }
                                            c = '+';
                                            aVar = aVar2;
                                            q();
                                            r7 = aVar;
                                            if (!d(')')) {
                                                this.b = i4;
                                                r7 = 0;
                                            }
                                        } else {
                                            r7 = str2;
                                            c = '+';
                                        }
                                    }
                                    if (r7 == 0) {
                                        throw new xq5("Invalid or missing parameter section for pseudo class: ".concat(strT5));
                                    }
                                    g gVar2 = new g(r7.a, r7.b, rVar.b, z, z2);
                                    qVar.a();
                                    obj2 = gVar2;
                                    arrayList3 = rVar.d;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        rVar.d = arrayList3;
                                    }
                                    arrayList3.add(obj2);
                                    c2 = c;
                                    str = null;
                                    break;
                                    break;
                                case 6:
                                    gVar = new g(0, 1, null, true, false);
                                    qVar.a();
                                    obj3 = gVar;
                                    c = '+';
                                    obj2 = obj3;
                                    arrayList3 = rVar.d;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        rVar.d = arrayList3;
                                    }
                                    arrayList3.add(obj2);
                                    c2 = c;
                                    str = null;
                                    break;
                                case 7:
                                    g gVar3 = new g(0, 1, null, false, false);
                                    qVar.a();
                                    obj3 = gVar3;
                                    c = '+';
                                    obj2 = obj3;
                                    arrayList3 = rVar.d;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        rVar.d = arrayList3;
                                    }
                                    arrayList3.add(obj2);
                                    c2 = c;
                                    str = null;
                                    break;
                                case 8:
                                    g gVar4 = new g(0, 1, rVar.b, true, true);
                                    qVar.a();
                                    obj3 = gVar4;
                                    c = '+';
                                    obj2 = obj3;
                                    arrayList3 = rVar.d;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        rVar.d = arrayList3;
                                    }
                                    arrayList3.add(obj2);
                                    c2 = c;
                                    str = null;
                                    break;
                                case 9:
                                    gVar = new g(0, 1, rVar.b, false, true);
                                    qVar.a();
                                    obj3 = gVar;
                                    c = '+';
                                    obj2 = obj3;
                                    arrayList3 = rVar.d;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        rVar.d = arrayList3;
                                    }
                                    arrayList3.add(obj2);
                                    c2 = c;
                                    str = null;
                                    break;
                                case 10:
                                    l lVar = new l(false, null);
                                    qVar.a();
                                    obj3 = lVar;
                                    c = '+';
                                    obj2 = obj3;
                                    arrayList3 = rVar.d;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        rVar.d = arrayList3;
                                    }
                                    arrayList3.add(obj2);
                                    c2 = c;
                                    str = null;
                                    break;
                                case 11:
                                    l lVar2 = new l(true, rVar.b);
                                    qVar.a();
                                    obj3 = lVar2;
                                    c = '+';
                                    obj2 = obj3;
                                    arrayList3 = rVar.d;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        rVar.d = arrayList3;
                                    }
                                    arrayList3.add(obj2);
                                    c2 = c;
                                    str = null;
                                    break;
                                case 12:
                                    h hVar = new h();
                                    qVar.a();
                                    obj3 = hVar;
                                    c = '+';
                                    obj2 = obj3;
                                    arrayList3 = rVar.d;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        rVar.d = arrayList3;
                                    }
                                    arrayList3.add(obj2);
                                    c2 = c;
                                    str = null;
                                    break;
                                case 13:
                                    if (f()) {
                                        arrayListU = str;
                                    } else {
                                        int i8 = this.b;
                                        if (d('(')) {
                                            q();
                                            arrayListU = u();
                                            if (arrayListU != null && d(')')) {
                                                int size = arrayListU.size();
                                                int i9 = 0;
                                                while (i9 < size) {
                                                    Object obj4 = arrayListU.get(i9);
                                                    i9++;
                                                    ArrayList arrayList6 = ((q) obj4).a;
                                                    if (arrayList6 != null) {
                                                        int size2 = arrayList6.size();
                                                        int i10 = 0;
                                                        while (true) {
                                                            if (i10 < size2) {
                                                                Object obj5 = arrayList6.get(i10);
                                                                int i11 = i10 + 1;
                                                                ArrayList arrayList7 = ((r) obj5).d;
                                                                if (arrayList7 == null) {
                                                                    continue;
                                                                } else {
                                                                    int size3 = arrayList7.size();
                                                                    int i12 = 0;
                                                                    while (true) {
                                                                        if (i12 < size3) {
                                                                            Object obj6 = arrayList7.get(i12);
                                                                            int i13 = i12 + 1;
                                                                            if (((f) obj6) instanceof j) {
                                                                                arrayListU = null;
                                                                            } else {
                                                                                i12 = i13;
                                                                            }
                                                                        } else {
                                                                            i10 = i11;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                this.b = i8;
                                                arrayListU = str;
                                            }
                                        } else {
                                            arrayListU = str;
                                        }
                                    }
                                    if (arrayListU == null) {
                                        throw new xq5("Invalid or missing parameter section for pseudo class: ".concat(strT5));
                                    }
                                    j jVar = new j();
                                    jVar.a = arrayListU;
                                    int size4 = arrayListU.size();
                                    int i14 = Integer.MIN_VALUE;
                                    int i15 = 0;
                                    while (i15 < size4) {
                                        Object obj7 = arrayListU.get(i15);
                                        i15++;
                                        int i16 = ((q) obj7).b;
                                        if (i16 > i14) {
                                            i14 = i16;
                                        }
                                    }
                                    qVar.b = i14;
                                    obj3 = jVar;
                                    c = '+';
                                    obj2 = obj3;
                                    arrayList3 = rVar.d;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        rVar.d = arrayList3;
                                    }
                                    arrayList3.add(obj2);
                                    c2 = c;
                                    str = null;
                                    break;
                                    break;
                                case 14:
                                    if (!f()) {
                                        int i17 = this.b;
                                        if (d('(')) {
                                            q();
                                            ?? arrayList8 = str;
                                            while (true) {
                                                String strT6 = t();
                                                arrayList8 = arrayList8;
                                                if (strT6 == null) {
                                                    this.b = i17;
                                                } else {
                                                    if (arrayList8 == 0) {
                                                        arrayList8 = new ArrayList();
                                                    }
                                                    arrayList8.add(strT6);
                                                    q();
                                                    if (!p()) {
                                                        if (!d(')')) {
                                                            this.b = i17;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    k kVar2 = new k(strT5);
                                    qVar.a();
                                    kVar = kVar2;
                                    c = c2;
                                    obj2 = kVar;
                                    arrayList3 = rVar.d;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        rVar.d = arrayList3;
                                    }
                                    arrayList3.add(obj2);
                                    c2 = c;
                                    str = null;
                                    break;
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                    k kVar3 = new k(strT5);
                                    qVar.a();
                                    kVar = kVar3;
                                    c = c2;
                                    obj2 = kVar;
                                    arrayList3 = rVar.d;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        rVar.d = arrayList3;
                                    }
                                    arrayList3.add(obj2);
                                    c2 = c;
                                    str = null;
                                    break;
                                default:
                                    throw new xq5("Unsupported pseudo class: ".concat(strT5));
                            }
                        } else {
                            if (rVar != 0) {
                                this.b = i3;
                                arrayList = qVar.a;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    arrayList4.add(qVar);
                                }
                                return arrayList4;
                            }
                            arrayList2 = qVar.a;
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                qVar.a = arrayList2;
                            }
                            arrayList2.add(rVar);
                            if (!p()) {
                                arrayList4.add(qVar);
                                qVar = new q();
                            }
                            str = null;
                            i2 = 1;
                        }
                    }
                }
                if (rVar != 0) {
                    this.b = i3;
                    arrayList = qVar.a;
                    if (arrayList != null) {
                        arrayList4.add(qVar);
                    }
                    return arrayList4;
                }
                arrayList2 = qVar.a;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    qVar.a = arrayList2;
                }
                arrayList2.add(rVar);
                if (!p()) {
                    arrayList4.add(qVar);
                    qVar = new q();
                }
                str = null;
                i2 = 1;
            }
            arrayList = qVar.a;
            if (arrayList != null) {
                arrayList4.add(qVar);
            }
            return arrayList4;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final d b;
        public static final d c;
        public static final /* synthetic */ d[] d;

        static {
            d dVar = new d("DESCENDANT", 0);
            a = dVar;
            d dVar2 = new d("CHILD", 1);
            b = dVar2;
            d dVar3 = new d("FOLLOWS", 2);
            c = dVar3;
            d = new d[]{dVar, dVar2, dVar3};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        public static final e a;
        public static final e b;
        public static final /* synthetic */ e[] c;

        static {
            e eVar = new e("all", 0);
            a = eVar;
            e eVar2 = new e("aural", 1);
            e eVar3 = new e("braille", 2);
            e eVar4 = new e("embossed", 3);
            e eVar5 = new e("handheld", 4);
            e eVar6 = new e("print", 5);
            e eVar7 = new e("projection", 6);
            e eVar8 = new e("screen", 7);
            b = eVar8;
            c = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, new e("speech", 8), new e("tty", 9), new e("tv", 10)};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) c.clone();
        }
    }

    public interface f {
        boolean a(yq60.k0 k0Var);
    }

    public static class g implements f {
        public final int a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final String e;

        public g(int i, int i2, String str, boolean z, boolean z2) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = z2;
            this.e = str;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0064 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x0065 A[RETURN] */
        @Override // yq5.f
        public final boolean a(yq60.k0 k0Var) {
            int i;
            int i2;
            boolean z = this.d;
            String strN = this.e;
            if (z && strN == null) {
                strN = k0Var.n();
            }
            yq60.i0 i0Var = k0Var.b;
            if (i0Var != null) {
                Iterator<yq60.m0> it = i0Var.getChildren().iterator();
                i = 0;
                i2 = 0;
                while (it.hasNext()) {
                    yq60.k0 k0Var2 = (yq60.k0) it.next();
                    if (k0Var2 == k0Var) {
                        i = i2;
                    }
                    if (strN == null || k0Var2.n().equals(strN)) {
                        i2++;
                    }
                }
            } else {
                i = 0;
                i2 = 1;
            }
            int i3 = this.c ? i + 1 : i2 - i;
            int i4 = this.b;
            int i5 = this.a;
            if (i5 == 0) {
                if (i3 == i4) {
                    return true;
                }
                return false;
            }
            int i6 = i3 - i4;
            if (i6 % i5 == 0 && (Integer.signum(i6) == 0 || Integer.signum(i6) == Integer.signum(i5))) {
                return true;
            }
            return false;
        }

        public final String toString() {
            String str = this.c ? "" : "last-";
            int i = this.b;
            boolean z = this.d;
            int i2 = this.a;
            return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
        }
    }

    public static class h implements f {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // yq5.f
        public final boolean a(yq60.k0 k0Var) {
            return !(k0Var instanceof yq60.i0) || ((yq60.i0) k0Var).getChildren().size() == 0;
        }

        public final String toString() {
            return "empty";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class i {
        public static final i a;
        public static final i b;
        public static final i c;
        public static final i d;
        public static final HashMap e;
        public static final /* synthetic */ i[] f;

        /* JADX INFO: Fake field, exist only in values array */
        i EF1;

        public i() {
            throw null;
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) f.clone();
        }

        static {
            i iVar = new i("target", 0);
            i iVar2 = new i("root", 1);
            i iVar3 = new i("nth_child", 2);
            a = iVar3;
            i iVar4 = new i("nth_last_child", 3);
            i iVar5 = new i("nth_of_type", 4);
            b = iVar5;
            i iVar6 = new i("nth_last_of_type", 5);
            c = iVar6;
            i iVar7 = new i("first_child", 6);
            i iVar8 = new i("last_child", 7);
            i iVar9 = new i("first_of_type", 8);
            i iVar10 = new i("last_of_type", 9);
            i iVar11 = new i("only_child", 10);
            i iVar12 = new i("only_of_type", 11);
            i iVar13 = new i("empty", 12);
            i iVar14 = new i("not", 13);
            i iVar15 = new i("lang", 14);
            i iVar16 = new i(TEFcJcMqR.cYUWxOpkWET, 15);
            i iVar17 = new i("visited", 16);
            i iVar18 = new i("hover", 17);
            i iVar19 = new i("active", 18);
            i iVar20 = new i("focus", 19);
            i iVar21 = new i("enabled", 20);
            i iVar22 = new i("disabled", 21);
            i iVar23 = new i(AnalyticsParam.EVENT_STATUS_CHECKED, 22);
            i iVar24 = new i("indeterminate", 23);
            i iVar25 = new i("UNSUPPORTED", 24);
            d = iVar25;
            f = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, iVar18, iVar19, iVar20, iVar21, iVar22, iVar23, iVar24, iVar25};
            e = new HashMap();
            for (i iVar26 : values()) {
                if (iVar26 != d) {
                    e.put(iVar26.name().replace('_', '-'), iVar26);
                }
            }
        }
    }

    public static class j implements f {
        public List<q> a;

        @Override // yq5.f
        public final boolean a(yq60.k0 k0Var) {
            Iterator<q> it = this.a.iterator();
            while (it.hasNext()) {
                if (yq5.g(it.next(), k0Var)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return ng1.a(new StringBuilder("not("), this.a, ")");
        }
    }

    public static class k implements f {
        public final String a;

        public k(String str) {
            this.a = str;
        }

        @Override // yq5.f
        public final boolean a(yq60.k0 k0Var) {
            return false;
        }

        public final String toString() {
            return this.a;
        }
    }

    public static class l implements f {
        public final boolean a;
        public final String b;

        public l(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        @Override // yq5.f
        public final boolean a(yq60.k0 k0Var) {
            int i;
            boolean z = this.a;
            String strN = this.b;
            if (z && strN == null) {
                strN = k0Var.n();
            }
            yq60.i0 i0Var = k0Var.b;
            if (i0Var != null) {
                Iterator<yq60.m0> it = i0Var.getChildren().iterator();
                i = 0;
                while (it.hasNext()) {
                    yq60.k0 k0Var2 = (yq60.k0) it.next();
                    if (strN == null || k0Var2.n().equals(strN)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            return i == 1;
        }

        public final String toString() {
            return this.a ? tug.a("only-of-type <", this.b, ">") : "only-child";
        }
    }

    public static class m implements f {
        @Override // yq5.f
        public final boolean a(yq60.k0 k0Var) {
            return k0Var.b == null;
        }

        public final String toString() {
            return "root";
        }
    }

    public static class n implements f {
        @Override // yq5.f
        public final boolean a(yq60.k0 k0Var) {
            return false;
        }

        public final String toString() {
            return "target";
        }
    }

    public static class o {
        public q a;
        public yq60.d0 b;
        public s c;

        public final String toString() {
            return String.valueOf(this.a) + " {...} (src=" + this.c + ")";
        }
    }

    public static class p {
        public ArrayList a = null;

        public final void a(o oVar) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            int i = 0;
            while (true) {
                int size = this.a.size();
                ArrayList arrayList = this.a;
                if (i >= size) {
                    arrayList.add(oVar);
                    return;
                } else {
                    if (((o) arrayList.get(i)).a.b > oVar.a.b) {
                        this.a.add(i, oVar);
                        return;
                    }
                    i++;
                }
            }
        }

        public final void b(p pVar) {
            if (pVar.a == null) {
                return;
            }
            if (this.a == null) {
                this.a = new ArrayList(pVar.a.size());
            }
            ArrayList arrayList = pVar.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                a((o) obj);
            }
        }

        public final String toString() {
            if (this.a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                sb.append(((o) obj).toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    public static class q {
        public ArrayList a = null;
        public int b = 0;

        public final void a() {
            this.b += 1000;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                sb.append((r) obj);
                sb.append(' ');
            }
            sb.append('[');
            return rr1.b(sb, this.b, ']');
        }
    }

    public static class r {
        public final d a;
        public final String b;
        public ArrayList c = null;
        public ArrayList d = null;

        public r(d dVar, String str) {
            this.a = null;
            this.b = null;
            this.a = dVar == null ? d.a : dVar;
            this.b = str;
        }

        public final void a(String str, b bVar, String str2) {
            ArrayList arrayList = this.c;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.c = arrayList;
            }
            arrayList.add(new a(str, bVar, str2));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            d dVar = d.b;
            d dVar2 = this.a;
            if (dVar2 == dVar) {
                sb.append("> ");
            } else if (dVar2 == d.c) {
                sb.append("+ ");
            }
            String str = this.b;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            ArrayList arrayList = this.c;
            int i = 0;
            if (arrayList != null) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    a aVar = (a) obj;
                    sb.append('[');
                    String str2 = aVar.a;
                    String str3 = aVar.c;
                    sb.append(str2);
                    int iOrdinal = aVar.b.ordinal();
                    if (iOrdinal == 1) {
                        sb.append('=');
                        sb.append(str3);
                    } else if (iOrdinal == 2) {
                        sb.append("~=");
                        sb.append(str3);
                    } else if (iOrdinal == 3) {
                        sb.append("|=");
                        sb.append(str3);
                    }
                    sb.append(']');
                }
            }
            ArrayList arrayList2 = this.d;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    sb.append(':');
                    sb.append((f) obj2);
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class s {
        public static final s a;
        public static final s b;
        public static final /* synthetic */ s[] c;

        static {
            s sVar = new s("Document", 0);
            a = sVar;
            s sVar2 = new s("RenderOptions", 1);
            b = sVar2;
            c = new s[]{sVar, sVar2};
        }

        public s() {
            throw null;
        }

        public static s valueOf(String str) {
            return (s) Enum.valueOf(s.class, str);
        }

        public static s[] values() {
            return (s[]) c.clone();
        }
    }

    public yq5(s sVar) {
        this.b = sVar;
    }

    public static int a(ArrayList arrayList, int i2, yq60.k0 k0Var) {
        int i3 = 0;
        if (i2 < 0) {
            return 0;
        }
        Object obj = arrayList.get(i2);
        yq60.i0 i0Var = k0Var.b;
        if (obj != i0Var) {
            return -1;
        }
        Iterator<yq60.m0> it = i0Var.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next() == k0Var) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static ArrayList c(c cVar) {
        ArrayList arrayList = new ArrayList();
        while (!cVar.f()) {
            String str = cVar.a;
            String strSubstring = null;
            if (!cVar.f()) {
                int i2 = cVar.b;
                char cCharAt = str.charAt(i2);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    cVar.b = i2;
                } else {
                    int iA = cVar.a();
                    while (true) {
                        if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                            break;
                        }
                        iA = cVar.a();
                    }
                    strSubstring = str.substring(i2, cVar.b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(e.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!cVar.p()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean f(q qVar, int i2, ArrayList arrayList, int i3, yq60.k0 k0Var) {
        r rVar = (r) qVar.a.get(i2);
        if (!i(rVar, k0Var)) {
            return false;
        }
        d dVar = rVar.a;
        if (dVar == d.a) {
            if (i2 != 0) {
                while (i3 >= 0) {
                    if (!h(qVar, i2 - 1, arrayList, i3)) {
                        i3--;
                    }
                }
                return false;
            }
            return true;
        }
        if (dVar == d.b) {
            return h(qVar, i2 - 1, arrayList, i3);
        }
        int iA = a(arrayList, i3, k0Var);
        if (iA <= 0) {
            return false;
        }
        return f(qVar, i2 - 1, arrayList, i3, (yq60.k0) k0Var.b.getChildren().get(iA - 1));
    }

    public static boolean g(q qVar, yq60.k0 k0Var) {
        ArrayList arrayList = new ArrayList();
        Object obj = k0Var.b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((yq60.m0) obj).b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = qVar.a;
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        ArrayList arrayList3 = qVar.a;
        if (size2 == 1) {
            return i((r) arrayList3.get(0), k0Var);
        }
        return f(qVar, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, k0Var);
    }

    public static boolean h(q qVar, int i2, ArrayList arrayList, int i3) {
        r rVar = (r) qVar.a.get(i2);
        yq60.k0 k0Var = (yq60.k0) arrayList.get(i3);
        if (!i(rVar, k0Var)) {
            return false;
        }
        d dVar = rVar.a;
        if (dVar == d.a) {
            if (i2 != 0) {
                while (i3 > 0) {
                    i3--;
                    if (h(qVar, i2 - 1, arrayList, i3)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (dVar == d.b) {
            return h(qVar, i2 - 1, arrayList, i3 - 1);
        }
        int iA = a(arrayList, i3, k0Var);
        if (iA <= 0) {
            return false;
        }
        return f(qVar, i2 - 1, arrayList, i3, (yq60.k0) k0Var.b.getChildren().get(iA - 1));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:1: B:28:0x005c->B:46:?, LOOP_END, SYNTHETIC] */
    public static boolean i(r rVar, yq60.k0 k0Var) {
        ArrayList arrayList;
        int size;
        int i2;
        Object obj;
        ArrayList arrayList2;
        String str = rVar.b;
        if (str == null || str.equals(k0Var.n().toLowerCase(Locale.US))) {
            ArrayList arrayList3 = rVar.c;
            if (arrayList3 == null) {
                arrayList = rVar.d;
                if (arrayList != null) {
                    return true;
                }
                size = arrayList.size();
                i2 = 0;
                while (i2 < size) {
                    obj = arrayList.get(i2);
                    i2++;
                    if (!((f) obj).a(k0Var)) {
                    }
                }
                return true;
            }
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                a aVar = (a) obj2;
                String str2 = aVar.a;
                String str3 = aVar.c;
                if (str2.equals(AnalyticsParam.EVENT_PARAM_ID)) {
                    if (!str3.equals(k0Var.c)) {
                    }
                } else if (str2.equals("class") && (arrayList2 = k0Var.g) != null && arrayList2.contains(str3)) {
                }
            }
            arrayList = rVar.d;
            if (arrayList != null) {
                return true;
            }
            size = arrayList.size();
            i2 = 0;
            while (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
                if (!((f) obj).a(k0Var)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void b(p pVar, c cVar) throws xq5 {
        int iIntValue;
        char cCharAt;
        int iR;
        String strT = cVar.t();
        cVar.q();
        if (strT == null) {
            throw new xq5("Invalid '@' rule");
        }
        int i2 = 0;
        if (!this.c && strT.equals(AnalyticsParam.SOCIAL_ACTION_TYPE_MEDIA)) {
            ArrayList arrayListC = c(cVar);
            if (!cVar.d('{')) {
                throw new xq5("Invalid @media rule: missing rule set");
            }
            cVar.q();
            int size = arrayListC.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    e(cVar);
                    break;
                }
                Object obj = arrayListC.get(i3);
                i3++;
                e eVar = (e) obj;
                if (eVar == e.a || eVar == this.a) {
                    this.c = true;
                    pVar.b(e(cVar));
                    this.c = false;
                    break;
                }
            }
            if (!cVar.f() && !cVar.d('}')) {
                throw new xq5("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.c || !strT.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + strT + " rule");
            while (!cVar.f() && ((iIntValue = cVar.h().intValue()) != 59 || i2 != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i2 > 0 && (i2 = i2 - 1) == 0) {
                        break;
                    }
                } else {
                    i2++;
                }
            }
        } else {
            String strS = null;
            if (!cVar.f()) {
                int i4 = cVar.b;
                if (cVar.e("url(")) {
                    cVar.q();
                    String strS2 = cVar.s();
                    if (strS2 == null) {
                        String str = cVar.a;
                        StringBuilder sb = new StringBuilder();
                        while (!cVar.f() && (cCharAt = str.charAt(cVar.b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !dr60.h.g(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            cVar.b++;
                            if (cCharAt == '\\') {
                                if (!cVar.f()) {
                                    int i5 = cVar.b;
                                    cVar.b = i5 + 1;
                                    cCharAt = str.charAt(i5);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iR2 = c.r(cCharAt);
                                        if (iR2 != -1) {
                                            for (int i6 = 1; i6 <= 5 && !cVar.f() && (iR = c.r(str.charAt(cVar.b))) != -1; i6++) {
                                                cVar.b++;
                                                iR2 = (iR2 * 16) + iR;
                                            }
                                            sb.append((char) iR2);
                                        }
                                    }
                                }
                            }
                            sb.append(cCharAt);
                        }
                        strS2 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (strS2 == null) {
                        cVar.b = i4;
                    } else {
                        cVar.q();
                        if (cVar.f() || cVar.e(")")) {
                            strS = strS2;
                        } else {
                            cVar.b = i4;
                        }
                    }
                }
            }
            if (strS == null) {
                strS = cVar.s();
            }
            if (strS == null) {
                throw new xq5("Invalid @import rule: expected string or url()");
            }
            cVar.q();
            c(cVar);
            if (!cVar.f() && !cVar.d(';')) {
                throw new xq5("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        cVar.q();
    }

    public final boolean d(p pVar, c cVar) throws xq5 {
        ArrayList arrayListU = cVar.u();
        int i2 = 0;
        if (arrayListU == null || arrayListU.isEmpty()) {
            return false;
        }
        if (!cVar.d('{')) {
            throw new xq5("Malformed rule block: expected '{'");
        }
        cVar.q();
        yq60.d0 d0Var = new yq60.d0();
        do {
            String strT = cVar.t();
            cVar.q();
            if (!cVar.d(':')) {
                throw new xq5("Expected ':'");
            }
            cVar.q();
            String str = cVar.a;
            String strSubstring = null;
            if (!cVar.f()) {
                int i3 = cVar.b;
                int iCharAt = str.charAt(i3);
                int i4 = i3;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!dr60.h.g(iCharAt)) {
                        i4 = cVar.b + 1;
                    }
                    iCharAt = cVar.a();
                }
                if (cVar.b > i3) {
                    strSubstring = str.substring(i3, i4);
                } else {
                    cVar.b = i3;
                }
            }
            if (strSubstring == null) {
                throw new xq5("Expected property value");
            }
            cVar.q();
            if (cVar.d('!')) {
                cVar.q();
                if (!cVar.e("important")) {
                    throw new xq5("Malformed rule set: found unexpected '!'");
                }
                cVar.q();
            }
            cVar.d(';');
            dr60.D(d0Var, strT, strSubstring);
            cVar.q();
            if (cVar.f()) {
                break;
            }
        } while (!cVar.d('}'));
        cVar.q();
        int size = arrayListU.size();
        while (i2 < size) {
            Object obj = arrayListU.get(i2);
            i2++;
            o oVar = new o();
            oVar.a = (q) obj;
            oVar.b = d0Var;
            oVar.c = this.b;
            pVar.a(oVar);
        }
        return true;
    }

    public final p e(c cVar) {
        p pVar = new p();
        while (!cVar.f()) {
            try {
                if (!cVar.e("<!--") && !cVar.e("-->")) {
                    if (!cVar.d('@')) {
                        if (!d(pVar, cVar)) {
                            break;
                        }
                    } else {
                        b(pVar, cVar);
                    }
                }
            } catch (xq5 e2) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e2.getMessage());
                return pVar;
            }
        }
        return pVar;
    }
}
