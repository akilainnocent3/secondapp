package com.yandex.div.core.util;

import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.core.a;
import java.util.ArrayList;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class ExpressionSubscriberImpl implements ExpressionSubscriber {

    @l
    private final List<Disposable> subscriptions = new ArrayList();

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public /* synthetic */ void addSubscription(Disposable disposable) {
        a.a(this, disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public /* synthetic */ void closeAllSubscription() {
        a.b(this);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @l
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public /* synthetic */ void release() {
        a.c(this);
    }
}
