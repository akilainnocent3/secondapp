package defpackage;

import android.media.MediaPlayer;
import android.media.SoundPool;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lypa0;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ypa0 extends j8i0 {
    public rk60 a;
    public boolean b;
    public boolean d;
    public Function0<Unit> c = new pij(1);
    public String e = "";

    @c0d(c = "com.sportygames.commons.viewmodels.SoundViewModel$loadSounds$1", f = "SoundViewModel.kt", l = {143, 144}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ypa0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r7.c(r6) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.a
                r2 = 0
                r3 = 2
                ypa0 r4 = defpackage.ypa0.this
                r5 = 1
                if (r1 == 0) goto L1d
                if (r1 == r5) goto L19
                if (r1 != r3) goto L13
                defpackage.uj50.b(r7)
                goto L41
            L13:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r2
            L19:
                defpackage.uj50.b(r7)
                goto L34
            L1d:
                defpackage.uj50.b(r7)
                rk60 r7 = r4.y1()
                r6.a = r5
                java.util.HashMap<java.lang.String, rk60$b> r1 = defpackage.rk60.n
                uk60 r1 = new uk60
                r1.<init>(r7, r2)
                java.lang.Object r7 = defpackage.w5b.d(r1, r6)
                if (r7 != r0) goto L34
                goto L40
            L34:
                rk60 r7 = r4.y1()
                r6.a = r3
                java.lang.Object r6 = r7.c(r6)
                if (r6 != r0) goto L41
            L40:
                return r0
            L41:
                r4.b = r5
                r6 = 0
                r4.d = r6
                kotlin.jvm.functions.Function0<kotlin.Unit> r6 = r4.c
                r6.invoke()
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ypa0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.commons.viewmodels.SoundViewModel$play$1", f = "SoundViewModel.kt", l = {57}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long b;
        public final /* synthetic */ ypa0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, ypa0 ypa0Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = j;
            this.c = ypa0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            rk60 rk60VarY1;
            MediaPlayer mediaPlayer;
            y5b y5bVar = y5b.a;
            int i = this.a;
            ypa0 ypa0Var = this.c;
            if (i == 0) {
                uj50.b(obj);
                long j = this.b;
                if (j > 0 && ypa0Var.y1().d) {
                    rk60 rk60VarY2 = ypa0Var.y1();
                    MediaPlayer mediaPlayer2 = rk60VarY2.i;
                    if (mediaPlayer2 != null && mediaPlayer2.isPlaying()) {
                        MediaPlayer mediaPlayer3 = rk60VarY2.i;
                        if (mediaPlayer3 == null) {
                            Intrinsics.n("infiniteSoundMediaPlayer");
                            throw null;
                        }
                        mediaPlayer3.setVolume(0.25f, 0.25f);
                    }
                    this.a = 1;
                    if (hkd.b(j, this) == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            if (ypa0Var.a != null && (mediaPlayer = (rk60VarY1 = ypa0Var.y1()).i) != null && mediaPlayer.isPlaying()) {
                MediaPlayer mediaPlayer4 = rk60VarY1.i;
                if (mediaPlayer4 == null) {
                    Intrinsics.n("infiniteSoundMediaPlayer");
                    throw null;
                }
                mediaPlayer4.setVolume(0.99f, 0.99f);
            }
            return Unit.a;
        }
    }

    public static /* synthetic */ void B1(ypa0 ypa0Var, String str) {
        ypa0Var.A1(0L, str);
    }

    public static void E1(ypa0 ypa0Var, rk60 rk60Var) {
        ypa0Var.getClass();
        rk60Var.getClass();
        ypa0Var.a = rk60Var;
        ypa0Var.d = true;
        ypa0Var.z1();
    }

    public final void A1(long j, String str) {
        str.getClass();
        if (this.a != null) {
            rk60 rk60VarY1 = y1();
            rk60.a aVar = rk60VarY1.c.get(str);
            if (aVar != null) {
                if (aVar.d == rk60.b.a || (rk60VarY1.d && !StringsKt.M(str, "music", false))) {
                    Integer num = aVar.e;
                    if ((num != null ? num.intValue() : 0) > 0) {
                        SoundPool soundPool = rk60VarY1.f;
                        Integer num2 = aVar.e;
                        rk60VarY1.e.add(Integer.valueOf(soundPool.play(num2 != null ? num2.intValue() : 0, 0.99f, 0.99f, 1, 0, 1.0f)));
                    }
                }
                if (StringsKt.M(str, "music", false)) {
                    pfd pfdVar = fse.a;
                    ej5.c(w5b.a(odd.b), null, null, new al60(rk60VarY1, aVar, null), 3);
                }
            }
            if (this.e.length() == 0) {
                return;
            }
            String str2 = this.e;
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            if (lowerCase.equals("rush")) {
                return;
            }
            String lowerCase2 = this.e.toLowerCase(locale);
            lowerCase2.getClass();
            if (lowerCase2.equals("ping pong")) {
                return;
            }
            String lowerCase3 = this.e.toLowerCase(locale);
            lowerCase3.getClass();
            if (lowerCase3.equals("sporty-hero")) {
                return;
            }
            ej5.c(o8i0.d(this), null, null, new b(j, this, null), 3);
        }
    }

    public final int C1(String str) {
        str.getClass();
        if (this.a != null) {
            rk60 rk60VarY1 = y1();
            rk60.a aVar = rk60VarY1.c.get(str);
            if (aVar != null) {
                if (aVar.d == rk60.b.a || (rk60VarY1.d && !StringsKt.M(str, "music", false))) {
                    Integer num = aVar.e;
                    if ((num != null ? num.intValue() : 0) > 0) {
                        SoundPool soundPool = rk60VarY1.f;
                        Integer num2 = aVar.e;
                        int iPlay = soundPool.play(num2 != null ? num2.intValue() : 0, 0.99f, 0.99f, 1, -1, 1.0f);
                        rk60VarY1.e.add(Integer.valueOf(iPlay));
                        return iPlay;
                    }
                } else if (StringsKt.M(str, "music", false)) {
                    pfd pfdVar = fse.a;
                    ej5.c(w5b.a(odd.b), null, null, new xk60(rk60VarY1, aVar, null), 3);
                    return 0;
                }
            }
        }
        return 0;
    }

    public final void D1(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (this.a != null) {
            rk60 rk60VarY1 = y1();
            pfd pfdVar = fse.a;
            rk60VarY1.l = ej5.c(w5b.a(gku.a), null, null, new yk60(ej5.a(w5b.a(odd.b), null, new zk60(rk60VarY1, str, str2, null), 3), rk60VarY1, null), 3);
        }
    }

    public final void F1(rk60 rk60Var, Function0<Unit> function0) {
        rk60Var.getClass();
        if (this.b) {
            function0.invoke();
            return;
        }
        boolean z = this.d;
        if (!z) {
            E1(this, rk60Var);
            this.c = function0;
        } else if (z) {
            this.c = function0;
        }
    }

    public final void G1() {
        try {
            if (this.a != null) {
                rk60 rk60VarY1 = y1();
                try {
                    for (Map.Entry<String, rk60.a> entry : rk60VarY1.c.entrySet()) {
                        SoundPool soundPool = rk60VarY1.f;
                        Integer num = entry.getValue().e;
                        soundPool.stop(num != null ? num.intValue() : 0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void H1(int i) {
        if (this.a != null) {
            rk60 rk60VarY1 = y1();
            ArrayList arrayList = rk60VarY1.e;
            SoundPool soundPool = rk60VarY1.f;
            soundPool.stop(i);
            arrayList.remove(Integer.valueOf(i));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                soundPool.setVolume(((Number) obj).intValue(), 0.0f, 0.0f);
            }
        }
    }

    public final void I1() {
        if (this.a != null) {
            rk60 rk60VarY1 = y1();
            try {
                MediaPlayer mediaPlayer = rk60VarY1.i;
                if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                    return;
                }
                MediaPlayer mediaPlayer2 = rk60VarY1.i;
                if (mediaPlayer2 == null) {
                    Intrinsics.n("infiniteSoundMediaPlayer");
                    throw null;
                }
                mediaPlayer2.setLooping(false);
                MediaPlayer mediaPlayer3 = rk60VarY1.i;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.pause();
                } else {
                    Intrinsics.n("infiniteSoundMediaPlayer");
                    throw null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void J1(boolean z) {
        if (this.a != null) {
            y1().d = z;
            z1();
        }
    }

    public final void K1(boolean z) {
        if (this.a != null) {
            y1().d = z;
            z1();
        }
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        if (this.a != null) {
            rk60 rk60VarY1 = y1();
            rk60VarY1.f.release();
            rk60VarY1.h.clear();
        }
    }

    public final void x1() {
        ej5.c(o8i0.d(this), null, null, new wpa0(this, null), 3);
    }

    public final rk60 y1() {
        rk60 rk60Var = this.a;
        if (rk60Var != null) {
            return rk60Var;
        }
        Intrinsics.n("mSoundManager");
        throw null;
    }

    public final void z1() {
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }
}
