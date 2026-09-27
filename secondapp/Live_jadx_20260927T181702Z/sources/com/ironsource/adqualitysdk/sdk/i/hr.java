package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class hr extends hp {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Class f2385;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private int f2386;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f2387;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private List<Class> f2388;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private List<Class> f2389 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f2390;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends hp.b implements cl {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2391 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2392 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f2393 = {'s', 'e', 't', 'R', fw.b.f85389p, 'r', 'n', 'T', 'y', 'p', 'o', 'F', 'i', 'd', 'k', 'M', 'h', 'a', 'f', 'E', 'x', 'c', 'l', 'v', 'w'};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2394 = 4017479574797664034L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f2395 = 5;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private hr f2396 = new hr();

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m2273(Class cls) {
            f2391 = (f2392 + 93) % 128;
            this.f2396.f2389.add(cls);
            f2392 = (f2391 + 1) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private c m2276(Class cls) {
            int i10 = f2391 + 33;
            f2392 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f2396.f2385 = cls;
                throw null;
            }
            this.f2396.f2385 = cls;
            int i11 = f2392 + 85;
            f2391 = i11 % 128;
            if (i11 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m2280(boolean z10) {
            int i10 = f2392 + 55;
            f2391 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f2396.f2387 = z10;
                int i11 = 36 / 0;
            } else {
                this.f2396.f2387 = z10;
            }
            f2391 = (f2392 + 63) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m2281(int i10) {
            int i11 = f2392 + 5;
            f2391 = i11 % 128;
            if (i11 % 2 != 0) {
                this.f2396.f2390 = i10;
                return this;
            }
            this.f2396.f2390 = i10;
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private hr m2283() {
            int i10 = f2392;
            hr hrVar = this.f2396;
            int i11 = i10 + 45;
            f2391 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 92 / 0;
            }
            return hrVar;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2284(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2129) {
                try {
                    char[] cArr2 = f2393;
                    char c10 = f2395;
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

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m2274(List<Class> list) {
            int i10 = f2392 + 89;
            f2391 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f2396.f2388 = list;
                int i11 = f2391 + 1;
                f2392 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 39 / 0;
                }
                return this;
            }
            this.f2396.f2388 = list;
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m2282(boolean z10, int i10) {
            int i11 = (f2391 + 37) % 128;
            f2392 = i11;
            hr hrVar = this.f2396;
            hrVar.f2376 = z10;
            hrVar.f2378 = i10;
            f2391 = (i11 + 35) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private c m2275(int i10) {
            int i11 = f2392;
            f2391 = (i11 + 67) % 128;
            hr hrVar = this.f2396;
            hrVar.f2375 = i10 | hrVar.f2375;
            f2391 = (i11 + 99) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m2279(int i10) {
            int i11 = (f2392 + 77) % 128;
            f2391 = i11;
            hr hrVar = this.f2396;
            hrVar.f2377 = i10 | hrVar.f2377;
            int i12 = i11 + 53;
            f2392 = i12 % 128;
            if (i12 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m2272(int i10) {
            int i11 = f2391 + 75;
            f2392 = i11 % 128;
            if (i11 % 2 == 0) {
                this.f2396.f2386 = i10;
                f2392 = (f2391 + 71) % 128;
                return this;
            }
            this.f2396.f2386 = i10;
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2277(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2284) {
                try {
                    char[] cArrM2198 = h.m2198(f2394, cArr, i10);
                    h.f2285 = 4;
                    while (true) {
                        int i11 = h.f2285;
                        if (i11 < cArrM2198.length) {
                            h.f2283 = i11 - 4;
                            int i12 = h.f2285;
                            cArrM2198[i12] = (char) (((long) (cArrM2198[i12] ^ cArrM2198[i12 % 4])) ^ (((long) h.f2283) * f2394));
                            h.f2285++;
                        } else {
                            str2 = new String(cArrM2198, 4, cArrM2198.length - 4);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m2278() {
            f2391 = (f2392 + 115) % 128;
            this.f2396.mo2233();
            int i10 = f2392 + 123;
            f2391 = i10 % 128;
            if (i10 % 2 != 0) {
                return this;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cl
        /* JADX INFO: renamed from: ﻐ */
        public final Object mo767(String str, List<Object> list, ch chVar) {
            int iIntValue;
            while (true) {
                switch (str.hashCode()) {
                    case -2020212392:
                        if (str.equals(m2277("ꔶꕗ幂\uec7a颏\ue104鉚ꖻ姛\ue59c雃ꄓ屈\ue624魗꺉僋\ueaac鿉\uaa38坱\uef6e鱱띻䯻", 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                            return m2273((Class) cz.m1806(list, 0, Class.class));
                        }
                        continue;
                        break;
                    case -600792781:
                        if (str.equals(m2284("\u0004\n\u000e\u0007\u0010\u0000\u0001\u0011\u000b\u000e¨", View.getDefaultSize(0, 0) + 11, (byte) (53 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern())) {
                            return m2281(((Integer) cz.m1806(list, 0, Integer.class)).intValue());
                        }
                        continue;
                        break;
                    case 94094958:
                        if (str.equals(m2277("\uec8e\uecec恈댷噛\udf1f촚歑ၢ", View.getDefaultSize(0, 0)).intern())) {
                            int i10 = f2391 + 25;
                            f2392 = i10 % 128;
                            if (i10 % 2 == 0) {
                                return m2283();
                            }
                        } else {
                            continue;
                        }
                    case 108404047:
                        if (str.equals(m2284("\u0006\u0000\u0001\u0002æ", View.getDefaultSize(0, 0) + 5, (byte) (TextUtils.lastIndexOf("", '0', 0) + 115)).intern())) {
                            return m2278();
                        }
                        continue;
                        break;
                    case 132643084:
                        if (!str.equals(m2277("衿蠌\udde2鞮㖕报\ue99eࢽ璂春\ued00ఞ焝斟\ue09cγ綆椪\ue413܆稺泔\ue7afᩡ暤", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                        }
                        break;
                    case 200590504:
                        if (str.equals(m2277("⊲⋁㌀飾虀豇\ue6db뭔\ude59裂\ue274뿁\udbd0護\uefd2끗흉蟎\ueb70듛탦舷\ue8e8ꦨ챎麳\uf462ꨫ", Process.myTid() >> 22).intern())) {
                            return m2280(((Boolean) cz.m1806(list, 0, Boolean.class)).booleanValue());
                        }
                        continue;
                        break;
                    case 387034026:
                        if (str.equals(m2277("剸刋餹퉵㴢♾걐6꺓⋻꣰Ңꬻⅾꕑ\u0b31Ꞓⷠꇅ\u0fbdꀫ⠈", Color.green(0)).intern())) {
                            boolean zBooleanValue = ((Boolean) cz.m1806(list, 0, Boolean.class)).booleanValue();
                            if (list.size() > 1) {
                                f2391 = (f2392 + 101) % 128;
                                iIntValue = ((Integer) cz.m1806(list, 1, Integer.class)).intValue();
                            } else {
                                iIntValue = -1;
                            }
                            return m2282(zBooleanValue, iIntValue);
                        }
                        continue;
                        break;
                    case 391966482:
                        if (str.equals(m2277("\uf798\uf7f9锒Ꟍᵅ⩔\ud9ec\u206e\u0b7f⻜\udd69Ⓧ\u0ee1ⵅ탪⭀ɔ⇇푙⿕כ\u243cퟝ㊧ᥕ", TextUtils.indexOf((CharSequence) "", '0', 0) + 1).intern())) {
                            int i11 = f2391 + 1;
                            f2392 = i11 % 128;
                            if (i11 % 2 == 0) {
                                return m2279(((Integer) cz.m1806(list, 0, Integer.class)).intValue());
                            }
                        }
                        break;
                    case 393987200:
                        if (str.equals(m2284("\u0001\u0002\u0003\u0004\u0002\u0003\u0000\t\u0007\b\t\u0005\u0002\u0006\u000b\f\u000b\u0007¿", 19 - View.combineMeasuredStates(0, 0), (byte) (91 - KeyEvent.keyCodeFromString(""))).intern())) {
                            f2391 = (f2392 + 111) % 128;
                            return m2276((Class) cz.m1806(list, 0, Class.class));
                        }
                        continue;
                        break;
                    case 1423210564:
                        if (str.equals(m2284("\u0012\f\n\u0012\u000b\u000e\r\u0011\u000b\u0002\n\u0005\u0005\f\u000f\u0018\u0016\u0017\u0003\u000eÆ", 20 - TextUtils.lastIndexOf("", '0'), (byte) (145 - AndroidCharacter.getMirror('0'))).intern())) {
                            f2391 = (f2392 + 15) % 128;
                            return m2275(((Integer) cz.m1806(list, 0, Integer.class)).intValue());
                        }
                        continue;
                        break;
                    case 1773646829:
                        if (str.equals(m2277("获菄⃛豼᠗龜\uf24c┡罞鬃\uf6d1↔竂额כֿ⸓癜鐵\uffd9⪙燲釪", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                            f2392 = (f2391 + 95) % 128;
                            return m2274((List<Class>) cz.m1806(list, 0, List.class));
                        }
                        continue;
                        break;
                    default:
                        continue;
                }
                return m2272(((Integer) cz.m1806(list, 0, Integer.class)).intValue());
            }
        }
    }

    public hr() {
        mo2233();
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public final int m2266() {
        return this.f2386;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final List<Class> m2267() {
        return this.f2388;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m2268() {
        return this.f2387;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final int m2269() {
        return this.f2390;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Class m2270() {
        return this.f2385;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final List<Class> m2271() {
        return this.f2389;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hp
    /* JADX INFO: renamed from: ﾒ */
    public final void mo2233() {
        super.mo2233();
        this.f2385 = null;
        this.f2390 = 0;
        this.f2387 = true;
        this.f2389.clear();
        this.f2388 = null;
        this.f2386 = -1;
    }
}
