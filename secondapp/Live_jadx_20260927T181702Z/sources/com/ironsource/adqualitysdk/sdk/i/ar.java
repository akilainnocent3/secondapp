package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.vungle.ads.internal.signals.SignalKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class ar extends AnonymousClass4 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ar f361;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ar$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private JSONObject f362;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ax f363;

        /* JADX INFO: renamed from: く, reason: contains not printable characters */
        public final synchronized JSONObject m472() {
            return this.f362;
        }

        /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
        public final ax m473() {
            return this.f363;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public synchronized void mo474(JSONObject jSONObject) {
            this.f362 = jSONObject;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void m475(ax axVar) {
            this.f363 = axVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends ar {

        /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
        private static int f364 = 1;

        /* JADX INFO: renamed from: リ, reason: contains not printable characters */
        private static char f365 = 5;

        /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
        private static int f366;

        /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
        private static char[] f367 = {'e', 'n', 'v', 'c', 'g', 'l', 't', 's', 'a', 'b', 'd', 'q', 'r', 'k', kj.e.f102543c, 'm', 'o', 'f', 'i', 'h', 'R', 'C', 'p', 'U', 'T'};

        /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
        private static int[] f368 = {-81983579, -2138919679, -2091503318, 1361753917, -1791869496, 2042201685, -849660709, 193592439, 18121261, 1108331668, 557020721, -1451000058, 935243444, -1090763053, -957734026, -1238215441, 1683544758, 378638243};

        /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
        private boolean f369;

        /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
        private boolean f370;

        /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
        private int f371;

        /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
        private boolean f372;

        /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
        private List f373;

        /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
        private al f374;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private ap f375;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private List<av> f376;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private List<av> f377;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private av f378;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private c f379;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private iw f380;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private as f381;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private aq f382;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private au f383;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private Handler f384;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private final int f385;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private final int f386;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private final int f387;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private je f388;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private final int f389;

        public a() {
            super((byte) 0);
            m485("\u0001\u0002£", 3 - View.resolveSize(0, 0), (byte) (46 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern();
            m486(new int[]{1346807643, -110320428}, 4 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
            m485("\u0004\u0000\u0006\u0007", 4 - View.MeasureSpec.getMode(0), (byte) (86 - Color.alpha(0))).intern();
            m485("\u0002\b\u0006\u0007", 4 - ExpandableListView.getPackedPositionGroup(0L), (byte) (Process.getGidForName("") + 62)).intern();
            m486(new int[]{556728592, 2019290960}, 4 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern();
            m485("\t\u0007\u0007\u0005", (ViewConfiguration.getTapTimeout() >> 16) + 4, (byte) ((-16777206) - Color.rgb(0, 0, 0))).intern();
            m486(new int[]{-1424613954, 342081122}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4).intern();
            m485("\b\u0006\u009f", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2, (byte) (TextUtils.indexOf("", "") + 59)).intern();
            m485("\b\t\f\u0006", 4 - TextUtils.indexOf("", ""), (byte) (89 - TextUtils.indexOf("", "", 0))).intern();
            TimeUnit timeUnit = TimeUnit.HOURS;
            timeUnit.toMillis(24L);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            this.f385 = (int) timeUnit2.toMillis(5L);
            this.f389 = (int) timeUnit.toMillis(12L);
            this.f386 = (int) timeUnit2.toMillis(3L);
            this.f387 = (int) timeUnit2.toMillis(10L);
            this.f371 = 0;
            this.f373 = null;
            this.f369 = false;
        }

        /* JADX INFO: renamed from: K, reason: contains not printable characters */
        private synchronized void m476() {
            int i10 = f364 + 69;
            f366 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            Handler handler = this.f384;
            if (handler != null) {
                handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo231() {
                        a.this.m500(true);
                        if (a.m479(a.this) != null) {
                            a.m479(a.this).mo272();
                        }
                        Iterator it = new ArrayList(a.m495(a.this)).iterator();
                        while (it.hasNext()) {
                            ((av) it.next()).mo272();
                        }
                        a.m495(a.this).clear();
                        Iterator it2 = new ArrayList(a.m490(a.this)).iterator();
                        while (it2.hasNext()) {
                            ((av) it2.next()).mo272();
                        }
                    }
                });
                f364 = (f366 + 125) % 128;
            }
        }

        /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
        private JSONObject m477() {
            f366 = (f364 + 125) % 128;
            String strM2592 = this.f388.m2592(m485("\r\u0002\u0015\u0006\u0012\u0013\t\u0013\b\r\u0004\u0012Ú", 13 - Color.argb(0, 0, 0, 0), (byte) (Gravity.getAbsoluteGravity(0, 0) + 117)).intern());
            if (strM2592 != null) {
                try {
                    return new JSONObject(strM2592);
                } catch (JSONException unused) {
                }
            }
            JSONObject jSONObject = new JSONObject();
            int i10 = f366 + 97;
            f364 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 55 / 0;
            }
            return jSONObject;
        }

        /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
        private int m478() {
            int i10 = f366 + 19;
            f364 = i10 % 128;
            int iOptInt = i10 % 2 == 0 ? m472().optInt(m486(new int[]{-1302242163, -58660411}, 5 % ImageFormat.getBitsPerPixel(1)).intern(), 2) : m472().optInt(m486(new int[]{-1302242163, -58660411}, ImageFormat.getBitsPerPixel(0) + 5).intern(), 3);
            int i11 = f366 + 29;
            f364 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 24 / 0;
            }
            return iOptInt;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public static /* synthetic */ av m479(a aVar) {
            int i10 = f366 + 5;
            f364 = i10 % 128;
            int i11 = i10 % 2;
            av avVar = aVar.f378;
            if (i11 == 0) {
                int i12 = 49 / 0;
            }
            return avVar;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public static /* synthetic */ int m480(a aVar) {
            f366 = (f364 + 121) % 128;
            int iM478 = aVar.m478();
            f366 = (f364 + 61) % 128;
            return iM478;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public static /* synthetic */ int m481(a aVar) {
            int i10 = f366;
            f364 = (i10 + 71) % 128;
            int i11 = aVar.f371;
            aVar.f371 = i11 + 1;
            int i12 = i10 + 21;
            f364 = i12 % 128;
            if (i12 % 2 != 0) {
                return i11;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        public static /* synthetic */ Handler m482(a aVar) {
            int i10 = f366 + 29;
            f364 = i10 % 128;
            int i11 = i10 % 2;
            Handler handler = aVar.f384;
            if (i11 == 0) {
                int i12 = 78 / 0;
            }
            return handler;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ je m483(a aVar) {
            int i10 = f364 + 55;
            int i11 = i10 % 128;
            f366 = i11;
            int i12 = i10 % 2;
            je jeVar = aVar.f388;
            if (i12 != 0) {
                throw null;
            }
            int i13 = i11 + 69;
            f364 = i13 % 128;
            if (i13 % 2 != 0) {
                return jeVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ c m484(a aVar) {
            int i10 = (f366 + 75) % 128;
            f364 = i10;
            c cVar = aVar.f379;
            int i11 = i10 + 3;
            f366 = i11 % 128;
            if (i11 % 2 == 0) {
                return cVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ av m488(a aVar, av avVar) {
            int i10 = f364;
            f366 = (i10 + 89) % 128;
            aVar.f378 = avVar;
            f366 = (i10 + 91) % 128;
            return avVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ void m493(a aVar) {
            f366 = (f364 + 79) % 128;
            aVar.m476();
            int i10 = f364 + 25;
            f366 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 15 / 0;
            }
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ List m495(a aVar) {
            int i10 = f366;
            f364 = (i10 + 7) % 128;
            List<av> list = aVar.f376;
            f364 = (i10 + 13) % 128;
            return list;
        }

        /* JADX INFO: renamed from: っ, reason: contains not printable characters */
        public final int m496() {
            JSONObject jSONObjectM472;
            String strM486;
            int i10 = f364 + 7;
            f366 = i10 % 128;
            if (i10 % 2 != 0) {
                jSONObjectM472 = m472();
                strM486 = m486(new int[]{-810661301, -1583971185}, 4 / ExpandableListView.getPackedPositionChild(1L));
            } else {
                jSONObjectM472 = m472();
                strM486 = m486(new int[]{-810661301, -1583971185}, ExpandableListView.getPackedPositionChild(0L) + 4);
            }
            int iOptInt = jSONObjectM472.optInt(strM486.intern(), this.f389);
            f364 = (f366 + 103) % 128;
            return iOptInt;
        }

        /* JADX INFO: renamed from: へ, reason: contains not printable characters */
        public final int m497() {
            f366 = (f364 + 87) % 128;
            int iOptInt = m472().optInt(m485("\u0002\ré", View.MeasureSpec.getMode(0) + 3, (byte) (Color.red(0) + 117)).intern(), this.f385);
            f366 = (f364 + 115) % 128;
            return iOptInt;
        }

        /* JADX INFO: renamed from: ト, reason: contains not printable characters */
        public final synchronized iw m498() {
            iw iwVar;
            try {
                int i10 = f366;
                int i11 = i10 + 73;
                f364 = i11 % 128;
                if (i11 % 2 == 0) {
                    iwVar = this.f380;
                    int i12 = 99 / 0;
                } else {
                    iwVar = this.f380;
                }
                int i13 = i10 + 99;
                f364 = i13 % 128;
                if (i13 % 2 != 0) {
                    return iwVar;
                }
                int i14 = 45 / 0;
                return iwVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: リ */
        public final boolean mo439() {
            f364 = (f366 + 97) % 128;
            boolean zOptBoolean = m472().optBoolean(m486(new int[]{-1424613954, 342081122}, 4 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
            f366 = (f364 + 97) % 128;
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ヮ */
        public final List mo440() {
            if (this.f373 == null) {
                this.f373 = jz.m2760(m472().optJSONArray(m485("\t\u0007\u0007\u0005", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 10)).intern()), new jz.b<ISAdQualityAdType>() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.9
                    @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    public final /* synthetic */ ISAdQualityAdType mo505(JSONArray jSONArray, int i10) {
                        return ISAdQualityAdType.fromInt(jSONArray.optInt(i10));
                    }
                });
                f366 = (f364 + 47) % 128;
            }
            List list = this.f373;
            int i10 = f366 + 79;
            f364 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 5 / 0;
            }
            return list;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ヶ */
        public final int mo441() {
            int iOptInt;
            synchronized (this) {
                iOptInt = m472().optInt(m485("\b\u0006\u009f", 3 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (TextUtils.getOffsetBefore("", 0) + 59)).intern(), 100);
            }
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 丫 */
        public final boolean mo442() {
            f366 = (f364 + 3) % 128;
            boolean zOptBoolean = m472().optBoolean(m485("\b\t\f\u0006", 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (KeyEvent.keyCodeFromString("") + 89)).intern());
            f364 = (f366 + 25) % 128;
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 乁 */
        public final long mo443() {
            String strM2592 = this.f388.m2592(m485("\u0006\u000f\u0002\u0000\r\t\u000b\f\n\t\t\b\u000b\u0001\u0015\u0006\u0002\u0001\u0001\b\u0011\u000b\u0018\u0017\r\u0005\u0005\u0001\u0017\u0013\u0014\u0005\b\u0007\u0005\u0012®", View.resolveSize(0, 0) + 37, (byte) (62 - ((Process.getThreadPriority(0) + 20) >> 6))).intern());
            if (TextUtils.isEmpty(strM2592)) {
                return 0L;
            }
            int i10 = f366 + 105;
            f364 = i10 % 128;
            if (i10 % 2 == 0) {
                Long.parseLong(strM2592);
                throw null;
            }
            long j10 = Long.parseLong(strM2592);
            f364 = (f366 + 97) % 128;
            return j10;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: 爫 */
        public final String mo444() {
            f364 = (f366 + 13) % 128;
            if (m472() == null) {
                return null;
            }
            String strOptString = m472().optString(m486(new int[]{1356438421, 723423256}, 4 - View.MeasureSpec.getSize(0)).intern());
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
            f366 = (f364 + 43) % 128;
            String strM622 = m473().m622();
            f364 = (f366 + 25) % 128;
            return strM622;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﬤ */
        public final int mo445() {
            f364 = (f366 + 83) % 128;
            int iOptInt = m472().optInt(m485("\u0002\b\u0006\u0007", 4 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 61)).intern(), this.f387);
            f366 = (f364 + 51) % 128;
            return iOptInt;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: טּ */
        public final synchronized void mo446() {
            this.f384.removeCallbacksAndMessages(null);
            this.f384 = null;
            t.m2955(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.4
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo231() {
                    a.m495(a.this).clear();
                    a.m490(a.this).clear();
                    a.m488(a.this, (av) null);
                }
            });
            f364 = (f366 + 65) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: סּ */
        public final int mo447() {
            JSONObject jSONObjectM472;
            int trimmedLength;
            byte scrollBarSize;
            int i10 = f364 + 19;
            f366 = i10 % 128;
            if (i10 % 2 != 0) {
                jSONObjectM472 = m472();
                trimmedLength = 3 - TextUtils.getTrimmedLength("");
                scrollBarSize = (byte) (30 % (ViewConfiguration.getScrollBarSize() * 93));
            } else {
                jSONObjectM472 = m472();
                trimmedLength = TextUtils.getTrimmedLength("") + 4;
                scrollBarSize = (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 86);
            }
            return jSONObjectM472.optInt(m485("\u0004\u0000\u0006\u0007", trimmedLength, scrollBarSize).intern(), this.f386);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if ((r2 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            com.ironsource.adqualitysdk.sdk.i.ar.a.f366 = (com.ironsource.adqualitysdk.sdk.i.ar.a.f364 + 105) % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        
            if (m473() != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        
            if (m473() != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        
            r0 = m473().m621();
            r2 = com.ironsource.adqualitysdk.sdk.i.ar.a.f364 + 77;
            com.ironsource.adqualitysdk.sdk.i.ar.a.f366 = r2 % 128;
         */
        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ףּ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final org.json.JSONObject mo448() {
            /*
                r4 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.ar.a.f366
                int r0 = r0 + 101
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.ar.a.f364 = r1
                int r0 = r0 % 2
                r1 = 0
                if (r0 != 0) goto L18
                com.ironsource.adqualitysdk.sdk.i.ax r0 = r4.m473()
                r2 = 20
                int r2 = r2 / 0
                if (r0 == 0) goto L34
                goto L1e
            L18:
                com.ironsource.adqualitysdk.sdk.i.ax r0 = r4.m473()
                if (r0 == 0) goto L34
            L1e:
                com.ironsource.adqualitysdk.sdk.i.ax r0 = r4.m473()
                org.json.JSONObject r0 = r0.m621()
                int r2 = com.ironsource.adqualitysdk.sdk.i.ar.a.f364
                int r2 = r2 + 77
                int r3 = r2 % 128
                com.ironsource.adqualitysdk.sdk.i.ar.a.f366 = r3
                int r2 = r2 % 2
                if (r2 != 0) goto L33
                return r0
            L33:
                throw r1
            L34:
                int r0 = com.ironsource.adqualitysdk.sdk.i.ar.a.f364
                int r0 = r0 + 105
                int r0 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.ar.a.f366 = r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ar.a.mo448():org.json.JSONObject");
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭖ */
        public final au mo449() {
            int i10 = f364 + 55;
            f366 = i10 % 128;
            if (i10 % 2 == 0) {
                return this.f383;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭴ */
        public final ap mo450() {
            int i10 = (f366 + 99) % 128;
            f364 = i10;
            ap apVar = this.f375;
            f366 = (i10 + 11) % 128;
            return apVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﭸ */
        public final as mo451() {
            int i10 = f366;
            int i11 = i10 + 49;
            f364 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            as asVar = this.f381;
            int i12 = i10 + SignalKey.EVENT_ID;
            f364 = i12 % 128;
            if (i12 % 2 != 0) {
                return asVar;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮉ */
        public final aq mo452() {
            int i10 = f366 + 121;
            int i11 = i10 % 128;
            f364 = i11;
            if (i10 % 2 == 0) {
                throw null;
            }
            aq aqVar = this.f382;
            f366 = (i11 + SignalKey.EVENT_ID) % 128;
            return aqVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮌ */
        public final String mo453() {
            JSONObject jSONObjectM472;
            int tapTimeout;
            int mode;
            int i10 = f364 + 13;
            f366 = i10 % 128;
            if (i10 % 2 != 0) {
                jSONObjectM472 = m472();
                tapTimeout = (ViewConfiguration.getTapTimeout() << 125) * 3;
                mode = 70 - View.MeasureSpec.getMode(0);
            } else {
                jSONObjectM472 = m472();
                tapTimeout = 3 - (ViewConfiguration.getTapTimeout() >> 16);
                mode = View.MeasureSpec.getMode(0) + 45;
            }
            String strOptString = jSONObjectM472.optString(m485("\u0001\u0002£", tapTimeout, (byte) mode).intern());
            int i11 = f366 + 83;
            f364 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 17 / 0;
            }
            return strOptString;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﱟ */
        public final boolean mo455() {
            int i10 = (f364 + 33) % 128;
            f366 = i10;
            boolean z10 = this.f370;
            int i11 = i10 + 19;
            f364 = i11 % 128;
            if (i11 % 2 != 0) {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ void m487(JSONObject jSONObject, long j10) {
            int i10 = f364 + 27;
            f366 = i10 % 128;
            int i11 = i10 % 2;
            m491(jSONObject, j10);
            if (i11 != 0) {
                throw null;
            }
            int i12 = f364 + 5;
            f366 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ List m490(a aVar) {
            int i10 = f364 + 83;
            int i11 = i10 % 128;
            f366 = i11;
            int i12 = i10 % 2;
            List<av> list = aVar.f377;
            if (i12 != 0) {
                throw null;
            }
            f364 = (i11 + 57) % 128;
            return list;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﮐ */
        public final double mo454() {
            JSONObject jSONObjectM472;
            String strM486;
            int i10 = f366 + 113;
            f364 = i10 % 128;
            if (i10 % 2 == 0) {
                jSONObjectM472 = m472();
                strM486 = m486(new int[]{556728592, 2019290960}, 5 >>> TextUtils.getCapsMode("", 0, 0));
            } else {
                jSONObjectM472 = m472();
                strM486 = m486(new int[]{556728592, 2019290960}, TextUtils.getCapsMode("", 0, 0) + 4);
            }
            return jSONObjectM472.optDouble(strM486.intern(), 1.0d);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﱡ */
        public final double mo456() {
            f366 = (f364 + 89) % 128;
            double dOptDouble = m472().optDouble(m485("\u0005\u0001ì", 3 - (ViewConfiguration.getTapTimeout() >> 16), (byte) (124 - View.resolveSizeAndState(0, 0, 0))).intern(), 5.0d);
            int i10 = f366 + 73;
            f364 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 36 / 0;
            }
            return dOptDouble;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﺙ */
        public final int mo457() {
            int iM623;
            ax axVarM473 = m473();
            if (axVarM473 != null) {
                int i10 = f366 + 23;
                f364 = i10 % 128;
                if (i10 % 2 == 0) {
                    iM623 = axVarM473.m623();
                    int i11 = 30 / 0;
                } else {
                    iM623 = axVarM473.m623();
                }
            } else {
                iM623 = 3000;
            }
            int i12 = f366 + 17;
            f364 = i12 % 128;
            if (i12 % 2 != 0) {
                return iM623;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻏ */
        public final synchronized boolean mo458() {
            int i10 = (f364 + 101) % 128;
            f366 = i10;
            boolean z10 = this.f372;
            int i11 = i10 + 105;
            f364 = i11 % 128;
            if (i11 % 2 != 0) {
                return z10;
            }
            int i12 = 70 / 0;
            return z10;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻐ */
        public final boolean mo459() {
            JSONObject jSONObjectM472;
            String strM486;
            int i10 = f364 + 33;
            f366 = i10 % 128;
            if (i10 % 2 != 0) {
                jSONObjectM472 = m472();
                strM486 = m486(new int[]{-1481378087, -1826599106}, 2 / Gravity.getAbsoluteGravity(0, 0));
            } else {
                jSONObjectM472 = m472();
                strM486 = m486(new int[]{-1481378087, -1826599106}, 3 - Gravity.getAbsoluteGravity(0, 0));
            }
            boolean zOptBoolean = jSONObjectM472.optBoolean(strM486.intern(), false);
            f364 = (f366 + 7) % 128;
            return zOptBoolean;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final void mo467(final av avVar) {
            f364 = (f366 + 91) % 128;
            Handler handler = this.f384;
            if (handler != null) {
                handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.7
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo231() {
                        if (a.this.mo458()) {
                            avVar.mo272();
                        } else {
                            a.m495(a.this).add(avVar);
                        }
                    }
                });
                f364 = (f366 + 29) % 128;
            }
            int i10 = f364 + 91;
            f366 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final synchronized void m500(boolean z10) {
            try {
                int i10 = f366 + 11;
                int i11 = i10 % 128;
                f364 = i11;
                try {
                    if (i10 % 2 == 0) {
                        this.f372 = z10;
                        throw null;
                    }
                    this.f372 = z10;
                    int i12 = i11 + 79;
                    f366 = i12 % 128;
                    if (i12 % 2 != 0) {
                        throw null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar.AnonymousClass4
        /* JADX INFO: renamed from: ﻛ */
        public final synchronized void mo474(JSONObject jSONObject) {
            try {
                if (m492(jSONObject)) {
                    int i10 = f366 + 65;
                    f364 = i10 % 128;
                    if (i10 % 2 == 0) {
                        m494(jSONObject);
                        throw null;
                    }
                    m494(jSONObject);
                    throw th;
                }
                super.mo474(jSONObject);
                this.f383.mo474(jSONObject);
                this.f381.mo474(jSONObject);
                this.f382.mo474(jSONObject);
                this.f375.mo474(jSONObject);
                int i11 = f366 + 27;
                f364 = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ｋ */
        public final void mo464(Context context, iw iwVar, al alVar, c cVar, boolean z10) {
            this.f388 = new je(context, m485("\u0007\u000b\r\b\u0004\u0005\r\b\u000e\n\f\u0003\n\u000b\u000e\u0013\n\u0002\u0010\u0011\u0005\u0001\u0001\u0012\u0002\u0010\u0013\u0003", 27 - ExpandableListView.getPackedPositionChild(0L), (byte) (View.MeasureSpec.getMode(0) + 72)).intern(), m486(new int[]{-428506525, -193480751, 2108206326, -1894586225, 1815068023, 1149962225, 515620675, -1355112994, 831061069, -123686041}, 20 - KeyEvent.normalizeMetaState(0)).intern());
            this.f380 = iwVar;
            this.f372 = false;
            this.f370 = z10;
            this.f374 = alVar;
            this.f384 = new Handler(Looper.getMainLooper());
            ax axVar = new ax();
            this.f383 = new au(axVar);
            this.f381 = new as(axVar);
            this.f382 = new aq(axVar);
            this.f375 = new ap();
            mo474(m477());
            m475(axVar);
            this.f379 = cVar;
            this.f376 = new ArrayList();
            this.f377 = new ArrayList();
            int i10 = f364 + 43;
            f366 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final void mo470(JSONObject jSONObject) {
            f366 = (f364 + 105) % 128;
            mo474(jSONObject);
            m476();
            f364 = (f366 + 95) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final boolean mo468(String str, String str2) {
            f366 = (f364 + 113) % 128;
            aw awVarM489 = m489(str);
            if (awVarM489 != null && awVarM489.m613(str2)) {
                return false;
            }
            f364 = (f366 + 119) % 128;
            return true;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final void mo469(final av avVar) {
            f366 = (f364 + 49) % 128;
            Handler handler = this.f384;
            if (handler != null) {
                handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.8
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo231() {
                        a.m488(a.this, avVar);
                        if (a.this.mo458()) {
                            avVar.mo272();
                        }
                    }
                });
                f366 = (f364 + 75) % 128;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾇ */
        public final String mo466(String str) {
            aw awVarM489 = m489(str);
            if (awVarM489 == null) {
                return null;
            }
            f366 = (f364 + 33) % 128;
            String strM612 = awVarM489.m612();
            int i10 = f366 + 53;
            f364 = i10 % 128;
            if (i10 % 2 != 0) {
                return strM612;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﾒ */
        public final boolean mo471() {
            f366 = (f364 + 55) % 128;
            boolean zOptBoolean = m472().optBoolean(m486(new int[]{-1202225691, -1025302518}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3).intern(), true);
            f364 = (f366 + 25) % 128;
            return zOptBoolean;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void m499(long j10) {
            int i10 = f366 + 65;
            f364 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (!this.f369) {
                this.f388.m2596(m485("\u0006\u000f\u0002\u0000\r\t\u000b\f\n\t\t\b\u000b\u0001\u0015\u0006\u0002\u0001\u0001\b\u0011\u000b\u0018\u0017\r\u0005\u0005\u0001\u0017\u0013\u0014\u0005\b\u0007\u0005\u0012®", 37 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (62 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern(), String.valueOf(j10));
                this.f369 = true;
            }
            int i11 = f364 + 99;
            f366 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static void m494(JSONObject jSONObject) {
            f366 = (f364 + 69) % 128;
            jz.m2750(jSONObject, jSONObject.optJSONObject(m485("\u0007\u000b\r\u0017\u0007\b", AndroidCharacter.getMirror('0') - '*', (byte) (7 - Color.argb(0, 0, 0, 0))).intern()));
            f364 = (f366 + 85) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo463(iz izVar) {
            f364 = (f366 + 39) % 128;
            m473().m625(izVar);
            int i10 = f364 + 113;
            f366 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo461(final Context context, final ao aoVar, boolean z10) {
            f364 = (f366 + 113) % 128;
            if (z10) {
                t.m2949(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo231() {
                        if (!a.this.m498().m2497().m2485()) {
                            a.m484(a.this).mo507();
                        } else {
                            if (a.this.mo458()) {
                                return;
                            }
                            a.m484(a.this).mo506();
                        }
                    }
                }, ar.m438().mo447());
            }
            m500(false);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject = new jq(context, aoVar, mo443()).mo359(new JSONObject(), m498().m2497().m2485(), true, false);
                f366 = (f364 + 49) % 128;
            } catch (JSONException e10) {
                k.m2785(m485("\u0000\u0005\u0010\u0011\u0005\u0001\u0001\u0015\u0002\u0010\u0013\u0003", View.MeasureSpec.getMode(0) + 12, (byte) (44 - TextUtils.getOffsetAfter("", 0))).intern(), m486(new int[]{1461733317, 1044056902, -518746095, 635703919, 1515719867, -1711267859, -1048964546, 160505427, -1977465801, 738556905, 1081323132, -1630142639, -138943661, 230175536}, Color.green(0) + 25).intern(), e10);
            }
            m498().m2495(this.f374.m391(m485("\u0010\u0003\u0010\b", 4 - View.combineMeasuredStates(0, 0), (byte) (TextUtils.indexOf("", "") + 2)).intern()), jSONObject, new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.3

                /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
                private static int f393 = 1;

                /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
                private static short[] f394 = null;

                /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
                private static int f395 = 0;

                /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
                private static byte[] f396 = {86, 123, -122, 125, 122, -119, l3.a.f103476t7, 57, 122, 106, -120, -127, -121, 123, 118, -41, 34, -120, -123, 114, -118, 118, -123, -117, -121, -123, 107, -89, f6.q.f83619w, -102, -88, 80, 87, -85, 96, -110, -85, 86, -83, -86, 89, -92, 10, 43, 5, l3.a.f103436o7, 34, l3.a.f103493v7, l3.a.f103436o7, 63, -98, 126, 51, 48, l3.a.f103444p7, -117, 116, 51, l3.a.f103529z7, 53, 50, l3.a.f103444p7, -114, 116, 52, -56, 56, l3.a.f103520y7, l3.a.f103452q7, 51, -118, 99, l3.a.f103529z7, 48, l3.a.f103520y7, -32, 0, 0, 0, 0, 0};

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static int f397 = 117819832;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static int f398 = 17;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static char f399 = 25698;

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static int f400 = -847945897;

                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                private static char f401 = 8251;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static char f402 = 37973;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static char f403 = 31241;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private void m502(int i10) {
                    synchronized (a.this) {
                        try {
                            if (a.m482(a.this) != null) {
                                t.m2951(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.3.3
                                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                    /* JADX INFO: renamed from: ﾒ */
                                    public final void mo231() {
                                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                        a.this.mo461(context, aoVar, false);
                                    }
                                }, i10);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m503(int i10, short s10, int i11, byte b10, int i12) {
                    String string;
                    synchronized (o.f2993) {
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            int i13 = f398;
                            int i14 = i12 + i13;
                            int i15 = i14 == -1 ? 1 : 0;
                            if (i15 != 0) {
                                byte[] bArr = f396;
                                i14 = bArr != null ? (byte) (bArr[f397 + i10] + i13) : (short) (f394[f397 + i10] + i13);
                            }
                            if (i14 > 0) {
                                o.f2994 = ((i10 + i14) - 2) + f397 + i15;
                                o.f2995 = b10;
                                char c10 = (char) (i11 + f400);
                                o.f2997 = c10;
                                sb2.append(c10);
                                o.f2996 = o.f2997;
                                o.f2998 = 1;
                                while (o.f2998 < i14) {
                                    byte[] bArr2 = f396;
                                    if (bArr2 != null) {
                                        int i16 = o.f2994;
                                        o.f2994 = i16 - 1;
                                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i16] + s10)) ^ o.f2995));
                                    } else {
                                        short[] sArr = f394;
                                        int i17 = o.f2994;
                                        o.f2994 = i17 - 1;
                                        o.f2997 = (char) (o.f2996 + (((short) (sArr[i17] + s10)) ^ o.f2995));
                                    }
                                    sb2.append(o.f2997);
                                    o.f2996 = o.f2997;
                                    o.f2998++;
                                }
                            }
                            string = sb2.toString();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return string;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻐ */
                public final void mo342(iq iqVar) {
                    try {
                        int iM2472 = iqVar.m2469().m2472();
                        String strM2473 = iqVar.m2469().m2473();
                        if (iM2472 >= 200) {
                            f395 = (f393 + 103) % 128;
                            if (iM2472 <= 299) {
                                JSONObject jSONObjectM2468 = iqVar.m2468();
                                if (jSONObjectM2468.optBoolean(m501("¦ﺧ䧢谖", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3).intern())) {
                                    int i10 = f393 + 61;
                                    f395 = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        s.m2906().m2936();
                                        throw null;
                                    }
                                    s.m2906().m2936();
                                }
                                k.m2766(m501("ⴢ玠㇎躦ﾉ햄䋫ᵰ劺\uf40a\udd9eᢪ", 12 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), m503((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 117819833, (short) (ViewConfiguration.getEdgeSlop() >> 16), 847945980 - (Process.myPid() >> 22), (byte) ((-123) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 12 - KeyEvent.normalizeMetaState(0)).intern(), jSONObjectM2468);
                                JSONObject jSONObjectM2749 = jz.m2749(jSONObjectM2468);
                                a.this.m499(jSONObjectM2749.optLong(m501("鱨₰\udacb㍧", Color.rgb(0, 0, 0) + 16777220).intern(), 0L));
                                jSONObjectM2749.remove(m503(((Process.getThreadPriority(0) + 20) >> 6) - 117819804, (short) View.getDefaultSize(0, 0), View.resolveSizeAndState(0, 0, 0) + 847946012, (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 101), (-15) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
                                a.m483(a.this).m2590(m503((-117819802) - ExpandableListView.getPackedPositionType(0L), (short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 847946010 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (85 - Color.blue(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 4).intern(), jSONObjectM2749.toString(), null);
                                jSONObjectM2468.put(m503((-117819790) - (Process.myTid() >> 22), (short) Color.argb(0, 0, 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 847946013, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 12), (-15) - (Process.myTid() >> 22)).intern(), jx.m2735());
                                jSONObjectM2468.put(m501("鰏㋷", 2 - TextUtils.indexOf("", "", 0, 0)).intern(), jx.m2733());
                                a.m487(jSONObjectM2468, iqVar.m2470());
                                a.this.mo474(jSONObjectM2468);
                                a.m493(a.this);
                                m502(a.this.m496());
                                return;
                            }
                        }
                        mo343(iqVar, strM2473);
                        int i11 = f395 + 111;
                        f393 = i11 % 128;
                        if (i11 % 2 == 0) {
                            throw null;
                        }
                    } catch (Exception e11) {
                        kd.m2834(m501("ⴢ玠㇎躦ﾉ햄䋫ᵰ劺\uf40a\udd9eᢪ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12).intern(), m501("ᶒ绽῞\ud964渀蠯䬺灁鑋괷蟾\uf6bd䦛狓嗇딳㇎躦ﾉ햄蝙헊뽶줫ӵ\udab6䦛狓涬\ude16뽶줫", View.resolveSize(0, 0) + 32).intern(), (Throwable) e11, false, true);
                    }
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻐ */
                public final void mo343(iq iqVar, String str) {
                    int iM2472;
                    if (iqVar != null) {
                        f393 = (f395 + 21) % 128;
                        iM2472 = iqVar.m2469().m2472();
                    } else {
                        f395 = (f393 + 117) % 128;
                        iM2472 = -1;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m503((-117819790) - TextUtils.lastIndexOf("", '0', 0, 0), (short) ((Process.getThreadPriority(0) + 20) >> 6), 847945966 - TextUtils.getOffsetAfter("", 0), (byte) ((-51) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.indexOf("", "") + 17).intern());
                    sb2.append(iM2472);
                    k.m2769(m501("ⴢ玠㇎躦ﾉ햄䋫ᵰ劺\uf40a\udd9eᢪ", 12 - ExpandableListView.getPackedPositionGroup(0L)).intern(), sb2.toString());
                    if (iM2472 != 403) {
                        f393 = (f395 + 99) % 128;
                        if (a.m481(a.this) < a.m480(a.this)) {
                            m502(a.this.m497());
                        }
                    }
                }

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static String m501(String str, int i10) {
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
                                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f399)) ^ ((c11 >>> 5) + f401)));
                                        cArr3[1] = c12;
                                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f403) ^ ((c12 + i12) ^ ((c12 << 4) + f402))));
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
            });
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ｋ */
        public final boolean mo465() {
            JSONObject jSONObjectM472;
            String strIntern;
            boolean z10;
            int i10 = f364 + 25;
            f366 = i10 % 128;
            if (i10 % 2 != 0) {
                jSONObjectM472 = m472();
                strIntern = m486(new int[]{626012635, -1984863808}, 2 % (KeyEvent.getMaxKeyCode() >>> 25)).intern();
                z10 = false;
            } else {
                jSONObjectM472 = m472();
                strIntern = m486(new int[]{626012635, -1984863808}, (KeyEvent.getMaxKeyCode() >> 16) + 4).intern();
                z10 = true;
            }
            return jSONObjectM472.optBoolean(strIntern, z10);
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static void m491(JSONObject jSONObject, long j10) {
            if (jSONObject.has(m486(new int[]{-712133822, -224733627}, 3 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                int i10 = f364 + 63;
                f366 = i10 % 128;
                try {
                    if (i10 % 2 != 0) {
                        jSONObject.put(m486(new int[]{-712133822, -224733627}, TextUtils.getCapsMode("", 0, 0) * 2).intern(), (j10 / 2) | jSONObject.optLong(m486(new int[]{-712133822, -224733627}, 5 / Color.green(1)).intern()));
                    } else {
                        jSONObject.put(m486(new int[]{-712133822, -224733627}, 3 - TextUtils.getCapsMode("", 0, 0)).intern(), jSONObject.optLong(m486(new int[]{-712133822, -224733627}, Color.green(0) + 3).intern()) + (j10 / 2));
                    }
                    int i11 = f364 + 91;
                    f366 = i11 % 128;
                    if (i11 % 2 != 0) {
                        throw null;
                    }
                    return;
                } catch (JSONException unused) {
                }
            }
            int i12 = f364 + 31;
            f366 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 31 / 0;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final void mo462(final av avVar) {
            int i10 = f366 + 17;
            f364 = i10 % 128;
            if (i10 % 2 != 0) {
                Handler handler = this.f384;
                if (handler != null) {
                    handler.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo231() {
                            a.m490(a.this).add(avVar);
                            if (a.this.mo458()) {
                                avVar.mo272();
                            }
                        }
                    });
                }
                f364 = (f366 + 1) % 128;
                return;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static boolean m492(JSONObject jSONObject) {
            int iNormalizeMetaState;
            int i10;
            int i11 = f366 + 121;
            f364 = i11 % 128;
            if (i11 % 2 == 0) {
                iNormalizeMetaState = KeyEvent.normalizeMetaState(1) * 49;
                i10 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            } else {
                iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 6;
                i10 = 8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            }
            boolean zHas = jSONObject.has(m485("\u0007\u000b\r\u0017\u0007\b", iNormalizeMetaState, (byte) i10).intern());
            int i12 = f364 + 103;
            f366 = i12 % 128;
            if (i12 % 2 == 0) {
                return zHas;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private aw m489(String str) {
            int i10 = f366;
            int i11 = i10 + 99;
            int i12 = i11 % 128;
            f364 = i12;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (str != null) {
                int i13 = i10 + 89;
                f364 = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 27 / 0;
                    return mo460().get(str);
                }
                return mo460().get(str);
            }
            int i15 = i12 + 5;
            f366 = i15 % 128;
            if (i15 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ar
        /* JADX INFO: renamed from: ﻛ */
        public final Map<String, aw> mo460() {
            Map<String, aw> map = new HashMap<>();
            try {
                String strOptString = m472().optString(m485("\r\u0000î", 3 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (KeyEvent.keyCodeFromString("") + 123)).intern());
                if (!TextUtils.isEmpty(strOptString)) {
                    map = jz.m2752(new JSONObject(strOptString), new jz.c<aw>() { // from class: com.ironsource.adqualitysdk.sdk.i.ar.a.6
                        @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        public final /* synthetic */ aw mo504(JSONObject jSONObject, String str) {
                            return new aw(jSONObject.optJSONObject(str));
                        }
                    });
                }
                f366 = (f364 + 9) % 128;
                return map;
            } catch (JSONException e10) {
                kd.m2827(m485("\u0000\u0005\u0010\u0011\u0005\u0001\u0001\u0015\u0002\u0010\u0013\u0003", AndroidCharacter.getMirror('0') - '$', (byte) (43 - MotionEvent.axisFromString(""))).intern(), m486(new int[]{1461733317, 1044056902, 428215858, -1961072058, -65074011, -1059125625, 1581561942, -1481391031, -157161790, -1026405494, -2084764877, 218133828, -2117089186, 682257840, 1457645334, 2131892427}, (ViewConfiguration.getTouchSlop() >> 8) + 31).intern(), e10, false);
                return map;
            }
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m485(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2129) {
                try {
                    char[] cArr2 = f367;
                    char c10 = f365;
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

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m486(int[] iArr, int i10) {
            String str;
            synchronized (e.f1912) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f368.clone();
                    e.f1913 = 0;
                    while (true) {
                        int i11 = e.f1913;
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
                            e.f1915 = (c10 << 16) + c11;
                            e.f1914 = (c12 << 16) + c13;
                            e.m2090(iArr2);
                            for (int i13 = 0; i13 < 16; i13++) {
                                int i14 = e.f1915 ^ iArr2[i13];
                                e.f1915 = i14;
                                e.f1914 = e.m2089(i14) ^ e.f1914;
                                int i15 = e.f1915;
                                e.f1915 = e.f1914;
                                e.f1914 = i15;
                            }
                            int i16 = e.f1915;
                            e.f1915 = e.f1914;
                            e.f1914 = i16;
                            e.f1914 = i16 ^ iArr2[16];
                            e.f1915 ^= iArr2[17];
                            int i17 = e.f1914;
                            int i18 = e.f1915;
                            cArr[0] = (char) (i18 >>> 16);
                            cArr[1] = (char) i18;
                            int i19 = e.f1914;
                            cArr[2] = (char) (i19 >>> 16);
                            cArr[3] = (char) i19;
                            e.m2090(iArr2);
                            int i20 = e.f1913;
                            cArr2[i20 << 1] = cArr[0];
                            cArr2[(i20 << 1) + 1] = cArr[1];
                            cArr2[(i20 << 1) + 2] = cArr[2];
                            cArr2[(i20 << 1) + 3] = cArr[3];
                            e.f1913 = i20 + 2;
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
    public interface c {
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        void mo506();

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        void mo507();
    }

    public /* synthetic */ ar(byte b10) {
        this();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized ar m438() {
        try {
            if (f361 == null) {
                f361 = new a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f361;
    }

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public abstract boolean mo439();

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public abstract List mo440();

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public abstract int mo441();

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public abstract boolean mo442();

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public abstract long mo443();

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public abstract String mo444();

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public abstract int mo445();

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public abstract void mo446();

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public abstract int mo447();

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public abstract JSONObject mo448();

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public abstract au mo449();

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public abstract ap mo450();

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public abstract as mo451();

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public abstract aq mo452();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public abstract String mo453();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public abstract double mo454();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public abstract boolean mo455();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public abstract double mo456();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public abstract int mo457();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public abstract boolean mo458();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract boolean mo459();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract Map<String, aw> mo460();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo461(Context context, ao aoVar, boolean z10);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo462(av avVar);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo463(iz izVar);

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public abstract void mo464(Context context, iw iwVar, al alVar, c cVar, boolean z10);

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public abstract boolean mo465();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract String mo466(String str);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract void mo467(av avVar);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo468(String str, String str2);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo469(av avVar);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo470(JSONObject jSONObject);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo471();

    private ar() {
    }
}
