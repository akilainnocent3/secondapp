package defpackage;

import android.text.TextUtils;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.google.protobuf.DescriptorProtos;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class r0j0 implements ree0 {
    public final nsz a = new nsz();
    public final k0j0 b = new k0j0();

    /* JADX WARN: Code duplicated, block: B:120:0x0208  */
    /* JADX WARN: Code duplicated, block: B:130:0x022a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0235  */
    /* JADX WARN: Code duplicated, block: B:133:0x023e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0248  */
    /* JADX WARN: Code duplicated, block: B:136:0x0250  */
    /* JADX WARN: Code duplicated, block: B:138:0x0258  */
    /* JADX WARN: Code duplicated, block: B:139:0x025c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0264  */
    /* JADX WARN: Code duplicated, block: B:142:0x026b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0273  */
    /* JADX WARN: Code duplicated, block: B:150:0x0287  */
    /* JADX WARN: Code duplicated, block: B:152:0x028c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0294  */
    /* JADX WARN: Code duplicated, block: B:156:0x029c  */
    /* JADX WARN: Code duplicated, block: B:157:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:164:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:165:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:167:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:171:0x02da  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:175:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:176:0x030c  */
    /* JADX WARN: Code duplicated, block: B:179:0x031d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0326  */
    /* JADX WARN: Code duplicated, block: B:183:0x0328  */
    /* JADX WARN: Code duplicated, block: B:186:0x0331  */
    /* JADX WARN: Code duplicated, block: B:187:0x0333  */
    /* JADX WARN: Code duplicated, block: B:190:0x033c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0344  */
    /* JADX WARN: Code duplicated, block: B:195:0x0349  */
    /* JADX WARN: Code duplicated, block: B:196:0x034e  */
    /* JADX WARN: Code duplicated, block: B:198:0x0361  */
    /* JADX WARN: Code duplicated, block: B:238:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:175:0x02f2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ree0
    public final void a(byte[] bArr, int i, int i2, ree0.b bVar, oya<q4c> oyaVar) {
        m0j0 m0j0VarD;
        String strTrim;
        int i3;
        char c;
        String string;
        int i4;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z;
        r0j0 r0j0Var = this;
        nsz nszVar = r0j0Var.a;
        nszVar.G(i + i2, bArr);
        nszVar.I(i);
        ArrayList arrayList = new ArrayList();
        try {
            s0j0.d(nszVar);
            while (!TextUtils.isEmpty(nszVar.k(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i5 = 0;
                int i6 = -1;
                int i7 = 0;
                byte b2 = -1;
                while (true) {
                    int i8 = 1;
                    char c2 = 2;
                    if (b2 == -1) {
                        i7 = nszVar.b;
                        String strK = nszVar.k(StandardCharsets.UTF_8);
                        if (strK == null) {
                            b2 = 0;
                        } else if ("STYLE".equals(strK)) {
                            b2 = 2;
                        } else {
                            b2 = strK.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        nszVar.I(i7);
                        if (b2 == 0) {
                            j6s.b(new u0j0(arrayList2), bVar, oyaVar);
                            return;
                        }
                        if (b2 == 1) {
                            while (!TextUtils.isEmpty(nszVar.k(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            if (b2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    hb5.a("A style block was found after the first cue.");
                                    return;
                                }
                                nszVar.k(StandardCharsets.UTF_8);
                                k0j0 k0j0Var = r0j0Var.b;
                                nsz nszVar2 = k0j0Var.a;
                                StringBuilder sb = k0j0Var.b;
                                sb.setLength(0);
                                int i9 = nszVar.b;
                                while (!TextUtils.isEmpty(nszVar.k(StandardCharsets.UTF_8))) {
                                }
                                nszVar2.G(nszVar.b, nszVar.a);
                                nszVar2.I(i9);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    k0j0.c(nszVar2);
                                    if (nszVar2.a() >= 5 && "::cue".equals(nszVar2.u(5, StandardCharsets.UTF_8))) {
                                        int i10 = nszVar2.b;
                                        String strB = k0j0.b(nszVar2, sb);
                                        if (strB == null) {
                                            strTrim = null;
                                        } else if ("{".equals(strB)) {
                                            nszVar2.I(i10);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i11 = nszVar2.b;
                                                int i12 = nszVar2.c;
                                                int i13 = i5;
                                                while (i11 < i12 && i13 == 0) {
                                                    int i14 = i11 + 1;
                                                    int i15 = ((char) nszVar2.a[i11]) == ')' ? i8 : i5;
                                                    i11 = i14;
                                                    i13 = i15;
                                                }
                                                strTrim = nszVar2.u((i11 - 1) - nszVar2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = null;
                                            }
                                            if (!")".equals(k0j0.b(nszVar2, sb))) {
                                                strTrim = null;
                                            }
                                        }
                                    } else {
                                        strTrim = null;
                                    }
                                    if (strTrim != null && "{".equals(k0j0.b(nszVar2, sb))) {
                                        l0j0 l0j0Var = new l0j0();
                                        if (!strTrim.isEmpty()) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i6) {
                                                Matcher matcher2 = k0j0.c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i8);
                                                    strGroup2.getClass();
                                                    l0j0Var.d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(i5, iIndexOf);
                                            }
                                            String str = jrh0.a;
                                            String[] strArrSplit = strTrim.split("\\.", i6);
                                            String str2 = strArrSplit[i5];
                                            int iIndexOf2 = str2.indexOf(35);
                                            if (iIndexOf2 != i6) {
                                                l0j0Var.b = str2.substring(i5, iIndexOf2);
                                                l0j0Var.a = str2.substring(iIndexOf2 + 1);
                                            } else {
                                                l0j0Var.b = str2;
                                            }
                                            if (strArrSplit.length > i8) {
                                                int length = strArrSplit.length;
                                                ly0.b(length <= strArrSplit.length ? i8 : i5);
                                                l0j0Var.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i8, length)));
                                            }
                                        }
                                        int i16 = i5;
                                        String strB2 = null;
                                        while (i16 == 0) {
                                            int i17 = nszVar2.b;
                                            strB2 = k0j0.b(nszVar2, sb);
                                            int i18 = (strB2 == null || "}".equals(strB2)) ? i8 : i5;
                                            if (i18 == 0) {
                                                nszVar2.I(i17);
                                                k0j0.c(nszVar2);
                                                String strA = k0j0.a(nszVar2, sb);
                                                if (!strA.isEmpty() && ":".equals(k0j0.b(nszVar2, sb))) {
                                                    k0j0.c(nszVar2);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    boolean z2 = false;
                                                    while (true) {
                                                        if (z2) {
                                                            string = sb2.toString();
                                                        } else {
                                                            int i19 = nszVar2.b;
                                                            String strB3 = k0j0.b(nszVar2, sb);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                                nszVar2.I(i19);
                                                                z2 = true;
                                                            } else {
                                                                sb2.append(strB3);
                                                            }
                                                        }
                                                    }
                                                    if (string == null || string.isEmpty()) {
                                                        i3 = 1;
                                                        c = 2;
                                                    } else {
                                                        int i20 = nszVar2.b;
                                                        String strB4 = k0j0.b(nszVar2, sb);
                                                        if (";".equals(strB4)) {
                                                            if ("color".equals(strA)) {
                                                                i4 = 1;
                                                                l0j0Var.f = a68.a(string, true);
                                                                l0j0Var.g = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    l0j0Var.h = a68.a(string, true);
                                                                    l0j0Var.i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string)) {
                                                                            z = true;
                                                                        } else {
                                                                            z = true;
                                                                        }
                                                                        l0j0Var.q = z;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            l0j0Var.k = 1;
                                                                        }
                                                                        c = 2;
                                                                    } else if ("font-family".equals(strA)) {
                                                                        l0j0Var.e = fy0.b(string);
                                                                    } else if (!"font-weight".equals(strA)) {
                                                                        if ("bold".equals(string)) {
                                                                            i4 = 1;
                                                                            l0j0Var.l = 1;
                                                                        }
                                                                        c = 2;
                                                                    } else {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if ("italic".equals(string)) {
                                                                                l0j0Var.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = k0j0.d.matcher(fy0.b(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                c = 2;
                                                                                                l0j0Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                c = 2;
                                                                                                l0j0Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                l0j0Var.n = 1;
                                                                                                c = 2;
                                                                                                break;
                                                                                            default:
                                                                                                fm20.a();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i3);
                                                                                        strGroup3.getClass();
                                                                                        l0j0Var.o = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                c = 2;
                                                                                                l0j0Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                c = 2;
                                                                                                l0j0Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                l0j0Var.n = 1;
                                                                                                c = 2;
                                                                                                break;
                                                                                            default:
                                                                                                fm20.a();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i3);
                                                                                        strGroup4.getClass();
                                                                                        l0j0Var.o = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                c = 2;
                                                                                                l0j0Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                c = 2;
                                                                                                l0j0Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                l0j0Var.n = 1;
                                                                                                c = 2;
                                                                                                break;
                                                                                            default:
                                                                                                fm20.a();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i3);
                                                                                        strGroup5.getClass();
                                                                                        l0j0Var.o = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        c = 2;
                                                                                        l0j0Var.n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        c = 2;
                                                                                        l0j0Var.n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        l0j0Var.n = 1;
                                                                                        c = 2;
                                                                                        break;
                                                                                    default:
                                                                                        fm20.a();
                                                                                        return;
                                                                                }
                                                                                String strGroup6 = matcher.group(i3);
                                                                                strGroup6.getClass();
                                                                                l0j0Var.o = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                cft.g("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            }
                                                                        }
                                                                    }
                                                                    i3 = 1;
                                                                    c = 2;
                                                                } else if ("over".equals(string)) {
                                                                    l0j0Var.p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    l0j0Var.p = 2;
                                                                    c = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                    c = 2;
                                                                }
                                                            }
                                                            i3 = i4;
                                                            c = 2;
                                                        } else {
                                                            if ("}".equals(strB4)) {
                                                                nszVar2.I(i20);
                                                                if ("color".equals(strA)) {
                                                                    i4 = 1;
                                                                    l0j0Var.f = a68.a(string, true);
                                                                    l0j0Var.g = true;
                                                                } else {
                                                                    i4 = 1;
                                                                    if ("background-color".equals(strA)) {
                                                                        l0j0Var.h = a68.a(string, true);
                                                                        l0j0Var.i = true;
                                                                    } else if ("ruby-position".equals(strA)) {
                                                                        if ("text-combine-upright".equals(strA)) {
                                                                            if ("all".equals(string) || string.startsWith(LxHElgWAiSeM.SQQI)) {
                                                                                z = true;
                                                                            } else {
                                                                                z = false;
                                                                            }
                                                                            l0j0Var.q = z;
                                                                        } else if ("text-decoration".equals(strA)) {
                                                                            if ("underline".equals(string)) {
                                                                                i4 = 1;
                                                                                l0j0Var.k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(strA)) {
                                                                            l0j0Var.e = fy0.b(string);
                                                                        } else if (!"font-weight".equals(strA)) {
                                                                            i4 = 1;
                                                                            if ("font-style".equals(strA)) {
                                                                                if ("italic".equals(string)) {
                                                                                    l0j0Var.m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(strA)) {
                                                                                matcher = k0j0.d.matcher(fy0.b(string));
                                                                                if (matcher.matches()) {
                                                                                    cft.g("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                                } else {
                                                                                    strGroup = matcher.group(2);
                                                                                    strGroup.getClass();
                                                                                    switch (strGroup.hashCode()) {
                                                                                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                                            if (!strGroup.equals("%")) {
                                                                                                b = 0;
                                                                                            }
                                                                                            switch (b) {
                                                                                                case 0:
                                                                                                    i3 = 1;
                                                                                                    c = 2;
                                                                                                    l0j0Var.n = 3;
                                                                                                    break;
                                                                                                case 1:
                                                                                                    i3 = 1;
                                                                                                    c = 2;
                                                                                                    l0j0Var.n = 2;
                                                                                                    break;
                                                                                                case 2:
                                                                                                    i3 = 1;
                                                                                                    l0j0Var.n = 1;
                                                                                                    c = 2;
                                                                                                    break;
                                                                                                default:
                                                                                                    fm20.a();
                                                                                                    return;
                                                                                            }
                                                                                            String strGroup7 = matcher.group(i3);
                                                                                            strGroup7.getClass();
                                                                                            l0j0Var.o = Float.parseFloat(strGroup7);
                                                                                            break;
                                                                                        case 3240:
                                                                                            if (!strGroup.equals("em")) {
                                                                                                b = 1;
                                                                                            }
                                                                                            switch (b) {
                                                                                                case 0:
                                                                                                    i3 = 1;
                                                                                                    c = 2;
                                                                                                    l0j0Var.n = 3;
                                                                                                    break;
                                                                                                case 1:
                                                                                                    i3 = 1;
                                                                                                    c = 2;
                                                                                                    l0j0Var.n = 2;
                                                                                                    break;
                                                                                                case 2:
                                                                                                    i3 = 1;
                                                                                                    l0j0Var.n = 1;
                                                                                                    c = 2;
                                                                                                    break;
                                                                                                default:
                                                                                                    fm20.a();
                                                                                                    return;
                                                                                            }
                                                                                            String strGroup8 = matcher.group(i3);
                                                                                            strGroup8.getClass();
                                                                                            l0j0Var.o = Float.parseFloat(strGroup8);
                                                                                            break;
                                                                                        case 3592:
                                                                                            if (!strGroup.equals("px")) {
                                                                                                b = 2;
                                                                                            }
                                                                                            switch (b) {
                                                                                                case 0:
                                                                                                    i3 = 1;
                                                                                                    c = 2;
                                                                                                    l0j0Var.n = 3;
                                                                                                    break;
                                                                                                case 1:
                                                                                                    i3 = 1;
                                                                                                    c = 2;
                                                                                                    l0j0Var.n = 2;
                                                                                                    break;
                                                                                                case 2:
                                                                                                    i3 = 1;
                                                                                                    l0j0Var.n = 1;
                                                                                                    c = 2;
                                                                                                    break;
                                                                                                default:
                                                                                                    fm20.a();
                                                                                                    return;
                                                                                            }
                                                                                            String strGroup9 = matcher.group(i3);
                                                                                            strGroup9.getClass();
                                                                                            l0j0Var.o = Float.parseFloat(strGroup9);
                                                                                            break;
                                                                                    }
                                                                                    b = -1;
                                                                                    switch (b) {
                                                                                        case 0:
                                                                                            i3 = 1;
                                                                                            c = 2;
                                                                                            l0j0Var.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            i3 = 1;
                                                                                            c = 2;
                                                                                            l0j0Var.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            i3 = 1;
                                                                                            l0j0Var.n = 1;
                                                                                            c = 2;
                                                                                            break;
                                                                                        default:
                                                                                            fm20.a();
                                                                                            return;
                                                                                    }
                                                                                    String strGroup10 = matcher.group(i3);
                                                                                    strGroup10.getClass();
                                                                                    l0j0Var.o = Float.parseFloat(strGroup10);
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(string)) {
                                                                            i4 = 1;
                                                                            l0j0Var.l = 1;
                                                                        }
                                                                        i3 = 1;
                                                                    } else if ("over".equals(string)) {
                                                                        l0j0Var.p = 1;
                                                                    } else if ("under".equals(string)) {
                                                                        l0j0Var.p = 2;
                                                                        c = 2;
                                                                        i3 = 1;
                                                                    } else {
                                                                        i3 = 1;
                                                                    }
                                                                }
                                                                i3 = i4;
                                                            } else {
                                                                i3 = 1;
                                                            }
                                                            c = 2;
                                                        }
                                                    }
                                                } else {
                                                    i3 = i8;
                                                    c = c2;
                                                }
                                            } else {
                                                i3 = i8;
                                                c = c2;
                                            }
                                            i8 = i3;
                                            c2 = c;
                                            i16 = i18;
                                            i5 = 0;
                                        }
                                        int i21 = i8;
                                        char c3 = c2;
                                        if ("}".equals(strB2)) {
                                            arrayList3.add(l0j0Var);
                                        }
                                        i8 = i21;
                                        c2 = c3;
                                        i5 = 0;
                                        i6 = -1;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b2 == 3) {
                                Pattern pattern = o0j0.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strK2 = nszVar.k(charset);
                                if (strK2 == null) {
                                    m0j0VarD = null;
                                } else {
                                    Pattern pattern2 = o0j0.a;
                                    Matcher matcher3 = pattern2.matcher(strK2);
                                    if (matcher3.matches()) {
                                        m0j0VarD = o0j0.d(null, matcher3, nszVar, arrayList);
                                    } else {
                                        m0j0VarD = null;
                                        String strK3 = nszVar.k(charset);
                                        if (strK3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strK3);
                                            if (matcher4.matches()) {
                                                m0j0VarD = o0j0.d(strK2.trim(), matcher4, nszVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (m0j0VarD != null) {
                                    arrayList2.add(m0j0VarD);
                                }
                            }
                            r0j0Var = this;
                        }
                    }
                }
            }
        } catch (ssz e) {
            m8j.a(e);
        }
    }
}
