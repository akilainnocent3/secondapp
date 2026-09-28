package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.luckywheel.components.LuckyWheelSoundManagerKt$rememberLuckyWheelSoundManager$1$1", f = "LuckyWheelSoundManager.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cbu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ abu a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbu(abu abuVar, boolean z, v1b<? super cbu> v1bVar) {
        super(2, v1bVar);
        this.a = abuVar;
        this.b = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cbu(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cbu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        abu abuVar = this.a;
        abuVar.getClass();
        float f = this.b ? 1.0f : 0.0f;
        abuVar.c.setVolume(f, f);
        abuVar.d.setVolume(f, f);
        return Unit.a;
    }
}
