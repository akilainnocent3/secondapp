package defpackage;

import android.media.MediaPlayer;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.luckywheel.components.LuckyWheelSoundManagerKt$rememberLuckyWheelSoundManager$2$1", f = "LuckyWheelSoundManager.kt", l = {138}, m = "invokeSuspend", v = 2)
public final class dbu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lyh<String> b;
    public final /* synthetic */ abu c;

    public static final class a<T> implements myh {
        public final /* synthetic */ abu a;

        public a(abu abuVar) {
            this.a = abuVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            String str = (String) obj;
            abu abuVar = this.a;
            MediaPlayer mediaPlayer = abuVar.d;
            str.getClass();
            File fileInvoke = abuVar.b.invoke(abuVar.a, str);
            if (fileInvoke != null) {
                try {
                    mediaPlayer.reset();
                    mediaPlayer.setDataSource(new FileInputStream(fileInvoke).getFD());
                    mediaPlayer.prepareAsync();
                } catch (Exception e) {
                    itf0.a.d(inm.a("Error playing sound effect: ", e.getMessage()), new Object[0]);
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbu(lyh<String> lyhVar, abu abuVar, v1b<? super dbu> v1bVar) {
        super(2, v1bVar);
        this.b = lyhVar;
        this.c = abuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dbu(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dbu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a(this.c);
            this.a = 1;
            if (this.b.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
