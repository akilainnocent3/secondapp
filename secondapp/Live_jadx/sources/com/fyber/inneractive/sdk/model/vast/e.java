package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45185d;

    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    public e(String str, String str2) {
        int i10;
        String str3;
        ArrayList arrayListA;
        this.f45182a = str;
        this.f45183b = str2;
        int iIntValue = -1;
        if (TextUtils.isEmpty(str2) || str2.startsWith(TokenBuilder.TOKEN_DELIMITER)) {
            i10 = 0;
        } else if (str2.endsWith(to.c.userBaseExtraDel2) && str2.endsWith(to.c.userBaseExtraDel2)) {
            try {
                int i11 = TextUtils.isEmpty(str2) ? -1 : Integer.parseInt(str2.substring(0, str2.length() - 1));
                if (i11 >= 0 && i11 <= 100) {
                    i10 = 1;
                } else if (str2.contains(":")) {
                    arrayListA = a(str2);
                    if (arrayListA.isEmpty()) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                    }
                } else {
                    i10 = 0;
                }
            } catch (NumberFormatException e10) {
                IAlog.f("ProgressTrackingEvent: failed isPercentageOffsetValid with %s", e10.getMessage());
            }
        } else if (str2.contains(":")) {
            arrayListA = a(str2);
            if (arrayListA.isEmpty() || ((Integer) arrayListA.get(0)).intValue() < 0 || ((Integer) arrayListA.get(1)).intValue() < 0 || ((Integer) arrayListA.get(2)).intValue() < 0 || ((Integer) arrayListA.get(3)).intValue() < 0) {
                i10 = 0;
            } else {
                i10 = 2;
            }
        } else {
            i10 = 0;
        }
        this.f45185d = i10;
        if (i10 == 2 && (str3 = this.f45183b) != null) {
            ArrayList arrayListA2 = a(str3);
            iIntValue = ((Integer) arrayListA2.get(3)).intValue() + ((((Integer) arrayListA2.get(2)).intValue() + (((Integer) arrayListA2.get(1)).intValue() * 60) + (((Integer) arrayListA2.get(0)).intValue() * 3600)) * 1000);
        }
        this.f45184c = iIntValue;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length == 3) {
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String[] strArrSplit2 = strArrSplit[2].split("\\.");
                String str4 = strArrSplit2[0];
                String str5 = strArrSplit2.length > 1 ? strArrSplit2[1] : "000";
                try {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
                    arrayList.add(Integer.valueOf(Integer.parseInt(str3)));
                    arrayList.add(Integer.valueOf(Integer.parseInt(str4)));
                    arrayList.add(Integer.valueOf(Integer.parseInt(str5)));
                    return arrayList;
                } catch (NumberFormatException e10) {
                    IAlog.f("ProgressTrackingEvent: failed convertOffsetToTimeList with %s", e10.getMessage());
                    return new ArrayList();
                }
            }
        }
        return arrayList;
    }
}
