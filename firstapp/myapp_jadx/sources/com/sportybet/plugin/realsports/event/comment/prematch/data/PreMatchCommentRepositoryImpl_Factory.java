package com.sportybet.plugin.realsports.event.comment.prematch.data;

import defpackage.k5b;
import defpackage.l730;
import defpackage.t88;

/* JADX INFO: loaded from: classes5.dex */
public final class PreMatchCommentRepositoryImpl_Factory implements l730 {
    private final l730<t88> apiServiceProvider;
    private final l730<k5b> ioDispatcherProvider;

    private PreMatchCommentRepositoryImpl_Factory(l730<t88> l730Var, l730<k5b> l730Var2) {
        this.apiServiceProvider = l730Var;
        this.ioDispatcherProvider = l730Var2;
    }

    public static PreMatchCommentRepositoryImpl_Factory create(l730<t88> l730Var, l730<k5b> l730Var2) {
        return new PreMatchCommentRepositoryImpl_Factory(l730Var, l730Var2);
    }

    public static PreMatchCommentRepositoryImpl newInstance(t88 t88Var, k5b k5bVar) {
        return new PreMatchCommentRepositoryImpl(t88Var, k5bVar);
    }

    @Override // defpackage.m730
    public PreMatchCommentRepositoryImpl get() {
        return newInstance(this.apiServiceProvider.get(), this.ioDispatcherProvider.get());
    }
}
