package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.utils.SGSoundPool$playRushBgSound$1", f = "SGSoundPool.kt", l = {255, 268}, m = "invokeSuspend", v = 1)
public final class yk60 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Boolean a;
    public int b;
    public final /* synthetic */ pjd c;
    public final /* synthetic */ rk60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk60(pjd pjdVar, rk60 rk60Var, v1b v1bVar) {
        super(2, v1bVar);
        this.c = pjdVar;
        this.d = rk60Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yk60(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yk60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009b A[Catch: Exception -> 0x00c4, TryCatch #0 {Exception -> 0x00c4, blocks: (B:7:0x0015, B:40:0x0084, B:42:0x0088, B:45:0x008f, B:47:0x0097, B:49:0x009b, B:51:0x00b4, B:52:0x00b8, B:53:0x00bb, B:54:0x00bc, B:55:0x00bf, B:15:0x0032, B:17:0x0036, B:19:0x003a, B:22:0x0041, B:23:0x0050, B:25:0x0054, B:27:0x005a, B:29:0x005e, B:30:0x0062, B:31:0x0065, B:32:0x0066, B:34:0x006a, B:36:0x0076, B:56:0x00c0, B:57:0x00c3), top: B:62:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4 A[Catch: Exception -> 0x00c4, TryCatch #0 {Exception -> 0x00c4, blocks: (B:7:0x0015, B:40:0x0084, B:42:0x0088, B:45:0x008f, B:47:0x0097, B:49:0x009b, B:51:0x00b4, B:52:0x00b8, B:53:0x00bb, B:54:0x00bc, B:55:0x00bf, B:15:0x0032, B:17:0x0036, B:19:0x003a, B:22:0x0041, B:23:0x0050, B:25:0x0054, B:27:0x005a, B:29:0x005e, B:30:0x0062, B:31:0x0065, B:32:0x0066, B:34:0x006a, B:36:0x0076, B:56:0x00c0, B:57:0x00c3), top: B:62:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8 A[Catch: Exception -> 0x00c4, TryCatch #0 {Exception -> 0x00c4, blocks: (B:7:0x0015, B:40:0x0084, B:42:0x0088, B:45:0x008f, B:47:0x0097, B:49:0x009b, B:51:0x00b4, B:52:0x00b8, B:53:0x00bb, B:54:0x00bc, B:55:0x00bf, B:15:0x0032, B:17:0x0036, B:19:0x003a, B:22:0x0041, B:23:0x0050, B:25:0x0054, B:27:0x005a, B:29:0x005e, B:30:0x0062, B:31:0x0065, B:32:0x0066, B:34:0x006a, B:36:0x0076, B:56:0x00c0, B:57:0x00c3), top: B:62:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00bc A[Catch: Exception -> 0x00c4, TryCatch #0 {Exception -> 0x00c4, blocks: (B:7:0x0015, B:40:0x0084, B:42:0x0088, B:45:0x008f, B:47:0x0097, B:49:0x009b, B:51:0x00b4, B:52:0x00b8, B:53:0x00bb, B:54:0x00bc, B:55:0x00bf, B:15:0x0032, B:17:0x0036, B:19:0x003a, B:22:0x0041, B:23:0x0050, B:25:0x0054, B:27:0x005a, B:29:0x005e, B:30:0x0062, B:31:0x0065, B:32:0x0066, B:34:0x006a, B:36:0x0076, B:56:0x00c0, B:57:0x00c3), top: B:62:0x000d }] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        String str;
        String str2;
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        rk60 rk60Var = this.d;
        Context context = rk60Var.a;
        y5b y5bVar = y5b.a;
        int i = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                this.b = 1;
                if (this.c.q(this) != y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bool = this.a;
                uj50.b(obj);
            }
            str2 = rk60Var.k;
            if (str2 != null && str2.length() != 0 && Intrinsics.g(bool, Boolean.TRUE)) {
                mediaPlayer = rk60Var.i;
                if (mediaPlayer != null) {
                    Intrinsics.n("infiniteSoundMediaPlayer");
                    throw null;
                }
                mediaPlayer.reset();
                MediaPlayer mediaPlayerCreate = MediaPlayer.create(context, Uri.parse(rk60Var.k));
                mediaPlayerCreate.getClass();
                rk60Var.i = mediaPlayerCreate;
                mediaPlayerCreate.start();
                mediaPlayer2 = rk60Var.i;
                if (mediaPlayer2 != null) {
                    Intrinsics.n("infiniteSoundMediaPlayer");
                    throw null;
                }
                mediaPlayer2.setLooping(true);
            }
            return Unit.a;
            if (rk60Var.i == null && (str = rk60Var.j) != null && str.length() != 0) {
                MediaPlayer mediaPlayerCreate2 = MediaPlayer.create(context, Uri.parse(rk60Var.j));
                mediaPlayerCreate2.getClass();
                rk60Var.i = mediaPlayerCreate2;
            }
            MediaPlayer mediaPlayer3 = rk60Var.i;
            if (mediaPlayer3 == null) {
                Intrinsics.n("infiniteSoundMediaPlayer");
                throw null;
            }
            if (!mediaPlayer3.isPlaying()) {
                MediaPlayer mediaPlayer4 = rk60Var.i;
                if (mediaPlayer4 == null) {
                    Intrinsics.n("infiniteSoundMediaPlayer");
                    throw null;
                }
                mediaPlayer4.start();
            }
            SharedPreferences sharedPreferences = rk60Var.m;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("rush_music", true)) : null;
            this.a = boolValueOf;
            this.b = 2;
            if (hkd.b(1100L, this) != y5bVar) {
                bool = boolValueOf;
                str2 = rk60Var.k;
                if (str2 != null) {
                    mediaPlayer = rk60Var.i;
                    if (mediaPlayer != null) {
                        Intrinsics.n("infiniteSoundMediaPlayer");
                        throw null;
                    }
                    mediaPlayer.reset();
                    MediaPlayer mediaPlayerCreate3 = MediaPlayer.create(context, Uri.parse(rk60Var.k));
                    mediaPlayerCreate3.getClass();
                    rk60Var.i = mediaPlayerCreate3;
                    mediaPlayerCreate3.start();
                    mediaPlayer2 = rk60Var.i;
                    if (mediaPlayer2 != null) {
                        Intrinsics.n("infiniteSoundMediaPlayer");
                        throw null;
                    }
                    mediaPlayer2.setLooping(true);
                }
                return Unit.a;
            }
            return y5bVar;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
