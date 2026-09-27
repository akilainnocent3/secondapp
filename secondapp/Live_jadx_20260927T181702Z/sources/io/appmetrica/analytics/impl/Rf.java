package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class Rf {
    public static final String a(C5041f9 c5041f9) {
        String string;
        StringBuilder sb2 = new StringBuilder("Event sent: ");
        int i10 = c5041f9.f97344c;
        String str = c5041f9.f97345d;
        byte[] bArr = c5041f9.f97346e;
        if (i10 == 1) {
            string = "Attribution";
        } else if (i10 == 2) {
            string = "Session start";
        } else if (i10 == 4) {
            if (str == null) {
                str = fw.b.f85379f;
            }
            StringBuilder sb3 = new StringBuilder(str);
            if (bArr != null) {
                String str2 = new String(bArr, cv.g.f77202b);
                if (!TextUtils.isEmpty(str2)) {
                    sb3.append(" with value ");
                    sb3.append(str2);
                }
            }
            string = sb3.toString();
        } else if (i10 == 5) {
            string = "Referrer";
        } else if (i10 == 7) {
            string = "Session heartbeat";
        } else if (i10 == 13) {
            string = "The very first event";
        } else if (i10 == 35) {
            string = "E-Commerce";
        } else if (i10 == 40) {
            string = "Ad revenue (ILRD)";
        } else if (i10 == 42) {
            string = "External attribution";
        } else if (i10 == 16) {
            string = "Open";
        } else if (i10 == 17) {
            string = "Update";
        } else if (i10 == 20) {
            string = "User profile update";
        } else if (i10 != 21) {
            switch (i10) {
                case 25:
                    string = "ANR";
                    break;
                case 26:
                    string = "Crash: " + str;
                    break;
                case 27:
                    string = "Error: " + str;
                    break;
                default:
                    string = "type=" + i10;
                    break;
            }
        } else {
            string = "Revenue";
        }
        sb2.append(string);
        return sb2.toString();
    }

    public static final String a(String str, EnumC4966cb enumC4966cb, String str2, String str3) {
        if (!AbstractC5495x9.f98571d.contains(EnumC4966cb.a(enumC4966cb.f97109a))) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(": ");
        sb2.append(enumC4966cb.name());
        if (AbstractC5495x9.f98573f.contains(enumC4966cb) && !TextUtils.isEmpty(str2)) {
            sb2.append(" with name ");
            sb2.append(str2);
        }
        if (AbstractC5495x9.f98572e.contains(enumC4966cb) && !TextUtils.isEmpty(str3)) {
            sb2.append(" with value ");
            sb2.append(str3);
        }
        return sb2.toString();
    }
}
