package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.luckywheel.error.LuckyWheelInfoFailed;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.luckywheel.LuckyWheelUseCase$getSpinResult$2", f = "LuckyWheelUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tbu extends tje0 implements gaj<myh<? super Integer>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Integer> myhVar, Throwable th, v1b<? super Unit> v1bVar) throws LuckyWheelInfoFailed {
        tbu tbuVar = new tbu(3, v1bVar);
        tbuVar.a = th;
        tbuVar.invokeSuspend(Unit.a);
        throw null;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws LuckyWheelInfoFailed {
        UiText text;
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        LuckyWheelInfoFailed luckyWheelInfoFailed = null;
        LuckyWheelInfoFailed luckyWheelInfoFailed2 = (LuckyWheelInfoFailed) (!(th instanceof LuckyWheelInfoFailed) ? null : th);
        if (luckyWheelInfoFailed2 != null) {
            throw luckyWheelInfoFailed2;
        }
        if (!(th instanceof SprThrowable)) {
            th = null;
        }
        SprThrowable sprThrowable = (SprThrowable) th;
        if (sprThrowable != null && (text = sprThrowable.getText()) != null) {
            luckyWheelInfoFailed = new LuckyWheelInfoFailed(text);
        }
        if (luckyWheelInfoFailed != null) {
            throw luckyWheelInfoFailed;
        }
        ResourceUiText resourceUiText = vch0.b;
        resourceUiText.getClass();
        throw new LuckyWheelInfoFailed(resourceUiText);
    }
}
