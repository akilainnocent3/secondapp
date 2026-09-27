package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class w<K, T> implements r<K, T> {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f3154 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f3155 = 40555;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f3156 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f3157 = 25658;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f3158 = 61114;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f3159 = 36;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f3160 = 15383;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private r<K, T> f3161;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private r<K, T> f3162 = new r<K, T>() { // from class: com.ironsource.adqualitysdk.sdk.i.w.5
        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﻐ */
        public final void mo1658(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ｋ */
        public final void mo217(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﾇ */
        public final void mo1667(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﻐ */
        public final void mo1659(JSONObject jSONObject, K k10, Object obj, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ｋ */
        public final void mo1664(JSONObject jSONObject, K k10, Object obj, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﾇ */
        public final void mo1668(JSONObject jSONObject, K k10, Object obj, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﻛ */
        public final void mo1661(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.r
        /* JADX INFO: renamed from: ﾒ */
        public final void mo222(JSONObject jSONObject, K k10, T t10) {
        }
    };

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private r<K, T> m3004() {
        int i10 = f3156 + 55;
        int i11 = i10 % 128;
        f3154 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        r<K, T> rVar = this.f3161;
        if (rVar == null) {
            return this.f3162;
        }
        f3156 = (i11 + 81) % 128;
        return rVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﻐ */
    public final void mo1659(JSONObject jSONObject, K k10, Object obj, T t10) {
        f3156 = (f3154 + 49) % 128;
        JSONObject jSONObjectM3003 = m3003(jSONObject, t10);
        m3001(m3002("ﵲ戴﵌ꋶ俹\uef46犯摎∜\ue85a⽘龃", 10 - TextUtils.indexOf((CharSequence) "", '0')).intern(), jSONObjectM3003);
        m3004().mo1659(jSONObjectM3003, k10, obj, t10);
        int i10 = f3156 + 105;
        f3154 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m3006(r<K, T> rVar) {
        int i10 = f3156;
        this.f3161 = rVar;
        f3154 = (i10 + 75) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ｋ */
    public void mo217(JSONObject jSONObject, K k10, T t10) {
        f3156 = (f3154 + 77) % 128;
        JSONObject jSONObjectM3003 = m3003(jSONObject, t10);
        m3001(m3005(Process.getGidForName("") + 14, TextUtils.indexOf((CharSequence) "", '0') + 130, TextUtils.indexOf((CharSequence) "", '0') + 3, "\u0007￤\uffdd\u0007\b\u001c\u0004\u000f\u0013\u0016\f\u0007ￃ", true).intern(), jSONObjectM3003);
        m3004().mo217(jSONObjectM3003, k10, t10);
        int i10 = f3156 + 93;
        f3154 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 53 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    public abstract String mo218(T t10);

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾇ */
    public final void mo1668(JSONObject jSONObject, K k10, Object obj, T t10) {
        f3156 = (f3154 + 7) % 128;
        JSONObject jSONObjectM3003 = m3003(jSONObject, t10);
        m3001(m3005((ViewConfiguration.getFadingEdgeLength() >> 16) + 19, TextUtils.getOffsetAfter("", 0) + 125, 14 - Color.argb(0, 0, 0, 0), "\u0010\n\u0012\f\u000bￇ\r\u0019\u0016\u0014ￇ\u0011\u001a￡￨\u000bￇ\n\u0013", false).intern(), jSONObjectM3003);
        m3004().mo1668(jSONObjectM3003, k10, obj, t10);
        int i10 = f3156 + 89;
        f3154 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﻛ */
    public final void mo1661(JSONObject jSONObject, K k10, T t10) {
        f3154 = (f3156 + 51) % 128;
        JSONObject jSONObjectM3003 = m3003(jSONObject, t10);
        m3001(m3005(8 - TextUtils.lastIndexOf("", '0', 0, 0), 128 - View.MeasureSpec.getMode(0), 4 - (Process.myTid() >> 22), "\u0007ￄ\b￥\b\t\u0017\u0013\u0010", true).intern(), jSONObjectM3003);
        m3004().mo1661(jSONObjectM3003, k10, t10);
        int i10 = f3154 + 81;
        f3156 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﻐ */
    public final void mo1658(JSONObject jSONObject, K k10, T t10) {
        f3154 = (f3156 + 7) % 128;
        JSONObject jSONObjectM3003 = m3003(jSONObject, t10);
        m3001(m3005(14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-16777083) - Color.rgb(0, 0, 0), Color.red(0) + 3, "\u0004\b\u0015\uffd9\u0003\u0004\u0007\u0002\u0000\u0013\u0013\u0000\uffbf\u0016", true).intern(), jSONObjectM3003);
        m3004().mo1658(jSONObjectM3003, k10, t10);
        int i10 = f3156 + 111;
        f3154 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 91 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ｋ */
    public final void mo1664(JSONObject jSONObject, K k10, Object obj, T t10) {
        JSONObject jSONObjectM3003;
        int iArgb;
        int i10 = f3154 + 123;
        f3156 = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObjectM3003 = m3003(jSONObject, t10);
            iArgb = 34 << Color.argb(0, 0, 1, 0);
        } else {
            jSONObjectM3003 = m3003(jSONObject, t10);
            iArgb = 10 - Color.argb(0, 0, 0, 0);
        }
        m3001(m3002("㠍샧ᧉ짼\uf5f5퉋靐䨬퐃歰", iArgb).intern(), jSONObjectM3003);
        m3004().mo1664(jSONObjectM3003, k10, obj, t10);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾇ */
    public final void mo1667(JSONObject jSONObject, K k10, T t10) {
        f3154 = (f3156 + 57) % 128;
        JSONObject jSONObjectM3003 = m3003(jSONObject, t10);
        m3001(m3005(14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 133, 4 - (KeyEvent.getMaxKeyCode() >> 16), "\u0004\r\u0013\uffd9￢\u0014\u0012\u0013\u000e\f\uffbf\u0004\u0015", false).intern(), jSONObjectM3003);
        m3004().mo1667(jSONObjectM3003, k10, t10);
        int i10 = f3156 + 65;
        f3154 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 69 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾒ */
    public void mo222(JSONObject jSONObject, K k10, T t10) {
        f3156 = (f3154 + 5) % 128;
        JSONObject jSONObjectM3003 = m3003(jSONObject, t10);
        m3001(m3005((ViewConfiguration.getPressedStateDuration() >> 16) + 19, 129 - TextUtils.lastIndexOf("", '0', 0), 4 - TextUtils.indexOf("", "", 0), "\u0016\u0014\u0003ￜ￣\u0006ￂ\u0006\u000b\u0015\u0012\u000e\u0003\u001b\u0007\u0006ￂ\u0007\u001a", false).intern(), jSONObjectM3003);
        m3004().mo222(jSONObjectM3003, k10, t10);
        int i10 = f3154 + 49;
        f3156 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m3001(String str, JSONObject jSONObject) {
        String strIntern = m3005((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15, Process.getGidForName("") + 137, '<' - AndroidCharacter.getMirror('0'), "￤�\n\u0000\b\u0001\u000e￬\u000e\u000b\u0014\u0015\uffdd\u0000", false).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(m3002("腇ឭ\uee9cऎ", ExpandableListView.getPackedPositionChild(0L) + 4).intern());
        sb2.append(str);
        k.m2777(strIntern, sb2.toString(), jSONObject);
        f3154 = (f3156 + 47) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private JSONObject m3003(JSONObject jSONObject, T t10) {
        try {
            if (!jSONObject.has(ih.f2541)) {
                jSONObject.put(ih.f2541, mo218(t10));
                f3154 = (f3156 + 71) % 128;
            }
            if (!jSONObject.has(ih.f2535)) {
                f3154 = (f3156 + 63) % 128;
                jSONObject.put(ih.f2535, jx.m2735());
                f3156 = (f3154 + 7) % 128;
            }
            return jSONObject;
        } catch (JSONException e10) {
            k.m2785(m3005(14 - (KeyEvent.getMaxKeyCode() >> 16), 136 - (ViewConfiguration.getPressedStateDuration() >> 16), MotionEvent.axisFromString("") + 13, "￤�\n\u0000\b\u0001\u000e￬\u000e\u000b\u0014\u0015\uffdd\u0000", false).intern(), m3002("\uf347七¼ᭂỔ랳㴣\ue180\ufae7鲌⊾י\ua7eb뾄禗됻血혊泥\uebe1㩪읎䐥법ⴴ兌", TextUtils.indexOf("", "", 0) + 25).intern(), e10);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m3005(int i10, int i11, int i12, String str, boolean z10) {
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
                    cArr2[b.f704] = (char) (b.f705 + i11);
                    int i14 = b.f704;
                    cArr2[i14] = (char) (cArr2[i14] - f3159);
                    b.f704 = i14 + 1;
                }
                if (i12 > 0) {
                    b.f707 = i12;
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m3002(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f2992) {
            try {
                char[] cArr2 = new char[cArr.length];
                n.f2991 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = n.f2991;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f3157)) ^ ((c11 >>> 5) + f3155)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f3158) ^ ((c12 + i12) ^ ((c12 << 4) + f3160))));
                            i12 -= 40503;
                        }
                        int i14 = n.f2991;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        n.f2991 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
