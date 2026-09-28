package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.api.mission.components.MultiTaskMissionCardKt$MissionCancelInfo$2$1", f = "MultiTaskMissionCard.kt", l = {328}, m = "invokeSuspend", v = 2)
public final class olw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qrv b;
    public final /* synthetic */ Function0<Unit> c;
    public final /* synthetic */ ytw<UiText> d;

    @c0d(c = "com.sportybet.feature.loyalty.api.mission.components.MultiTaskMissionCardKt$MissionCancelInfo$2$1$1", f = "MultiTaskMissionCard.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<myh<? super UiText>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;
        public final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0, v1b<? super a> v1bVar) {
            super(3, v1bVar);
            this.b = function0;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super UiText> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = th;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (th == null) {
                this.b.invoke();
            }
            return Unit.a;
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ ytw<UiText> a;

        public b(ytw<UiText> ytwVar) {
            this.a = ytwVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            this.a.setValue((UiText) obj);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olw(qrv qrvVar, Function0<Unit> function0, ytw<UiText> ytwVar, v1b<? super olw> v1bVar) {
        super(2, v1bVar);
        this.b = qrvVar;
        this.c = function0;
        this.d = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new olw(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((olw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            long j = ((qrv.b) this.b).a;
            orv orvVar = orv.a;
            orvVar.getClass();
            wzh wzhVar = new wzh(new or60(new prv(j, orvVar, null)), new a(this.c, null));
            b bVar = new b(this.d);
            this.a = 1;
            if (wzhVar.collect(bVar, this) == y5bVar) {
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
