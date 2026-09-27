package com.yandex.div.core.util;

import android.view.View;
import com.yandex.div.R;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import f0.m3;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ReleasablesKt {
    private static final int INDEX_EXPRESSION_SUBSCRIBER = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final ExpressionSubscriber getExpressionSubscriber(@l View view) {
        if (view instanceof ExpressionSubscriber) {
            return (ExpressionSubscriber) view;
        }
        Object tag = view.getTag(R.id.div_releasable_list);
        m3 m3Var = tag instanceof m3 ? (m3) tag : null;
        if (m3Var == null) {
            m3Var = new m3();
            view.setTag(R.id.div_releasable_list, m3Var);
        }
        Object objG = m3Var.g(0);
        ExpressionSubscriber expressionSubscriber = objG instanceof ExpressionSubscriber ? (ExpressionSubscriber) objG : null;
        if (expressionSubscriber != null) {
            return expressionSubscriber;
        }
        ExpressionSubscriberImpl expressionSubscriberImpl = new ExpressionSubscriberImpl();
        m3Var.o(0, expressionSubscriberImpl);
        return expressionSubscriberImpl;
    }

    @m
    public static final Iterable<Releasable> getReleasableList(@l View view) {
        Object tag = view.getTag(R.id.div_releasable_list);
        m3 m3Var = tag instanceof m3 ? (m3) tag : null;
        if (m3Var != null) {
            return SparseArraysKt.toIterable(m3Var);
        }
        return null;
    }
}
