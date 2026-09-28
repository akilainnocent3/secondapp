package com.sporty.android.book.domain.entity;

import defpackage.ztw;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aY\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"T", "Lztw;", "Lcom/sporty/android/book/domain/entity/UIState;", "Lkotlin/Function1;", "transform", "Lkotlin/Function0;", "ifDataAbsent", "", "updateWithLatestData", "(Lztw;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "sportybook"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class UIStateKt {
    public static final <T> void updateWithLatestData(ztw<UIState<T>> ztwVar, Function1<? super T, ? extends UIState<? extends T>> function1, Function0<? extends UIState<? extends T>> function0) {
        ztwVar.getClass();
        function1.getClass();
        function0.getClass();
        Object data = ztwVar.getValue().getData();
        ztwVar.setValue(data != null ? function1.invoke(data) : function0.invoke());
    }

    public static /* synthetic */ void updateWithLatestData$default(ztw ztwVar, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.sporty.android.book.domain.entity.UIStateKt.updateWithLatestData.1
                @Override // kotlin.jvm.functions.Function0
                public final UIState invoke() {
                    return UIState.Idle.INSTANCE;
                }
            };
        }
        ztwVar.getClass();
        function1.getClass();
        function0.getClass();
        Object data = ((UIState) ztwVar.getValue()).getData();
        ztwVar.setValue(data != null ? (UIState) function1.invoke(data) : (UIState) function0.invoke());
    }
}
