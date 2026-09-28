package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class u21 {
    public static final u21 c = new u21(pcn.n(c.d));
    public static final c150 d;
    public static final d150 e;
    public final SparseArray<c> a = new SparseArray<>();
    public final int b;

    public static final class a {
        public static c150 a(r21 r21Var) {
            pcn.b bVar = pcn.b;
            pcn.a aVar = new pcn.a();
            d150 d150Var = u21.e;
            tcn tcnVarE = d150Var.b;
            if (tcnVarE == null) {
                tcnVarE = d150Var.e();
                d150Var.b = tcnVarE;
            }
            lgh0 it = tcnVarE.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= jrh0.r(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(com.twilio.voice.AudioFormat.AUDIO_SAMPLE_RATE_48000).build(), r21Var.a().a)) {
                    aVar.c(num);
                }
            }
            aVar.c(2);
            return aVar.g();
        }

        public static int b(int i, int i2, r21 r21Var) {
            for (int i3 = 10; i3 > 0; i3--) {
                int iS = jrh0.s(i3);
                if (iS != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iS).build(), r21Var.a().a)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    public static final class b {
        public static u21 a(AudioManager audioManager, r21 r21Var) {
            List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(r21Var.a().a);
            HashMap map = new HashMap();
            map.put(2, new HashSet(c0p.p(12)));
            for (int i = 0; i < directProfilesForAttributes.size(); i++) {
                AudioProfile audioProfile = directProfilesForAttributes.get(i);
                if (audioProfile.getEncapsulationType() != 1) {
                    int format = audioProfile.getFormat();
                    if (jrh0.K(format) || u21.e.containsKey(Integer.valueOf(format))) {
                        if (map.containsKey(Integer.valueOf(format))) {
                            Set set = (Set) map.get(Integer.valueOf(format));
                            set.getClass();
                            set.addAll(c0p.p(audioProfile.getChannelMasks()));
                        } else {
                            map.put(Integer.valueOf(format), new HashSet(c0p.p(audioProfile.getChannelMasks())));
                        }
                    }
                }
            }
            pcn.b bVar = pcn.b;
            pcn.a aVar = new pcn.a();
            for (Map.Entry entry : map.entrySet()) {
                aVar.c(new c(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
            }
            return new u21(aVar.g());
        }

        public static x21 b(AudioManager audioManager, r21 r21Var) {
            audioManager.getClass();
            List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(r21Var.a().a);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new x21(audioDevicesForAttributes.get(0));
        }
    }

    static {
        Object[] objArr = {2, 5, 6};
        mby.a(3, objArr);
        d = pcn.i(3, objArr);
        rcn.a aVar = new rcn.a(4);
        aVar.b(5, 6);
        aVar.b(17, 6);
        aVar.b(7, 6);
        aVar.b(30, 10);
        aVar.b(18, 6);
        aVar.b(6, 8);
        aVar.b(8, 8);
        aVar.b(14, 8);
        e = aVar.a();
    }

    public u21(c150 c150Var) {
        for (int i = 0; i < c150Var.d; i++) {
            c cVar = (c) c150Var.get(i);
            this.a.put(cVar.a, cVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, this.a.valueAt(i2).b);
        }
        this.b = iMax;
    }

    public static c150 a(int[] iArr, int i) {
        pcn.b bVar = pcn.b;
        pcn.a aVar = new pcn.a();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            aVar.c(new c(i2, i));
        }
        return aVar.g();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102  */
    public static u21 c(Context context, Intent intent, r21 r21Var, x21 x21Var) {
        AudioManager audioManagerB = g31.b(context);
        if (x21Var == null) {
            x21Var = Build.VERSION.SDK_INT >= 33 ? b.b(audioManagerB, r21Var) : null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (jrh0.N(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return b.a(audioManagerB, r21Var);
        }
        AudioDeviceInfo[] devices = x21Var == null ? audioManagerB.getDevices(2) : new AudioDeviceInfo[]{x21Var.a};
        tcn.a aVar = new tcn.a(4);
        aVar.d(8, 7);
        if (i >= 31) {
            aVar.d(26, 27);
        }
        if (i >= 33) {
            aVar.c(30);
        }
        tcn tcnVarG = aVar.g();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (tcnVarG.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return c;
            }
        }
        tcn.a aVar2 = new tcn.a(4);
        aVar2.c(2);
        if (Build.VERSION.SDK_INT >= 29 && (jrh0.N(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            c150 c150VarA = a.a(r21Var);
            c150VarA.getClass();
            aVar2.e(c150VarA);
            return new u21(a(c0p.t(aVar2.g()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    c150 c150Var = d;
                    c150Var.getClass();
                    aVar2.e(c150Var);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            c150 c150Var2 = d;
            c150Var2.getClass();
            aVar2.e(c150Var2);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new u21(a(c0p.t(aVar2.g()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List<Integer> listP = c0p.p(intArrayExtra);
            listP.getClass();
            aVar2.e(listP);
        }
        return new u21(a(c0p.t(aVar2.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    public final Pair d(r21 r21Var, androidx.media3.common.a aVar) {
        String str = aVar.n;
        str.getClass();
        int iC = gqv.c(str, aVar.k);
        Integer numValueOf = Integer.valueOf(iC);
        d150 d150Var = e;
        if (!d150Var.containsKey(numValueOf)) {
            return null;
        }
        int i = 6;
        SparseArray<c> sparseArray = this.a;
        if (iC == 18 && !jrh0.k(sparseArray, 18)) {
            iC = 6;
        } else if ((iC == 8 && !jrh0.k(sparseArray, 8)) || (iC == 30 && !jrh0.k(sparseArray, 30))) {
            iC = 7;
        }
        if (!jrh0.k(sparseArray, iC)) {
            return null;
        }
        c cVar = sparseArray.get(iC);
        cVar.getClass();
        int iIntValue = cVar.b;
        tcn<Integer> tcnVar = cVar.c;
        int i2 = aVar.F;
        boolean zContains = false;
        if (i2 == -1 || iC == 18) {
            int i3 = aVar.G;
            if (i3 == -1) {
                i3 = com.twilio.voice.AudioFormat.AUDIO_SAMPLE_RATE_48000;
            }
            int i4 = cVar.a;
            if (tcnVar == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    iIntValue = a.b(i4, i3, r21Var);
                } else {
                    Object obj = d150Var.get(Integer.valueOf(i4));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i2 = iIntValue;
        } else if (!aVar.n.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (tcnVar != null) {
                int iS = jrh0.s(i2);
                if (iS != 0) {
                    zContains = tcnVar.contains(Integer.valueOf(iS));
                }
            } else if (i2 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i2 > 10) {
            return null;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 28) {
            i = i2;
        } else if (i2 == 7) {
            i = 8;
        } else if (i2 != 3 && i2 != 4 && i2 != 5) {
            i = i2;
        }
        if (i5 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        int iS2 = jrh0.s(i);
        if (iS2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iC), Integer.valueOf(iS2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u21)) {
            return false;
        }
        u21 u21Var = (u21) obj;
        return jrh0.m(this.a, u21Var.a) && this.b == u21Var.b;
    }

    public final int hashCode() {
        return (jrh0.n(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }

    public static u21 b(Context context, r21 r21Var, x21 x21Var) {
        return c(context, context.registerReceiver(null, new IntentFilter(xOgHBQVl.hUyYSNaewV)), r21Var, x21Var);
    }

    public static final class c {
        public static final c d;
        public final int a;
        public final int b;
        public final tcn<Integer> c;

        static {
            c cVar;
            if (Build.VERSION.SDK_INT >= 33) {
                tcn.a aVar = new tcn.a(4);
                for (int i = 1; i <= 10; i++) {
                    aVar.c(Integer.valueOf(jrh0.s(i)));
                }
                cVar = new c(2, aVar.g());
            } else {
                cVar = new c(2, 10);
            }
            d = cVar;
        }

        public c(int i, Set<Integer> set) {
            this.a = i;
            tcn<Integer> tcnVarK = tcn.k(set);
            this.c = tcnVarK;
            lgh0 it = tcnVarK.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.b = iMax;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && Objects.equals(this.c, cVar.c);
        }

        public final int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            tcn<Integer> tcnVar = this.c;
            return i + (tcnVar == null ? 0 : tcnVar.hashCode());
        }

        public final String toString() {
            return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
        }

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = null;
        }
    }
}
