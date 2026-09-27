package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ogury.sdk.Ogury;
import com.vungle.ads.internal.signals.SignalKey;
import io.presage.Presage;
import io.presage.common.AdConfig;
import io.presage.common.PresageSdk;
import io.presage.common.network.models.RewardItem;
import io.presage.interstitial.InterstitialActivity;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class ca extends bd {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1194 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1195 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1196 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1197 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1198 = 4437560584879617831L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1199 = 792353447269362345L;

    public ca(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Presage m1321() {
        int i10 = f1194 + 81;
        f1197 = i10 % 128;
        if (i10 % 2 == 0) {
            return Presage.getInstance();
        }
        int i11 = 12 / 0;
        return Presage.getInstance();
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ Presage m1322() {
        Presage presageM1321;
        int i10 = f1197 + 31;
        f1194 = i10 % 128;
        if (i10 % 2 == 0) {
            presageM1321 = m1321();
            int i11 = 91 / 0;
        } else {
            presageM1321 = m1321();
        }
        int i12 = f1194 + 33;
        f1197 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 58 / 0;
        }
        return presageM1321;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1326(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        f1197 = (f1194 + 85) % 128;
        m1328(presageOptinVideo, presageOptinVideoCallback);
        f1197 = (f1194 + 9) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1327(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        f1197 = (f1194 + 3) % 128;
        m1324(presageInterstitial, presageInterstitialCallback);
        f1194 = (f1197 + SignalKey.EVENT_ID) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo691() {
        HashMap map = new HashMap();
        map.put(m1323("ț믐銻祍㼱ㅥኳ萺䇂ᢼ礛Ώ⚡련ໄᤁ\ue2a8\udd0a", (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 65132), "㜧㬆懗㶕", Color.argb(0, 0, 0, 0), "仑㻓涟擾").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return ca.m1322();
            }
        });
        map.put(m1325("\ueada虣㎃곭塻\uf5b6曖ሒ辢㣺퐖䅘\uf2f4渫᭗뒫‸\udd5a事喝靤\u0091뷈", 27823 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                ca.m1327((PresageInterstitial) list.get(0), (PresageInterstitialCallback) list.get(1));
                return null;
            }
        });
        map.put(m1323("蔉朼鼞↢鞛祛\uf755଼쎵鶦섊㲑╺涁뭂섍없셶맡\ue830梫", (char) (ViewConfiguration.getWindowTouchSlop() >> 8), "㜧㬆懗㶕", ((byte) KeyEvent.getModifierMetaStateMask()) - 1725439885, "爙⟠抙ಲ").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                ca.m1326((PresageOptinVideo) list.get(0), (PresageOptinVideoCallback) list.get(1));
                return null;
            }
        });
        f1194 = (f1197 + 31) % 128;
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        return r0.split(m1325("\uea84", 14243 - android.view.KeyEvent.normalizeMetaState(0)).intern())[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.ca.f1194 + 117;
        com.ironsource.adqualitysdk.sdk.i.ca.f1197 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        r0 = 51 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ca.f1197 = (com.ironsource.adqualitysdk.sdk.i.ca.f1194 + 15) % 128;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo692() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ca.f1197
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ca.f1194 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L17
            java.lang.String r0 = r4.mo774()
            r2 = 92
            int r2 = r2 / r1
            if (r0 == 0) goto L3c
            goto L1d
        L17:
            java.lang.String r0 = r4.mo774()
            if (r0 == 0) goto L3c
        L1d:
            int r2 = com.ironsource.adqualitysdk.sdk.i.ca.f1194
            int r2 = r2 + 15
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.ca.f1197 = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r1)
            int r2 = 14243 - r2
            java.lang.String r3 = "\uea84"
            java.lang.String r2 = m1325(r3, r2)
            java.lang.String r2 = r2.intern()
            java.lang.String[] r0 = r0.split(r2)
            r0 = r0[r1]
            return r0
        L3c:
            int r0 = com.ironsource.adqualitysdk.sdk.i.ca.f1194
            int r0 = r0 + 117
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ca.f1197 = r2
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L4c
            r0 = 51
            int r0 = r0 / r1
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ca.mo692():java.lang.String");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1325(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2019) {
            try {
                f.f2017 = i10;
                char[] cArr2 = new char[cArr.length];
                f.f2018 = 0;
                while (true) {
                    int i11 = f.f2018;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f1199);
                        f.f2018++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x006b  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo693(String str) {
        f1194 = (f1197 + 109) % 128;
        byte b10 = 1;
        switch (str.hashCode()) {
            case -2101347995:
                if (!str.equals(m1325("\ueae8\ue63c\uf308찕\ud903ꩺꝦ끙", (ViewConfiguration.getTapTimeout() >> 16) + 3313).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f1194 + 63;
                    f1197 = i10 % 128;
                    b10 = i10 % 2 != 0 ? (byte) 55 : zi.c.f161636n;
                }
                break;
            case -1907784110:
                b10 = !str.equals(m1325("\ueaf9鉺ᮎ茹ࡌ뇫㤊ꚁ⿑흴岊쐬䵳쫭爃ﮣ惖", 30881 - (ViewConfiguration.getTouchSlop() >> 8)).intern()) ? (byte) -1 : (byte) 9;
                break;
            case -1704786309:
                if (!str.equals(m1325("\ueae0吢霗홣ᅏ傣鎃튃᷵峍鸺\ud912ᡔ孫驛얫ҏ䟵蛇쀯", 48869 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    b10 = -1;
                }
                break;
            case -938422005:
                if (!str.equals(m1323("ꬔឹ낃琱\ue19e륧뼘辬Ꮌ㪍", (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "㜧㬆懗㶕", 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "뮕Ő椫쐔").intern())) {
                    b10 = -1;
                } else {
                    f1197 = (f1194 + 51) % 128;
                    b10 = 6;
                }
                break;
            case -610604286:
                b10 = !str.equals(m1323("潡醴抻䎔\udca9㦻\ue7ce븮戙⧲", (char) ((Process.getThreadPriority(0) + 20) >> 6), "㜧㬆懗㶕", AndroidCharacter.getMirror('0') - '0', "퐼梨\ue15f䃋").intern()) ? (byte) -1 : zi.c.f161635m;
                break;
            case -126768170:
                if (!str.equals(m1325("\ueac0똗匥ﲪ馟㫙옼捿ెꦕ䪭ᘻ댋局廉髤⟊쌼汲फ़ꪔ短ጳ뱀奸类蟧\u20c7찇楷ણ힏烽ᰱ뤊婖\ue78c胿ⷛ줗橷㞹킗緋", Color.blue(0) + 23761).intern())) {
                    b10 = -1;
                } else {
                    f1197 = (f1194 + 121) % 128;
                    b10 = 0;
                }
                break;
            case 76142724:
                if (!str.equals(m1325("\ueae6ꧽ沺⍂\ue61c", 17203 - View.MeasureSpec.getSize(0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case 698887547:
                b10 = !str.equals(m1325("\ueaf9\ue680\uf27a쿋\udba4휉ꃮ벝蠟藮酂洲纞䩂䘺厈⽰㣃㒣", TextUtils.lastIndexOf("", '0', 0, 0) + 3164).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1067648736:
                b10 = !str.equals(m1325("\ueaf9䟤낲\ued67帴裵\ue5b6噙茿\ufdea⺺魮\uf42e⛮鎲챬㤰毧쒫ㅇ戤\udceeয穢휠ǭ犤", ExpandableListView.getPackedPositionChild(0L) + 44352).intern()) ? (byte) -1 : (byte) 8;
                break;
            case 1346371759:
                if (!str.equals(m1325("\ueaf9\uf5e2풾띱阬盓冚", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7993).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f1194 + 119;
                    f1197 = i11 % 128;
                    if (i11 % 2 == 0) {
                        b10 = 5;
                    } else {
                        b10 = 4;
                    }
                }
                break;
            case 1871097647:
                b10 = !str.equals(m1323("\ud91a쒼缥啱⚑쬵䲶艄\ue886ꌮ䰜䊱黾₪칋嬞⮱鄙⼡퇣뭶揠", (char) View.MeasureSpec.makeMeasureSpec(0, 0), "㜧㬆懗㶕", Drawable.resolveOpacity(0, 0), "ﾾ\uf763窧鏈").intern()) ? (byte) -1 : (byte) 3;
                break;
            case 2109755994:
                if (!str.equals(m1325("\ueac0盭틑㹘驷\ue61b䏘꿥\u0b96靏\uf329弙룃Ӳ悖챞⡪됆ᇆ緬\ud99c╏腷\ued5a仔ꫳ㛙鉩ﹳ娂ꟆϮ澺쭖坶댼\u1ccc磿쒧\u2065豲\ue83e痎퇦㶤饒\ue56a", Color.argb(0, 0, 0, 0) + 39979).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f1194 + 115;
                    f1197 = i12 % 128;
                    if (i12 % 2 == 0) {
                        b10 = 2;
                    } else {
                        b10 = 4;
                    }
                }
                break;
            case 2128976055:
                b10 = !str.equals(m1323("ㆬ괩캭ꛓ뫾ᣅ鸫⋰꼱㎁\udd9e\uebf5⭝폡撠㗱腸拿寈\ud83e쒄樯権\ua638倷", (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), "㜧㬆懗㶕", (-188083907) - TextUtils.getOffsetAfter("", 0), "㶩쨑\ud9f4姼").intern()) ? (byte) -1 : (byte) 10;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return InterstitialActivity.class;
            case 2:
            case 3:
                return io.presage.interstitial.ui.InterstitialActivity.class;
            case 4:
                return Ogury.class;
            case 5:
                return Presage.class;
            case 6:
                return PresageSdk.class;
            case 7:
                return PresageInterstitial.class;
            case 8:
                return PresageInterstitialCallback.class;
            case 9:
                return PresageOptinVideo.class;
            case 10:
                f1194 = (f1197 + 65) % 128;
                return PresageOptinVideoCallback.class;
            case 11:
                return RewardItem.class;
            case 12:
                return AdConfig.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1323(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2673) {
            try {
                char[] cArr4 = (char[]) cArr.clone();
                char[] cArr5 = (char[]) cArr2.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                j.f2675 = 0;
                while (true) {
                    int i11 = j.f2675;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % 65535);
                        j.f2674 = c12;
                        cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                        cArr4[i13] = c12;
                        int i15 = j.f2675;
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1198) ^ ((long) f1196)) ^ ((long) f1195));
                        j.f2675 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1324(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        f1197 = (f1194 + 23) % 128;
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        f1197 = (f1194 + 21) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final String mo774() {
        f1194 = (f1197 + 51) % 128;
        try {
            try {
                String str = (String) Class.forName(m1325("\ueac0\uef97\ue025\ue52aﾟ\uf059\uf53c쿿쁆씕\udfad킱픊꿙ꂪꕹ뿗냦땲迌胓蕚鸾邍镙渥惡敋縛烠疢与䃨䖭帟僾喢\u2e69\u20cd▍㹌㌿㖍ๆ̡כṕ", 1361 - View.resolveSize(0, 0)).intern()).getMethod(m1325("\ueac8", 22469 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), null).invoke(null, null);
                int i10 = f1194 + 57;
                f1197 = i10 % 128;
                if (i10 % 2 == 0) {
                    return str;
                }
                throw null;
            } catch (Exception unused) {
                return PresageSdk.getAdsSdkVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1328(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        f1194 = (f1197 + 57) % 128;
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        f1194 = (f1197 + 73) % 128;
    }
}
