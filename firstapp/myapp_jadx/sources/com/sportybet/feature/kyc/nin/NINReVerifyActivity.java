package com.sportybet.feature.kyc.nin;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sporty.android.core.model.account.AccountInfo;
import com.sportybet.feature.kyc.nin.NINReVerifyActivity;
import com.sportybet.feature.profile.ProfileActivity;
import defpackage.c0d;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.ib5;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.lxl;
import defpackage.m850;
import defpackage.myh;
import defpackage.op8;
import defpackage.pwx;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s6x;
import defpackage.s9s;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.y5b;
import defpackage.zn8;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/feature/kyc/nin/NINReVerifyActivity;", "Lty1;", "Lzux;", "Lpwx;", "Lk9j;", "Lrlf;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NINReVerifyActivity extends lxl implements zux, pwx, k9j, rlf {
    public static final /* synthetic */ int d = 0;
    public final q8i0 b = new q8i0(jq40.a(s6x.class), new d(), new c(), new e());
    public Intent c;

    @c0d(c = "com.sportybet.feature.kyc.nin.NINReVerifyActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$1", f = "NINReVerifyActivity.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ NINReVerifyActivity b;
        public final /* synthetic */ NINReVerifyActivity c;

        /* JADX INFO: renamed from: com.sportybet.feature.kyc.nin.NINReVerifyActivity$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.kyc.nin.NINReVerifyActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$1$1", f = "NINReVerifyActivity.kt", l = {58}, m = "invokeSuspend", v = 2)
        public static final class C0381a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ NINReVerifyActivity c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0381a(v1b v1bVar, NINReVerifyActivity nINReVerifyActivity) {
                super(2, v1bVar);
                this.c = nINReVerifyActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0381a c0381a = new C0381a(v1bVar, this.c);
                c0381a.b = obj;
                return c0381a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                ((C0381a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                return y5b.a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to com.sportybet.feature.kyc.nin.NINReVerifyActivity$a$a for r5v2 'this'  v1b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = r5.b
                    v5b r0 = (defpackage.v5b) r0
                    y5b r0 = defpackage.y5b.a
                    int r1 = r5.a
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L18
                    if (r1 == r2) goto L14
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r5)
                    return r3
                L14:
                    defpackage.uj50.b(r6)
                    goto L39
                L18:
                    defpackage.uj50.b(r6)
                    com.sportybet.feature.kyc.nin.NINReVerifyActivity r6 = r5.c
                    q8i0 r1 = r6.b
                    java.lang.Object r1 = r1.getValue()
                    s6x r1 = (defpackage.s6x) r1
                    v340 r1 = r1.i
                    com.sportybet.feature.kyc.nin.NINReVerifyActivity$b r4 = new com.sportybet.feature.kyc.nin.NINReVerifyActivity$b
                    r4.<init>()
                    r5.b = r3
                    r5.a = r2
                    uwd0<T> r6 = r1.a
                    java.lang.Object r5 = r6.collect(r4, r5)
                    if (r5 != r0) goto L39
                    return r0
                L39:
                    defpackage.fkd.a()
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sportybet.feature.kyc.nin.NINReVerifyActivity.a.C0381a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NINReVerifyActivity nINReVerifyActivity, v1b v1bVar, NINReVerifyActivity nINReVerifyActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = nINReVerifyActivity;
            this.c = nINReVerifyActivity2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new a(this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                C0381a c0381a = new C0381a(null, this.c);
                this.a = 1;
                if (m850.a(lifecycle, bVar, c0381a, this) == y5bVar) {
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

    public static final class b<T> implements myh {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Pair pair = (Pair) obj;
            Account account = (Account) pair.a;
            AccountInfo accountInfo = (AccountInfo) pair.b;
            if (account == null || accountInfo == null) {
                return Unit.a;
            }
            NINReVerifyActivity nINReVerifyActivity = NINReVerifyActivity.this;
            Intent intent = new Intent(nINReVerifyActivity, (Class<?>) ProfileActivity.class);
            intent.putExtra("first_name", accountInfo.getFirstName());
            intent.putExtra("last_name", accountInfo.getLastName());
            intent.putExtra("account_number", account.name);
            intent.putExtra("email", accountInfo.getEmail());
            intent.putExtra("date_of_birth", accountInfo.getBirthday());
            intent.putExtra("user_name", accountInfo.getNickname());
            intent.putExtra("avatar", accountInfo.getAvatar());
            intent.putExtra("state", accountInfo.getState());
            intent.putExtra("area", accountInfo.getArea());
            intent.putExtra("editableLastName", accountInfo.getEditableBirthday());
            intent.putExtra("editableFirstName", accountInfo.getEditableFirstName());
            intent.putExtra("editableFirstName", accountInfo.getEditableLastName());
            intent.putExtra("phone", accountInfo.getPhone());
            nINReVerifyActivity.c = intent;
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return NINReVerifyActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return NINReVerifyActivity.this.getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return NINReVerifyActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new a(this, null, this), 3);
        zn8.a(this, new op8(-1182196545, new Function2() { // from class: q4x
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = NINReVerifyActivity.d;
                int i2 = 1;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(611957000, new qvd(this.a, i2), aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
