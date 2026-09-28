package com.sportybet.android.auth;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import defpackage.c0d;
import defpackage.dj5;
import defpackage.ib5;
import defpackage.mgb0;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/sportybet/android/auth/SportyAccountManagerLegacyHelper;", "", "<init>", "()V", "Lmgb0;", "accountManager", "", "getDocumentAuditStatus", "(Lmgb0;)I", "userCertStatus", "", "updateUserCertStatus", "(Lmgb0;I)V", "documentAuditStatus", "updateKycStatuses", "(Lmgb0;II)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyAccountManagerLegacyHelper {
    public static final int $stable = 0;
    public static final SportyAccountManagerLegacyHelper INSTANCE = new SportyAccountManagerLegacyHelper();

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerLegacyHelper$updateKycStatuses$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerLegacyHelper$updateKycStatuses$1", f = "SportyAccountManagerLegacyHelper.kt", l = {RuntimeVersion.MINOR, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        final /* synthetic */ mgb0 $accountManager;
        final /* synthetic */ int $documentAuditStatus;
        final /* synthetic */ int $userCertStatus;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(mgb0 mgb0Var, int i, int i2, v1b<? super AnonymousClass1> v1bVar) {
            super(2, v1bVar);
            this.$accountManager = mgb0Var;
            this.$userCertStatus = i;
            this.$documentAuditStatus = i2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new AnonymousClass1(this.$accountManager, this.$userCertStatus, this.$documentAuditStatus, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((AnonymousClass1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        
            if (r5.setDocumentAuditStatus(r1, r4) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                defpackage.uj50.b(r5)
                goto L38
            L10:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r4)
                r4 = 0
                return r4
            L17:
                defpackage.uj50.b(r5)
                goto L2b
            L1b:
                defpackage.uj50.b(r5)
                mgb0 r5 = r4.$accountManager
                int r1 = r4.$userCertStatus
                r4.label = r3
                java.lang.Object r5 = r5.setUserCertStatus(r1, r4)
                if (r5 != r0) goto L2b
                goto L37
            L2b:
                mgb0 r5 = r4.$accountManager
                int r1 = r4.$documentAuditStatus
                r4.label = r2
                java.lang.Object r4 = r5.setDocumentAuditStatus(r1, r4)
                if (r4 != r0) goto L38
            L37:
                return r0
            L38:
                kotlin.Unit r4 = kotlin.Unit.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.android.auth.SportyAccountManagerLegacyHelper.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerLegacyHelper$updateUserCertStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerLegacyHelper$updateUserCertStatus$1", f = "SportyAccountManagerLegacyHelper.kt", l = {17}, m = "invokeSuspend", v = 2)
    public static final class C14541 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        final /* synthetic */ mgb0 $accountManager;
        final /* synthetic */ int $userCertStatus;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14541(mgb0 mgb0Var, int i, v1b<? super C14541> v1bVar) {
            super(2, v1bVar);
            this.$accountManager = mgb0Var;
            this.$userCertStatus = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new C14541(this.$accountManager, this.$userCertStatus, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((C14541) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.label;
            if (i == 0) {
                uj50.b(obj);
                mgb0 mgb0Var = this.$accountManager;
                int i2 = this.$userCertStatus;
                this.label = 1;
                if (mgb0Var.setUserCertStatus(i2, this) == y5bVar) {
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

    private SportyAccountManagerLegacyHelper() {
    }

    public static final int getDocumentAuditStatus(mgb0 accountManager) {
        accountManager.getClass();
        return accountManager.getCachedDocumentAuditStatus();
    }

    public static final void updateKycStatuses(mgb0 accountManager, int userCertStatus, int documentAuditStatus) {
        accountManager.getClass();
        dj5.b(new AnonymousClass1(accountManager, userCertStatus, documentAuditStatus, null));
    }

    public static final void updateUserCertStatus(mgb0 accountManager, int userCertStatus) {
        accountManager.getClass();
        dj5.b(new C14541(accountManager, userCertStatus, null));
    }
}
