package com.ironsource.adqualitysdk.sdk.i;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class jj {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static jj f2819;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    boolean f2821 = false;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Set<jg> f2820 = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @TargetApi(14)
    public static class b extends jj implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f2822 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f2823 = 1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int[] f2824 = {852778607, 1982419963, -1875200446, 1662580092, -49784149, -1732858882, 492031467, -428128084, -556755272, 1117900764, 1234715372, 305635570, 1377257034, 1744949835, 1331503627, 1363535708, 1637706811, 691137695};

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Map<Activity, Boolean> f2825;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private WeakReference<Activity> f2826;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private WeakReference<Application> f2827;

        private b() {
            this.f2825 = new WeakHashMap();
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private void m2639(Activity activity) {
            Iterator<jg> it = m2635().iterator();
            f2823 = (f2822 + 43) % 128;
            while (it.hasNext()) {
                int i10 = f2822 + 121;
                f2823 = i10 % 128;
                if (i10 % 2 == 0) {
                    it.next().mo339(activity);
                    int i11 = 94 / 0;
                } else {
                    it.next().mo339(activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                synchronized (jj.class) {
                    try {
                        if (this.f2826 == null) {
                            m2638(activity);
                            jj.class.notifyAll();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Iterator<jg> it = m2635().iterator();
                while (it.hasNext()) {
                    it.next().onActivityCreated(activity, bundle);
                }
            } catch (Exception e10) {
                kd.m2827(m2640(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, 29 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m2640(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, 106370530, -106445027, 1314361584, 135943168, 1225542097, -2037163726}, ((byte) KeyEvent.getModifierMetaStateMask()) + zi.c.E).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            f2822 = (f2823 + 79) % 128;
            try {
                Iterator<jg> it = m2635().iterator();
                while (it.hasNext()) {
                    it.next().onActivityDestroyed(activity);
                }
                f2822 = (f2823 + 7) % 128;
            } catch (Exception e10) {
                kd.m2827(m2640(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, 31 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), m2640(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, -1011920759, -514237837, -799198377, 1956937021, -1778007821, 1924516393}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            int i10 = f2823 + 25;
            f2822 = i10 % 128;
            try {
                if (i10 % 2 != 0) {
                    m2635().iterator();
                    throw null;
                }
                Iterator<jg> it = m2635().iterator();
                while (it.hasNext()) {
                    f2822 = (f2823 + 15) % 128;
                    it.next().onActivityPaused(activity);
                }
            } catch (Exception e10) {
                kd.m2827(m2640(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, Drawable.resolveOpacity(0, 0) + 30).intern(), m2640(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, 542832659, 354471783, 190147778, 1166495507, -958284366, -5727967}, (ViewConfiguration.getScrollBarSize() >> 8) + 25).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            f2822 = (f2823 + 13) % 128;
            try {
                m2638(activity);
                Iterator<jg> it = m2635().iterator();
                while (it.hasNext()) {
                    int i10 = f2823 + 3;
                    f2822 = i10 % 128;
                    if (i10 % 2 != 0) {
                        it.next().onActivityResumed(activity);
                        throw null;
                    }
                    it.next().onActivityResumed(activity);
                }
            } catch (Exception e10) {
                kd.m2827(m2640(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, 30 - KeyEvent.keyCodeFromString("")).intern(), m2640(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, -1106219560, -189573273, -756190804, 1970045181, 1225542097, -2037163726}, MotionEvent.axisFromString("") + 27).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            try {
                Iterator<jg> it = m2635().iterator();
                f2822 = (f2823 + 63) % 128;
                while (it.hasNext()) {
                    f2823 = (f2822 + 67) % 128;
                    it.next().onActivitySaveInstanceState(activity, bundle);
                }
            } catch (Exception e10) {
                kd.m2827(m2640(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, 30 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m2640(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, -397824460, 1220972193, -306235481, 357166782, -331477217, 720202842, 434389037, -1339251480, 10378132, -258850162}, TextUtils.lastIndexOf("", '0') + 37).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            try {
                if (this.f2826 == null) {
                    m2638(activity);
                }
                synchronized (this) {
                    this.f2825.put(activity, Boolean.TRUE);
                }
                Iterator<jg> it = m2635().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStarted(activity);
                }
                if (activity.getLocalClassName().equals(m2640(new int[]{794530547, -1223452522, 818890360, -750195985, -498149136, 1307644982, 1783173582, -576746712, 1767025888, -1219627344, -1285886341, 107496323, -1202616267, -884503944, 480019611, 2073556878, -229349524, -1286536630, -1824038139, -116106100, 1660370409, -1197788475}, 43 - Color.blue(0)).intern())) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f2825.size() == 1 && !this.f2821) {
                            m2641(activity);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                kd.m2827(m2640(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, Color.alpha(0) + 30).intern(), m2640(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, -397824460, 1220972193, 997713263, 1723517344, 1225542097, -2037163726}, (-16777190) - Color.rgb(0, 0, 0)).intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            int size;
            try {
                Iterator<jg> it = m2635().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStopped(activity);
                }
                this.f2821 = activity.isChangingConfigurations();
                synchronized (this) {
                    try {
                        if (!this.f2825.containsKey(activity) || activity.getLocalClassName().equals(m2640(new int[]{794530547, -1223452522, 818890360, -750195985, -498149136, 1307644982, 1783173582, -576746712, 1767025888, -1219627344, -1285886341, 107496323, -1202616267, -884503944, 480019611, 2073556878, -229349524, -1286536630, -1824038139, -116106100, 1660370409, -1197788475}, 43 - KeyEvent.getDeadChar(0, 0)).intern())) {
                            size = -1;
                        } else {
                            this.f2825.remove(activity);
                            size = this.f2825.size();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (size < 0 || size != 0 || this.f2821) {
                    return;
                }
                m2639(activity);
            } catch (Exception e10) {
                kd.m2827(m2640(new int[]{-659115692, 1190194251, -368359372, 471504840, 1057637335, 1750559258, -532205194, -2095145174, 916047929, -1342352576, 127239524, 1356248814, -1497497097, -1974546549, 500151579, -82253784}, 29 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), m2640(new int[]{-875183857, -1400122060, 148243891, -1774707801, 1689151748, 12523164, -1824038139, -116106100, -397824460, 1220972193, 2020492388, 1031454015, 1225542097, -2037163726}, 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), e10, false);
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﻐ */
        public final Activity mo2632() {
            int i10 = f2822;
            f2823 = (i10 + 57) % 128;
            WeakReference<Activity> weakReference = this.f2826;
            if (weakReference == null) {
                return null;
            }
            f2823 = (i10 + 73) % 128;
            Activity activity = weakReference.get();
            f2822 = (f2823 + 53) % 128;
            return activity;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾇ */
        public final synchronized boolean mo2636() {
            int i10 = f2823 + 59;
            f2822 = i10 % 128;
            try {
                if (i10 % 2 != 0) {
                    this.f2825.size();
                    throw null;
                }
                if (this.f2825.size() <= 0) {
                    return false;
                }
                int i11 = f2822 + 51;
                f2823 = i11 % 128;
                if (i11 % 2 != 0) {
                    return true;
                }
                throw null;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾒ */
        public final synchronized void mo2637(Application application, Activity activity) {
            try {
                if (this.f2827 == null) {
                    this.f2827 = new WeakReference<>(application);
                    if (activity != null) {
                        m2638(activity);
                        synchronized (this) {
                            this.f2825.put(activity, Boolean.TRUE);
                        }
                    }
                    application.registerActivityLifecycleCallbacks(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private void m2641(Activity activity) {
            Iterator<jg> it = m2635().iterator();
            while (it.hasNext()) {
                f2822 = (f2823 + 67) % 128;
                it.next().mo340(activity);
            }
            f2822 = (f2823 + 81) % 128;
        }

        public /* synthetic */ b(byte b10) {
            this();
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private void m2638(final Activity activity) {
            this.f2826 = new WeakReference<>(activity);
            t.m2950(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.b.5
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo231() throws Exception {
                    jw.m2716(activity);
                }
            });
            f2822 = (f2823 + 109) % 128;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2640(int[] iArr, int i10) {
            String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.e.f1912) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f2824.clone();
                    com.ironsource.adqualitysdk.sdk.i.e.f1913 = 0;
                    while (true) {
                        int i11 = com.ironsource.adqualitysdk.sdk.i.e.f1913;
                        if (i11 < iArr.length) {
                            int i12 = iArr[i11];
                            char c10 = (char) (i12 >> 16);
                            cArr[0] = c10;
                            char c11 = (char) i12;
                            cArr[1] = c11;
                            char c12 = (char) (iArr[i11 + 1] >> 16);
                            cArr[2] = c12;
                            char c13 = (char) iArr[i11 + 1];
                            cArr[3] = c13;
                            com.ironsource.adqualitysdk.sdk.i.e.f1915 = (c10 << 16) + c11;
                            com.ironsource.adqualitysdk.sdk.i.e.f1914 = (c12 << 16) + c13;
                            com.ironsource.adqualitysdk.sdk.i.e.m2090(iArr2);
                            for (int i13 = 0; i13 < 16; i13++) {
                                int i14 = com.ironsource.adqualitysdk.sdk.i.e.f1915 ^ iArr2[i13];
                                com.ironsource.adqualitysdk.sdk.i.e.f1915 = i14;
                                com.ironsource.adqualitysdk.sdk.i.e.f1914 = com.ironsource.adqualitysdk.sdk.i.e.m2089(i14) ^ com.ironsource.adqualitysdk.sdk.i.e.f1914;
                                int i15 = com.ironsource.adqualitysdk.sdk.i.e.f1915;
                                com.ironsource.adqualitysdk.sdk.i.e.f1915 = com.ironsource.adqualitysdk.sdk.i.e.f1914;
                                com.ironsource.adqualitysdk.sdk.i.e.f1914 = i15;
                            }
                            int i16 = com.ironsource.adqualitysdk.sdk.i.e.f1915;
                            com.ironsource.adqualitysdk.sdk.i.e.f1915 = com.ironsource.adqualitysdk.sdk.i.e.f1914;
                            com.ironsource.adqualitysdk.sdk.i.e.f1914 = i16;
                            com.ironsource.adqualitysdk.sdk.i.e.f1914 = i16 ^ iArr2[16];
                            com.ironsource.adqualitysdk.sdk.i.e.f1915 ^= iArr2[17];
                            int i17 = com.ironsource.adqualitysdk.sdk.i.e.f1914;
                            int i18 = com.ironsource.adqualitysdk.sdk.i.e.f1915;
                            cArr[0] = (char) (i18 >>> 16);
                            cArr[1] = (char) i18;
                            int i19 = com.ironsource.adqualitysdk.sdk.i.e.f1914;
                            cArr[2] = (char) (i19 >>> 16);
                            cArr[3] = (char) i19;
                            com.ironsource.adqualitysdk.sdk.i.e.m2090(iArr2);
                            int i20 = com.ironsource.adqualitysdk.sdk.i.e.f1913;
                            cArr2[i20 << 1] = cArr[0];
                            cArr2[(i20 << 1) + 1] = cArr[1];
                            cArr2[(i20 << 1) + 2] = cArr[2];
                            cArr2[(i20 << 1) + 3] = cArr[3];
                            com.ironsource.adqualitysdk.sdk.i.e.f1913 = i20 + 2;
                        } else {
                            str = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e extends jj {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2829 = -238758940400250356L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2830 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2831 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Context f2832;

        public /* synthetic */ e(byte b10) {
            this();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﻐ */
        public final Activity mo2632() {
            int i10 = f2830 + 31;
            f2831 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 35 / 0;
            }
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo2636() {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f2832.getSystemService(m2642("鉭ⓊＲ놊䣮͜햦泶", TextUtils.getCapsMode("", 0, 0) + 46757).intern())).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                f2831 = (f2830 + 101) % 128;
                return false;
            }
            String packageName = this.f2832.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100) {
                    f2831 = (f2830 + 117) % 128;
                    if (runningAppProcessInfo.processName.equals(packageName)) {
                        f2830 = (f2831 + 77) % 128;
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jj
        /* JADX INFO: renamed from: ﾒ */
        public final synchronized void mo2637(Application application, Activity activity) {
            f2830 = (f2831 + 17) % 128;
            if (application != null) {
                this.f2832 = application.getApplicationContext();
                return;
            }
            if (activity != null) {
                this.f2832 = activity.getApplicationContext();
            }
            int i10 = f2831 + 19;
            f2830 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 56 / 0;
            }
        }

        private e() {
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2642(String str, int i10) {
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
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f2829);
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
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized jj m2631() {
        try {
            if (f2819 == null) {
                f2819 = new b((byte) 0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2819;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract Activity mo2632();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2633(jg jgVar) {
        this.f2820.remove(jgVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized List<jg> m2635() {
        return new ArrayList(this.f2820);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo2636();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo2637(Application application, Activity activity);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m2634(jg jgVar) {
        this.f2820.add(jgVar);
    }
}
