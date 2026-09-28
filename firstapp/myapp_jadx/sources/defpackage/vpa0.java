package defpackage;

import android.media.AudioAttributes;
import android.media.SoundPool;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class vpa0 implements do5 {
    public final k5b a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final SoundPool d;

    public vpa0(k5b k5bVar) {
        k5bVar.getClass();
        this.a = k5bVar;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(6).setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build()).build();
        soundPoolBuild.getClass();
        this.d = soundPoolBuild;
        soundPoolBuild.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: tpa0
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
                Object bVar;
                LinkedHashMap linkedHashMap = this.a.c;
                try {
                    zi50.a aVar = zi50.b;
                    zb6 zb6Var = (zb6) linkedHashMap.get(Integer.valueOf(i));
                    if (zb6Var != null) {
                        zb6Var.resumeWith(Boolean.valueOf(i2 == 0));
                        bVar = Unit.a;
                    } else {
                        bVar = null;
                    }
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                if (zi50.a(bVar) != null) {
                    linkedHashMap.remove(Integer.valueOf(i));
                }
            }
        });
    }

    @Override // defpackage.do5
    public final co5 build() {
        return new spa0(a4h.g(this.b), this.d);
    }

    @Override // defpackage.do5
    public final void release() {
        this.d.release();
    }
}
