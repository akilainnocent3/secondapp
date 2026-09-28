package com.google.android.recaptcha.internal;

import defpackage.c9p;
import defpackage.ck7;
import defpackage.cm8;
import defpackage.fae;
import defpackage.ojd;
import defpackage.s680;
import defpackage.u680;
import defpackage.v1b;
import defpackage.wse;
import defpackage.zj7;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
public final class zzde implements ojd {
    private final /* synthetic */ cm8 zza;

    public zzde(cm8 cm8Var) {
        this.zza = cm8Var;
    }

    @Override // defpackage.c9p
    public final zj7 attachChild(ck7 ck7Var) {
        return this.zza.attachChild(ck7Var);
    }

    @Override // defpackage.ojd
    public final Object await(v1b v1bVar) {
        return this.zza.await(v1bVar);
    }

    @Override // defpackage.c9p
    @fae
    public final /* synthetic */ boolean cancel(Throwable th) {
        return this.zza.cancel(th);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.zza.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.a aVar) {
        return this.zza.get(aVar);
    }

    @Override // defpackage.c9p
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // defpackage.c9p
    public final Sequence getChildren() {
        return this.zza.getChildren();
    }

    @Override // defpackage.ojd
    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    @Override // defpackage.ojd
    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.a getKey() {
        return this.zza.getKey();
    }

    @Override // defpackage.ojd
    public final u680 getOnAwait() {
        return this.zza.getOnAwait();
    }

    @Override // defpackage.c9p
    public final s680 getOnJoin() {
        return this.zza.getOnJoin();
    }

    @Override // defpackage.c9p
    public final c9p getParent() {
        return this.zza.getParent();
    }

    @Override // defpackage.c9p
    public final wse invokeOnCompletion(Function1 function1) {
        return this.zza.invokeOnCompletion(function1);
    }

    @Override // defpackage.c9p
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // defpackage.c9p
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // defpackage.c9p
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // defpackage.c9p
    public final Object join(v1b v1bVar) {
        return this.zza.join(v1bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.a aVar) {
        return this.zza.minusKey(aVar);
    }

    @Override // defpackage.c9p
    @fae
    public final c9p plus(c9p c9pVar) {
        return this.zza.plus(c9pVar);
    }

    @Override // defpackage.c9p
    public final boolean start() {
        return this.zza.start();
    }

    @Override // defpackage.c9p
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // defpackage.c9p
    @fae
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // defpackage.c9p
    public final wse invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
        return this.zza.invokeOnCompletion(z, z2, function1);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.zza.plus(coroutineContext);
    }
}
