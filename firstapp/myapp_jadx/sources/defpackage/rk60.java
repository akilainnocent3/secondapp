package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import com.sportybet.android.gp.tz.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class rk60 {
    public static final HashMap<String, b> n = kpu.d(new Pair("Sporty Hero", b.f), new Pair("Even Odd", b.d), new Pair("Red-Black", b.c), new Pair("Spin da' Bottle", b.e), new Pair("Spin Match", b.v), new Pair("Spin-to-win", b.y), new Pair("Fruit Hunt", b.w), new Pair("pocket rocket", b.z), new Pair("ping pong", b.A), new Pair("Sporty Jet", b.B), new Pair("Galaxy Go", b.C), new Pair("Sporty Kick", b.D), new Pair("Sporty Cars", b.H), new Pair("One Punch", b.E), new Pair("Crazy Rider", b.F), new Pair("Sporty Skills", b.G));
    public final Context a;
    public final String b;
    public final HashMap<String, a> c;
    public boolean d;
    public final ArrayList e;
    public final SoundPool f;
    public String g;
    public final HashMap<Integer, Integer> h;
    public MediaPlayer i;
    public String j;
    public String k;
    public jvd0 l;
    public final SharedPreferences m;

    public static final class a {
        public final String a;
        public final String b;
        public boolean c;
        public final b d;
        public Integer e;
        public final Integer f;

        public a(String str, String str2, boolean z, b bVar, Integer num) {
            str.getClass();
            str2.getClass();
            bVar.getClass();
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = bVar;
            this.e = -1;
            this.f = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && Intrinsics.g(this.e, aVar.e) && Intrinsics.g(this.f, aVar.f);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
            Integer num = this.e;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            boolean z = this.c;
            Integer num = this.e;
            StringBuilder sbA = ux5.a("SoundFile(fileurl=", this.a, ", fileName=", this.b, ", isDownloaded=");
            sbA.append(z);
            sbA.append(", fileType=");
            sbA.append(this.d);
            sbA.append(", soundPoolIndex=");
            sbA.append(num);
            sbA.append(", soundFileId=");
            sbA.append(this.f);
            sbA.append(")");
            return sbA.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b A;
        public static final b B;
        public static final b C;
        public static final b D;
        public static final b E;
        public static final b F;
        public static final b G;
        public static final b H;
        public static final /* synthetic */ b[] I;
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b i;
        public static final b v;
        public static final b w;
        public static final b y;
        public static final b z;

        static {
            b bVar = new b("CORE", 0);
            a = bVar;
            b bVar2 = new b("COMMON", 1);
            b = bVar2;
            b bVar3 = new b("REDBLACK", 2);
            c = bVar3;
            b bVar4 = new b("EVENODD", 3);
            d = bVar4;
            b bVar5 = new b("BOTTLE", 4);
            e = bVar5;
            b bVar6 = new b("Hero", 5);
            f = bVar6;
            b bVar7 = new b("RUSH", 6);
            i = bVar7;
            b bVar8 = new b("SPINMATCH", 7);
            v = bVar8;
            b bVar9 = new b("FRUIT_HUNT", 8);
            w = bVar9;
            b bVar10 = new b("SPIN2WIN", 9);
            y = bVar10;
            b bVar11 = new b("POCKETROCKET", 10);
            z = bVar11;
            b bVar12 = new b("PINGPONG", 11);
            A = bVar12;
            b bVar13 = new b("SPORTYJET", 12);
            B = bVar13;
            b bVar14 = new b("GALAXYGO", 13);
            C = bVar14;
            b bVar15 = new b("SPORTYKICK", 14);
            D = bVar15;
            b bVar16 = new b("ONEPUNCH", 15);
            E = bVar16;
            b bVar17 = new b("CRAZYRIDER", 16);
            F = bVar17;
            b bVar18 = new b("SPORTYSKILLS", 17);
            G = bVar18;
            b bVar19 = new b("SPORTYCAR", 18);
            H = bVar19;
            I = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) I.clone();
        }
    }

    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                b bVar = b.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public rk60(Context context, String str, HashMap map, boolean z) {
        str.getClass();
        this.a = context;
        this.b = str;
        this.c = map;
        this.d = z;
        this.e = new ArrayList();
        this.h = new HashMap<>();
        a aVar = new a("soundToggle", "soundToggle", true, b.a, Integer.valueOf(R.raw.sound_toggle));
        if (context != null) {
            this.m = un20.a(context);
        }
        map.put("soundToggle", aVar);
        SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(6).setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build()).build();
        soundPoolBuild.getClass();
        this.f = soundPoolBuild;
        final pk60 pk60Var = new pk60(this);
        soundPoolBuild.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: qk60
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
                pk60Var.invoke(soundPool, Integer.valueOf(i), Integer.valueOf(i2));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(a aVar, x1b x1bVar) {
        sk60 sk60Var;
        if (x1bVar instanceof sk60) {
            sk60Var = (sk60) x1bVar;
            int i = sk60Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sk60Var.d = i - Integer.MIN_VALUE;
            } else {
                sk60Var = new sk60(this, x1bVar);
            }
        } else {
            sk60Var = new sk60(this, x1bVar);
        }
        Object obj = sk60Var.b;
        y5b y5bVar = y5b.a;
        int i2 = sk60Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a aVar2 = sk60Var.a;
            uj50.b(obj);
            return aVar2;
        }
        uj50.b(obj);
        pfd pfdVar = fse.a;
        odd oddVar = odd.b;
        tk60 tk60Var = new tk60(this, aVar, null);
        sk60Var.a = aVar;
        sk60Var.d = 1;
        return ej5.d(oddVar, tk60Var, sk60Var) == y5bVar ? y5bVar : aVar;
    }

    public final Object b(a aVar, String str, x1b x1bVar) {
        pfd pfdVar = fse.a;
        return ej5.d(odd.b, new vk60(aVar, str, this, null), x1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:20:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:25:0x0073
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(defpackage.x1b r12) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk60.c(x1b):java.lang.Object");
    }

    public final void d(String str) {
        if (new File(str).exists()) {
            MediaPlayer mediaPlayer = this.i;
            Context context = this.a;
            if ((mediaPlayer == null && str.length() > 0 && context != null) || !kotlin.text.c.l(this.g, str, false)) {
                try {
                    MediaPlayer mediaPlayerCreate = MediaPlayer.create(context, Uri.parse(str));
                    mediaPlayerCreate.getClass();
                    this.i = mediaPlayerCreate;
                    this.g = str;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                MediaPlayer mediaPlayer2 = this.i;
                if (mediaPlayer2 == null || mediaPlayer2.isPlaying()) {
                    return;
                }
                MediaPlayer mediaPlayer3 = this.i;
                if (mediaPlayer3 == null) {
                    Intrinsics.n("infiniteSoundMediaPlayer");
                    throw null;
                }
                mediaPlayer3.seekTo(0);
                MediaPlayer mediaPlayer4 = this.i;
                if (mediaPlayer4 == null) {
                    Intrinsics.n("infiniteSoundMediaPlayer");
                    throw null;
                }
                mediaPlayer4.start();
                MediaPlayer mediaPlayer5 = this.i;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.setLooping(true);
                } else {
                    Intrinsics.n("infiniteSoundMediaPlayer");
                    throw null;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
