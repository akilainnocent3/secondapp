package com.sportybet.android.auth;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import defpackage.c0d;
import defpackage.ej5;
import defpackage.ib5;
import defpackage.k5b;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.uqm;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.x1b;
import defpackage.y5b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sportybet/android/auth/GetUserAccessTokenUseCase;", "", "Luqm;", "accountHelper", "Lk5b;", "dispatcher", "<init>", "(Luqm;Lk5b;)V", "", "invoke", "(Lv1b;)Ljava/lang/Object;", "Luqm;", "Lk5b;", "getDispatcher$annotations", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GetUserAccessTokenUseCase {
    public static final int $stable = 8;
    private final uqm accountHelper;
    private final k5b dispatcher;

    /* JADX INFO: renamed from: com.sportybet.android.auth.GetUserAccessTokenUseCase$invoke$1, reason: invalid class name */
    @c0d(c = "com.sportybet.android.auth.GetUserAccessTokenUseCase", f = "GetUserAccessTokenUseCase.kt", l = {14}, m = "invoke", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class AnonymousClass1 extends x1b {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(v1b<? super AnonymousClass1> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetUserAccessTokenUseCase.this.invoke(this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.GetUserAccessTokenUseCase$invoke$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv5b;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lv5b;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.android.auth.GetUserAccessTokenUseCase$invoke$2", f = "GetUserAccessTokenUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
        int label;

        public AnonymousClass2(v1b<? super AnonymousClass2> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return GetUserAccessTokenUseCase.this.new AnonymousClass2(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
            return ((AnonymousClass2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            if (this.label == 0) {
                uj50.b(obj);
                return GetUserAccessTokenUseCase.this.accountHelper.getAccessToken();
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public GetUserAccessTokenUseCase(uqm uqmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        uqmVar.getClass();
        k5bVar.getClass();
        this.accountHelper = uqmVar;
        this.dispatcher = k5bVar;
    }

    @Dispatcher(sportyDispatcher = SportyDispatchers.IO)
    private static /* synthetic */ void getDispatcher$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object invoke(v1b<? super String> v1bVar) {
        AnonymousClass1 anonymousClass1;
        if (v1bVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) v1bVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(v1bVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(v1bVar);
        }
        Object objD = anonymousClass1.result;
        y5b y5bVar = y5b.a;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            uj50.b(objD);
            k5b k5bVar = this.dispatcher;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            anonymousClass1.label = 1;
            objD = ej5.d(k5bVar, anonymousClass2, anonymousClass1);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        objD.getClass();
        return objD;
    }
}
