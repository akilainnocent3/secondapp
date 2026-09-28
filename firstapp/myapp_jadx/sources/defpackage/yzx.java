package defpackage;

import com.sporty.android.book.domain.entity.UIState;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yzx extends pf implements gaj<UIState<? extends String>, Boolean, v1b<? super UIState<? extends uzx.a>>, Object> {
    @Override // defpackage.gaj
    public final Object invoke(UIState<? extends String> uIState, Boolean bool, v1b<? super UIState<? extends uzx.a>> v1bVar) {
        UIState<? extends String> uIState2 = uIState;
        boolean zBooleanValue = bool.booleanValue();
        ((uzx) this.a).getClass();
        uzx.a aVar = new uzx.a(uIState2.getData(), zBooleanValue);
        if (uIState2 instanceof UIState.Idle) {
            return UIState.Idle.INSTANCE;
        }
        if (uIState2 instanceof UIState.Loading) {
            return new UIState.Loading(aVar);
        }
        if (uIState2 instanceof UIState.Success) {
            return new UIState.Success(aVar);
        }
        if (uIState2 instanceof UIState.Error) {
            return new UIState.Error(((UIState.Error) uIState2).getError(), aVar);
        }
        uhc.a();
        return null;
    }
}
