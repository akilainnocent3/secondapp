package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.signals.SignalKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class dg extends cz implements cl {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1688 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1689 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f1695 = 5;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private hl f1697;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1698;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1699;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1700;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f1694 = {'g', 'e', 't', 'A', 'd', 'v', 'r', 'i', 's', 'I', 'T', 'y', 'p', 'D', 'U', 'l', 'F', 'n', 'a', 'S', 'o', fw.b.f85389p, 'c', 'J', 'h'};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char f1691 = 13929;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f1692 = 61044;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f1690 = 12544;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f1693 = 50637;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final JSONObject f1701 = new JSONObject();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final List<String> f1696 = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Object m1841() {
        boolean z10;
        if (TextUtils.isEmpty(this.f1699)) {
            f1689 = (f1688 + 39) % 128;
            if (TextUtils.isEmpty(this.f1698) && TextUtils.isEmpty(this.f1700)) {
                int i10 = f1688 + 65;
                f1689 = i10 % 128;
                if (i10 % 2 == 0) {
                    this.f1696.size();
                    throw null;
                }
                if (this.f1696.size() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = true;
            }
        } else {
            z10 = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i11 = f1688 + 105;
        f1689 = i11 % 128;
        if (i11 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private JSONObject m1842() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f1699;
            if (str != null && this.f1697 != null) {
                int i10 = f1689 + 45;
                f1688 = i10 % 128;
                if (i10 % 2 != 0) {
                    jSONObject.putOpt(ih.f2530, str);
                    jSONObject.putOpt(ih.f2532, Integer.valueOf(this.f1697.m2218()));
                    throw null;
                }
                jSONObject.putOpt(ih.f2530, str);
                jSONObject.putOpt(ih.f2532, Integer.valueOf(this.f1697.m2218()));
            }
            jSONObject.putOpt(ih.f2525, this.f1698);
            jSONObject.putOpt(ih.f2529, this.f1700);
            if (this.f1696.size() > 0) {
                jSONObject.putOpt(ih.f2520, new JSONArray((Collection) this.f1696));
                f1689 = (f1688 + 85) % 128;
            }
            if (this.f1701.length() > 0) {
                f1689 = (f1688 + 115) % 128;
                jSONObject.putOpt(ih.f2533, this.f1701.toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String m1843() {
        f1688 = (f1689 + 19) % 128;
        String strOptString = this.f1701.optString(ih.f2525);
        f1688 = (f1689 + 39) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m1846(String str) {
        f1688 = (f1689 + 87) % 128;
        try {
            this.f1701.put(ih.f2520, str);
            int i10 = f1688 + 25;
            f1689 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 7 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m1848(String str) {
        f1688 = (f1689 + 109) % 128;
        try {
            this.f1701.put(ih.f2529, str);
            f1688 = (f1689 + 117) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m1849() {
        int i10 = f1688 + 75;
        f1689 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1701.optString(ih.f2530);
        }
        int i11 = 73 / 0;
        return this.f1701.optString(ih.f2530);
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Object m1850() {
        f1689 = (f1688 + 3) % 128;
        String strOptString = this.f1701.optString(ih.f2529);
        f1688 = (f1689 + 35) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1852(String str) {
        int i10 = f1689;
        this.f1700 = str;
        f1688 = (i10 + 21) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1854(String str) {
        int i10 = f1688 + 73;
        int i11 = i10 % 128;
        f1689 = i11;
        int i12 = i10 % 2;
        this.f1699 = str;
        if (i12 == 0) {
            throw null;
        }
        f1688 = (i11 + SignalKey.EVENT_ID) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m1855() {
        int i10 = f1688;
        String str = this.f1699;
        int i11 = i10 + 45;
        f1689 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1861(String str) {
        int i10 = f1689;
        int i11 = i10 + 45;
        f1688 = i11 % 128;
        int i12 = i11 % 2;
        this.f1698 = str;
        if (i12 != 0) {
            throw null;
        }
        f1688 = (i10 + 41) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private hl m1862() {
        int i10 = (f1689 + 21) % 128;
        f1688 = i10;
        hl hlVar = this.f1697;
        f1689 = (i10 + 29) % 128;
        return hlVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m1844(String str) {
        f1689 = (f1688 + 23) % 128;
        try {
            this.f1701.put(ih.f2525, str);
            int i10 = f1688 + 41;
            f1689 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> m1851() {
        int i10 = f1689;
        int i11 = i10 + 63;
        f1688 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        List<String> list = this.f1696;
        f1688 = (i10 + 67) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m1853() {
        String str;
        int i10 = f1689 + 23;
        int i11 = i10 % 128;
        f1688 = i11;
        if (i10 % 2 != 0) {
            str = this.f1698;
            int i12 = 19 / 0;
        } else {
            str = this.f1698;
        }
        f1689 = (i11 + 51) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1856(hl hlVar) {
        int i10 = f1689;
        this.f1697 = hlVar;
        int i11 = i10 + 5;
        f1688 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m1859() {
        int i10 = f1688;
        int i11 = i10 + 61;
        f1689 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.f1700;
        int i12 = i10 + 27;
        f1689 = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1864(String str) {
        f1688 = (f1689 + 41) % 128;
        try {
            this.f1701.put(ih.f2530, str);
            f1689 = (f1688 + 15) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1857(String str) {
        f1689 = (f1688 + 23) % 128;
        if (TextUtils.isEmpty(str) || this.f1696.contains(str)) {
            return;
        }
        int i10 = f1689 + 11;
        f1688 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f1696.add(str);
        } else {
            this.f1696.add(str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1860(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            try {
                char[] cArr2 = f1694;
                char c10 = f1695;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    g.f2134 = 0;
                    while (true) {
                        int i11 = g.f2134;
                        if (i11 >= i10) {
                            break;
                        }
                        g.f2133 = cArr[i11];
                        g.f2131 = cArr[g.f2134 + 1];
                        if (g.f2133 == g.f2131) {
                            cArr3[g.f2134] = (char) (g.f2133 - b10);
                            cArr3[g.f2134 + 1] = (char) (g.f2131 - b10);
                        } else {
                            g.f2132 = g.f2133 / c10;
                            g.f2130 = g.f2133 % c10;
                            g.f2135 = g.f2131 / c10;
                            g.f2128 = g.f2131 % c10;
                            if (g.f2130 == g.f2128) {
                                g.f2132 = ((g.f2132 + c10) - 1) % c10;
                                g.f2135 = ((g.f2135 + c10) - 1) % c10;
                                int i12 = (g.f2132 * c10) + g.f2130;
                                int i13 = (g.f2135 * c10) + g.f2128;
                                int i14 = g.f2134;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (g.f2132 == g.f2135) {
                                g.f2130 = ((g.f2130 + c10) - 1) % c10;
                                g.f2128 = ((g.f2128 + c10) - 1) % c10;
                                int i15 = (g.f2132 * c10) + g.f2130;
                                int i16 = (g.f2135 * c10) + g.f2128;
                                int i17 = g.f2134;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (g.f2132 * c10) + g.f2128;
                                int i19 = (g.f2135 * c10) + g.f2130;
                                int i20 = g.f2134;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        g.f2134 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:52:0x0212  */
    /* JADX WARN: Code duplicated, block: B:77:0x02ec  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo767(String str, List<Object> list, ch chVar) {
        byte b10;
        switch (str.hashCode()) {
            case -2118395364:
                if (!str.equals(m1860("\u0001\u0002\u0003\u0004\u0000\t\u0006\u000b\u0007\f\u0006\u0003\u0007\u0005\u0087", 15 - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (35 - (Process.myPid() >> 22))).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f1689 + 37;
                    f1688 = i10 % 128;
                    if (i10 % 2 == 0) {
                        b10 = 0;
                    } else {
                        b10 = 1;
                    }
                }
                break;
            case -1836320845:
                if (!str.equals(m1860("\u0013\u0003\t\u0018\u0015\u0016\u0007\u0015\u0004\u000b\u0005\u0010", 12 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (TextUtils.getOffsetBefore("", 0) + 55)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case -1700761801:
                if (!str.equals(m1860("\u0001\u0002\u0003\f\u0003\u0006\u0004\f\u0005\u0010", 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (2 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case -1409157227:
                if (!str.equals(m1863("丿礽ᆢ뤾쿰즸\uf31a싅茄姾뀹刡⛧욵", 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case -1296571754:
                if (!str.equals(m1860("\u0006\u0003\u0001\u0011\f\u0016\u0013\u0010\u000b\t\u0010\u000f\u0015\u0016\u0007\u0015\u008e", 17 - View.resolveSizeAndState(0, 0, 0), (byte) (40 - TextUtils.indexOf((CharSequence) "", '0'))).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f1689 + 105;
                    f1688 = i11 % 128;
                    b10 = i11 % 2 == 0 ? (byte) 16 : (byte) 89;
                }
                break;
            case -1247838300:
                if (!str.equals(m1863("丿礽ࡉꦮ춼㍔ᬵ巏\uedfeൽ䝿☉쬵構쿰즸\uf31a싅Ꭲ䣾㬔ꟸ磅ﶗ", 22 - Process.getGidForName("")).intern())) {
                    b10 = -1;
                } else {
                    b10 = 19;
                }
                break;
            case -1207642840:
                if (!str.equals(m1863("䝿☉ࡉꦮ춼㍔ᬵ巏\uedfeൽ䝿☉ꙧꅣ쀬ਨ", 14 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case -1091371232:
                if (!str.equals(m1860("\u0013\u0003\t\u0018\u0015\u0016\u0007\u0015\u0004\u000b\u0005\u0010ê", 13 - View.getDefaultSize(0, 0), (byte) (Color.argb(0, 0, 0, 0) + 119)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case -869156349:
                if (!str.equals(m1860("\u0000\u0016\u0003\r\u0016\u000f", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 73)).intern())) {
                    b10 = -1;
                } else {
                    b10 = zi.c.f161647y;
                }
                break;
            case -772930430:
                if (!str.equals(m1860("\u0006\u0003\u0003\u0004\u0000\t\u0006\u000b\u0007\f\u0006\u0003\u0007\u0005\u0000\u000e\f\r~", KeyEvent.getDeadChar(0, 0) + 19, (byte) (View.resolveSizeAndState(0, 0, 0) + 25)).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f1688 + 119;
                    f1689 = i12 % 128;
                    int i13 = i12 % 2;
                    b10 = 3;
                }
                break;
            case -407028174:
                if (!str.equals(m1860("\u0001\u0002\u0003\f\u0003\u0006\u0004\f\u0005\u0010\u000f\u0018\u0001\u000b\u0015\u0002", 16 - KeyEvent.keyCodeFromString(""), (byte) (View.resolveSizeAndState(0, 0, 0) + 100)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 13;
                }
                break;
            case -356418934:
                if (!str.equals(m1860("\u0001\u0002\u0001\u0011\f\u0016\u0013\u0010\u000b\t\u0010\u000f\u0015\u0016\u0007\u0015¡", (ViewConfiguration.getPressedStateDuration() >> 16) + 17, (byte) (60 - (ViewConfiguration.getTapTimeout() >> 16))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 15;
                }
                break;
            case -140869031:
                if (!str.equals(m1863("丿礽ᆢ뤾쿰즸\uf31a싅茄姾뀹刡诊篩昦嘜䜧\u1adf", 17 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            case 205499235:
                if (!str.equals(m1860("\u0006\u0003\u0003\u0004\u0000\t\u0006\u000b\u0007\f\u0006\u0003\u0007\u0005\t\u0018\u0015\u0016\u0007\u0015y", AndroidCharacter.getMirror('0') - 27, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 20)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 12;
                }
                break;
            case 236043435:
                if (!str.equals(m1863("䝿☉\u2fec쀰殓\ue1a8㹝咪뀹刡", 10 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    b10 = -1;
                } else {
                    f1688 = (f1689 + 33) % 128;
                    b10 = 5;
                }
                break;
            case 770797430:
                if (!str.equals(m1863("丿礽ࡉꦮ춼㍔ᬵ巏\uedfeൽ䝿☉ꙧꅣ\ue72a\uefe3\ufddc\uf59c㡣챪", 19 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 779164621:
                int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                b10 = zi.c.f161643u;
                if (!str.equals(m1863("䝿☉ᆢ뤾쿰즸\uf31a싅茄姾뀹刡诊篩昦嘜䜧\u1adf", 18 - keyRepeatTimeout).intern())) {
                    b10 = -1;
                }
                break;
            case 1308044955:
                if (!str.equals(m1860("\u0006\u0003\u0001\u0011\f\u0016\u0013\u0010\u000b\t\u0091", 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (KeyEvent.getDeadChar(0, 0) + 37)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 1396624783:
                if (!str.equals(m1863("丿礽\ud812┼꺣䁇\udb13錴\u07bb躇窩䆠", Color.argb(0, 0, 0, 0) + 11).intern())) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 1924460979:
                if (!str.equals(m1863("⩍ｭ蟙\uf1b2춼㍔ᬵ巏\uedfeൽ䝿☉ꙧꅣꌴ떠貖犙", Color.alpha(0) + 17).intern())) {
                    b10 = -1;
                } else {
                    b10 = 20;
                }
                break;
            case 1964255575:
                if (!str.equals(m1860("\u0001\u0002\u0003\u0004\u0000\t\u0006\u000b\u0007\f\u0006\u0003\u0007\u0005\t\u0018\u0015\u0016\u0007\u0015Â", 22 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (Color.green(0) + 93)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case 2056496294:
                if (!str.equals(m1863("䝿☉\u2fec쀰殓\ue1a8㹝咪뀹刡诊篩昦嘜䜧\u1adf", 15 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 14;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return m1855();
            case 1:
                m1854((String) cz.m1806(list, 0, String.class));
                return null;
            case 2:
                if (m1862() != null) {
                    return Integer.valueOf(m1862().m2218());
                }
                return null;
            case 3:
                m1856(hl.m2215(((Integer) cz.m1806(list, 0, Integer.class)).intValue()));
                return null;
            case 4:
                return m1853();
            case 5:
                m1861((String) cz.m1806(list, 0, String.class));
                return null;
            case 6:
                return m1859();
            case 7:
                m1852((String) cz.m1806(list, 0, String.class));
                return null;
            case 8:
                return m1851();
            case 9:
                m1857((String) cz.m1806(list, 0, String.class));
                return null;
            case 10:
                m1858((List<String>) cz.m1806(list, 0, List.class));
                return null;
            case 11:
                return m1849();
            case 12:
                m1864((String) cz.m1806(list, 0, String.class));
                return null;
            case 13:
                return m1843();
            case 14:
                m1844((String) cz.m1806(list, 0, String.class));
                f1688 = (f1689 + 75) % 128;
                return null;
            case 15:
                return m1850();
            case 16:
                m1848((String) cz.m1806(list, 0, String.class));
                return null;
            case 17:
                return m1847();
            case 18:
                m1846((String) cz.m1806(list, 0, String.class));
                return null;
            case 19:
                return m1845();
            case 20:
                return m1841();
            case 21:
                return m1842();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private JSONObject m1845() {
        JSONObject jSONObject;
        int i10 = f1689 + 113;
        int i11 = i10 % 128;
        f1688 = i11;
        if (i10 % 2 != 0) {
            jSONObject = this.f1701;
            int i12 = 69 / 0;
        } else {
            jSONObject = this.f1701;
        }
        f1689 = (i11 + 61) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m1847() {
        f1689 = (f1688 + 1) % 128;
        String strOptString = this.f1701.optString(ih.f2520);
        int i10 = f1688 + 71;
        f1689 = i10 % 128;
        if (i10 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1863(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1691)) ^ ((c11 >>> 5) + f1690)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1692) ^ ((c12 + i12) ^ ((c12 << 4) + f1693))));
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1858(List<String> list) {
        int i10 = f1688 + 41;
        f1689 = i10 % 128;
        if (i10 % 2 != 0) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                f1688 = (f1689 + 123) % 128;
                m1857(it.next());
            }
            int i11 = f1688 + 63;
            f1689 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return;
        }
        list.iterator();
        throw null;
    }
}
