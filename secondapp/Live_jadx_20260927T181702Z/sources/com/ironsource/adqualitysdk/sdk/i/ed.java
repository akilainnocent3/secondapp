package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1932 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1933 = 163;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1934 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private dm f1935;

    public ed(dm dmVar) {
        this.f1935 = dmVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2098(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f706) {
            try {
                char[] cArr2 = new char[i10];
                b.f704 = 0;
                while (true) {
                    int i13 = b.f704;
                    if (i13 >= i10) {
                        break;
                    }
                    b.f705 = cArr[i13];
                    cArr2[b.f704] = (char) (b.f705 + i12);
                    int i14 = b.f704;
                    cArr2[i14] = (char) (cArr2[i14] - f1933);
                    b.f704 = i14 + 1;
                }
                if (i11 > 0) {
                    b.f707 = i11;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = b.f707;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = b.f707;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    b.f704 = 0;
                    while (true) {
                        int i17 = b.f704;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        b.f704 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2099(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        int length = objArr.length;
        boolean z10 = true;
        int i10 = 0;
        while (i10 < length) {
            int i11 = (f1934 + 67) % 128;
            f1932 = i11;
            Object obj = objArr[i10];
            if (!z10) {
                f1934 = (i11 + 97) % 128;
                sb2.append(m2098("\ufffa\u0006", ((Process.getThreadPriority(0) + 20) >> 6) + 2, false, -ExpandableListView.getPackedPositionChild(0L), Color.alpha(0) + 201).intern());
            }
            if (obj instanceof String) {
                sb2.append(m2098(wo.g.f143517x2, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), true, -TextUtils.lastIndexOf("", '0', 0), 197 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
                sb2.append(obj);
                sb2.append(m2098(wo.g.f143517x2, 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), true, View.combineMeasuredStates(0, 0) + 1, 197 - View.resolveSizeAndState(0, 0, 0)).intern());
            } else {
                sb2.append(obj);
            }
            i10++;
            z10 = false;
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m2100() {
        dm dmVar = this.f1935;
        if (dmVar != null) {
            f1934 = (f1932 + 63) % 128;
            return dmVar.m1967();
        }
        int i10 = f1934 + 77;
        f1932 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 21 / 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ｋ */
    public abstract dr mo2068(du duVar, cq cqVar);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final dr m2101(du duVar, cq cqVar) {
        dr drVarMo2068;
        ed edVar = this;
        while (true) {
            drVarMo2068 = edVar.mo2068(duVar, cqVar);
            if (drVarMo2068 == null) {
                break;
            }
            f1932 = (f1934 + 11) % 128;
            if (!(drVarMo2068.m2044() instanceof ed)) {
                break;
            }
            edVar = (ed) drVarMo2068.m2044();
        }
        f1932 = (f1934 + 1) % 128;
        return drVarMo2068;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r6.f1935 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r6.f1935 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append(m2098("\u0017\u000f\u001e\u0012\u0019\u000eￊￊ\u000b\u001eￊ", 11 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), false, android.text.TextUtils.indexOf("", "", 0) + 7, android.graphics.ImageFormat.getBitsPerPixel(0) + 250).intern());
        r0.append(r6.f1935);
        r0 = r0.toString();
        r1 = com.ironsource.adqualitysdk.sdk.i.ed.f1932 + 19;
        com.ironsource.adqualitysdk.sdk.i.ed.f1934 = r1 % 128;
     */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m2102() {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ed.f1934
            int r0 = r0 + 57
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ed.f1932 = r1
            int r0 = r0 % 2
            java.lang.String r1 = ""
            r2 = 0
            if (r0 == 0) goto L17
            com.ironsource.adqualitysdk.sdk.i.dm r0 = r6.f1935
            r3 = 68
            int r3 = r3 / r2
            if (r0 == 0) goto L59
            goto L1b
        L17:
            com.ironsource.adqualitysdk.sdk.i.dm r0 = r6.f1935
            if (r0 == 0) goto L59
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r3 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r3 = r3 >> 16
            int r3 = 11 - r3
            int r1 = android.text.TextUtils.indexOf(r1, r1, r2)
            int r1 = r1 + 7
            int r4 = android.graphics.ImageFormat.getBitsPerPixel(r2)
            int r4 = r4 + 250
            java.lang.String r5 = "\u0017\u000f\u001e\u0012\u0019\u000eￊￊ\u000b\u001eￊ"
            java.lang.String r1 = m2098(r5, r3, r2, r1, r4)
            java.lang.String r1 = r1.intern()
            r0.append(r1)
            com.ironsource.adqualitysdk.sdk.i.dm r1 = r6.f1935
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = com.ironsource.adqualitysdk.sdk.i.ed.f1932
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ed.f1934 = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L57
            return r0
        L57:
            r0 = 0
            throw r0
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ed.m2102():java.lang.String");
    }
}
