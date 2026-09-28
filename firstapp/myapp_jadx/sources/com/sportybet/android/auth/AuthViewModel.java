package com.sportybet.android.auth;

import defpackage.c0d;
import defpackage.ej5;
import defpackage.ib5;
import defpackage.j8i0;
import defpackage.o8i0;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.xck;
import defpackage.y5b;
import defpackage.yck;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lcom/sportybet/android/auth/AuthViewModel;", "Lj8i0;", "Lyck;", "getRegSuccessDescUseCase", "<init>", "(Lyck;)V", "", "getRegSuccessDesc", "()V", "Lyck;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AuthViewModel extends j8i0 {
    public static final int $stable = 8;
    private final yck getRegSuccessDescUseCase;

    /* JADX INFO: renamed from: com.sportybet.android.auth.AuthViewModel$getRegSuccessDesc$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.android.auth.AuthViewModel$getRegSuccessDesc$1", f = "AuthViewModel.kt", l = {17}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        int label;

        public AnonymousClass1(v1b<? super AnonymousClass1> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return AuthViewModel.this.new AnonymousClass1(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((AnonymousClass1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object obj2 = y5b.a;
            int i = this.label;
            if (i == 0) {
                uj50.b(obj);
                yck yckVar = AuthViewModel.this.getRegSuccessDescUseCase;
                this.label = 1;
                Object objD = ej5.d(yckVar.c, new xck(yckVar, null), this);
                if (objD != obj2) {
                    objD = Unit.a;
                }
                if (objD == obj2) {
                    return obj2;
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

    public AuthViewModel(yck yckVar) {
        yckVar.getClass();
        this.getRegSuccessDescUseCase = yckVar;
    }

    public final void getRegSuccessDesc() {
        ej5.c(o8i0.d(this), null, null, new AnonymousClass1(null), 3);
    }
}
