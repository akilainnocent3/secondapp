package com.bytedance.sdk.component.tq.hww;

import androidx.media3.session.fe;
import com.google.android.material.badge.a;
import com.ironsource.G5;
import fw.b;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zi.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class vgm {
    private static final char[] vy = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final String f35065hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final String f35066hv;
    final String hww;
    private final String nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final List<String> f35067ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final String f35068rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    final int f35069sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    final String f35070tq;
    private final List<String> vgm;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class hww {

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        final List<String> f35071hu;
        String hww;

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        String f35073ok;
        List<String> vgm;
        String vy;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        String f35075tq = "";

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        String f35074sd = "";

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        int f35072hv = -1;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.tq.hww.vgm$hww$hww, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public enum EnumC0331hww {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public hww() {
            ArrayList arrayList = new ArrayList();
            this.f35071hu = arrayList;
            arrayList.add("");
        }

        private boolean hu(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private boolean hv(String str) {
            return str.equals(fe.F) || str.equalsIgnoreCase("%2e");
        }

        public hww hww(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.hww = "http";
                return this;
            }
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.hww = "https";
            return this;
        }

        public hww sd(String str) {
            if (str != null) {
                return hww(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.hww);
            sb2.append("://");
            if (!this.f35075tq.isEmpty() || !this.f35074sd.isEmpty()) {
                sb2.append(this.f35075tq);
                if (!this.f35074sd.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f35074sd);
                }
                sb2.append('@');
            }
            if (this.vy.indexOf(58) != -1) {
                sb2.append(b.f85384k);
                sb2.append(this.vy);
                sb2.append(b.f85385l);
            } else {
                sb2.append(this.vy);
            }
            int iHww = hww();
            if (iHww != vgm.hww(this.hww)) {
                sb2.append(':');
                sb2.append(iHww);
            }
            vgm.hww(sb2, this.f35071hu);
            if (this.vgm != null) {
                sb2.append('?');
                vgm.tq(sb2, this.vgm);
            }
            if (this.f35073ok != null) {
                sb2.append('#');
                sb2.append(this.f35073ok);
            }
            return sb2.toString();
        }

        public hww tq(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strHv = hv(str, 0, str.length());
            if (strHv == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.vy = strHv;
            return this;
        }

        public hww vy(String str) {
            this.vgm = str != null ? vgm.tq(vgm.hww(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        private static String hv(String str, int i10, int i11) {
            return com.bytedance.sdk.component.tq.hww.tq.rs.hww(vgm.hww(str, i10, i11, false));
        }

        private void sd() {
            List<String> list = this.f35071hu;
            if (list.remove(list.size() - 1).isEmpty() && !this.f35071hu.isEmpty()) {
                List<String> list2 = this.f35071hu;
                list2.set(list2.size() - 1, "");
            } else {
                this.f35071hu.add("");
            }
        }

        private static int vy(String str, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == ':') {
                    return i10;
                }
                if (cCharAt == '[') {
                    do {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        private static int hu(String str, int i10, int i11) {
            try {
                int i12 = Integer.parseInt(vgm.hww(str, i10, i11, "", false, false, false, true, null));
                if (i12 <= 0 || i12 > 65535) {
                    return -1;
                }
                return i12;
            } catch (NumberFormatException unused) {
            }
        }

        public vgm tq() {
            if (this.hww != null) {
                if (this.vy != null) {
                    return new vgm(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int sd(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public int hww() {
            int i10 = this.f35072hv;
            return i10 != -1 ? i10 : vgm.hww(this.hww);
        }

        private hww hww(String str, boolean z10) {
            int i10 = 0;
            while (true) {
                int iHww = com.bytedance.sdk.component.tq.hww.tq.rs.hww(str, i10, str.length(), "/\\");
                hww(str, i10, iHww, iHww < str.length(), z10);
                i10 = iHww + 1;
                if (i10 > str.length()) {
                    return this;
                }
                str = str;
                z10 = z10;
            }
        }

        private static int tq(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public hww hww(String str, String str2) {
            if (str != null) {
                if (this.vgm == null) {
                    this.vgm = new ArrayList();
                }
                this.vgm.add(vgm.hww(str, " \"'<>#&=", true, false, true, true));
                this.vgm.add(str2 != null ? vgm.hww(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public EnumC0331hww hww(vgm vgmVar, String str) {
            int iHww;
            String str2;
            int i10;
            String str3;
            String str4 = str;
            int iHww2 = com.bytedance.sdk.component.tq.hww.tq.rs.hww(str4, 0, str4.length());
            int iTq = com.bytedance.sdk.component.tq.hww.tq.rs.tq(str4, iHww2, str4.length());
            if (tq(str4, iHww2, iTq) != -1) {
                if (str4.regionMatches(true, iHww2, "https:", 0, 6)) {
                    this.hww = "https";
                    iHww2 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iHww2, "http:", 0, 5)) {
                        this.hww = "http";
                        iHww2 += 5;
                    } else {
                        return EnumC0331hww.UNSUPPORTED_SCHEME;
                    }
                }
            } else if (vgmVar != null) {
                this.hww = vgmVar.hww;
            } else {
                return EnumC0331hww.MISSING_SCHEME;
            }
            int iSd = sd(str4, iHww2, iTq);
            char c10 = '#';
            if (iSd < 2 && vgmVar != null && vgmVar.hww.equals(this.hww)) {
                this.f35075tq = vgmVar.tq();
                this.f35074sd = vgmVar.sd();
                this.vy = vgmVar.f35070tq;
                this.f35072hv = vgmVar.f35069sd;
                this.f35071hu.clear();
                this.f35071hu.addAll(vgmVar.vy());
                if (iHww2 == iTq || str4.charAt(iHww2) == '#') {
                    vy(vgmVar.hv());
                }
                str2 = str4;
            } else {
                int i11 = iHww2 + iSd;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iHww = com.bytedance.sdk.component.tq.hww.tq.rs.hww(str4, i11, iTq, "@/\\?#");
                    byte bCharAt = iHww != iTq ? str4.charAt(iHww) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c10 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z10) {
                            int iHww3 = com.bytedance.sdk.component.tq.hww.tq.rs.hww(str4, i11, iHww, ':');
                            String strHww = vgm.hww(str, i11, iHww3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                strHww = this.f35075tq + "%40" + strHww;
                            }
                            this.f35075tq = strHww;
                            if (iHww3 != iHww) {
                                i10 = iHww;
                                this.f35074sd = vgm.hww(str, iHww3 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            } else {
                                i10 = iHww;
                            }
                            str3 = str;
                            z11 = true;
                        } else {
                            i10 = iHww;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f35074sd);
                            sb2.append("%40");
                            str3 = str;
                            sb2.append(vgm.hww(str3, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f35074sd = sb2.toString();
                        }
                        i11 = i10 + 1;
                        str4 = str3;
                        c10 = '#';
                    }
                }
                str2 = str4;
                int i12 = i11;
                int iVy = vy(str2, i12, iHww);
                int i13 = iVy + 1;
                if (i13 < iHww) {
                    this.vy = hv(str2, i12, iVy);
                    int iHu = hu(str2, i13, iHww);
                    this.f35072hv = iHu;
                    if (iHu == -1) {
                        return EnumC0331hww.INVALID_PORT;
                    }
                } else {
                    this.vy = hv(str2, i12, iVy);
                    this.f35072hv = vgm.hww(this.hww);
                }
                if (this.vy == null) {
                    return EnumC0331hww.INVALID_HOST;
                }
                iHww2 = iHww;
            }
            int iHww4 = com.bytedance.sdk.component.tq.hww.tq.rs.hww(str2, iHww2, iTq, "?#");
            hww(str2, iHww2, iHww4);
            if (iHww4 < iTq && str2.charAt(iHww4) == '?') {
                int iHww5 = com.bytedance.sdk.component.tq.hww.tq.rs.hww(str2, iHww4, iTq, '#');
                this.vgm = vgm.tq(vgm.hww(str2, iHww4 + 1, iHww5, " \"'<>#", true, false, true, true, null));
                iHww4 = iHww5;
            }
            if (iHww4 < iTq && str2.charAt(iHww4) == '#') {
                this.f35073ok = vgm.hww(str2, iHww4 + 1, iTq, "", true, false, false, false, null);
            }
            return EnumC0331hww.SUCCESS;
        }

        private void hww(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.f35071hu;
                list.set(list.size() - 1, "");
            } else {
                this.f35071hu.clear();
                this.f35071hu.add("");
                i10++;
            }
            int i12 = i10;
            while (i12 < i11) {
                int iHww = com.bytedance.sdk.component.tq.hww.tq.rs.hww(str, i12, i11, "/\\");
                boolean z10 = iHww < i11;
                String str2 = str;
                hww(str2, i12, iHww, z10, true);
                if (z10) {
                    iHww++;
                }
                i12 = iHww;
                str = str2;
            }
        }

        private void hww(String str, int i10, int i11, boolean z10, boolean z11) {
            String strHww = vgm.hww(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, true, null);
            if (hv(strHww)) {
                return;
            }
            if (hu(strHww)) {
                sd();
                return;
            }
            List<String> list = this.f35071hu;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f35071hu;
                list2.set(list2.size() - 1, strHww);
            } else {
                this.f35071hu.add(strHww);
            }
            if (z10) {
                this.f35071hu.add("");
            }
        }
    }

    public vgm(hww hwwVar) {
        this.hww = hwwVar.hww;
        this.f35066hv = hww(hwwVar.f35075tq, false);
        this.f35065hu = hww(hwwVar.f35074sd, false);
        this.f35070tq = hwwVar.vy;
        this.f35069sd = hwwVar.hww();
        this.vgm = hww(hwwVar.f35071hu, false);
        List<String> list = hwwVar.vgm;
        this.f35067ok = list != null ? hww(list, true) : null;
        String str = hwwVar.f35073ok;
        this.f35068rs = str != null ? hww(str, false) : null;
        this.nod = hwwVar.toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof vgm) && ((vgm) obj).nod.equals(this.nod);
    }

    public int hashCode() {
        return this.nod.hashCode();
    }

    public String hv() {
        if (this.f35067ok == null) {
            return null;
        }
        int iIndexOf = this.nod.indexOf(63) + 1;
        String str = this.nod;
        return this.nod.substring(iIndexOf, com.bytedance.sdk.component.tq.hww.tq.rs.hww(str, iIndexOf, str.length(), '#'));
    }

    public URL hww() {
        try {
            return new URL(this.nod);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String sd() {
        if (this.f35065hu.isEmpty()) {
            return "";
        }
        return this.nod.substring(this.nod.indexOf(58, this.hww.length() + 3) + 1, this.nod.indexOf(64));
    }

    public String toString() {
        return this.nod;
    }

    public String tq() {
        if (this.f35066hv.isEmpty()) {
            return "";
        }
        int length = this.hww.length() + 3;
        String str = this.nod;
        return this.nod.substring(length, com.bytedance.sdk.component.tq.hww.tq.rs.hww(str, length, str.length(), ":@"));
    }

    public List<String> vy() {
        int iIndexOf = this.nod.indexOf(47, this.hww.length() + 3);
        String str = this.nod;
        int iHww = com.bytedance.sdk.component.tq.hww.tq.rs.hww(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iHww) {
            int i10 = iIndexOf + 1;
            int iHww2 = com.bytedance.sdk.component.tq.hww.tq.rs.hww(this.nod, i10, iHww, '/');
            arrayList.add(this.nod.substring(i10, iHww2));
            iIndexOf = iHww2;
        }
        return arrayList;
    }

    public static int hww(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void hww(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    public static vgm sd(String str) {
        hww hwwVar = new hww();
        if (hwwVar.hww((vgm) null, str) == hww.EnumC0331hww.SUCCESS) {
            return hwwVar.tq();
        }
        return null;
    }

    public static void tq(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append(G5.T);
                sb2.append(str2);
            }
        }
    }

    public static String hww(String str, boolean z10) {
        return hww(str, 0, str.length(), z10);
    }

    private List<String> hww(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? hww(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List<String> tq(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iIndexOf = str.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i10);
            if (iIndexOf2 != -1 && iIndexOf2 <= iIndexOf) {
                arrayList.add(str.substring(i10, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            } else {
                arrayList.add(str.substring(i10, iIndexOf));
                arrayList.add(null);
            }
            i10 = iIndexOf + 1;
        }
        return arrayList;
    }

    public static String hww(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.bytedance.sdk.component.tq.hww.tq.hww hwwVar = new com.bytedance.sdk.component.tq.hww.tq.hww();
                hwwVar.hww(str, i10, i12);
                hww(hwwVar, str, i12, i11, z10);
                return hwwVar.sd();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public static void hww(com.bytedance.sdk.component.tq.hww.tq.hww hwwVar, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int iHww = com.bytedance.sdk.component.tq.hww.tq.rs.hww(str.charAt(i10 + 1));
                int iHww2 = com.bytedance.sdk.component.tq.hww.tq.rs.hww(str.charAt(i12));
                if (iHww != -1 && iHww2 != -1) {
                    hwwVar.tq((iHww << 4) + iHww2);
                    i10 = i12;
                } else {
                    hwwVar.hww(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z10) {
                hwwVar.tq(32);
            } else {
                hwwVar.hww(iCodePointAt);
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static boolean hww(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.bytedance.sdk.component.tq.hww.tq.rs.hww(str.charAt(i10 + 1)) != -1 && com.bytedance.sdk.component.tq.hww.tq.rs.hww(str.charAt(i12)) != -1;
    }

    public static String hww(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z10 && (!z11 || hww(str, iCharCount, i11)))) && (iCodePointAt != 43 || !z12)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.bytedance.sdk.component.tq.hww.tq.hww hwwVar = new com.bytedance.sdk.component.tq.hww.tq.hww();
                hwwVar.hww(str, i10, iCharCount);
                hww(hwwVar, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return hwwVar.sd();
            }
        }
        return str.substring(i10, i11);
    }

    public static void hww(com.bytedance.sdk.component.tq.hww.tq.hww hwwVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.bytedance.sdk.component.tq.hww.tq.hww hwwVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z12) {
                    hwwVar.hww(z10 ? a.f50153v : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z10 && (!z11 || hww(str, i10, i11)))))) {
                    hwwVar.hww(iCodePointAt);
                } else {
                    if (hwwVar2 == null) {
                        hwwVar2 = new com.bytedance.sdk.component.tq.hww.tq.hww();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.tq.hww.tq.rs.hww)) {
                        hwwVar2.hww(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    } else {
                        hwwVar2.hww(iCodePointAt);
                    }
                    while (!hwwVar2.hww()) {
                        byte bTq = hwwVar2.tq();
                        hwwVar.tq(37);
                        char[] cArr = vy;
                        hwwVar.tq((int) cArr[((bTq & 255) >> 4) & 15]);
                        hwwVar.tq((int) cArr[bTq & c.f161639q]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static String hww(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return hww(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}
