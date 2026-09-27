package yads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.util.Base64;
import android.util.Pair;
import com.ironsource.C4235d4;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class uk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final uk f156475c = new uk(8, new int[]{2});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uk f156476d = new uk(8, new int[]{2, 5, 6});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final xm2 f156477e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f156478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f156479b;

    static {
        q51 q51VarA = new q51(4).a(5, 6).a(17, 6).a(7, 6).a(18, 6).a(6, 8).a(8, 8).a(14, 8);
        f156477e = xm2.a(q51VarA.f154274b, q51VarA.f154273a);
    }

    public uk(int i10, int[] iArr) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f156478a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f156478a = new int[0];
        }
        this.f156479b = i10;
    }

    public static uk a(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i10 = ib3.f150516a;
        if (i10 >= 17) {
            byte[] bArrDecode = Base64.decode("QW1hem9u", 0);
            Charset charset = cv.g.f77202b;
            String str = new String(bArrDecode, charset);
            String str2 = ib3.f150518c;
            if ((str.equals(str2) || new String(Base64.decode("WGlhb21p", 0), charset).equals(str2)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return f156476d;
            }
        }
        if (i10 >= 29 && (ib3.d(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature(androidx.mediarouter.app.a.f17700h)))) {
            return new uk(8, tk.a());
        }
        if (intentRegisterReceiver == null || intentRegisterReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f156475c;
        }
        return new uk(intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8), intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk)) {
            return false;
        }
        uk ukVar = (uk) obj;
        return Arrays.equals(this.f156478a, ukVar.f156478a) && this.f156479b == ukVar.f156479b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f156478a) * 31) + this.f156479b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f156479b + ", supportedEncodings=" + Arrays.toString(this.f156478a) + C4235d4.j.f61462e;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    public final Pair a(mx0 mx0Var) {
        String str = mx0Var.f152729m;
        str.getClass();
        int iB = ht1.b(str, mx0Var.f152726j);
        xm2 xm2Var = f156477e;
        if (!xm2Var.containsKey(Integer.valueOf(iB))) {
            return null;
        }
        int i10 = 6;
        if (iB == 18 && Arrays.binarySearch(this.f156478a, 18) < 0) {
            iB = 6;
        } else if (iB == 8 && Arrays.binarySearch(this.f156478a, 8) < 0) {
            iB = 7;
        }
        if (Arrays.binarySearch(this.f156478a, iB) < 0) {
            return null;
        }
        int iIntValue = mx0Var.f152742z;
        if (iIntValue != -1 && iB != 18) {
            if (iIntValue > this.f156479b) {
                return null;
            }
        } else {
            int i11 = mx0Var.A;
            if (i11 == -1) {
                i11 = 48000;
            }
            if (ib3.f150516a >= 29) {
                iIntValue = tk.a(iB, i11);
            } else {
                Object obj = xm2Var.get(Integer.valueOf(iB));
                iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
            }
        }
        int i12 = ib3.f150516a;
        if (i12 > 28) {
            i10 = iIntValue;
        } else if (iIntValue == 7) {
            i10 = 8;
        } else if (iIntValue != 3 && iIntValue != 4 && iIntValue != 5) {
            i10 = iIntValue;
        }
        if (i12 <= 26 && pk2.f153971d.a().equals(ib3.f150517b) && i10 == 1) {
            i10 = 2;
        }
        int iA = ib3.a(i10);
        if (iA == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iB), Integer.valueOf(iA));
    }
}
