package com.sporty.android.core.model.patron;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000Ê\u0001\u000e\b\u0004\u0012\n\b\u0005\u0012\u0006\b\n0\u00068\u0007¨\u0006\u0003"}, d2 = {"Lcom/sporty/android/core/model/patron/UserCertDataSource;", "", "Companion", "model", "Lkotlin/annotation/Retention;", "value", "Lkotlin/annotation/AnnotationRetention;", "SOURCE"}, k = 1, mv = {2, 4, 0}, xi = 48)
public @interface UserCertDataSource {
    public static final int BVN = 510;
    public static final int CUSTOMER_SERVICE = 540;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DEPOSIT = 520;
    public static final int NONE = 0;
    public static final int PROFILE = 530;
    public static final int SIMPLE_KYC = 570;
    public static final int SKIP_SIMPLE_KYC = 580;
    public static final int WITHDRAW = 560;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/sporty/android/core/model/patron/UserCertDataSource$Companion;", "", "<init>", "()V", "BVN", "", "DEPOSIT", "PROFILE", "CUSTOMER_SERVICE", "WITHDRAW", "SIMPLE_KYC", "SKIP_SIMPLE_KYC", "NONE", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int BVN = 510;
        public static final int CUSTOMER_SERVICE = 540;
        public static final int DEPOSIT = 520;
        public static final int NONE = 0;
        public static final int PROFILE = 530;
        public static final int SIMPLE_KYC = 570;
        public static final int SKIP_SIMPLE_KYC = 580;
        public static final int WITHDRAW = 560;

        private Companion() {
        }
    }
}
