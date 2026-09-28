package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$4", f = "LNStreamPlayerViewModel.kt", l = {403}, m = "invokeSuspend", v = 2)
public final class lfr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mfr b;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$4$1", f = "LNStreamPlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<ier, Boolean, v1b<? super Pair<? extends ExoPlayer, ? extends Boolean>>, Object> {
        public /* synthetic */ ier a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(ier ierVar, Boolean bool, v1b<? super Pair<? extends ExoPlayer, ? extends Boolean>> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(3, v1bVar);
            aVar.a = ierVar;
            aVar.b = zBooleanValue;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ier ierVar = this.a;
            boolean z = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(ierVar != null ? ierVar.a : null, Boolean.valueOf(z));
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$4$2", f = "LNStreamPlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<Pair<? extends ExoPlayer, ? extends Boolean>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ mfr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, mfr mfrVar) {
            super(2, v1bVar);
            this.b = mfrVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(v1bVar, this.b);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Pair<? extends ExoPlayer, ? extends Boolean> pair, v1b<? super Unit> v1bVar) {
            return ((b) create(pair, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ExoPlayer exoPlayer = (ExoPlayer) pair.a;
            boolean zBooleanValue = ((Boolean) pair.b).booleanValue();
            if (exoPlayer != null) {
                exoPlayer.L(zBooleanValue ? 0.0f : 1.0f);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfr(v1b v1bVar, mfr mfrVar) {
        super(2, v1bVar);
        this.b = mfrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lfr(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lfr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            mfr mfrVar = this.b;
            n1i n1iVar = new n1i(mfrVar.D, mfrVar.G, new a(3, null));
            b bVar = new b(null, mfrVar);
            this.a = 1;
            if (kzh.b(n1iVar, bVar, this) == y5bVar) {
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
