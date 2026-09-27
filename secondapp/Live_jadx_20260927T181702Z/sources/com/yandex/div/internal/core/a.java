package com.yandex.div.internal.core;

import com.yandex.div.core.Disposable;
import java.util.Iterator;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a {
    public static void a(ExpressionSubscriber expressionSubscriber, @m Disposable disposable) {
        if (disposable == null || disposable == Disposable.NULL) {
            return;
        }
        expressionSubscriber.getSubscriptions().add(disposable);
    }

    public static void b(ExpressionSubscriber expressionSubscriber) {
        Iterator<T> it = expressionSubscriber.getSubscriptions().iterator();
        while (it.hasNext()) {
            ((Disposable) it.next()).close();
        }
        expressionSubscriber.getSubscriptions().clear();
    }

    public static void c(ExpressionSubscriber expressionSubscriber) {
        expressionSubscriber.closeAllSubscription();
    }
}
