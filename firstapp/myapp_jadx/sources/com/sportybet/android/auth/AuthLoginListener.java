package com.sportybet.android.auth;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import defpackage.bqy;
import defpackage.c0d;
import defpackage.ej5;
import defpackage.f1i;
import defpackage.fdt;
import defpackage.ib5;
import defpackage.j1b;
import defpackage.jte;
import defpackage.k5b;
import defpackage.l5b;
import defpackage.lfe0;
import defpackage.mgb0;
import defpackage.myh;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.uzh;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w5b;
import defpackage.y5b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/auth/AuthLoginListener;", "", "Lmgb0;", "accountManager", "Lk5b;", "dispatcher", "Lfdt;", "localBroadcastManager", "Lbqy;", "oneCutConfigAgent", "<init>", "(Lmgb0;Lk5b;Lfdt;Lbqy;)V", "Landroid/content/Context;", "context", "(Lmgb0;Lk5b;Landroid/content/Context;)V", "Lmgb0;", "Lk5b;", "getDispatcher$annotations", "()V", "Lfdt;", "Lbqy;", "Lv5b;", "scope", "Lv5b;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AuthLoginListener {
    public static final int $stable = 8;
    private final mgb0 accountManager;
    private final k5b dispatcher;
    private final fdt localBroadcastManager;
    private final bqy oneCutConfigAgent;
    private final v5b scope;

    /* JADX INFO: renamed from: com.sportybet.android.auth.AuthLoginListener$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.android.auth.AuthLoginListener$1", f = "AuthLoginListener.kt", l = {50}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        int label;

        public AnonymousClass1(v1b<? super AnonymousClass1> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return AuthLoginListener.this.new AnonymousClass1(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((AnonymousClass1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.label;
            if (i == 0) {
                uj50.b(obj);
                jte jteVarC = uzh.c(new f1i(AuthLoginListener.this.accountManager.getAccountFlow()), new a(), uzh.b);
                final AuthLoginListener authLoginListener = AuthLoginListener.this;
                myh myhVar = new myh() { // from class: com.sportybet.android.auth.AuthLoginListener.1.2
                    public final Object emit(Account account, v1b<? super Unit> v1bVar) {
                        authLoginListener.localBroadcastManager.c(new Intent("JsPluginAccount"));
                        authLoginListener.oneCutConfigAgent.b(null);
                        return Unit.a;
                    }

                    @Override // defpackage.myh
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, v1b v1bVar) {
                        return emit((Account) obj2, (v1b<? super Unit>) v1bVar);
                    }
                };
                this.label = 1;
                if (jteVarC.collect(myhVar, this) == y5bVar) {
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

    public AuthLoginListener(mgb0 mgb0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, fdt fdtVar, bqy bqyVar) {
        mgb0Var.getClass();
        k5bVar.getClass();
        fdtVar.getClass();
        bqyVar.getClass();
        this.accountManager = mgb0Var;
        this.dispatcher = k5bVar;
        this.localBroadcastManager = fdtVar;
        this.oneCutConfigAgent = bqyVar;
        j1b j1bVarA = w5b.a(k5bVar.plus(lfe0.a()).plus(new AuthLoginListener$special$$inlined$CoroutineExceptionHandler$1(l5b.a.a)));
        this.scope = j1bVarA;
        ej5.c(j1bVarA, null, null, new AnonymousClass1(null), 3);
    }

    @Dispatcher(sportyDispatcher = SportyDispatchers.IO)
    private static /* synthetic */ void getDispatcher$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthLoginListener(mgb0 mgb0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, Context context) {
        mgb0Var.getClass();
        k5bVar.getClass();
        context.getClass();
        fdt fdtVarA = fdt.a(context);
        bqy bqyVarA = bqy.a();
        bqyVarA.getClass();
        this(mgb0Var, k5bVar, fdtVarA, bqyVarA);
    }
}
