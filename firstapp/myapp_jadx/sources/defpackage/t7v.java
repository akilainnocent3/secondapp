package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class t7v implements so10.c {
    public final /* synthetic */ dq40<c9p> a;
    public final /* synthetic */ ExoPlayer b;
    public final /* synthetic */ Function1<Integer, Unit> c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ Function1<com.sportybet.android.instantwin.presentation.legendsrace.a, Unit> e;
    public final /* synthetic */ v5b f;

    @c0d(c = "com.sportybet.android.instantwin.presentation.legendsrace.component.runningpage.MatchTrackerPlayerKt$createExoPlayer$2$1$listener$1$onPlaybackStateChanged$1", f = "MatchTrackerPlayer.kt", l = {106}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ExoPlayer b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Function1<com.sportybet.android.instantwin.presentation.legendsrace.a, Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ExoPlayer exoPlayer, int i, Function1<? super com.sportybet.android.instantwin.presentation.legendsrace.a, Unit> function1, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = exoPlayer;
            this.c = i;
            this.d = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(1000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ExoPlayer exoPlayer = this.b;
            int iU = exoPlayer.U();
            int i2 = this.c;
            if (iU == i2 && exoPlayer.P() == 2) {
                itf0.a aVar = itf0.a;
                aVar.q("createExoPlayer");
                aVar.n("Buffering timeout for index " + i2 + ". Skipping to next.", new Object[0]);
                if (exoPlayer.q()) {
                    exoPlayer.o();
                } else {
                    this.d.invoke(com.sportybet.android.instantwin.presentation.legendsrace.a.b.a);
                }
            }
            return Unit.a;
        }
    }

    public t7v(dq40 dq40Var, ExoPlayer exoPlayer, Function1 function1, ArrayList arrayList, Function1 function2, v5b v5bVar) {
        this.a = dq40Var;
        this.b = exoPlayer;
        this.c = function1;
        this.d = arrayList;
        this.e = function2;
        this.f = v5bVar;
    }

    @Override // so10.c
    public final void J(njv njvVar, int i) {
        int iMax;
        c9p c9pVar = this.a.a;
        if (c9pVar != null) {
            c9pVar.cancel((CancellationException) null);
        }
        int iU = this.b.U();
        itf0.a aVar = itf0.a;
        aVar.q("createExoPlayer");
        aVar.a("Transition to video index: " + iU, new Object[0]);
        this.c.invoke(Integer.valueOf(iU));
        if ((i == 1 || i == 2) && iU > 0 && (iMax = Math.max(iU - 1, 0)) >= 0) {
            ArrayList arrayList = this.d;
            if (iMax < arrayList.size()) {
                aVar.q("createExoPlayer");
                aVar.a("Video finished or skipped(" + iMax + ")", new Object[0]);
                this.e.invoke(new com.sportybet.android.instantwin.presentation.legendsrace.a.c((ulc0) arrayList.get(iMax)));
            }
        }
    }

    @Override // so10.c
    public final void i(bo10 bo10Var) {
        bo10Var.getClass();
        c9p c9pVar = this.a.a;
        if (c9pVar != null) {
            c9pVar.cancel((CancellationException) null);
        }
        ExoPlayer exoPlayer = this.b;
        int iU = exoPlayer.U();
        itf0.a aVar = itf0.a;
        aVar.q("createExoPlayer");
        aVar.f(bo10Var, "Player error at index " + iU, new Object[0]);
        if (iU >= this.d.size() - 1) {
            this.e.invoke(new com.sportybet.android.instantwin.presentation.legendsrace.a.e(bo10Var));
            return;
        }
        aVar.q("createExoPlayer");
        aVar.n("Skipping to next video due to error.", new Object[0]);
        exoPlayer.o();
        exoPlayer.d();
        exoPlayer.n(true);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [T, jvd0] */
    @Override // so10.c
    public final void q(int i) {
        ExoPlayer exoPlayer = this.b;
        int iU = exoPlayer.U();
        Function1<com.sportybet.android.instantwin.presentation.legendsrace.a, Unit> function1 = this.e;
        dq40<c9p> dq40Var = this.a;
        if (i == 2) {
            c9p c9pVar = dq40Var.a;
            if (c9pVar != null) {
                c9pVar.cancel((CancellationException) null);
            }
            dq40Var.a = ej5.c(this.f, null, null, new a(exoPlayer, iU, function1, null), 3);
            return;
        }
        if (i == 3) {
            c9p c9pVar2 = dq40Var.a;
            if (c9pVar2 != null) {
                c9pVar2.cancel((CancellationException) null);
                return;
            }
            return;
        }
        c9p c9pVar3 = dq40Var.a;
        if (i != 4) {
            c9p c9pVar4 = c9pVar3;
            if (c9pVar4 != null) {
                c9pVar4.cancel((CancellationException) null);
                return;
            }
            return;
        }
        c9p c9pVar5 = c9pVar3;
        if (c9pVar5 != null) {
            c9pVar5.cancel((CancellationException) null);
        }
        function1.invoke(com.sportybet.android.instantwin.presentation.legendsrace.a.b.a);
    }
}
