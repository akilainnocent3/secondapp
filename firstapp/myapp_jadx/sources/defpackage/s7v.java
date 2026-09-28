package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legendsrace.component.runningpage.MatchTrackerPlayerKt$createExoPlayer$1$1", f = "MatchTrackerPlayer.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s7v extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ExoPlayer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7v(ArrayList arrayList, ExoPlayer exoPlayer, v1b v1bVar) {
        super(2, v1bVar);
        this.a = arrayList;
        this.b = exoPlayer;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s7v(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s7v) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Unit.a;
        }
        ExoPlayer exoPlayer = this.b;
        exoPlayer.i();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            exoPlayer.S(njv.a(Uri.parse(((ulc0) obj2).d())));
        }
        exoPlayer.d();
        exoPlayer.n(true);
        return Unit.a;
    }
}
